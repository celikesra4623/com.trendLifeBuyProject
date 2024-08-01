 ### Kurallar:
***
 1. Page objectleri olusturuken PageXyz seklinde isimlendiriyoruz.
 2. Admin ile ilgili sayfalar admin directorysinin altina, user ile ilgili olanlar user directorysinin altina olusturulmali
 3. Testleri calistiriken sadece test bazli, sadece user stroy bazli ve tes set bazli calistirabilmek icin Test case'lere tag verirken asagidaki tagleri mutlaka vermeliyiz.
    * Test Case'in Jira ticket numarasini
    * Test Case'e ait User story ticket numarasini
    * Test Case'in icinde bulundugu Test Set'lerin ticket numaralarini
 4. Jiradaki her bir test plan icin bir test runner sinifi olusturacagiz.
 5. Feature file'lari feature paketinin altinda direkt yaziyoruz
 6. Feture filelerin isimlendirmesi US_001_PageHome.feature seklinde olmali
 7. Locate almadan once calsitigimiz sinifta olup olmadigina bakilmali 

<br/>

### Git 
***
1. Herkes kendi adina birer branch olusturur.
    * `git branch <isim>`
2. Yaptigi degisiklikleri kucuk commitlerle kendi branchinda saklar. Burada tavsiye edilen sadece sizin yaptiginiz degisikliklerin eklenmesidir.
    * `git add .` 
    * `git commit -m "Yapilan Degisiklikler icin bir mesaj yazilir."`
3. **Main** brancha gecip main'in son halini ceker. 
   * `git checkout main`
   * `git pull`
4. Tekrar kendi branch'ina gecer ve asagidaki merge komutunu calistirir.
    * `git checkout <Kendi Branch Ismi>`
    *  `git merge main`
5. Terminalde yazan mesaji okur ve konflict var ise konfliktleri cozer. Burada konflict cikan kisi ile iletisime gecmekte fayda olabilir.
6. Konfliktler cozuldukten sonra konflikt cozerken yapilan degisikler bir kez daha commit edilir. Boylece merge islemi tamamlanmis olur.
    * `git add .`
    * `git commit - m "Hangi sayfalardaki konflicktler cozuldi ise onun notu dudulmeli"`
7. Koonfliktleri cozulmus kodumuzun oldugu branchimiz githuba push edilir.
    * `git push`
8. Projenin github hesabindaki **branches** linkine tiklanir. 
9. Push ettigimi kendi kodumuz icin **merge request** olusturulur.

<br/>

#### Main ile Kendi branch'imizi güncel tutmak icin
***
1. Baslamadan once kendi branchimizda yaptigimiz degisiklikleri kaydederiz.
   * `git add .`,  
   * `git commit - m "Ilgili kommit mesaji yazilir"`
2. Main branchina gecilir ve kodun son halini cekilir.
    * `git checkout main`
    * `git pull`
3. Tekrar kendi branch'imiza geceriz.
   * `git checkout <BranchIsmi>`
4. Daha sonra fetch komutunu calistiririz. 
    * `git fetch origin`
5. Son olarak merge islemini gerceklestiririz.
   * `git merge origin/main`

<br/>

### Kavram eslestirmeleri
***
| Jira      | Proje                      |
|-----------|----------------------------|
| Jira      | Proje                      |
| Test Plan | Runner sinifina            |
| Test Set  | Runner sinifindaki taglere |

<br/>

### Isimlendirmelerde dikaat edilecekler
***
| Element Türü   | Variable name |
|----------------|---------------|
| Bilgi girsi    | fieledEmail   | 
| Button         | buttonLogout  |    
| Logo           | logoX         |
| Sadece text    | labelX        |
| Drop down      | dropDownX     |
| Check box      | checkBoxX     |
| Tablo Sütünu   | columnX       |
| Tablo Satiri   | rowX          |
| Kisi Resimleri | imageProfileX |
| ürün resimleri | imageProductX |
| Linkler        | linkX         |