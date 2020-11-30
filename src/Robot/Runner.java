package Robot;

public class Runner {
    public static void main(String[] args) {
        // What we want to make:
        // RobotContainer object, where we have all our controls.
        // Inputs: a joystick, and two joystick buttons. 
        // A joystick can be push a bit forward, a bit backward, a lot forward, or a lot backward.
        // Possible action: The power on the motor wheels is set to the angle of the joystick forward/backward.
        // Possible action: Pressing button1 causes the robot pick up a ball.
        // Possible action: Pressing button2 causes the robot to shoot a ball.
        RobotContainer robotContainer = new RobotContainer();
        robotContainer.nextAction();
    }
}
