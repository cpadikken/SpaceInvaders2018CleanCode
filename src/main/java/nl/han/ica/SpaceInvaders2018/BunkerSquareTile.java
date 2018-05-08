package nl.han.ica.SpaceInvaders2018;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;

public class BunkerSquareTile extends BunkerTile {
	
	private Sprite sprite3;
	private Sprite sprite2;
	private Sprite sprite1;
	
    public BunkerSquareTile(Sprite sprite) {
        super(sprite);
        sprite3 = new Sprite("src/main/java/nl/han/ica/SpaceInvaders2018/sprites/BunkerTile1_3hp.png");
        sprite2 = new Sprite("src/main/java/nl/han/ica/SpaceInvaders2018/sprites/BunkerTile1_2hp.png");
        sprite1 = new Sprite("src/main/java/nl/han/ica/SpaceInvaders2018/sprites/BunkerTile1_1hp.png");
    }
    
    @Override
    public void swapSprite() {
    	if(hitPoints == 3) {
    		setSprite(sprite3);
    	}
    	else if(hitPoints == 2) {
    		setSprite(sprite2);
    	}
    	else if(hitPoints == 1) {
    		setSprite(sprite1);
    	}
    }
}