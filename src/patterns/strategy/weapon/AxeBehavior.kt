package patterns.strategy.weapon

class AxeBehavior : WeaponBehavior {
    override fun useWeapon() {
        println("Throwing an axe")
    }
}