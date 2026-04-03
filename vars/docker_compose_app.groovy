def call() {
    sh '''
    echo "Deploying application..."
    docker compose -f docker-compose.app.yaml up -d
    '''
}
