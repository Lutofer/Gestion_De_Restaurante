# SISTEMA DE GESTION PARA UN RESTAURANTE

## «Año de la Esperanza y el Fortalecimiento de la Democracia»

---

## Universidad Tecnologica del Perú

### Curso:
Herramientas de Desarrollo  

### Profesor:
Jose Luis Milla Flores  

### Alumnos:
- Parejas Marcelo, Roosevelt Joaquin  
- Collana Perez, Maria Fernanda  
- Bayona Cobeñas, Cristopher Franchesco  
- Muñoz Zapata, Loana Aracelli  

### Año:
2026  

---

# 1. Agradecimientos

Queremos expresar nuestro agradecimiento a todas las personas que, de una u otra manera, contribuyeron al desarrollo de este proyecto. A nuestros docente, por brindarnos los conocimientos y la guía necesaria durante el proceso de aprendizaje; y a nuestra institución, por proporcionarnos las herramientas y el entorno adecuado para nuestra formación profesional. 

Asimismo, agradecemos el apoyo y la colaboración entre los integrantes del grupo, ya que el trabajo en equipo fue fundamental para lograr los objetivos planteados. 

---

# 2. Dedicatoria

Dedicamos este trabajo a nosotros mismos, por el esfuerzo, la dedicación y la constancia que pusimos en cada etapa del desarrollo del proyecto. También lo dedicamos a nuestras familias, quienes han sido un pilar importante en nuestro camino académico, brindándonos apoyo y motivación para seguir adelante. 

Finalmente, lo dedicamos a todas aquellas personas que buscan superarse día a día y alcanzar sus metas, recordando que el aprendizaje es un proceso continuo. 

---

# 3. Resumen

El presente proyecto consiste en el desarrollo de un sistema de gestión de restaurantes utilizando tecnologías modernas como Spring Boot para el backend, MySQL para la base de datos y GitHub como herramienta de control de versiones. Este sistema está orientado a optimizar los procesos operativos dentro de un restaurante, integrando módulos clave como la gestión de inventario (insumos y menú), administración de mesas en tiempo real, facturación, generación de reportes de ventas y gestión de usuarios según roles (meseros, administradores y cocineros).  

La implementación de este sistema busca mejorar la eficiencia en la atención al cliente, reducir errores en la toma de pedidos y control de stock, y facilitar la toma de decisiones mediante reportes automatizados. Asimismo, se promueve el trabajo colaborativo mediante el uso de herramientas de desarrollo modernas, aplicando buenas prácticas en el manejo de versiones y desarrollo de software.  

---

# 4. Abstract

This project involves the development of a restaurant management system using modern technologies such as Spring Boot for the backend, MySQL for database management, and GitHub for version control. The system aims to optimize restaurant operations by integrating key modules such as inventory management (supplies and menu), real-time table management, billing system, sales reporting, and user management based on roles (waiters, administrators, and chefs).  

The implementation of this system seeks to improve customer service efficiency, reduce errors in order handling and stock control, and support decision-making through automated reports. Additionally, it encourages collaborative work through the use of modern development tools and best practices in version control and software development.  

---

# 5. Realidad Problematica:

En la actualidad, muchos restaurantes presentan deficiencias en la gestión de sus procesos operativos, especialmente en el control de inventarios, lo que genera pérdidas económicas, desperdicio de insumos y una planificación ineficiente. La gestión del abastecimiento y de la cocina es un factor clave en este tipo de negocios, ya que una mala administración puede afectar directamente la rentabilidad y la satisfacción del cliente (Cruz Ulloa, 2024).  

Asimismo, diversas investigaciones evidencian que la falta de sistemas formales de control de inventarios en restaurantes ocasiona problemas en la gestión financiera y limita la toma de decisiones. En muchos casos, las empresas no cuentan con políticas ni procesos definidos, lo que impide un adecuado control interno y repercute negativamente en su rentabilidad (Restrepo et al., 2020).  

Además, el uso limitado de herramientas tecnológicas en restaurantes reduce su competitividad, ya que actualmente la digitalización permite mejorar procesos internos y brindar un mejor servicio al cliente. La implementación de sistemas informáticos en restaurantes se ha convertido en una necesidad para optimizar operaciones y generar ventajas competitivas en el mercado (Pinos Robles, 2021).  

En este contexto, se evidencia la necesidad de desarrollar soluciones tecnológicas que integren la gestión de inventarios, pedidos, usuarios y reportes, con el fin de mejorar la eficiencia operativa y la calidad del servicio en los restaurantes.  

---

# 6. Justificación del Proyecto

El desarrollo de un sistema de gestión de restaurantes se justifica por la necesidad de optimizar los procesos operativos y mejorar la eficiencia en la administración del negocio. La implementación de una solución tecnológica permitirá automatizar tareas como el control de inventario, la gestión de mesas, la facturación y la generación de reportes de ventas, reduciendo significativamente los errores humanos y mejorando la calidad del servicio.  

