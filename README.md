# currency-service
Service that get currency from cbr.ru and give json

## Docker
You need run **docker pull bearchik/currency**  
and **docker run -d --rm -it bearchik/currency**

## Compile
Run command **mvn compile**

## Package
Run command **mvn package**

## Run
Run command **mvn spring-boot:run**

## Usage
You can use **mvn spring-boot:run** for run service.  
Or You need run command **mvn package** after this you need run **java -jar ./target/currency-0.0.1-SNAPSHOT.jar**

After this you can connect in any browser to url: http://127.0.0.1/currency/api/rate/

## Example
http://127.0.0.1/currency/api/rate/USD - get last USD(USA Dollar) cource

http://127.0.0.1/currency/api/rate/USD/2015-09-24 - get cource USD(USA Dollar) for date 24.09.2015

Output JSON:
```json
{"code":"USD","rate":"66.0410","date":"2015-09-24"}
```
