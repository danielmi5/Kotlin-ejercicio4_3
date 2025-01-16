class Persona(var peso: Double, var altura: Double) {
    var nombre = "Desconocido"
    val imc: Double
        get() = peso/(altura*altura)

    constructor(nombre: String, peso: Double, altura: Double): this(peso, altura){
        this.nombre = nombre
    }

    fun saludar(): String{
        return "Hola $nombre!"
    }
    companion object{
        const val ALTURA_MEDIA: Double = 1.75
        const val PESO_MEDIO: Double = 70.0

    }
    fun alturaEncimaMedia(): Boolean{
        return if (altura >= ALTURA_MEDIA) true else false
    }

    fun pesoEncimaMedia(): Boolean{
        return if (peso >= PESO_MEDIO) true else false
    }

    fun obtenerDesc(): String{
        fun obtenerdescImc(imc: Double): String{
            return if (imc >= 30.0) {
                DescImc.MAYOR.valor
            } else if (imc < 18.5) {
                DescImc.MENOR.valor
            } else{
                if (imc > 25.0) DescImc.ALTO.valor else DescImc.MEDIO.valor
            }
        }
        val descImc = obtenerdescImc(imc)
        val descAltura = if (alturaEncimaMedia()) "Por encima de la media" else "Por debajo de la media"
        val descPeso = if (pesoEncimaMedia()) "Por encima de la media" else "Por debajo de la media"


        return "$nombre con peso $peso Kg ($descPeso) y altura $altura cm ($descAltura) tiene un IMC de $imc ($descImc)."
    }


    override fun toString(): String {
        return "$nombre con peso $peso Kg y altura $altura cm"
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }


}


