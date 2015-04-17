#!/bin/bash
cat requete.txt | grep --color=always "$1"
cat requete.txt | grep "$1" | wc -l;
