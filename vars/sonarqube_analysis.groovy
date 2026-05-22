def call(String SonarQubeAPI, String Projectname, String ProjectKey) {

    def scannerHome = tool 'Sonar'

    echo "Starting SonarQube analysis..."
    echo "Scanner Home: ${scannerHome}"

    nodejs('NodeJS') {

        withSonarQubeEnv("${SonarQubeAPI}") {

            sh """
            ${scannerHome}/bin/sonar-scanner \
            -Dsonar.projectName=${Projectname} \
            -Dsonar.projectKey=${ProjectKey} \
            -Dsonar.sources=. \
            -Dsonar.java.binaries=selenium-tests/target/test-classes
            """
        }
    }
}
