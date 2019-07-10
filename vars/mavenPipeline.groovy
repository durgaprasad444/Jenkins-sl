def call() {
  node {
    stage('Checkout') {
      checkout scm
    }
    def p = pipelineCfg()

    if (p.type == maven) {
      
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
