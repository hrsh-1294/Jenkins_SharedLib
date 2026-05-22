def call() {

    dependencyCheck(
        odcInstallation: 'OWASP',
        additionalArguments: '--disableYarnAudit --scan ./'
    )

    dependencyCheckPublisher(
        pattern: '**/dependency-check-report.xml',
        failedTotalHigh: 100000,
        unstableTotalHigh: 100000
    )
}
