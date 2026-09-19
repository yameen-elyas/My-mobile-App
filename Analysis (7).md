# Module 1: Technical Analysis — Unit 1, Pathway 1: Introduction to Kotlin

## Overview
Module 1 covers **Unit 1, Pathway 1** of the Android Basics with Compose curriculum. This pathway has no Android UI — it is pure Kotlin, run and verified as console programs, and it establishes the language foundations (syntax, variables, functions) that every later Compose app in this portfolio builds on.

---

## Codelabs Covered
1. **Your first program in Kotlin** (`FirstProgram.kt`) — the `fun main()` entry point, `println`, and basic program structure.
2. **Create and use variables in Kotlin** (`Variables.kt`) — `val` (immutable) vs `var` (mutable) declarations, string templates (`$variable`, `${expression}`), and reassignment.
3. **Create and use functions in Kotlin** (`Functions.kt`) — function declarations with `fun`, parameters, return types, and default parameter values.
4. **Practice: Kotlin Basics** (`PracticeKotlinBasics.kt`) — combines all of the above across seven practice exercises: printing messages, fixing a compile error, string templates, string concatenation, math operations via a helper function, default parameters, and refactoring duplicated code into a reusable `printWeatherReport` function.

## Key Concepts
- **`val` vs `var`**: `val` creates a read-only reference (assignment enforced once); `var` allows reassignment. Preferring `val` reduces accidental mutation bugs.
- **String templates**: `"$name"` interpolates a variable directly; `"${expression}"` evaluates and interpolates any expression, including arithmetic.
- **Functions as reusable units**: extracting duplicated `println` blocks (e.g. the weather report) into a single parameterized function removes repetition and centralizes the output format.
- **Default parameters**: letting a parameter (e.g. `title: String = "Junior Developer"`) fall back to a default value means callers only need to supply the arguments that actually vary.

## How This Was Verified
Each file was compiled and executed on the JVM through a Gradle Kotlin console runner, and the real captured `stdout` was rendered into a terminal-style screenshot saved in `Screenshots/`. See that folder for the actual program output.
