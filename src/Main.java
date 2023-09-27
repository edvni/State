public class Main {
    public static void main(String[] args) {
        PokemonContext pokemon = new PokemonContext();

        System.out.println("Starting with Charmander:");

        for (int i = 0; i < 5; i++) {
            pokemon.blazeAttack();
            try {
                Thread.sleep(500); // Delay of 0.5 seconds between Blaze attacks
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 5; i++) {
            pokemon.blazeAttack();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 5; i++) {
            pokemon.blazeAttack();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        pokemon.fly();
    }
}
