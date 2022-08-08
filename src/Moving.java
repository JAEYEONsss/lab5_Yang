import java.lang.*;
public class Moving {
    private int[] location = new int[2];
    private int one, two;
    private int maxMovingDistance, consumptionHP;
    public Moving(int one, int two, int maxMovingDistance) {
        this.one = one;
        this.two = two;
        this.maxMovingDistance = maxMovingDistance;
    }

    public int checkDistance(int num) {
        if (num > maxMovingDistance) {
            return 0;//최대 거리보다 더 가려고 함
        }else{
            return 1;//챔피언 이동 가능
        }
    }

    public void changeLocation(String site, int num) {
        if (site.equals("UP")) {
            location[1] += num;
        } else if (site.equals("DOWN")) {
            location[1] -= num;
        } else if (site.equals("LEFT")) {
            location[0] -= num;
        } else if (site.equals("RIGHT")) {
            location[0] += num;
        }
    }//챔피언 location field 변경 함수

}
