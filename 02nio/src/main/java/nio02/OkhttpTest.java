package nio02;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class OkhttpTest {
    public static void main(String[] args) {
        // netty网关的调用地址
        String url = "http://localhost:8808/test";

        // 使用 okhttp调用
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .addHeader("xjava", "xqnode")
                .build();
        try (Response response = client.newCall(request).execute()) {
            // 打印返回结果
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
