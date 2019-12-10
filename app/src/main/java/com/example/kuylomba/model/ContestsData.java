package com.example.kuylomba.model;

import com.example.kuylomba.R;

import java.util.ArrayList;

public class ContestsData {
    private static String[] names = {
            "Lomba Infografi dan LKTI Pelajar 2020 di Universitas Hang Tuah",
            "All About Photos Award",
            "KACER MANIA BLITAR CUP I",
            "Angop Tournament Season 1 Mobile Legends",
            "Lomba Menulis Essay dan Desain Poster Nasional LogistiChamp 2020 di UISI",
            "ANNIVERSARY 6TH PUTRA CANDI BC, BLITAR",
            "Lomba Semar Infografpichs Nasional 2020 di UNS",
            "Funtime with Citrex Gummy Fish Oil 2019",
            "PIALA RADJA TEMBAKAU",
            "Kontes Selebrasi Akhir Tahun Silverqueen Berhadiah Puluhan Smartphone",
            "Prisma International Art Prize 2020"
    };

    private static int[] stars = {
            5,
            4,
            3,
            5,
            3,
            2,
            5,
            5,
            4,
            5,
            5,
    };

    private static String[] descriptions = {
            "Hallo semuanya para pembaca website informasi lomba 2020, dalam postingan kali inilah mimin akan membagikan terkait dengan adanya kompetisi menulis dan desain inforgrafis yang mana dalam agenda ini sendiri diselenggarakan oleh HIMPUNAN MAHASISWA FARMASI Universitas Hang Tuah dalam serangkaian agendanya dengan nama PHARCOM UHT 1.0 2020.",
            "The competition is organised by All About Photo magazine.\n\nThere is no specific theme.\n\nThe competition is open to all genres and subject matter will be considered. All types of photography, from digital to analog to alternative processes and beyond are encouraged to enter. All works must be original.\n\nView 2019 Winners.",
            "DI GANTANGAN KANIGORO BC (Sebelah Timur Lapangan Ds. Tlogo, Kec. Kanigoro, Kab. Blitar)",
            "[CALLING ALL GAMERS] Tunjukkan skillmu dan bawa pulang hadiah dalam angop Tournament season 1\n" +
                    "Total hadiah Jutaan rupiah!\n" +
                    "\n",
            "Pada dasarnya LogistiChamp merupakan serangkaian lomba tingkat nasional yang diperuntukkan Siswa SMA/MK/MA sederajat yang memiliki tujuan untuk memicu cara berfikir logis, serta mengasah kreatifitas yang dimiliki khususnya di dalam bidang LOGISTIK. dengan pilihan lombanya terdiri atas lomba menulis essay dan lomba desain poster.\n",
            "DI GANTANGAN PUTRA CANDI BC (PCBC), DS. SAWENTAR, KEC. KANIGORO, KAB. BLITAR\n" +
                    "\nINFO LOMBA: P. GINTO 081558837044\n" +
                    "\n",
            "Hallo semuanya para pembaca setia yang senantiasanya menanti postingan terkait dengan lomba 2020, dalam kabar inilah kami selaku mimin akan membagikan adanya lomba desain nasional dimana acara ini sendiri diselenggarakan oleh SIM UNS dalam serangkaian agendanya Festival Ilmiah Mahasiswa (FILM) 2020 dengan nama lombanya ialah \"SEMAR INFOGRAPICHS COMPETITION\".Juara 1 : Rp2.500.000 + Trofi + Sertifikat\n" +
                    "Juara 2 : Rp1.750.000 + Trofi + Sertifikat\n" +
                    "Juara 3 : Rp1.250.000 + Trofi + Sertifikat\n" +
                    "Semua Peserta yang Mendaftar Mendapat E-Sertifikat\nTanggal : Minggu, 22 Desember 2019\n" +
                    "Tempat : Bekasi Cyber Park, Jl. KH Noer Ali No. 177 , Kota Bekasi\n",
            "LOMBA MEWARNAI IBU & ANAK :\n" +
                    "\n" +
                    "Kategori Anak TK B\n" +
                    "Registrasi Rp 15.000 (mendapatkan produk CITREX GUMMY FISH OIL)\n" +
                    "Membawa alat mewarnai & meja saat lomba\n" +
                    "LOMBA YEL-YEL ANTAR GURU TK :\n" +
                    "\n" +
                    "Free Registrasi\n" +
                    "Per group 3 orang\n" +
                    "Mewakili Sekolah TK Peseta Lomba Mewarnai\n" +
                    "Yel-Yel wajib menggunakan kata-kata CITREX GUMMY FISH OIL UPIN & IPIN\n" +
                    "Hadiah :\n" +
                    "\n" +
                    "Lomba Mewarnai Ibu & Anak :\n" +
                    "Juara 1, 2, 3 : Uang Tunai + Piala + Piagam + Goodiebag\n" +
                    "Harapan 1, 2, 3  : Uang Tunai + Piala + Piagam + Goodie Bag\n" +
                    "Favorit : Piala + Piagam + Goodie Bag\n" +
                    "Lomab Yel – Yel Antar Guru TK :\n" +
                    "Juara 1, 2, 3 ( Per Group) : Uang Tunai + Goodie Bag\n" +
                    "Harapan, 1, 2, 3 (Per Group) : Uang Tunai + Goodie Bag\n" +
                    "Favorit (Per Group) : Goodie Bag\n" +
                    "More Information :\n" +
                    "\n" +
                    "Rika : 085295144569\n" +
                    "Aidil : 082127501416\n" +
                    "This Event Full Supported by EVENTJAKARTA\n" +
                    "\n",
            "Lokasi: PUJASERA TEMANGGUNG (EX GEDUNG BIOSKOP)\n" +
                    "\n",
            "Promo terbaru kali ini datang dari Silverqueen. Mengajak alfamart, silverqueen menyelenggarakan program promosi New year end celebration yang berlangsung sampai 31 desember 2019.\n" +
                    "\n" +
                    "Program ini adalah kontes foto dimana anda bisa memenangkan hadiah lima total puluhan smartphone dan smartwatch gratis jika beruntung. Caranya dengan upload foto saja gak perlu spam, dan pastinya kamu harus mentaati aturan yang berlaku.\n" +
                    "\n",
            "The cultural association Il Varco is glad to announce its 3rd Prisma Art Prize, an exhibition entirely organized by artists for the artists.\n" +
                    "\n" +
                    "Bringing together the spirit of community and collaboration and the efforts of many young artists involved, it is meant to create a place for art and artists to grow and share their work in a friendly and competitive environments with no favoritism.\n" +
                    "\n" +
                    "Prisma Art Prize is a painting competition with $2,000+ in cash awards and many other prizes. It takes place seasonally and concludes with an annual group exhibit in Rome.\n" +
                    "\n" +
                    "The 3rd exhibition will take place in 2020 at the Atelier Montez, a contemporary art factory born in 2012 from the redevelopment of an urban wreck between the Natural Reserve of the Aniene and the historical outskirts of Rome, Pietralata, built on a project by the Artist Gio Montez, Giacomo Capogrossi and the architect Francesco Perri.\n" +
                    "\n" +
                    "For more info and for submitting please visit the official website.\n" +
                    "\n"
    };

