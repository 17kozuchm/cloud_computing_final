#Start initial user interface
FROM ubuntu:16.04

RUN apt-get update && \
    apt-get install -y curl \
    wget \
    openjdk-8-jdk
RUN apt-get install -y libgl-dev
RUN apt-get install -y wmctrl xdotool
RUN apt-get update && apt-get -y install firefox
