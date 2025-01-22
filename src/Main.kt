fun main(){
    //Persona 1
    val persona1 = Persona("", 55.6, 1.78)
    persona1.preguntarNombre()
    println("El nombre de la persona es ${persona1.nombre}.")
    println("La persona pesa ${persona1.peso} kgs.")
    println("La persona mide ${persona1.altura} metros.")

    //Persona 3
    val persona3 = Persona(80.4, 1.68)
    println(persona3)
    persona3.altura = 1.80
    println(persona3)

    //Persona 2
    val persona2 = Persona(80.4, 1.98)
    persona2.altura = persona3.altura
    println(persona2)
    println(persona3)

    println(persona2.equals(persona3))
}