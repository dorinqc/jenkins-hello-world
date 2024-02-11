pipeline {
  agent any
  stages {
    stage('Build and run python file') {
	when { expression { branch == 'master' } } // Run only on master branch
      steps {
        bat 'python hello.py'
      }
    }
    stage('Build and run the javafile') {
	when { expression { branch == 'master' } } // Run only on master branch
      steps {
        bat 'javac LuckyNumbers.java && && java LuckyNumbers'
      }
    }	
    stage('Test') {
      when { expression { success } } // Run only if build succeeds
      steps {
        bat 'python test.py'
      }
    }
    stage('Deploy') {
      when { expression { branch == 'master' } } // Run only on master branch
      steps {
       bat 'echo "The deployment in progress ... Do not disturb!"'
      }
    }
  }
}