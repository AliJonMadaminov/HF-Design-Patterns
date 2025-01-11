package patterns.strategy.character

import patterns.strategy.weapon.SwordBehavior
import patterns.strategy.weapon.WeaponBehavior

class Knight : Character() {
    override var weapon: WeaponBehavior = SwordBehavior()

    override fun fight() {
        print("Knife: ")
        weapon.useWeapon()
    }
}