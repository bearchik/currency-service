#!/bin/bash

. checkroot.sh

echo "This script rollout \"currency\" app to version1."
kubectl rollout status deployments/currency-v1

echo "Please wait couple minutes and"
echo "use script \"test_currency.sh\" for check update."
