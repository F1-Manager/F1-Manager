package com.edu.eci.arsw.f1manager.services.impl;

import com.edu.eci.arsw.f1manager.persistence.JugadorRepository;
import com.edu.eci.arsw.f1manager.services.entities.Jugador;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import static java.util.Collections.emptyList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private JugadorRepository applicationUserRepository;

    
    public UserDetailsServiceImpl(JugadorRepository applicationUserRepository) {
        this.applicationUserRepository = applicationUserRepository;
    }

    /**
     * Cragar un usuario dado el nombre de este
     * @param username
     * @return
     * @throws UsernameNotFoundException 
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{

        Jugador applicationUser = applicationUserRepository.findByUsuario(username);

        if (applicationUser == null){
            throw new UsernameNotFoundException(username);
        }

        return new User(applicationUser.getUsuario(), applicationUser.getContrasena(), emptyList());
    }
}
