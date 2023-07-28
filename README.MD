## MOBILE API


```
POST http://localhost:8080/v1/device/book/Samsung/GalaxyS8/Edson

HTTP/1.1 200 OK
transfer-encoding: chunked
Content-Type: text/event-stream;charset=UTF-8

Response code: 200 (OK); Time: 840ms (840 ms)

data:{"name":"GalaxyS8","brand":"Samsung","technology":"GSM / HSPA / LTE","band2g":"GSM 850 / 900 / 1800 / 1900 - SIM 1 & SIM 2 (dual-SIM model only)","band3g":"HSDPA 850 / 900 / 1700(AWS) / 1900 / 2100","band4g":"1, 2, 3, 4, 5, 7, 8, 12, 13, 17, 18, 19, 20, 25, 26, 28, 32, 66, 38, 39, 40, 41","bookedOn":[2023,7,28,16,15,51,874326000],"bookedBy":"Edson","booked":true,"availability":false}


Connection closed
```


```
GET http://localhost:8080/v1/device/devices

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
    "bookedOn": [
      2023,
      7,
      28,
      16,
      5,
      24,
      31733000
    ],
    "bookedBy": "Edson",
    "booked": true,
    "availability": false
  }
]
Response file saved.
> 2023-07-28T160536.200.json

Response code: 200 (OK); Time: 37ms (37 ms); Content length: 386 bytes (386 B)
```

```
POST http://localhost:8080/v1/device/return/Samsung/GalaxyS8

HTTP/1.1 200 OK
transfer-encoding: chunked
Content-Type: text/event-stream;charset=UTF-8

Response code: 200 (OK); Time: 35ms (35 ms)

data:{"name":"GalaxyS8","brand":"Samsung","technology":"GSM / HSPA / LTE","band2g":"GSM 850 / 900 / 1800 / 1900 - SIM 1 & SIM 2 (dual-SIM model only)","band3g":"HSDPA 850 / 900 / 1700(AWS) / 1900 / 2100","band4g":"1, 2, 3, 4, 5, 7, 8, 12, 13, 17, 18, 19, 20, 25, 26, 28, 32, 66, 38, 39, 40, 41","bookedOn":null,"bookedBy":null,"booked":false,"availability":true}


Connection closed
```

```
GET http://localhost:8080/v1/device/devices

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
    "booked": false,
    "availability": true
  }
]
Response file saved.
> 2023-07-28T161613.200.json

Response code: 200 (OK); Time: 14ms (14 ms); Content length: 359 bytes (359 B)
```
