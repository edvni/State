public class PokemonContext {
    private PokemonState currentState;
    private int experience;

    public PokemonContext() {
        currentState = new CharmanderState(this);
        experience = 0;
    }

    public void setState(PokemonState state) {
        currentState = state;
    }

    public void gainExperience(int exp) {
        experience += exp;
        checkEvolution();
    }

    public void blazeAttack() {
        currentState.blazeAttack();
        checkEvolution();
    }

    public void checkEvolution() {
        if (experience >= 300) {
            currentState.advance();
            experience = 0;
        }
    }

    public void fly() {
        currentState.fly();
    }
}
