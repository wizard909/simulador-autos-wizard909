#  Simulador de Autos

Se solicita modelar los componentes necesarios para desarrollar un software de simulador de autos.
Los autos tiene como atributos cantidad de combustible, kilometraje,  consumo y velocidad máxima y  tipo de conducción.
El tipo de conducción se pueden cambiar de tipo conducción indistintamente todas las veces que se desee.
Los tipos de conducción hacen que varien los atributos de un auto.

Los tipos posibles son:

* Ecológica
En este tipo de conducción el consumo el bajo, 16 km/l y la velocidad máxima es de 120 km/h.

* Deportiva
En este tipo de conducción el consumo el alta, 5 km/l y la velocidad máxima es de 180 km/h.

Los permiten avanzar indicandoles la cantidad de kilometros a recorrer. Al avanzar los autos deben:

- restar al combustible lo consumido para recorrer esos kilometros
- sumar los kilometros recorridos al kilometraje

En el caso de que el combustible no sea el sufuciente para recorrer los kilometros solicitados, el auto avanzare hasta donde le alcance el combustible, actualizara sus atributos según corresponde (combustible y kilometraje) e informara con un error que no pudo completa el recorrido solicitado.

