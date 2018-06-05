cd /d "%~dp0"
git init
git add *
git commit -a -m "version initiale"
git remote add gitHubOrigin https://didier-tp:pwd007!@github.com/didier-tp/m2idef_jee.git
git push -u gitHubOrigin master
pause

REM open with text editor
REM opne with system editor