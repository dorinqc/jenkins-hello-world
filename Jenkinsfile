pipeline {
  agent any
  stages {
    stage('Build and run python file') {
      steps {
        bat 'python hello.py'
      }
    }
    stage('Build and run the javafile') {
      steps {
        bat 'javac LuckyNumbers.java && && java LuckyNumbers'
      }
    }
    stage('Test') {
      steps {
        bat 'python test.py'
      }
    }
    stage('Deploy') {
      steps {
        bat 'echo "The deployment in progress ... Do not disturb!"'
      }
    }
  }
}