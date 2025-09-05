# Projeto K8s

Este projeto é uma aplicação Java desenvolvida com Spring Boot, com o objetivo de servir como exemplo para deploy em Kubernetes.

## Tecnologias Utilizadas
- Java
- Spring Boot
- Maven
- Kubernetes (para deploy)

## Estrutura de Pastas
```
├── src/
│   ├── main/
│   │   ├── java/br/com/lima/k8s/
│   │   │   ├── K8sApplication.java
│   │   │   ├── SaudacaoControler.java
│   │   │   └── SaudacaoVO.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       └── templates/
│   └── test/
│       └── java/br/com/lima/k8s/K8sApplicationTests.java
```

## Como Executar Localmente

1. Certifique-se de ter o Java 11+ e Maven instalados.
2. Execute o comando abaixo na raiz do projeto:
	```
	./mvnw spring-boot:run
	```
	Ou no Windows:
	```
	mvnw.cmd spring-boot:run
	```
3. A aplicação estará disponível em `http://localhost:8080`.

## Como Rodar os Testes

Execute:
```
./mvnw test
```
Ou no Windows:
```
mvnw.cmd test
```

## Endpoints

- `/saudacao` - Retorna uma saudação (ver SaudacaoControler.java)

## Como Contribuir

1. Fork este repositório
2. Crie uma branch: `git checkout -b minha-feature`
3. Faça suas alterações e commit: `git commit -m 'Minha feature'`
4. Envie para o repositório remoto: `git push origin minha-feature`
5. Abra um Pull Request

## Licença

Este projeto está sob a licença MIT.