package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
    private Victor leftMoter;
    private Victor rightMoter;

    public Drivetrain() {
        leftMoter = new Victor(0);
        rightMoter = new Victor(1);

        leftMoter.setInverted(true);
        rightMoter.setInverted(false);
    }

    public void Drive(double leftPower, double rightPower) {
        // not sure if these are needed
        leftPower *= 0.5;
        rightPower *= 0.5;
        leftMoter.set(leftPower);
        rightMoter.set(rightPower);
    }

    public void stop() {
        leftMoter.set(0d);
        rightMoter.set(0d);
    }
}
