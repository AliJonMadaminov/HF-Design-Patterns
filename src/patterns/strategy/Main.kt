package patterns.strategy

import patterns.strategy.character.Character
import patterns.strategy.character.Knight
import patterns.strategy.weapon.BareHandsBehavior

fun main() {
    val knight: Character = Knight()

    knight.fight()
    println("Lost his weapon")
    knight.setWeaponBehavior(BareHandsBehavior())
    knight.fight()
}