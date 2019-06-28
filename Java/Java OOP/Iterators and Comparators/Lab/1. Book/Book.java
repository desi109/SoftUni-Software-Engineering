import java.util.Arrays;
import java.util.List;

public class Book {
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... values) {
        this.title = title;
        this.year = year;
        authors = Arrays.asList(values);
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public List<String> getAuthors() {
        return authors;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
                .append("Title: ").append(this.title)
                .append("  Year: ").append(this.year)
                .append("  Authors: ").append(String.join(", ", this.authors));

        return sb.toString();
    }
}
