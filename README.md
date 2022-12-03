# Justification for this project

!!!THIS PROJECT IS CURRENTLY UNDER DEVELOPMENT !!!

A playground Spring Boot project to experiment with Serverless Spring Cloud Function.

## Further Information

- [Spring Cloud Function](https://spring.io/projects/spring-cloud-function)
- [spring-cloud-function-samples](https://spring.io/projects/spring-cloud-function)


## Debug Logs

For extra debugging information start the application following JVM arguments:

```
-Dspring.profiles.active=local
-Djavax.net.debug=all
-Dcom.sun.xml.ws.transport.http.HttpAdapter.dump=true
-Dcom.sun.xml.ws.transport.http.client.HttpTransportPipe.dump=true
-Djdk.internal.httpclient.debug=true
-Djdk.httpclient.HttpClient.log=errors,requests
```
