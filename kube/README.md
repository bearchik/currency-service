# currency-service tools
Tools for for **Curency service** 

## Run Minikube
**initminikube.sh** - script run minikube, add istio and create **currency service** (bearchik/currency:lastest)

## Tests
**test_currency.sh** - script does test api and version
**update_tov2.sh** - script does update **currency service** to version 2 (bearchik/currency:v2)
**rollout.sh** - script rollout **currency service** to previous version
**update_error.sh** - script tryes update **currency service** to error image (bearchik/currency:err)
