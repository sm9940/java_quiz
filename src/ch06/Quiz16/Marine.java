package ch06.Quiz16;

public class Marine {

    int x, y = 0; //marine의 위치좌표
    int hp = 60; //현재 체력
    static int weapon = 6; //공격력
    static int armor = 0; //방어력

    //1. 공격력 증가시키는 메소드
    static void weaponUp(){
        weapon++;
    }
    //2. 방어력 증가시키는 메소드
    static void armorUp(){
        armor++;
    }
    //3. 캐릭터의 위치 움직이는 메소드
    void move(int x, int y){
        this.x =x;
        this.y =y;
    }
}
