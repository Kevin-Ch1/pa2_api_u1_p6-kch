# pa2_api_u1_p6_kch

## Ejemplos de uso de Contextos

### @ApplicationScope

**1.- Clientes de APIs externas:** Evita crear clientes HTTP repetidamente.

**2.- Caché en Memeoria:** Para datos que cambian poco.

**3.- Cliente REST:** Para llamar servicios externos de forma reusable.

**4.- Configuración y Properties:** Bean que centraliza lecturas de configuración.

**5.- Scheduler:** Para ejecutar procesos en segundo plano.

**6.- Rate limiter por IP:** Controla cuántas peticiones acepta cada IP en una ventana de tiempo.

**7.- Generador de Secuencias:** Mantiene un control atómico global para generrar IDs únicos en la JVM.

### @Dependent

**1.- Builder de consultas SQL dinámicas:** Construye queries cin estado mutable; cada uso debe partir desde cero.

**2.- Validador de formulario con errores acumulados:** Acumula errores de validación durante un único proceso de validación.

**3.- Formateador de moneda:** Formatea números como monedas usando el Locale del bean que lo inyecta.

**4.- Serializador JSON configurable:** Envuelve ObjectMapper con configuración específica para cada uso.

**5.- Validador de pipeline de datos (ETL):** Valida y registra errores fila a fila durante la importación de datos.

**6.- Cifrado y Criptografía:** Las clases de Java para encriptar o crear hashes no son seguros para hilos.

**7.- Constructor de Facturas:** Una clase que calcula impuestos, aplica descuentos, suma líneas de productos y, al final, expulsa el objeto Factura final.

### @Singleton

**1.- Gestor de locks distribuidos en memoria:** Controla acceso exclusivo a recursos comparitdos.

**2.- Logger personalizado:** Servicio que centraliza logging con formatos, nivel dinámico o envío a sistemas externos.

**3.- Registro de métricas:** Lleva estadísticas globales de la aplicación

**4.- Servicio de traducción:** Provee traducciones reutilizables. 

**5.- Gestor de ciclos de vida de la aplicación:** Orquesta el arranque y apagado ordenado de todos los subsitemas.

**6.- Registro de freature flags:** Activa o desactiva funcionalidades en runtime sin reiniciar la app.

**7.- Inicializador de datos maestros (Bootstrap):** Carga tablas de referencia al arranque y falla rápido si hay error.