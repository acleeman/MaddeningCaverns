public class Weapon {
    private Calculator calculator = new Calculator();
    private int damage = 0;
    private int range = 0;
    public static final int weaponTypes =6;
    private int baseDamage=0;
    private int baseRange=weaponTypes;
    private String weaponKind;

    public static void main(String[] args) {
            new Weapon();
        }

        public Weapon(){
            determineStats();
        }

        private void determineStats(){
            String[] desc = {
                    "Cold", "Overgrown", "Molten", "Shiny", "able", "bad", "best", "better", "big",
                    "dark", "certain", "clear", "different", "early", "easy", "free", "full",
                    "good", "great", "hard", "high", "human", "important", "international", "large", "late", "little"
            };
            String[] weaponKindList= {
                    "Bow", "Crossbow", "Spear", "Longsword", "Arming Sword", "Dagger"
            };
            int tempVal = calculator.intBetween(0, weaponKindList.length);
            for(int i =0; i<tempVal; i++){
                baseDamage++;
                baseRange++;
                weaponKind = weaponKindList[i];
            }
            //System.out.println(baseDamage + baseRange + weaponKind);
            calculator.intBetween(0, desc.length);
            calculator.intBetween(0,2);
    }
}
