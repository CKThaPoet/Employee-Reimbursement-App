const url = 'http://localhost:8079/P1-Chani-Kinsler/' //I grabbed this base URL from postman
//it's also what shows up when you run as server and get your 404 page
//Eventually, we'll use this base URL and make calls to the server by adding endpoints to it

//add functionality to our button using an event listener
document.getElementById("buttonAll").addEventListener('click', viewTicketFunc);
//so when this button gets clicked, the function called assembleFunc will run
//we could have used: document.getElementById('getAvengerButton').onClick(assembleFunc);

//this function will get all avengers from our Java server
async function viewTicketFunc() { //async returns a promise (which fetch returns)

    //we will send a fetch request to get our avenger data
    //await makes the async functions wait until the promise returns with the fetched data

    //I will have to fix this for now it just gets all the reimbursements
    let response = await fetch(url + 'reimbursements', {credentials: "include"});

    

    if(response.status === 200) { //if the request is successful...
        console.log(response); //just to see what comes back for debug

        let data = await response.json(); //get the JSON data from the response, turn it into JS object
        console.log(data);


        //now, I want to put each reimbursement into my table

        //need to fix and double check if I need to put it in order by the java or how it is in the table
        for(let reimbursement of data) { //for every avenger in the data variable/object

            console.log(reimbursement); //just for debug, print the avenger in the console

            let row = document.createElement("tr"); //create a table row

            let cell = document.createElement("td"); //create a cell for the field
            cell.innerHTML = reimbursement.re_id; //fill the cell with avenger data
            row.appendChild(cell) //this row now has the first cell (av_id)
            

            //the we'll do this^ for each field in the avenger model
            let cell2 = document.createElement("td");
            cell2.innerHTML = reimbursement.re_author.user_name;
            row.appendChild(cell2);

            let cell3 = document.createElement("td");
            cell3.innerHTML = reimbursement.re_description;
            row.appendChild(cell3);

            let cell4 = document.createElement("td");
            cell4.innerHTML = reimbursement.reimbursement_type.re_type;
            row.appendChild(cell4);

            let cell5 = document.createElement("td");
            cell5.innerHTML = reimbursement.re_amount;
            row.appendChild(cell5);

            if(reimbursement.re_resolver != null){
              console.log("has a resolver")
              let cell6 = document.createElement("td");
              cell6.innerHTML = reimbursement.re_resolver;
              row.appendChild(cell6);
          } else { //otherwise, still append the cell but leave it empty
              let cell6 = document.createElement("td");
              row.appendChild(cell6);
          }

            //if the avenger has a home, just fill the cell with the home name
            //need to use the . operator with the reimbursement.reimbursement_status.re_status
            //  to get the word of the status instead of the id
            if(reimbursement.reimbursement_status.re_status != null){
                console.log("you will be judged lol")
                let cell7 = document.createElement("td");
                cell7.innerHTML = reimbursement.reimbursement_status.re_status;
                row.appendChild(cell7);
            } else { //otherwise, still append the cell but leave it empty
                let cell7 = document.createElement("td");
                row.appendChild(cell7);
            }



            document.getElementById("allInfo").appendChild(row);
            //so the variable "row" we created alllll the way at the top of the for loop 
            //will be appended to our empty table body in the HTML

        }

    }

}



//login functionality below-------------------------------------

//add an event listener to the login button
document.getElementById("loginButton").addEventListener('click', loginFunc);


//this function will send the user-inputted login credentials to the server
async function loginFunc() {

    //get the user inputs for the login
    let usern = document.getElementById("username").value; // usern stands for username
    let userp = document.getElementById("password").value; // userp stands for password

    //we want to send the user/passs as JSON, so what I need to do first is make a JS object
    //might have to change this
    let user = {
        user_name:usern,
        user_password:userp
    }

    console.log(user);

    //now I'm going to set up my fetch request to the server
    //rememeber the second parameter a fetch() can take? 
    //a configuration object!! Essentially the settings of a fetch request
    //if you don't include a second param, it'll just send a GET request to the URL.
    let response = await fetch(url + "login", {

        method: "POST", //send as a POST request
        body: JSON.stringify(user), //turn into JSON
        credentials: "include" //this will ensure that the cookie is captured
                              //future fetches will also require this value to send the cookie back
        //BTW we won't be using HTML forms anymore... it's too annoying to turn them into JSON
        //Don't worry too much, we will learn Angular and life will be grand
    });

    console.log(response.status);

    //control flow based on success or failed login
    if(response.status === 200) {
        //this will wipe our login row, and welcome the user
        document.getElementById("logged").innerText="Welcome!";
    } else {
        document.getElementById("logged").innerText="Login Failed! Refresh the page!";
    }

}