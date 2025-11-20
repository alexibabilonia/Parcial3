VALIDACION DE LOS REGISTROS

-Fallo de ejecucion

Sucedio cuando la cobertura fue del 80% y el log reportó:
La regla infringida para el paquete calculadora es que la proporcion de instrucciones cubiertas es 0.80, mientras que se esperaba un 

mínimo de 0.85.

Esto interrumpió el pipeline debido a que no se alcanzó el umbral de cobertura.

-Corrida exitosa

Se consiguio modificando el pom.xml para que no incluyera la clase sin cobertura. El log terminó con:

CONSTRUCCIÓN EXITOSA

El informe de JaCoCo reveló una cobertura del 100% en clases, líneas, instrucciones, ramas y métodos.

- Cómo detectar errores en los registros

Linter: señala errores de estilo; si se ejecuta checkstyle:check, el run no funciona.

Pruebas: señala "Errores" o "Fallas" en los resultados.

Cobertura: si el umbral especificado en pom.xml no se cumple, se muestra "Regla violada". 

IA y Etica

Técnicas de identificación

Análisis de patrones de estilo: vocabulario, repetición y estructura sintáctica.

Instrumentos automáticos: GPTZero, Turnitin con módulos de inteligencia artificial u otros detectores parecidos.

Restricciones

No se puede garantizar la autoría al 100%: los detectores pueden arrojar falsos positivos o negativos.

El estilo humano puede, en ocasiones, coincidir con los patrones de inteligencia artificial.

Políticas sugeridas

Habilitar la IA para que asista en documentación, investigación o sugerencias, pero no para crear código completo en evaluaciones.

Si se emplea IA, solicitar referencias explícitas.

Promover la transparencia y la ética en contextos profesionales y educativos.