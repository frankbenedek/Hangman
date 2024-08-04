public class Player {
    private String name;
    private int lives;


    public Player(String name, int lives) {
        this.name = name;
        this.lives = lives;
    }

    public String getName() {
        return name;
    }
    public int getLives() {
        return lives;
    }
    public void setLives(int lives) {
        this.lives = lives;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Player [name=" + name + ", lives=" + lives + "]";
    }
}
