# Password Generator

This Password Generator is built in Java and generates a strong password based on the user's name. It provides a robust solution for users seeking a secure and personalized password.

## How It Works

### User Input
- The program first prompts the user to enter their name.

### Password Generation:
- The password is generated using a combination of the user's name and random values.
- The last three characters of the user's name are converted to uppercase and appended to the end of the password.

### Name-to-Number Conversion:
There are two approaches to generating the numeric portion of the password:

1. **Using Random Values**:
   - The program can generate random values for each letter in the name.
   - You can specify the range of these values, adding flexibility to the password generation process.

2. **Using ASCII Conversion**:
   - Each letter in the name is first converted to its corresponding ASCII value.
   - These ASCII values are then reduced to a single digit by summing the digits (e.g., U = 21, where 2 + 1 = 3).
   - The resulting single-digit values are concatenated to form part of the password.

### Example:

If the input name is "Abdul Kalam", the generated password could be `33421LAM`.

- Here's how it's broken down:
  - A = 1, B = 2, D = 4, U = 21 (2 + 1 = 3), L = 12 (1 + 2 = 3)
  - Concatenating these values gives `12433`.
  - The last three characters of "Kalam" are "LAM", so the final password is `12433LAM`.

## Conclusion

This Password Generator offers a secure and personalized approach to creating strong passwords. By incorporating both random values and character-based calculations, it ensures that each password is unique and difficult to guess.
