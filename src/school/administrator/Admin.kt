package school.administrator

open class Admin (var stud_id: Int=0,  var phy_marks:Int , var chem_marks: Int, var maths_marks: Int){
    var percent: Float
        get() = ((phy_marks+chem_marks+maths_marks)*100).toFloat()/300
        set(value) {
            percent = value
        }

    init {
        println("Administrator initializing")
    }
}
fun Admin.print() {
    println("Student Id: $stud_id  " +
            "Percentage scored: $percent ")
}
