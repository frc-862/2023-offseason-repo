package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain {
    public Drivetrain(){
       
       Constants constant = new Constants();
       //Sets talons to rio port
        Talon talonmotor0 = new Talon(constant.motor0);
        Talon talonmotor1 = new Talon(constant.motor1);
        Talon talonmotor2 = new Talon(constant.motor2);
        Talon talonmotor3 = new Talon(constant.motor3);
        //Sets the victor to the rio port 
        //TODO find out what we use to set power and what port
        VictorSP victor = new VictorSP(constant.powersetter); 
        //TODO make sure this speed deosnt kill anyone (between -1 and 1)
        victor.set(0.6);

    }
public void periodic(){

}
}
