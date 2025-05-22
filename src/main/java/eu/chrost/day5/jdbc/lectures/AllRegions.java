package eu.chrost.day5.jdbc.lectures;

import java.util.List;

public class AllRegions {
    public static void main(String[] args) {
        RegionsDao regionsDao = new RegionsDao();
        List<Region> regions = regionsDao.getAllRegions();
        System.out.println(regions);
    }
}
