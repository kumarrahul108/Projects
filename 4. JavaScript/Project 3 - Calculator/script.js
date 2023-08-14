
let string ="";   // create empty string to display 
let buttons = document.querySelectorAll(".button");   // select all whose class name is button
Array.from(buttons).forEach((button) =>    // en buttons se 1 array bano or usspar lagao 1 for each 
{
    button.addEventListener("click",(e)=> {       // click karne par kya hoga 
        if(e.target.innerHTML == '=')
        {
            string = eval(string);
            document.querySelector('input').value = string; 
        }
        else if(e.target.innerHTML == 'C')
        {
            string = "";
            document.querySelector('input').value = string
        }
        else 
        {
        console.log(e.target);   // console me effect dikega click karne par  
        string = string + e.target.innerHTML; // add karo 
        document.querySelector("input").value = string; 
        } // value click hone par screen par show karne lagega ab   ==> lakin abhi calulate nahi karega : not applied arthematic operations 
    });
});      