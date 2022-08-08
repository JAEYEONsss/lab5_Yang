public class Supporter extends Champion{
    private int totalRecoveryHealth;
    int autoAttackPower,attackConsumptionHP,skillConsumptionHP, consumptionMP;

    public Supporter(String name, String role, String propertyName, int propertyPower, int maxHP, int maxMP, int one, int two, int maxMovingDistance, int attackConsumptionHP, int consumptionMP, int skillConsumptionHP, int autoAttackPower) {
        super(name, role, propertyName, propertyPower, maxHP, maxMP, one, two, maxMovingDistance);
        this.totalRecoveryHealth = 0;
        this.autoAttackPower = autoAttackPower;
        this.attackConsumptionHP = attackConsumptionHP;
        this.skillConsumptionHP = skillConsumptionHP;
        this.consumptionMP = consumptionMP;
    }

    SupporterAutoAttack attack = new SupporterAutoAttack(autoAttackPower, attackConsumptionHP);
    SupporterSkill skill = new SupporterSkill(skillConsumptionHP, consumptionMP);

    public void attacking() {
        super.bodyinfo.decreaseHP(attack.getConsumptionHP());//피 깎이고

        attack.attacking(super.getName(), super.getPropertyPower());
        totalRecoveryHealth += (super.getPropertyPower() * 0.01);
    }

    public int skilling() {
        super.bodyinfo.decreaseHP(skill.getConsumptionHP());
        super.bodyinfo.decreaseMP(skill.getConsumptionMP());

        super.bodyinfo.increaseHP((int)skill.getHealing(totalRecoveryHealth, super.getPropertyPower()));
        totalRecoveryHealth += (int)skill.getHealing(totalRecoveryHealth, super.getPropertyPower());

        return  (int)skill.getHealing(totalRecoveryHealth, super.getPropertyPower());//딜러한테도 힐 해줌
    }

    public int calcMoving(String site, int num) {
        if(super.moving.checkDistance(num) == 0){
            System.out.println("Moving Distance exceeded. Please re-enter");
            return 0;//다시 입력
        }else{
            super.moving.changeLocation(site, num);
            super.bodyinfo.decreaseHP(num*10);
            return 1;//그만 입력
        }
    }//피 깎이는 거 신경 안 써도 됨
}