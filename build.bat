@echo off
set "JAVA_HOME=c:\Users\pc1234\.jdks\corretto-24.0.2"
set "MAVEN_HOME=C:\Program Files\JetBrains\IntelliJ IDEA 2025.2.1\plugins\maven\lib\maven3"
set "PATH=%MAVEN_HOME%\bin;%JAVA_HOME%\bin;%PATH%"

echo Using JAVA_HOME: %JAVA_HOME%
echo Using Maven: %MAVEN_HOME%

call mvn clean package
if %ERRORLEVEL% NEQ 0 (
    echo Build failed!
    exit /b %ERRORLEVEL%
)

echo Build SUCCESS!
pause
