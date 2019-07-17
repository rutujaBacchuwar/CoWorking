import { Component, OnInit } from '@angular/core';
import { CardService } from '../card.service';
import { LocationService } from '../location.service';

@Component({
  selector: 'app-spaces',
  templateUrl: './spaces.component.html',
  styleUrls: ['./spaces.component.css']
})
export class SpacesComponent implements OnInit {

  constructor(private cardService: CardService,private locationService:LocationService) { }
  arrayOfSpace: any = [];
  arrayOfSpace1: any = [];
  arrayOfCategory: any = [];

  loc:String;
  ngOnInit() {
    console.log(this.locationService.location);
    this.loc=this.locationService.location;
    this.locationService.getSpaceByLocation(this.loc).subscribe(data=>{
      this.arrayOfSpace=data;
      console.log(this.arrayOfSpace);
    });

   
  }

}
