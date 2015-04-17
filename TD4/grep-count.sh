#!/bin/bash
tr '[:upper:]' '[:lower:]' < requete.txt | egrep --color=always  "$1"
tr '[:upper:]' '[:lower:]' < requete.txt | egrep "$1" | wc -l;
