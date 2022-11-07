package com.example.flush

//it defines the userData that is gained by user after filling the enquiry form
class UserData(name:String,email:String,address:String,phone:String,) {
    var name:String
    var email:String
    var address:String
    var phone:String
    init{
        this.name=name
        this.email=email
        this.address=address
        this.phone=phone
    }
}