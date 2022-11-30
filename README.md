# Justification for this project

A playground Spring Boot project to experiment with Spring Cloud Function.

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