    private static int[] thumbnails = {
            R.drawable.lomba_2020,
            R.drawable.all_about_photos,
            R.drawable.a5deb902b5e37,
            R.drawable.emel,
            R.drawable.melomba_2020,
            R.drawable.a5deb902b5e37,
            R.drawable.alomba_2a020,
            R.drawable.funtime,
            R.drawable.piala,
            R.drawable.kontes_ne,
            R.drawable.priosma
    };

    private static String[][] specifications = {
            {
                    "Peserta yang bisa mendaftar dalam ajang agenda ini sendiri adalah palajar SMA/MA?SMK/Sederajat",
                    "Peserta pelajar khususnya ialah adek-adek SMA/MA sederajat dan siswa SMK Kesehatan seluruh Jawa Timur",
                    "Karya yang dijukan dalam lomba ini haruslah sesuai dengan tema dalam lomba: ERDOSTEIN",
                    "Karya yang dijukan dalam lomba ini ialah karya asli"
            },
            {
                "This competition is open to anyone aged 18 and over."
            },
            {},
            {
                "Double Slot Allowed max 2 slot / team",
                "Double winner Allowed",
                "Pendaftaran : Rp 60.000",
                "Peraturan :  http://tiny.cc/peraturanangops1",
                "Link Pendaftaran http://tiny.cc/angops1"
            },
            {
                    "Peserta yang bisa melakukan peddaftaran dalam ajang agenda ini sendiri ialah para pelajar SMA/MA/SMK/Sederajat di Indonesia baik dari Sekolah Swasta ataupun Sekolah Negeri",
                    "Karya yang diikutsertakan dalam lomba adalah karya asli",
                    "No Plagiat",
                    "Karya lomba juga belum pernah menjadi juara dalam event sejenis",
            },
            {},
            {
                    "Perlombaan ini bisa dilakukan dengan individu ataupun tim",
                    "Tim dalam lomba ialah maksimal 2 orang dari kampus yang sama ya",
                    "Karya yang diikutsertakan dalam lomba ini adalah karya asli",
                    "Karya yang diikutsertakan dalam lomba juga belum pernah menjadi juara dalam event sejenis",
                    "Karya yang diikutsertakan dalam lomba ini juga haruslah sesuai dengan tema ataupun sub tema dalam lomba",
            },
            {},
            {},
            {
                    "Beli produk SilverQueen dengan minimal harga Rp 30.000,- di store Alfamart lalu simpan struknya",
                    "Foto dirimu bersama SilverQueen dengan tema tahun baru dan upload melalui Instagram.",
                    "Foto dapat dilakukan di depan kasir atau sticker frame photo pada pintu Alfamart",
                    "Kamu diharuskan membawa dan menggunakan properti sendiri dengan tema Tahun Baru",
                    "Jangan lupa sertakan hashtag #AlfamartSilverQueen2019 dan #Newyearendcelebration pada caption",
                    "Satu struk berlaku untuk mengupload 1 foto saja. Upload foto sebanyak-banyaknya dengan struk yang berbeda agar semakin besar kesempatan menangmu.",
                    "Follow akun @SilverQueenID & @Alfamart",
                    "Upload foto melalui Instagram dengan tag @SilverQueenID & @Alfamart",
                    "Buat caption semenarik mungkin dan cantumkan nomor struk pembelian di Alfamart",
                    "Syarat dan ketentuan berlaku",
            },
            {}
    };

