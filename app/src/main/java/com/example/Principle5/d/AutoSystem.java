package com.example.Principle5.d;

public class AutoSystem {

    private ICar icar;

    public AutoSystem(ICar icar) {
        this.icar = icar;
    }

    public void RunCar() {
        icar.Run();
    }

    public void TurnCar() {
        icar.Turn();
    }

    public void StopCar() {
        icar.Stop();
    }
}