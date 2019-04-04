package br.edu.ifsp.trykotlin

fun main(){

    var nome: String?
    nome = null

    var sobrenome: String?
    sobrenome = null

    var sn: String
    sn = sobrenome?:"Lira Diniz"

    println(sobrenome?.capitalize())
    println(sobrenome?.length)

    try {
        println(sobrenome!!.capitalize())
        println(sobrenome!!.length)
    } catch (kne: KotlinNullPointerException) {
        println("Erro: NullPointerException")
    }


}