package naritas
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class Tests : DescribeSpec({
    describe("Narita wants to eat some fish"){
        val narita = Cat()
        val fish = food()
        narita.name = "Narita"
        fish.energyGet = 30
        it("Cant eat"){
            narita.energy = 100
            narita.hunger = 100
            narita.eat(fish) shouldBe "cant eat"
        }
        it("Too much energy"){
            narita.energy = 99
            narita.hunger = 20
            narita.eat(fish) shouldBe "too much energy"
        }
        it("Stomach full"){
            narita.energy = 20
            narita.hunger = 99
            narita.eat(fish) shouldBe "stomach full"
        }
        it("It was delicious"){
            narita.energy = 40
            narita.hunger = 40
            narita.eat(fish) shouldBe "that was delicious"
        }
    }
    describe("josh doesnt feels good"){
        val josh = Cat()
        it("josh is happy"){
            josh.energy = 100
            josh.hunger = 100
            josh.isHappy() shouldBe true
        }
        it("josh isnt happy"){
            josh.energy = 30
            josh.hunger = 30
            josh.isHappy() shouldBe false
        }
        it("josh is alive"){
            josh.energy = 100
            josh.hunger = 100
            josh.isDead() shouldBe false
        }
        it("josh isnt very alive"){
            josh.energy = 0
            josh.hunger = 0
            josh.isDead() shouldBe true
        }
    }
})