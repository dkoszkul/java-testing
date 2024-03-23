package pl.coderslab.repository;

import org.springframework.stereotype.Repository;

@Repository
public class FakeRepository {

    public String getFakeName() {
        return "Test";
    }
}
