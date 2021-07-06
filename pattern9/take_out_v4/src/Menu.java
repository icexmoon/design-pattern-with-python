package pattern9.take_out_v4.src;

public class Menu extends Node {
    private String name;

    public Menu(String name) {
        this.name = name;
    }

    public void addMenuItem(MenuItem menuItem) {
        this.addChild(menuItem);
    }

    @Override
    public String toString() {
        return "This is a " + this.name + " menu:";
    }
}
