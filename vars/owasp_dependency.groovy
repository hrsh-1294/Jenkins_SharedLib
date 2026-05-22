def call() {

    dependencyCheck(
        odcInstallation: 'OWASP',
        additionalArguments: '--disableYarnAudit'
    )

    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
