public class CharmanderState implements PokemonState {
    private final PokemonContext context;

    public CharmanderState(PokemonContext context) {
        this.context = context;
    }
    @Override
    public void advance() {
        System.out.println("Charmander is evolving into Charmeleon!.");
        context.setState(new CharmeleonState(context));
    }

    @Override
    public void blazeAttack() {
        System.out.println("Charmander's Blaze wasn't very effective. 10 dmg.");
        context.gainExperience(50);
    }

    @Override
    public void fly() {
        System.out.println("Attempting flight... Charmander can not fly.");
    }
}
