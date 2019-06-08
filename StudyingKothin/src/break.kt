fun main() {

    loop@ for (i in 1..10) {
        for(j in 1..10){
            println("$i $j")
            if( i == 2 && j == 2) break@loop

        }
    }
}