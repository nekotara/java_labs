package com.compliler;

import com.compliler.dao.DAO;
import com.compliler.model.Creator;
import com.compliler.model.Episode;
import com.compliler.model.Movie;

import java.security.spec.ECParameterSpec;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        Logger lgr = Logger.getLogger(Main.class.getName());

        String url ="jdbc:postgresql://localhost:55096/lab2";
        String username = "postgres";
        String password = "Pass4Nekotara";

        try {
            DAO dao = new DAO(url, username, password);
            dao.connect();

            System.out.println("Creators\n: ");
            List<Creator> creators = dao.getCreatorList();
            for (Creator creator:creators) {
                System.out.println(creator.getName());
            }

            System.out.println("Movies: \n");
            List<Movie> movies = dao.getMovieList();
            for (Movie movie:movies) {
                System.out.println(movie.getName());
            }

            System.out.println("Episodes: ");
            List<Episode> episodes = dao.getEpisodeList();
            for (Episode episode:episodes) {
                System.out.println(episode.getName() + " " + episode.getSeason() + ' ' + episode.getEpisodeNumber());
            }
        } catch (SQLException ex) {
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
}
