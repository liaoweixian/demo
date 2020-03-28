package rabbitmq;


import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.time.Duration;
import java.util.UUID;
import java.util.concurrent.TimeoutException;

public class PublisherConfirms {

    static final int MESSAGE_COUNT = 50_000;

    static Connection createConnection() throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("127.0.0.1");
        return factory.newConnection();
    }

    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
        publishMessagesIndividually();

    }

    public static void publishMessagesIndividually() throws IOException, TimeoutException, InterruptedException {
        try (Connection connection = createConnection()){
            final Channel channel = connection.createChannel();
            final String queueString = UUID.randomUUID().toString();
            channel.queueDeclare(queueString, false, false, true, null);
            //开启消息确认
            channel.confirmSelect();
            final long start = System.nanoTime();
            for (int i = 0; i < MESSAGE_COUNT; i++) {
                String body = String.valueOf(i);
                channel.basicPublish("", queueString, null, body.getBytes());
                //消息确认  设置超时时间  如果未在超时时间内确认该消息或该消息没有被确认，该方法会引发异常
                channel.waitForConfirmsOrDie(0);
            }
            long end = System.nanoTime();
            System.out.format("Published %,d messages individually in %,d ms%n", MESSAGE_COUNT, Duration.ofNanos(end - start).toMillis());

        }
    }
}
