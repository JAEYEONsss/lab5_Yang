public class SupporterSkill extends Skill {


    public SupporterSkill(int consumptionHP, int consumptionMP) {
        super(consumptionHP, consumptionMP);
    }
    Recovery recovery = new Recovery();

    public int getConsumptionHP() {
        return super.getConsumptionHP();
    }

    public int getConsumptionMP() {
        return super.getConsumptionMP();
    }

    public double getHealing(int total, int property) {
        return total * (property * 0.1);
    }
}

