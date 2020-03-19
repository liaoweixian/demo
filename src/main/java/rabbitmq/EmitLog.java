package rabbitmq;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

/**
 * 广播形式 推送消息 通过转换器给绑定的所有队列推送消息
 */
public class EmitLog {

    private static final String EXCHANGE_NAME = "logs";

    public static void main(String[] args) {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("127.0.0.1");
        Connection connection = null;
        try
        {
            connection = factory.newConnection();
            Channel channel = connection.createChannel();

            //转换器绑定对象
            channel.exchangeDeclare(EXCHANGE_NAME, "fanout");
            String message = "来笑一个";
            channel.basicPublish(EXCHANGE_NAME, "", null, message.getBytes(StandardCharsets.UTF_8));
            System.out.println(" [x] Sent '" + message + "'");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
