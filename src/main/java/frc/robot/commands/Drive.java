// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class Drive extends CommandBase {
  /** Creates a new Drive. */
  Drivetrain Drive;
  public Drive(Drivetrain mainDrive) {
    // Makes it so Drive needs to be working before ????
    // Use addRequirements() here to declare subsystem dependencies.
    Drive = mainDrive;
    addRequirements(Drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    Drive.stop();
    System.out.println("start Command");
    // Makes it stop
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    Drive.setLeftPower(0.2);
    Drive.setRightPower(-0.2);
    System.out.println("execute Command");
    // 0.1 is 10% percent power, makes it drive 10%
  }
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    System.out.println("End Command");
    Drive.stop();
    // Makes it stop
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    System.out.println("end command but i understand less");
    return false;
  }
}
