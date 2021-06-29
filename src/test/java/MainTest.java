import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test_Given_WeWantTOSeeAWelcomeMassage_When_WeGetTheMassage_ThenTheMassageShowsHelloRot13(){
        //arrange
        //act
        String actual = Main.GetMassage();

        //assert
        Assertions.assertEquals("hello Rot13",actual);
    }
}
