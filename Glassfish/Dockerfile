FROM ubuntu:18.04

RUN apt-get update
RUN apt-get install -y tar unzip zip

# Install Java
COPY jdk-8u212-linux-x64.tar.gz /usr/local/jdk-8u212-linux-x64.tar.gz
RUN cd /usr/local/ && tar -xvf jdk-8u212-linux-x64.tar.gz
ENV JAVA_HOME=/usr/local/jdk1.8.0_212
ENV PATH=$JAVA_HOME/bin:$PATH

# Install Glassfish
# COPY glassfish-5.0.zip /home/user/Oracle/
# RUN cd /home/user/Oracle/ && unzip glassfish-5.0.zip -d glassfish-5.0/
COPY glassfish-5.0 /home/user/Oracle/glassfish-5.0
ENV GLASSFISH_HOME=/home/user/Oracle/glassfish-5.0/glassfish5/glassfish
ENV PATH=$GLASSFISH_HOME/bin:$PATH

# Add all required libraries
# ENV GLASSFISH_LIB=$GLASSFISH_HOME/domains/domain1/lib/
# COPY glassfish-libs/* $GLASSFISH_LIB

# Set admin password
ENV PASSWORD=admin
RUN echo "----- CREATE PASSWORD FILE --------------------" && \
    echo "AS_ADMIN_PASSWORD=" > /tmp/gfpassword && \
    echo "AS_ADMIN_NEWPASSWORD=${PASSWORD}" >> /tmp/gfpassword  && \
    echo "----- CHANGE ADMIN PASSWORD AND SECURE ADMIN ACCESS --------------------" && \
    asadmin --user=admin --passwordfile=/tmp/gfpassword change-admin-password --domain_name domain1 && \
    echo "----- ENABLE DOMAIN ADMINISTRATION SERVER --------------------" && \
    asadmin start-domain && \
    echo "AS_ADMIN_PASSWORD=${PASSWORD}" > /tmp/gfpassword && \
    asadmin --user=admin --passwordfile=/tmp/gfpassword enable-secure-admin && \
    asadmin --user=admin stop-domain

# Delete ssl classes conflicting with those in JAVA_HOME
RUN cd $GLASSFISH_HOME/modules/endorsed && zip grizzly-npn-bootstrap.jar -d sun/security/ssl/*.class

EXPOSE 4848/tcp 9999/tcp

# Copy app file
# COPY archemy.ear $GLASSFISH_HOME/glassfish/domains/domain1/autodeploy/

CMD asadmin start-domain -v
