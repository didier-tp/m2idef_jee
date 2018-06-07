REM open with / text editor pour editer le contenu sous eclipse
REM open with / system editor pour lancer les commandes

cd /d "%~dp0"

set WSDL_URL=http://localhost:8080/m2idef_jee_ejb_impl/ServiceDeviseBean?WSDL

REM ./main/java = chemin relatif depuis de .bat (dans src)

wsimport -keep -d ./main/java %WSDL_URL%

REM visualiser le code généré dans src/main/java via un refresh eclipse
pause