object LibraryManager {

    case class Book(title: String, author: String, isbn: String)
    var books: Set[Book] = Set()

    def AddBook(title: String , author: String , isbn: String):Set[Book]={
        val newBook: Book = Book(title , author , isbn)
        books += newBook
        println(s"${title} added to the library")
        books
    }

   def Removebook(isbn: String):Set[Book]={
        for(book <- books){
            if(book.isbn == isbn){
                println(s"${book.title} removed from the library")
                books -= book
            }
        }
        books
    }


    def CheckBook(isbn: String):Unit={
        for(book <- books){
            if(book.isbn == isbn){
                println(s"${book.title} is already in the Library!")
                return 
            }
        }
        println(s"$isbn is Not in the Library!")
    }

   def DisplayBooks():Unit={
        println("\n")
        for(book <- books){
            println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
        }
        println()
    }

    def SearchBookByTitle(title: String):Unit={
        for(book <- books){
            if(book.title == title){
                println(s"$title is found in the Library!")
                println(s"Author: ${book.author}, ISBN: ${book.isbn}")
                return 
            }
        }
        println(s"$title is Not in the Library!")
    }

    def main(args: Array[String]):Unit={
      
        AddBook("Madol duwa" , "Martin Wickramasinghe" , "1125")
        AddBook("Gamperaliya" , "Martin Wickramasinghe" , "7654")
        AddBook("Prabudda" , "Mahagama Sekara" , "2319") 
        DisplayBooks()
       
        CheckBook("7654")       

        Removebook("7654")
        DisplayBooks()

        SearchBookByTitle("Madol duwa")
    }
}
