# JDK10
JDK SOURCE CODE

Channel
渠道，水流的通道， 而Java中的Channel作为数据流的通道，连接着可被读取或存放的数据仓库。根据连着的不同数据仓库，分为了不同的Channel，主要有以下几种。
1.FileChannel
连接着文件。
            RandomAccessFile aFile = new RandomAccessFile("C:\\AWork\\EMEA\\MIG\\parameters.txt", "rw");
            FileChannel inChannel = aFile.getChannel();

            ByteBuffer buf = ByteBuffer.allocate(1024);

            int bytesRead = inChannel.read(buf);
            while (bytesRead != -1) {

                System.out.println("Read " + bytesRead);
                buf.flip();

                while (buf.hasRemaining()) {
                    System.out.print((char) buf.get());
                }

                buf.clear();
                bytesRead = inChannel.read(buf);
            }
            aFile.close();

2. DatagramChannel
3.SocketChannel
4.ServerSocketChannel

Channel连接的另一端永远是Buffer,它通过Channel读取或写进数据。以数据的种类，可分为ByteBuffer(1个字节）,CharBuffer（2个字节）,ShortBuffer（2字节），IntBuffer（4个字节）,LongBuffer（8字节）,DoubleBuffer（8字节，指数11位）,FloatBuffer（4字节，指数8位）


URLS:
http://ifeve.com
