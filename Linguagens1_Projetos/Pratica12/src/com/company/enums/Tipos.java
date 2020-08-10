package com.company.enums;

public class Tipos {
    JORNAL("jornal"),
    GIBI("gibis"),
    REVISTA("revista");

    private String display;
    Tipos(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return display;
    }
}
