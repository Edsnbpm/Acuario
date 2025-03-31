package acuario
fun construiracuario() {
    val miAcuario = acuario(ancho = 25, largo = 25, alto = 40)
    miAcuario.imprimirtamano()
    val miTorre = TanqueTorre(diametro = 25, alto = 40)
    miTorre.imprimirtamano()
}
    fun main(){
    //construiracuario()
    crearpeces()
}

fun crearpeces(){
    val tiburon = Tiburon()
    val pespayaso = PezPayaso()

    println("El tiburón es de color: ${tiburon.color}")
    tiburon.comer()
    println("El pez payaso es de color: ${pespayaso.color}")
    pespayaso.comer()
}