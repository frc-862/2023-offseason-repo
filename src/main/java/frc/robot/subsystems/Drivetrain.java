package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import frc.robot.Constants.OperatorConstants;
import edu.wpi.first.wpilibj.drive.RobotDriveBase;


public class Drivetrain extends SubsystemBase {

        static Talon talonmotor0 = new Talon(OperatorConstants.motor0);
        static Talon talonmotor1 = new Talon(OperatorConstants.motor1);
        static Talon talonmotor2 = new Talon(OperatorConstants.motor2);
        static Talon talonmotor3 = new Talon(OperatorConstants.motor3);
        public static double FlyX = new Joystick(0).getX();
        public static double FlyY = new Joystick(0).getY();
        static RobotDrive chassisM = new RobotDrive();
    public Drivetrain(){
       //Sets talons to rio port
        
        //Sets the victor to the rio port 
        //TODO find out what we use to set power and what port
        VictorSP victor = new VictorSP(1); 
        victor.set(RobotContainer.Flightsticks.getY());

    }
    public static void drive(double FlyX, double FlyY){
        chassisM.RobotDriveBase(talonmotor0,talonmotor1,talonmotor2,talonmotor3);
    }

public void periodic(){

}
}
