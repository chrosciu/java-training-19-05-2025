package eu.chrost.day5.jdbc;

class RegionById {
    public static void main(String[] args) {
        Region existingRegion = RegionsDao.getRegionById(1);
        System.out.println(existingRegion);
        Region nonExisitingRegion = RegionsDao.getRegionById(5);
        System.out.println(nonExisitingRegion);
    }
}
