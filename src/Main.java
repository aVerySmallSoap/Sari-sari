import UI.Interfaces.UserInterface;
import UI.mainUI;
import com.formdev.flatlaf.FlatLightLaf;

public class Main {
    static UserInterface UI = new mainUI();
    public static void main(String[] args) {
        FlatLightLaf.setup();
        UI.Run();
    }
}
