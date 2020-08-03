package com.company.enums;

public enum Status {
    PLATINADO("platinado"), NAO_INICIADO("não iniciado"),TERMINADO("terminado"), JOGANDO("jogando");

    private String display;
    Status(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return display;
    }
}