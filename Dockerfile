FROM gradle:7.6.0-jdk17 as BUILDER
COPY . .
RUN gradle installBootDist

FROM amazoncorretto:17
COPY --from=BUILDER /home/gradle/build/install/ckow-boot .
EXPOSE 8080
CMD ["./bin/ckow"]