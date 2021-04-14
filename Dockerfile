#Start initial user interface

FROM base_app

RUN apt-get update -y
RUN apt-get install -y sshpass
RUN apt-get install -y xterm
RUN apt-get install -y netcat ssh iputils-ping && \
mkdir /var/run/sshd && \
chmod 0755 /var/run/sshd

COPY . /temp
WORKDIR /temp

RUN javac app.java
CMD ["javac", "./*.java", "./com/centerkey/utils/*.java"]
CMD ["java", "app"]