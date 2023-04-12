# crud-springboot-mongodb



## Mongo Express

Para facilitar vc pode rodar o mongo express dessa forma:

````powershell
#powershell
> docker run -it --rm ` 
--network crud-springboot-mongodb_mongo-compose-network `
--name mongo-express `
-p 8081:8081 `
-e ME_CONFIG_MONGODB_SERVER="mongo-server" `
-e ME_CONFIG_BASICAUTH_USERNAME="admin" `
-e ME_CONFIG_BASICAUTH_PASSWORD="q" `
-e ME_CONFIG_MONGODB_ADMINUSERNAME="root" `
-e ME_CONFIG_MONGODB_ADMINPASSWORD="MongoDB2019!" mongo-express
````
Lembrar sem de para o Mongo Express depois de usar