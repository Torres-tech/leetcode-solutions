# Encode & Decode String

# Problem

You are asked to encode and decode a list of strings.

Input (for encoding): A list of strings, e.g. ["leet", "code", "is", "fun"]

Goal of encode(): Convert it into a single string.

Goal of decode(): Convert that single string back into the original list.

The condition is that the encoding must be lossless, meaning:

decode(encode(strs)) == strs


You must design a system that can handle any characters (including spaces, #, commas, etc.) in the strings without confusion.

# Solution Description

## Encoding ideas

Use a length-prefix encoding scheme.

For each string:

Record its length.

Add a separator (like #).

Then add the string itself.

Then concatenate all of these pieces together.

## Decoding ideas

Given the encoded string, we reverse the process:

Read characters until you hit #.

That part before # is the length of the next word.

Convert that length to an integer.

Read exactly that many characters after # → that’s one original string.

Move your pointer forward and repeat.

# Complexity Analysis

Let:

N = total number of characters in all strings combined.

## Time Complexity

Encoding:
We visit each string once and append its characters → O(N)

Decoding:
We traverse the encoded string once, reading each character and extracting substrings → O(N)

✅ Total Time Complexity: O(N)

## Space Complexity

Encoding:
Uses a StringBuilder storing the full encoded string → O(N)

Decoding:
Creates a list of strings (same total size as input) → O(N)

✅ Total Space Complexity: O(N)
