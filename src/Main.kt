fun pedirNombre(msj: String): String {
    var nombre = ""
    do {
        print(msj)
        nombre = readln()
    } while (nombre == "")
    return nombre
}


fun main(){
    val listaPersonas = listOf<Persona>(Persona("Jesús", 60.0, 1.8), Persona("Miguel", 45.3, 1.6), Persona("Juan", 94.5, 2.23), Persona("Felipe", 77.3, 1.67), Persona("Jorge", 80.1, 1.9))

    for (persona in listaPersonas) {
        println("${persona.saludar()}\n${persona.obtenerDesc()}\n")
    }

    println(DescImc.MENOR.valor)
}