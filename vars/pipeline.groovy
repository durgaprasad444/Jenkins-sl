def label = "jenkins-slave-${UUID.randomUUID().toString()}"
podTemplate(label: label, containers: [
    containerTemplate(name: 'slave1', image: '/jenkins-slave:v1', ttyEnabled: true, command: 'cat')
],
volumes: [
  hostPathVolume(mountPath: '/var/run/docker.sock', hostPath: '/var/run/docker.sock')
]) {
    node(label) {
        def APP_NAME = "node-app"
        def tag = "dev"
            stage("clone code") {
                container('slave1') {                  
  stage 'checkout  repository'
  checkout([$class: 'GitSCM',
        branches: [[name: '*/master']],
        doGenerateSubmoduleConfigurations: false,
        extensions: [],
        submoduleCfg: [],
        userRemoteConfigs: [[
            
            url: 'https://github.com/durgaprasad444/node-app.git'
    ]]])

                }
            }
        
  
                }
            }
