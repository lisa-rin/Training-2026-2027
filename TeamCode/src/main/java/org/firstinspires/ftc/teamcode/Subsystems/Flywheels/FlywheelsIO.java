public interface FlywheelsIO {
    @AutoLog
    public static class FlywheelsIOInputs {
        public double TopFlywheelVolts;
        public double BottomFlywheelVolts;
    }

    public default void UpdateInputs(FlywheelsIOInputs inputs) {}

    public default void RunVolts(double volts) {}

}