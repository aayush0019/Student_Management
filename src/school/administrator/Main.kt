package school.administrator

fun newStudent() {
    print("Enter Student ID: ")
    val id = Integer.valueOf(readLine())
    print("Enter marks scored in Physics: ")
    val phy= Integer.valueOf(readLine())
    print("Enter marks stored in Chemistry: ")
    val chem = Integer.valueOf(readLine())
    print("Enter marks scored in Mathematics: ")
    val maths = Integer.valueOf(readLine())
    val e = Admin(id,phy,chem,maths)
    e.print()
}
fun printFaculties()
{
    val s=Science()
    s.print();
    val c=Commerce()
    c.print()
}
fun main(args: Array<String>) {
    println("Choose one.")
    println("1. Calculate Marks of the Student")
    println("2. Show the list of Faculties")
    var choice=Integer.valueOf(readLine())
    when (choice) {
        1 -> newStudent()
        2 -> printFaculties()
        else -> { // Note the block
            print("Invalid Command")
        }
    }

}