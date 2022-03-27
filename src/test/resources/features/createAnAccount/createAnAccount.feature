# new feature
# Tags: optional

Feature: registro de usuario
  yo como usuario del sistema
  deseo registrame en la plataforma
  para hacer usos de los servicios que esta ofrece


  Scenario: registro exitoso
    Given dado que me encuentro en el apartado de registro
    When diligencio correctamente los datos
    Then el sistema debera mostrar el mensaje de bienvenida