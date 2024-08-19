import scala.io.StdIn.readLine

object Interest{
    def main(args: Array[String]): Unit ={
        val calculateInterest: Double => Double = (depositAmount: Double) => depositAmount match {
            case amount if amount <= 20000 => amount*0.02
            case amount if amount <= 200000 => amount*0.04
            case amount if amount <= 2000000 => amount*0.035
            case amount if amount > 2000000 => amount*0.065
        }

        print("Enter the deposit amount: ")
        val depositAmount = readLine().toDouble

        val interest = calculateInterest(depositAmount)
        println(s"Interest can urn: $interest")
    }
}