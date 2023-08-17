1. ComprasCarrito
   Realizar una prueba funcional automatizada (Prueba E2E) de un flujo de compra en la página  https://www.demoblaze.com/ que incluya: • Agregar dos 
   productos al carrito • Visualizar el carrito • Completar el formulario de compra • Finalizar la compra

3. Pre Requisitos: 
	Maquina local con el sistema operativo windows 11
	IntelliJ IDEA 2023.2
	SerenityBDD con ScreenPlay
	Cucumber
	Gradle versión: 7.6.1
	JDK: 17
	Maven versión: 3.9.1

4. Comandos de instalación
Serenity BDD
    testImplementation ("net.serenity:serenity.core:2.3.10")
    testImplementation ("net.serenity:serenity-cucumber4:1.0.4")
    implementation ("net.serenity:serenity.screenplay:2.3.10")
    implementation ("io.cucumber:cucumber-java:6.10.4")
    implementation ("io.cucumber:cucumber-junit:6.10.4")
    implementation ("org.reflect-simple:1.8.20")
    testImplementation ("io.cucumber:cucumber-junit:6.10.4")

4. Instrucciones para ejecutar pruebas
   Al dar clic en RunnersTest, se abrirá una ventana donde indique la URL para verificar la ejecución de la prueba: 
	https://repo.maven.apache.org/maven2/net/serenity/serenity.screenplay/2.3.10/serenity.screenplay-2.3.10.pom
        https://cucumber.io/blog/open-source/announcing-cucumber-jvm-4-2-0/net/serenity/serenity.screenplay/2.3.10/serenity.screenplay-2.3.10.pom
