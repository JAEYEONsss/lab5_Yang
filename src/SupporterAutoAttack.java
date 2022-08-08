public class SupporterAutoAttack extends AutoAttack {

    public SupporterAutoAttack(int autoAttackPower, int consumptionHP) {
        super(autoAttackPower, consumptionHP);
    }

    Attack attack = new Attack();
    Recovery recovery = new Recovery();

    public void attacking(String name, int power) {
        attack.doAttack(name, super.getAutoAttackPower());
        recovery.doRecovery(name, (power*0.01));

    }
}
