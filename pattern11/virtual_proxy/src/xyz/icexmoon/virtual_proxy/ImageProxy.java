package xyz.icexmoon.virtual_proxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageProxy implements Icon {
    private ImageIcon imageIcon;
    private boolean initImage = false;
    private URL imageURL;
    public static final int DEFAULT_WIDTH = 800;
    public static final int DEFAULT_HEIGHT = 600;

    public ImageProxy(URL imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public int getIconHeight() {
        if (imageIcon == null) {
            return DEFAULT_HEIGHT;
        } else {
            return imageIcon.getIconHeight();
        }
    }

    @Override
    public int getIconWidth() {
        if (imageIcon == null) {
            return DEFAULT_WIDTH;
        } else {
            return imageIcon.getIconWidth();
        }
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading image, please wait...", x + 300, y + 190);
            if (!initImage) {
                initImage = true;
                Thread initImageThread = new Thread(new Runnable() {

                    @Override
                    public void run() {
                        try {
                            imageIcon = new ImageIcon(imageURL, "image");
                            c.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                });
                initImageThread.start();
            }
        }
    }

}
