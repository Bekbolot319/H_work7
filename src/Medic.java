package players;

// Класс героя Medic
class Medic extends Hero {
    private int healPoints;

    public Medic() {
        super(80, 10, "HEAL");
        this.healPoints = 20; // Пример начального значения для healPoints
    }

    public void increaseExperience() {
        this.healPoints *= 1.1; // Увеличиваем на 10%
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность HEAL");
    }
}
