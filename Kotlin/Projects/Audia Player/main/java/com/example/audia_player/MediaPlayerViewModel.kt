package com.example.audia_player

import androidx.lifecycle.ViewModel

class MediaPlayerViewModel : ViewModel(){
    var songs = listOf<Song>(
        Song("Choice","Amar Sehambi",R.drawable.choice,R.raw.choice,"Punjabi",1),
        Song("Peaches","Diljit Dosanjh",R.drawable.peaches,R.raw.peaches,"Punjabi",2),
        Song("25 25","Arjan Dhillon",R.drawable.pachis,R.raw.pachis,"Punjabi",3),
        Song("Tum Mere","Darshan Raval",R.drawable.tummere,R.raw.tummere,"Hindi",4),
        Song("Paris Ka Trip","Honey Singh",R.drawable.pariskatrip,R.raw.pariskatrip,"Punjabi",5),
        Song("Yaar Ve","Arijit Singh",R.drawable.yaarve,R.raw.yaarve,"Punjabi",6),
        Song("Dil De Diya","Anand Raaj Anand",R.drawable.dildediya,R.raw.dildediya,"Hindi",7),
        Song("Yaara","Armaan Malik",R.drawable.yaara,R.raw.yaara,"Hindi",8),
        Song("Dil ke Zakkham","Mohammed Irfan",R.drawable.dilkezakkham,R.raw.dilkezakkham,"Hindi",9) ,
        Song("Snowfall","Jordan Sandhu",R.drawable.snowfall,R.raw.snowfall,"Punjabi",10),
    )
    var categories= listOf<String>(
        "Punjabi",
        "Hindi"
    )
}
