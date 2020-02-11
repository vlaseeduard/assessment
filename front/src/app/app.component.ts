import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})


export class AppComponent implements OnInit{
  url = 'http://127.0.0.1:8080'
  randomNumber;
  constructor(private http: HttpClient) {}
  ngOnInit() {
    this.fetchData();
  }
  private fetchData() {
    this.http
      .get( this.url + '/assessment')
      .pipe(
        map(responseData => {
          const dataArray = [];
          for (const key in responseData) {
            if (responseData.hasOwnProperty(key)) {
              dataArray.push(responseData);
            }
          }
          return dataArray;
        })
      ).subscribe(posts => {
        this.randomNumber = posts[0].randomNumber;
      });  
  }
}
