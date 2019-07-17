import { Component, OnInit } from '@angular/core';
import { OwnerDashboardService } from '../owner-dashboard.service';

@Component({
  selector: 'app-owner-dashboard',
  templateUrl: './owner-dashboard.component.html',
  styleUrls: ['./owner-dashboard.component.css']
})
export class OwnerDashboardComponent implements OnInit {

 
  constructor(private ownerService:OwnerDashboardService) { }
  
  ArrayOfOwnerData : any = [];
  ArrayOfSpaceData : any = [];
  ngOnInit(){
  this.ownerService.getOwnerData().subscribe(data=>
    {
     console.log(data);
     this.ArrayOfOwnerData=data;
  });

  this.ownerService.getSpaceData().subscribe(data=>
    {
      this.ArrayOfSpaceData=data;
    });
  }

}
