package com.pokemonReview.Api.Services;

import com.pokemonReview.Api.Dtos.PokemonDto;
import com.pokemonReview.Api.Dtos.PokemonResponse;
import com.pokemonReview.Api.Models.Pokemon;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PokemonService {

    PokemonDto createPokemon(PokemonDto pokemonDto);

    PokemonResponse getAllPokemon(int pageNo, int pageSize);
    PokemonDto getPokemonById(int id);

    PokemonDto updatePokemon(PokemonDto pokemonDto, int id);
    void deletePokemonId(int id);
}
