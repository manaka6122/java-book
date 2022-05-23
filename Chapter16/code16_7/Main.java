package Chapter16.code16_7;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Map<String, Integer> prefs = new HashMap<String, Integer>();
    prefs.put("京都府", 255);
    prefs.put("東京都", 1261);
    prefs.put("熊本県", 181);
    for (String key : prefs.keySet()) {
      int value = prefs.get(key);
      System.out.println(key + "の人口は" + value);
    }
  }
}
