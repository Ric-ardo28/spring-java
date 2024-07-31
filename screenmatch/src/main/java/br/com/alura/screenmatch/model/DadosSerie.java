package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosSerie(@JsonAlias("Titles") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {
}
