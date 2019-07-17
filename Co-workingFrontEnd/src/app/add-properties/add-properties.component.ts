import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { HttpBackend } from '@angular/common/http';

@Component({
   selector: 'app-add-properties',
   templateUrl: './add-properties.component.html',
   styleUrls: ['./add-properties.component.css']
})
export class AddPropertiesComponent implements OnInit {

   title = 'materialApp';
   firstFormGroup: FormGroup;
   secondFormGroup: FormGroup;
   thirdFormGroup: FormGroup;

   

   constructor(private _formBuilder: FormBuilder) { }
   ngOnInit() {
      this.firstFormGroup = this._formBuilder.group({
         IdCtrl: ['', Validators.required],
         NameCtrl: ['', Validators.required],
         CategoryCtrl: ['', Validators.required],
         PriceCtrl: ['', Validators.required],
         HeightCtrl: ['', Validators.required],
         WidthCtrl: ['', Validators.required]
      });
      this.secondFormGroup = this._formBuilder.group({
         NumberCtrl: ['', Validators.required],
         AreaCtrl: ['', Validators.required],
         CityCtrl: ['', Validators.required],
         StateCtrl: ['', Validators.required],
         CountryCtrl: ['', Validators.required],
         PincodeCtrl: ['', Validators.required]

      });
      this.thirdFormGroup = this._formBuilder.group({
         AmenitiesCtrl: ['', Validators.required]
      });
   }
   // spaceId: any;
   // spaceName: any;
   // category: any;
   // price: any;
   // height: any;
   // width: any;
   // buildingNumber: any;
   // area: any;
   // city: any;
   // state: any;
   // country: any;
   // pincode: any;


   // saveDetails(spaceId, spaceName, category, price, height, width, buildingNumber, area, city, state, country, pincode) {
   //    let obj = [
   //       spaceId = spaceId,
   //       spaceName = spaceName,
   //       category = category,
   //       price = price,
   //       height = height,
   //       width = width,
   //       buildingNumber = buildingNumber,
   //       area = area,
   //       city = city,
   //       state = state,
   //       country = country,
   //       pincode = pincode]


   //    console.log(obj);

   // }

}
