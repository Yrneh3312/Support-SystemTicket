package com.springboot.ticketsupport.supportticket.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ticket")
public class ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_ticket;

    @Column(name = "id_usuario")
    private long id_usuario;

    private String tipo_t;

    private String tipo_e;

    private LocalDate fecha_cn;

    private long id_estado;

    public ticket(){
        
    }

    public ticket(long id_ticket, long id_usuario, String tipo_t, String tipo_e, LocalDate fecha_cn, long id_estado) {
        super();
        this.id_ticket = id_ticket;
        this.id_usuario = id_usuario;
        this.tipo_t = tipo_t;
        this.tipo_e = tipo_e;
        this.fecha_cn = fecha_cn;
        this.id_estado = id_estado;
    }

    public ticket( long id_usuario, String tipo_t, String tipo_e, LocalDate fecha_cn, long id_estado) {
        super();
        this.id_usuario = id_usuario;
        this.tipo_t = tipo_t;
        this.tipo_e = tipo_e;
        this.fecha_cn = fecha_cn;
        this.id_estado = id_estado;
    }

   


    public long getId_ticket() {
        return this.id_ticket;
    }

    public void setId_ticket(long id_ticket) {
        this.id_ticket = id_ticket;
    }

    public long getId_usuario() {
        return this.id_usuario;
    }

    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getTipo_t() {
        return this.tipo_t;
    }

    public void setTipo_t(String tipo_t) {
        this.tipo_t = tipo_t;
    }

    public String getTipo_e() {
        return this.tipo_e;
    }

    public void setTipo_e(String tipo_e) {
        this.tipo_e = tipo_e;
    }

    public LocalDate getFecha_cn() {
        return this.fecha_cn;
    }

    public void setFecha_cn(LocalDate fecha_cn) {
        this.fecha_cn = fecha_cn;
    }

    public long getId_estado() {
        return this.id_estado;
    }

    public void setId_estado(long id_estado) {
        this.id_estado = id_estado;
    }

}
