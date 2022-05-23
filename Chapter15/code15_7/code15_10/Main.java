package Chapter15.code15_7.code15_10;

public class Main {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    long end = System.currentTimeMillis();
    // ここで何らかの時間のかかる処理
    System.out.println("処理にかかった時間は…" + (end - start) + "ミリ秒でした");
  }
}
