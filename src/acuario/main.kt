package acuario
fun construiracuario() {
    val miAcuario = acuario(ancho = 25, largo = 25, alto = 40)
    miAcuario.imprimirtamano()
    val miTorre = TanqueTorre(diametro = 25, alto = 40)
    miTorre.imprimirtamano()
}
    fun main(){
    construiracuario()
}
