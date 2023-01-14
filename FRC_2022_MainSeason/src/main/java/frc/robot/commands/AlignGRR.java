package frc.robot.commands;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.controller.SimpleMotorFeedforward;
import edu.wpi.first.math.trajectory.constraint.DifferentialDriveVoltageConstraint;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Constants;
import frc.robot.subsystems.drivetrain.Drivetrain;
import frc.robot.util.GridAlign;
import frc.robot.util.SmarterDashboard;
import frc.robot.util.XboxController;

public class AlignGRR extends CommandBase {
    private final Drivetrain drivetrain;
    private final GridAlign align;
    private double z;
    private double x;

    public AlignGRR(XboxController controller) {
        this.drivetrain = new Drivetrain(controller);
        this.align = new GridAlign();
        this.x = this.align.x;
        this.z = this.align.z;


        SmartDashboard.putNumber("dZ", this.z);
        SmartDashboard.putNumber("dx", this.x);



    }


    @Override
    public void execute() {
//        var voltageConstraint = new DifferentialDriveVoltageConstraint(
//                new SimpleMotorFeedforward(
//                        Constants.Drivetrain.
//                )
//        )


    }
}
