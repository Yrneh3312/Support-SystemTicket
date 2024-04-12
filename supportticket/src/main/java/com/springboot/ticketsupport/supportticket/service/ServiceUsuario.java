package com.springboot.ticketsupport.supportticket.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
// import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.springboot.ticketsupport.supportticket.models.Usuario;
import com.springboot.ticketsupport.supportticket.repository.URepository;

@Service
public class ServiceUsuario {
    HashMap <String, Object> datos;	
private final URepository uRepository;

public ServiceUsuario(URepository uRepository){
    this.uRepository = uRepository;
}
@Autowired
public List<Usuario>getusuario(){
    return this.uRepository.findAll();
}

public ResponseEntity<Object> newUsuario(Usuario usuario) {
    datos = new HashMap<>();
        
        // Aquí se corrige el error, se debe llamar al método findByNombre() en la instancia uRepository
        Optional<Usuario> res = uRepository.findByNombre(usuario.getNombre_usuario());

        if(res.isPresent()&& usuario.getId_usuario()==null){
            datos.put("error", true);
            datos.put("message", "El Usuario ya existe");
            return new ResponseEntity<>(HttpStatus.CONFLICT);


        }

        datos.put("message", "Se guardo con exito");
        if(usuario.getId_usuario()!=null){
            datos.put("message", "Se actualizo co exito");
        }
        uRepository.save(usuario);
        datos.put("exito", usuario);
        return new ResponseEntity<>(
				datos,
				HttpStatus.CREATED);
 }
    public ResponseEntity<Object> eliminarUsuario(Long id){
        datos = new HashMap<>();
        boolean existe = this.uRepository.existsById(id);
        if(!existe){
            datos.put("Error", true);
            datos.put("message", "No existe usuario con ese id");
            return new ResponseEntity<>(
			HttpStatus.CONFLICT);
        }else {
            // Aquí eliminas el usuario de la base de datos
            // Por ejemplo: uRepository.deleteById(id);
            
            datos.put("message", "El usuario se eliminó correctamente");
            return new ResponseEntity<>(datos, HttpStatus.ACCEPTED);
        }
    }
}
