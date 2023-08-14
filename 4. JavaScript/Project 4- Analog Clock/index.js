
setInterval(() => {

    // creating date object 
    d = new Date();
    htime = d.getHours();   // hours
    mtime = d.getMinutes();  // minutes
    stime = d.getSeconds();  // seconds 

    // Calculation part using formnula of unitary method 
    hrotation = 30*htime + mtime/2;
    mrotation = 6*mtime;
    srotation = 6*stime; 

    // setting css 
    hour.style.transform = `rotate(${hrotation}deg)`;
    minute.style.transform = `rotate(${mrotation}deg)`;
    second.style.transform = `rotate(${srotation}deg)`;

},1000);


// Calculation Portion for the rotation of needle 

/* 
    toatl rotation = 360 degree 

    // Hour Needle 

    12 hr => 360 deg 
    1 hr => 360/12 = 30 deg 
    y hr => (30 X y)degree  

    
    60 min => 30 degree      // SINCE 1 Hour => 30 DEGRE ROTATION  
    1 min => 30/60 = 0.5 deg 
    y min => (0.5 X y)degree

    Hour needle (y) = (30 X y)degree + (0.5 X y)degree



    // Minute Needle 

    60 min => 360 degree
    1 min => 360/60 = 6 degree
    
    Minute needle(y) = (6 X y)degree 



    // Second Needle 

    60 sec => 360 degree
    1 sec => 360/60 =6 degree

    Second Needle(y) = (6 X y)degree



   



*/