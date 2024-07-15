object q1{

    def getProductList(): List[String] = {
        var productList = List[String]()
        var continue = true;
        
        while(continue) {
            print("Enter product name: ");
            val name = scala.io.StdIn.readLine();

            if (name.toLowerCase == "done") {
                continue = false
            }
            else{
                productList = productList:+name
            }
        }
        productList
    }

    def printProductList(productList:List[String]): Unit = {
        val count = productList.length
        print("\nProduct List: \n")

        for (i <- 0 until count) {
            println(productList(i))
        }
        print("\n")
    }

    def getTotalProducts(productList:List[String]): Unit = {
        val count = productList.length

        println(s"Total no of products: $count")
    }

    def main(args: Array[String]):Unit = {

        val products = getProductList()
        printProductList(products)
        getTotalProducts(products)

    }

}