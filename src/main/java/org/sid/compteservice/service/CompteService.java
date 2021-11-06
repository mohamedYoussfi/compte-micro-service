package org.sid.compteservice.service;

public interface CompteService {
    void virement(Long codeSource,Long codeDestination, double montant);
}
