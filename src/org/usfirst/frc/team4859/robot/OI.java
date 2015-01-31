package org.usfirst.frc.team4859.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team4859.pneumatics.Inp1;
import org.usfirst.frc.team4859.pneumatics.Outp1;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	static Joystick stick = new Joystick(0);
	Joystick xbox = new Joystick(1);
	Button in = new JoystickButton(stick, 11);
	Button out = new JoystickButton(stick, 12);
	
	public OI(){
		stick = new Joystick(0);
		out.whenPressed(new Outp1());
		in.whenPressed(new Inp1());
		
		
		//(new JoystickButton(stick, Joystick.ButtonType.kTop.value)).whenPressed(new DriveInASquare());
//        intakeButton = new JoystickButton(stick,1);
//        intakeButton.whenPressed(new AcquirerIn());
//        intakeButton.whenReleased(new AcquirerStop());
//        outtakeButton = new JoystickButton(stick,2);
//        outtakeButton.whenPressed(new AcquirerOut());
//        outtakeButton.whenReleased(new AcquirerStop());
//        (new JoystickButton(xbox, 6)).whenPressed(new Lift());       
//        shotButton = new JoystickButton(xbox,1);
//        shotButton.whenPressed(new ShooterShot());
//        shotButton.whenReleased(new ShooterStop());
//        reverseButton = new JoystickButton(xbox,5);
//        reverseButton.whenPressed(new ShooterReverse());
//        reverseButton.whenReleased(new ShooterStop());
	}
	public static Joystick getJoystick(){
        return stick;
    }
}