package Chapter18.code18_3;
import java.io.InputStream;
import java.net.URL;

public class Main {
  public static void main(String[] args) throws Exception {
    URL u = new URL("http://book.impress.co.jp/");
    InputStream is = u.openStream();
    int i = is.read();
    while (i != -1) {
      char c = (char)i;
      System.out.print(c);
      i = is.read();
    }
  }
}
