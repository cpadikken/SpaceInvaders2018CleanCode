package nl.han.ica.SpaceInvaders2018;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import nl.han.ica.OOPDProcessingEngineHAN.Sound.Sound;

/**
 * Grote alien, subklasse van alien
 */
public class LargeAlien extends Alien {
	
	/**
	 * Constructor
	 * @param world			Referentie naar de hoofdmodule
	 * @param x				X-positie waarop de alien getekend wordt
	 * @param y				Y-positie waarop de alien getekend wordt
	 * @param alienKilled	Geluid wat de alien maakt als hij geraakt wordt
	 */
    public LargeAlien(SpaceInvaders world, float x, float y, Sound alienKilled) {
        super(new Sprite("nl/han/ica/SpaceInvaders2018/sprites/LargeAlien.png"), 2, x, y, 24, 18, world, alienKilled);
        this.valueIfHit = 10;
    }

}
