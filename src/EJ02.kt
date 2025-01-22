class Persona(var nombre: String, var peso: Double, var altura: Double, var imc: Double){

    constructor(peso: Double, altura: Double): this("Desconocido", peso, altura, peso / (altura * altura))

    constructor(nombre: String, peso: Double, altura: Double): this(nombre, peso, altura, peso / (altura * altura))

    override fun toString(): String {
        return "Nombre: $nombre, Peso: ${peso}kgs, Altura: ${altura}m, IMC: $imc"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other !is Persona) {
            return false
        }
        return this.nombre == other.nombre &&
                this.peso == other.peso &&
                this.altura == other.altura &&
                this.imc == other.imc
    }

    fun preguntarNombre(): Boolean{
        println("Escriba su nombre por favor: ")
        val nombreNuevo = readln()

        if (nombreNuevo.isEmpty()){
            println("Lo siento, has introducido un formato inválido...")
            nombre = "Desconocido"
            return false
        } else {
            nombre = nombreNuevo
            return true
        }
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}