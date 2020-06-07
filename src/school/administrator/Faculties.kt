package school.administrator

interface Display {
    fun print()
}

interface Faculties{
    val name: String
}
class Science: Display,Faculties {
    override val name= "Mr. Kumar"
    override fun print() {
        println("Faculty: $name")
        println("Subject : Science")
        println("Contact No: 9900000000")
    }
}
class Commerce: Display,Faculties {
    override val name= "Mr. Singh"
    override fun print() {
        println("Faculty Name: $name")
        println("Subject : Commerce")
        println("Contact: 9800000000")
    }
}

