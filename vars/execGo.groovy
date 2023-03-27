def call (String options = 'version') {
    sh "go ${options}"
}