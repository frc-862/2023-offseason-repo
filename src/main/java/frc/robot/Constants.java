// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;

     //assigns a variable to a port
    //TODO find out which port is right or left
<<<<<<< Updated upstream
    public final int motor0 = 0;
    public final int motor1 = 1;
    public final int motor2 = 2;
    public final int motor3 = 3;
    //TODO same as drivetrain(find what and where for victor)
    public final int powersetter = 4;
  }
    //assigns a variable to a port
    //TODO find out which port is right or left
    public final int motor0 = 0;
    public final int motor1 = 1;
    public final int motor2 = 2;
    public final int motor3 = 3;
    //TODO same as drivetrain(find what and where for victor)
    public final int powersetter = 4;
}
=======
    public  final static int motor0 = 0;
    public  final static int motor1 = 1;
    public  final static int motor2 = 2;
    public  final static int motor3 = 3;
    //TODO same as drivetrain(find what and where for victor)
    public final static double powersetter = RobotContainer.Flightsticks.getX();

  }
}
>>>>>>> Stashed changes
