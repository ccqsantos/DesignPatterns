package structural_patterns.decorator;

import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("./sample.txt");
        Reader reader = new FileReader(file);

//        int chr = 0;
//        while ((chr = reader.read()) != -1){
//            System.out.print((char)chr);
//        }

        BufferedReader buff = new BufferedReader(reader);
        buff.lines().forEach(System.out::println);


        buff.close();
    }

}
