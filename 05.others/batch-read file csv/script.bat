@echo off
setlocal EnableDelayedExpansion
set filename=D:\test\AAA.csv
set "filter=findstr /R /N "^$" %filename% | find /C ":""
for /f %%a in ('!filter!') do (
	set number=%%a
)
echo number: %number%