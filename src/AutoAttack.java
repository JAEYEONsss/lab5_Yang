public abstract class AutoAttack {
    private int autoAttackPower, consumptionHP;
    double num = 0;
    public AutoAttack(int autoAttackPower, int consumptionHP) {
        this.autoAttackPower = autoAttackPower;
        this.consumptionHP = consumptionHP;
    }

    public double doAutoAttack(String name, int propertyPower) {
        return num;
    }

    public int getAutoAttackPower() {
        return autoAttackPower;
    }

    public int getConsumptionHP() {
        return consumptionHP;
    }
}
