package patterns.strategy.character

import patterns.strategy.weapon.WeaponBehavior

abstract class Character {

    protected abstract var weapon: WeaponBehavior

    open fun fight() {
        weapon.useWeapon()
    }

    fun setWeaponBehavior(weapon: WeaponBehavior) {
        this.weapon = weapon
    }
}