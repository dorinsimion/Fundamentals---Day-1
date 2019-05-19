Operatorii:

operatori matematici: + - * / %
operatori logici: && || (operatori scurtcircuitati - in cazul in care se stie rezultatul dupa evaluarea expresie 
	din stanga nu se mai executa si expresia din dreapta), ! - negare , &,|,^ (se prefera cei scurtcircuitati in locul ultimilor 3)
operatori de comparare <, >, <=, >=, ==, !=
operatorul de atribuire =

+ este si operator de concatenare in cazul stringurilor

Castingul primitivelor de la un tip la altul:
- de la un tip mai generic la unul mai specific nu trebuie precizat, se face automat ( exemplu : atribuim unei variabile double un int)
- invers trebuie precizat ( exemplu : double x=10.3; int y =(int) x;)
- nu se poate face cast la si de la boolean