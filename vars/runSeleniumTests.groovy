def call() {
    try {
        sh 'docker compose -f docker-compose.test.yml up --abort-on-container-exit --exit-code-from tests'
    } finally {
        sh 'docker compose -f docker-compose.test.yml down'
    }
}