Asimismo, este sistema facilitará la coordinación entre los distintos roles del restaurante (meseros, cocineros y administradores), permitiendo una comunicación más fluida y organizada. Esto se traduce en una mejor experiencia para el cliente y en una mayor productividad del personal.  

Desde el punto de vista empresarial, contar con información en tiempo real permitirá tomar decisiones más acertadas, optimizar recursos y aumentar la rentabilidad del negocio (Oracle Hospitality, s.f.). Además, el uso de tecnologías como Spring Boot, MySQL y GitHub garantiza el desarrollo de una solución escalable, segura y alineada con las prácticas actuales de la ingeniería de software.  

Finalmente, este proyecto también se justifica en el ámbito académico, ya que permite aplicar conocimientos teóricos en un caso práctico real, fortaleciendo habilidades en desarrollo backend, gestión de bases de datos y trabajo colaborativo mediante control de versiones, competencias esenciales para el desempeño profesional.  

---

# 7.  Objetivo general:

Desarrollar un sistema de gestión para restaurantes que contribuya a optimizar los procesos operativos del negocio, a través de la implementación de funcionalidades como el control de inventarios, la gestión de pedidos, la administración de usuarios y la generación de reportes. Este sistema busca mejorar las actividades diarias del restaurante como reducir errores en los procesos manuales, facilitar el control de los recursos disponibles y apoyar la toma de decisiones mediante información actualizada. Con el fin de mejorar la calidad del servicio brindado al cliente y aportar a una mejor rentabilidad y productividad del negocio mediante el uso de la tecnología.  

---

# 8. Objetivos específicos:

- Analizar los procesos operativos de un restaurante para identificar las principales dificultades relacionadas con el control de inventario, la gestión de pedidos y la administración general, con el fin de plantear una solución adecuada a estas necesidades.  

- Diseñar una base de datos estructurada que permita organizar y gestionar de manera eficiente la información relacionada con productos, usuarios, pedidos, ventas e inventario dentro del sistema.  

- Desarrollar e implementar el backend del sistema utilizando Spring Boot para automatizar procesos como la gestión de pedidos, el control de inventarios y la administración de usuarios.  

- Integrar una base de datos en MySQL que permita almacenar, consultar y administrar la información del sistema de manera segura y ordenada.  

- Utilizar GitHub como herramienta de control de versiones para llevar un mejor seguimiento del desarrollo del proyecto y fomentar el trabajo colaborativo entre los integrantes del equipo.  

---

# 9. Marco teórico:

## 9.1 Sistemas de Gestión de Restaurantes

Un sistema de gestión de restaurantes es una solución tecnológica diseñada para apoyar y optimizar las operaciones que se realizan dentro de un restaurante, permitiendo administrar procesos como pedidos, control de inventarios, ventas, usuarios y generación de reportes. Este tipo de sistemas buscan automatizar tareas que normalmente se realizan de manera manual, reduciendo errores, mejorando los tiempos de respuesta y brindando mayor organización en la administración del negocio.  

Además, la implementación de estos sistemas permite mejorar la eficiencia operativa y ofrecer un mejor servicio al cliente, ya que facilita el control de las actividades diarias y contribuye a una mejor toma de decisiones.  

---

## 9.2 Gestión de inventarios

La gestión de inventarios es uno de los procesos más importantes dentro de un restaurante, ya que permite controlar el ingreso, almacenamiento y salida de insumos o productos necesarios para la operación. Un adecuado manejo del inventario ayuda a evitar pérdidas económicas, desperdicios, faltantes de stock y problemas en la atención al cliente.  

También permite optimizar recursos, planificar compras de manera más eficiente y mantener un mejor control sobre los costos del negocio, siendo un factor importante para la rentabilidad del restaurante.  

---

## 9.2 Automatización de procesos

La automatización de procesos consiste en el uso de herramientas tecnológicas para ejecutar tareas de manera más rápida, ordenada y eficiente, reduciendo la intervención manual. En el contexto de los restaurantes, permite agilizar actividades como registrar pedidos, controlar inventarios, emitir reportes y administrar información.  

Su aplicación contribuye a disminuir errores humanos, mejorar la productividad del personal y optimizar el funcionamiento general del negocio.  

---

## 9.3 Sistemas de información

Los sistemas de información son conjuntos de herramientas, procesos y recursos tecnológicos que permiten recopilar, almacenar, procesar y administrar datos para apoyar las operaciones de una organización y la toma de decisiones.  

En un restaurante, estos sistemas facilitan el manejo de información relacionada con ventas, inventarios, usuarios y pedidos, permitiendo tener datos organizados, actualizados y disponibles para una mejor gestión.  

---

## 9.4 Tecnologías utilizadas en el desarrollo

Para el desarrollo del sistema se emplearán herramientas y tecnologías que permitan construir una solución robusta y escalable.  

