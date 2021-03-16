<! DOCTYPE html>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">OCTYPE html>
<html lang="en">
<head>

	<meta charset="UTF-8">
	<title>Resume Design</title>
	<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
 <style>
 {	
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  list-style: none;
  font-family: "Montserrat", sans-serif;
}

body {
  background: #585c68;
  font-size: 14px;
  line-height: 22px;
  color: #008b8b;
}

.bold {
  font-weight: 700;
  font-size: 20px;
  text-transform: uppercase;
}

.semi-bold {
  font-weight: 500;
  font-size: 16px;
}

.resume {
  width: 800px;
  height: auto;
  display: flex;
  margin: 50px auto;
}

.resume .resume_left {
  width: 280px;
  background: #008b8b;
}

.resume .resume_left .resume_profile {
  width: 100%;
  height: 280px;
}


.resume .resume_left .resume_content {
  padding: 0 25px;
}

.resume .title {
  margin-bottom: 20px;
}

.resume .resume_left .bold {
  color: #fff;
}

.resume .resume_left .regular {
  color: #b1eaff;
}

.resume .resume_item {
  padding: 25px 0;
  border-bottom: 2px solid  #b1eaff;
}

.resume .resume_left .resume_item:last-child,
.resume .resume_right .resume_item:last-child {
  border-bottom: 0px;
}

.resume .resume_left ul li {
  display: flex;
  margin-bottom: 10px;
  align-items: center;
}

.resume .resume_left ul li:last-child {
  margin-bottom: 0;
}

.resume .resume_left ul li .icon {
  width: 35px;
  height: 35px;
  background: #fff;
  color: #0bb5f4;
  border-radius: 50%;
  margin-right: 15px;
  font-size: 16px;
  position: relative;
}

.resume .icon i,
.resume .resume_right .resume_hobby ul li i {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}

.resume .resume_left ul li .data {
  color: #b1eaff;
}

.resume .resume_left .resume_skills ul li {
  display: flex;
  margin-bottom: 10px;
  color: #b1eaff;
  justify-content: space-between;
  align-items: center;
}

.resume .resume_left .resume_skills ul li .skill_name {
  width: 25%;
}

.resume .resume_left .resume_language ul li {
  display: flex;
  margin-bottom: 10px;
  color: #b1eaff;
  justify-content: space-between;
  align-items: center;
}

.resume .resume_left .resume_language ul li .language_name {
  width: 25%;
}

.resume .resume_left .resume_social .semi-bold {
  color: #fff;
  margin-bottom: 3px;
}

.resume .resume_left .resume_language .semi-bold {
  color: #fff;
  margin-bottom: 3px;
}

.resume .resume_right {
  width: 520px;
  background: #fff;
  padding: 25px;
}



.resume .resume_right .bold {
  color: #008b8b;
}

.resume .resume_right .resume_work ul,
.resume .resume_right .resume_education ul {
  padding-left: 40px;
  overflow: hidden;
}

.resume .resume_right ul li {
  position: relative;
}

.resume .resume_right ul li .date {
  font-size: 16px;
  font-weight: 500;
  margin-bottom: 15px;
}

.resume .resume_right ul li .info {
  margin-bottom: 20px;
}

.resume .resume_right ul li:last-child .info {
  margin-bottom: 0;
}

.resume .resume_right .resume_work ul li:before,
.resume .resume_right .resume_education ul li:before {
  content: "";
  position: absolute;
  top: 5px;
  left: -25px;
  width: 6px;
  height: 6px;
  border-radius: 50%;
  border: 2px solid #008b8b;
}

.resume .resume_right .resume_work ul li:after,
.resume .resume_right .resume_education ul li:after {
  content: "";
  position: absolute;
  top: 14px;
  left: -21px;
  width: 2px;
  height: 115px;
  background:#008b8b;
}
justify-content: space-between;
}

</style>

</head>



<body>

