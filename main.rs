mod parrot;

use parrot::Parrot;

fn main() {
    // Create a default parrot
    let mut polly = Parrot::new();
    println!("{}", polly);

    // Create a custom parrot
    let mut mango = Parrot::with_name(String::from("Mango"));
    println!("{}", mango);

    // Tame Mango
    mango.set_tamed(true);
    mango.set_sitting(true);
    mango.set_flying(false);
    mango.set_crumbs(); // adds 1kg crumbs

    // Lower Polly's health
    polly.lower_health(1);

    // Increase Mango's health
    mango.increase_health(2);

    // Create another parrot
    let sky = Parrot::with_name(String::from("Sky"));

    // Display a horizontal summary of all three parrots
    println!(
        "{}",
        Parrot::summary(&polly, &mango, &sky)
    );

    // Randomly tame a parrot
    let is_tamed = Parrot::tame_randomly();
    println!("Randomly tamed? {}", is_tamed);
}
