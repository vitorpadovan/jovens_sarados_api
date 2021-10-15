# jovens_sarados_api
## V. 0.2.0
[CHANGELOG](CHANGELOG.md)

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


## Referências
- [Upload File](https://www.bezkoder.com/spring-boot-file-upload/)

### Cursos
- [Injeção de dependências: O que é?](https://cursos.alura.com.br/injecao-de-dependencias-o-que-e--c224)
- [Spring Data JPA: Repositórios, Consultas, Projeções e Specifications](https://cursos.alura.com.br/course/spring-data-jpa)
- [Spring Boot API REST: Construa uma API](https://cursos.alura.com.br/course/spring-boot-api-rest)
- [Spring Boot API Rest: Segurança da API, Cache e Monitoramento](https://cursos.alura.com.br/course/spring-boot-seguranca-cache-monitoramento)
- [Spring Boot e Teste: Profiles, Testes e Deploy](https://cursos.alura.com.br/course/spring-boot-profiles-testes-deploy)
- [Maven: Gerenciamento de dependências e build de aplicações Java](https://cursos.alura.com.br/course/maven-gerenciamento-dependencias-build-aplicacoes-java)
- [Spring Boot, Hibernate, REST, Ionic, JWT, S3, MySQL, MongoDB](https://www.udemy.com/course/spring-boot-ionic/)