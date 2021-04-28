// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import frc.robot.RobotContainer;


public class Drive extends CommandBase {
  /** Creates a new Drive. */
  Drivetrain Drive;
  XboxController NewController;
  public Drive(Drivetrain mainDrive, XboxController Controller) {
    // Makes it so Drive needs to be working before ????
    // Use addRequirements() here to declare subsystem dependencies.
    Drive = mainDrive;
    addRequirements(Drive);
    NewController = Controller;

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    Drive.stop();
    System.out.println("start Command");
    // Makes it stop
  }

  // Called every time the scheduler runs while the command is scheduled.
  // Called once per call to CommandScheduler.getInstance().run()
  @Override
  public void execute() {
    
    //NewController.getY(Hand.kLeft); 
    double RightXValue = NewController.getX(Hand.kRight);
    double RightXValueDivided = RightXValue / 4;

    Drive.setLeftPower(0.25 + RightXValueDivided);
    Drive.setRightPower(0.25 - RightXValueDivided);
    
    // 0.1 is 10% percent power, makes it drive 10%
  }

  @Override
  public void end(boolean interrupted) {
    System.out.println("End Command");
    Drive.stop();
    // Makes it stop
    // Called once the command ends or is interrupted.
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    System.out.println("end command but i understand less");
    return false;
  }
}
