package com.VargasTest.Contactos.servicio;

import com.VargasTest.Contactos.modelo.Contacto;

import java.util.List;

public interface iContactoServicio {
    public List<Contacto> listarContacto();

    public Contacto buscarContactoPorId(Integer idContacto);

    public void guardarContacto(Contacto contacto);

    public void eliminarContacto(Contacto contacto);

}
