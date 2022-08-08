import java.lang.*;
public class Dealer extends Champion {
    private int totalInflictionDamage;//누적 공격량

    int autoAttackPower, attackConsumptionHP, skillConsumptionHP, consumptionMP, propertyPower, skillPower;

    public Dealer(String name, String role, String propertyName, int propertyPower, int maxHP, int maxMP, int one, int two, int maxMovingDistance, int attackConsumptionHP, int consumptionMP, int skillConsumptionHP, int autoAttackPower) {
        super(name, role, propertyName, propertyPower, maxHP, maxMP, one, two, maxMovingDistance);

        this.totalInflictionDamage = 0;
        this.autoAttackPower = autoAttackPower;
        this.attackConsumptionHP = attackConsumptionHP;
        this.skillConsumptionHP = skillConsumptionHP;
        this.consumptionMP = consumptionMP;
    }

    DealerAutoAttack attack = new DealerAutoAttack(autoAttackPower, attackConsumptionHP);
    DealerSkill skill = new DealerSkill(skillConsumptionHP, consumptionMP);

    public void attacking() {
        propertyPower = super.getPropertyPower();//속성력
        totalInflictionDamage += attack.doAutoAttack(super.getName(),propertyPower);

        attackConsumptionHP = attack.getConsumptionHP();
        super.bodyinfo.decreaseHP(attackConsumptionHP);//평타칠 때 다는 피
    }

    public void skilling() {
        propertyPower = super.getPropertyPower();
        totalInflictionDamage += skill.doSkill(super.getName(), totalInflictionDamage, propertyPower);

        skillConsumptionHP = skill.getConsumptionHP();
        consumptionMP = skill.getConsumptionMP();
        super.bodyinfo.decreaseHP(skillConsumptionHP);//스킬칠 때 다는 피
        super.bodyinfo.decreaseMP(consumptionMP);//스킬칠 때 다는 마나
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
    }

    public void healing(int num) {
        super.bodyinfo.increaseHP(num);//힐러가 힐 해줄 때
    }

}