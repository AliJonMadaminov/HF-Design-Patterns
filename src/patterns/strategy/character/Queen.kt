package patterns.strategy.character

import patterns.strategy.weapon.BowAndArrowBehavior
import patterns.strategy.weapon.WeaponBehavior

class Queen : Character() {
    override var weapon: WeaponBehavior = BowAndArrowBehavior()
}