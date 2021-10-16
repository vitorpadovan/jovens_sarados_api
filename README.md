# jovens_sarados_api
## V. 0.2.2
[CHANGELOG](CHANGELOG.md)

# Sobre este projeto
O Projeto Jovens Sarados Api que consta neste [Github](https://github.com/vitorpadovan) não representa a intenção da missão Jovens Sarados.
Este projeto representa inicialmente a intenção de estudo de um servo do Jovens Sarados com a possível intenção futura de publicar, caso seja aprovado e autorizado por superiores da missão. A intenção de publicar esta aplicação não é a principal finalidade, e sim a intenção de estudar usando caso real que pode ser utilizado.
O Projeto em questão está com configurações expostas. Estas configurações por sua vez é referente a um servidor que pode ser mudado a qualquer momento, e os dados contidos neles não são dados senssíveis e são dados públicos e dados para testes também. Estas configurações estão propositalmente assim pois ainda não foi possível configurar o Docker corretamente no servidor de destino para usar variáveis de ambiente, e o mesmo está rodando em docker no servidor, por ser uma versão mais leve para publicação.
Este projeto por sua vez possui um App que está em desenvolvimento também, e que se encontra neste mesmo github. [Github](https://github.com/vitorpadovan/jovens_sarados_app)


## Login
http://<ip_destino>/login
Enviar os sequintes parametros no corpo
{"login":"<login>","password","<senha>"}

## Direitos de acesso aos endpoints
A responsabilidade de direitos de acesso aos Endpoints está atribuida ao banco de dados.
Nele encontra-se uma tabela DireitoPagina onde é possível por hora apenas atribuir os direitos de acesso público para os metodos GETs e POSTs
Por hora nenhum outro direito é atribuido.
O arquivo [Direitos.sql](src/main/resources/Direitos.sql) está os direitos atuais.
Alterar estes direitos por sua vez obriga reiniciar a aplicação por hora para funcionar.

## Variáveis de Ambiente
- **API_DB_SERVER** - Servidor de banco de dados
- **API_DB_PORT** - Porta para o servidor de banco de dados
- **API_DB_NAME** - Nome do banco que será usado
- **API_DB_USER** - Usuário do banco
- **API_DB_PASSWD** - Senha para o banco de dados

## Referências
- [Upload File](https://www.bezkoder.com/spring-boot-file-upload/)

### Cursos

#### Alura
- [Injeção de dependências: O que é?](https://cursos.alura.com.br/injecao-de-dependencias-o-que-e--c224)
- [Spring Data JPA: Repositórios, Consultas, Projeções e Specifications](https://cursos.alura.com.br/course/spring-data-jpa)
- [Spring Boot API REST: Construa uma API](https://cursos.alura.com.br/course/spring-boot-api-rest)
- [Spring Boot API Rest: Segurança da API, Cache e Monitoramento](https://cursos.alura.com.br/course/spring-boot-seguranca-cache-monitoramento)
- [Spring Boot e Teste: Profiles, Testes e Deploy](https://cursos.alura.com.br/course/spring-boot-profiles-testes-deploy)
- [Maven: Gerenciamento de dependências e build de aplicações Java](https://cursos.alura.com.br/course/maven-gerenciamento-dependencias-build-aplicacoes-java)

#### Udemy
- [Spring Boot, Hibernate, REST, Ionic, JWT, S3, MySQL, MongoDB](https://www.udemy.com/course/spring-boot-ionic/)
- [Spring Boot Ionic Backend - Nelio Alves](https://github.com/acenelio/spring-boot-ionic-backend)
- [Spring Boot 2 Ionic Backend - Nelio Alves](https://github.com/acenelio/springboot2-ionic-backend)