package players;
// Класс героя Magic
class Magic extends Hero {
    public Magic() {
        super(100, 20, "FIREBALL");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность FIREBALL");
    }
}