package io.submission.indonesiansatay

object SatayData {
    private val satayTypes = arrayOf("Sate Madura", "Sate Tegal", "Sate Klatak", "Sate Padang", "Sate maranggi",
    "Sate Kere", "Sate Ambal", "Sate Buntel", "Sate Lilit", "Sate Ponorogo")

    private val satayImages = intArrayOf(R.drawable.sate_madura,
    R.drawable.sate_tegal, R.drawable.sate_klatak, R.drawable.sate_padang, R.drawable.sate_maranggi,
    R.drawable.sate_kere, R.drawable.sate_ambal, R.drawable.sate_buntel, R.drawable.sate_lilit,
    R.drawable.sate_ponorogo)

    private val satayDetails = arrayOf("Sate ini sudah sangat populer, sate khas Indonesia ini berbumbu kacang dan kecap dengan irisan bawang merah dan cabai. Biasanya terbuat dari daging ayam, namun ada juga yang terbuat dari daging sapi. Sate Madura menjadi sangat populer sebagai sate khas Indonesia karena banyak penjual sate madura ini yang menjajakan dagangannya di seantero wilayah Indonesia, mulai dari yang dijajakan secara berkeliling dengan bakul yang ditaruh di atas kepala maupun yang dengan bambu atau batang kayu ditaruh di atas pundak, dan ada juga yang dijual di restoran atau warung secara menetap di suatu tempat tertentu. Sate madura disajikan dengan lontong dan irisan bawang merah dan irisan cabai rawit, selain lontong, bisa juga disajikan dengan nasi atau ketupat. Harganya juga sangat bervariasi tergantung jumlah atau porsi sajiannya dan tempat atau cara menjajakannya.",
    "Sate Tegal ini dinamai sesuai asal daerahnya, yakni di Tegal. Sate Tegal itu terbuat dari daging domba atau kambing muda yang sering disebut sebagai balibul atau kambing berusia dibawah lima bulan, sehingga dagingnya empuk, mudah digigit, dipotong-potong dadu berukuran sekitar dua sentimeter yang lalu ditusuk dengan sayatan batang bambu dan kemudian dibakar di atas bara arang kayu atau arang batok kelapa. Sate tegal bisa dikonsumsi dengan nasi, atau lontong atau ketupat.",
    "Sate yang sudah sangat terkenal akhir-akhir ini, turut menambah variasi jenis sate di Indonesia ini, terbuat dari irisan daging kambing yang diberi bumbu minimalis berupa larutan garam dan bawang putih yang lalu ditusuk dengan jeruji besi dan kemudian di bakar di atas arang kayu, hingga menimbulkan bunyi klatak-klatak yang khas. Sate klatak ini biasanya disajikan dengan pendamping berupa kuah gulai kambing, dan dengan nasi atau lontong.",
    "Sate Padang disajikan dengan bumbu khas padang yang terbuat dari larutan tepung beras berbumbu kuning atau merah, yang didominasi bumbu kunyit atau cabai merah. Sate padang ini terbuat dari jeroan sapi yang direbus dengan bumbu, ada kikil, lidah, paru, dan lain sebagainya. Namun ada juga yang membuat sate padang dari bahan bumbu ayam. Adapun bumbunya terdiri dari aneka rempah-rempah yang dicampur dengan larutan tepung beras, yakni ada jinten, ketumbar, bawang merah dan bawang putih, merica dan perbanyak kunyit jika ingin bumbunya berwarna kuning atau tambahkan dan campur dengan cabai merah dan perbanyak komposisi jumlahnya jika ingin berwarna merah. Penyajiannya bisa dengan lontong atau nasi dan dapat ditambahkan dengan keripik balado singkong.",
    "Sate maranggi ini biasanya terbuat dari daging sapi, tapi ada juga yang terbuat dari daging kambing. Yang membedakan sate maranggi ini adalah pada proses marinate atau perendaman irisan dagingnya ke dalam bumbu, sehingga tidak memerlukan saus pendamping karena bumbu sudah meresap ke dalam potongan dagingnya. Adapun bumbu rendamannya antara lain terdiri dari ketumbar, jahe, kunyit, lalu lengkuas, dan  sedikit cuka yang biasanya adalah cuka lahang, yakni cuka yang dibuat dari aren. Rasa sate maranggi ini mirip dengan dendeng.",
    "Sate kere ini agak berbeda dari sate di Indonesia yang lainnya karena tidak terbuat dari daging melainkan biasanya terbuat dari ampas tempe atau ampas tahu yang sering disebut sebagai gembus. Bumbunya adalah bumbu kecap dan gilingan kacang tanah serta irisan bawang merah. Selain gembus, sate kere biasanya juga dikombinasikan dengan irisan jeroan, seperti kikil, paru, ginjal, koyor, iso dan lain-lain yang sudah direbus dan dibumbui garam terlebih dahulu. Sate kere ini berasal dari daerah Solo.",
    "Sate ini berbumbu unik, yakni berupa tempe kukus yang dihaluskan bersama bawang merah dan bawang putih dan manisnya dari gula aren, bukan bumbu kacang. Sate ambal ini biasanya terbuat dari daging ayam kampung, yang juga sudah dibumbui lalu dibakar diatas arang batok kelapa.",
    "Sate buntel biasanya terbuat dari cacahan daging kambing yang dicacah dadu kecil-kecil yang lalu dibungkus dengan usus atau lemak kambing kemudian ditusuk dengan lidi atau sayatan bambu lalu dibakar diatas arang kayu, disajikan dengan bumbu kecap saja atau kecap yang dicampur ulekan kacang tanah.",
    "Sate lilit ini berasal dari Bali, terbuat dari cacahan daging ayam yang dicampur dengan bumbu-bumbu lalu dibalurkan pada batang sereh kemudian dibakar. Disajikan tanpa bumbu pendamping. Adapun bumbu campuran irisan daging ayamnya adalah parutan kelapa, bawang merah dan bawang putih, garam, merica, santan dan selain cacahan daging ayam juga ada yang mencampurnya dengan daging ikan tenggiri yang dihaluskan. Setelah semua bahan dicampur lalu dililitkan pada batang sereh baru kemudian dibakar sebentar saja. Selain terbuat dari daging ayam atau ikan, sate lilit juga bisa dibuat dari daging kura-kura atau penyu ada juga yang dibuat dari daging babi yang dicincang halus lalu dicampur dengan parutan kelapa dan aneka rempah lalu dibakar.",
    "Sate ini sebenarnya sama-sama berbumbu kacang tanah yang dicampur dengan kecap, biasanya terbuat dari irisan daging ayam, yang membedakannya adalah pada bentuk dan ukuran irisannya, jika pada sate ponorogo irisan daging ayamnya berbentuk irisan memanjang lalu ditusuk dengan lidi, maka pada sate lalat irisan daging ayamnya berbentuk dadu kotak namun dalam ukuran yang sangat kecil sayatannya sehingga karena saking kecilnya makanya mirip lalat yang berukuran sangat kecil sehingga disebut sebagai sate lalat. Ukuran irisan daging ayam dari sate lalat yang sangat kecil ini dimaksudkan supaya bumbu dapat lebih meresap dan lebih terasa masuk ke dalam dagingnya.")

    val listData: ArrayList<Sate>
        get() {
            val list = arrayListOf<Sate>()
            for (i in satayTypes.indices){
                val sate = Sate()
                sate.name = satayTypes[i]
                sate.photo = satayImages[i]
                sate.detail = satayDetails[i]
                list.add(sate)
            }
            return list
        }
}