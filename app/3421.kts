fun main() {

    val f1 = Fraction(3F, 4F)

    val f2 = Fraction(3F, 4F)
    println(f1 == f2)

    println()


}
interface Iragac {
    fun getSum(): Float
    fun multuple(): Float

}

class Fraction(x: Float, y: Float): Iragac {
    var numerator: Float = x
    var denominator: Float = y
    override fun getSum(): Float {
        return (numerator * denominator + numerator * denominator)/ denominator * denominator
    }

    override fun multuple(): Float {
        return (numerator * numerator)/(denominator * denominator)
    }


    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator * denominator / denominator == numerator) {
                return true
            }
        }
        return false
    }



}
