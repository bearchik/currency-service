#!/bin/bash

. checkroot.sh

echo "This script update \"currency\" app to version2"
kubectl set image deployments/currency-v1 currency=bearchik/currency:v2
kubectl rollout status deployments/currency-v1

if [[ $? != 0 ]]
then
  echo "The deploy has failed!"
  exit 1
fi

echo "Please wait couple minutes and"
echo "use script \"test_currency.sh\" for check update"
