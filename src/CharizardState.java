public class CharizardState implements PokemonState{
    public CharizardState() {

    }
    @Override
    public void advance() {
        System.out.println("Charizard cannot evolve further.");
    }

    @Override
    public void blazeAttack() {
        System.out.println("Charizard's Blaze was super effective! 50 dmg");
    }

    @Override
    public void fly() {
        System.out.println("Attempting flight... Charizard takes to the skies!");
    }
}
