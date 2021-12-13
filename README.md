
### This projects Purpose: It is for you to learn Hexagonal Architecture with me.


## What is the Hexagonal Architecture?

Hexagonal architecture is an architecture that helps us separate business logic from external components.



![0_kS_Y9t9gpdjYssd1](https://user-images.githubusercontent.com/80245013/145805848-5674280d-9e51-4ec6-998c-14b3068830f9.png)



- ### Domain
Domain is the model that we will focus on to design Hexagonal Architecture.

- ### Ports
Ports is the bridge between business logic and external components

        -   Input:Input ports are used by external components
        -  Output: Output ports are used by databases, or  other output components
 
- ### Service
Service is the  bridge between Input and Output Ports

- ### Adapters
       - Input Adapters:These are the changes that occur on the application with the requests coming to the application.

       - Output Adapters:These are adapters that enable changes created on the database or other output components.
---
## Owner
[Muharrem KOÇ](https://github.com/muharremkoc)
