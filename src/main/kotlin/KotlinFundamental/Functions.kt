package KotlinFundamental

fun main() {

    val hasil = setUser("Yuda", 23)

    println(hasil)

}

fun setUser(name: String, age: Int): String {
    return "Nama Kau adalah $name GANTENG, dan umur kau $age tahun"
}