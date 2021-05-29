data class Book(var title: String, var author: String, var pages:Int)
fun arangeBooks(book: List<Book>){
    var x= book.sortedByDescending { book -> book.title }
    println(x)
}

fun square(){
    var sq=1
    do {
        println(sq*sq)
        sq++
    }
    while (sq*sq<3000)

}
open class CurrentAccount( var acountNumber :String,var acountName: String,var balance:Double,var withdrawals: Int){
    fun deposit(amount: Double){
        balance+=amount
        println(balance)
    }
    open fun withdraw(amount: Double){
        balance-=amount
        println(balance)
    }
    fun details(){
        println("Account number $acountNumber with balance $balance is operated by $acountName")
    }
}
class SavingsAccount(accountNumber: String, accountName: String, balance: Double, withdrawal: Int) :
    CurrentAccount(accountNumber, accountName, balance, withdrawal) {
    override fun withdraw(amount: Double) {
        if (withdrawals<4) {
            println("You can withdraw more money")
            withdrawals++
        }
    }
}
fun main(){
    var books= listOf<Book>(Book("Ben Carson","Think Big",657),
        Book("My Journey","Achebe",767),Book("Born a crime", "Trevor Noah",875),
        Book("By the river", "Chinua Achebe",675),
        Book("Pure Mathematics", "Stevenson and Packer",7675))
    arangeBooks(books)
    square()
    var myaccount=CurrentAccount("AC45632","Standbic Niwamanya",4563533.8,2)
    myaccount.deposit(6547464.9)
    myaccount.withdraw(6575.9)
    myaccount.details()
    var mySavings=SavingsAccount("AB54635","Centenary Niwamanya",7567463.5,2)
    mySavings.withdraw(5674.78)
    mySavings.details()
}