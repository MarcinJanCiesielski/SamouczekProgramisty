package com.marcinjc.interfacey;

public interface MicrowaveOven {
    void start();

    void setDuration(int durationInSeconds);

    boolean isFinished();

    void setPower(int power);

    default String getName() {
        return "MicrovaweOwen";
    }
}
