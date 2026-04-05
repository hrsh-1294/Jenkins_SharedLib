def call() {
    dir('selenium-tests') {
        sh "${MAVEN_HOME}/bin/mvn clean install"
    }
}
