# Module 5: Technical Analysis — Unit 2, Pathway 1: Kotlin Fundamentals

## Overview
Module 5 covers **Unit 2, Pathway 1**, deepening Kotlin knowledge beyond Unit 1's basics: conditionals and nullability, classes and objects, and function types/lambdas. Like Module 1, this pathway is pure Kotlin with no UI, run and verified as console programs.

---

## Codelabs Covered
1. **Write conditionals in Kotlin** and **Use nullability in Kotlin** (`ConditionalsAndNullability.kt`) — `if`/`else` as expressions, `when`, nullable types (`String?`), the safe-call operator (`?.`), the Elvis operator (`?:`), and the not-null assertion (`!!`).
2. **Use classes and objects in Kotlin** (`ClassesAndObjects.kt`) — class declarations, constructors, properties, and member functions.
3. **Use function types and lambda expressions in Kotlin** (`LambdasAndHighOrderFunctions.kt`) — functions as values, lambda syntax, and higher-order functions that accept or return functions.
4. **Practice: Kotlin Fundamentals** (`PracticeKotlinFundamentals.kt`) — combined practice exercises applying all three concepts together.

## Key Concepts
- **Null safety**: Kotlin's type system distinguishes nullable (`String?`) from non-nullable (`String`) types at compile time, eliminating most `NullPointerException`s by forcing explicit handling (`?.`, `?:`, `!!`) wherever `null` is possible.
- **Classes as blueprints**: a `class` groups related data (properties) and behavior (functions) together, matching the `data class Artwork` pattern later used in the Art Space capstone (Module 8).
- **Lambdas as first-class values**: a lambda (`{ result = (1..6).random() }`) can be stored, passed as a parameter, and invoked later — this is exactly the mechanism Compose uses for `onClick` handlers throughout Module 6, 7, and 8's apps.

## How This Was Verified
Each file was compiled and executed on the JVM through a Gradle Kotlin console runner, and the real captured `stdout` was rendered into a terminal-style screenshot saved in `Screenshots/`. See that folder for the actual program output.
