#!/bin/bash

if [[ $EUID -eq 0 ]]; then
   echo "This script must be run as user without root permission." 
   exit 1
fi
