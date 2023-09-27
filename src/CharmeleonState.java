public class CharmeleonState implements PokemonState {
    private final PokemonContext context;

    public CharmeleonState(PokemonContext context) {
        this.context = context;
    }

    @Override
    public void advance() {
        System.out.println("Charmeleon is evolving into Charizard!");
        context.setState(new CharizardState());
    }

    @Override
    public void blazeAttack() {
        System.out.println("Charmeleon's Blaze was effective! 20 dmg.");
        context.gainExperience(50);
    }

    @Override
    public void fly() {
        System.out.println("Attempting flight... Charmeleon can not fly.");
    }
}
