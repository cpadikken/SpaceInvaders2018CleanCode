package nl.han.ica.SpaceInvaders2018;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.TextObject;
import processing.core.PGraphics;
import processing.core.PImage;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;

/**
 * Klasse voor de levens van de speler
 */
public class PlayerLives extends TextObject {
	
	private Sprite reserveCannon;
	private boolean firstLifeAwarded;
	private boolean secondLifeAwarded;
	private SpaceInvaders world;
	
	/**
	 * Constructor
	 * @param text		tekst die eventueel bij de levens kan worden gezet
	 * @param textSize	lettergrootte
	 * @param world		referentie naar de hoofdmodule
	 */
	public PlayerLives(String text, int textSize, SpaceInvaders world) {
		super(text, textSize);
		reserveCannon = new Sprite("nl/han/ica/SpaceInvaders2018/sprites/Cannon.png");
		reserveCannon.resize(23, 15);
		this.firstLifeAwarded = false;
		this.secondLifeAwarded = false;
		this.world = world;
	}
	
	@Override
	public void update() {
	}

	@Override
	public void draw(PGraphics g) {
		checkIfLiveShouldBeAwarded(world.getScore());
		drawReserveCannons(g);
	}
	
	private void drawReserveCannons(PGraphics g) {
		int x = Integer.parseInt(getText());
		if (x > 0) {
			PImage cannon = reserveCannon.getPImage();
			int width = reserveCannon.getWidth();
			int height = reserveCannon.getHeight();
			for (int i = 0; i < x; i++) {
				g.image(cannon, getX() + (width*i), getY() + height/2);

			}
		}
	}
	
	private void checkIfLiveShouldBeAwarded(int score) {
		if (score > 1000 && !firstLifeAwarded) {
			rewardLives();
			firstLifeAwarded = true;
		}
		else if (score > 2000 && !secondLifeAwarded) {
			rewardLives();
			secondLifeAwarded = true;
		}
	}
	
	private void rewardLives() {
		world.increaseLives();
		showExtraLifeText();
	}
	
    private void showExtraLifeText() {
    	BonusPointsText bonus = new BonusPointsText("+1 LIFE!", 20, world);
    	bonus.setForeColor(0, 255, 0, 255);
    	bonus.setX(getX());
    	bonus.setY(getY());
    	world.addGameObject(bonus);
    }
}
