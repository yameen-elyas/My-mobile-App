# Module 3: Technical Analysis — Unit 1, Pathway 3: Build a Basic Layout

## Overview
Module 3 covers **Unit 1, Pathway 3**: composing layouts out of `Text`, `Image`, `Column`, and `Row`, and controlling their appearance and position with `Modifier`. Four small apps were built for this pathway's codelab and practice exercises.

---

## Apps in This Module
1. **`BirthdayCard`** — *Build a simple app with text composables*. Two `Text` composables stacked in a `Column`, with different font sizes and an end-aligned signature line.
2. **`ComposeQuadrant`** — *Practice: Compose Basics*. Four `ComposableInfoCard`s (one per Compose fundamental: Text, Image, Row, Column) arranged in a 2×2 grid using nested `Row`s inside a `Column`, each with `Modifier.weight(1f)` to split space evenly.
3. **`ComposeArticle`** — a practice article-layout app: a title `Text`, a short description, and a long description, each padded and justified inside a `Column`.
4. **`TaskManager`** — a practice "completion" screen: a centered, bold confirmation message and a secondary message, demonstrating `Arrangement.Center` and `Alignment.CenterHorizontally`.

## Key Concepts
- **`Column` / `Row`**: the two linear layout composables — vertical and horizontal — that most UIs are built from.
- **`Modifier.weight()`**: inside a `Row`/`Column`, distributes remaining space proportionally between children (used in `ComposeQuadrant` to make all four quadrants equal size regardless of screen dimensions).
- **`Arrangement` and `Alignment`**: `Arrangement` controls spacing/positioning along the main axis of a `Column`/`Row`; `Alignment` controls positioning along the cross axis.
- **`TextAlign.Justify`**: used in `ComposeArticle` to justify body paragraph text, matching typical article layouts.

## How This Was Verified
Each app was compiled into the same debug APK (each as its own `Activity`), installed on the `Pixel_9` emulator, launched individually via `adb shell am start`, and screenshotted with `adb shell screencap`. Real screenshots for all four apps are in `Screenshots/`.
