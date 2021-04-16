// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class Drive extends CommandBase {
  /** Creates a new Drive. */
  Drivetrain Drive;
  public Drive(Drivetrain mainDrive) {
    addRequirements(Drive);
    // Makes it so Drive needs to be working before ????
    // Use addRequirements() here to declare subsystem dependencies.
    Drive = mainDrive;

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    Drive.stop();
    // Makes it stop
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    Drive.setLeftPower(0.1);
    Drive.setRightPower(0.1);
    // 0.1 is 10% percent power, makes it drive 10%
  }
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    Drive.stop();
    // Makes it stop
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
