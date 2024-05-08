FROM gradle:7.6.0-jdk17 as BUILDER
COPY . .
RUN gradle installBootDist

FROM amazoncorretto:17
WORKDIR /usr/build
COPY --from=BUILDER /home/gradle/build/install/ckow-boot .
WORKDIR /
EXPOSE 8080
CMD ["./bin/ckow"]