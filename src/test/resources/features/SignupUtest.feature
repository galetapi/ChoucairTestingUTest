#Language: es
  #Autor: Daniel Galeano

@Historias
Feature:Registro en sitio web Utest
  Como usuario quiero registrarme en el sitio web Utest

  @RegistroExitoso
  Scenario: Registro de un usuario exitosamente
    Given Que Daniel se encuentra posicionado en el sitio web Utest
    When Daniel se registra con sus datos
<<<<<<< HEAD
      | strName | strLastName | strEmail           | strCity | strCodePostal | strSystemOperativeCom | strVersion | strLanguage | strMobileDevice | strModelCel | strSystemOperativeCel | strPassword           | strPasswordConfirm    |
      | Daniel  | Galeano     | camilaaaaaaaaaa1@gmail.com | Bello   | 021xx         | Windows 64            | 10         | Español     | huawei y9       | XXXX        | Android 9             | Daniel123456789Daniel | Daniel123456789Daniel |
=======
      | strName | strLastName | strEmail           | strMont | strDay | strYear |strCity | strCodePostal | strSystemOperativeCom | strVersion | strLanguage | strMobileDevice | strModelCel | strSystemOperativeCel | strPassword           | strPasswordConfirm    |
      | Daniel  | Galeano     | camilaabcd1234@gmail.com | July | 30 | 1994 | Bello   | 021xx         | Windows           | 10         | Spanish     | huawei y9       | XXXX        | Android 9             | Daniel123456789Daniel | Daniel123456789Daniel |
>>>>>>> 3c88124 (segunda version)
    Then El sistema lo posiciona en la pagina Welcome y valida el mensaje
      | strMessageConfirm                                                       |
      | Welcome to the world's largest community of freelance software testers! |