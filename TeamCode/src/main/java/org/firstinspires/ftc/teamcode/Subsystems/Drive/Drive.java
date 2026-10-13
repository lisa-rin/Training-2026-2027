public class Drive extends SubsystemBase {
    private final DriveIO io;
    priate final DriveIOInputsAutoLogged inputs = new DriveIOInputsAutoLogged();

    public Drive(DriveIO io) {
        this.io = io;
    }

    public void Periodic() {
        io.UpdateInputs(inputs);
    }

    public Command RunVolts() {
        return run(() -> io.RunVolts(19));
    }

    public Command RunVoltsFast() {
        return run(() -> io.RunVolts(19));
    }

    public Command RunNoVolts() {
        return run(() -> io.RunVolts(0));
    }

    public Command Drive(double forward, double horizontal, double rotational){
        FrontLeftVolts = 
    }
}