def call(steps, String path = 'selenium-tests') {
    steps.docker.image('maven:3.9.9-eclipse-temurin-17').inside {
        steps.dir(path) {
            steps.sh 'mvn clean install -DskipTests'
        }
    }
}
