import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @Test
    void fillFormTest() {
open("https://demoqa.com/text-box");
$("[id=userName]").setValue("Pavel Yatmanov");
$("[id=userEmail]").setValue("svgravity799@gmail.com");
$("[id=currentAddress]").setValue("Ulyanovsk");
$("[id=permanentAddress]").setValue("Ulica Ablukova");
$("[id=submit]").click();
$("[id=output]").shouldHave(text("Ulica Ablukova"));



    }



    /// https://demoqa.com/text-box
}
