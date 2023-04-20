package UI.Custom.Fonts;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
public class FontRegistry {
    //TODO:Automate
    static GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();

    public static void registerRequiredFonts(){
        try{
            Font segUI = Font.createFont(Font.TRUETYPE_FONT, loadFont("/UI/Custom/Fonts/Segoe UI.ttf"));
            Font segoeb = Font.createFont(Font.TRUETYPE_FONT, loadFont("/UI/Custom/Fonts/Segoe UI Bold.ttf"));
            Font segoebi = Font.createFont(Font.TRUETYPE_FONT, loadFont("/UI/Custom/Fonts/Segoe UI Bold Italic.ttf"));
            Font segoei = Font.createFont(Font.TRUETYPE_FONT, loadFont("/UI/Custom/Fonts/Segoe UI Italic.ttf"));
            graphicsEnvironment.registerFont(segUI);
            graphicsEnvironment.registerFont(segoeb);
            graphicsEnvironment.registerFont(segoebi);
            graphicsEnvironment.registerFont(segoei);
        } catch (IOException | FontFormatException e) {
            throw new RuntimeException(e);
        }
    }

    private static InputStream loadFont(String path){
        return FontRegistry.class.getResourceAsStream(path);
    }
}
