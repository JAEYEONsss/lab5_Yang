public class BodyInfo {
    private int maxHP, currentHP, maxMP, currentMP;

    public BodyInfo(int maxHP, int maxMP) {
        this.maxHP = maxHP;
        this.maxMP = maxMP;
        this.currentHP = this.maxHP;
        this.currentMP = this.maxMP;
    }

    public void increaseHP(int num) {
        currentHP += num;
    }//경우에 따라서 num 값은 달라진다.

    public void decreaseHP(int num) {
        currentHP -= num;
    }//경우에 따라서 num 값은 달라진다.

    public void decreaseMP(int num) {
        currentMP -= num;
    }//경우에 따라서 num 값은 달라진다.

    public int getCurrentHP() {
        return currentHP;
    }

    public int getCurrentMP() {
        return currentMP;
    }
}
