package tema3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Date;

public class Tests {

    @Test
    public void testNumarArticole() {
        Raport[] rapoarte = {
                new ArticolStintific("Articol 1", Arrays.asList("Autor 1"), Arrays.asList(new Sectiune("Secțiune 1", "Conținut 1")), Arrays.asList("Ref 1")),
                new RaportSedinta("Ședința 1", new Date(), Arrays.asList("Subiect 1"), Arrays.asList("Minuta 1"), Arrays.asList("Resp 1"))
        };
        assertEquals(1, Main.numarArticole(rapoarte));
    }

    @Test
    public void testDataCuCeleMaiMulteSedinte() {
        Date data1 = new Date();
        Date data2 = new Date();
        Raport[] rapoarte = {
                new RaportSedinta("Sedinta 1", data1, Arrays.asList("Subiect 1"), Arrays.asList("Minuta 1"), Arrays.asList("Resp 1")),
                new RaportSedinta("Sedinta 2", data1, Arrays.asList("Subiect 2"), Arrays.asList("Minuta 2"), Arrays.asList("Resp 2")),
                new RaportSedinta("Sedinta 3", data2, Arrays.asList("Subiect 3"), Arrays.asList("Minuta 3"), Arrays.asList("Resp 3"))
        };
        assertEquals(data1, Main.dataCuCeleMaiMulteSedinte(rapoarte));
    }
}
