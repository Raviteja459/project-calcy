import java.util.*
import kotlin.Double
fun main (args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter six numbers: ")
    val a = reader.nextDouble()
    val b = reader.nextDouble()
    val c = reader.nextDouble()
    val d = reader.nextDouble()
    val e = reader.nextDouble()
    val f = reader.nextDouble()
    print("Enter an operator (+, -, *, /,%): ")
    val operator = reader.next()[0]
    val display: Double
    display = if (operator == '+') a+b+c+d+e+f
    else if (operator == '-') a-b-c-d-e-f
    else if (operator == '*') a*b*c*d*e*f
    else if (operator == '/') a/b/c/d/e/f
    else if (operator == '%') a%b%c%d%e%f
    else {
        System.out.printf("Error! operator is not correct")
        return
    }
    System.out.printf("%.1f %c %.1f %c %.1f %c %.1f %c %.1f %c %.1f = %.1f", a, operator, b, operator, c , operator, d , operator , e , operator , f , display)
}