
let taskbar = document.getElementsByClassName('taskbar')[0];
let startmenu = document.getElementsByClassName('startmenu')[0]; 

taskbar.addEventListener('click',() => {
    console.log('clicked');  // to check wheter our event lister is woring or not 
    if(startmenu.style.bottom == "50px")
    {
        startmenu.style.bottom = "-900px"
    }
    else 
    {
        startmenu.style.bottom = "50px"
    }
});


// agar niche hai tu bahar nikalo & vice versa 