# Welcome to your Neighborhood Library!

In this repository you will find the code written in the Java language, that builds an application for your Neighborhood Library. According to these instructions, the application is to be built with these specifications in mind:

The Library is a free service to anyone in the neighborhood, and is based on the honor system. Anyone can check out a book, they just enter their name and the application will track who checked it out. - Workbook2

## Screens:
When you run the code, the terminal displays a greeting to the user, followed by a display of the Home screen and the different screen options you can navigate into. The user can input a number from 1 - 4 to make a selection to go into a next page as shown below:

<img width="764" alt="Screenshot 2024-04-22 at 4 23 37 PM" src="https://github.com/Flour510/neighborhood-library/assets/99916123/c7176c0b-827e-410a-90a0-75b8e65cfd34">

## Available Books Screen:
If the user inputs selection 1 and presses enter, they will be prompted into that screen and a list of all Available Books will be displayed to the user. The infromation regarding the books will be displayed in this order:
* bookId
* bookIsbn
* bookTitle

Followed by a question prompting the user to make a selection from two choices as shown below: 
* C
* X

<img width="718" alt="Screenshot 2024-04-22 at 4 39 07 PM" src="https://github.com/Flour510/neighborhood-library/assets/99916123/b0dbd6c0-75b7-4475-913a-ba4b4a80c9fd">

## Input Errors!
In the case that the user enters input that are invalid characters, the application will prompt the display below:

<img width="509" alt="Screenshot 2024-04-22 at 4 53 53 PM" src="https://github.com/Flour510/neighborhood-library/assets/99916123/c04afd31-5cb9-4a31-b297-03dd0ff0c3d7">

This invalid input by the user prompts a message informing the user of their invalid entry. Followed by the refreshed Home screen to get another input from the user to move on to the next command.

## Interesting Piece of the Code
One part of this code I found interesting to build is option 2 & 3. Getting these to work and display the screen I wanted it to display was a challenging for me. 

In the screenshot below, the if() statement checks two conditions. 
* selectedBook != null
This condition checks if selectedBook is not (!=) void, meaning a book object has been selected.
* !selectedBook.getIsCheckedOut()
This conditon checks if the selected book is not already checked out. The getIsCheckedOut() method is a getter method for a boolean method isCheckedOut.

If both parameters are true, the code inside the if statement will run, otherwise it will move to displaying the else {} block code.

<img width="809" alt="Screenshot 2024-04-22 at 5 09 24 PM" src="https://github.com/Flour510/neighborhood-library/assets/99916123/eb7345b8-ba4e-451d-b8c1-939e21492f51">



