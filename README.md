# 🛠️ Sistema de Oficina Mecânica - Modelagem ORM

Este repositório contém a implementação da camada de persistência de um sistema para gestão de uma Oficina Mecânica, desenvolvido como atividade prática de modelagem Objeto-Relacional (ORM) utilizando Java, JPA e Hibernate.

O projeto demonstra o mapeamento de entidades complexas e relacionamentos em um banco de dados relacional, incluindo associações 1:1, 1:N e N:M.

## 📋 Funcionalidades Modeladas

O domínio do sistema contempla o fluxo completo de atendimento de uma oficina, incluindo:
- **Gestão de Clientes e Veículos** (1:N)
- **Ordens de Serviço** (OS) vinculadas a Veículos
- **Alocação de Mecânicos** em Ordens de Serviço (N:M)
- **Catálogo de Peças e Serviços**, com itens vinculados à OS via classes de associação (1:N)
- **Faturamento**, com a geração de Nota Fiscal vinculada à OS finalizada (1:1)

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **JPA (Jakarta Persistence API) 3.1.0**
- **Hibernate Core 6.4.1.Final**: Framework responsável pelo mapeamento ORM.
- **H2 Database**: Banco de dados relacional em memória, ideal para testes ágeis e validação do mapeamento.
- **Maven**: Gerenciamento de dependências e build do projeto.
- **Jupyter Notebook (IJava Kernel)**: Utilizado para testes interativos e execução isolada da camada de persistência.
- **PlantUML**: Para modelagem dos diagramas de Classes e Entidade-Relacionamento (E-R).