# ContextInjection

Simple project that tests class-level injection by RESTeasy. This will fail under certain conditions:

* The Injected class is not scanned by RESTeasy. It's manually added via [Application.getSingletons()][1].
* There is a beans.xml file found in the classpath.

The [InjectionTest][src/test/java/de/utkast/rest/contextinjection/InjectionTest] will fail if you rename [src/main/webapp/WEB-INF/_beans.xml] to beans.xml.

See also [@Context issue when migrating from JBoss 7.1.1 to Wildfly][2].

 [1]: https://jax-rs-spec.java.net/nonav/2.0/apidocs/javax/ws/rs/core/Application.html#getSingletons()
 [2]: http://stackoverflow.com/questions/25276225/context-issue-when-migrating-from-jboss-7-1-1-to-wildfly