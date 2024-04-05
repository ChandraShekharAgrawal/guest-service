package com.chandrashekhar.guestservice.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandrashekhar.guestservice.models.Guest;
import com.chandrashekhar.guestservice.repositories.GuestRepository;

@Service
public class GuestService {
    
    @Autowired
    private GuestRepository guestRepository;

    // Method to create a new guest
    public Guest createGuest(Guest guest) {
        return guestRepository.save(guest);
    }

    // Method to retrieve all guests
    public List<Guest> getAllGuests() {
        return guestRepository.findAll();
    }

    // Method to retrieve a guest by ID
    public Optional<Guest> getGuestById(UUID id) {
        return guestRepository.findById(id);
    }

    // Method to update a guest
    public Guest updateGuest(UUID id, Guest updatedGuest) {
        // Check if the guest with the given ID exists
        Optional<Guest> optionalGuest = guestRepository.findById(id);
        if (optionalGuest.isPresent()) {
            // Set the ID of the updated guest
            updatedGuest.setId(id);
            // Save the updated guest
            return guestRepository.save(updatedGuest);
        } else {
            // Guest with the given ID not found
            return null;
        }
    }

    // Method to delete a guest by ID
    public void deleteGuest(UUID id) {
        guestRepository.deleteById(id);
    }

}
