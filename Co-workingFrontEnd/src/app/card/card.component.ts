import { Component, OnInit } from '@angular/core';
import { CardService } from '../card.service';
import { ActivatedRoute, Router } from '@angular/router';
import { LocationService } from '../location.service';
// import { LocationService } from '../location.service';
@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {
  constructor(private cardService: CardService, private locationService: LocationService, private route: ActivatedRoute, private router: Router) { }
  arrayOfCategory: any = [];
  arrayOfObject
  locationName:any;
  spaceName:any;
  // arrayOfCategoryName: any = ["Hot Desk","Private Cabin"];
  location1: string;
  ngOnInit() {
    // this.cardService.getTrainingRoom().subscribe(data => {
    //   console.log(data);
    //   console.log(data[0].SpaceId);
    //   console.log(data[1].SpaceId);
    //   console.log(data[2].SpaceId);
    //   this.arrayOfSpace = data;
    // });
    this.location1 = sessionStorage.getItem('location');
    console.log("printing location")
   
    const category = this.route.snapshot.paramMap.get('category');
    console.log(category);
    // this.location=this.locationService.location;
    this.cardService.getByCategory(category).subscribe(data => {
      this.arrayOfCategory = data;
      console.log(sessionStorage.getItem("location"))
      this.arrayOfCategory = this.arrayOfCategory.map(e => (e.location.locationName ==
        this.location1) ? e : null);
      this.arrayOfCategory = this.arrayOfCategory.filter(e => e !== null)
      console.log(this.arrayOfCategory);
      
      this.arrayOfObject=this.arrayOfCategory
     console.log( this.arrayOfCategory[0].categoryName)
     console.log( this.arrayOfCategory[0].mySpace.spaceName)
     console.log( this.arrayOfCategory[0].mylocation.locationName)
     this.locationName=this.arrayOfCategory[0].mylocation.locationName
     this.spaceName=this.arrayOfCategory[0].mySpace.spaceName
     sessionStorage.setItem("spaceName",this.spaceName)
     sessionStorage.setItem("locationName",this.locationName)
     
     console.log(this.locationName)
     console.log(this.spaceName)
    });
  }
  click(value){
    console.log(value);
     this.router.navigateByUrl("details/"+value);
  }
}

