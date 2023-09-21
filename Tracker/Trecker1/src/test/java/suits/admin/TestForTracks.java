package suits.admin;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import suits.AbstractTest;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static org.apache.commons.lang3.StringUtils.split;
import static org.openqa.selenium.By.cssSelector;
import static sun.net.NetProperties.get;

public class TestForTracks extends AbstractTest {

    private String balance;
    private String user;
    private String userOnThePage;

    @Test(testName = "тест1")
    public void testForTracks() throws IOException, InterruptedException {

        setUpBrowser();
        open();
        $(".wrap-input100:nth-child(2) > .input100").shouldBe(visible);
        Thread.sleep(4000);
        $(By.name("email")).sendKeys("leminabo");
        $(By.name("pass")).sendKeys("Serega7290729");

        $(By.xpath("//button[@type='submit']")).shouldBe(visible, Duration.ofSeconds(60));
        $(By.xpath("//button[@type='submit']")).click(); // нажать на войти (login)

        $(By.xpath("//span[contains(.,'Все пользователи')]")).shouldBe(visible, Duration.ofSeconds(60));
        $(By.xpath("//span[contains(.,'Все пользователи')]")).click(); // нажать на Все пользователи

        $(By.xpath("//div[@id='app']/div/div/div[3]/div/div/div[2]/div[2]/div/div/input")).shouldBe(visible, Duration.ofSeconds(60));
        $(By.xpath("//div[@id='app']/div/div/div[3]/div/div/div[2]/div[2]/div/div/input")).click(); // нажать на инпут
        String users[] = new String[85];
        users[0] = "Darkwatchbaby, and200214122and";
        users[1] = "alippoqw, 092000asd_";
        users[2] = "Akooramoo95, s181kkkk";
        users[3] = "Kovineo, Lkjhgf123";
        users[4] = "xx777x, zaqwsx2282";
        users[5] = "Ancerst, 13570qwe";
        users[6] = "morningtotheZ, hekotuk123Q";
        users[7] = "vopluha, kob123564";
        users[8] = "Nikitqa, Nikitka2006";
        users[9] = "Shjeje, 12345qwerty";
        users[10] = "Creambr1, mehcyz-fyjsan-8Bunvu";
        users[11] = "Cepera24rus, Sonic24rus";
        users[12] = "VolkPitera , vanz_771";
        users[13] = "hiphopchupa, chupchik228";
        users[14] = "Steam123, steamda123";
        users[15] = "MIKULOFF, Mikula123456";
        users[16] = "yakykan, udakuk00";
        users[17] = "Maxim2002, Mortis909";
        users[18] = "Denis3500, ltybc521524"; // ltybc5215241214
        users[19] = "nasan123a, nasan123a";
        users[20] = "berns, 745000";
        users[21] = "alinapaveleva1@gmail.com , Viktoria2008";
        users[22] = "Leopro, leopro1987";
        users[23] = "pentinnikita94, Opel053.";
        users[24] = "1066243,ANNAZA Zahar1807"; // пробел перед паролем
        users[25] = "elementsMoney, 030877Gord!";
        users[26] = "Godf@ther , Gtytnhfwbz123";
        users[27] = "Shakh0102 , 855590Oz"; //вывели 11к, сказал что уйдет с казино
        users[28] = "956664, Sadykov  Danis19719"; // пробел в никнейме
        users[29] = "Thenfirov, ZxC24042002";
        users[30] = "Galya98, galya12";
        users[31] = "Drozd228482241, 03102005";
        users[32] = "Степан123, skamer123";
        users[33] = "kosmos384, yatopcser7";
        users[34] = "Xuya, masaki1love";
        users[35] = "Yulechka0606, muvMok-zutdux-hojto7";
        users[36] = "absolutely?, Bazyka0890";
        users[37] = "cepera24rus, Sonic24rus";
        users[38] = "corgiforever1, baraka789";
        users[39] = "demonanime, 123321Yu";
        users[40] = "elementsMoney, 030877Gord!";
        users[41] = "exdevil99, arsx5h44t9";
        users[42] = "hiphopchupa, chupchik228"; // следующий кэшбек отправить ссылку
        users[43] = "igor37_37, 10091974O";
        users[44] = "lenabratisko, qwerty12345";
        users[45] = "maksim2828, QhSuc5D4J89ifxz";
        users[46] = "microlab121221, genius121221"; // отправить ссылку на кэшбек еще раз
        users[47] = "morningtotheZ, hekotuk123Q";
        users[48] = "nasan123a, nasan123a";
        users[49] = "ninyanka, miras2009";
        users[50] = "olympik312@mail.ru, FAce23Ty2";
        users[51] = "pentinnikita94, Opel053.";
        users[52] = "robzzbtw, 226000990006kK";
        users[53] = "scorpionidze, Yaromir200688";
        users[54] = "skandinav1980@mail.ru, Qwerty21101980";
        users[55] = "1098467,vaniil pashatehnik2k4";
        users[56] = "virtyz, Balonka1l";
        users[57] = "vopluha, kob123564";
        users[58] = "xx777x, zaqwsx2282";
        users[59] = "yakykan, udakuk00";
        users[60] = "1098971,Баланс skamer123";
        users[61] = "Новичок, Zaraza123"; //87SmU1FW новый пароль
        users[62] = "Степан123, skamer123";
        users[63] = "MorPo , F,hbrjcs911";
        users[64] = "NCLBKWWW, Wer123set";
        users[65] = "1096171,Nosov Nosov1991Artem";  // проверить пароль позже
        users[66] = "Pavel1337, Rubl228";
        users[67] = "Pitrov423@gmail.com , Zxcv3437"; // 10 к вывел // Zxcv343712   // новый пароль mZMtbax
        users[68] = "1024813,Roksi  wykgiC-2racvi-rudxok";// пробел после никнейма // ждать 50 к пополнения лучше
        users[69] = "Figerteeqq, Pil2f629e2242";
        users[70] = "joker, rECY0GKhJ72oX0R2w4Z2";
        users[71] = "SANYALOX777, sahakok2009";
        users[72] = "Sergo228, Sergobot2003"; // был вывод 17к // сразу подумал на поддержку, быть аккуратнее с ним
        users[73] = "Slavaruss, slava89043952910";
        users[74] = "Socdeva, Samka22890";
        users[75] = "XEnonix, bhph6wct6b";
        users[76] = "Kim110975, Kimovsk1997"; //вывел 11к
        users[77] = "Keksiik99223, Albert99223"; // Albert9922312345
        users[78] = "Kari_ign, zovkir-furjoc-8racHu";
        users[79] = "Ibaea, warface123";
        users[80] = "Babls morty , Vasy1234";
        users[81] = "Andrey99998 , Andrey79";
        users[82] = "577627058, 4Pf4JmK";
        users[83] = "IGOR DYAKOV, Dyakoov99";
        users[84] = "masaynay-a@mail.ru, M913586d";
        for (String var : users) {
            String newBalance[] = new String[users.length];
            $(By.xpath("//div[@id='app']/div/div/div[3]/div/div/div[2]/div[2]/div/div/input")).sendKeys(var.substring(0, var.indexOf(",")));// ввод логина в поле
            $(".fw-semibold").shouldBe(visible, Duration.ofSeconds(60));
            userOnThePage = $(".fw-semibold").getText(); // проверяем юзера на странице
            if (userOnThePage != var) {
                Thread.sleep(4500); // ждем
                userOnThePage = $(".fw-semibold").getText();
            }
            $(".table-td:nth-child(4)").shouldBe(visible, Duration.ofSeconds(60)); //  проверяем видно ли баланс
            balance = $(".table-td:nth-child(4)").getText(); // берем баланс //
            System.out.println(var + " balance = " + balance);
            $(By.xpath("//div[@id='app']/div/div/div[3]/div/div/div[2]/div[2]/div/div/input")).clear(); // чистим поле

        }

    }

}