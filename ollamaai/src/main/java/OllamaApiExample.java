import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class OllamaApiExample {

    private static final String BASE_URL = "http://localhost:11434/api";

    // 生成文本响应
    public static String generateCompletion(String model, String prompt) throws IOException {
        return makePostRequest("/generate", new JSONObject()
                .put("model", model)
                .put("prompt", prompt));
    }

    // 生成聊天对话中的下一条消息
    public static String generateChatCompletion(String model, JSONArray messages) throws IOException {
        return makePostRequest("/chat", new JSONObject()
                .put("model", model)
                .put("messages", messages));
    }

    // 创建模型
    public static String createModel(String newModel, String fromModel, String system) throws IOException {
        return makePostRequest("/create", new JSONObject()
                .put("model", newModel)
                .put("from", fromModel)
                .put("system", system));
    }

    // 列出本地可用的模型
    public static String listLocalModels() throws IOException {
        return makeGetRequest("/tags");
    }

    // 显示模型的详细信息
    public static String showModelInfo(String model) throws IOException {
        return makePostRequest("/show", new JSONObject()
                .put("model", model));
    }

    // 复制一个现有模型到新的名称
    public static String copyModel(String source, String destination) throws IOException {
        return makePostRequest("/copy", new JSONObject()
                .put("source", source)
                .put("destination", destination));
    }

    // 删除一个模型及其数据
    public static String deleteModel(String model) throws IOException {
        return makeDeleteRequest("/delete", new JSONObject()
                .put("model", model));
    }

    // 从Ollama库下载模型
    public static String pullModel(String model) throws IOException {
        return makePostRequest("/pull", new JSONObject()
                .put("model", model));
    }

    // 生成文本的嵌入向量
    public static String generateEmbeddings(String model, JSONArray input) throws IOException {
        return makePostRequest("/embeddings", new JSONObject()
                .put("model", model)
                .put("input", input));
    }

    // 列出当前加载到内存中的模型
    public static String listRunningModels() throws IOException {
        return makeGetRequest("/ps");
    }

    // 发送POST请求
    private static String makePostRequest(String endpoint, JSONObject requestBody) throws IOException {
        URL url = new URL(BASE_URL + endpoint);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);

        try (DataOutputStream wr = new DataOutputStream(connection.getOutputStream())) {
            wr.writeBytes(requestBody.toString());
            wr.flush();
        }

        return getResponse(connection);
    }

    // 发送GET请求
    private static String makeGetRequest(String endpoint) throws IOException {
        URL url = new URL(BASE_URL + endpoint);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        return getResponse(connection);
    }

    // 发送DELETE请求
    private static String makeDeleteRequest(String endpoint, JSONObject requestBody) throws IOException {
        URL url = new URL(BASE_URL + endpoint);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("DELETE");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);

        try (DataOutputStream wr = new DataOutputStream(connection.getOutputStream())) {
            wr.writeBytes(requestBody.toString());
            wr.flush();
        }

        return getResponse(connection);
    }

    // 获取响应
    private static String getResponse(HttpURLConnection connection) throws IOException {
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()))) {
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            return response.toString();
        } catch (IOException e) {
            try (BufferedReader errorReader = new BufferedReader(
                    new InputStreamReader(connection.getErrorStream()))) {
                String inputLine;
                StringBuilder errorResponse = new StringBuilder();
                while ((inputLine = errorReader.readLine()) != null) {
                    errorResponse.append(inputLine);
                }
                throw new IOException(errorResponse.toString(), e);
            }
        }
    }

    public static void main(String[] args) {
        try {
            // 示例使用
            String model = "deepseek-r1";
            String prompt = "请介绍一下人工智能。";
            System.out.println("生成文本响应: " + generateCompletion(model, prompt));

            JSONArray messages = new JSONArray();
            messages.put(new JSONObject().put("role", "user").put("content", "你好"));
            System.out.println("生成聊天对话响应: " + generateChatCompletion(model, messages));

            System.out.println("列出本地可用的模型: " + listLocalModels());
            System.out.println("显示模型的详细信息: " + showModelInfo(model));

            String newModel = "new_deepseek_r1";
            System.out.println("创建模型: " + createModel(newModel, model, "这是一个新模型"));
            System.out.println("复制模型: " + copyModel(model, newModel));
            System.out.println("删除模型: " + deleteModel(newModel));

            System.out.println("从Ollama库下载模型: " + pullModel(model));

            JSONArray input = new JSONArray();
            input.put("文本内容1");
            input.put("文本内容2");
            System.out.println("生成文本的嵌入向量: " + generateEmbeddings(model, input));

            System.out.println("列出当前加载到内存中的模型: " + listRunningModels());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}