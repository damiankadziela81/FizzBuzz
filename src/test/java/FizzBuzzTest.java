import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {


    @Test
    void shouldPrintOutFizzWhen3() {

        //given
        List<String> fizz = new ArrayList<>();
        List<String> fizzSb = new ArrayList<>();
        for (int i = 3; i < 100; i += 3) {
            if (i % 15 == 0) continue;
            fizz.add(FizzBuzz.fizzBuzz(i));
            fizzSb.add(FizzBuzz.fizzBuzzWithStringBuilder(i));
        }
        //when
        //then
        for (String s : fizz) {
            assertEquals("Fizz", s);
        }
    }

    @Test
    void shouldPrintOutBuzzWhen5() {
        //given
        List<String> buzz = new ArrayList<>();
        List<String> buzzSb = new ArrayList<>();
        for (int i = 5; i < 100; i += 5) {
            if (i % 15 == 0) continue;
            buzz.add(FizzBuzz.fizzBuzz(i));
            buzzSb.add(FizzBuzz.fizzBuzzWithStringBuilder(i));
        }
        //when
        //then
        for (String b : buzz) {
            assertEquals("Buzz", b);
        }
    }

    @Test
    void shouldPrintOutFizzBuzzWhen15() {
        //given
        List<String> fizzbuzz = new ArrayList<>();
        List<String> fizzbuzzSb = new ArrayList<>();
        for (int i = 15; i < 100; i += 15) {
            fizzbuzz.add(FizzBuzz.fizzBuzz(i));
            fizzbuzzSb.add(FizzBuzz.fizzBuzzWithStringBuilder(i));
        }
        //when
        //then
        for (String fb : fizzbuzz) {
            assertEquals("FizzBuzz", fb);
        }
        for (String fbSb : fizzbuzzSb){
            assertEquals("FizzBuzz",fbSb);
        }
    }




}