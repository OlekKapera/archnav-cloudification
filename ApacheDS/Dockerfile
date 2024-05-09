FROM openmicroscopy/apacheds:latest

COPY apacheds-fortress.ldif apacheds-fortress.ldif

COPY docker-run.sh docker-run.sh 

RUN chmod +x docker-run.sh 

EXPOSE 10389

CMD ["docker-run.sh"]