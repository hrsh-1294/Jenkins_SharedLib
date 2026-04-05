def call() {
    sh '''
    echo "Stopping Selenium Grid..."
    docker compose -f docker-compose.test.yaml down
    '''
}
