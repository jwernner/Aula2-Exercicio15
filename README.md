# Aula2-Exercicio15
Projeto Java (NetBeans) que lê o **nome** e a **idade** de uma pessoa e informa, com base na idade, se ela é **ACEITA** ou **NÃO ACEITA**, utilizando estrutura condicional `if/else`.
## Objetivo
Praticar:
- leitura de dados com `JOptionPane`;
- conversão de `String` para `int`;
- uso de operadores lógicos (`&&`);
- tomada de decisão com `if/else`.
## Regra do problema
O programa considera a pessoa **ACEITA** se:
- idade **maior que 15** e **menor que 25**.
Caso contrário, a pessoa é considerada **NÃO ACEITA**.
## Funcionamento
1. Lê o **nome** (texto).
2. Lê a **idade** (número inteiro).
3. Verifica a condição:
   - se `idade > 15` **e** `idade < 25` → mostra: `NOME ACEITA!`
   - caso contrário → mostra: `NOME NÃO ACEITA!`
4. A mensagem é exibida em uma janela `JOptionPane.showMessageDialog`.
## Tecnologias
- Java
- `javax.swing.JOptionPane`
## Requisitos
- JDK 8 ou superior (recomendado JDK 17+)
- NetBeans (opcional, para abrir o projeto)
## Como executar no NetBeans
1. Abra o NetBeans.
2. Vá em **File > Open Project**.
3. Selecione a pasta `Aula2-Exercicio15`.
4. Clique em **Run Project** ou pressione `F6`.
## Como compilar e executar no PowerShell
```powershell
cd "C:\Users\jwern\OneDrive\Documentos\NetBeansProjects\Aula2-Exercicio15"
javac -d build src\aula2\exercicio15\Aula2Exercicio15.java
java -cp build aula2.exercicio15.Aula2Exercicio15
```
## Estrutura do projeto
- Arquivo principal: `src/aula2/exercicio15/Aula2Exercicio15.java`
- Fluxo principal:
  - leitura do nome e idade com `JOptionPane.showInputDialog`
  - conversão da idade para `int`
  - verificação da faixa etária com `if ((idade > 15) && (idade < 25))`
  - exibição da mensagem final.
## Exemplo de uso
- Entrada:
  - Nome: `Ana`
  - Idade: `20`
- Saída:
  - `Ana ACEITA!`
