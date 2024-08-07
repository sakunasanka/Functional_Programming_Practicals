import scala.io.StdIn.{readLine, readInt}

object q2 {

  // Function to read and validate student info
  def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
    var isValid = false
    var studentInfo: (String, Int, Int, Double, Char) = ("", 0, 0, 0.0, 'F')

    while (!isValid) {
      printf("Enter student name: ")
      val name = readLine()

      printf("Enter marks obtained: ")
      val marks = readInt()

      printf("Enter total possible marks: ")
      val totalMarks = readInt()

      val validationResult = validateInput(name, marks, totalMarks)
      isValid = validationResult._1

      if (isValid) {
        studentInfo = getStudentInfo(name, marks, totalMarks)
      } else {
        println(s"Invalid input: ${validationResult._2.getOrElse("Unknown error")}")
      }
    }

    studentInfo
  }

  // Function to validate input
  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
    if (name.isEmpty) {
      (false, Some("Name cannot be empty"))
    } else if (marks < 0 || totalMarks < 0) {
      (false, Some("Marks and total possible marks must be positive integers"))
    } else if (marks > totalMarks) {
      (false, Some("Marks obtained cannot exceed total possible marks"))
    } else {
      (true, None)
    }
  }

  // Function to get student info and calculate percentage and grade
  def getStudentInfo(name: String, marks: Int, totalMarks: Int): (String, Int, Int, Double, Char) = {
    val percentage = (marks.toDouble / totalMarks) * 100
    val grade = percentage match {
      case p if p >= 90 => 'A'
      case p if p >= 75 => 'B'
      case p if p >= 50 => 'C'
      case _ => 'D'
    }
    (name, marks, totalMarks, percentage, grade)
  }

  // Function to print student record
  def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
    println(s"Student Name: ${record._1}")
    println(s"Marks Obtained: ${record._2}")
    println(s"Total Possible Marks: ${record._3}")
    println(f"Percentage: ${record._4}%.2f%%")
    println(s"Grade: ${record._5}")
  }

    def main(args: Array[String]): Unit = {
        val studentInfo = getStudentInfoWithRetry()
        printStudentRecord(studentInfo)
    }

}
