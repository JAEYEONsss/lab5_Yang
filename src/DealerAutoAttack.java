public class DealerAutoAttack extends AutoAttack{

    int num;
    public DealerAutoAttack(int autoAttackPower, int consumptionHP) {
        super(autoAttackPower, consumptionHP);
    }
    Attack attack = new Attack();

    public int getHP() {
        return super.getConsumptionHP();
    }

    @Override
    public double doAutoAttack(String name, int propertyPower) {
        num = (int)(super.getAutoAttackPower() + (super.getAutoAttackPower()*propertyPower * 0.01));
        attack.doAttack(name, num);

        return num;
    }

}
