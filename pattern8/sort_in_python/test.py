from character import Character


characters: list = [Character("lancer", 1), Character(
    "saber", 10), Character("assasin", 0)]
characters.sort(key=lambda a: a.attack)
print(characters)
