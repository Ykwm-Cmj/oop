package pattern.structural.decorator.guruexample.deco;

import pattern.structural.decorator.guruexample.DataSource;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class CompressionDecorator extends DataSourceDecorator {
    private int compLevel = 6;

    public CompressionDecorator(DataSource source) {
        super(source);
    }

    public int getCompressionLevel() {
        return compLevel;
    }

    public void setCompressionLevel(int value) {
        compLevel = value;
    }

    @Override
    public void writeData(String data) {
        System.out.println("CompressionDecorator write");
        super.writeData(compress(data));
    }

    @Override
    public String readData() {
        System.out.println("CompressionDecorator read");
        return decompress(super.readData());
    }

    private String compress(String stringData) {
        byte[] data = stringData.getBytes();
        try {
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            DeflaterOutputStream dos = new DeflaterOutputStream(bout, new Deflater(compLevel));
            dos.write(data);
            dos.close(); // close 할때 압축을 하기 때문에 close 후에 값을 가져와야 함
            bout.close();
            return Base64.getEncoder().encodeToString(bout.toByteArray());
        } catch (IOException ex) {
            return null;
        }
    }

    private String decompress(String stringData) {
        byte[] data = Base64.getDecoder().decode(stringData);
        String result = null;
        try (InputStream in = new ByteArrayInputStream(data);
             InflaterInputStream iin = new InflaterInputStream(in);
             ByteArrayOutputStream bout = new ByteArrayOutputStream(512)){
            int b;
            while ((b = iin.read()) != -1) {
                bout.write(b);
            }
            result = new String(bout.toByteArray());
        } catch (IOException ex) {
            return null;
        }
        return result;
    }
}