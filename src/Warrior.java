package players;

// Класс героя Warrior
class Warrior extends Hero {
    public Warrior() {
        super(150, 30, "CRITICAL DAMAGE");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность CRITICAL DAMAGE");
    }
}