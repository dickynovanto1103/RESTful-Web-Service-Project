# RESTful-Web-Service-Project
Project for selection of ITB Programming Laboratory assistant.

<b>1. JSON </b>

JSON adalah singkatan dari JavaScript Object Notation.
JSON adalah format yang digunakan untuk memodelkan data dengan adanya key dan value.
JSON biasanya digunakan untuk transmit data dari server ke web application, sebagai ganti dari XML.

Ada 2 bagian dari JSON, yaitu key dan value.
Key: sebagai dari suatu nilai, secara sintaks, selalu diapit oleh tanda kutip double.
Value: nilai dapat berupa string, angka, array, boolean, dan objek.
Key/Value pair: gabungan key dan value dengan sintaks <key> : <value>.<br>
	Contoh: "Nama" : "Dicky" -> Key: "Nama" dan Value: "Dicky".<br>

Untuk array, biasanya diindikasikan dengan adanya pair key dan value dengan beberapa value yang diapit oleh kurung siku("[]").<br>
	Contoh: "Nama" : ["Dicky", "Novanto", "Lalaland"]<br>
Penjelasan: Key "Nama" memiliki value berupa array of string berisi 3 elemen diatas.<br><br>
Untuk object, biasanya diindikasikan dengan adanya curly braces (kurung kurawal).<br>
	<tab>Contoh: "KTP" : {<br>
			"ID"   	: 1234<br>
			"Nama" 	: "Dicky Novanto"<br>
			"Alamat": "Jalan Tubagus Ismail V/11"<br>
		}<br><br>
	Dari contoh diatas, terdapat object KTP yang memiliki beberapa pair key dan value.


<b>2. REST</b>

REST adalah singkatan dari Representational State Transfer. REST adalah arsitektur web standar yang menggunakan Protokol HTTP untuk transfer data.
Prinsipnya, setiap komponen di dalam REST adalah resource dan resource ini dapat diakses dari common interface memakai standar methods HTTP.
Cara kerja secara umum REST adalah dengan cara Server REST menyediakan akses untuk client menggunakan resources. Setiap resource dapat diidentifikasi dengan URI (Universal Resouce Identifier) atau ID Global. Contoh resource: konten dari Text, JSON dan XML. Sebagai catatan, JSON merupakan resource yang sekarang paling umum digunakan dalam Web Services.

HTTP Methods dari REST: <br>
a. GET : untuk mendapatkan akses read-only untuk suatu resource<br>
b. PUT : untuk membuat sebuah resource yang baru<br>
c. DELETE: untuk menghapus sebuah resouce<br>
d. POST: untuk mengupdate atau membuat resource<br>
e. OPTIONS: Untuk mendapatkan operasi-operasi yang tersupport untuk suatu resource.<br>

Web Service adalah sekumpulan open protocols dan standards yang digunakan untuk pertukaran data antar aplikasi. Dengan web service ini, antar aplikasi dapat saling bertukar data di suatu jaringan (misal internet).<br>
Web Service yang berbasis pada arsitektur REST adalah RESTful Web Services. Web services ini menggunakan methods HTTP untuk mengimplementasikan arsitektur REST.<br>

<b>3. Github API</b>

API (Application Program Interface) secara umum adalah alat yang dapat digunakan untuk membuat sebuah software berbasis Graphical User Interface (GUI). Dalam project ini, akan digunakan Github API. Github API ini memiliki beberapa fitur yang dapat digunakan, misalnya untuk melihat list dari semua repository dari suatu user, atau melihat semua repository yang bersifat public, dan search API yang detail penjelasannya akan dijelaskan di paragraf bagian akhir dari subbab ini.

Dimulai dari konsep dasar terlebih dahulu.
Akan sering dijumpai istilah curl. Curl adalah tool yang digunakan di command line atau scripts untuk transfer data. Curl ini berperan sangat penting dalam transfer data di internet.<br>
Contoh command menggunakan curl dalam command prompt: curl https://api.github.com/users/dickynovanto1103. Setelah dimasukkan command tersebut, akan dikeluarkan isi dari link tersebut dalam command prompt, dan konten hasil pencarian berformat JSON. Penambahan keyword "-i" setelah command curl, dapat menampilkan header dari hasil pencarian.<br>

Pengguna yang tidak terautentikasi (tidak login terlebih dahulu), hanya dapat memperoleh akses request sebagai klien sebanyak 60 kali per jam. Sedangkan orang yang terautentikasi dapat memperoleh sebanyak 5000 requests dalam 1 jam. Hal ini dapat terlihat pada bagian header hasil pencarian dengan key: X-RateLimit-Limit. Key ini menunjukkan banyaknya request yang dapat dilakukan dalam waktu 1 jam.
Selain itu ada header dengan key: X-RateLimit-Remaining yang mengindikasikan jumlah request yang tersisa yang dapat dilakukan oleh klien dalam periode 1 jam tersebut.

Cara untuk melakukan autentikasi cukup mudah, yaitu cukup dengan mengetikkan: curl -i -u "username" "link Github API". Setelah mengetikkan command tersebut, maka user akan diminta untuk memasukkan password sesuai dengan username yang dimasukkan.

Semua akses terhadap Github API dapat dilakukan melalui protocol HTTPS.

Dalam hal ini, akan difokuskan tentang search API. Seach API ini adalah tool yang dapat digunakan untuk mencari item tertentu, speerti repository, user, file dalam repository, commits, kode program, dan masih banyak lagi. GitHub Search API memfasilitasi hingga 1000 hasil pencarian setiap pencarian.

Hasil dari operasi pencarian secara default diurutkan berdasarkan best match (terdapat score field untuk tiap item hasil pencarian, makin besar score, makin best match hasil pencarian). Nilai score yang ditampilkan merupakan nilai ke-relevansi an item tersebut dengan item hasil pencarian lain. Namun pencarian dapat diurutkan berdasarkan parameter tersendiri, misalkan dari author, committer, author-date, dan lain lain.
