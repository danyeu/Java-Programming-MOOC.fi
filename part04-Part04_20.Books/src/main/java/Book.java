public class Book {

    private String title;
    private Integer pages;
    private Integer year;

    public Book(String title, Integer pages, Integer year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public Integer getPages() {
        return pages;
    }

    public Integer getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return (this.title + ", " + this.pages + " pages, " + this.year);
    }
}
