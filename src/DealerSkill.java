public class DealerSkill extends Skill {

    int num;

    public DealerSkill(int consumptionHP, int consumptionMP) {
        super(consumptionHP, consumptionMP);
    }

    Attack attack = new Attack();

    public int getConsumptionHP() {
        return super.getConsumptionHP();
    }

    public int getConsumptionMP() {
        return super.getConsumptionMP();
    }
    @Override
    public double doSkill(String name, int total, int power) {
        num = (int)(total * (power * 0.1));
        attack.doAttack(name, num);

        return num;
    }
}
