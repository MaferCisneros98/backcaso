/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Caso1Backend.back.util;


import com.Caso1Backend.back.security.enums.RolNombre;
import com.Caso1Backend.back.security.models.Rol;
import com.Caso1Backend.back.security.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author LENOVO
 */
@Component
public class CreateRoles implements CommandLineRunner {

    @Autowired
    RolService rolService;

    @Override
    public void run(String... args) throws Exception {
        Rol rolTaller = new Rol(RolNombre.ROLE_TALLER);
        Rol rolConcesionaria = new Rol(RolNombre.ROLE_CONCESONARIA);
        Rol rolComercializadora = new Rol(RolNombre.ROLE_COMERCIALIZADORA);
        Rol rolCliente=new Rol(RolNombre.ROL_CLIENTE);
        Rol rolAdmin = new Rol(RolNombre.ROL_ADMIN);

//        rolService.save(rolTaller);
//        rolService.save(rolConcesionaria);
//        rolService.save(rolComercializadora);
//        rolService.save(rolCliente);
//        rolService.save(rolAdmin);
    }
}
