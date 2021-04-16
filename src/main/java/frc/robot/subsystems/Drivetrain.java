/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


/**
 * Add your docs here.
 */
public class Drivetrain extends SubsystemBase {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public CANSparkMax leftMotor1, rightMotor1, leftMotor2, rightMotor2, leftMotor3, rightMotor3;
  // This will set up the motors


  public Drivetrain(){
    leftMotor1 = new CANSparkMax(30, MotorType.kBrushless);
    rightMotor1 = new CANSparkMax(20, MotorType.kBrushless);
    leftMotor2 = new CANSparkMax(31, MotorType.kBrushless);
    rightMotor2 = new CANSparkMax(21, MotorType.kBrushless);
    leftMotor3 = new CANSparkMax(32, MotorType.kBrushless);
    rightMotor3 = new CANSparkMax(22, MotorType.kBrushless);
    // This will set up the motors, with their number 
    
    leftMotor2.follow(leftMotor1);
    leftMotor3.follow(leftMotor1);
    rightMotor2.follow(rightMotor1);
    rightMotor3.follow(rightMotor1);
    // This will make the all of the left motors follow leftMotor1 and the same with the right
    // Basically makes leftMotor1 leader of the leftMotors
  }

  public void setLeftPower(double power) {
    leftMotor1.set(power);
    // This makes it drive
  }

  public void setRightPower(double power) {
    rightMotor1.set(power);
    // This makes it drive
  }
  public void stop() {
    leftMotor1.set(0);
    rightMotor1.set(0);
    // Makes the robot stop
  }
  
}
