# Module 4: Technical Analysis — Unit 1 Capstone Project: Business Card App

## Overview
Module 4 covers the **Unit 1 capstone project**, *Create a Business Card app*. It combines everything from Pathway 3 (Column/Row layout, Modifier, alignment) into a single polished, portfolio-quality screen: a personal business card showing name, title, and contact details.

---

## App: `BusinessCard`
- A full-screen `Surface` with a custom background color hosts a `Column` split into two sections using `Arrangement.SpaceBetween`:
  - **`HeaderSection`**: the developer's name (large, bold) and job title (smaller, semi-bold, distinct color) — a self-contained composable that takes `fullName` and `title` as parameters.
  - **`ContactSection`**: three `ContactRow`s (phone, social handle, email), each a `Row` with consistent spacing via `Arrangement.spacedBy(12.dp)`.

## Key Concepts
- **Composable decomposition**: breaking one screen into small, single-responsibility composables (`HeaderSection`, `ContactSection`, `ContactRow`) that each take explicit parameters rather than reading global state — this is the same pattern used throughout production Compose codebases.
- **Custom color theming**: hardcoded `Color(0xFF...)` values used for the card's background and accent text, demonstrating direct color control outside the default Material palette.
- **`Arrangement.SpaceBetween`**: pushes the header to the top and the contact block to the bottom of the screen, regardless of screen height.

## How This Was Verified
The app was compiled into the shared debug APK, installed on the `Pixel_9` emulator, launched via `adb shell am start`, and screenshotted with `adb shell screencap`. The real rendered screenshot is in `Screenshots/`.
