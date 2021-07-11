package pattern12.duck_sys_v2;

public class GooseAdapter implements Quack {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quake() {
        this.goose.honk();
    }
    
}
