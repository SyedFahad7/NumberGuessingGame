let randomNumber = Math.floor(Math.random() * 100) + 1;
let attempts = 0;

function checkGuess() {
    let guess = parseInt(document.getElementById("guessInput").value);
    attempts++;

    if (guess === randomNumber) {
        document.getElementById("feedback").innerHTML = "Congratulations! You guessed the number correctly in " + attempts + " attempts!";
    } else if (guess < randomNumber) {
        document.getElementById("feedback").innerHTML = "Try again! The number I'm thinking of is higher than " + guess + ".";
    } else {
        document.getElementById("feedback").innerHTML = "Try again! The number I'm thinking of is lower than " + guess + ".";
    }

    document.getElementById("attempts").innerHTML = attempts;
}

function resetGame() {
    randomNumber = Math.floor(Math.random() * 100) + 1;
    attempts = 0;
    document.getElementById("guessInput").value = "";
    document.getElementById("feedback").innerHTML = "";
    document.getElementById("attempts").innerHTML = attempts;
}
