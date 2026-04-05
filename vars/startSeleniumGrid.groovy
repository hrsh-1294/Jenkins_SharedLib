def call() {
    sh '''
    echo "Starting Selenium Grid..."
    docker compose -f docker-compose.test.yaml up -d

    echo "Waiting for Selenium Grid to be ready..."
    sleep 20
    '''
}
