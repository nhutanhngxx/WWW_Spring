package vn.edu.iuh.fit.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vn.edu.iuh.fit.backend.entities.Candidate;
import vn.edu.iuh.fit.backend.repositories.CandidateRepository;
import vn.edu.iuh.fit.backend.repositories.JobRepository;

import java.util.Date;

@SpringBootApplication
public class MyApplication  implements CommandLineRunner{
    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private JobRepository jobRepository;
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.printf("Connected to database\n");
//        candidateRepository.create("Nguyen", "Nhut", "Anh", new Date(2003-17-03), "nhutanhngxx@gmail.com", "HCM", "0939968135");
//        jobRepository.create("Java Developer");
    }
}
