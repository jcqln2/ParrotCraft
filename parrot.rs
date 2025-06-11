use rand::random;

#[derive(Debug, Clone)]
pub struct Parrot {
    name: String,
    health: i32,
    crumbs: f64,
    is_tamed: bool,
    is_alive: bool,
    is_sitting: bool,
    is_flying: bool,
}

impl Parrot {
    // Default constructor
    pub fn new() -> Self {
        Self {
            name: "Polly".to_string(),
            health: 3,
            crumbs: 0.1,
            is_tamed: false,
            is_alive: true,
            is_sitting: false,
            is_flying: true,
        }
    }

    // Constructor with custom name
    pub fn with_name(name: &str) -> Self {
        Self {
            name: name.to_string(),
            health: 3,
            crumbs: 0.1,
            is_tamed: false,
            is_alive: true,
            is_sitting: false,
            is_flying: true,
        }
    }

    pub fn tame_randomly(&mut self) -> bool {
        let tamed = random::<f64>() < 0.5;
        self.is_tamed = tamed;
        tamed
    }

    pub fn is_alive(&self) -> bool {
        self.is_alive
    }

    pub fn set_alive(&mut self, alive: bool) {
        self.is_alive = alive;
    }

    pub fn set_tamed(&mut self, tamed: bool) {
        self.is_tamed = tamed;
    }

    pub fn get_tamed_status(&self) -> bool {
        self.is_tamed
    }

    pub fn get_name(&self) -> &str {
        &self.name
    }

    pub fn set_name(&mut self, name: &str) {
        self.name = name.to_string();
    }

    pub fn get_health(&self) -> i32 {
        self.health
    }

    pub fn lower_health(&mut self, amount: i32) {
        self.health -= amount;
    }

    pub fn increase_health(&mut self, amount: i32) {
        self.health += amount;
    }

    pub fn set_crumbs(&mut self) {
        self.crumbs += 1.0;
    }

    pub fn get_crumbs(&self) -> f64 {
        self.crumbs
    }

    pub fn set_sitting(&mut self, sitting: bool) {
        self.is_sitting = sitting;
    }

    pub fn is_flying(&self) -> bool {
        self.is_flying
    }

    pub fn set_flying(&mut self, flying: bool) {
        self.is_flying = flying;
    }

    pub fn is_sitting(&self) -> bool {
        self.is_sitting
    }

    pub fn to_string(&self) -> String {
        format!(
            "\nParrot Stats\n--------------\nName: {}\nHealth: {}\nisTamed: {}\nisAlive: {}\nIs Flying: {}\nIs Sitting: {}\nHas this many crumbs in stomach: {:.1}\n",
            self.name,
            self.health,
            self.is_tamed,
            self.is_alive,
            self.is_flying,
            self.is_sitting,
            self.crumbs
        )
    }

    pub fn to_string_multiple(p1: &Parrot, p2: &Parrot, p3: &Parrot) -> String {
        format!(
            "Parrot Stats\n----------------------------------------------------------------------\nName: {}\t\t\t\tName: {}\t\t\t\tName: {}\nHealth: {}\t\t\t\tHealth: {}\t\t\t\tHealth: {}\nisTamed: {}\t\t\t\tisTamed: {}\t\t\tisTamed: {}\nisAlive: {}\t\t\tisAlive: {}\t\t\tisAlive: {}\nIs Flying: {}\t\t\tisFlying: {}\t\t\tisFlying: {}\nIs Sitting: {}\t\tisSitting: {}\t\tisSitting: {}\ncrumbs in stomach: {:.1}kg\tcrumbs in stomach: {:.1}kg\tcrumbs in stomach: {:.1}kg",
            p1.name, p2.name, p3.name,
            p1.health, p2.health, p3.health,
            p1.is_tamed, p2.is_tamed, p3.is_tamed,
            p1.is_alive, p2.is_alive, p3.is_alive,
            p1.is_flying, p2.is_flying, p3.is_flying,
            p1.is_sitting, p2.is_sitting, p3.is_sitting,
            p1.crumbs, p2.crumbs, p3.crumbs
        )
    }
}
