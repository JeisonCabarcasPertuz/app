# Usar la imagen oficial de OpenJDK para Java 21
FROM openjdk:21-jdk-slim

# Crear directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR generado
COPY target/app-1.0.0.jar app.jar

# Exponer el puerto en el que corre la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
