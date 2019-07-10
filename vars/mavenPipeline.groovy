def call() {
  node {
    stage('Checkout') {
      checkout scm
    }
    def p = pipelineCfg()

    if (p.type == python) {
      
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
