package com.pokemonReview.Api.Repository;

import com.pokemonReview.Api.Models.Role;
import com.pokemonReview.Api.Models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; // Import de l'annotation @Repository

import java.util.Optional;

@Repository // Ajout de l'annotation @Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findByName(String name);
}
