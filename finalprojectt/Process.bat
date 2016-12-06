vagrant up ad8846e
set PATH=%PATH%;D:\Git\usr\bin
vagrant ssh -c 'sudo sh/vagrant/importSql.bat; /bin/bash'--wait-exit
d:
cd D:\Finalproject\finalproject
mvn test