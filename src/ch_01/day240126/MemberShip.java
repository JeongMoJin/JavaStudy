package ch_01.day240126;

public class MemberShip {
    public String name;
    public int age;

    public MemberShip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age; // String의 hashCode()
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MemberShip) {
            MemberShip memberShip = (MemberShip) obj;
            return memberShip.name.equals(this.name) && (memberShip.age == age);
        }
        else {
            return false;
        }
    }
}









