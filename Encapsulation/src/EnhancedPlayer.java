public class EnhancedPlayer {

    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String fullName) {
        this(fullName, 100, "Sword");
    }

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        this.healthPercentage = health <= 0 ? 1 : (Math.min(health, 100));
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {

        this.healthPercentage -= damage;
        if (this.healthPercentage <= 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining() {
        return this.healthPercentage;
    }

    public void restoreHealth(int extraHealth) {

        this.healthPercentage += extraHealth;
        if (this.healthPercentage > 100) {
            this.healthPercentage = 100;
            System.out.println("Player restored to 100%");
        }
    }
}
