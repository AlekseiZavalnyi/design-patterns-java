public abstract class Character {
    abstract public void pickUpWeapon();

    abstract public void defenseAction();

    abstract public void moveToSafety();

    /**
     * Стратегія захисту та відступу
     */

    final void defendAgainstAttack() {
        pickUpWeapon();
        defenseAction();
        moveToSafety();
        System.out.println();
    }
}
