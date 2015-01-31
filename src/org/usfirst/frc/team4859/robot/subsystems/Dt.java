
package org.usfirst.frc.team4859.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.FeedbackDevice;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Dt extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	static CANTalon m1 = new CANTalon(13);
	static CANTalon m2  = new CANTalon(15);

	static RobotDrive drive = new RobotDrive(m1, m2);
	

	public void initDefaultCommand() {
        setDefaultCommand(new org.usfirst.frc.team4859.robot.commands.DriveWithJoystick());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
		SmartDashboard.putDouble("Velocity", m1.getEncVelocity());

	}
	public void straight(){
		drive.arcadeDrive(1.0, 0.0);
	}
	public void stop(){
		drive.arcadeDrive(0.0, 0.0);
	}
	public static void driveWithJoystick(Joystick stick){
		drive.arcadeDrive(stick);
		
		double m01 = SmartDashboard.getDouble("Velocity");
		SmartDashboard.putDouble("V1", m01);
		m1.set(m01);
		SmartDashboard.putDouble("V01", m1.getEncVelocity());
		
	 }
}

