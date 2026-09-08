fun main() {
    println("Bai 1: In cac so tu 1 den 10")
    for (number in 1..10) {
        print("$number ")
    }
    println()

    println("\nBai 2: Tinh tong tu 1 den 100")
    var sum = 0
    for (number in 1..100) {
        sum += number
    }
    println("Tong = $sum")

    println("\nBai 3: In cac so chan tu 1 den 20")
    for (number in 1..20) {
        if (number % 2 == 0) {
            print("$number ")
        }
    }
    println()
}