package bej.challenge.chapter4.repository;

import bej.challenge.chapter4.model.GenreFilm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreFilmRepository extends JpaRepository<GenreFilm, String> {
    @Query(value = "SELECT gf FROM GenreFilm gf WHERE genreId = :genreId")
    GenreFilm getById(@Param("genreId") String genreId);

}