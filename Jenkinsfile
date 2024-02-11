pipeline {
  agent any
  stages {
    stage('Build and run python file') {
	when { expression { branch == 'master' } } // Run only on master branch
      steps {
<<<<<<< HEAD
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
=======
        script {
          // Choisissez la commande en fonction de votre script
          // sh 'python hello.py' // Pour Python
          // sh 'javac HelloWorld.java && java HelloWorld' // Pour Java
          bat 'javac HelloWorld.java'
        }
>>>>>>> c306dadbbc2d2da458828c5e30776f7ac938b0ad
      }
    }
  }
}
