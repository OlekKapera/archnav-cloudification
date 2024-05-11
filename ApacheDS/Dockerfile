FROM openjdk:8

# Install LDAP tools
ENV DEBIAN_FRONTEND=noninteractive
RUN \
    apt-get update && \
    apt-get install -y -qq ldap-utils netcat && \
    rm -rf /var/lib/apt/lists/*

# Define ApacheDS version
ENV APACHEDS_VERSION=2.0.0-M24
ENV APACHEDS_SERVICE_NAME=apacheds-${APACHEDS_VERSION}-default

# Install ApacheDS
RUN \
    wget https://archive.apache.org/dist/directory/apacheds/dist/${APACHEDS_VERSION}/apacheds-${APACHEDS_VERSION}-amd64.deb -q -O /tmp/apacheds.deb && \
    dpkg -i /tmp/apacheds.deb && \
    rm /tmp/apacheds.deb

# Add fortress schema
ADD apacheds-fortress.ldif /tmp/
RUN \
    service ${APACHEDS_SERVICE_NAME} start && \
    timeout 30 sh -c "while ! nc -z localhost 10389; do sleep 1; done" && \
    service ${APACHEDS_SERVICE_NAME} status && \
    ldapmodify -v -x -h localhost -p 10389 -D uid=admin,ou=system -w secret -a -f /tmp/apacheds-fortress.ldif && \
    service ${APACHEDS_SERVICE_NAME} stop

EXPOSE 10389
CMD ["sh", "-c", "service ${APACHEDS_SERVICE_NAME} console"]
