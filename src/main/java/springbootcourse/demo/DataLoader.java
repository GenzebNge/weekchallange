package springbootcourse.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DataLoader implements CommandLineRunner {
    @Autowired
    CourseRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Course course = new Course("Astrophysics", "Neil D Tyson", "Just a course on starts", 3);
        repository.save(course);

        course = new Course("Calcullus", "Carol Henley", "Rate of change of the rate", 5);
        repository.save(course);

        course = new Course("Fresh man English", "Geraldin", "Learn this language class well" , 6);
        repository.save(course);
    }
}
