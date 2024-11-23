# Simulador Productor-Consumidor

Este proyecto es una simulación de un sistema productor-consumidor desarrollado en Java. La aplicación emula un escenario donde granjeros (productores) cultivan verduras que posteriormente son consumidas por clientes (consumidores). Los productores y consumidores están implementados usando hilos, y comparten un recurso común: un almacén con capacidad limitada.

## 📜 Descripción

Una empresa de alimentación ha solicitado la creación de un simulador para gestionar la producción y consumo de verduras entre granjeros y clientes. En este proyecto, se han desarrollado varios hilos que simulan a los productores y consumidores, que deben coordinarse para manejar la producción y consumo en un almacén común. El programa se encarga de gestionar las operaciones críticas para evitar conflictos de concurrencia.

## 🚀 Funcionalidades Principales

- **Productores**: 
  - Simulan granjeros que cultivan diferentes tipos de verduras (lettuce, cabbage, onion, etc.).
  - Cada verdura tiene un tiempo de crecimiento aleatorio antes de ser enviada al almacén.
  - Si el almacén está lleno, el productor espera hasta que haya espacio disponible.

- **Consumidores**:
  - Simulan clientes que consumen las verduras del almacén.
  - Cada cliente tiene un tiempo de consumo específico para cada verdura.
  - Si no hay suficientes verduras en el almacén, el consumidor espera hasta que haya stock disponible.

- **Almacén**:
  - Recurso compartido con una capacidad limitada configurable.
  - Implementa métodos sincronizados para la producción y el consumo, asegurando que solo un hilo acceda al recurso a la vez.
