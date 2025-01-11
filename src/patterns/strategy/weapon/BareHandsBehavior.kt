package patterns.strategy.weapon

class BareHandsBehavior : WeaponBehavior {
    override fun useWeapon() {
        println("Attacking with bare hands")
    }
}