- **Spring Boot**  
Es un framework que facilita el desarrollo de aplicaciones backend, permitiendo construir servicios eficientes, seguros y escalables mediante una arquitectura organizada.  

- **MySQL**  
Es un sistema gestor de bases de datos relacional que permite almacenar, organizar y administrar la información del sistema de forma segura y estructurada.  

- **GitHub**  
Es una plataforma que permite gestionar versiones del código fuente, facilitar el trabajo colaborativo y mantener control sobre los cambios realizados durante el desarrollo del proyecto.  

---

## 9.5 Ingeniería de software  

La ingeniería de software proporciona principios, métodos y buenas prácticas para el análisis, diseño, desarrollo y mantenimiento de sistemas informáticos. Su aplicación en este proyecto permite seguir una estructura organizada para el desarrollo del sistema, asegurando calidad, escalabilidad y cumplimiento de los requerimientos establecidos.  

Además, involucra procesos como levantamiento de requisitos, diseño del sistema, desarrollo, pruebas e implementación, fundamentales para la construcción de una solución tecnológica funcional.  

---

# 10. Metodología

## 10.1 Tipo de investigación

En este proyecto se presenta bajo una investigación, ya que se busca dar solución ante una problemática real identificada en la gestión operativa de los restaurantes, a través de un desarrollo de sistema que permita optimizar los procesos como el control de inventarios, gestión de pedidos y administración del negocio.  

---

## 10.2 Enfoque de investigación

Este proyecto tiene un enfoque cuantitativo, debido a que busca evaluar las mejoras en los procesos operativos mediante indicaciones como reducción de errores, tiempos de atención, control de recursos y eficiencia en la gestión.  

---

## 10.3 Diseño de investigación

El diseño de investigación es no experimental, ya que este analiza la problemática existente sin manipular variables, proponiendo una solución tecnológica basada en las necesidades vistas.  

---

## 10.4 Metodología de desarrollo

Para este desarrollo el sistema se empleará la metodología Scrum, esto se debe a que permitirá organizar el trabajo de manera iterativa, facilitando el proceso por etapas, la adaptación a cambios y el seguimiento del proyecto.  

Las etapas consideradas son:  

- Levantamiento de requerimientos  
- Diseño del sistema y base de datos  
- Desarrollo e implementación  
- Pruebas del sistema  
- Implementación y evaluación  

---

## 10.5 Herramientas tecnológicas  

Las herramientas que se utilizaran son las siguientes:  

- Java  
- Spring Boot  
- MySQL  
- GitHub  
- Postman para pruebas de APIs  

---

# 11. Bibliografias:

Cruz Ulloa, M. (2024). Gestión de inventarios y su impacto en la rentabilidad de restaurantes. Revista de Investigación en Ciencias Sociales. Recuperado de: https://revistas-facet-unc.edu.py/index.php/RICS/article/view/49  

Restrepo, J., et al. (2020). Diseño de un sistema de gestión de inventario para un restaurante. ResearchGate. Recuperado de: https://www.researchgate.net/publication/382719545_Diseno_de_un_sistema_de_gestion_de_inventario_para_un_restaurante_manabita  

Álvarez Soto, F., & Cisternas Aranda, P. (2020). Propuesta de mejora de procesos en restaurantes mediante sistemas tecnológicos. Universidad Técnica Federico Santa María. Recuperado de: https://repositorio.usm.cl/entities/tesis/e3a94266-0113-4287-acc9-79f4bca05270  

Pinos Robles, L. (2021). Implementación de sistemas informáticos en la gestión de restaurantes. Pontificia Universidad Católica del Ecuador. Recuperado de: https://repositorio.puce.edu.ec/handle/123456789/27376  

Oracle Hospitality. (s.f.). Restaurant technology solutions. Oracle.  
https://www.oracle.com/food-beverage/  

Cárdenas, J., & colaboradores. (2023). Sistema de información para dinamizar la gestión comercial de un restaurante con metodología Scrum. Revista Científica INGENIAR. Recuperado de https://journalingeniar.org/index.php/ingeniar/article/view/167  

Universidad Nacional de San Martín. (2023). Sistema web para la dinamización de la gestión de inventarios y estrategias de comercialización en supermercados peruanos. Revista Científica de Sistemas e Informática. Recuperado de https://revistas.unsm.edu.pe/index.php/rcsi/article/view/673  

Cornide Reyes, H. et al. (2025). Mejora de procesos de software en equipos Scrum: Una revisión de la literatura. Recuperado de https://www.scielo.cl/scielo.php?pid=S0718-33052025000100210&script=sci_arttext  

Pardo-Calvache, C. et al. (2019). Scrum+: Un Scrum escalado para la gestión de proyectos ágiles. Recuperado de https://www.redalyc.org/journal/430/43062836010/html/  

VersionOne / Journal of Systems and Software (2022). Por qué y cómo se está adaptando Scrum en la práctica: una revisión sistemática. Recuperado de https://www.sciencedirect.com/science/article/abs/pii/S0164121221002077  