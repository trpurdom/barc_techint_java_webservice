package barc.techint.java.ws.missingnum;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberCalcDefaultImplTest {

    @Test
    @Disabled("Disabled until valid implementation of MissingNumberCalcDefaultImpl based on acceptance criteria file missingnum/src/test/resources/acceptance/missingnumber_basic.feature")
    void fixme() {
        MissingNumberCalcDefaultImpl calc = new MissingNumberCalcDefaultImpl();
        Stream<Integer> input = Lists.list(3,1,4,2,6).stream();
        Integer missingNum = calc.apply(input);
        assertNotNull(missingNum);
        assertEquals(5, missingNum.intValue());
    }
}