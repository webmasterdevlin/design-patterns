package pro.devlinduldulao;

import pro.devlinduldulao.proxy.EbookProxy;
import pro.devlinduldulao.proxy.Library;
import pro.devlinduldulao.proxy.LoggingEbookProxy;
import pro.devlinduldulao.proxy.RealEbook;

public class Main {

    public static void main(String[] args) {
        var library = new Library();
        String[] fileNames = {"a", "b", "c"};
        for (var fileName : fileNames) {
            library.add(new LoggingEbookProxy(fileName));
        }

        library.openEbook("a");
        library.openEbook("b");
    }
}