def call(String path = 'selenium-tests') {
    docker.image('maven:3.9.9-eclipse-temurin-17').inside {
        dir(path) {
            sh 'mvn clean install'
        }
    }
}
