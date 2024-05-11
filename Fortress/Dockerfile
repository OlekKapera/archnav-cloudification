FROM tomcat:9.0.21-jdk8-corretto

WORKDIR /usr/local/tomcat/

# Copy tomcat-users.xml
COPY tomcat-users.xml /usr/local/tomcat/conf/

# Copy context.xml
COPY context.xml /usr/local/tomcat/webapps/manager/META-INF/

# Copy catalina.sh with JAVA_OPTS
COPY catalina.sh /usr/local/tomcat/bin/
RUN chmod +x /usr/local/tomcat/bin/catalina.sh

# Install maven
COPY apache-maven-3.6.1-bin.tar.gz apache-maven-3.6.1-bin.tar.gz
RUN yum install -y tar gzip
RUN tar -xvf apache-maven-3.6.1-bin.tar.gz
ENV M2_HOME=/usr/local/tomcat/apache-maven-3.6.1
ENV PATH=$M2_HOME/bin:$PATH

# Copy Realm JAR
COPY fortress-realm-proxy-2.0.3.jar /usr/local/tomcat/lib/

# Copy Fortress source code
COPY fortress-core-2.0.3 fortress-core-2.0.3
COPY fortress-web-2.0.3 fortress-web-2.0.3
COPY fortress-rest-2.0.3 fortress-rest-2.0.3

EXPOSE 8080

# Install Fortress Core
# Install Fortress Web
# Install Fortress Rest
# Start the Service
CMD (/usr/local/tomcat/bin/catalina.sh run &) ; \
    cd /usr/local/tomcat/fortress-core-2.0.3 && \
    mvn clean install && \
    mvn install -Dload.file=./ldap/setup/refreshLDAPData.xml && \
    cd /usr/local/tomcat/fortress-web-2.0.3 && \
    mvn clean install -Dload.file=./src/main/resources/FortressWebDemoUsers.xml tomcat:deploy && \
    cd /usr/local/tomcat/fortress-rest-2.0.3 && \
    mvn clean install -Dload.file=./src/main/resources/FortressRestServerPolicy.xml tomcat:deploy && \
    /usr/local/tomcat/bin/catalina.sh run
