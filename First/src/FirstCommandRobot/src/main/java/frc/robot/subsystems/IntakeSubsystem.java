// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.


package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.intakeConstants;

public class IntakeSubsystem extends SubsystemBase {
  private IntakeSubsystem() {
    this.solenoid =  new Solenoid(PneumaticsModuleType.CTREPCM, intakeConstants.KMotorID);
    this.motor = new TalonFX(intakeConstants.KMotorID);
  }
  
  public static IntakeSubsystem instance;
  
  public static IntakeSubsystem getInstance() {
    if(instance == null) {
      instance = new IntakeSubsystem();
    }
    return instance;
  }
  
  private Solenoid solenoid;
  private TalonFX motor;
  

  
  public void setSolenoid(boolean value) {
    this.solenoid.set(value);
  }
  
  public void setMotor(double speed) {
    this.motor.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
