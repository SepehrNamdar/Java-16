package record;

import org.junit.jupiter.api.Test;
import player.Player;
import player.PlayerRecord;

import static org.assertj.core.api.Assertions.assertThat;

public class RecordShould {

    @Test
    void be_immutable() {
        final Player player = new Player("Ali", 50);
        final PlayerRecord playerRecord = new PlayerRecord("Ali", 50);

        assertThat(player.getGoal()).isEqualTo(playerRecord.goal());
        assertThat(player.getName()).isEqualTo(playerRecord.name());

        final PlayerRecord hasan = playerRecord.changeName("Hasan");

        assertThat(hasan).isNotEqualTo(playerRecord);
    }

}
