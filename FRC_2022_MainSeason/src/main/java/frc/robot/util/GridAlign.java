package frc.robot.util;

import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;



public class GridAlign {
    private final NetworkTable table;
    private final AHRS gyro;
/*
    Not used
    private final NetworkTableEntry tx;
    private final NetworkTableEntry tv;
    private final NetworkTableEntry ty;
    private final NetworkTableEntry ta;

    */
 private final NetworkTableEntry llpython;

    public final double[] values;

    // accessible values
    public double z;
    public double x;



    public GridAlign() {
        this.table = NetworkTableInstance.getDefault().getTable("limelight");
        /*
        this.tx = this.table.getEntry("tx");
        this.ty = this.table.getEntry("ty");
        this.ta = this.table.getEntry("ta");

        this.tv = this.table.getEntry("tv");
        */

        this.llpython = this.table.getEntry("llpython");


        this.gyro = new AHRS();

        SmartDashboard.putNumber("w-const", 1);
        // sending values to limelight
        this.table.getEntry("llrobot").setNumberArray(new Number[]{
                this.gyro.getYaw(), SmartDashboard.getNumber("w-const", 1), 0
        });

        this.values = this.llpython.getDoubleArray(new double[]{});

        this.z = this.values[0];
        this.x = this.values[1];

        this.gyro.reset();

    }
}