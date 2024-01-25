call scripts\build-windows.bat
if %errorlevel% == 0 goto :compilationSuccess
goto :compilationFailure

:compilationSuccess
call scripts\execute-windows.bat
goto :eof

:compilationFailure
echo SCRIPT: Java compilation failed
