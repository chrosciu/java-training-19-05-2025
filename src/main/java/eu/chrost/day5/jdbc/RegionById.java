package eu.chrost.day5.jdbc;

class RegionById {
    public static void main(String[] args) {
        Region existingRegion = RegionsDao.getRegionById(1);
        System.out.println(existingRegion);
        if (existingRegion != null) {
            System.out.println(existingRegion.name());
        }
        Region nonExisitingRegion = RegionsDao.getRegionById(5);
        System.out.println(nonExisitingRegion);
        if (nonExisitingRegion != null) {
            System.out.println(nonExisitingRegion.name());
        }
    }
}
