# Drool-demo

This is Drool POC with API named "/user".

================================================================================================
API Input : 
  {
	"name" : "Sam",
	"age" : 19,
	"role" : "User"
 }
 
API output :
  {
    "name": "Sam",
    "role": "User",
    "age": 19,
    "message": "Rule engine feature is available for only admin users"
  }
 ================================================================================================
 API Input : 
  {
	"name" : "Mike",
	"age" : 22,
	"role" : "Admin"
 }
 
API output :
  {
    "name": "Mike",
    "role": "Admin",
    "age": 22,
    "message": "Mike is Adult"
  }
================================================================================================
API Input : 
  {
	"name" : "Jenny",
	"age" : 17,
	"role" : "Admin"
 }
 
API output :
  {
    "name": "Jenny",
    "role": "Admin",
    "age": 17,
    "message": " is Adolescence"
  }
================================================================================================
