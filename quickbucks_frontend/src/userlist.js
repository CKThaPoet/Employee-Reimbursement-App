const url = 'http://localhost:8079/P1-Chani-Kinsler/' //I grabbed this base URL from postman
//it's also what shows up when you run as server and get your 404 page
//Eventually, we'll use this base URL and make calls to the server by adding endpoints to it

//add functionality to our button using an event listener
document.querySelector("#buttonAll").addEventListener('click', viewUsersFunc);
//so when this button gets clicked, the function called assembleFunc will run
//we could have used: document.getElementById('getAvengerButton').onClick(assembleFunc);

//this function will get all avengers from our Java server
async function viewUsersFunc() { //async returns a promise (which fetch returns)

    //we will send a fetch request to get our avenger data
    //await makes the async functions wait until the promise returns with the fetched data

    //I will have to fix this for now it just gets all the reimbursements
    let response = await fetch(url + 'allUsers', {credentials: "include"});

    

    if(response.status === 200) { //if the request is successful...
        console.log(response); //just to see what comes back for debug

        let data = await response.json(); //get the JSON data from the response, turn it into JS object
        console.log(data);


        //now, I want to put each reimbursement into my table

        //need to fix and double check if I need to put it in order by the java or how it is in the table
        for(let user of data) { //for every avenger in the data variable/object

            console.log(user); //just for debug, print the avenger in the console

            let row = document.createElement("tr"); //create a table row

            let cell = document.createElement("td"); //create a cell for the field
            cell.innerHTML = user.user_id; //fill the cell with avenger data
            row.appendChild(cell) //this row now has the first cell (av_id)
            

            //the we'll do this^ for each field in the avenger model
            let cell2 = document.createElement("td");
            cell2.innerHTML = user.user_first_name + " " + user.user_last_name;
            row.appendChild(cell2);

            let cell3 = document.createElement("td");
            cell3.innerHTML = user.user_name;
            row.appendChild(cell3);

            let cell4 = document.createElement("td");
            cell4.innerHTML = user.user_email;
            row.appendChild(cell4);

            let cell5 = document.createElement("td");
            cell5.innerHTML = user.user_role.user_role;
            row.appendChild(cell5);



            document.getElementById("allInfo").appendChild(row);
            //so the variable "row" we created alllll the way at the top of the for loop 
            //will be appended to our empty table body in the HTML

        }

    }

}