package Robot;

public class Button {
    // should have a constructor and a boolean pressed
    public boolean button1Pressed;
    public boolean button2Pressed;

    public Button() {
        button1Pressed = false;
        button2Pressed = false;
    }

    public void button1(boolean pressed) {
        if (pressed == true) {
            button1Pressed = true;
        }
    }
    public void button2(boolean pressed) {
        if (pressed == true) {
            button2Pressed = true;
        }
    }

}
