package acuario
import kotlin.math.PI
open class acuario(var largo: Int = 100,var ancho: Int = 20,open var alto: Int = 40) {
    fun imprimirtamano() {
        println(forma)
        println("Ancho: $ancho cm " +
                "Largo: $largo cm " +
                "Alto: $alto cm "
        )

        println("Volumen: ${volumen}l " +
                "Agua:${agua}l " +
                "(${agua/volumen*100.0}% lleno)")
    }

    init {
        println("inicializando acuario")
    }

    constructor(numeropeces: Int) : this() {
        val tanque = numeropeces * 2000 * 1.1

        alto = (tanque / (largo * ancho)).toInt()
    }

    open var volumen: Int
        get() = ancho * alto * largo / 1000
        set(valor) {
            alto = (valor * 1000) / (ancho * largo)
        }

    open class acuario(open var largo: Int = 100, open var ancho: Int = 20, open var alto: Int = 40) {
        open var volumen: Int
            get() = ancho * alto * largo / 1000
            set(valor) {
                alto = (valor * 1000) / (ancho * largo)
            }
    }
    open val forma = "rectangulo"
    open var agua: Double = 0.0
        get() = volumen * 0.9
}

class TanqueTorre (override var alto: Int, var diametro: Int): acuario(alto = alto, ancho = diametro, largo = diametro) {
    override var volumen: Int
        // área elíptica = π * r1 * r2
        get() = (ancho/2 * largo/2 * alto / 1000 * PI).toInt()
        set(valor) {
            alto = ((valor * 1000 / PI) / (ancho/2 * largo/2)).toInt()
        }

    override var agua = volumen * 0.8
    override val forma = "cilindro"
}
