@echo off
set "JAVA_HOME=c:\Users\pc1234\.jdks\corretto-24.0.2"
set "JAVA_EXE=%JAVA_HOME%\bin\java.exe"

if not exist "%JAVA_EXE%" (
    echo Java executable not found at %JAVA_EXE%
    echo Please make sure you have Java 21+ installed or update this script.
    pause
    exit /b 1
)

echo Using Java from: %JAVA_EXE%
"%JAVA_EXE%" -jar target\Aplicacion_sencilla_con_GridPane-1.0-SNAPSHOT.jar
pause
