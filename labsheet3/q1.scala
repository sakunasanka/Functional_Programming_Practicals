object q1 extends App{

    print("Enter a string: ");
    val str = scala.io.StdIn.readLine();

    def revString(str:String) : String = {
        if(str.isEmpty) ""
        else revString(str.tail) + str.head;
    }

    val revStr = revString(str);
    println(s"Reversed string: $revStr");
}