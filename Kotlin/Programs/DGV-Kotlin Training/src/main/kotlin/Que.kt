import java.util.Scanner;

fun main(){
    val scanner = Scanner(System.`in`);
    var userChoice:Int;
    var userSelection:Int;
    do{
        println("Enter your choice");
        println("1. Square");
        println("2. SquareRoot");
        println("3. Armstrong number");
        println("0. Exit");
        userChoice = scanner.nextInt();
        when(userChoice){
            1 ->{
                println("Enter the number");
                userSelection = scanner.nextInt();
                println(square(userSelection));
            }
            2 ->{
                println("Enter the number");
                userSelection = scanner.nextInt();
                println(sqrt(userSelection));
            }
            3 ->{
                println("Enter the number");
                userSelection = scanner.nextInt();
                println(armstrong(userSelection));
            }
            else -> {
                println("You have exited the game");
            }
        }
    }while(userChoice!=0);
}

fun square(num:Int):Int{
    return num*num;
}
fun sqrt(num:Int):Int{
    for(i in 2 .. num/2){
        if(i*i==num){
            return i;
        }
    }
    return 0;
}
fun armstrong(num:Int):String{
    var temp:Int=num;
    var count:Int=0;
    while(temp!=0){
        count++;
        temp/=10;
    }
    temp=num;
    var sum=0;
    while(temp!=0) {
        var remainder = temp % 10;
        var mul = 1;
        for (i in 1..count) {
            mul *= remainder;
        }
        sum += mul;
        temp /= 10;
    }
    if(sum==num){
        return "Yes";
    }
        return "No";
}