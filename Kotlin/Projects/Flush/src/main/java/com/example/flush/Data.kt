package com.example.flush
//it defines the type of data that is displayed
class Data (id:Int,name:String,image:Int,description:String,location:String,rating:Double,type:String,address:String){
    var id:Int
    var name:String=""
    var image:Int
    var description:String=""
    var location:String=""
    var rating:Double
    var type:String=""
    var address:String=""
    init {
        this.id=id
        this.name=name
        this.image=image
        this.description=description
        this.location=location
        this.rating=rating
        this.type=type
        this.address=address
    }
}