package eu.chrost.day5.jdbc;

import org.apache.commons.lang3.ArrayUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public static List<Region> getAllRegionsAsList() {
        String sqlQuery = "select * from regions";
        List<Region> regions = new ArrayList<>();
        try (
                var connection = DatabaseConnector.getConnection();
                var statement = connection.createStatement();
                var resultSet = statement.executeQuery(sqlQuery)
        ) {
            while (resultSet.next()) {
                long id = resultSet.getLong("region_id");
                String name = resultSet.getString("region_name");
                Region region = new Region(id, name);
                regions.add(region);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return regions;
    }

    //metoda wyszykuje region o danym id - i jesli taki istnieje to go zwraca
    //jesli nie ma - zwraca null
    //hint: "select * from regions where region_id = 1"
    public static Region getRegionById(long id) {
        String sqlQuery = "select * from regions where region_id = ?";
        try (
                var connection = DatabaseConnector.getConnection();
                //musi byc PreparedStatement a nie Statement ze wzgledu na przekazywanie parametrow
                var preparedStatement = connection.prepareStatement(sqlQuery);
        ) {
            preparedStatement.setLong(1, id);
            try (var resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    long regionId = resultSet.getLong("region_id");
                    String regionName = resultSet.getString("region_name");
                    //zmienna region jest dalej typu Region - nie mozna do niej przypisac czegos innego
                    var region = new Region(regionId, regionName);
                    return region;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Optional<Region> getRegionByIdAsOptional(long id) {
        String sqlQuery = "select * from regions where region_id = ?";
        try (
                var connection = DatabaseConnector.getConnection();
                //musi byc PreparedStatement a nie Statement ze wzgledu na przekazywanie parametrow
                var preparedStatement = connection.prepareStatement(sqlQuery);
        ) {
            preparedStatement.setLong(1, id);
            try (var resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    long regionId = resultSet.getLong("region_id");
                    String regionName = resultSet.getString("region_name");
                    //zmienna region jest dalej typu Region - nie mozna do niej przypisac czegos innego
                    var region = new Region(regionId, regionName);
                    return Optional.of(region);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

}
