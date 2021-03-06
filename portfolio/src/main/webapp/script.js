// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random greeting to the page.
 */
function addRandomGreeting() {
    const greetings =
        ['Hello world!', '¡Hola Mundo!', '你好，世界！', 'Bonjour le monde!'];

    // Pick a random greeting.
    const greeting = greetings[Math.floor(Math.random() * greetings.length)];

    // Add it to the page.
    const greetingContainer = document.getElementById('greeting-container');
    greetingContainer.innerText = greeting;
}
async function getName() {
    const response = await fetch('/welcome');
    const quote = await response.text();
    document.getElementById("quote").innerText = quote;
}
async function getPlaces() {
    const response = await fetch('/places');
    places = await response.json();
    document.getElementById("places-container").innerText = places;
}

async function getGuesses() {
    const response = await fetch('/data');
    const guess = await response.json();

    const guessHistory = document.getElementById('history');
    guess.forEach((line) => {
        guessHistory.appendChild(createListElement(line.title));
        console.log(line.title);
    });

    function createListElement(text) {
        const liElement = document.createElement('li');
        liElement.innerText = text;
        console.log(text);
        return liElement;
    }
}

async function getBlobstoreUrl() {
    const response = await fetch('/getUrl');
    const imageUrl = await response.json();

    const imageForm = document.getElementById('image-form');
    imageForm.action = imageUrl;
    console.log(imageUrl);

    const guessHistory = document.getElementById('uploads');
    guess.forEach((line) => {
        guessHistory.appendChild(createListElement(line.uploadUrl));
        console.log(line.uploadUrl);
    });

    function createListElement(url) {
        const liElement = document.createElement('li');
        liElement.innerText = url;
        console.log(url);
        return liElement;
    }

    const image = document.getElementById("image-upload");
    image.src = imageUrl;

}

function loadFunctions() {
    // getBlobstoreUrl();
    getGuesses();
}
