//Link para testes
https://pl.kotl.in/55ZdLYEcm
fun main() {    
    
    val numeroRomano: String? = "MCDLXIV" //Substitua por outro numero Romano pra teste
    
    val numerosRomanos = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    
    val tamanhoString = numeroRomano!!.length
    
    var resultado = numerosRomanos[numeroRomano[tamanhoString - 1]]!!
    
    for (i in tamanhoString - 2 downTo 0) {
       
        if (numerosRomanos[numeroRomano[i]]!! >= numerosRomanos[numeroRomano[i + 1]]!!) {
            resultado += numerosRomanos[numeroRomano[i]]!!
        } else {
            resultado -= numerosRomanos[numeroRomano[i]]!!
        }
    }
    print(resultado)
  
}