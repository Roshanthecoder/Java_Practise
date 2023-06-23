import java.lang.StringBuilder

/*fun main() {
    var n=10
     var a=0
    var b=1
    var count=1
    var array= arrayListOf<Int>()
    val mutableArray = Array<Int>(n) {0}
    mutableArray[0]=0
    array.add(0)
    print(a)
    for (i in 2..n){
         var c=a+b //1 2 3 5
        a=b //1 1 2 3
        b=c //1 2 3

        print(" $a")
    }

    while (count<n){
        var c=a+b
        a=b
        b=c
//        print(" $a")
        array.add(a)
//        array1.add(a.toString())
        mutableArray[count]=a
        count++
    }
    print(mutableArray.contentToString())
}*/

fun main(){
   /* val number="roshan"
    val stringbuilder=StringBuilder()
    val reverse_number=stringbuilder.append(number)
    reverse_number.reverse()
    println(reverse_number)*/
/*    var array= arrayListOf<String>()
    array.addAll(number.reversed().map { it.toString() })
    println(array.joinToString(""))*/
/*
val number ="roshan"
    var reversed_number=""
    for(i in number.length-1 downTo 0){
        reversed_number+=number[i]
    }
    println(reversed_number)
*/

    val str="Roshan"
    val reversed=reversenumber(str)
    print(reversed)

}

fun reversenumber(str: String): String {
    if(str.isNullOrEmpty())return ""
    return reversenumber(str.substring(1))+str[0]
}
