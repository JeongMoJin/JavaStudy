package chapter01;

public class a_38_MyArray {

	public static void main(String[] args) {
		/* 극장에 앉아있는 관객들을 2차원 배열로 나타낼수 있음.
        관객이 있는 좌석은 1로, 관객이 없는 좌석은 0으로 나타냄.
        현재 극장에 앉아있는 관객들의 수를 세는 프로그램을 작성.
     */
    int[][] seats = {
            {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 1, 1, 0}
    };
    int count = 0;
    for (int i = 0; i<seats.length; i++) {
    	for (int j = 0; j<seats[i].length; j++) {
    		if (seats[i][j] == 1) {
    			count++;
    		}
    	}
    }
    System.out.println("현재 관객 수는 " + count + "명입니다.");
	}

}
