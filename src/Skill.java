public abstract class Skill {
    private int consumptionHP, consumptionMP;
    double num = 0;

    public Skill(int consumptionHP, int consumptionMP) {
        this.consumptionHP = consumptionHP;
        this.consumptionMP = consumptionMP;
    }

    public int getConsumptionHP() {
        return consumptionHP;
    }

    public int getConsumptionMP() {
        return consumptionMP;
    }
    public double doSkill(String name, int hp,int power) {
        return num;
    }
}
