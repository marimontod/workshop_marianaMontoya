FROM anapsix/alpine-java:8
WORKDIR /app
COPY build/libs/demoReceptora-0.0.1-SNAPSHOT.jar app/app.jar
EXPOSE 8080
CMD java -XX:MaxRAMFraction=1 -XX:MaxRAM=$(( $(cat /sys/fs/cgroup/memory/memory.limit_in_bytes) * 67 / 100 )) -jar /app/app.jar