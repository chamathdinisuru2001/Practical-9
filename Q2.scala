object PatternMatching{
    def main(args: Array[String]): Unit ={
        val number = args(0).toInt

        val classify:Int => String = (n:Int) => n match{
            case n if n<0  => "Negative number"
            case n if n==0 => "Zero"
            case n if n%2 == 0 => "Even number"
            case n if n%2 == 1 => "Odd number"
            case _ => "Not a valid input"
        }

        println(classify(number))
    }
}