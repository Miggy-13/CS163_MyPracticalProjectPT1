public class MOB implements Attributes {
    private final String name;
    protected int hitModifier;
    protected int armor;
    protected int maxHP;
    protected int damage;
    protected DiceType damageDie;
    
    public MOB() {
        this.name = getName();
    }

    public MOB(String name, int hp, int armor, int hitModifier, DiceType damageDie) {
        this.hitModifier = hitModifier;
        this.name = name;
        this.maxHP = hp;
        this.armor = armor;
        this.damageDie = damageDie;
    
    }
    

    @Override
    public int getArmor() {
        return armor;

    }

    @Override
    public int getMaxHP() {
        return maxHP;
    }

    @Override
    public DiceType getDamageDie() {
        return damageDie;

    }

    @Override
    public int getHitModifier() {
        return hitModifier;

    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public void addDamage(int damage) {
        this.damage += damage;

    }

    public int getHP() {
        int currHp = this.maxHP - this.damage;
        
        return currHp;
    }
    
    public void resetDamage() {
        this.damage = 0;
    }

    public String toString() {
        return "+============================+\n" +
                String.format("| %-27s|%n", getName()) +
                "|                            |\n" +
                String.format("| Health: %-10d         |%n", getHP())  +
                String.format("|  Power: %-6s  Armor: %-4d|%n", getDamageDie().toString(), getArmor()) +
                "|                            |\n" +
                "+============================+";
    }

    public MOB copy() {
        
        MOB mob = new MOB(this.name, this.maxHP, this.armor, this.hitModifier, this.damageDie);
        
        return mob;
    }

    public static void main(String[] args) {
        MOB mob = new MOB("MiggyMan", 100, 1000, 200, DiceType.D12);

        System.out.println(mob.getHitModifier());
        System.out.println(mob.getArmor());
        System.out.println(mob.getMaxHP());
        mob.addDamage(20);
        System.out.println(mob.getDamage());
        mob.resetDamage();
        System.out.println(mob.getDamage());
        System.out.println(mob.getName());
        System.out.println(mob.getHP());
        mob.addDamage(20);
        System.out.println(mob.getHP());
        System.out.println(mob.getDamageDie());

        System.out.println(mob.toString());

    }
}
