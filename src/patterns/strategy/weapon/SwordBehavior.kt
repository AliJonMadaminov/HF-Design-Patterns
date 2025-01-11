package patterns.strategy.weapon

class SwordBehavior : WeaponBehavior {
    override fun useWeapon() {
        println("Striking with a sword")
    }
}