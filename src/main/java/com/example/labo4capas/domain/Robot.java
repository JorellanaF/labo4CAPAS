package com.example.labo4capas.domain;

import javax.validation.constraints.AssertTrue;

public class Robot {

    @AssertTrue(message = "UPS no puedes agregar tu producto por que eres un robot, favor hacer click en ingresar")
    private Boolean soyRobot;

    public Boolean getSoyRobot() {
        return soyRobot;
    }

    public void setSoyRobot(Boolean soyRobot) {
        this.soyRobot = soyRobot;
    }
}
