# one-microservicio

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: <https://quarkus.io/>.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./gradlew quarkusDev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.

## Packaging and running the application

The application can be packaged using:

```shell script
./gradlew build
```

It produces the `quarkus-run.jar` file in the `build/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `build/quarkus-app/lib/` directory.

The application is now runnable using `java -jar build/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./gradlew build -Dquarkus.package.jar.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar build/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./gradlew build -Dquarkus.native.enabled=true
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./gradlew build -Dquarkus.native.enabled=true -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./build/one-microservicio-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult <https://quarkus.io/guides/gradle-tooling>.

## Related Guides

- REST ([guide](https://quarkus.io/guides/rest)): A Jakarta REST implementation utilizing build time processing and Vert.x. This extension is not compatible with the quarkus-resteasy extension, or any of the extensions that depend on it.
- REST Jackson ([guide](https://quarkus.io/guides/rest#json-serialisation)): Jackson serialization support for Quarkus REST. This extension is not compatible with the quarkus-resteasy extension, or any of the extensions that depend on it
- JDBC Driver - PostgreSQL ([guide](https://quarkus.io/guides/datasource)): Connect to the PostgreSQL database via JDBC

## Docker Commands

### Build Docker Image

To build the Docker image without running tests, use the following commands:

```shell
./gradlew build -x test
./gradlew clean build -x test
```

### Start and Stop Docker Containers

To stop and start Docker containers using Docker Compose, use the following commands:

```shell
docker-compose down
docker-compose up -d
```

### Docker Cleanup

#### Stop and Remove Containers

To stop and remove containers, use:

```shell
docker-compose down
```

#### Remove Images

To remove Docker images, use:

```shell
docker rmi $(docker images -q)
```

#### Remove Volumes

To remove specific Docker volumes, use:

```shell
docker volume rm <nombre_volumen>
```

To remove all unused volumes, use:

```shell
docker volume prune
docker system prune -a

```

#### Remove Unused Networks

To remove all unused networks, use:

```shell
docker network prune
```

This will clean your Docker environment of containers, images, volumes, and networks.

### Additional Commands

#### Clean Java Language Server Workspace

To clean and reload the workspace, execute the command:

```shell
Java: Clean Java Language Server Workspace
```

This command can be found in the command palette.

#### Refresh Gradle Dependencies

To refresh Gradle dependencies, execute the command:

```shell
Gradle: Refresh
```

This command can be found in the command palette.





