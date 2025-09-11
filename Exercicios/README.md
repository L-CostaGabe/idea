# 📚 Exercícios de Java

Este repositório contém exercícios de Java organizados por pasta, abordando conceitos como programação básica, cálculo, POO, herança e interação entre objetos.

---

## 📁 calculos
Pequenos programas para cálculos matemáticos básicos e operações com datas.

### 1. Age.java
- Calcula a idade do usuário a partir do ano de nascimento.
- **Conceitos usados:** `Scanner`, `OffsetDateTime`, operações aritméticas, saída formatada.

### 2. AgeDifference.java
- Calcula a diferença de idade entre duas pessoas.
- **Conceitos usados:** `Scanner`, `Math.abs()`, operações aritméticas, saída formatada.

### 3. AreaQuadrado.java
- Calcula a área de um quadrado.
- **Conceitos usados:** `Scanner`, variáveis `double`, multiplicação, saída formatada.

### 4. AreaRetangulo.java
- Calcula a área de um retângulo.
- **Conceitos usados:** `Scanner`, variáveis `double`, multiplicação, saída formatada.

---

## 📁 cinema
Exercícios de Programação Orientada a Objetos (POO), envolvendo herança, encapsulamento e polimorfismo.

### 1. Ingresso.java
- Classe base para representar ingressos de cinema.
- **Conceitos usados:** atributos `protected`, construtor, getter, `toString()`.

### 2. IngressoFamilia.java
- Herda de `Ingresso` e calcula valor total para grupos, aplicando desconto.
- **Conceitos usados:** herança, sobrescrita de métodos, uso de `super`, operações matemáticas.

### 3. MeiaEntrada.java
- Herda de `Ingresso` e aplica desconto de 50% automaticamente.
- **Conceitos usados:** herança, uso do `super` para modificar valor.

### 4. MainCinema.java
- Classe principal que instancia os objetos e demonstra funcionamento.
- **Conceitos usados:** criação de objetos, polimorfismo, `toString()`.

---

## 📁 conta_bank
Exercícios sobre contas bancárias e operações financeiras simuladas em console.

### 1. ContaBancaria.java
- Representa uma conta bancária com saldo, cheque especial e métodos para sacar, depositar, pagar boletos e consultar saldo.
- **Conceitos usados:** POO, encapsulamento, métodos de operação financeira, controle de dívida e juros simples.

### 2. MainBank.java
- Classe principal que permite interação com a conta via menu de console.
- **Conceitos usados:** entrada de dados (`Scanner`), loops (`do-while`), estruturas de decisão (`switch-case`), chamadas de métodos da classe `ContaBancaria`.

---

## 📁 user
Sistema de usuários com herança, polimorfismo e funcionalidades administrativas.

### 1. Usuario.java
- Classe base de usuário com atributos de nome, email, senha e flag de administrador.
- **Conceitos usados:** POO, encapsulamento, getters e setters, métodos de comportamento (login, logout, alteração de dados), base para herança.

### 2. Atendente.java
- Herda de `Usuario`, gerencia recebimento de pagamentos e fechamento de caixa.
- **Conceitos usados:** herança, encapsulamento, métodos específicos (`receberPagamento`, `fecharCaixa`), entrada de dados (`Scanner`).

### 3. Gerente.java
- Herda de `Usuario`, gera relatórios e consulta vendas de atendentes.
- **Conceitos usados:** herança, métodos administrativos, interação com outros objetos (`Atendente`).

### 4. Vendedor.java
- Herda de `Usuario`, registra vendas e consulta quantidade de vendas realizadas.
- **Conceitos usados:** herança, métodos de registro e consulta de vendas, uso de atributos privados.

### 5. Sistem.java
- Classe principal que demonstra o fluxo completo do sistema, interagindo com `Gerente`, `Atendente` e `Vendedor`.
- **Conceitos usados:** instanciação de objetos, polimorfismo, chamadas de métodos de diferentes classes, simulação de fluxo de sistema (login, vendas, caixa, relatórios).

---

