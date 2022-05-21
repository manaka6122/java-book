package practice14;

public class Acount {
  String acountNumber;
  int balance;

  public String toString() {
    return "¥¥" + this.balance + "(口座番号：" + this.acountNumber + ")";
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o instanceof Acount) {
      Acount a = (Acount)o;
      String an1 = this.acountNumber.trim();
      String an2 = a.acountNumber.trim();
      if (an1.equals(an2)) {
        return true;
      }
    }
    return false;
  }
}
