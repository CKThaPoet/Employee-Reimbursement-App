const url = 'http://localhost:8079/P1-Chani-Kinsler/' //I grabbed this base URL from postman
//it's also what shows up when you run as server and get your 404 page
//Eventually, we'll use this base URL and make calls to the server by adding endpoints to it

//add functionality to our button using an event listener
document.querySelector(".submitButton").addEventListener('click', submitRequestFunc);


async function submitRequestFunc() {
  //await makes the async functions wait until the promise returns with the fetched data

    //I will have to fix this for now it just gets all the reimbursements
    let response = await fetch(url + 'addReimbursements', {credentials: "include"});

    console.log(response);
}