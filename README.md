# 📥 Scanner no Java — Guia Básico

Este guia explica de forma **simples e objetiva** como funciona a classe **`Scanner`** no Java, usada para **ler dados digitados pelo usuário** no terminal.

---

## 🔹 O que é o Scanner?

O **`Scanner`** é uma classe da biblioteca padrão do Java que permite capturar entradas do usuário, como:

* Texto (`String`)
* Números inteiros (`int`)
* Números decimais (`double`, `float`)
* Valores lógicos (`boolean`)

Ela pertence ao pacote:

```java
java.util
```

---

## 🔹 Para que serve?

O `Scanner` é muito usado em programas que precisam interagir com o usuário via **console**, permitindo que o programa leia dados enquanto está sendo executado.

---

## 🔹 Como usar o Scanner (passo a passo)

### 1️⃣ Importar a classe

```java
import java.util.Scanner;
```

---

### 2️⃣ Criar o objeto Scanner

```java
Scanner scanner = new Scanner(System.in);
```

📌 `System.in` representa a entrada padrão (teclado).

---

### 3️⃣ Pedir o dado ao usuário

```java
System.out.print("Digite seu nome: ");
```

---

### 4️⃣ Ler o valor digitado

Cada tipo de dado possui um método específico:

```java
String nome = scanner.nextLine();
int idade = scanner.nextInt();
double nota = scanner.nextDouble();
```

---

### 5️⃣ Utilizar o valor no programa

```java
System.out.println("Nome: " + nome);
System.out.println("Idade: " + idade);
```

---

### 6️⃣ Fechar o Scanner (boa prática)

```java
scanner.close();
```

---

## 🔹 Métodos mais utilizados

| Método          | Função                        |
| --------------- | ----------------------------- |
| `nextLine()`    | Lê uma linha inteira (String) |
| `next()`        | Lê apenas uma palavra         |
| `nextInt()`     | Lê um número inteiro          |
| `nextDouble()`  | Lê um número decimal          |
| `nextBoolean()` | Lê `true` ou `false`          |

---

## 🔹 Exemplo completo

```java
import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Olá, " + nome + "!");
        System.out.println("Você tem " + idade + " anos.");

        scanner.close();
    }
}
```

---

## ⚠️ Atenção: erro comum com Scanner

Misturar `nextInt()` com `nextLine()` pode causar problemas, pois o `nextInt()` **não consome o ENTER** do teclado.

### ✅ Solução

Após usar `nextInt()`, adicione um `nextLine()` para limpar o buffer:

```java
int idade = scanner.nextInt();
scanner.nextLine();
```

---

## 🧠 Resumo

* O `Scanner` permite ler dados do teclado
* Funciona com `System.in`
* Cada tipo de dado tem seu método específico
* Sempre feche o Scanner ao final do programa

---

📌 Conteúdo ideal para quem está iniciando em **Java** e **programação**.

## 📝 Exercício para praticar

Menu simples

Crie um menu:

1 - Somar
2 - Subtrair
3 - Multiplicar
4 - Dividir


O usuário escolhe uma opção e digita dois números.

A resposta está no conteúdo localizado no arquivo src -> Ex01.java.


