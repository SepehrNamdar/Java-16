package player;

import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class PlayerShould {

    @Test
    void have_a_name() {
        // Given
        String name = null;

        // When
        final ThrowingCallable newPlayer = () -> new PlayerRecord(name, 56);

        // Then
        assertThatExceptionOfType(PlayerShouldHaveNameException.class).isThrownBy(newPlayer);
    }

}
