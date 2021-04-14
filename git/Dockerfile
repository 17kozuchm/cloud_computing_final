FROM ubuntu:16.04

COPY . /temp
WORKDIR /temp

RUN echo "root:root" | chpasswd
RUN apt-get update -y
RUN apt-get install -y git
RUN apt-get install -y netcat ssh iputils-ping && \
mkdir /var/run/sshd && \
chmod 0755 /var/run/sshd
RUN apt-get install -y ufw

COPY ./sshd_config /etc/ssh/sshd_config
CMD ["service", "sshd", "restart"]
EXPOSE 22
CMD ["ufw", "enable"]
CMD ["ufw", "default", "allow"]
CMD ["ufw", "allow", "22/tcp"]