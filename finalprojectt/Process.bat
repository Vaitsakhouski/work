cd
cd vagrant-lamp-wordpress
vagrant up
set PATH=%PATH%;D:\Git\usr\bin
vagrant ssh -c 'sudo sh/vagrant/importSql.bat; /bin/bash'--wait-exit
d:
cd D:\Finalproject\finalprojectt
mvn test