package patterns.strategy.weapon

class BowAndArrowBehavior : WeaponBehavior {
    override fun useWeapon() {
        println("Shooting a bow")
    }
}