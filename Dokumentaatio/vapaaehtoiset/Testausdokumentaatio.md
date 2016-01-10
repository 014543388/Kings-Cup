En testannut mitään graafisen käyttöliittymän toimintoja automaattisesti.
GUI toimii silti halutusti sillä testasin sitä itse useaan otteeseen.
-Jokainen korttinappi testattu manuaalisesti
-Random Kortti -nappi testattu manuaalisesti
  -En ole varma miten itse satunnaisuus testataan. Luotan valmiiseen Random-luokkaan
-pelaajanappi testattu sekä mies- että naispelaajalle (ei eroja)
  -nappi avaa pelaajaikkunan, jossa sijaitseva juomanappi testattu myös manuaalisesti
    -juomanappi toimii eli lisää pelaajalle juoman real-timessa (juonut -arvo lisääntyy kyseisessä ikkunassa)

NeverHaveIEver-luokka
-testattu automaattisesti lähes kokonaan
-puuttuu testit satunnaisuudesta (en tiedä onko mahdollinen, varmasti työläs).
  -taas luotto valmiiseen random-luokkaan
  
Jokainen korttiluokka on testattu erikseen ja kattavasti.
Logiikan kaikki toiminnallisuus on testattu kattavasti.

  
Mahdollinen bugi suorittaessa:
Jos painaa enteriä tekstikäyttöliittymässä ennen kortin valitsemista. Tällöin ohjelma tulkitsee syötöksi tyhjän rivin,
kun seuraavan kortin toiminnallisuus kysyy syöttöä. Ei suuri ongelma sillä syöttö pyydetään uudestaan
sen ollessa vajavainen tai huono.
