# Paso 1: Pedir una frase al usuario
frase = input("Ingresa una frase: ")

# Paso 2: Usar split para convertir la frase en una lista
lista_palabras = frase.split()
print("\nLista de palabras:", lista_palabras)

# Paso 3: Convertir cada palabra a mayúsculas
print("\nPalabras en mayúsculas:")
for palabra in lista_palabras:
    print(palabra.upper())

# PRACTICA 2

# Paso 4: Contar cuántas veces aparece una palabra
palabra_buscar = input("\n¿Qué palabra quieres contar en la frase?: ")
cantidad = frase.count(palabra_buscar)
print(f"La palabra '{palabra_buscar}' aparece {cantidad} veces.")

# Paso 5: Reemplazar una palabra por otra
palabra_reemplazar = input("\n¿Qué palabra quieres reemplazar?: ")
nueva_palabra = input("¿Por cuál palabra la quieres reemplazar?: ")
frase_modificada = frase.replace(palabra_reemplazar, nueva_palabra)
print("Frase modificada:", frase_modificada)