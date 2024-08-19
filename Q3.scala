object StringFormat{
    def main(args: Array[String]): Unit ={
        val upperCase: String => String = (name: String) => name.toUpperCase()

        val lowerCase: String => String = (name: String) => name.toLowerCase()

        val formatName: (String, String =>String ,Array[Int]) => String = (name: String, function: String => String, indexList: Array[Int]) => {
            val charArray = name.toCharArray

            for(index <- indexList if index < name.length){
                charArray(index) = function(charArray(index).toString).charAt(0)
            }

            charArray.mkString
        }

        val name1 = formatName("Benney", upperCase,Array(0,1,2,3,4,5))
        val name2 = formatName("Niroshan", upperCase,Array(0,1))
        val name3 = formatName("Saman", lowerCase, Array(0,1,2,3,4))
        val name4 = formatName("Kumara", upperCase,Array(0,5))

        println(name1) 
        println(name2) 
        println(name3) 
        println(name4)
    }
}