#!/bin/bash

. checkroot.sh

echo "This script try update \"currency\" app to error image."
kubectl set image deployments/currency-v1 currency=bearchik/currency:err
kubectl rollout status deployments/currency-v1

echo "Please wait couple minutes and"
echo "use script \"test_currency.sh\" for check that service is working."
