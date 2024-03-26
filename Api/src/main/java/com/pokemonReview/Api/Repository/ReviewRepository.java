package com.pokemonReview.Api.Repository;

import com.pokemonReview.Api.Models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository  extends JpaRepository<Review,Integer> {
    List<Review> findByPokemonId(int pokemonId);
}
