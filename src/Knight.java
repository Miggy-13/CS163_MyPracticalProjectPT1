public class Knight extends MOB {
    private Fortune activeFortune;
    protected int xp;
    protected final int id;
    
    Knight(int id, String name, int hp, int armor, int hitmodifier, DiceType damageDie, int xp) {
        super(name, hp, armor, hitmodifier, damageDie);
        this.id = id;
        this.xp = xp;
    }


    @Override
    public int getArmor() {

        if (getActiveFortune() != null) {
            this.armor += getActiveFortune().getArmor();
            return this.armor;
        }

        else return this.armor;

    }

    @Override
    public int getMaxHP() {

        if (getActiveFortune() != null) {
            this.maxHP += getActiveFortune().getMaxHP();
        }

        else {
            int hp = super.getMaxHP();
            return hp;
        }

        return super.getMaxHP();
    }

    @Override
    public DiceType getDamageDie() {

        if (getActiveFortune() != null)  {
            return getActiveFortune().getDamageDie();
        }

        else return super.getDamageDie(); 

    }

    @Override
    public int getHitModifier() {

        if (getActiveFortune() != null) {
            
            this.hitModifier += getActiveFortune().getHitModifier();
            
        }

        // else return this.getHitModifier();

        return this.hitModifier;

    }

    public int getXP() {
        return xp;
    }

    public Fortune getActiveFortune() {
        return this.activeFortune;
    }

    public void setActiveFortune(Fortune activeFortune) {
        this.activeFortune = activeFortune;
    }

    public void addXP(int xp) {
        this.xp += xp;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "+============================+\n" +
                String.format("| %-27s|%n", getName()) +
                String.format("| id: %-6d                 |\n", getId()) +
                "|                            |" + "\n" +
                String.format("| Health: %-6d  "+ String.format("XP: %-7d", getXP()) + "|%n", getHP())  +
                String.format("|  Power: %-6s  Armor: %-4d|%n", getDamageDie().toString(), getArmor()) +
                "|                            |\n" +
                "+============================+" + "\n";
    }

    public String toCSV() {
        
        String krep = getName();
            krep += "," + getMaxHP();
            krep += "," + getArmor();
            krep += "," + getHitModifier();
            krep += "," + getDamageDie();
            krep += "," + getXP();
        
        return krep;
    }

    public static void main(String[] args) {
        Knight knight = new Knight(3, "Merlin The Random", 63, 2, 30, DiceType.D12, 0);
        Fortune fortune = new Fortune("NOBILITY", 30, 20, 30, DiceType.D20);

        // System.out.println(knight.getXP());

        // System.out.println("TESTING getArmor (BEFORE SETTING FORTUNE) " + knight.getArmor());
        // System.out.println("TESTING getMaxHP (BEFORE SETTING FORTUNE) " + knight.getMaxHP());
        // System.out.println("TESTING getDamageDie (BEFORE SETTING FORTUNE) " + knight.getDamageDie());
        // System.out.println("TESTING getHitModifier (BEFORE SETTING FORTUNE) " + knight.getHitModifier());
        // knight.addXP(30);
        // System.out.println("TESTING getXP (BEFORE SETTING FORTUNE) " + knight.getXp());
        // System.out.println("TESTING toString (BEFORE SETTING FORTUNE)");
        // System.out.println(knight.toString());
        // System.out.println("SETTING ACTIVE FORTUNE...");
        // knight.setActiveFortune(fortune);
        // System.out.println("TESTING getActiveFortune (AFTER SETTING FORTUNE)");
        // System.out.println(knight.getActiveFortune());
        // System.out.println("TESTING getArmor (AFTER SETTING FORTUNE) " + knight.getArmor());
        // System.out.println("TESTING getMaxHP (AFTER SETTING FORTUNE) " + knight.getMaxHP());
        // System.out.println("TESTING getDamageDie (AFTER SETTING FORTUNE) " + knight.getDamageDie());
        // System.out.println("TESTING getHitModifier (AFTER SETTING FORTUNE) " + knight.getHitModifier());
        // System.out.println("TESTING getXP (AFTER SETTING FORTUNE) " + knight.getXp());
        // System.out.println(knight.getId());
        // System.out.println("TESTING toString (AFTER SETTING FORTUNE)");
        System.out.println(knight.toString());
        // System.out.println(knight.toCSV());


    }
    
}
