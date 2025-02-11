class Rectangulo(override val color: String, val altura: Double, val base: Double): Figura(color) {
    override fun area(): Double = base * altura
    override fun perimetro(): Double = 2 * base + 2 * altura
}