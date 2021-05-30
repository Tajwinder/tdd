package co.interleap.courses.tdd;
import org.junit.Test;
import static org.junit.Assert.*;


public class VowelCounterTest {

    @Test
    public void coutsToZeroWithEmptyString(){
        VowelCounter vowelCounter= new VowelCounter();
        int result= vowelCounter.countVowel("");
        assertEquals(0,result);
    }

    @Test
    public void shouldReturnOneWhenTheStrignContainsAvowelOnly(){
        VowelCounter vowelCounter= new VowelCounter();
        int result= vowelCounter.countVowel("e");
        assertEquals(1, result);
    }

    @Test
    public void shouldReturnStringLengthWhenContainsVowelsOnly(){
        VowelCounter vowelCounter= new VowelCounter();
        int result= vowelCounter.countVowel("eao");
        assertEquals(3, result);
    }
}