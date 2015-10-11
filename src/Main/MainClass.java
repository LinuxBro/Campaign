/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Candidate.*;
import Frame.*;

import java.net.MalformedURLException;
import java.util.*;
import Cards.*;
import MapView.MapView;
import Territories.*;
import javax.swing.JFrame;

/**
 *
 * @author airking
 */
public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        NewApplication newApp = new NewApplication();
        Frame f = new Frame();
        MapView m;
        m = new MapView();
        JFrame map = new JFrame();
        map.setSize(800, 600);
        map.add(m);


        ArrayList<Candidate> candidates = new ArrayList<Candidate>();
        candidates.add(new Candidate("Player 1", 0, 1));
        candidates.add(new Candidate("Player 2", 0, 2));
        candidates.add(new Candidate("Player 3", 0, 3));
        candidates.add(new Candidate("Player 4", 0, 4));
        System.out.println(Arrays.toString(candidates.get(0).getHand()));
        try {
            candidates.get(0).addCard(new BuffSelf(null, null, 0, 0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Arrays.toString(candidates.get(0).getHand()));

        do {
            newApp.setVisible(true);
            Thread t = Thread.currentThread();
            try {
                t.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        } while (newApp.isVisible());
        f.setBounds(0, 0, 1600, 1000);
        f.setVisible(true);
        map.setUndecorated(true);
        Thread t = Thread.currentThread();
        Runnable r = () -> {
          while (true)  {
            int xmap;
            int ymap;
            xmap = f.getLocationOnScreen().x;
            ymap = f.getLocationOnScreen().y;
            System.out.println(xmap + " " + ymap);
            map.setBounds(xmap+800, ymap+140, 800, 600);}
        };

        new Thread(r).start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException up) {
            throw up;
        }
        map.setBounds(800, 140, 800, 600);
        map.setVisible(true);
        map.setAlwaysOnTop(true);

        Game game = new Game(candidates);

        while (game.isOver()) {

        }
    }

}
