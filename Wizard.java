public class Wizard {
  private int hp;
  private int mp;
  private String name;
  private Wand wand;
  
  void heal(Hero h) {
    int basePoint = 10;
    int recover = (int) (basePoint + this.wand.getPower());
    h.serHp(h.getHp() + recoverPoint);
    System.out.println(h.getHp() + "のHPを" + recoverPoint + "回復した!");
  }

  public int getHp() { return this.hp; }
  public void setHp(int hp) { 
    if (hp < 0) {this.hp = 0;} else {this.hp = hp;}
  }
  public int getMp() { return this.mp; }
  public void setMp(int mp) {
    if (mp < 0) {
      throw new IllegalArgumentException("設定されようとしているMPが異常です");
    }
   this.mp = mp; 
  }
  public String getName() { return this.name; }
  public void setName(String name) { 
    if (name == null || name.length() < 3) {
      throw new IllegalArgumentException("魔法使いに設定されようとしている名前が異常です");
    }
    this.name = name; 
  }
  public Wand getWand() { return this.wand; }
  public void setWand(Wand wand) { 
    if (wand == null) {
      throw new IllegalArgumentException("設定されようとしている杖がnullです");
    }
    this.wand = wand; 
  }
}
