package com.pokemonReview.Api.Repository;

import com.pokemonReview.Api.Models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository  extends JpaRepository<Pokemon,Integer> {
}
