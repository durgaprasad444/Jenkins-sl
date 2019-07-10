def call() {
  node {
    stage('Checkout') {
      checkout scm
    }
    def p = pipelineCfg()

    if (p.runTests == true) {
      
        stage('Test') {
          sh 'ls'
          
          //sh p.testCommand
        }
      
    }
    else {
      sh 'echo "durga"'
    }
  
  }
}
