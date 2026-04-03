def call() {
    sh '''
    echo "Stopping Application..."
    docker compose -f docker-compose.app.yaml down
    '''
}
