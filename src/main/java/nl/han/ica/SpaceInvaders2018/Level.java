package nl.han.ica.SpaceInvaders2018;

/**
 * Level bepaalt de startpositie van de aliens
 */
public class Level {
    
	private int levelNumber; // Levelnummer (1 tot 10)
    private int startPositionAliens;

    /**
     * Constructor
     * @param levelNumber			Levelnummer (1 tot 10)
     * @param startPositionAliens	Startpositie van de aliens
     */
    public Level(int levelNumber, int startPositionAliens) {
        this.levelNumber = levelNumber;
        this.startPositionAliens = startPositionAliens;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public int getStartPositionAliens() {
        return startPositionAliens;
    }
}
