import java.util.Arrays;

public class Movie {
    private String name;
    private int year;
    private String description;
    private Director director;
    private Cast[] casts;

    public Movie(){

    }

    public Movie(String name, int year, String description, Director director, Cast[] casts) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.casts = casts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Cast[] getCasts() {
        return casts;
    }

    public void setCasts(Cast[] casts) {
        this.casts = casts;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", description='" + description + '\'' +
                ", director=" + director +
                ", casts=" + Arrays.toString(casts) +
                '}';
    }
}

