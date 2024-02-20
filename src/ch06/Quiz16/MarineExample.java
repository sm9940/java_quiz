package ch06.Quiz16;

public class MarineExample {
    public static void main(String[] args) {
        Marine.weaponUp();
        Marine.weaponUp();
        Marine.weaponUp();
        Marine.armorUp();
        Marine.armorUp();
        Marine.armorUp();
        Marine marine1 = new Marine();
        marine1.move(100,200);


        System.out.println("marine1의 공격력:"+Marine.weapon);
        System.out.println("marine1의 방어력:"+Marine.armor);
        Marine marine2 = new Marine();
        marine2.move(100,200);

        System.out.println("marine2의 공격력:"+Marine.weapon);
        System.out.println("marine2의 방어력:"+Marine.armor);
        Marine marine3 = new Marine();
        marine3.move(100,200);
        System.out.println("marine3의 공격력:"+Marine.weapon);
        System.out.println("marine3의 방어력:"+Marine.armor);

    }
}
