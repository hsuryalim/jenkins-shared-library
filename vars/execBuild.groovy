def call(String env) {
    if (env == 'Build') {
        pipeline {
            agent {
                docker {
                    image 'golang:alpine'
                }
            }

            stages {
                stage('Build') {
                    steps {
                        sh "echo Build"
                    }
                }
            }
        }
    }

    else if (env == 'Deploy') {
        pipeline {
            agent {
                docker {
                    image 'alpine'
                }
            }

            stages{
                stage('Deploy') {
                    steps {
                        sh "echo Deploy"
                    }
                }
            }
        }
    }

    else {
        pipeline {
            agent any
            stages {
                stage('Else') {
                    steps {
                         sh "echo Else..."
                    }
                }
            }
        }
    }
}