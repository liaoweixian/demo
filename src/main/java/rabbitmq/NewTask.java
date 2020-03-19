package rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class NewTask {

    private static final String TASK_QUEUE_NAME = "task_queue";

    public static void main(String[] args) {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("127.0.0.1");
        Connection connection = null;
        try
        {
            connection = factory.newConnection();
            Channel channel = connection.createChannel();
            channel.queueDeclare(TASK_QUEUE_NAME, true, false, false, null);

            String message = String.join(" ", "www rrr ewww 哈哈 6666");
            channel.basicPublish("", TASK_QUEUE_NAME,
                    MessageProperties.PERSISTENT_TEXT_PLAIN,
                    message.getBytes("UTF-8"));
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
