package pattern.structural.adapter;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLReaderAdapter;
import pattern.structural.adapter.adapters.SmartPhone;
import pattern.structural.adapter.computer.MacComputer;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        /*
        // 자바 코어라이브러리들에서 대표적인 어댑터 패턴

        Arrays.asList();
        Collections.list();
        Collections.enumeration();
        new InputStreamReader(new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        });
        new OutputStreamWriter(new OutputStream() {
            @Override
            public void write(int b) throws IOException {

            }
        });
        try {
            new XMLReaderAdapter();
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
        */

        SmartPhone iPhone = new SmartPhone("010-1111-2222", new MacComputer());
        String result = iPhone.search("galuxy");
        iPhone.call("010-1234-1234");
        iPhone.sandMasage("010-1234-1234", "야 왜 안 받아");
        iPhone.downLoadByInternet("NAVER");
    }
}
