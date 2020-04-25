function validateForm(){
    var x = document.forms["contact"]["fn"].value;
    var x1 = document.forms["contact"]["ln"].value;
    var x2 = document.forms["contact"]["eaddr"].value;
    var x3 = document.forms["contact"]["dphone"].value;

    if(x == ""){
        alert("First name is a required field. Please provide your first name to continue.");
        return false;
    }
    else if (x1 == ""){
        alert("Last name is a required field. Please provide your last name to continue.");
        return false;
    }
    else if (x2 == ""){
        alert("Email address is a required field. Please provide your email address to continue.");
        return false;
    }
    else if (x3 == ""){
        alert("Day phone number is a required field. Please provide a phone number to continue.");
        return false;
    }
}