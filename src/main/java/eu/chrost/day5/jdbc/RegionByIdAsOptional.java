package eu.chrost.day5.jdbc;

import java.util.Optional;

class RegionByIdAsOptional {
    public static void main(String[] args) {
        Optional<Region> existingRegion = RegionsDao.getRegionByIdAsOptional(1);
        displayRegion(existingRegion);
        Optional<Region> nonExistingRegion = RegionsDao.getRegionByIdAsOptional(5);
        displayRegion(nonExistingRegion);
    }

    private static void displayRegion(Optional<Region> region) {
        if (region.isPresent()) {
            System.out.println(region.get());
            System.out.println(region.get().name());
        } else {
            System.out.println("Region does not exist");
        }
    }
}
