# Projeto Geometria

Este projeto foi desenvolvido em **Java** e tem como objetivo praticar conceitos de **POO (Programação Orientada a Objetos)** aplicados ao cálculo de figuras geométricas. A aplicação permite que o usuário escolha uma forma geométrica e obtenha informações como **área** e **perímetro**.

---

## 📂 Estrutura do Projeto

```
Project-Geometria-main/
 ├── src/br/com/fecaf/
 │    ├── Geometria.java        # Classe principal (main)
 │    ├── controller/Menu.java  # Classe responsável pelo menu de interação
 │    └── model/
 │         ├── Circulo.java     # Representa um círculo
 │         ├── Retangulo.java   # Representa um retângulo
 │         └── Triangulo.java   # Representa um triângulo
   ```

---

## 📖 Funcionalidades

* Menu interativo para escolher a figura geométrica.
* Cálculo de **área** e **perímetro** de:

  * 🔵 **Círculo**
  * ⬛ **Retângulo**
  * 🔺 **Triângulo**
* Estrutura organizada em **pacotes** para separar regras de negócio (`model`) e controle de fluxo (`controller`).

---

## 🛠️ Tecnologias Utilizadas

* **Java 8+**
* Paradigma de **Programação Orientada a Objetos (POO)**
* Estrutura de pacotes (`model` e `controller`)

---

## 🖥️ Exemplo de uso

Ao executar o programa, o usuário verá um menu parecido com este:

```
=== Menu Geometria ===
1 - Calcular Círculo
2 - Calcular Retângulo
3 - Calcular Triângulo
0 - Sair
Escolha uma opção: 1

Informe o raio do círculo: 5
Área: 78.5
Perímetro: 31.4
```

Outro exemplo:

```
=== Menu Geometria ===
1 - Calcular Círculo
2 - Calcular Retângulo
3 - Calcular Triângulo
0 - Sair
Escolha uma opção: 2

Informe a base do retângulo: 10
Informe a altura do retângulo: 4
Área: 40
Perímetro: 28
```
---

## 👨‍💻 Autor

Projeto desenvolvido como prática acadêmica para reforçar conceitos de **geometria** e **POO** em Java.
