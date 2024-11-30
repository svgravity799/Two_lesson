import org.junit.jupiter.api.*;

public class JUnitExamples {




@BeforeAll
static void beforeAll() {
    System.out.println("Before All выполняется один раз До всех тестов");
}



@AfterAll
static void afterAll() {
    System.out.println("AfterAll выполняется один раз посел всех тестов");
}



@BeforeEach
void beforeEach() {
    System.out.println("Before Each Выполняется каждый раз перед каждым тестом");
}



@AfterEach
void afterEach() {
    System.out.println("AfterEach Выполняется после каждого тесте");
}


    @Test
    void firstTest() {
        System.out.println("Первый тест()");
    }





    @Test
    void secondTest() {
        System.out.println("Второй тест()");
    }




}
