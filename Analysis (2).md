# Module 7: Technical Analysis — Unit 2, Pathway 3: Interacting with UI and State

## Overview
Module 7 covers **Unit 2, Pathway 3**: deeper state management through two codelab apps, **Lemonade** and **Tip Time**, plus the pathway's automated-testing codelab.

---

## App: `Lemonade`
- Models a 4-step process (pick lemon → squeeze → drink → empty glass) as an `Int` state, `currentStep`, driven through a `when (currentStep)` branch.
- A second state, `squeezeCount`, is randomized (`(2..4).random()`) each time step 2 is entered, and decremented on every tap until it reaches zero, at which point the flow advances to step 3.
- Demonstrates that a composable can hold **multiple independent pieces of state** that together drive which UI is shown and how it behaves.

## App: `TipTime`
- Two `TextField`s (`amountInput`, `tipInput`) hold raw string state; `.toDoubleOrNull() ?: default` safely converts user input to a number, falling back to a sane default (`15.0`) if the field is empty or invalid — reusing the nullability handling from Module 5.
- A `Switch` (`roundUp`) is a third piece of state that conditionally applies `kotlin.math.ceil()` to the computed tip.
- `calculateTip()` is a pure function (no side effects, same inputs always produce the same output), separated from the UI so it can be tested independently — the same separation the pathway's automated-testing codelab exercises.
- **Bug found and fixed during verification**: the original source was missing the `androidx.compose.foundation.layout.wrapContentWidth` and `androidx.compose.foundation.layout.size` imports used by `RoundTheTipRow`, which would have failed to compile. Both imports were added so the app builds and runs correctly.

## Key Concepts
- **State-driven branching UI**: `when (currentStep)` re-renders entirely different content from the same composable based on state, rather than navigating between screens.
- **Safe numeric parsing**: `toDoubleOrNull()` never throws on bad input — it returns `null`, which the Elvis operator (`?:`) resolves to a default.
- **Pure calculation functions**: keeping `calculateTip()` free of Compose/UI concerns makes it trivially unit-testable.

## How This Was Verified
Both apps were compiled into the shared debug APK and installed on the `Pixel_9` emulator. `Lemonade` was screenshotted at each of its four steps by sending `adb shell input tap` between captures. `TipTime` was screenshotted with default values and again after entering a bill amount and tip percentage via `adb shell input text` and toggling round-up. Real screenshots for both apps are in `Screenshots/`.
