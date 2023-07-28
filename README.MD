## MOBILE API

```
POST http://localhost:8080/v1/devices/book/Samsung/GalaxyS8/Edson

HTTP/1.1 200 OK
transfer-encoding: chunked
Content-Type: text/event-stream;charset=UTF-8

Response code: 200 (OK); Time: 12ms (12 ms)

data:{"id":1,"name":"GalaxyS8","brand":"Samsung","technology":"GSM / HSPA / LTE","band2g":"GSM 850 / 900 / 1800 / 1900 - SIM 1 & SIM 2 (dual-SIM model only)","band3g":"HSDPA 850 / 900 / 1700(AWS) / 1900 / 2100","band4g":"1, 2, 3, 4, 5, 7, 8, 12, 13, 17, 18, 19, 20, 25, 26, 28, 32, 66, 38, 39, 40, 41","bookedOn":[2023,7,28,17,42,14,946184000],"bookedBy":"Edson","booked":true,"availability":false}


Connection closed
```


```
GET http://localhost:8080/v1/devices

HTTP/1.1 200 OK
transfer-encoding: chunked
Content-Type: application/json

[
  {
    "id": 1,
    "name": "GalaxyS8",
    "brand": "Samsung",
    "technology": "GSM / HSPA / LTE",
    "band2g": "GSM 850 / 900 / 1800 / 1900 - SIM 1 & SIM 2 (dual-SIM model only)",
    "band3g": "HSDPA 850 / 900 / 1700(AWS) / 1900 / 2100",
    "band4g": "1, 2, 3, 4, 5, 7, 8, 12, 13, 17, 18, 19, 20, 25, 26, 28, 32, 66, 38, 39, 40, 41",
    "bookedOn": [
      2023,
      7,
      28,
      17,
      42,
      14,
      946184000
    ],
    "bookedBy": "Edson",
    "booked": true,
    "availability": false
  }
]
Response file saved.
> 2023-07-28T174327.200.json

Response code: 200 (OK); Time: 9ms (9 ms); Content length: 395 bytes (395 B)

```

```
POST http://localhost:8080/v1/devices/return/Samsung/GalaxyS8

HTTP/1.1 200 OK
transfer-encoding: chunked
Content-Type: text/event-stream;charset=UTF-8

Response code: 200 (OK); Time: 28ms (28 ms)

data:{"name":"GalaxyS8","brand":"Samsung","technology":"GSM / HSPA / LTE","band2g":"GSM 850 / 900 / 1800 / 1900 - SIM 1 & SIM 2 (dual-SIM model only)","band3g":"HSDPA 850 / 900 / 1700(AWS) / 1900 / 2100","band4g":"1, 2, 3, 4, 5, 7, 8, 12, 13, 17, 18, 19, 20, 25, 26, 28, 32, 66, 38, 39, 40, 41","bookedOn":null,"bookedBy":null,"availability":true,"booked":false}


Connection closed
```

```
GET http://localhost:8080/v1/devices

HTTP/1.1 200 OK
transfer-encoding: chunked
Content-Type: application/json

[
  {
    "name": "GalaxyS8",
    "brand": "Samsung",
    "technology": "GSM / HSPA / LTE",
    "band2g": "GSM 850 / 900 / 1800 / 1900 - SIM 1 & SIM 2 (dual-SIM model only)",
    "band3g": "HSDPA 850 / 900 / 1700(AWS) / 1900 / 2100",
    "band4g": "1, 2, 3, 4, 5, 7, 8, 12, 13, 17, 18, 19, 20, 25, 26, 28, 32, 66, 38, 39, 40, 41",
    "bookedOn": null,
    "bookedBy": null,
    "availability": true,
    "booked": false
  }
]
Response file saved.
> 2023-07-28T163941.200.json

Response code: 200 (OK); Time: 11ms (11 ms); Content length: 359 bytes (359 B)
```
