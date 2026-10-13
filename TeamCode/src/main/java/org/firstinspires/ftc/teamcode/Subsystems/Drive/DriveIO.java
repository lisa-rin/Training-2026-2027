public interface DriveIO {
    @AutoLog
    public static class DriveIOInputs {
        private double frontLeftVolts = 0;
        private double frontRightVolts = 0;
        private double backLeftVolts = 0;
        private double backRightVolts = 0;
    }

    public default void UpdateInputs(DriveIOInputs inputs) {}

    public default void RunVolts(double volts) {}

}