import java.util.Scanner;

public class Service implements Findable {
    @Override
    public void getAllMovies(Movie[] movies) {
        System.out.println(movies);
    }

    @Override
    public void findMovieByName(Movie[] movies) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (Movie movie : movies) {
            if (name.equals(movie.getName())) {
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByActorName(Movie[] movies) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (Movie movie : movies) {
            for (Cast cast : movie.getCasts()) {
                if (cast.getActorFullName().toUpperCase().contains(name.toUpperCase())) {
                    System.out.println(movie);
                }
            }
        }
    }

    @Override
    public void findMovieByYear(Movie[] movies) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        for (Movie movie : movies) {
            if (year == movie.getYear()) {
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByDirector(Movie[] movies) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (Movie mo : movies) {
            if (name.equals(mo.getDirector().getName())) {
                System.out.println(mo);

            }
        }
    }

    @Override
    public void findMovieByDescription(Movie[] movies) {
        Scanner scanner = new Scanner(System.in);
        String description = scanner.nextLine();
        for (Movie m : movies) {
            if (m.getDescription().toUpperCase().contains(description.toUpperCase())) {
                System.out.println(m);
            }
        }
    }

    @Override
    public void findMovieByRole(Movie[] movies) {
        Scanner scanner = new Scanner(System.in);
        String role = scanner.nextLine();
        for (Movie me : movies) {
            for (Cast cast : me.getCasts()) {
                if (cast.getRole().toUpperCase().contains(role.toUpperCase())) {
                    System.out.println(me);
                }
            }
        }
    }
}
