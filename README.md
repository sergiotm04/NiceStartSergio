# NiceStart Proyecto Final

Este proyecto desarrollado en **Android Studio** con **Java** tiene como objetivo proporcionar una experiencia interactiva y moderna a los usuarios. A continuación se describen las características y pantallas principales de la aplicación:

### **Funcionalidades Implementadas**

- **SplashActivity**: Descripción de la pantalla de inicio con animación.
- **LoginActivity y SignupActivity**: Explicación de los formularios de inicio de sesión y registro.
- **MainActivity**: Descripción de la pantalla principal con características de swipe refresh, menú desplegable y Snackbar.
- **Fragments**: Explicación de los fragmentos de la aplicación como FragmentInicio, FragmentSettings, FragmentFavoritos, etc.
- **Menus**: Menús desplegables, contexto, y botones de navegación inferior.
- **Toolbars**: Descripción de MainToolBar, MainBar, MainButtonBar, con sus funcionalidades y un ejemplo de uso del ButtonSheet.
- **AlertDialog**: Explicación de cómo usar un diálogo emergente para confirmación de acciones (como el Logout).
# **SplashActivity**

**SplashActivity** es la pantalla de bienvenida de la aplicación. Su función es mostrar una animación breve antes de redirigir al usuario a la pantalla principal.

## **Descripción**  
Al iniciar la aplicación, se muestra una **imagen de fondo dinámica** obtenida de Unsplash y una **animación Lottie** en el centro de la pantalla. Después de unos segundos, se realiza una **transición automática** a `MainActivity`.

## **Características**  
- **Imagen de fondo dinámica** cargada con `Glide`.  
- **Animación Lottie**, que se reproduce automáticamente.  
- **Tiempo de espera:** 4 segundos antes de redirigir a `MainActivity`.  

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

## Ajustes de Diseño en las Actividades

### **LoginActivity y SignupActivity**

En ambas actividades, se ha realizado un ajuste en el diseño para mejorar la disposición de los elementos en la interfaz de usuario. Se ha añadido un **`marginTop`** en los campos de entrada (usuario y contraseña) para proporcionar un mejor espaciado y alineación en la pantalla, tanto en las vistas normales como en las de orientación horizontal (landscape).

- **LoginActivity:**
  - Se ha añadido un `marginTop="30dp"` en el campo de usuario y en el campo de contraseña para mejorar el espaciado y asegurar que los elementos estén bien alineados en la pantalla.

    <img width="175" alt="image" src="https://github.com/user-attachments/assets/9103370b-2b49-4961-8f13-f2af0b3e92e9" />

  
- **SignupActivity:**
  - Similar a **LoginActivity**, también se ha aplicado un `marginTop` en los campos de usuario, contraseña y correo electrónico, lo que mejora la estética del formulario y su accesibilidad en la pantalla.

    <img width="177" alt="image" src="https://github.com/user-attachments/assets/ed0beff8-2183-42f6-8f4e-43a2efb17de6" />

Esto asegura que las vistas se vean de manera óptima en diferentes tamaños de pantalla y orientaciones.

## Soporte para Localización

La aplicación **NiceStart** soporta el idioma de inglés, lo que permite a los usuarios disfrutar de la aplicación en su idioma preferido.

## Internacionalización y soporte de idiomas

Esta aplicación soporta el idioma de inglés, con un sistema de recursos localizado que permite adaptar la interfaz a diferentes lenguajes. Actualmente, la aplicación soporta:

- **Inglés** (predeterminado).
- **Español** (español).

### Pasos realizados:
1. Creación de carpetas `values` y `values-es` para almacenar los recursos de texto en inglés y español.
2. Traducción de cadenas de texto en `strings.xml`.
3. Configuración automática del idioma según la configuración del dispositivo.





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

  ## Fragmentos Implementados
### 1. **FragmentInicio**
El **FragmentInicio** es el fragmento principal de la aplicación, diseñado para mostrar contenido dinámico.

#### **Características:**
- **WebView**: Carga una URL (en este caso, `https://thispersondoesnotexist.com`) que se visualiza dentro del fragmento.
- **SwipeRefreshLayout**: Permite realizar un gesto de "deslizar para actualizar" en el contenido.

#### **Diseño:**
Este fragmento tiene un diseño minimalista con un WebView que se actualiza cada vez que el usuario hace un gesto de deslizamiento.

### 2. **FragmentSettings**
El **FragmentSettings** proporciona una vista para que el usuario pueda cambiar las configuraciones de la aplicación.

#### **Características:**
- Este fragmento incluye elementos configurables y es una forma ideal de mostrar opciones de personalización al usuario.
  
#### **Diseño:**
El diseño sigue la misma línea estética de los otros fragmentos con un fondo dinámico y funcionalidad para interactuar con las configuraciones.

### 3. **FragmentFavoritos**
El **FragmentFavoritos** permite mostrar los elementos marcados como favoritos por el usuario.

#### **Características:**
- Este fragmento muestra una lista de los elementos favoritos, como artículos o productos, y permite a los usuarios interactuar con ellos.

#### **Diseño:**
El fragmento presenta una lista de elementos y tiene un diseño centrado en la visualización de los favoritos.

## ProfileActivity

**ProfileActivity** muestra el perfil de usuario con su foto y datos básicos. 

### **Características**
- **Imagen de perfil**: Cargada con Glide y recortada de forma circular.
- **Datos personales**: Nombre, ubicación y una pequeña descripción.
- **Diseño**: Utiliza **ConstraintLayout** para organizar los elementos, con un fondo degradado y los datos centrados.

