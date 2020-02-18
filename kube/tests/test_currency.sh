#!/bin/bash

. checkroot.sh

echo "Script will be test access to currency service."
echo "You can run command manualy: curl $(minikube service currency --url)/currency/api/rate && echo "

echo "Check API /currency/api/rate/USD"
echo -n "TEST: "
curl $(minikube service currency --url)/currency/api/rate/USD && echo 
echo "Check API /currency/api/rate/USD/2020-02-10"
echo -n "TEST: "
curl $(minikube service currency --url)/currency/api/rate/USD/2020-02-10 && echo

echo "--------"
for i in `seq 50` 
do 
    curl $(minikube service currency --url)/currency/api/rate && echo 
done