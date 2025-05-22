package eu.chrost.day4.s3exceptions.lectures.p3finally;

class Finally {
    public static void main(String[] args) {
        DbConnection.open();
        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            DbConnection.close();
        }
    }
}
