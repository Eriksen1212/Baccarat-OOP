
# Baccarat-OOP
=======

Baccarat OOP Project
Overview
This project implements a simulation of the card game Baccarat, specifically the 'punto banco' variant. The goal is to create a functional and object-oriented program using Java, adhering to specific class structures and interfaces provided. The project includes creating classes for Baccarat cards, hands, and the shoe from which cards are dealt.


Implementation Details
The project consists of several classes that encapsulate the functionality of the Baccarat game:

![image](https://github.com/Eriksen1212/Baccarat-OOP/assets/112687286/7201e771-6bce-4ffa-afa5-3b54e521c456)


BaccaratCard:

Represents a single playing card with a rank and suit.
Provides methods to get the rank and suit, compare cards, and return the card's value in Baccarat.

BaccaratHand:

Stores and manages a collection of BaccaratCard objects.
Provides methods to add cards, calculate the hand's value, and determine if the hand is a natural.

Shoe:

Represents the shoe containing multiple decks of cards.
Provides methods to shuffle the cards and deal them.

Main Program (Baccarat.java):

Creates a shoe with six decks, shuffles it, deals cards to the player and banker, and displays the results.
Includes both interactive and non-interactive modes for playing multiple rounds.

* [Using Gradle](#using-gradle)
* [Tests & Style Checking](#tests-and-style-checking)
* [Baccarat Application](#baccarat-application)
* [Cleaning Up](#cleaning-up)
* [Submitting](#submitting)

## Using Gradle

Everything you need to do in this assignment, aside from editing code, is
handled by the Gradle build system.  You can run Gradle from the command
line, or use it from within VS Code or IntelliJ IDE if you prefer (see below).

**You do not need to install Gradle yourself**, as we've included a
'Gradle wrapper' that will download a compatible version of the tool, along
with various library dependencies, if required.  **This will be very slow
the first time that it runs!**

You should run Gradle commands in the `cwk2` directory.  On Linux and macOS,
use `./gradlew`.  In a Windows command shell (`cmd.exe`), use `gradlew`.
In Windows Powershell, use `.\gradlew.bat`.
The commands below assume the use of Linux, macOS or WSL2.

**NOTE: if your PC is running anti-virus software, you should add an exclusion
for the `cwk2` directory to avoid potential problems with Gradle.**

### If Using Visual Studio Code

You can simplify the use of Gradle by installing the Gradle Tasks extension.
This will add a Gradle button to the side bar.  Clicking on this will
active a panel in which you can see and run the Gradle tasks for the
various projects.

### If Using IntelliJ IDEA

**Please use the most recent version of the IntelliJ, on your own PC.
We do not support the use of older versions for the coursework, and may
not be able to help you if you encounter problems.**

Use the *New Project* button to import `cwk2` as the project directory.
After the project has been imported, you should be able to use the Gradle
button on the right-hand edge of the IntelliJ window to active the Gradle
tool window.  From here you can access a hierarchical list of all the
supported Gradle tasks.  The main list entries you will need to use for the
coursework are

    Tasks/verification/test
    Tasks/verification/style
    Tasks/application/run
    Tasks/application/interact

Double-click on a list entry to run it for the first time.  After you've
done this, IntelliJ will create a 'run configuration' for it, allowing you
to rerun it in future in a more convenient way.  You can see the available
run configurations in a drop-down box at the top of the IDE window. Just
select your required configuration, then click on the *Run* button
(the green triangle) to run it.

## Tests and Style Checking

To run all the unit tests, recompiling code where necessary, do

    ./gradlew test

For this to work, you will need to ensure that all tested methods of the
three classes exist and can be called.  This means you will need to
implement at least some of them as **stubs**, following the approach used
in Coursework 1.

Test names and status (PASSED or FAILED) are listed in the terminal.
A **test report** is also generated in HTML, containing detailed information
about the tests and any failures that have occurred.  You can access this
by pointing your browser at `build/reports/tests/test/index.html`.
We suggest you keep this page open in a browser tab, refreshing it
as necessary, so that you always have full information available on test
results.

Note that Gradle won't normally rerun tests if they have all passed, unless
you've changed something in your code.  You can force it to recompile
everything and rerun the tests using

    ./gradlew test --rerun-tasks

To check coding style for the classes, do

    ./gradlew style

If there are any style violations, you'll see a count reported in the
terminal window.  A full report on the violations can be viewed by pointing
your browser at `build/reports/checkstyle/main.html`.

**Treat this as a rough guide.** Note that style checking is not exhaustive,
and we may still penalise you on style grounds  even if no violations are
reported here.  As with unit tests, Gradle normally won't rerun the style
check unless you change something in your code.

## Baccarat Application

You can run the Basic solution, or the non-interactive mode of the Full
solution, with

    ./gradlew run

For the 'interactive mode' of the Full solution, you can provide the required
`-i` command line argument to the program like this:

    ./gradlew interact

You can create a redistributable version of the application with

    ./gradlew distZip

This creates a Zip archive `comp1721_cwk2.zip`, in `build/distributions`.
This Zip archive contains the compiled code for all the classes, bundled into
a JAR file, plus a shell script and batch file that can be used to run the
application on Linux, macOS or Windows.

**Note: this is NOT the file that needs to be submitted to Minerva!**

## Cleaning Up

To remove all files generated by the build process, use

    ./gradlew clean

## Submitting

Your coursework solution must be submitted to Minerva as a single Zip
archive, containing all source code but omitting any compiler output or
other build artifacts.  A suitable Zip archive can be generated like this:

    ./gradlew submission

If you are using IntelliJ, you will be able to generate the Zip archive
by double-clicking on `Tasks/submission/submission` in the Gradle tool
window.

This will produce a Zip archive named `cwk2.zip`, containing everything that
you need to submit.  **You must then submit this manually to Minerva**, using
the link provided in the *Submit My Work* area.
>>>>>>> bdae167 (Initial commit)
