import { Injectable } from '@angular/core';

const TOKEN_KEY = 'auth-token';
const USER_KEY = 'auth-user';
const USER_TYPE = 'user-type';

@Injectable({
  providedIn: 'root'
})
export class TokenStorageService {

  constructor() { }

  signOut() {
    window.sessionStorage.clear();
  }

  
  public saveToken(token: string) {
    console.log("saving in storage " + TOKEN_KEY  + " : " + token);
    window.sessionStorage.removeItem(TOKEN_KEY);
    window.sessionStorage.setItem(TOKEN_KEY, token);
  }
  
  public getToken(): string {
    return sessionStorage.getItem(TOKEN_KEY);
  }

  
  public saveUserType(userType: string) {
    console.log("saving in storage " + USER_TYPE  + " : " + userType);
    window.sessionStorage.removeItem(USER_TYPE);
    window.sessionStorage.setItem(USER_TYPE, userType);
  }

  public getUserType(): string {
    return sessionStorage.getItem(USER_TYPE);
  }

  

  public saveUser(user) {
    console.log("saving in storage " + USER_KEY  + " : " + user);
    window.sessionStorage.removeItem(USER_KEY);
    window.sessionStorage.setItem(USER_KEY, JSON.stringify(user));
  }

  public getUser() {
    return JSON.parse(sessionStorage.getItem(USER_KEY));
  }
}