![profile](https://github.com/user-attachments/assets/4e986205-36c6-4344-8ca8-fbc639c48f9d)

# **MainBar**
MainBar gestiona el BottomAppBar y la FloatingActionButton (FAB). Esta barra se posiciona en la parte inferior de la pantalla para facilitar el acceso a acciones rápidas.

### Características:
- **BottomAppBar:** Permite navegar entre diferentes fragmentos de la aplicación con un icono de navegación.
- **FAB:** Se utiliza para una acción rápida, como la adición de elementos.

<img width="131" alt="image" src="https://github.com/user-attachments/assets/5b576315-cb44-46cf-89c7-78ea069de383" />


# **MainButtonBar**
MainButtonBar es una pantalla que contiene botones de acción con funcionalidades asociadas como el inicio de sesión, visualización de perfil y otras opciones.

### Características:
- **Botones personalizados:** Se utiliza un FloatingActionButton (FAB) para acceder rápidamente a las acciones importantes.
- **Menú contextual:** Proporciona un acceso rápido a acciones adicionales, como el "Logout" o "Profile".

<img width="103" alt="image" src="https://github.com/user-attachments/assets/f57673c8-a234-46a7-b102-6044f0da6016" />


# **MainToolBar**
MainToolBar es la barra superior que contiene el nombre de la aplicación y un conjunto de iconos para las funcionalidades principales. Asegura que el usuario siempre tenga acceso a acciones clave desde cualquier pantalla.

### Características:
- **Iconos en el Toolbar:** El icono de retroceso permite volver a la pantalla anterior, y la animación en el lado derecho proporciona una experiencia interactiva.
- **Menú desplegable:** Accede a las funcionalidades principales como Login, Signup, Profile, y Logout.
- **BottomSheet:** Al pulsar el icono de mensaje, aparece un BottomSheet con opciones adicionales, como "Undo", permitiendo que el usuario interactúe de manera rápida y sencilla.

<img width="137" alt="image" src="https://github.com/user-attachments/assets/4b2078aa-f69e-468b-8f6f-5e13474b4bba" />

# **AlertDialog**
El **AlertDialog** se utiliza para mostrar mensajes emergentes y obtener confirmación del usuario sobre alguna acción. En este caso, el **AlertDialog** se emplea para confirmar la acción de **Logout** y otras interacciones.

### Características:
- **Título y Mensaje Personalizados:** El título y el mensaje pueden ser configurados dinámicamente según la acción que se desea confirmar.
- **Botones:** El AlertDialog incluye botones como **"Confirmar"** y **"Cancelar"** para permitir al usuario tomar decisiones rápidas.
- **Diseño Personalizado:** El diálogo puede incluir vistas personalizadas, como un diseño XML con otros elementos.
- **Funcionalidad:**
  - Al pulsar "Confirmar," se redirige al usuario a otra actividad o se realiza la acción deseada.
  - Al pulsar "Cancelar," se cierra el diálogo sin realizar cambios.


## **Menú AppBar**

El **Menú AppBar** se encuentra en la barra de herramientas de la aplicación y proporciona opciones adicionales al usuario.

### **Opciones disponibles**:
- **Carta**: Opción para enviar un mensaje a través de un Snackbar.
- **Menú desplegable**:
  - **MainActivityToolBar**: Redirige al usuario a la pantalla de `MainActivityToolBar`.
  - **Profile**: Redirige al usuario a la pantalla de `Profile`.
  - **Sign Up**: Redirige al usuario a la pantalla de `Signup`.
  - **Login**: Redirige al usuario a la pantalla de `Login`.
  - **Logout**: Muestra un cuadro de diálogo para confirmar la salida.

    <img width="145" alt="image" src="https://github.com/user-attachments/assets/0ce6a44f-e194-467f-9e72-43d4fd8cd5a7" />

## **Menú Bottom Navigation**

El **Menú Bottom Navigation** permite al usuario navegar por las diferentes secciones de la aplicación de manera fácil y rápida, con tres opciones disponibles.

### **Opciones disponibles**:
- **Home**: Lleva al usuario a la pantalla principal.
- **Search**: Proporciona la opción para realizar búsquedas en la aplicación.
- **Profile**: Lleva al usuario a su perfil.

<img width="141" alt="image" src="https://github.com/user-attachments/assets/faeac1ea-7c97-4020-a9ab-aa1fc1aad74f" />

## **Menú Bottom App**

El **Menú Bottom App** es un menú adicional que aparece en la parte inferior de la pantalla.

### **Opciones disponibles**:
- **Settings**: Redirige al usuario a la pantalla de configuración.
- **Help**: Muestra una pantalla de ayuda.
- **About**: Muestra información sobre la aplicación.
  
<img width="149" alt="image" src="https://github.com/user-attachments/assets/b8fb036d-3c0c-43de-b603-90f753560522" />

## **Menú Contextual**

El **Menú Contextual** aparece cuando se realiza una pulsación larga sobre un elemento, proporcionando opciones adicionales relacionadas con ese elemento.

### **Opciones disponibles**:
- **Copy**: Copia el texto o el elemento seleccionado.
- **Download**: Descarga el contenido relacionado.
  <img width="146" alt="image" src="https://github.com/user-attachments/assets/bdd532e1-2f68-42cd-b043-84c0d8ce283b" />



















  


  
