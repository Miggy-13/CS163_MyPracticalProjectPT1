public class Fortune implements Attributes {
    private final String name;
    private final int armor;
    private final int hpBonus;
    private final int hitModifier;
    private final DiceType dtype;
    
    

    public Fortune(String name, int hpBonus, int armor, int hitModifier) {
        this(name, hpBonus, armor, hitModifier, null);
    }

    public Fortune(String name, int hpBonus, int armor, int hitModifier, DiceType type) {
        this.armor = armor;
        this.dtype = type;
        this.hitModifier = hitModifier;
        this.hpBonus = hpBonus;
        this.name = name;
    }
    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public int getMaxHP() {
        return hpBonus;
    }

    @Override
    public DiceType getDamageDie() {
        return dtype;
    }

    @Override
    public int getHitModifier() {
        return hitModifier;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {

        String getCard = "+======================+ \n";
              getCard += String.format("|%-22s" + "| \n", getName());
              getCard += String.format("|HP Bonus:" + " %12s" + "|" + "\n", "+" + getMaxHP());
              getCard += String.format("|AC Bonus:" + " %12s" + "|" + "\n", "+" + getArmor());
              getCard += String.format("|Hit Bonus:" + " %11s" + "|" + "\n", "+" + getHitModifier());
              getCard += String.format("|Damage Adj:" + " %10s" + "|" + "\n", getDamageDie());
              getCard += "+======================+ \n";    
        
        return getCard;

    }

    // @Override
    // public String toString() {
// 
    //     String getCard = "+======================+ \n";
    //           getCard += String.format("|%-22s" + "| \n", getName());
    //           getCard += String.format("|HP Bonus:" + " %12s" + "|" + "\n", "+" + getMaxHP());
    //           getCard += String.format("|AC Bonus:" + " %12s" + "|" + "\n", "+" + getArmor());
    //           getCard += String.format("|Hit Bonus:" + " %11s" + "|" + "\n", "+" + getHitModifier());
    //           getCard += String.format("|Damage Adj:" + " %10s" + "|" + "\n", getDamageDie());
    //           getCard += "+======================+ \n";    
    //     
    //     return getCard;
// 
    // }

    // @Override
    // public String toString() {
// 
    //     String getCard = "+============================+ \n";
    //           getCard += String.format("|%-22s" + "      | \n", getName());
    //           getCard += String.format("|HP Bonus:" + "       %12s" + "|" + "\n", "+" + getMaxHP());
    //           getCard += String.format("|AC Bonus:" + "       %12s" + "|" + "\n", "+" + getArmor());
    //           getCard += String.format("|Hit Bonus:" + "       %11s" + "|" + "\n", "+" + getHitModifier());
    //           getCard += String.format("|Damage Adj:" + "       %10s" + "|" + "\n", getDamageDie());
    //           getCard += "+============================+ \n";    
    //     
    //     return getCard;
// 
    // }

    public static void main(String[] args) {
        Fortune ftn = new Fortune("Test", 5, 1, 2, DiceType.D20);
        
        // System.out.println(ftn.getArmor());
        // System.out.println(ftn.getMaxHP());
        // System.out.println(ftn.getDamageDie());
        // System.out.println(ftn.getHitModifier());
        // System.out.println(ftn.getName());
        System.out.println(ftn.toString());

    }
    

}
