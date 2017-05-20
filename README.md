# RESTful-Web-Service-Project
Project for selection of ITB Programming Laboratory assistant.

1. JSON

JSON adalah singkatan dari JavaScript Object Notation.
JSON adalah format yang digunakan untuk memodelkan data dengan adanya key dan value.
JSON biasanya digunakan untuk transmit data dari server ke web application, sebagai ganti dari XML.

Ada 2 bagian dari JSON, yaitu key dan value.
Key: sebagai dari suatu nilai, secara sintaks, selalu diapit oleh tanda kutip double.
Value: nilai dapat berupa string, angka, array, boolean, dan objek.
Key/Value pair: gabungan key dan value dengan sintaks <key> : <value>.
	Contoh: "Nama" : "Dicky" -> Key: "Nama" dan Value: "Dicky".

Untuk array, biasanya diindikasikan dengan adanya pair key dan value dengan beberapa value yang diapit oleh kurung siku("[]").
	Contoh: "Nama" : ["Dicky", "Novanto", "Lalaland"]
		Key "Nama" memiliki value berupa array of string berisi 3 elemen diatas.
Untuk object, biasanya diindikasikan dengan adanya curly braces (kurung kurawal).
	Contoh: "KTP" : {
			"ID"   	: 1234
			"Nama" 	: "Dicky Novanto"
			"Alamat": "Jalan Tubagus Ismail V/11"
		}
	Dari contoh diatas, terdapat object KTP yang memiliki beberapa pair key dan value.


2. REST

REST adalah singkatan dari Representational State Transfer. REST adalah arsitektur web standar yang menggunakan Protokol HTTP untuk transfer data.
Prinsipnya, setiap komponen di dalam REST adalah resource dan resource ini dapat diakses dari common interface memakai standar methods HTTP.
Cara kerja secara umum REST adalah dengan cara Server REST menyediakan akses untuk client menggunakan resources. Setiap resource dapat diidentifikasi dengan URI (Universal Resouce Identifier) atau ID Global. Contoh resource: konten dari Text, JSON dan XML. Sebagai catatan, JSON merupakan resource yang sekarang paling umum digunakan dalam Web Services.

HTTP Methods dari REST: 
a. GET :  untuk mendapatkan akses read-only untuk suatu resource
b. PUT : untuk membuat sebuah resource yang baru
c. DELETE: untuk menghapus sebuah resouce
d. POST: untuk mengupdate atau membuat resource
e. OPTIONS: Untuk mendapatkan operasi-operasi yang tersupport untuk suatu resource.

Web Service adalah sekumpulan open protocols dan standards yang digunakan untuk pertukaran data antar aplikasi. Dengan web service ini, antar aplikasi dapat saling bertukar data di suatu jaringan (misal internet).
Web Service yang berbasis pada arsitektur REST adalah RESTful Web Services. Web services ini menggunakan methods HTTP untuk mengimplementasikan arsitektur REST.

3. Github API
Dimulai dari konsep dasar terlebih dahulu.
Akan sering dijumpai istilah curl. Curl adalah tool yang digunakan di command line atau scripts untuk transfer data. Curl ini berperan sangat penting dalam transfer data di internet.
