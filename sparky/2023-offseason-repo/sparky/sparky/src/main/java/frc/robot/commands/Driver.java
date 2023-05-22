package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class Driver extends CommandBase {
    Drivetrain drivetrain;
    DoubleSupplier leftPower;
    DoubleSupplier rightPower;

    public Driver(Drivetrain drivetrain, DoubleSupplier leftJoystick, DoubleSupplier rightJoystick) {
        this.drivetrain = drivetrain;
        this.leftPower = leftJoystick;
        this.rightPower = rightJoystick;

        addRequirements(drivetrain);
    }

    @Override
    public void execute() {
        drivetrain.Drive(leftPower.getAsDouble(), rightPower.getAsDouble());
    }

    @Override
    public void end(boolean interrupted) {
        drivetrain.stop();
    }

    @Override
    public boolean isFinished() {
        return false;
    }

}
