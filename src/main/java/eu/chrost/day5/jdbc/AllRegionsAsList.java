package eu.chrost.day5.jdbc;

import java.util.List;

class AllRegionsAsList {
    public static void main(String[] args) {
        List<Region> regions = RegionsDao.getAllRegionsAsList();
        System.out.println(regions);

        regions.remove(2);
        System.out.println(regions);
    }
}
