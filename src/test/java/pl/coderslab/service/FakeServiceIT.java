package pl.coderslab.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import pl.coderslab.repository.FakeRepository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
class FakeServiceIT {

    @MockBean
    private FakeRepository fakeRepository;

    @Autowired
    private FakeService fakeService;

    @Test
    void shouldReturnName() {
        // given
        int input = 2;
        when(fakeRepository.getFakeName()).thenReturn("Siema");

        // when
        String actual = fakeService.getFakeNameIfEven(input);

        // then
        assertThat(actual).isNotNull().isEqualTo("Siema");
    }
}