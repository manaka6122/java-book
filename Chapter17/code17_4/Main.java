package Chapter17.code17_4;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    FileWriter fw = null;
    try {
      fw = new FileWriter("data.txt");
      fw.write("hello");
    } catch (IOException e) {
      System.out.println("エラーです");
    }
    fw.close();  //コンパイルエラー
  }
}
