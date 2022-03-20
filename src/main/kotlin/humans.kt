fun main() {
    print("Введите колличество лайков: ")
    val likes = readLine()?.toInt()
    val correctPrint = if (((likes!! % 10) == 1) && (likes != 11) && ((likes % 1000) != 111)) "человеку" else "людям"
    print("Понравилось $likes $correctPrint")
}