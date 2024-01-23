package ch_01.day240123;

interface Skinnanle {
    int BLACK = 0;
    int RED = 1;
    int GREEN = 2;
    int BLUE = 3;
    int LEOPARD = 4;

    void changeSkin(int skin);
}

class PortablePlayer implements Player, Skinnanle {
    private int skin = BLACK;

    public void play() {
        System.out.println("◆ 재생시작!");
    }

    @Override
    public void stop() {
        System.out.println("◆ 재생종료!");
    }

    @Override
    public void changeSkin(int skin) {
        System.out.println("스킨을 ");
        switch (skin) {
            case BLACK:
                System.out.println("검정");
                break;
            case RED:
                System.out.println("빨강");
                break;
            case GREEN:
                System.out.println("녹색");
                break;
            case BLUE:
                System.out.println("파랑");
                break;
            case LEOPARD:
                System.out.println("표범 무늬");
                break;
            default:
                System.out.println("기본값");
                break;
        }
        System.out.println("(으)로 변경했습니다.");
    }
}
public class MyInterface_02 {
    public static void main(String[] args) {
        PortablePlayer portablePlayer = new PortablePlayer();
        portablePlayer.play();
        portablePlayer.stop();
        portablePlayer.changeSkin(Skinnanle.LEOPARD);
    }
}
