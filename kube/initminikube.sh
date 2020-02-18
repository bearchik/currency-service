#!/bin/bash


echo "This script will run Minikube, add istio and create \"currency\" pods"
read -p "Continue? (Y/N): " confirm && [[ $confirm == [yY] || $confirm == [yY][eE][sS] ]] || exit 1

echo ""
echo "!!!!!!!Start minikube with 4 CPU and 4096MiB RAM.!!!!!!!"
minikube start --cpus 4 --memory 4096
sleep 5

echo ""
echo "!!!!!!!Add istio in minikube with default profile.!!!!!!!"
istioctl manifest apply --set profile=default
sleep 5

echo ""
echo "!!!!!!!Create pods and services for currency app!!!!!!!"
kubectl apply -f ./currency.yaml

echo ""
echo "Please wait couple minutes for service started and can use test in dir \"./tests\" "
