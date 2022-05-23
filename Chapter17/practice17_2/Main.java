package Chapter17.practice17_2;

public class Main {
  public static void main(String[] args) {
    try {
      String s = null;
      System.out.println(s.length());
    } catch (NullPointerException e) {
      System.out.println("NullPointerException例外をcatchしました");
      System.out.println("--スタックレース(ここから)--");
      e.printStackTrace();
      System.out.println("--スタックレース(ここまで)--");
    }
  }
}
