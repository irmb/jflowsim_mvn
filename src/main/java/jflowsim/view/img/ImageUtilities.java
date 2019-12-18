package jflowsim.view.img;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageUtilities {

    public static URL getImageFile(String filename) {
        String[] fileType = {"png", "gif", "jpg", "jpeg"};

        for (int i = 0; i < fileType.length; i++) {
            URL url = ImageUtilities.class.getResource("/img/" + filename + "." + fileType[i]);
            if (url != null) {
                return url;
            }
        }
        return null;
    }

    public static ImageIcon createImageIcon(String filename, int w, int h) {
        URL url = getImageFile(filename);
        if (url == null)
            return null;
        ImageIcon icon = new ImageIcon(url);
        Image image = icon.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }

    public static ImageIcon createImageIcon(String filename) {
        URL url = getImageFile(filename);
        if (url == null)
            return null;
        return new ImageIcon(url);
    }
}
