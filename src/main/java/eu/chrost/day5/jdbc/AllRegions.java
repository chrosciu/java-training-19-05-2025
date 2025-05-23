package eu.chrost.day5.jdbc;

import java.util.Arrays;

class AllRegions {
    public static void main(String[] args) {
        Region[] regions = RegionsDao.getAllRegions();
        System.out.println(Arrays.toString(regions));
    }
}
