package rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class ReceiveLogs2 {

    private static final String EXCHANGE_NAME = "logs1";

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        //创建一个交换器
        channel.exchangeDeclare(EXCHANGE_NAME, "direct");

        //不带参数，系统默认生产一个随机队列，临时的队列 一但链接断开，队列自动删除
        String queueName = channel.queueDeclare().getQueue();

        //交换器与队列进行绑定
        channel.queueBind(queueName, EXCHANGE_NAME, "");

        /**
         * 消息推送，通过回调来消费消息
         */
        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");
        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String message = new String(delivery.getBody(), "UTF-8");
            System.out.println(" [x] Received '" + message + "'");
        };
        channel.basicConsume(queueName, true, deliverCallback, consumerTag -> { });
    }
}
