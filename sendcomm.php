<?php
                //Sending message to db
                if($_SERVER['REQUEST_METHOD']=='POST'){
                    $name=$_POST['name'];
                    $email=$_POST['email'];
                    $msg=$_POST['msg'];
                
                //connect to database
                $servername="localhost";
                $username="root";
                $password="";
                $database="trialmessage";   //Messages_dguitarist

                //create a connection
                $conn=mysqli_connect($servername,$username,$password,$database);

                //Die if connection unsucessful
                if(!$conn){
                    die("failed".mysqli_connect_error());
                }
                else{
                                        //Messages
                    $sql = "INSERT INTO `commentss` (`name`, `email`, `msg`) VALUES ('$name','$email','$msg')";
                    $result=mysqli_query($conn,$sql);
                    if($result){
                        echo '<div class="alert alert-warning alert-dismissible fade show" role="alert">
                                    <strong>Hello !!!</strong> We got your message.Thank you for texting us!
                                    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>';
                    }
                    else{
                        echo "We are sorry for the technical issue.";
                    }
                }
            }
            ?>