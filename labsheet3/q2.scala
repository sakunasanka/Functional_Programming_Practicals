object q3 extends App{
    def filterAboveFive(list: List[String]):List[String]={
        list.filter(_.length > 5)
    }

        var MyList = List("abc" , "abcde" , "more than five" , "string" , "this")
        var aboveFive = filterAboveFive(MyList)
        println(aboveFive)    
}