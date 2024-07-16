
# Usamos la imagen oficial de MySQL
FROM mysql
# Establecemos las variables de entorno para MySQL
ENV MYSQL_DATABASE=mydockerdb
ENV MYSQL_ROOT_PASSWORD=Santino0503
# Copiamos el archivo SQL de inicialización -lo tengo q crear
COPY db/init.sql /docker-entrypoint-initdb.d/