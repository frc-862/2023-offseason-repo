package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import frc.robot.Constants.OperatorConstants;

public class Drivetrain extends SubsystemBase {

        Talon talonmotor0 = new Talon(OperatorConstants.motor0);
        Talon talonmotor1 = new Talon(OperatorConstants.motor1);
        Talon talonmotor2 = new Talon(OperatorConstants.motor2);
        Talon talonmotor3 = new Talon(OperatorConstants.motor3);
    public Drivetrain(){
       //Sets talons to rio port
        
        //Sets the victor to the rio port 
        //TODO find out what we use to set power and what port
        VictorSP victor = new VictorSP(1); 
        //TODO make sure this speed deosnt kill anyone (between -1 and 1)
        victor.set(RobotContainer.Flightsticks.getX());

    }
public void periodic(){

}
}
