package frc.robot.commands;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class GyroZero extends CommandBase {
    public AHRS gyro;
    public GyroZero() {
        this.gyro= new AHRS();

        
    

        this.gyro.reset();
    }


    @Override
    public void execute() {
        SmartDashboard.putNumber("gyro-heading", this.gyro.getYaw());
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}
