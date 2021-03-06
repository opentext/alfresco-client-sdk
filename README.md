# Alfresco Java Client

## Introduction
This project contains a Java library to consume the public Alfresco REST API.

It includes a set of APIs that allows developers to quickly build Alfresco-enabled Java & Android applications. 

## Important Notice

Alfresco Java Client doesn't support workflow API (i.e interacting with embedded Activiti)
If you are looking for a client to interact with Activiti Rest API (Enterprise Only), please have a look to [Activiti Java Client Github Repo](https://github.com/Alfresco/activiti-client-sdk)

## Requirements

Alfresco REST API v1 is currently available with version 201606 and later of Alfresco Community.

## Overview
- **Client Java**: Contains Client API Project for Alfresco
    * **Alfresco Java Client** set of APIs to interact with Alfresco Alfresco Public API 1.0 (Alfresco 5.2+)
    * **Client API Commons** utility used by all client APIs
- **Docs**: contains informations about Alfresco REST API as implemented in the current version. For up to date info see [API Explorer github Repository](https://github.com/Alfresco/rest-api-explorer/tree/master/src/main/webapp/definitions)
- **Client Samples** : Various sample project. They illustrate different ways to use, consume and customize Client API & SDK.
    * **Client Samples Java** Sample simple project using different java technique: java7, java8, RxJava...
    * **Client Samples Command Line Tool** Illustrate how to use Client API as command Line tool.

## Build

**Build Librairies**
    
    mvn clean install -DskipTests=true
	
## How to Contribute ?

If you spot a bug then please raise an issue on [Github](https://github.com/Alfresco/alfresco-client-sdk/issues?q=is%3Aopen+sort%3Acreated-desc)<br/>
If you would like to contribute code you can do so through GitHub by forking the repository and sending a pull request.<br/>
When submitting code, please make every effort to follow existing conventions and style in order to keep the code as readable as possible.<br/>
	
## License

    Alfresco Client Librairies

    Copyright © 2017 Alfresco Software, Ltd. and others.

    This product distribution is made available under the Apache 2.0 license.
    
 

## Technical Overview
Client API projects are based on 3 Java/Android librairies

* [OkHttp][2]
* [Retrofit][1]
* [Gson][3]

[Retrofit][1] is a type-safe REST client for Java/Android built by Square. The library provides a powerful framework for authenticating and interacting with APIs.

Retrofit send network requests with [OkHttp][2] an HTTP & HTTP/2 client for Android and Java applications also built by Square. This library makes downloading JSON or XML data from a web API fairly straightforward. 

Once the data is downloaded then it is parsed into a Plain Old Java Object (POJO) which must be defined for each "resource" in the response. Retrofit supports many different parsers for processing network response data ([Gson][3], [Jackson][4], [Moshi][5], [Protobuf][6], [Wire][7], [Simple XML][8])

### Advantages

* Easy to consume: API can be consumed synchronuously and/or asynchronuously and/or in a Reactive Approach ([RxJava][9])
* Easy to setup: API declaration is simple and POJO model can be easily generated via Swagger Definition
* Simple architecture & Easy to customize: Each component can be modified and customized to match 
* Large community and Open Source compatible	
	
### More informations

**Retrofit**

- [Simple HTTP with Retrofit 2 (Droidcon NYC 2015)](https://speakerdeck.com/jakewharton/simple-http-with-retrofit-2-droidcon-nyc-2015)
- [Consuming APIs with Retrofit](https://guides.codepath.com/android/Consuming-APIs-with-Retrofit#setup)
- [Retrofit 2.0: The biggest update yet on the best HTTP Client Library for Android](http://inthecheesefactory.com/blog/retrofit-2.0/en)
- [Retrofit Series](https://futurestud.io/blog/retrofit-2-upgrade-guide-from-1-9)

**OkHttp**

- [A Few 'Ok' Libraries (Droidcon MTL 2015)](https://speakerdeck.com/jakewharton/a-few-ok-libraries-droidcon-mtl-2015)

**Gson**

- [Gson User Guide](https://github.com/google/gson/blob/master/UserGuide.md)

**RxJava & RxAndroid**

- [Grokking RxJava](http://blog.danlew.net/2014/09/15/grokking-rxjava-part-1/)
- [Retrofit and RxJava, Android multi-threaded REST requests](http://randomdotnext.com/retrofit-rxjava/)

   
[1]: http://square.github.io/retrofit/
[2]: http://square.github.io/okhttp/
[3]: https://github.com/google/gson
[4]: http://wiki.fasterxml.com/JacksonHome
[5]: http://github.com/square/moshi
[6]: http://github.com/google/protobuf
[7]: http://github.com/square/wire
[8]: http://simple.sourceforge.net/
[9]: https://github.com/ReactiveX/RxJava
