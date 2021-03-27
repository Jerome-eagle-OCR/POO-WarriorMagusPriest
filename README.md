# POO-WarriorMagusPriest
Exercice de programmation orientée objet

Step 1 : Créer une classe Character avec deux propriétés : points de vie et points d’attaque. Ajouter une méthode present() afin d’afficher les caractéristiques
d’un personnage 

Step 2 : Créer une classe Warrior qui va hériter de personnage et qui va modifier les points de vie et les points d’attaque de la classe mère 

Step 3 : Créer une classe Magus qui va hériter de personnage et qui va modifier les points de vie et les points d’attaque de la classe mère 

Step 4 : Enrichir la méthode present() de la classe Character, dans les classes filles Magus et Warrior pour indiquer le type du personnage 

Step 5 : Créer une nouvelle méthode sur la classe Character, qui prend en paramètre un autre Character, et qui va retourner le personnage le plus fort des deux
(par exemple, le personnage qui a le plus de points d’attaque, si identique, le personnage qui a le plus de points de vie, si identique, le premier personnage) 

Step 6 : Créer une nouvelle méthode sur la classe Character, appelée actionOn, qui prend en paramètre un autre Character et qui va aller déduire des points de vie
de ce personnage, les points d’attaque du personnage qui appelle la méthode. (par exemple, pour A.actionOn(B) : B.lifePoint ayant 10 à la fin de la fonction B
aura plus que 5 dans lifePoint si A a 5 points d’attaque) 

Step 7 : Créer une nouvelle classe de type Priest qui hérite de la classe Character et qui va modifier le comportement de la méthode actionOn pour ne plus attaquer,
mais soigner avec les points d’attaque (par exemple, pour A.actionOn(B) : B.lifePoint ayant 10 à la fin de la fonction B aura 15 dans lifePoint si A a 5 points d’attaque
et que A est un prêtre)
