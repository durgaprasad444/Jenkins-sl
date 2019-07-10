def call() {
  node {
    stage('Checkout') {
      checkout scm
    }
    def p = pipelineCfg()

    if (p.python == true) {
      
        stage('Test') {
          pipeline.groovy()
          sh 'ls'
          
          //sh p.testCommand
        }
      
    }
    else {
      sh 'echo "durga"'
    }
  
  }
}
