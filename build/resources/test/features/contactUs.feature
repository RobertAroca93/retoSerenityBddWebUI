# new feature
# Tags: optional

Feature: Contactar servicio al cliente
  yo como usuario de la plataforma
  deseo hacer contacto con servicio al cliente
  para asi obtener soporte e informacion


  Scenario: Enviar solicitud exitosa
    Given dado que me encuentro en el modulo de contacto
    When ingreso los datos correctos en los campos obligatorios
    Then se debe mostrar mensaje de envio exitoso

  Scenario: Enviar solicitud fallida
    Given dado deseo contactarme con servicio al cliente
    When no ingreso el campo obligatorio de email
    Then el sisteme debera solicitar que se diligencie ese campo