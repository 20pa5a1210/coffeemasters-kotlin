package com.nerdypunk.coffemasters

class Product (
    var id: Int,
    var name: String,
    var price: Double,
    var image: String){

    val imageUrl get() = "https://firtman.github.io/coffeemasters/api/master/${this.image}"
}

class  Category (var name:String,products:MutableList<Product>)

class  ItemCart (var product:Product,var quantity:Int)