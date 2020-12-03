package Robot;

import java.util.Scanner;


public class RobotContainer {
    Joystick joystick = new Joystick();
    Button1 button = new Button1();
    Button2 button2 = new Button2();
    Scanner input = new Scanner(System.in);
    // Create two button objects

    public RobotContainer() {}


    public void resultOfAction() {
            System.out.println();
            System.out.println("-----------------------");
            // Button1: picks up target
            if (action.equals("button1")) {
                System.out.println("The robot picks up targeted object.");
            } else if (action.equals("button2")) {
                System.out.println("The robot shoots out a ball.");
            } else if (action.equals("joystick")) {
                if (joystick.angle == 0.0) {
                    System.out.println("The robot is not moving.");
                } else if (joystick.angle > 0) {
                    System.out.println("The Robot is moving forward with a power of " + joystick.angle);
                } else {
                    System.out.println("The Robot is moving backward with a power of " + (-1.0 * joystick.angle));
                }
            } else {
                System.out.println("No action is executed.");
            }
            System.out.println("-----------------------");
            System.out.println();
    }

    public String action;
    public String decision;
    public void nextAction() {
        

        boolean running = true;
        while (running) {
            System.out.println("Please enter an input. Inputs are joystick, button1, button2, quit.");
            System.out.println("What action should the robot do?");

            action = input.nextLine();

            if (action.equals("button1")) {
                System.out.println();
                System.out.println("Do you wish to hold the button?");
                decision = input.nextLine();
                if (decision.equals("Yes")) {
                    button.button1(true);
                    System.out.println("If you wish to release the button, enter \"release\".");
                    decision = input.nextLine();
                    if (decision.equals("release")) {
                        button.button1(false);
                    }
                } else{
                    button.button1(true);
                    button.button1(false);
                }
            } else if (action.equals("button2")) {
                System.out.println();
                System.out.println("Do you wish to hold the button?");
                String decision = input.nextLine();
                if (decision.equals("Yes")) {
                    button2.button2(true);
                    System.out.println();
                    System.out.println("If you wish to release the button, enter \"release\".");
                    decision = input.nextLine();
                    if (decision.equals("release")) {
                        button2.button2(false);
                    }
                } else{
                    button2.button2(true);
                    button2.button2(false);
                }
            } else if (action.equals("joystick")) {
                System.out.println("Enter an angle from -1.0 to 1.0.");
                double angle = input.nextDouble();
                input.nextLine();
                joystick.angle = angle;
            } else if (action.equals("quit")) {
                running = false;
            } else {
                System.out.println("Sorry, I didn't understand that, please try again.");
            }

            resultOfAction();
        }

        System.out.println("Robot is off.");
    }
}