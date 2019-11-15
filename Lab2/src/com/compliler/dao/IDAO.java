package com.compliler.dao;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

import com.compliler.model.Creator;
import com.compliler.model.Episode;
import com.compliler.model.Movie;

public interface IDAO {

    void connect() throws SQLException;

    Creator getCreator(Long id) throws SQLException;
    List<Creator> getCreatorList() throws SQLException;

    Episode getEpisode(Long id) throws SQLException;
    List<Episode> getEpisodeList() throws SQLException;

    Movie getMovie(Long id) throws SQLException;
    List<Movie> getMovieList() throws SQLException;
}
