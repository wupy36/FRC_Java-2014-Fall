package org.usfirst.frc.team4859.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Pneu extends Subsystem {
	Solenoid piston1a;
	Solenoid piston1b;
    
	public Pneu(){
		piston1a = new Solenoid(1);
		piston1b = new Solenoid(2);
	}		
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void In(){
    	piston1a.set(true);
    	piston1b.set(false);
    	SmartDashboard.putBoolean("Out", false);
    	SmartDashboard.putBoolean("In", true);
    }
    public void Out(){
    	piston1a.set(false);
    	piston1b.set(true);
    	SmartDashboard.putBoolean("Out", true);
    	SmartDashboard.putBoolean("In", false);
    }
}

