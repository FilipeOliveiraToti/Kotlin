package classesobjetos.aula4

abstract class FormaGeometrica(){

    abstract fun getArea(): Double

    open fun getQuantidadeDeLados() : Int {
        return 4
    }
}

class Quadrado(
    val lado: Double
) : FormaGeometrica() {

    override fun getArea(): Double {
        return lado * lado
    }
}

class Circulo(
    val raio: Double
) : FormaGeometrica(){

    override fun getArea() : Double {
        return 3.14 * (raio * raio)
    }

    override fun getQuantidadeDeLados(): Int {
        return 360
    }
}