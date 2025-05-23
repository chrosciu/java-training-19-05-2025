package eu.chrost.day5.jdbc;

import org.apache.commons.lang3.ArrayUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class RegionsDao {
    public static Region[] getAllRegions() {
        String sqlQuery = "select * from regions";
        Region[] regions = new Region[0];
        try (
                //uzyskanie połączenia do bazy
                Connection connection = DatabaseConnector.getConnection();
                //stworzenie abstrakcji zapytania / polecenia
                Statement statement = connection.createStatement();
                //wykonanie zapytania poprzez podanie SQL - wynik zawiera wszystkie wiersze
                ResultSet resultSet = statement.executeQuery(sqlQuery)
        ) {
            //Po wynikowym zbiorze wierszy mozna tylko iterowac wiersz po wierszu
            //nie da sie nawet ustalic ile ich jest
            //next() zwraca czy jeszcze mamy jakis wiersz - i jesli tak to do niego przechodzi
            while (resultSet.next()) {
                //wyciagamy wartosci poszczegolnych kolumn (po ich nazwie)
                long id = resultSet.getLong("region_id");
                String name = resultSet.getString("region_name");
                //budujemy caly obiekt region
                Region region = new Region(id, name);
                //dodajemy go na koniec tablicy
                regions = ArrayUtils.add(regions, region);
                //ponizszy kod jest tym co teraz robi ArrayUtils
//                Region[] newRegions = new Region[regions.length + 1];
//                for (int i = 0; i < regions.length; ++i) {
//                    newRegions[i] = regions[i];
//                }
//                newRegions[regions.length] = region;
//                regions = newRegions;
             }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return regions;
    }
}
