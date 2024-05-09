#!/bin/sh
sleep 5000

ldapmodify -h localhost -p 10389 -D uid=admin,ou=system -w secret -a -f ./apacheds-fortress.ldif