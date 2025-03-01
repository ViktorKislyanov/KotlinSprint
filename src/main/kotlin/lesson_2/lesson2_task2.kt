package lesson_2

fun main() {

    val employees = 50
    val interns = 30

    val employeesSalary = 30_000
    val internsSalary = 20_000

    val employeesExpenses = employeesSalary * employees
    val everySalaryExpenses = (internsSalary * interns) + employeesExpenses

    val averageSalary = everySalaryExpenses / (interns + employees)

    val answer = """
        Расходы на выплату зарплаты постоянных сотрудников: $employeesExpenses
        Общие расходы по ЗП после прихода стажеров: $everySalaryExpenses
        Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary
    """.trimIndent()

    print(answer)
}