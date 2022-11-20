package lecture04;

public class Fighter {
    int hitPoint;
    int power;
    String name;

    Fighter(int hitPoint, int power, String name) {
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    public void attack( Fighter enemy ) {
        hitPoint = hitPoint - power;
        System.out.println( name + " は " + enemy.name + " に " + power + " ダメージを与えた。" );
    }

    public int getHitpoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public boolean isAlive() {
        boolean b;
        b = (hitPoint > 0);//HP>0ならtrue
        return b;
    }

    public String getName() {
        return name;
    }
}
