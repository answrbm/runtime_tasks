package lesson22.http.hometask;

import java.util.List;
import java.util.Objects;

public class Film {

    private String title;
    private double budget;
    private List<String> genreList;
    private int duration;

    public Film() {
    }

    public Film(String title, double budget, List<String> genreList, int duration) {
        this.title = title;
        this.budget = budget;
        this.genreList = genreList;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public List<String> getGenreList() {
        return genreList;
    }

    public void setGenreList(List<String> genreList) {
        this.genreList = genreList;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Film film = (Film) o;

        if (Double.compare(film.budget, budget) != 0) return false;
        if (duration != film.duration) return false;
        if (!Objects.equals(title, film.title)) return false;
        return Objects.equals(genreList, film.genreList);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = title != null ? title.hashCode() : 0;
        temp = Double.doubleToLongBits(budget);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (genreList != null ? genreList.hashCode() : 0);
        result = 31 * result + duration;
        return result;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", budget=" + budget +
                ", genreList=" + genreList +
                ", duration=" + duration +
                '}';
    }
}
