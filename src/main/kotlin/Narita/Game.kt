package Narita

class Cat{
    var name: String = "narita"
    val maxEnergy: Int = 100
    val maxHunger: Int = 100
    var energy: Int = 100
    var hunger: Int = 100

    fun eat(foody : food): String {
        if ((energy == maxEnergy) or (hunger == maxHunger)){
            return "cant eat"
        }
        else
            if (energy + foody.energyGet() > 100){
                energy = 100
                return "too much energy"
            }
            else{
                energy = energy + foody.energyGet()
            }

            if (hunger + foody.energyGet() > 100){
                hunger = 100
                return "stomach full"
             }
            else{
                 hunger = hunger + foody.energyGet()
             }
            return "that was delicious"
    }

    fun play(time : Int){
        energy = energy.minus(time*5)
        hunger = hunger.minus(time*2)
    }

    fun excercise(time : Int){
        energy = energy.minus(time*2)
        hunger = hunger.minus(time*5)
    }

    fun hasHunger() = hunger < maxHunger - 10
    fun isTired() = energy < maxEnergy - 10
    fun isStarving() = hunger <= 0
    fun isExhausted() = energy <= 0

    fun isHappy() = !this.hasHunger() and !this.isTired()
    fun isDead() = isStarving() and isExhausted()
}

class food{
    var energyGet: Int = 0
    fun energyGet() = this.energyGet
}