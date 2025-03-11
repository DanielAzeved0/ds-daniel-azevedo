echo OFF
echo --- Comando automatico para a atividade
echo
echo
git status
git add .
git commit -m "Arquivos de Java"
git push
echo
echo
echo --- Fim! ---

pause 