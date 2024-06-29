// Абстрактный класс героя
abstract class Hero implements HavingSuperAbility {
    protected int health;
    protected int damage;
    protected String superAbility;

    // Конструктор
    public Hero(int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }
}
