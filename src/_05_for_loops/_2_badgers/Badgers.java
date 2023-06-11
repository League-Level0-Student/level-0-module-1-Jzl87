package _05_for_loops._2_badgers;

public class Badgers {

	public static void main(String[] args) {

		for (int v = 0; v < 2; v += 1) {

			for (int i = 0; i <= 11; i += 1) {
				System.out.println("badger");
			}

			for (int n = 0; n < 2; n += 1) {
				System.out.println("mushroom");
			}
		}
		System.out.println("snake");
	}
}