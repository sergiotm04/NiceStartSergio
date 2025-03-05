# NiceStart Proyecto Final

Este proyecto de Android Studio desarrollado en **Java** incluye una pantalla de **Splash Screen animada** con **Glide** y **Lottie**.

## Funcionalidades Implementadas Hasta Ahora

# **SplashActivity**

**SplashActivity** es la pantalla de bienvenida de la aplicación. Su función es mostrar una animación breve antes de redirigir al usuario a la pantalla principal.

## **Descripción**  
Al iniciar la aplicación, se muestra una **imagen de fondo dinámica** obtenida de Unsplash y una **animación Lottie** en el centro de la pantalla. Después de unos segundos, se realiza una **transición automática** a `MainActivity`.

## **Características**  
- **Imagen de fondo dinámica** cargada con `Glide`.  
- **Animación Lottie**, que se reproduce automáticamente.  
- **Tiempo de espera:** 4 segundos antes de redirigir a `MainActivity`.  
- **Diseño limpio y minimalista** para mejorar la experiencia del usuario. # **SplashActivity**

![image](https://github.com/user-attachments/assets/7936eea4-18bc-4ea0-9c80-2f544e727ca8)

## LoginActivity
El **LoginActivity** permite al usuario iniciar sesión con un diseño moderno y funcional.

### Diseño
- **Fondo:** Gradiente con una imagen superpuesta que mejora la estética de la aplicación.
- **Campos de texto:**
  - Incluyen íconos representativos dentro de cada campo para facilitar la identificación.
  - El campo de contraseña tiene la opción `passwordToggleEnabled`, lo que permite mostrar u ocultar la contraseña con un botón.
- **Botones:**
  - El botón **Login** permite el acceso al **MainActivity** si las credenciales son correctas.
  - El botón **Sign Up** redirige al **SignupActivity** para crear una nueva cuenta.

    <img width="155" alt="image" src="https://github.com/user-attachments/assets/6f9444da-9857-44a0-aec0-17c435bbf7eb" />

## SignupActivity

El **SignupActivity** permite a los usuarios registrarse en la aplicación proporcionando un nombre de usuario, una contraseña y un correo electrónico para acceder a las demás pantallas de la aplicación.

### Descripción
Al acceder a esta pantalla, el usuario puede ingresar sus credenciales en un diseño moderno y atractivo. La interfaz sigue el estilo de **LoginActivity**, con un fondo en degradado y una imagen superpuesta para mejorar la estética.

### Diseño
- **Fondo:** Gradiente con una imagen superpuesta que mejora la apariencia visual.
- **Campos de texto:**
  - Incluyen íconos representativos dentro de cada campo para facilitar la identificación.
  - Se agregan los campos **usuario, contraseña y correo electrónico**.
  - El campo de contraseña tiene la opción `passwordToggleEnabled`, que permite mostrar u ocultar la contraseña con un botón.
- **Botones:**
  - El botón **Register** guarda la información del usuario y lo redirige a **MainActivity**.
  - El botón **Cancel** vuelve a **LoginActivity**.
 
    <img width="458" alt="image" src="https://github.com/user-attachments/assets/6ed2e6fd-78a7-43d2-9a1c-839f7e9b3902" />
    <img width="452" alt="image" src="https://github.com/user-attachments/assets/ea86b0b5-f672-4b09-afa5-e0327ed108d4" />
    <img width="133" alt="image" src="https://github.com/user-attachments/assets/d9582686-289c-4241-8013-f25c92bebb6e" />
  Nota: En el editor de diseño de Android Studio, los íconos pueden aparecer alineados a la izquierda, pero al ejecutar la aplicación se muestran correctamente alineados a la derecha.

# MainActivity

El **MainActivity** es la pantalla principal de la aplicación y está diseñada para ofrecer una experiencia interactiva al usuario, con diversas funcionalidades como la barra de herramientas (Toolbar), un menú desplegable, el **SwipeRefreshLayout** para recargar contenido, y un **Snackbar** para mostrar mensajes.

## Características del Toolbar
- **Nombre de la aplicación**: Se muestra en el lado izquierdo de la barra de herramientas.
- **Íconos de acción**:
  - **Icono de mensaje**: Al hacer clic en el ícono de mensaje, se muestra un **Snackbar** con el texto "Mensaje enviado". Al pulsar el botón **Undo**, la acción se cancela.
  - **Menú desplegable**: Este menú contiene opciones de navegación:
    - **Perfil**: Redirige a la pantalla **ProfileActivity**.
    - **Login**: Redirige a la pantalla **LoginActivity**.
    - **SignUp**: Redirige a la pantalla **SignupActivity**.
    - **Logout**: Muestra un **AlertDialog** para confirmar la acción y realizar el logout.

## Características del SwipeRefreshLayout
- Se utiliza para recargar el contenido de la pantalla. El usuario puede deslizar hacia abajo para actualizar la página.
- Al realizar un gesto de "swipe to refresh", se muestra un **Snackbar** confirmando que la página se ha recargado correctamente.

## Funcionalidad del Menú
- **Menú desplegable**: Ofrece opciones como **Login**, **SignUp**, **Profile**, y **Logout**.
- Al seleccionar **Logout**, se muestra un **AlertDialog** pidiendo confirmación antes

  
  ![ToolbarMensaje](https://github.com/user-attachments/assets/52100e45-1e64-42ec-b867-f3b288802181)

  SwipeRefreshLayout: Permite a los usuarios recargar la página al hacer un "swipe down".
  Snackbar: Se usa para mostrar mensajes temporales en la pantalla, como la confirmación de acciones o errores.










  


  
