package main

import (
	"fmt"
	"math/rand"
	"time"
)

type Parrot struct {
	Name     string
	Health   int
	Crumbs   float64
	IsTamed  bool
	IsAlive  bool
	IsSitting bool
	IsFlying  bool
}

// Constructor: Default Parrot
func NewParrot() *Parrot {
	return &Parrot{
		Name:     "Polly",
		Health:   3,
		Crumbs:   0.1,
		IsTamed:  false,
		IsAlive:  true,
		IsSitting: false,
		IsFlying:  true,
	}
}

// Constructor: Named Parrot
func NewParrotWithName(name string) *Parrot {
	return &Parrot{
		Name:     name,
		Health:   3,
		Crumbs:   0.1,
		IsTamed:  false,
		IsAlive:  true,
		IsSitting: false,
		IsFlying:  true,
	}
}

func (p *Parrot) TameRandomly() bool {
	rand.Seed(time.Now().UnixNano())
	tame := rand.Float64() < 0.5
	p.IsTamed = tame
	return tame
}

func (p *Parrot) SetAlive(alive bool) {
	p.IsAlive = alive
}

func (p *Parrot) SetTamed(tamed bool) {
	p.IsTamed = tamed
}

func (p *Parrot) SetName(name string) {
	p.Name = name
}

func (p *Parrot) LowerHealth(amount int) {
	p.Health -= amount
}

func (p *Parrot) IncreaseHealth(amount int) {
	p.Health += amount
}

func (p *Parrot) SetCrumbs() {
	p.Crumbs += 1.0
}

func (p *Parrot) SetSitting(sit bool) {
	p.IsSitting = sit
}

func (p *Parrot) SetFlying(fly bool) {
	p.IsFlying = fly
}

func (p *Parrot) String() string {
	return fmt.Sprintf(
		"\nParrot Stats\n--------------\nName: %s\nHealth: %d\nIsTamed: %t\nIsAlive: %t\nIsFlying: %t\nIsSitting: %t\nCrumbs in Stomach: %.1f kg\n",
		p.Name, p.Health, p.IsTamed, p.IsAlive, p.IsFlying, p.IsSitting, p.Crumbs,
	)
}

func Summary(p1, p2, p3 *Parrot) string {
	return fmt.Sprintf(`
Parrot Stats
--------------------------------------------------------------------------------------------------
Name: %-10s\tName: %-10s\tName: %-10s
Health: %-8d\tHealth: %-8d\tHealth: %-8d
IsTamed: %-7t\tIsTamed: %-7t\tIsTamed: %-7t
IsAlive: %-7t\tIsAlive: %-7t\tIsAlive: %-7t
IsFlying: %-6t\tIsFlying: %-6t\tIsFlying: %-6t
IsSitting: %-5t\tIsSitting: %-5t\tIsSitting: %-5t
Crumbs: %.1f kg\tCrumbs: %.1f kg\tCrumbs: %.1f kg
`, p1.Name, p2.Name, p3.Name,
		p1.Health, p2.Health, p3.Health,
		p1.IsTamed, p2.IsTamed, p3.IsTamed,
		p1.IsAlive, p2.IsAlive, p3.IsAlive,
		p1.IsFlying, p2.IsFlying, p3.IsFlying,
		p1.IsSitting, p2.IsSitting, p3.IsSitting,
		p1.Crumbs, p2.Crumbs, p3.Crumbs)
}
