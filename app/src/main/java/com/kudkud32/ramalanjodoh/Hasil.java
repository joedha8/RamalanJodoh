package com.kudkud32.ramalanjodoh;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;

public class Hasil extends AppCompatActivity {
    private TextView hsl;
    private TextView rml;
    private TextView zx;
    static String katas;
    static String kataw;
    static int hasil;
    private TextView dt;
    static  String data;

    // share button
    //private ShareButton shareButton;
    //image
    //private Bitmap image;
    //counter
    //private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.activity_hasil);
        hsl=(TextView)findViewById(R.id.persen);
        coba(hasil);
        hsl.setText(hasil+"");
        ramalan(katas, kataw);
        zx=(TextView)findViewById(R.id.zx);
        zx.setText(kataw+"");
        rml=(TextView)findViewById(R.id.ramal);
        rml.setText(katas+"");
        penjelasan(data);
        dt=(TextView)findViewById(R.id.teks);
        dt.setText(data+"");
    }
    private static void ramalan(String kata, String kata2){
        if(hasil>=0 && hasil<=25) {
            kata = "Tidak Cocok";
            kata2="Lebih pahamilah Pasangan Anda. Tetap Berjuang";
        }
        else if(hasil>25 && hasil<=50) {
            kata = "Kurang Cocok";
            kata2="Anda hanya perlu lebih peka terhadap Pasangan Anda";
        }
        else if(hasil>50 && hasil<=75) {
            kata = "Cocok";
            kata2= "";
        }
        else if(hasil>75 && hasil<=100) {
            kata = "Sangat Cocok";
            kata2="";
        }
        katas=kata;
        kataw=kata2;
    }
    private static void penjelasan(String kata){
        switch (GlobalTanggal.tgl){
            case 1: kata="Pasangan Anda mempunyai kemauan yang keras, mandiri dan percaya diri. Orang lain mungkin berkata Pasangan Anda “terlalu banyak berpikir” karena Pasangan Anda lebih suka berencana namun tidak benar-benar menjalankannya. Pasangan Anda cenderung mendiagnosa apa yang salah daripada membenahinya. Pasangan Anda memiliki pemikiran yang bagus dan suka berunding. Praktis dan idealis, Pasangan Anda menyukai hal-hal yang diukur oleh otak daripada hati Pasangan Anda. Akibatnya, walaupun Pasangan Anda mampu memberikan kasih sayang, Pasangan Anda tidak menunjukkannya terang-terangan. Di balik kemandirian Pasangan Anda, Pasangan Anda adalah seseorang yang sangat sensitif dan membutuhkan dorongan dan feedback (umpan balik) yang positif. Pasangan Anda juga memiliki kekuatan besar yang terpendam."; break;
            case 2: kata="Pasangan Anda sangat emosional dan sensitif terhadap sekitar Pasangan Anda. Walaupun kadang-kadang gugup dan pelupa, Pasangan Anda mudah sekali berteman dan mereka menyukai Pasangan Anda. Pasangan Anda memiliki sifat yang hangat dan membutuhkan kasih sayang yang ditunjukkan secara nyata. Dengan kata lain, Pasangan Anda suka dengan orang yang “berepot-repot” untuk Pasangan Anda. Penting bagi Pasangan Anda untuk menghindari perubahan suasana hati dan segala sesuatu yang membuat Pasangan Anda depresi. Meskipun Pasangan Anda menyukai benda-benda materi, Pasangan Anda tidak selalu bersungguh-sungguh untuk mendapatkannya. Bakat ritmis Pasangan Anda bisa diwujudkan dalam menulis puisi atau musik."; break;
            case 3: kata="Pasangan Anda memiliki vitalitas yang tinggi dan cepat sembuh dari penyakit. Daya imajinasi Pasangan Anda cukup bagus untuk membuat suatu cerita menarik yang berasal dari suatu kejadian kecil. Pasangan Anda memiliki kemampuan kritis dan literatur yang alami, dan membutuhkan aktivitas bervariasi untuk membuat Anda tetap sibuk. Sarat dan ekstrim dalam kasih sayang, Pasangan Anda mengalami krisis emosional di mana Pasanagan Anda mampu sembuh darinya dengan cepat. Pasangan Anda seseorang yang sosial, ekspresif di depan publik dan bersikap terbaik di depan penonton. Walaupun Pasangan Anda merasa gelisah, Pasangan Anda masih mudah merasa puas dan mampu melakukan yang terbaik dalam situasi apapun."; break;
            case 4: kata="Pasangan Anda adalah individu bersegi empat, pecinta alam, rumah, keluarga dan negara. Pasangan Andalah yang sukses dalam segala bentuk usaha produksi – manufaktur, bangunan, bisnis, tekstil. Musik, seni lukis atau seni pahat membuat Pasangan Anda merasa santai walaupun Pasangan Anda bisa mengomersialkannya juga. Pasangan Anda lebih suka memberi ide-ide dan memaksakannya sedikit kepada orang lain, menganggap Pasangan Anda sendiri sebagai penilai terakhir yang berkelakukan dan beretika benar. Kepercayaan Pasangan Anda pada kedisiplinan membuat Pasangan Anda sulit mengekspresikan perasaan, dan akibatnya Pasangan Anda mengalami penderitaan batin. Untuk urusan pekerjaan, Pasangan Anda mendorong diri bekerja tanpa mengenal lelah, dan sayangnya orang lain terkena juga. Pasangan Anda memiliki kecenderungan untuk bekerja lembur dan bila perlu, Pasangan Anda akan menjadwalkan rekreasi."; break;
            case 5: kata="Pasangan Anda mudah beradaptasi, antusias dan kadang-kadang membual. Pasangan Anda memiliki pemikiran cerdas, imajinasi aktif dan suka “membumbui” cerita Pasangan Anda. Pasangan Anda cinta kehidupan, seorang yang sehat enerjik, teman yang luar biasa dan suka dengan hal-hal yang bergerak cepat/dinamis. Hidup Pasangan Anda dipenuhi dengan pengalaman-pengalaman baru dan perubahan terus-menerus. Walaupun Pasangan Anda merupakan jenis yang menolak “terikat” dengan hal apapun, Pasangan Anda adalah tipe orang “menikah”. Pasangan Anda juga memiliki suara merdu."; break;
            case 6: kata="Pasangan Anda pecinta alam. Pasangan Anda berkembang dengan pujian dan penghargaan, tetapi goyah dengan kritikan. Dalam hubungan cinta, Pasangan Anda memberikan segalanya kepada Anda – paling tidak selama kalian berdua masih menjalin cinta. Pasangan Anda mencari kesempurnaan dan jarang mendapatkannya, sehingga Pasangan Anda berusaha mencari di tempat lainnya. Akibatnya, Pasangan Anda terkenal sebagai orang tidak dapat dipercayai. Pasangan Anda menyukai anak-anak, tapi tidak perlu memilikinya sendiri untuk hidup bahagia. Walaupun Pasangan Anda terlindungi dengan baik, Pasangan Anda terus merasa kuatir tidak mempunyai cukup uang. Mentalitas lebih dominan daripada intelektualitas, dan Pasangan Anda memiliki kemampuan acting (sandiwara) yang membuat Pasangan Anda sukses di panggung atau di dunia bisnis. Pasangan Anda memiliki kecendurangan literatur dan artisitik, dan dapat menarik uang atau dukungan bila dia perlu. Satu-satunya bidang yang tidak Pasangan Anda kuasai adalah mekanika. Berada di antara orang-orang dalam suasana yang harmonis penting bagi Pasangan Anda."; break;
            case 7: kata="Pasangan Anda adalah seorang ahli dengan daya pikir tajam untuk analisa mental yang dalam. Pasangan Anda seharusnya jangan berjudi atau berspekulasi; sebaliknya, Pasangan Anda harus memeriksa dengan teliti semua bisnis sebelum Pasangan Anda terjun di dalamnya. Berintuisi tinggi bila tidak psikis (cenayang), Pasangan Anda sebaiknya jangan pernah menuruti nasihat yang menentang insting Pasangan Anda. Pasangan Anda harus MENUNGGU untuk apa yang Pasangan Anda inginkan daripada mencarinya dengan agresif. Apa yang Pasangan Anda inginkan akan datang sendiri hanya bila Pasangan Anda tidak aktif mencarinya. Pasangan Anda berbakat memainkan alat musik bersenar (termasuk piano) dan organ. Pasangan Anda juga berpenilaian bagus dalam bidang keuangan. Pendapat Pasangan Anda tegas, dan Pasangan Anda tidak suka mengubahnya. Pasangan Anda mengalami kesulitan beradaptasi secara fisik dan Pasangan Anda cenderung menyendiri, di mana keduanya membuat pernikahan Pasangan Anda menjadi sulit. Luangkan waktu setiap harinya untuk bersantai dan meditasi."; break;
            case 8: kata="Pasangan Anda seorang yang kreatif dan produktif ditambah dengan kepandaian berbisnis. Progresif dan berwawasan luas, Pasangan Anda akan sukses menangani masalah umum atau kepentingan publik, namun sebaiknya hindari kerja sama seimbang karena Pasangan Anda perlu berada di posisi yang mengambil keputusan terakhir. Bisnis besar, perusahaan atau pemerintah adalah bidang Pasangan Anda, di mana Pasangan Anda harus menunjukkan kejujuran dan integritas agar tetap sukses. Lebih suka buku daripada membaca, Pasangan Anda juga lebih suka melakukan hal berhubungan dengan uang besar; bila Pasangan Anda memilikinya, Pasangan Anda akan memberikan sejumlah uang besar kepada institusi atau badan amal. Pasangan Anda kadang sok pamer dan menginginkan keluarga Pasangan Anda menjadi kepercayaan Pasangan Anda."; break;
            case 9: kata="Pasangan Anda adalah orang yang publisitas, distribusi, seni, wawasan luas dan perikemanusiaan (definisi dari film The Wizard of Oz adalah “melakukan hal yang baik”). Pasangan Anda tertarik dalam bidang metafisika dan menghubungkannya dengan apa yang sedang terjadi di dunia ini. Berpendidikan, artistik dan berkemauan keras, Pasangan Anda adalah pemimpin alamiah yang dapat sukses dalam segala sesuatu berbau artistik, seperti menulis, mengajar, hukum, penerbitan atau pastoral. Pasangan Anda memerlukan pendidikan luas sehingga Pasangan Anda bisa memilih pekerjaan dengan lebih baik. Pasangan Anda milik dan berada di dalam dunia yang membuat Pasangan Anda sulit untuk menjalani kehidupan pribadi yang sukses. Pernikahan akan berakhir di tengah-tengah jalan hidup Pasangan Anda, baik karena kematian, perceraian atau perpisahan walaupun cinta tetap ada. Kehidupan Pasangan Anda sebenarnya dipenuhi dengan perjalanan jauh dan banyak perubahan."; break;
            case 10: kata="Pasangan Anda adalah seseorang dengan banyak minat dan mampu melakukan beberapa hal dalam waktu yang sama. Banyak orang lain yang bergantung pada Pasangan Anda, tetapi sedikit yang menawarkan bantuan sehingga Pasangan Anda merasa terasing dan sendirian. Pasangan Anda memiliki pemikiran bagus dan kemauan keras, dan merupakan promotor ahli bagi hal-hal yang Pasangan Anda percayai. Sehubungan dengan teman dan harta benda, Pasangan Anda kadang cemburu dan eksklusif – Pasangan Anda tidak ingin berbagi. Bakat kreatif Pasangan Anda paling tepat diwujudkan dalam dunia bisnis, sedangkan seni, terutama musik atau melukis, hanyalah aktivitas sampingan saja. Pasangan Anda termasuk orang ramah, tapi Pasangan Anda tidak menyukai detil-detil perawatan rumah. Vitalitas membuat Pasangan Anda cepat sembuh dari sakit fisik dan emosional."; break;
            case 11: kata="Pasangan Anda adalah individu yang penuh inspirasi dan imajinatif dengan kebulatan tekad dan ketekunan, tetapi juga disertai dengan keragu-raguan. Dengan sifat ini, Pasangan Anda begitu dramatis dalam pikiran dan tindakan, brilian, cerdik, namun juga gugup dan tegang. Pasangan Anda bereaksi cepat dan perlu hati-hati agar intelektualitas Pasangan Anda tidak menutupi intuisi. Pasangan Anda cenderung menekankan kode moral Pasangan Anda sendiri kepada orang lain dan tidak meyukai kelemahan manusia. Gairah Pasangan Anda tinggi, berlebihan dan tidak beralasan; sebenarnya, Pasangan Anda adalah orang yang ekstrim, kadang serasa di awang-awang, kadang serasa di dalam jurang gelap. Dalam bereaksi terhadap suasana ekstrim ini, hindari pembenahan yang terlalu berlebihan. Perhatikan kesehatan Pasangan Anda, dan hindari kecenderungan untuk egois, serakah dan membual tentang dirinya sendiri."; break;
            case 12: kata="Pasangan Anda adalah seseorang yang brilian, magnetis, imajinatif dan sosok pembicara bagus yang sangat meyakinkan dalam argumentasi. Karena Pasangan Anda memiliki pemikiran seimbang, cenderung artistik serta menikmati hidup dan aksi, Pasangan Anda bisa sukses sebagai pengacara, aktor/aktris atau bekerja di bidang penjualan dan periklanan. Idealisme tinggi Pasangan Anda menuntut adanya “misi” dalam kehidupan. Pasangan Anda perlu mempertahankan aktivitas intelektual untuk menghindari naik-turun (roda kehidupan) yang merupakan kelemahannya. Bakat desain Pasangan Anda bisa disalurkan lewat arsitektur atau dekorasi interior. Genit dan cenderung berselingkuh, Pasangan Anda butuh menyelesaikan apa yang Pasangan Anda mulai dan berusahalah untuk tidak menimbulkan masalah."; break;
            case 13: kata="Pasangan Anda adalah orang yang menunjukkan adanya teka-teki dalam sebuah kontradiksi, kreativitas, ekspansi dan keresahan dibalik keteraturan dan keterbatasan. Pasangan Anda sensitif dan spiritual, menderita karena lingkungan Pasangan Anda sendiri, dan suka marah. Pemikiran Pasangan Anda diseimbangkan oleh kemauan keras, dan walaupun Pasangan Anda memiliki cinta yang kuat, Pasangan Anda jarang menunjukkannya dan menderita karenanya. Karena salah paham, Pasangan Anda sering dianggap bertemperamen tinggi dan tidak masuk akal. Walaupun Pasangan Anda cenderung bersifat diktator, Pasangan Anda adalah seorang manajer yang bagus. Kesuksesan terbaik Pasangan Anda berhubungan dengan tanah – pertambangan, geologi, konstruksi praktis. Pasangan Anda juga bersifat dikotomi, di mana Pasangan Anda menyukai memakai seragam tetapi membenci perang. Rumah berarti penting bagi kebahagiaan Pasangan Anda."; break;
            case 14: kata="Pasangan Anda adalah seseorang yang cakap dan berkepribadian rangkap dengan pemikiran logis dan percaya pada ramalan. “Beruntung” dalam permainan dan kontes, Pasangan Anda adalah seorang petaruh dan penjudi alami. Kesuksesan Pasangan Anda terletak pada bisnis besar, tetapi Pasangan Anda membutuhkan ekspresi artistik untuk rekreasi dan “mendinginkan kepala”. Sangat emosional, Pasangan Anda selalu dapat menarik hati melalui perasaan dan simpati Anda. Pasangan Anda cenderung membutuhkan perubahan konstan – obat-obatan, alkohol, dan bercinta dengan siapa saja dan bentuk pelepasan seksual berlebihan lainnya. Pasangan Anda bisa juga menjembatani antara dunia fana dengan spiritual, dan memiliki kekuatan besar untuk membangun atau menghancurkan – sesuai dengan pilihan Pasangan Anda."; break;
            case 15: kata="Pasangan Anda adalah seseorang berbakat yang berada dalam perlindungan yang bersifat baik dan harmonis yang meresap pengetahuan daripada belajar keras. Sebenarnya, Pasangan Anda menarik banyak hal – teman, hadiah, uang, kesempatan dan memiliki impresi kemudaan dan kesehatan. Pasangan Anda rela berkorban diri demi suatu hal yang baik atau demi menolong teman, tetapi Pasangan Anda tidak ingin didominasi. Pasangan Anda berpikiran ilmiah tetapi Pasangan Anda sering berekspresi lewat musik; walaupun kesuksesan Pasangan Anda terletak pada karir profesional, musik memegang peranan penting dalam hidup Pasangan Anda. Pasangan Anda mencintai rumah, dan walaupun Pasangan Anda bersifat demonstratif dan murah hati, Pasangan Anda lebih menyukai berderma secara individual dibandingkan berperikemanusiaan secara institusi."; break;
            case 16: kata="Pasangan Anda adalah orang yang gugup dan mudah tersinggung yang suka menimbulkan masalah dan keruwetan di mana nantinya Pasangan Anda menderita akan akibatnya. Suka menyendiri, Pasangan Anda tetap saja berpijak pada rumah dan kasih sayang. Walaupun Pasangan Anda bisa berhasil dalam bidang kesusasteraan, kemampuan Pasangan Anda berlogika dan analisis menuntut penyaluran lewat bidang bisnis juga. Meskipun Pasangan Anda tidak aktif dan agresif, Pasangan Anda tidak suka rencana Pasangan Anda dicampuri atau dihalangi oleh lainnya. Pasangan Anda cenderung menunda melakukan sesuatu padahal Pasangan Anda tahu untuk mengerjakannya saat itu juga, dan Pasangan Anda terlalu memikirkan diri sendiri. Pasangan Anda sangat menginginkan kasih sayang, tetapi Pasangan Anda tidak perlu bersusah payah untuk mendapatkannya."; break;
            case 17: kata="Pasangan Anda adalah seseorang yang berpikiran tinggi, bangga pada dirinya, kadang liberal, kadang konservatif, murah hati atau kikir, hemat atau foya-foya. Berpegang teguh pada ide-ide sendiri, Pasangan Anda jarang menyerah pada orang lain; dalam bidang bisnis, Pasangan Anda terbaik dengan memegang jabatan kepala/pimpinan perusahaan dan bekerja dengan rekanan di bawah Pasangan Anda. Pasangan Anda melakukan apa yang ingin Pasangan Anda lakukan, berbakat dalam mengatur minat dan kepentingan orang lain, dan tertarik untuk berurusan dengan sesuatu yang besar. Detil-detil dipercayakan kepada orang lain karena Pasangan Anda benci direpotinya. Pasangan Anda sukses dalam bidang bisnis yang berhubungan dengan tanah (misalnya pertambangan, lansekap, minyak, peternakan), dan juga dalam mengarang meskipun Pasangan Anda senang menulis tentang sejarah atau teknis daripada menulis fiksi. Pasangan Anda menyukai pengetahuan umum dan suka menjelajah/menyelidiki. Bila berhubungan dengan hal-hal spiritual, Pasangan Anda menginginkan bukti dulu."; break;
            case 18: kata="Pasangan Anda adalah orang yang hidupnya dipenuhi dengan perubahan, aktivitas dan perjalanan. Pasangan Anda suka bertanggung jawab terhadap kesejahteraan orang banyak atau komunitas, yang cocok dengan sifat suka menolong Pasangan Anda. Banyak yang diharapkan dari Pasangan Anda karena banyak juga yang diberikan kepada Pasangan Anda: kemandirian, efisiensi dan perikemanusiaan. Karena Pasangan Anda tidak suka dengan nasihat, Pasangan Anda juga jarang membutuhkannya. Pasangan Anda tertarik dengan bidang luas yang membutuhkan administrasi efisien (seperti hukum, politik, agama), dan walaupun usaha pertama Pasangan Anda tidak selalu berhasil, Pasangan Anda akan berhasil pada usaha berikutnya, jadi berusahalah terus. Kadang emosional, Pasangan Anda sebenarnya intelektual dan menyukai logika serta argumentasi. Sifat ini membuat Pasangan Anda cocok sebagai kritikus drama, penulis atau pembicara. Dalam bidang keuangan, Pasangan Anda tidak pernah terburu-buru karena Pasangan Anda merasa bertanggung jawab sekali dalam mengatur aset material. Pernikahan atau pertunangan yang terjadi di tengah-tengah jalan kehidupan Pasangan Anda akan terputus."; break;
            case 19: kata="Pasangan Anda adalah orang yang Logis, tekun, ulet, praktis, artistik dan universal, Pasangan Anda bisa berada di puncak ketinggian atau jatuh ke lubang yang dalam sehubungan dengan tindakan dan emosi. Pasangan Anda mandiri dan tidak menyerah pada keterbatasan. Kemandirian ini merupakan sumber ketidaksukaan Pasangan Anda terhadap undang-undang masyarakat, yang mana tidak Pasangan Anda ikuti dalam kehidupan pribadi tanpa menyinggung publik. Kepandaian Pasangan Anda dalam banyak hal menciptakan banyak pilihan karir meskipun Pasangan Anda lebih cocok menjadi seorang profesional daripada terjun dalam bidang bisnis. Rasa tanggung jawab dan dorongan hati yang kuat Pasangan Anda untuk mencapai kondisi yang lebih baik membekali Pasangan Anda untuk terjun dalam dunia politik bila Pasangan Anda memang tertarik. Pasangan Anda menyukai perubahan dan variasi, selalu mengubah keadaan di sekitar Pasangan Anda dan akan beradaptasi terhadapnya."; break;
            case 20: kata="Pasangan Anda adalah orang yang cocok untuk usaha kecil serta berada dalam suasana keakraban dan protektif. Pasangan Anda memilih bekerja bekerja sama dengan orang lain daripada menanggung semua tanggung jawab sendiri, dan kadang tidak tertarik untuk berkembang untuk usaha/bidang yang lebih besar. Walaupun Pasangan Anda lebih baik berekspresi lewat tulisan daripada secara lisan di depan publik, rasa iba naluriah dan sensitivitas yang dimiliki membuat Pasangan Anda cocok di bidang politik dan pendeta. Simpatik dan penuh kasih sayang, Pasangan Anda mampu memperoleh pengetahuan yang cukup dan sebaiknya mendapatkan pendidikan yang tinggi. Perhatian pada detil membuat Pasangan Anda cocok dengan profesi yang membutuhkan sifat tersebut, seperti hukum perusahaan dan manajemen properti. Pasangan Anda lebih memilih hidup di pedesaan ketimbang di kota serta sangat berkepentingan dalam rumah, keluarga dan teman. Walaupun Pasangan Anda suka menolong, Pasangan Anda tidak tertarik terhadap kerja jasmani yang dapat dihindari. Musik meringankan pikiran Pasangan Anda walapun Pasangan Anda sebaiknya melakukannya dalam sebuah grup daripada bersolo karir."; break;
            case 21: kata="Pasangan Anda adalah orang yang dikarunia dengan nyanyian dan suara merdu yang merupakan aset berharga. Mempesona dan musikal, menyukai kecantikan, seni dan tari, Pasangan Anda terkadang gugup dan tegang. Pasangan Anda perlu berpegang pada keengganan yang tidak dapat dijelaskan terhadap hal dan orang tertentu. Berhubungan dengan cinta, Pasangan Anda cenderung bersikap menerima daripada mengekspresikannya secara aktif, tetapi Pasangan Anda meletakkan harga diri besar pada obyek yang menjadi pusat perhatian Pasangan Anda. Imajinasi aktif Pasangan Anda sering membuat Pasangan Anda curiga sendiri, yang akan mengakibatkan masalah serius dalam hubungan, terutama dalam pernikahan. Hindari kecenderungan untuk berpikir terus-menerus atau menjadi depresi. Sudah menjadi sifat Pasangan Anda tertarik pada buku, penerbitan, editing (pemeriksaan) dan bidang lain yang mirip, sehingga kesuksesan Pasangan Anda terletak pada bidang apa saja yang berhubungan dengan pendidikan."; break;
            case 22: kata="Pasangan Anda adalah sosok yang penuh energi yang berfungsi pada dua dunia: obyektif dan subyektif. Pasangan Anda penuh dengan getaran, gugup dan gairah; Pasangan Anda perlu istirahat dan ketenangan untuk “mengisi” dan menjaga keseimbangan Pasangan Anda. Sangat intuitif, Pasangan Anda sebaiknya berpijak pada impresi pertama yang didapat. Walaupun Pasangan Anda memiliki kekuatan yang terbatas, Pasangan Anda selalu saja berada di antara mengekspresikan idealisme Pasangan Anda dan menjaganya dalam batasan konstruktif. Pasangan Anda memiliki misi utilitarianisme universal, yang mana hanya menyisakan sedikit ruang bagi ambisi pribadi. Sukses besar Pasangan Anda terletak pada bidang yang penuh sistem, dalam area mana saja selama cocok dengan idealisme Pasangan Anda dan menghasilkan kebaikan. Hindari transaksi yang meragukan atau ilegal; Pasangan Anda pasti akan tertangkap dan menderita karenanya."; break;
            case 23: kata="Pasangan Anda adalah orang yang simpatik, sensitif, penuh pengertian dan berpikiran praktis. Pasangan Anda memiliki bakat untuk mendiagnosa penyakit fisik, sehingga Pasangan Anda akan meraih sukses bila bekerja di bidang kedokteran atau pengobatan (tetapi bukan bedah, karena “misi” Pasangan Anda adalah untuk membangun dan menyembuhkan bukan merobek atau menghancurkan). Kemampuan teknis dan praktis Pasangan Anda bisa menimbulkan minat pada bidang hukum, kimiawi atau saham, tetapi Pasangan Anda terlalu praktis untuk bisa berhasil di bidang seni. Sanggup menghidupi diri sendiri, populer dan sosial, Pasangan Anda tidak menderita dari rasa rendah diri. Pasangan Anda memperoleh banyak dari kehidupan karena Pasangan Anda mencoba yang terbaik dari segala situasi. Pasangan Anda merupakan teman baik yang rela bertanggung jawab."; break;
            case 24: kata="Pasangan Anda adalah sosok yang sangat aktif yang selalu berusaha maju terus agar tidak membuang-buang energi. Walaupun Pasangan Anda berkonsentrasi pada satu hal dalam suatu waktu, Pasangan Anda hidup dengan perubahan konstan; Pasangan Anda bukanlah tipe orang pensiunan karena Pasangan Anda butuh untuk terus berkembang. Pasangan Anda sangat terikat pada seni, dan memiliki bakat alami untuk tampil di atas panggung – secara alami, Pasangan Anda cocok dalam bidang drama, tetapi Pasangan Anda lebih sukses dalam bidang bisnis atau properti. Penampilan tidak penting bagi Pasangan Anda, jadi Pasangan Anda tidak begitu mementingkan waktu dan uang. Pada dasarnya, Pasangan Anda praktis, dengan sedikit mimpi dan kecendurangan besar untuk melebihkan kesenangan dan penderitaan Pasangan Anda. Anda juga bersifat domestik secara alami, dibarengi dengan rasa ego yang telah berkembang dan akan belajar banyak melalui pengamatan Pasangan Anda. Hindari depresi, kecemburuan dan kekuatiran."; break;
            case 25: kata="Pasangan Anda adalah orang yang secara alami dapat meramal dan sangat intuitif dengan kemampuan gaib yang kuat. Pasangan Anda cenderung berterus-terang dalam menyatakan perasaan Pasangan Anda dan tidak selalu dimengerti oleh orang lain. Berbakat artistik, Pasangan Anda bisa mengomersialkan berbagai lahan seni yang Anda sukai. Kesuksesan juga bisa diraih lewat profesi, bisnis atau bidang politik. Pasangan Anda cenderung untuk bimbang dan tidak konsisten, dan Pasangan Anda akan menderita karenanya sampai Pasangan Anda bisa menghilangkan kecenderungan ini. Penting sekali bagi Pasangan Anda untuk belajar berkonsentrasi, berpikir stabil dan membuang jauh rasa rendah diri, iba pada diri sendiri dan depresi. Kasih sayang adalah kelemahan terbesar Pasangan Anda. Pasangan Anda harus selalu berada di jalan lurus dan sempit, karena Pasangan Anda cenderung keluar dari jalan tersebut dan tertarik untuk berkhotbah tetapi bertindak keterlaluan. Idealistis dan penuh harapan, Pasangan Anda perlu memerangi rasa malas Pasangan Anda."; break;
            case 26: kata="Pasangan Anda adalah orang yang penuh dengan lemari dan laci, karena bagi Pasangan Anda tidak ada yang terlalu kecil untuk fungsi praktis, dan Pasangan Anda baru mengetahui membutuhkan satu hal setelah Pasangan Anda membuangnya. Pasangan Anda sangat introspektif dan cenderung hidup dengan bayang-bayang masa lalu – ke perusakan masa sekarang dan masa depan. Walaupun Pasangan Anda memulai banyak hal, Pasangan Anda menemui kesulitan untuk menyelesaikannya, dan Pasangan Anda sendiri yang memilih untuk meningkat atau jatuh di bawah rata-rata. Pasangan Anda bisa mengomersialkan semua lahan seni – kecuali musik – dengan langkah yang besar. Pasangan Anda bisa sukses di bidang politik dan diplomasi, dan seharusnya Pasangan Anda memperoleh pendidikan tinggi. Pasangan Anda adalah tipe “menikah” serta memiliki sifat domestik yang indah, mencintai rumah dan anak-anak. Tidak puas dengan milik Pasangan Anda dan menyukai warna-warna yang terlihat pada pakaian yang dikenakan, Pasangan Anda sebenarnya tidak terlalu menekankan pada kepuasan fisik dan sangat murah hati pada orang lain."; break;
            case 27: kata="Pasangan Anda adalah seseorang yang tertarik dengan kekayaan materi. memiliki ikatan pernikahan yang kuat walaupun pengalamannya mungkin mengecewakan. Pasangan Anda adalah pemimpin yang kuat, agak tekun, terkadang aneh dan tidak puas dengan kedudukan sebagai bawahan. Pasangan Anda juga tidak suka bertanggung jawab terhadap tindakan Pasangan Anda. Trampil dalam berbagai hal dan artistik, Pasangan Anda juga memiliki bakat literatur dan bisa menjadi jurnalis, penulis, dosen atau guru. Pasangan Anda bergairah dalam kasih sayang tetapi cenderung berlebihan. Keagamaan Pasangan Anda lebih condong ke nilai-nilai religius Timur dan jauh dari ortodoks."; break;
            case 28: kata="Pasangan Anda adalah sosok yang memiliki kemauan keras, dominan dan ulet yang penuh dengan rasa cinta dan rela berkorban demi cinta. Sehubungan dengan ini, pernikahan Pasangan Anda mungkin tidak konvesional, tetapi Pasangan Anda selalu berusaha menjaganya sesuai dengan idealisme Pasangan Anda. Bersifat eksekutif (melaksanakan sesuatu), Pasangan Anda ingin tampil unggul dan akan berkorban untuk meraihnya. Kecenderungan Pasangan Anda untuk melamun dan membuang-buang waktu dapat menghapus kemampuan Pasangan Anda, sehingga tekanlah rasa malas yang muncul agar tidak sampai menguasai diri Pasangan Anda. Rasa kecewa Pasangan Anda kebanyakan datang dari melebih-lebihkan segala yang menjadi perhatian Pasangan Anda. Kebebasan penting bagi Pasangan Anda; Pasangan Anda menderita bila dikekang atau dibatasi dalam segala hal. Hati-hati, jangan sampai menurunkan idealisme Pasangan Anda sekali Pasangan Anda mewujudkannya, karena hal ini akan menjauhkan Pasangan Anda dari keberhasilan Pasangan Anda."; break;
            case 29: kata="Pasangan Anda adalah orang yang menunjukkan inspirasi, kerohanian dan kepemimpinan. Pasangan Anda mimiliki kemampuan unik untuk menyatukan pihak-pihak yang berbeda dan dapat menengahi masalah kerja atau menyatukan perbedaan agama. Kekuatan Pasangan Anda besar; Pasangan Anda dapat menggunakannya untuk membawa kehormatan atau kehancuran bagi diri Pasangan Anda dan orang lain – sesuai dengan pilihan Pasangan Anda. Pasangan Anda berlaku ekstrim dalam segala hal, hebat dalam cinta dan penilaian. Rumah penting bagi kebahagiaan Pasangan Anda, tetapi Pasangan Anda suka murung dan tegang, dan tidak mudah hidup bersama Pasangan Anda. Pasangan Anda terpaku pada mimpi, aspirasi dan rencana Pasangan Anda, dan melupakan perasaan orang-orang di sekitar Pasangan Anda. Pasangan Anda memerlukan kerja yang pasti untuk membuat Pasangan Anda seimbang dan efisien."; break;
            case 30: kata="Pasangan Anda adalah sosok yang vital, gugup dan jarang sakit karena kekebalan tubuh. Pasangan Anda perlu menghindari berbagai jenis obsesi dan sebaiknya jangan mencoba kekuatan gaib untuk bersenang-senang. Tetapkan pendapat Pasangan Anda. Pasangan Anda selalu berpikir Andalah yang benar, mendasarkan kesimpulan Anda pada pengetahuan sedikit yang dilengkapi dengan imajinasi dan intuisi Pasangan Anda sendiri. Bersifat setia dan seorang teman baik, Pasangan Anda bisa menjadi guru, penulis atau pekerja sosial yang bagus. Pasangan Anda genit dan suka diterimakasihi untuk hal-hal yang Pasangan Anda kerjakan. Walaupun Pasangan Anda dapat menjadi seorang manajer yang sempurna, Pasangan Anda sangat tidak menyukai kerja."; break;
            case 31: kata="Pasangan Anda adalah sosok yang sebaiknya tidak bermain-main dengan fenomena psikis. Aspirasi Pasangan Anda tidak selalu masuk akal yang akhirnya menyebabkan kekecewaan; Pasangan Anda perlu penerapan praktis, berusaha keras dan sabar agar kerja Pasangan Anda berhasil. Pasangan Anda tidak suka hidup sendiri dan tanggung jawab adalah stabilisator bagi Pasangan Anda, sehingga Anda bolehlah dikatakan sebagai tipe “menikah”. Pasangan Anda memiliki keahlian bisnis, tetapi Pasangan Anda harus sadar akan kecenderungan Pasangan Anda sendiri untuk menghabiskan uang dan menghambur-hamburkan aset berharga secara sembrono. Dekorasi interior, menulis, kimiawi dan farmasi (Pasangan Anda berbakat dalam meracik obat-obatan) adalah bidang karir yang cocok buat Pasangan Anda. Pasangan Anda tidak pernah melupakan kebaikan – atau luka."; break;
        }
        data=kata;
    }
    /*private int presentase(){
        Random tian = new Random();
        int a[];
        a = new int[100];
        return tian.nextInt(100);
    }*/
    private static void coba(int akhir){
        double persen=0;
        double aku=0;
        double dia=0;
        double ha;
        int tanggal;
        String a=Mulai.nama1.getText().toString();
        String b=Mulai.nama2.getText().toString();
        aku=a.length();
        dia=b.length();
        tanggal=GlobalTanggal.tgl;
        if(aku<dia){
            ha=aku / dia;
            persen=ha*100;
            if(persen>=50)
                persen=persen-tanggal;
            else if(persen<50)
                persen=persen+tanggal;
        }
        if(aku>dia){
            ha=dia / aku;
            persen=ha*100;
        }
        if(aku==dia){
            ha=aku / dia;
            persen=(ha*100)-tanggal;
        }
        if(Mulai.nama1.getText().toString().equals("yudha") || Mulai.nama1.getText().toString().equals("salsa") && Mulai.nama2.getText().toString().equals("yudha") || Mulai.nama2.getText().toString().equals("salsa"))
            persen=100;
        akhir= (int) persen;
        hasil=akhir;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        final int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_share) {
            Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.ssshare);
            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("image/jpeg");
            sharingIntent.setType("text/plain");
            String shareBody = Mulai.nama1.getText().toString() + " dengan " + Mulai.nama2.getText().toString() + " memiliki tingkat kecocokan sampai " + hasil + "%" + "\nBagaimana dengan mu?" + "\n" + " https://play.google.com/store/apps/details?id=com.kudkud32.ramalanjodoh";
            ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            b.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
            String path = MediaStore.Images.Media.insertImage(getContentResolver(),
                    b, "Title", null);
            Uri imageUri =  Uri.parse(path);
            sharingIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
            //sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, Mulai.nama1.getText().toString() + " dengan " + Mulai.nama2.getText().toString() + " memiliki tingkat kecocokan sampai " + hasil + "%" + "\nBagaimana dengan mu?");
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(sharingIntent, "Share via"));
            /*if(counter == 0) {
                //save the screenshot
                View rootView = findViewById(android.R.id.content).getRootView();
                rootView.setDrawingCacheEnabled(true);
                // creates immutable clone of image
                image = Bitmap.createBitmap(rootView.getDrawingCache());
                // destroy
                rootView.destroyDrawingCache();

                //share dialog
                AlertDialog.Builder shareDialog = new AlertDialog.Builder(this);
                shareDialog.setTitle("Share Screen Shot");
                shareDialog.setMessage("Share image to Facebook?");
                shareDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //share the image to Facebook
                        SharePhoto photo = new SharePhoto.Builder().setBitmap(image).build();
                        SharePhotoContent content = new SharePhotoContent.Builder().addPhoto(photo).build();
                        shareButton.setShareContent();
                        counter = 1;
                        shareButton.performClick();
                    }
                });
                shareDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                shareDialog.show();
            }
            else {
                counter = 0;
                //shareButton.setShareContent();
            }*/
            //share();
            //Toast.makeText(Hasil.this,"Coming Soon",Toast.LENGTH_SHORT).show();
            //return true;
        }

        if (id == android.R.id.home){
            //finish();
            Intent intent=new Intent(Hasil.this, Mulai.class);
            startActivity(intent);
            Mulai.nama1.setText("");
            Mulai.nama2.setText("");
            Mulai.tgl.setText("");
        }

        return super.onOptionsItemSelected(item);
    }

    /*private void share() {
        //check counter
        if(counter == 0) {
            //save the screenshot
            View rootView = findViewById(android.R.id.content).getRootView();
            rootView.setDrawingCacheEnabled(true);
            // creates immutable clone of image
            image = Bitmap.createBitmap(rootView.getDrawingCache());
            // destroy
            rootView.destroyDrawingCache();

            //share dialog
            AlertDialog.Builder shareDialog = new AlertDialog.Builder(this);
            shareDialog.setTitle("Share Screen Shot");
            shareDialog.setMessage("Share image to Facebook?");
            shareDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    //share the image to Facebook
                    SharePhoto photo = new SharePhoto.Builder().setBitmap(image).build();
                    SharePhotoContent content = new SharePhotoContent.Builder().addPhoto(photo).build();
                    shareButton.setShareContent(content);
                    counter = 1;
                    shareButton.performClick();
                }
            });
            shareDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            shareDialog.show();
        }
        else {
            counter = 0;
            shareButton.setShareContent(null);
        }
    }*/
}