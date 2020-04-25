function calculate(){
    var payments = parseInt(document.loan.years.value) * 12;
    var interest = parseInt(document.loan.interest.value) / 100 / 12;
    var principal = parseInt(document.loan.amount.value);

    var x = Math.pow(1 + interest, payments);
    var monthly = (principal * x * interest) / (x - 1);
    var total = monthly * payments;

    document.loan.monthly.value = monthly.toFixed(2);
    document.loan.pi.value = total.toFixed(2);
}