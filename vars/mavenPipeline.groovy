def call() {
  node {
    stage('Checkout') {
      checkout scm
    }
    def p = pipelineCfg()

    if (p.type == python) {
      docker.image(p.testImage).inside() {
        stage('Test') {
          sh 'ls'
          
          //sh p.testCommand
        }
      }
    }
    else {
      sh 'echo "durga"'
    }
  
  }
}
