# DisjointSets
Tenth assignment for algorithms and data structures lab.

1. Zaimplementuj struktury danych dla zbiorów rozłącznych o dowolnej
liczbie elementów:  
• opartą o listę dowiązaniową – klasa ListDisjointSet,  
• oparta o las zbiorów rozłącznych – klasa ForestDisjointSet.

Dowolna liczba elementów oznacza, że nie można zastosować
implementacji tablicowej.

 Obie implementacje mają udostępniać zestaw operacji typowy dla
zbiorów rozłącznych (patrz wykład).

W odróżnieniu od typowej implementacji, zbiory rozłączne z tej listy nie
przechowują wartości, gdyż istotna jest jedynie kwestia tego, czy dane dwa
zbiory są połączone, czy też nie. Odpowiedzialność za przechowywanie
referencji do tworzonych zbiorów zrzucamy na użytkownika klasy.
Takiej implementacji zbiorów rozłącznych można używać jako np.
znaczników dla naszych danych, aby móc stwierdzić, czy są one w jakiejś
relacji (reprezentowanej jako łączność zbiorów).

2. Sprawdź poprawność implementacji oraz porównaj złożoność czasową
operacji w obydwu implementacjach.

UWAGI:
Reprezentacje przedstawione na wykładzie – zmodyfikowana lista
dowiązaniowa oraz las zbiorów rozłącznych – zakładają stałą liczbę elementów
i pozwalają dzięki temu na zarządzanie taką strukturą z poziomu jednego
obiektu. Oznacza to, że klasa struktury (listy/lasu) przechowuje wszystkie
składowe zbiory. Użytkownik nie ma w tym wypadku bezpośredniego dostępu
do pojedynczego zbioru, ale może odpytywać się o rozłączność i żądać scalenia.
Wersja z listy wymaga rozbicia takiej struktury na poszczególne podzbiory,
reprezentowane przez osobne obiekty. Wprowadza to jednak problem
efektywnego znajdowania zbioru przechowującego dany element e. Na tej liście
problem jest rozwiązywany naiwnie – użytkownik klasy bierze na siebie
odpowiedzialność znajdowania odpowiedniego zbioru, zawierającego e.
W konsekwencji, jeśli wiadomo, że zbiór jest związany z e, nie ma potrzeby
przechowywania elementu e w samym zbiorze.
Takie zbiory rozłączne można traktować jako znaczniki, które pozwalają
zidentyfikować powiązanie danych dwóch obiektów.
