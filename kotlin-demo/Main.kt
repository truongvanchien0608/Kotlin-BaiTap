    import java.io.BufferedReader
    import java.io.InputStreamReader
    import java.io.OutputStreamWriter
    import java.io.PrintWriter

    data class Student(
        val name: String,
        val math: Double,
        val programming: Double,
        val database: Double
    )

    fun main() {
        val input = BufferedReader(InputStreamReader(System.`in`, Charsets.UTF_8))
        val output = PrintWriter(OutputStreamWriter(System.out, Charsets.UTF_8), true)

        fun ask(prompt: String): String {
            output.print(prompt)
            output.flush()
            return input.readLine()
        }

        val name = ask("Nhap ten sinh vien: ")

        val math = ask("Nhap diem Math: ").toDouble()

        val programming = ask("Nhap diem Programming: ").toDouble()

        val database = ask("Nhap diem Database: ").toDouble()

        val student = Student(name, math, programming, database)
        val total = student.math + student.programming + student.database
        val gpa = total / 3
        val highest = maxOf(student.math, student.programming, student.database)
        val passed = gpa >= 5.0

        output.println("\nThong tin sinh vien: ${student.name}")
        output.println("Tong diem cua ${student.name}: $total")
        output.println("Diem trung binh cua ${student.name}: %.2f".format(gpa))
        output.println("Diem cao nhat cua ${student.name}: $highest")
        output.println("${student.name} co dat khong? ${if (passed) "Co" else "Khong"}")
    }