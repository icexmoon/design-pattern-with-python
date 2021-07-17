import xyz.icexmoon.beat_tool.control.BeatController;
import xyz.icexmoon.beat_tool.control.ControllerInterface;
import xyz.icexmoon.beat_tool.model.BeatModel2;
import xyz.icexmoon.beat_tool.model.BeatModelInterface;

public class App {
    public static void main(String[] args) throws Exception {
        BeatModelInterface model = new BeatModel2();
        ControllerInterface controller = new BeatController(model);
    }
}
