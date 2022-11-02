package com.example.audia_player

class Song (title:String,artist:String,thumbnail:Int,audio:Int,category:String,id:Int){
    var title:String=""
    var artist:String=""
    var thumbnail:Int
    var audio:Int
    var category:String=""
    var id:Int
    init {
        this.title=title
        this.artist=artist
        this.audio=audio
        this.thumbnail=thumbnail
        this.category=category
        this.id=id
    }

}