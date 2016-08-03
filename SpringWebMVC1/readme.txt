URL to access hello page

http://localhost:8080/SpringWebMVC1/hello/

where SpringWebMVC1 is the name of the project/war file

hello is the request mapping path

Note : 

The servlet name i.e. HelloWebSPK is called THE FRAMEWORK SERVLET and serves 2 purpose
1. The Bean Configuration file i.e. _____-servlet.xml should start with this name
2. The servlet name mapped for the Dispatcher Servlet i.e. HelloWebSPK is NOT used any where..in the request URL
Since by default spring routes all requests to Dispatcher Servlet, however if its not defined throws an error

All Packages having controllers or other classes which uses spring annotations should be defined in -servlet.xml
for e.g. <context:component-scan base-package="com.spk" />