#!/bin/bash

tr '[:upper:]' '[:lower:]' < requete.txt | egrep $2 --color=always  "$1"
tr '[:upper:]' '[:lower:]' < requete.txt | egrep $2 "$1" | wc -l;
