object q3 extends App{

    print("Enter num1: ")
    val num1 = scala.io.StdIn.readLine().toInt;

    print("Enter num2: ")
    val num2 = scala.io.StdIn.readLine().toInt;

    def mean(num1:Int, num2:Int): Float = {
        return (num1+num2)/2.0f;
    }

    val res = mean(num1, num2);
    printf("Mean of %d & %d is %.2f\n", num1, num2, res)
}
