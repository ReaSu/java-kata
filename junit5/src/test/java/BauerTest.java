import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BauerTest {

    @Test
    void bauer_geht_ein_feld_nach_vorn_spalte_bleibt_gleich() {
        Bauer bauer = new Bauer("a", 2);
        bauer = bauer.bewegtSich();
        assertEquals("a", bauer.getSpalte());
    }
    @Test
    void bauer_geht_ein_feld_nach_vorn_zeile_aendert_sich_um_eins() {
        Bauer bauer = new Bauer("a", 2);
        bauer = bauer.bewegtSich();
        assertEquals(3, bauer.getZeile());
    }
    @Test
    void bauer_geht_noch_ein_feld_nach_vorn_zeile_aendert_sich_um_eins() {
        Bauer bauer = new Bauer("a", 2);
        bauer = bauer.bewegtSich();
        bauer = bauer.bewegtSich();
        assertEquals(4, bauer.getZeile());
    }
    @Test
    void bauer_auf_spalte_b_geht_ein_feld_nach_vorn_spalte_bleibt_gleich() {
        Bauer bauer = new Bauer("b", 2);
        bauer = bauer.bewegtSich();
        assertEquals("b", bauer.getSpalte());
    }
    @Test
    void bauer_geht_noch_zwei_felder_nach_vorn_zeile_aendert_sich_um_zwei() {
        Bauer bauer = new Bauer("a", 2);
        bauer = bauer.bewegtSich();
        bauer = bauer.bewegtSich();
        assertEquals(4, bauer.getZeile());
    }
}
