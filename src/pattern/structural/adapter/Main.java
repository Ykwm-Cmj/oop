package pattern.structural.adapter;

import pattern.structural.adapter.adapters.Adapter110To220;
import pattern.structural.adapter.adapters.SmartPhone;
import pattern.structural.adapter.computer.MacComputer;
import pattern.structural.adapter.concent.Concent;
import pattern.structural.adapter.vault.Vault110;
import pattern.structural.adapter.vault.Vault220;

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

//        sample 1
        SmartPhone iPhone = new SmartPhone("010-1111-2222", new MacComputer());
        String result = iPhone.search("galuxy");
        iPhone.call("010-1234-1234");
        iPhone.sandMasage("010-1234-1234", "야 왜 안 받아");
        iPhone.downLoadByInternet("NAVER");

        System.out.println("\n============================\n");

//        sample 2
        Concent<Vault110> concent110 = new Concent<>(110);
        Concent<Vault220> concent220 = new Concent<>(220);
        Vault110 vault110 = new Vault110();
        Vault220 vault220 = new Vault220();

        concent110.charge(vault110);
        concent220.charge(vault220);

//        concent110.charge(vault220); // compile error
        Adapter110To220 adapter = new Adapter110To220(vault220);
        concent110.charge(adapter);
    }
}
