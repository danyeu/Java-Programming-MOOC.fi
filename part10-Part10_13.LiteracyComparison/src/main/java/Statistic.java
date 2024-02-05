
public class Statistic implements Comparable<Statistic> {
    public String theme;
    public String group;
    public String gender;
    public String country;
    public int year;
    public double literacyPercent;

    public Statistic(String theme, String group, String gender, String country, int year, double literacyPercent) {
        this.theme=theme;
        this.group=group;
        this.gender=gender;
        this.country=country;
        this.year=year;
        this.literacyPercent=literacyPercent;
    }
    public static Statistic fromString(String s) {
        String[] array = s.split(",");
        return new Statistic(
                array[0].trim(),
                array[1].trim(),
                array[2].trim().split(" ")[0],
                array[3].trim(),
                Integer.parseInt(array[4]),
                Double.parseDouble(array[5])
        );
    }

    @Override
    public String toString() {
        return country + " (" + year + "), " + gender + ", " + literacyPercent;
    }

    @Override
    public int compareTo(Statistic o) {
        if (literacyPercent < o.literacyPercent) {
            return -1;
        } else if (literacyPercent > o.literacyPercent) {
            return 1;
        }
        return 0;
    }
}
