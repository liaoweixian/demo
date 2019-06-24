package nio;

import org.junit.Test;

import java.nio.ByteBuffer;

public class tst {

    @Test
    public void byteBufferDemo() {

        ByteBuffer bBuffer = ByteBuffer.allocate(1024);
        byte b[] = "就是这个".getBytes();
        bBuffer.put(b);
        System.out.println(new String(bBuffer.array(), 0, bBuffer.limit()));
    }
}
