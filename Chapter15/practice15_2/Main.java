package Chapter15.practice15_2;

public class Main {
  public static void main(String[] args) {
  }
  public String concatPath(String folder, String file) {
    if (!folder.endsWith("¥¥")) {
      folder += "¥¥";
    }
    return folder + file;
  }
}
