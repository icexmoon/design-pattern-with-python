package xyz.icexmoon.virtual_proxy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main {
    private JFrame frame;
    private ImageComponent imageComponent;
    public static void main(String[] args) {
        Main main = new Main();
        main.initJFrame();
    }

    private void initJFrame(){
        Hashtable<String,String> urls = new Hashtable<String,String>();
        urls.put("image1", "https://icexmoon-public-1305291391.cos.ap-shanghai.myqcloud.com/image/5fa398772c60be4020d1436289df4f91f1dd7d58_5fa398774f632bb5ae534ec09829cb6c0e631f47.jpg");
        urls.put("image2", "https://icexmoon-public-1305291391.cos.ap-shanghai.myqcloud.com/image/5fb0ceb56b992a683cb84457b0261a2d5f2cbf73_5fb0ceb5210ca7cc093a4f9ba36fd5c4ce63f688.jpg");
        urls.put("image3", "https://icexmoon-public-1305291391.cos.ap-shanghai.myqcloud.com/image/5fb2655575eaa787d2d443fb991df7ba62f4f1a7_5fb2655561092198c80549bf9b7f493bc9efd81e.jpg");
        urls.put("image4", "https://icexmoon-public-1305291391.cos.ap-shanghai.myqcloud.com/image/5fb27ed1a64404709dda47d38357afbfd786589f_5fb27ed1429793c8cdf64720819132e873b84396.jpg");
        urls.put("image5", "https://icexmoon-public-1305291391.cos.ap-shanghai.myqcloud.com/image/5fb3cea357bd79a6e33e4f429aa35ef0c6843fe4_5fb3cea3d7b9059638444161a5a847480bddbd6f.jpg");
        frame = new JFrame("Web Image Viewer");
        JMenuBar menubar = new JMenuBar();
        JMenu menu = new JMenu("images");
        menubar.add(menu);
        frame.setJMenuBar(menubar);
        URL defaultImageURL = null;
        try {
            defaultImageURL = new URL(urls.get("image1"));
        } catch (MalformedURLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        imageComponent = new ImageComponent(new ImageProxy(defaultImageURL));
        frame.getContentPane().add(imageComponent);
        for (Enumeration<String> e = urls.keys();e.hasMoreElements();) {
            String name = e.nextElement();
            URL url = getURLbyName(urls, name);
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(new ActionListener(){
                
                @Override
                public void actionPerformed(ActionEvent e) {
                    imageComponent.setIcon(new ImageProxy(url));
                    frame.repaint();
                }
                
            });
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(ImageProxy.DEFAULT_WIDTH, ImageProxy.DEFAULT_HEIGHT);
        frame.setVisible(true);
    }

    public static URL getURLbyName(Hashtable<String, String> urls, String name) {
        URL url = null;
        try {
            url = new URL(urls.get(name));
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return url;
    }
}
