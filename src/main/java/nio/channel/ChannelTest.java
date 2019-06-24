package nio.channel;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ChannelTest {

    //使用直接缓冲区完成文件的复制
    @Test
    public void test2() {

        try {
            FileChannel inputChannel = FileChannel.open(Paths.get("C:\\Users\\96593\\test\\demo.txt"), StandardOpenOption.READ);
            FileChannel outputChannel = FileChannel.open(Paths.get("C:\\Users\\96593\\test\\demo2.txt"), StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE);

            /*inputChannel.transferTo(0, inputChannel.size(), outputChannel);
            outputChannel.transferFrom(inputChannel, 0, inputChannel.size());*/

            //内存映射对象
            MappedByteBuffer inMapperBuffer = inputChannel.map(FileChannel.MapMode.READ_ONLY, 0, inputChannel.size());
            MappedByteBuffer outMapperBuffer = outputChannel.map(FileChannel.MapMode.READ_WRITE, 0, inputChannel.size());
            byte[] b = new byte[inMapperBuffer.limit()];

            inMapperBuffer.get(b);
            outMapperBuffer.put(b);

            inputChannel.close();
            outputChannel.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //使用通道完成内存文件的复制(非直接缓冲区)
    @Test
    public void test1()  {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        FileChannel inputChannel = null;
        FileChannel outputChannel = null;
        try {
            fileInputStream = new FileInputStream("C:\\Users\\96593\\test\\demo.txt");
            fileOutputStream = new FileOutputStream("C:\\Users\\96593\\test\\demo2.txt");

            inputChannel =  fileInputStream.getChannel();
            outputChannel = fileOutputStream.getChannel();

            ByteBuffer buffer = ByteBuffer.allocate(1024);

            while (inputChannel.read(buffer) > -1) {
                buffer.flip(); //切换成读取数据的模式
                outputChannel.write(buffer);
                buffer.clear(); //清空缓冲去
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputChannel != null) {
                try {
                    inputChannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputChannel != null) {
                try {
                    outputChannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
