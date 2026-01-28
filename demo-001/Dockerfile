# 1단계: 빌드 (여기서 gradlew 사용)
FROM eclipse-temurin:21-jdk AS build
WORKDIR /app
COPY ../ .
RUN chmod +x ./gradlew
RUN ./gradlew :demo-001:build -x test --no-daemon

# 2단계: 실행 (최종 이미지에는 jar만 포함)
FROM eclipse-temurin:21-jdk
COPY --from=build /app/demo-001/build/libs/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]