package ch_01.day240126;

import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("임정순");
        hashSet.add("박현정");
        hashSet.add("홍연의");
        hashSet.add("강감찬");
        hashSet.add("강감찬");

        // 중복된 문자열은 제거되고 출력 순서와 입력 순서는 상관없음
        System.out.println(hashSet);
    }
}
