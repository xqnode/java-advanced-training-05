package nio01;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpClientTest {
    public static void main(String[] args) throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();
        long start = System.currentTimeMillis();
        HttpGet httpGet = new HttpGet("http://localhost:8801");
        CloseableHttpResponse response = client.execute(httpGet);
        System.out.printf("访问耗时：%sms\n", (System.currentTimeMillis() - start));
        HttpEntity entity = response.getEntity();
        String resStr = EntityUtils.toString(entity);
        System.out.println("访问结果：" + resStr);
        client.close();


    }
}
