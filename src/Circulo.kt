class Circulo(override val color: String, val radio: Double): Figura(color) {
    override fun area(): Double = Math.PI * radio * radio
    override fun perimetro(): Double = 2 * Math.PI * radio
}