/**
 * Created by Erik on 5/16/16.
 */
public class Movies {
    String title;
    String genre;
    double runTime;
    String rating;

    public Movies (String title, String genre, double runTime, String rating) {
        this.title = title;
        this.genre = genre;
        this.runTime =runTime;
        this.rating = rating;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String newTitle){
        title = newTitle;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String newGenre) {
        genre = newGenre;
    }
    public double getRunTime() {
        return runTime;
    }
    public void setRunTime(double newRunTime) {
        runTime = newRunTime;
    }
    public String getRating() {
        return rating;
    }
    public void setRating(String newRating) {
        if(isRatedR(newRating)) {
            rating = newRating;
        }
    }
    public static boolean isRatedR (String newRating) {
        return newRating.contains("R");
    }

}
