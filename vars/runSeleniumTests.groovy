def call() {
    dir('selenium-tests') {
        sh 'mvn clean test'
    }
}
