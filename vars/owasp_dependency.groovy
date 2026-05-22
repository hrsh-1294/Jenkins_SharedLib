def call() {

    dependencyCheck(
        odcInstallation: 'OWASP-Dependency-Check',
        additionalArguments: '--disableYarnAudit'
    )

    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
