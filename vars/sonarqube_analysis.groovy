def call(String SonarQubeAPI, String Projectname, String ProjectKey) {

    nodejs('NodeJS') {  

        withSonarQubeEnv("${SonarQubeAPI}") {

            sh """
            ${SONAR_HOME}/bin/sonar-scanner \
            -Dsonar.projectName=${Projectname} \
            -Dsonar.projectKey=${ProjectKey} \
            -Dsonar.sources=. \
            -Dsonar.java.binaries=selenium-tests/target/test-classes
            -Dsonar.java.libraries=target/*.jar
            """
        }
    }
}
