<!DOCTYPE html>

<html lang="en">
    <head>
        <title>Payment Summary</title>
    </head>

<body>
    <?php
        echo "Your payment has been submitted with the following data:<br/>";
        $cc_type = $_POST['cc_type'];
        echo "<br/>Card Type: " . $cc_type . "<br/>";
        $cc_no = $_POST['cc_no'];
        echo "<br/>Card Number: " . $cc_no . "<br/>";
        $exp_month = $_POST['exp_month'];
        $exp_year = $_POST['exp_year'];
        echo "<br/>Expiration Date: " . $exp_month . "/" . $exp_year . "<br/>";
        if(empty($_REQUEST["auth"])){
            echo "<br/>This is not an authorized purchase.<br/>";
        }
        else{
            echo "<br/>This is an authorized purchase.<br/>";
        }
        $cc_owner = $_POST['cc_owner'];
        echo "<br/>This is a " . $cc_owner . " credit card.<br/><br/>";
    ?>
    <div><a href="https://icarus.cs.weber.edu/~sl40466/index.html">Back to Home</a></div>
</body>

</html>