package lesson_2

fun main() {

    val workers = 50
    val interns = 30

    val workersSalary = 30_000
    val internsSalary = 20_000

    val workersSalaryExpenses = workersSalary * workers
    val internsSalaryExpenses = internsSalary * interns
    val everySalaryExpenses = internsSalaryExpenses + workersSalaryExpenses

    val averageSalary = everySalaryExpenses / (interns + workers)

    val answer = """
        Расходы на выплату зарплаты постоянных сотрудников: $workersSalaryExpenses
        Общие расходы по ЗП после прихода стажеров: $everySalaryExpenses
        Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary
    """.trimIndent()

    print(answer)
}