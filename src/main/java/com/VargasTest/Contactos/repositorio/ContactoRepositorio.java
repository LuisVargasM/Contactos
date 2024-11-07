package com.VargasTest.Contactos.repositorio;

import com.VargasTest.Contactos.modelo.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepositorio extends JpaRepository<Contacto, Integer> {

}
