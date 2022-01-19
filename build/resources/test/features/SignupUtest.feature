#language:es
#Autor: Daniel Galeano

@Historias
Característica: :Registro en sitio web Utest
        Como usuario quiero registrarme en el sitio web Utest

  @RegistroExitoso
  Esquema del escenario: Registro de un usuario exitosamente
    Dado Que Daniel se encuentra posicionado en el sitio web Utest
    Cuando Daniel se registra con sus datos
      | strName | strLastName | strEmail  | strMont | strDay | strYear | strCity | strCodePostal | strSystemOperativeCom | strVersion | strLanguage | strMobileDevice | strModelCel | strPassword | strPasswordConfirm |
      |<strName>|<strLastName>| <strEmail>|<strMont>|<strDay>|<strYear>|<strCity>|<strCodePostal>|<strSystemOperativeCom>|<strVersion>|<strLanguage>|<strMobileDevice>|<strModelCel>|<strPassword>|<strPasswordConfirm>|
    Entonces El sistema lo posiciona en la pagina Welcome y valida el mensaje
      | strMessageConfirm                                                       |
      | Welcome to the world's largest community of freelance software testers! |

    Ejemplos:
      | strName | strLastName |       strEmail           |strMont| strDay |strYear|strCity | strCodePostal |strSystemOperativeCom| strVersion  | strLanguage | strMobileDevice |   strModelCel     | strPassword           | strPasswordConfirm    |
      | Daniel  | Galeano     | camilabcd12345@gmail.com | July  |   30   |  1994 | Bello  | 021xx         | Linux               |Linux Endless| English     | Apple           | iPhone 13 Pro Max | Daniel123456789Daniel | Daniel123456789Daniel |