    private static int[] entryFees = {
            25,
            30,
            5,
            10,
            0,
            5,
            17,
            0,
            0,
            0,
            30
    };

    private static String[] rewardRanges = {
            "$$$",
            "$$$$",
            "$$$",
            "$$$",
            "$$$",
            "$$",
            "$$$",
            "$$",
            "?",
            "$$$",
            "$$$$"
    };

    private static String[] categories = {
            "Scientific Paper",
            "Photography",
            "Bird",
            "Game",
            "Essay",
            "Race",
            "Infographic",
            "Children",
            "Running",
            "Celebration",
            "Painting"
    };

    private static String[] deadlines = {
            "2020-06-01",
            "2020-06-28",
            "2020-01-17",
            "2019-12-15",
            "2020-01-11",
            "2020-02-23",
            "2019-12-27",
            "2020-01-05",
            "2019-12-19",
            "2019-12-30",
            "2020-01-10"
    };

    private static String[] websites = {
            "https://www.informasilomba.com/2019/12/lomba-infografi-dan-lkti-pelajar-2020.html",
            "https://www.all-about-photo.com/all-about-photo-contest.php?cid=12",
            "https://burungnews.com/kacer-mania-blitar-cup-i-agenda1424.html",
            "http://eventsurabaya.net/event/angop-tournament-season-1-mobile-legends/",
            "https://www.informasilomba.com/2019/12/lomba-menulis-essay-dan-desain-poster.html",
            "https://burungnews.com/anniversary-6th-putra-candi-bc-blitar-agenda1425.html",
            "https://www.informasilomba.com/2019/12/lomba-semar-infografpichs-nasional-2020.html",
            "http://eventjakarta.com/?event=funtime-with-citrex-gummy-fish-oil-2019",
            "https://burungnews.com/piala-radja-tembakau-agenda1423.html",
            "https://www.serbakuis.com/kontes-s" +
                    "elebrasi-akhir-tahun-silverqueen-berhadiah-puluhan-smartphone/",
            "https://contestwatchers.com/prisma-international-art-prize-2020/"
    };

    public static ArrayList<Contest> getListData() {
        ArrayList<Contest> list = new ArrayList<>();
        for (int position = 0; position < names.length; position++) {
            Contest contest = new Contest();
            contest.setThumbnail(thumbnails[position]);
            contest.setName(names[position]);
            contest.setCategory(categories[position]);
            contest.setRewardRange(rewardRanges[position]);
            contest.setDescription(descriptions[position]);
            contest.setStar(stars[position]);
            contest.setEntryFee(entryFees[position]);
            contest.setDeadline(deadlines[position]);
            contest.setWebsite(websites[position]);
            contest.setSpecifications(specifications[position]);
            list.add(contest);
        }

        return list;
    }

}
