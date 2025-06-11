package main

import "fmt"

func main() {
	polly := NewParrot()
	fmt.Println(polly)

	mango := NewParrotWithName("Mango")
	mango.SetTamed(true)
	mango.SetSitting(true)
	mango.SetFlying(false)
	mango.SetCrumbs()
	mango.IncreaseHealth(2)

	sky := NewParrotWithName("Sky")

	fmt.Println(mango)
	fmt.Println(Summary(polly, mango, sky))

	fmt.Printf("Randomly tamed? %t\n", mango.TameRandomly())
}
