# Module 8: Technical Analysis — Unit 2 Capstone Project: Art Space App

## Overview
Module 8 covers the **Unit 2 capstone project**, *Create an Art Space app*. It combines state management (Module 6), form/input handling patterns (Module 7), and Kotlin classes (Module 5) into a small art gallery browser: an artwork display, a descriptor panel, and previous/next navigation.

---

## App: `ArtSpace`
- `data class Artwork(val title, val artist, val year, val colorAccent)` models each gallery piece — a direct application of the classes concept from Module 5.
- A `List<Artwork>` holds four artworks; a single `currentIndex` state (`remember { mutableStateOf(0) }`) selects which one is displayed.
- `ControllerPanel`'s **Previous**/**Next** buttons update `currentIndex` with wraparound logic (`if (currentIndex < artworks.size - 1) currentIndex++ else currentIndex = 0`), so browsing loops back to the start/end instead of going out of bounds.
- The screen is split into three composables — `ArtworkWall` (the piece itself), `ArtworkDescriptor` (title/artist/year), and `ControllerPanel` (navigation) — each receiving only the data or callbacks it needs, following the same decomposition pattern as the Business Card capstone (Module 4).

## Key Concepts
- **Single source of truth**: `currentIndex` is the only mutable state; `currentArtwork` is derived from it (`artworks[currentIndex]`) rather than duplicated, so the wall, descriptor, and controller panel can never disagree about which artwork is showing.
- **Wraparound index logic**: a common list-navigation pattern that keeps `currentIndex` always valid without needing to disable the buttons at the ends.
- **`verticalScroll(rememberScrollState())`**: ensures the layout remains usable on shorter screens where the artwork, descriptor, and buttons together might exceed the viewport height.

## How This Was Verified
The app was compiled into the shared debug APK, installed on the `Pixel_9` emulator, and screenshotted at the initial artwork, then again after simulating a tap on **Next** with `adb shell input tap` to demonstrate the navigation state change. Both real screenshots are in `Screenshots/`.
