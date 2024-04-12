package com.springboot.ticketsupport.supportticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.ticketsupport.supportticket.models.ticket;

@Repository
public interface TRepository  extends JpaRepository <ticket, Long>{


}
