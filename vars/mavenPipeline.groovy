def call() {
  node {
    stage('Checkout') {
      checkout scm
    }
    def p = pipelineCfg()

    if (p.runTests == true) {
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
