import random

class Parrot:
    """
    This is a Parrot object class to simulate pet parrot attributes.

    """

    def __init__(self, name="Polly"):
        """
        Constructor for Parrot with default or custom name.
        """
        self.name = name
        self.health = 3
        self.crumbs = 0.1
        self.is_tamed = False
        self.is_alive = True
        self.is_sitting = False
        self.is_flying = True

    def tame_randomly(self):
        """
        Randomly assign tamed status using 50% chance.
        :return: True if tamed, False otherwise
        """
        tame = random.random() < 0.5
        self.is_tamed = tame
        return tame

    def is_alive_fn(self):
        return self.is_alive

    def set_alive(self, alive):
        self.is_alive = alive

    def set_tamed(self, tamed):
        self.is_tamed = tamed

    def get_tamed_status(self):
        return self.is_tamed

    def get_name(self):
        return self.name

    def set_name(self, name):
        self.name = name

    def get_health(self):
        return self.health

    def lower_health(self, amount):
        self.health -= amount

    def increase_health(self, amount):
        self.health += amount

    def __str__(self):
        return (
            f"\nParrot Stats\n--------------\n"
            f"Name: {self.name}\n"
            f"Health: {self.health}\n"
            f"isTamed: {self.is_tamed}\n"
            f"isAlive: {self.is_alive}\n"
            f"Is Flying: {self.is_flying}\n"
            f"Is Sitting: {self.is_sitting}\n"
            f"Has this many crumbs in stomach: {self.crumbs}kg\n"
        )

    @staticmethod
    def compare_parrots(p1, p2, p3):
        """
        Custom string method to show horizontal summary of 3 parrots
        """
        return (
            "Parrot Stats\n"
            "----------------------------------------------------------------------\n"
            f"Name: {p1.name}\t\tName: {p2.name}\t\tName: {p3.name}\n"
            f"Health: {p1.health}\t\tHealth: {p2.health}\t\tHealth: {p3.health}\n"
            f"isTamed: {p1.is_tamed}\t\tisTamed: {p2.is_tamed}\t\tisTamed: {p3.is_tamed}\n"
            f"isAlive: {p1.is_alive}\t\tisAlive: {p2.is_alive}\t\tisAlive: {p3.is_alive}\n"
            f"isFlying: {p1.is_flying}\t\tisFlying: {p2.is_flying}\t\tisFlying: {p3.is_flying}\n"
            f"isSitting: {p1.is_sitting}\t\tisSitting: {p2.is_sitting}\t\tisSitting: {p3.is_sitting}\n"
            f"crumbs: {p1.crumbs}kg\tcrumbs: {p2.crumbs}kg\tcrumbs: {p3.crumbs}kg"
        )

    def set_crumbs(self):
        self.crumbs += 1

    def get_crumbs(self):
        return self.crumbs

    def set_sitting(self, sitting):
        self.is_sitting = sitting

    def is_flying_fn(self):
        return self.is_flying

    def set_flying(self, flying):
        self.is_flying = flying

    def is_sitting_fn(self):
        return self.is_sitting
