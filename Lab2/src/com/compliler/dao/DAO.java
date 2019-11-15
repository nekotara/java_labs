package com.compliler.dao;
import com.compliler.model.Creator;
import com.compliler.model.Episode;
import com.compliler.model.Movie;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class DAO implements IDAO{

    IDAOImpl <Creator> creatorDAOImpl;
    IDAOImpl <Movie> movieDAOImpl;
    IDAOImpl <Episode> episodeDAOImpl;

    Connection connection;
    String url;
    String user;
    String password;

    public DAO(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    @Override
    public void connect() throws SQLException {
        connection = DriverManager.getConnection(url, user, password);
        creatorDAOImpl = new DAOImpl<Creator>(Creator.class, connection);
        movieDAOImpl = new DAOImpl<Movie>(Movie.class, connection);
        episodeDAOImpl = new DAOImpl<Episode>(Episode.class, connection);
    }

    @Override
    public Creator getCreator(Long id) throws SQLException {
        return creatorDAOImpl.getEntity(id);
    }

    @Override
    public List<Creator> getCreatorList() throws SQLException {
        return creatorDAOImpl.getEntityList();
    }

    @Override
    public Episode getEpisode(Long id) throws SQLException {
        return episodeDAOImpl.getEntity(id);
    }

    @Override
    public List<Episode> getEpisodeList() throws SQLException {
        return episodeDAOImpl.getEntityList();
    }

    @Override
    public Movie getMovie(Long id) throws SQLException {
        return movieDAOImpl.getEntity(id);
    }

    @Override
    public List<Movie> getMovieList() throws SQLException {
        return movieDAOImpl.getEntityList();
    }

}
