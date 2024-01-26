package ch_01.day240126;

import java.util.HashSet;
import java.util.Set;

public class MyHashSet_03 {
    public static void main(String[] args) {
        Set<MemberShip> set = new HashSet<>();

        MemberShip memberShip1 = new MemberShip("홍길동", 30);
        MemberShip memberShip2 = new MemberShip("홍길동", 31);

        set.add(memberShip1);
        set.add(memberShip2);

        System.out.println("총 객체수 : " + set.size()); // 1
    }
}
