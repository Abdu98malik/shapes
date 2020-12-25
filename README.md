### RECTANGLE
GET localhost:8080/api/v1/surface/square
content-type: application-json
{
  "side" : 3
}

GET localhost:8080/api/v1/perimeter/sqaure
content-type: application-json
{
  "side" : 3
}

### Triangle
GET localhost:8080/api/v1/surface/triangle
content-type: application-json
{
  "sideA" : 3,
  "sideB" : 3,
  "sideC" : 3
}

GET localhost:8080/api/v1/perimeter/triangle
content-type: application-json
{
  "sideA" : 3,
  "sideB" : 3,
  "sideC" : 3
}

### Rectangle
GET localhost:8080/api/v1/surface/rectangle
content-type: application-json
{
  "sideA" : 3,
  "sideB" : 3
}

GET localhost:8080/api/v1/perimeter/rectangle
content-type: application-json
{
  "sideA" : 3,
  "sideB" : 3
}

### Circle
GET localhost:8080/api/v1/surface/circle
content-type: application-json
{
  "radius" : 3
}

GET localhost:8080/api/v1/perimeter/rectangle
content-type: application-json
{
  "radius" : 3
}
