package nl.han.ica.SpaceInvaders2018;

import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;
import nl.han.ica.OOPDProcessingEngineHAN.View.View;
import processing.core.PApplet;
import processing.core.PImage;
import java.util.ArrayList;

public class SpaceInvaders extends GameEngine {
    public static void main(String[] args) {
        PApplet.main(new String[]{"nl.han.ica.SpaceInvaders2018.SpaceInvaders"});
    }

    @Override
    public void setupGame() {
        createView(1280, 800);

        Cannon kanon= new Cannon(this);
        Alien alien1 = new SmallAlien(this);
        Alien alien2 = new MediumAlien(this);
        Alien alien3 = new MediumAlien(this);
        Alien alien4 = new LargeAlien(this);
        Alien alien5 = new LargeAlien(this);
        Ruimteschip schip = new Ruimteschip(this);

        addGameObject(kanon, 700, 700);
        addGameObject(schip, 850,100);
        addGameObject(alien1, 850,150);
        addGameObject(alien2, 850,180);
        addGameObject(alien3, 850,210);
        addGameObject(alien4, 850,240);
        addGameObject(alien5, 850,270);
    }

    @Override
    public void update() {

    }

    private void createView(int viewWidth, int viewHeight) {
        View view = new View(viewWidth, viewHeight);
        PImage backgroundImg = loadImage("nl/han/ica/SpaceInvaders2018/media/background-1280x800-2.jpg");
        view.setBackground(backgroundImg);

        size(viewWidth, viewHeight);
        setView(view);
    }
}
