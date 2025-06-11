from parrot import Parrot

def main():
    polly = Parrot()
    mango = Parrot("Mango")
    kiwi = Parrot("Kiwi")

    mango.set_crumbs()
    kiwi.tame_randomly()

    print(polly)
    print(Parrot.compare_parrots(polly, mango, kiwi))

if __name__ == "__main__":
    main()
