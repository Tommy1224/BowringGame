import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class BowringGameTest {


	private void shots(BowringGame sut,int pin) {
		for (int i = 0; i < 20; i++) {
			sut.shot(pin);
		}
	}

	@Test
	void 全部ガター() {
		BowringGame sut = new BowringGame();


		shots(sut,0);

		int expected = 0;
		int actual = sut.getScore();

		assertThat(actual, is(expected));
	}
	@Test
	void 全部1ピン() throws Exception {
		BowringGame sut = new BowringGame();

		shots(sut, 1);
		int expected = 20;
		int actual = sut.getScore();
		assertThat(actual, is(expected));
	}
	@Test
	void 全部5ピン() throws Exception {
		BowringGame sut = new BowringGame();

		shots(sut, 5);
		sut.shot(5);
		int expected = 150;
		int actual = sut.getScore();
		assertThat(actual, is(expected));
	}
	@Test
	void ピン5ピン3ピン() throws Exception {
		BowringGame sut = new BowringGame();

		sut.shot(5);
		sut.shot(5);
		sut.shot(3);
		int expected = 16;
		int actual = sut.getScore();
		assertThat(actual, is(expected));
	}
}
