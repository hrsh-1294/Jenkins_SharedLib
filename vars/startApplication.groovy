def call() {
    sh '''
    echo "Starting Application..."
    docker compose -f docker-compose.app.yaml up -d

    echo "Waiting for app to be ready..."
    sleep 20
    '''
}
