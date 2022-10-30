//import java.util.Scanner;
//
//fun main(){
//
//    //variables and conditions
//
////    var eng:Double = 70.0;
////    var hindi:Double = 87.0;
////    var maths:Double = 89.0;
////    var sum = eng+hindi+maths;
////
////    var percentage:Double = (sum/300)*100;
////
////    if(percentage>80){
////        println("Excellent");
////    }else if(percentage>65 && percentage<=80){
////        println("Very good");
////    }else if(percentage>50 && percentage<=65){
////        println("Good");
////    }else{
////        println("Poor");
////    }
////    val scanner = Scanner(System.`in`);
////    println("Enter your name");
////    var name:String = readLine()!!
////    println("Enter your age")
////    var age = scanner.nextInt();
////    println(name+" "+age);
//
//
//    //loops
//
////    for(i in 1..5){
////        print(i);
////    }
////    println();
////    for(i in 1 until 5){
////        print(i);
////    }
////    println();
////    for(i in 5 downTo 1){
////        print(i);
////    }
//
//
//    //arrays
////    var data = arrayOf<Int>(23,45,67,89);
////    var dataAgain = arrayOf(100,"Hello","Hi");
////    println(data[0]);
////    println(dataAgain[1]);
////    for(d in dataAgain){
////        println(d);
////    }
//
//
//    //Que to be performed
//    val scanner = Scanner(System.`in`);
//    var names = mutableListOf<String>();
//    do{
//        println("Enter you choice");
//        println("1.Add");
//        println("2.View");
//        println("0.Exit");
//        var userChoice:Int = scanner.nextInt();
//        scanner.nextLine();
//        when(userChoice){
//            1 -> {
//                println("Enter your name");
//            var userName = scanner.nextLine();
//            names.add(userName);
//        }
//            2 -> {
//                for(name in names){
//                    println(name);
//                }
//            }
//            else ->{
//                println("You have exited the game");
//            }
//        }
//    }while(userChoice!=0);
//
//}