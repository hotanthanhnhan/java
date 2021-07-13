package normalizetext;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File fr = new File("src/file/text.txt");
        File fw = new File("src/file/answer.txt");
        NormalizeText N = new NormalizeText();
        N.readFile(fr);
        System.out.println("=====Data from file=====");
        System.out.println(N.getTxt());
        N.Normalize();
        System.out.println("=====Data after normalize and write to file answer=====");
        System.out.println(N.getTxt());
        N.writeFile(fw);
    }
}