<div class="resume">
   <div class="resume_left">
     
     <div class="resume_content">
       <div class="resume_item resume_info">
         <div class="title">
           
           <p class="regular">Designation</p>
         </div>
         <ul>
          <li>
             <div class="icon">
               <i class="fas fa-envelope"></i>
             </div>
             <div class="data">
              email
             </div>
           </li>
           <li>
             <div class="icon">
              <i class="fas fa-map-signs"></i>
              
             </div>
             <div class="data">
              Adress
             </div>
           </li>
           <li>
             <div class="icon">
               <i class="fas fa-user"></i>
             </div>
             <div class="data">
             Gender
             </div>
           </li>
          <li>
             <div class="icon">
               <i class="fas fa-calendar-times"></i>
             </div>
             <div class="data">
             DOB
             </div>
           </li>
        
           <li>
             <div class="icon">
               <i class="fas fa-mobile-alt"></i>
             </div>
             <div class="data">
               Mobile Number
             </div>
           </li>
          
           
         </ul>
       </div>
      
       <div class="resume_item resume_skills">
          <div class="title">
           <p class="bold">SKILLS</p>
         </div>
          <ul>
           <li>
             <div class="skill_name">
              SKILL-1
             </div>
             </li>
             <li>
             <div class="skill_name">
              SKILL-2
             </div>
             </li>
             
             </ul>
       </div>
       
       <div class="resume_item resume_social">
         <div class="title">
           <p class="bold">SOCIAL</p>
         </div>
         <ul>
            <li>
             <div class="icon">
               <i class="fab fa-skype"></i>
             </div>
             <div class="data">
               <p class="semi-bold">Skype</p>
              
             </div>
           </li>
           <li>
             <div class="icon">
               <i class="fab fa-linkedin"></i>
             </div>
                <div class="data">
               <p class="semi-bold">Linkedin</p>
              
             </div>
         </li>
              <li>
             <div class="icon">
               <i class="fab fa-facebook-square"></i>
             </div>
             <div class="data">
               <p class="semi-bold">Facebook</p>
               
             </div>
             </li>
         </ul>
       </div>
       
       
       <div class="resume_item resume_language">
         <div class="title">
           <p class="bold">Language</p>
         </div>
            
           <ul>
           <li>
             <div class="language_name">
              Language-1
             </div>
             </li>
             <li>
             <div class="language_name">
              Language-2
             </div>
             </li>
             
             </ul>
       </div>
     </div>
  </div>
  
  
  
  <div class="resume_right">
  
    <div class="resume_item resume_about">
        <div class="title">
           <p class="bold">NAME</p>
           <p class="semi-bold">about yourself</p>
         </div>
           </div>
  
  <div class="resume_item resume_education">
      <div class="title">
           <p class="bold">Education</p>
         </div>
      <ul>
            <li>
                <div class="date">FROM(2016) - TO(2020)</div> 
                <div class="info">
                     <p class="semi-bold">Drgree</p> 
                  <p>colledge Name(Univercity Name)</p>
                </div>
            </li>
            
        </ul>
      
    </div>
  
    <div class="resume_item resume_work">
        <div class="title">
           <p class="bold">Work Experience</p>
         </div>
         <ul>
            <li>
                <div class="date">joining(2019)-Leaving(2020)</div> 
                <div class="info">
                     <p class="semi-bold">Designation</p> 
                  <p>Company name(New vision)</p>
                </div>
            </li>
            </ul>
    </div>
    
   
    
     <div class="resume_item resume_currentWork">
        <div class="title">
           <p class="bold">Current Organization</p>
           <h6>${orgDetails.comName}</h6>
         </div>
        <ul>
            <li>
                
                <div class="info">
                     <p class="semi-bold">Designation</p> 
                  <p>Company name(New vision)</p>
                </div>
            </li>
            </ul>
       
    </div>
     <div class="resume_item resume_achievements">
        <div class="title">
           <p class="bold">Achievements</p>
         </div>
         <ul>
         <li><i class="achievement-1"></i>Achievement-1</li>
         <li><i class="achievement-2"></i>Achievement-2</li>
         
      </ul>
    </div>
    
     <div class="resume_item resume_reference">
        <div class="title">
           <p class="bold">References</p>
         </div>
         <ul>
         <li><i class="ref1"></i>Name of person</li>
         <p>(designation) (email)</p>
          <p>(contact) (organisation)</p>
           <p>adress</p>
      </ul>
    </div>
    
  </div>
</div>

</body>
</html>

