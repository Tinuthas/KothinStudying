fun main() {

    outer@for(i in 1..10){
       for (j in 1..10) {
           if(i == 2 && j == 2) continue@outer
           println("$i $j")

       }
    }

}