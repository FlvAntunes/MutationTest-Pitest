<p align="center">
  <img src="img/pit-black-150x152.png" alt="Pitest-Logo">
</p>




# Teste de mutação com Pitest

Neste repositório contem modelo criado como exemplo para realizar a automação de testes de Mutação utilizando o framework Pitest.

___

**Pitest** é uma ferramenta de teste de mutação para Java. Ele permite verificar a qualidade dos testes unitários, gerando mutantes do código-fonte e executando os testes para ver se eles detectam as alterações. O Pitest fornece um relatório detalhado dos mutantes gerados, dos testes executados e da cobertura de mutação alcançada.

#
## Como executar

- Na raiz do projeto, execute o comando "mvn clean install  org.pitest:pitest-maven:mutationCoverage"
- Após a execução, abra o relatorio do Pitest "target\pit-reports\index.html"
- Voce pode alterar os testes que estão na pasta "src/test/java/org/example/MessageTest.java" para verificar o comportamento do Pitest







# Referências
- https://pitest.org/