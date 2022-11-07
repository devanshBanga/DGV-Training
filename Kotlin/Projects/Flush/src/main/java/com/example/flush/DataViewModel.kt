package com.example.flush

import androidx.lifecycle.ViewModel
//all the data is stored here so that it persist even after changing orientation
class DataViewModel:ViewModel() {
    var data = listOf<Data>(
        Data(1,"Public Toilet",R.drawable.boys_public_toilet,"Little clean and hygenie","Vashi",7.0,"Boy","Raja Park Sector 25 Vashi"),
        Data(2,"Public Toilet",R.drawable.girls_toilet,"Good cleaniness and hygeine","Vashi",7.3,"Girl","Near railway station Sector 16 Vashi"),
        Data(3,"Special Toilet",R.drawable.hadicapped_washroom,"Properly clean and hygeine, overall good for disables","Vashi",8.5,"Handicap","Juhu beach road Vashi"),
        Data(4,"Premium Toilet",R.drawable.boys_premium_washroom,"Very good cleaniness and properly maintained heygeine","Vashi",9.3,"Boy","Sector 19 Macdonalds Vashi"),
        Data(5,"Premium Toilet",R.drawable.girls_premium_toilet,"Very good cleaniness and properly maintained heygeine","Vashi",9.5,"Girl","Sector 1 Burger King Vashi"),
        Data(26,"Special Toilet",R.drawable.disable_toilets,"Properly clean and hygeine, overall good for disables","Thane",8.5,"Handicap","Near Thane Railway Station"),
        Data(27,"Premium Toilet",R.drawable.girls_premium_toilets2,"Very good cleaniness and properly maintained heygeine","Thane",9.5,"Girl","Mayur Restaurant Thane"),
        Data(6,"Public Toilet",R.drawable.boys_public_toilet,"Ok cleaniness and hygiene","Thane",7.0,"Boy","Sector 25 Near Municipal Corporation Thane"),
        Data(7,"Special Toilet",R.drawable.hadicapped_washroom,"Good clean and hygeine, overall good for disables","Thane",8.5,"Handicap","Sector 3 Thane Near Raja Rani Park"),
        Data(8,"Premium Toilet",R.drawable.girls_premium_toilet,"Very good cleaniness and properly maintained heygeine","Thane",9.5,"Girl","Raghuleela Mall Thane"),
        Data(28,"Premium Toilet",R.drawable.boys_premium_toilets2,"Very good cleaniness and properly maintained heygeine","Nerul",8.2,"Boy","Burger King Sector 28 Nerul"),
        Data(29,"Public Toilet",R.drawable.girls_public_toilets3,"Ok cleaniness and hygiene","Nerul",7.5,"Girl","Sector 14 Nerul Near Police Station"),
        Data(9,"Premium Toilet",R.drawable.boys_premium_washroom,"Very good cleaniness and properly maintained heygeine","Nerul",8.2,"Boy","Sector 7 Nerul Starbucks"),
        Data(10,"Public Toilet",R.drawable.girls_toilet2,"Clean","Nerul",7.5,"For Girl","Sector 25 Nerul Palm Beach Road"),
        Data(11,"Special Toilet",R.drawable.hadicapped_washroom2,"Good clean and hygeine, overall good for disables","Nerul",9.2,"Handicap","Grand Central Mall Nerul"),
        Data(12,"Premium Toilet",R.drawable.girls_premium_toilet,"Very good cleaniness and properly maintained heygeine","Airoli",9.5,"Girl","Dominos Airoli Sector 10"),
        Data(13,"Premium Toilet",R.drawable.boys_premium_washroom,"Very good cleaniness and properly maintained heygeine","Airoli",9.3,"Boy","Pizza Wings Airoli Sector 12"),
        Data(14,"Special Toilet",R.drawable.hadicapped_washroom2,"Good clean and hygeine, overall good for disables","Airoli",8.5,"Handicap","Achija Restaurant Sector 26 Airoli"),
        Data(15,"Public Toilet",R.drawable.boys_toilet,"Clean","Airoli",7.0,"Boy","Airoli Railway Station"),
        Data(16,"Public Toilet",R.drawable.girls_toilet,"Ok cleaniness and hygiene","Airoli",7.3,"Girl","Near Aman's Bhojnalya Airoli"),
        Data(17,"Premium Toilet",R.drawable.boys_premium_washroom,"Very good cleaniness and properly maintained heygeine","Panvel",9.3,"Boy","Punjab Di Hatti Panvel"),
        Data(30,"Premium Toilet",R.drawable.girls_public_toilets3,"Very good cleaniness and properly maintained heygeine","Panvel",9.3,"Girl","Sher E Punjab Panvel"),
        Data(18,"Special Toilet",R.drawable.hadicapped_washroom,"Good clean and hygeine, overall good for disables","Panvel",8.5,"Handicap","Mishthi Dhoii Panvel"),
        Data(19,"Public Toilet",R.drawable.boys_toilet,"Ok cleaniness and hygiene","Panvel",7.0,"Boy","Panvel Railway Station"),
        Data(31,"Premium Toilet",R.drawable.girls_premium_toilet,"Very good cleaniness and properly maintained heygeine","Rabale",9.3,"Girl","Rabale D Mart"),
        Data(32,"Special Toilet",R.drawable.hadicapped_washroom,"Clean","Rabale",8.5,"Handicap","Rabale Maharaja Chownk"),
        Data(20,"Public Toilet",R.drawable.girls_toilet2,"Ok cleaniness and hygiene","Rabale",7.5,"Girl","Rabale Maharaja Chownk"),
        Data(21,"Public Toilet",R.drawable.boys_public_toilet,"Ok cleaniness and hygiene","Rabale",7.0,"Boy","Rabale Municipal Corporation"),
        Data(22,"Public Toilet",R.drawable.boys_toilet,"Ok cleaniness and hygiene","Belapur",7.0,"Boy","Belapur Railway Station"),
        Data(23,"Premium Toilet",R.drawable.girls_premium_toilets2,"Very good cleaniness and properly maintained heygeinen","Belapur",7.5,"Girl","Macdonalds Sector 25 Belapur"),
        Data(24,"Special Toilet",R.drawable.hadicapped_washroom2,"Good clean and hygeine, overall good for disables","Belapur",7.0,"Handicap","Biryani House Belapur Sector 19"),
        Data(25,"Public Toilet",R.drawable.girls_toilet,"Clean","Belapur",7.5,"Girl","Belapur Railway Station")
    )
    var location = listOf<String>(
        "Vashi",
        "Thane",
        "Nerul",
        "Airoli",
        "Panvel",
        "Rabale",
        "Belapur"
    )
}