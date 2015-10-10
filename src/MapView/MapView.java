package MapView;
import java.awt.BorderLayout;

import java.io.File;
import java.net.MalformedURLException;
import javax.swing.JPanel;

import com.sun.javafx.application.PlatformImpl;

import javafx.embed.swing.JFXPanel;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView; 
 
public class MapView extends JPanel{
	private JFXPanel jfxPanel; 
	
    public MapView(){
    	initComponents();
    }
      
    private void initComponents(){ 
        jfxPanel = new JFXPanel();  
 
        // Create the JavaFX Scene
        createScene();  
          
        setLayout(new BorderLayout());  
        add(jfxPanel, BorderLayout.CENTER);  
          
    }     
      
    private void createScene() {  
        // The Scene needs to be created on "FX user thread", NOT on the 
        // AWT Event Thread 
        PlatformImpl.startup(
            new Runnable() {
                public void run() {
                	Browser b = new Browser();
                    Scene scene = new Scene(b, 80, 20);  
                    jfxPanel.setScene(scene);  
                }  
            });  
    }     

}
class Browser extends Region {
 
    final WebView browser = new WebView();
    final WebEngine webEngine = browser.getEngine();
     
    public Browser() {
        //apply the styles
        getStyleClass().add("browser");
        // load the web page
        
        File page = new File("html/US_MAP/usa.html");        
        try{
        webEngine.load(page.toURI().toURL().toString());
        } catch (MalformedURLException e){
        	System.out.println(e.getMessage());
        }
        //add the web view to the scene
        getChildren().add(browser);
 
    }

 
    @Override 
    protected void layoutChildren() {
        double w = getWidth();
        double h = getHeight();
        layoutInArea(browser,0,0,w,h,0, HPos.CENTER, VPos.CENTER);
    }
 
    @Override protected double computePrefWidth(double height) {
        return 800;
    }
 
    @Override protected double computePrefHeight(double width) {
        return 600;
    }
}