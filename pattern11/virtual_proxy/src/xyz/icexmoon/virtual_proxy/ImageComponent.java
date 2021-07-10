package xyz.icexmoon.virtual_proxy;

import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JComponent;

public class ImageComponent extends JComponent {
    private Icon icon;

    public ImageComponent(Icon icon) {
        this.icon = icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = icon.getIconWidth();
        int height = icon.getIconHeight();
        int x = (ImageProxy.DEFAULT_WIDTH - width) / 2;
        int y = (ImageProxy.DEFAULT_HEIGHT - height) / 2;
        icon.paintIcon(this, g, x, y);
    }

}
