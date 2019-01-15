# TP_interssant
Repo contenant quelques exercices de programmations interessantes que j'ai eu à traiter.

# CaesarCode.java

CaesarCode.java permet est un script permettant de chiffrer un message avec le chiffrement de Césaer.

Consulter l'aide

java CaesarCode ou java CaesarCode -h ou java CaesarCode --help

java CaesarCode -c messageAChiffrer [-k] [clé]
  
java CaesarCode -d messageADechiffrer [-k] [clé]

L'option -c permet de spécifier le message à chiffrer et -k permet de donner la clé de chiffrement. Par défaut k = 13 si elle n'est pas spécifié. Idem pour le déchiffrement

# TestConjugaisonIndicatif.java

java TestConjugaisonIndicatif permet de conjuguer un verbe passé en argument au temps spécifié en argument.
Il utilise la classe ConjugaisonIndicatif qui gére les temps (passé, présent, futur, imparfait) et le verbe à conjuguer.

java TestConjugaisonIndicatif [-v] [verbeAConjuguer] [-t] [tempsDuVerbeAConjuger]

tempsDuVerbeAConjuguer doit être: présent | passé | futur | imparfait

Vous pouvez consulter l'aide avec :

java TestConjugaisonIndicatif -h | [--help]
