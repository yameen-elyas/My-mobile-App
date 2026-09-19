# Module 6: Technical Analysis — Unit 2, Pathway 2: Add a Button to an App

## Overview
Module 6 covers **Unit 2, Pathway 2**: introducing interactivity and state with the **Dice Roller** app, plus using the Android Studio debugger and practicing click-behavior handling.

---

## App: `DiceRoller`
- `DiceWithButtonAndImage` holds a single piece of UI state, `result`, created with `var result by remember { mutableStateOf(1) }`.
- A `Button`'s `onClick` lambda updates `result` to a new random value (`(1..6).random()`).
- Because `result` is read inside the composable's `Text`, Compose automatically **recomposes** that `Text` whenever `result` changes — no manual view invalidation required.

## Key Concepts
- **`remember { mutableStateOf(...) }`**: creates observable state that survives recomposition (but not configuration changes, unless combined with `rememberSaveable`). Reading it inside a composable subscribes that composable to future changes.
- **`by` property delegation**: `by remember { mutableStateOf(1) }` lets `result` be read/written like a plain `Int` instead of unwrapping `.value` every time.
- **Unidirectional event flow**: the `Button`'s `onClick` is the only place `result` is mutated; the `Text` only reads it — a small-scale example of the same state-down/events-up pattern used in every later app in this portfolio.
- **Debugging Compose**: breakpoints inside `onClick` lambdas and recomposition-scoped functions were used to step through state changes and confirm exactly when/why recomposition occurs.

## How This Was Verified
The app was compiled into the shared debug APK, installed on the `Pixel_9` emulator, and screenshotted twice via `adb shell screencap`: once at the initial state, and once after simulating a tap on the **Roll** button with `adb shell input tap`, to demonstrate the interactive state change. Both real screenshots are in `Screenshots/`.
