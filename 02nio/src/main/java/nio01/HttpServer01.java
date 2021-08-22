package nio01;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 实现一个简单的Http服务器
 */
public class HttpServer01 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8801);
        while (true) {
            try {
                Socket socket = serverSocket.accept();
                service(socket);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void service(Socket socket) {
        try {
            //获取输入流，读取数据
            StringBuilder builder = new StringBuilder();
            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            char[] charBuf = new char[1024];
            int mark;
            while ((mark = isr.read(charBuf)) != -1) {
                builder.append(charBuf, 0, mark);
                if (mark < charBuf.length) {
                    break;
                }
            }
            System.out.println(builder.toString());


            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            printWriter.println("HTTP/1.1 200 OK");
            printWriter.println("Content-Type:text/html;charset=utf-8");
            String body = "hello 8801";
            printWriter.println("Content-Length:" + body.getBytes().length);
            printWriter.println();
            printWriter.write(body);
            printWriter.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
