package patterns.strategy.weapon

class KnifeBehavior : WeaponBehavior {
    override fun useWeapon() {
        println("Attacking with knife")
    }
}