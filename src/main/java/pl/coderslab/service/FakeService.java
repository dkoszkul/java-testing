package pl.coderslab.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.coderslab.repository.FakeRepository;

@Service
@RequiredArgsConstructor
public class FakeService {

    private final FakeRepository fakeRepository;

    public String getFakeNameIfEven(int number) {
        return fakeRepository.getFakeName();
    }
}
