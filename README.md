GeoLocatorAPI
===================

The api is a wrapper for the REST webservice for GeoLocator. It uses [retrofit] (http://square.github.io/retrofit) to send REST requests to the webservice to be compatible with both Java and Android platform.

-----

```java
// Create and set the api 
LocatorService service = LocatorREST.getAPI();
// make rest calls using the wrapper methods
List<Cluster> allCluster = service.getAllClusters();
```

Optionally, you can change the endpoint url and set the logging level before setting up the API

```java
LocatorREST.setEndPoint("http://webapps-tckb.rhcloud.com/GeoLocator/service/geo/");
// Show all the debug messages
LocatorREST.setVerboseLevel(LogLevel.FULL);
```

I've provided some [api samples](https://github.com/tckb/GeoLocatorAPI/tree/master/src/main/java/com/tckb/geo/api/samples) to get started  and the library in<code>lib</code> but, before using the API, it is *strongly* adviced to use the [stub generator](https://github.com/tckb/GeoLocator-stub-gen) to generate the stubs located in  <code>com/tckb/geo/stubs</code> and rebult the project to keep consistent to the changes in the rest webservice.
