function validateForm(){
    var cc_type = document.forms["card"]["cc_type"].value;
    var cc_no = document.forms["card"]["cc_no"].value;
    var exp_month = document.forms["card"]["exp_month"].value;
    var exp_year = document.forms["card"]["exp_year"].value;
    var auth = document.getElementById("auth");
    var today, expDay;

    today = new Date();
    expDay = new Date();
    expDay.setFullYear(exp_year, exp_month - 1);
    
    if(cc_type == ""){
        alert("Select a card type.");
        document.getElementById("cc_type").focus();
        return false;
    }
    else if (cc_no.length < 9 || cc_no.length > 9){
        alert("Please enter a card number 9 digits long.");
        document.getElementById("cc_no").focus();
        return false;
    }
    else if (exp_month == ""){
        alert("Select a month.");
        document.getElementById("exp_month").focus();
        return false;
    }
    else if (exp_year == ""){
        alert("Select a year.");
        document.getElementById("exp_year").focus();
        return false;
    }
    else if (expDay < today){
        alert("Expiration date cannot be in the past.");
        document.getElementById("exp_year").focus();
        return false;
    }
    else if (auth.checked == false){
        alert("Please check the box to continue.");
        document.getElementById("auth").focus();
        return false;
    }
}
