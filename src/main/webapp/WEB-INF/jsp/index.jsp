<!DOCTYPE html>
<html>
<head>
<!-- Add icon library -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Sofia">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  margin: 0;
}

html {
  box-sizing: border-box;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.column {
  float: left;
  width: 33.3%;
  margin-bottom: 16px;
  padding: 0 8px;
}

.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  margin: 8px;
}

.about-section {
  padding: 50px;
  text-align: center;
 background-color: #b3cccc; 
  color: black;
}

.container {
  padding: 0 16px;
  position: relative;
  border-radius: 5px;
  background-color: #f2f2f2;
}

.container::after, .row::after {
  content: "";
  clear: both;
  display: table;
}

.title {
  color: grey;
}

.button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 8px;
  color: white;
  background-color: #85adad;
  text-align: center;
  cursor: pointer;
  width: 100%;
}

.button:hover {
  background-color: #555;
}
.google {
  background-color: #dd4b39;
  color: white;
}
input,
.btn {
  width: 100%;
  padding: 12px;
  border: none;
  border-radius: 4px;
  margin: 5px 0;
  opacity: 0.85;
  display: inline-block;
  font-size: 17px;
  line-height: 20px;
  text-decoration: none; /* remove underline from anchors */
}

input:hover,
.btn:hover {
  opacity: 1;
}




input[type=submit]:hover {
  background-color: #45a049;
}

/* Two-column layout */
.col {
  float: inherit;
  width: 50%;
  margin: auto;
  padding: 0 50px;
  margin-top: 6px;
}

.about-section.center {
  display: inherit;
  margin-left: auto;
  margin-right: auto;
  width: 50%;
}


/* Responsive layout - when the screen is less than 650px wide, make the two columns stack on top of each other instead of next to each other */

@media screen and (max-width: 650px) {
  .column {
    width: 100%;
    display: inherit;
  }}
</style>
</head>
<body>

<div class="about-section">
<img src="/img/New-vision.png" alt="NewVision logo" class="center">
  <h1 style="color:#dd4b39 ">Welcome To NewVision Resume Builder</h1>
  <p style=" font-family: 'Sofia', sans-serif"> Build Your professional resume in minutes, download, and print</p>
  
  <p>Our online software generates resume templates with thousands of perfectly
   written work experience bullet points for you to choose from, covering all industries. 
   Just point and click to instantly place the work duties you performed onto your resume in bullet point format.</p>
</div>
 <div class="row">
    
      <div class="col">
<h2 style="text-align:center">
  <a href="userLogin" class="google btn">
          <i class="fa fa-google fa-fw"></i> Sign in With Google
        </a>
</h2>
</div>

</div>
  

</body>
</html>
