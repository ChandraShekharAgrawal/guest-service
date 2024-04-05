package com.chandrashekhar.guestservice.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandrashekhar.guestservice.models.Guest;

public interface GuestRepository extends JpaRepository<Guest, UUID>{
    
}
