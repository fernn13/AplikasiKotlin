package com.example.aplikasikotlin

fun main(args: Array<String>) {
    printHeader("Biodata")
    biodata("Fernanda Adityo Saputra", alamat = "Dsn. Dumplengan Kec. Pitu Kab. Ngawi")
    printHeader("Hobby")
    hobby(
        "Fotografer",
        "Dengan memotret, saya bisa mencurahkan perasaan berupa hasil gambar.",
    )
}

fun printHeader(title: String) {
    val border = "===".repeat(10)
    println("$border\n=== $title ===\n$border")
}

fun biodata(nama: String, kelas: String = "Teknologi Informasi 2A", alamat: String) {
    val biodata = """
        Nama    = $nama
        Kelas   = $kelas
        Alamat  = $alamat
    """.trimIndent()
    println(biodata)
}

fun hobby(hobby: String, desc: String) {
    println("Hobby           = $hobby")
    println("Deskripsi       = $desc")
}
