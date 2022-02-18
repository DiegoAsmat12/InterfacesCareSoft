package com.caresoft.clinicapp;

public interface UsuarioCompatibleConHIPPA {
	abstract boolean assignPin(int pin);
    abstract boolean accessAuthorized(Integer confirmedAuthID);
}
