TASK MANAGER - CI/CD

-Que es este proyecto

Aplicacion de gestion de tareas en Java 17.

Pipeline CI que automatiza:

*Checkstyle

*Pruebas unitarias (JUnit 5)

*Cobertura (JaCoCo)

*Compilacion (Maven)

*Fallo automatico si tests o cobertura minima no se cumplen

Se puede ejecutar localmente con act y Docker.

CI vs CD

*CI: Pruebas automaticas al subir cambios

*CD: Entrega automatica a produccion o entornos de prueba

Cobertura minima: 70%

Requisitos

*Docker

*Java 17 y Maven

Uso de act

act ejecuta workflows de GitHub Actions localmente en contenedores.

Comando:

act -j build-and-test


Pasos: checkout, dependencias, Checkstyle, build, pruebas, cobertura.
Reportes:

*JaCoCo: target/site/jacoco/index.html

*Checkstyle: reglas google_checks.xml

Notas finales

Si tests o cobertura fallan, pipeline se detiene. Logs completos en GitHub Actions o act local.

IA y deteccion

*Patrones de estilo y estadistica (GPTZero, OpenAI)

*No es posible asegurar autoría 100%

*Politicas: usar IA como apoyo, declarar uso, entender y modificar el codigo, revision humana en produccion