import { Component, OnInit } from '@angular/core';
import { ClientDashboardService } from '../client-dashboard.service';

@Component({
  selector: 'app-client-dashboard',
  templateUrl: './client-dashboard.component.html',
  styleUrls: ['./client-dashboard.component.css']
})
export class ClientDashboardComponent implements OnInit {

  ArrayOfClientSpace : any = [];
  ArrayOfdetails: any =[];
  userName:string
  contactNumber:any;
  emailId:any;
  i:any;
  
  constructor(private clientDashboardService:ClientDashboardService ) {
    this.userName=sessionStorage.getItem('username')
    console.log(this.userName)
    this.contactNumber=sessionStorage.getItem('contactNumber');
    console.log(this.contactNumber)
    this.emailId=sessionStorage.getItem('emailId');
    console.log(this.emailId)


   }
 
  ngOnInit() {
    this.getSpaceDetailsByUserName();
  }

  getSpaceDetailsByUserName():any{
    console.log(this.userName);

    this.clientDashboardService.getSpaceDetailsByUserName(this.userName).subscribe(data=>
      {
        console.log(data);
        this.ArrayOfClientSpace=data;
       
      });


  }

 



}
