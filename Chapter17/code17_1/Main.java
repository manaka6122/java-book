package Chapter17.code17_1;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    FileWriter fw = new FileWriter("data.txt");
    //IOExceptionを発生させる可能性があるが、try-catch文を記述していないとコンパイルエラーになる
  }
}
