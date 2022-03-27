# new feature
# Tags: optional

Feature: Login de un usuario
  yo como usuario registrado en la plataforma
  deseo autenticarme con mis datos
  para hacer uso de los servicios de la pagina


  Scenario: Login exitoso
    Given dado que estoy registrado en la plataforma
    When ingreso mis datos correctamente
    Then debo ingresar a mi cuenta exitosamente

  Scenario: Login fallido
    Given dado que me encuentr en el apartado de login
    When ingreso mis datos sin registrarme
    Then el sistema debe mostrar el mensaje de error