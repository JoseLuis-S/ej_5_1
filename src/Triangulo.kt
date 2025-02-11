class Triangulo(override val color: String,
                val base: Double,
                val altura: Double,
                val lados: Array<Double>): Figura(color) {

    override fun perimetro(): Double = lados.sum()
    override fun area(): Double = (base * altura) / 2
}