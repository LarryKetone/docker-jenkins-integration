def gv
pipeline {
    agent any
    tools {
        //supported tools are gradle , maven ,jdk
        maven 'maven'
    }
    parameters {
        //these can be used as defined variables in stages
        choice(name:"VERSION",choices:["1","2","3"], description : "")
        booleanParam(name:"executeTests",defaultValue: true, description : "")
    }
    environment {
        NEW_VERSION = '1.3.0'
    }
    stages {

        stage("init"){

            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage("build"){

            steps {
                script{
                    echo gv.buildApp()
                }
                echo "version ${NEW_VERSION}"
            }
        }

        stage("test"){
            //conditional
            when {

                expression {
                    BRANCH_NAME == 'dev' && params.executeTests
                }
            }
            steps {
                echo 'testing the application...'
            }
        }

        stage("deploy"){
            steps {
                echo 'deploying the application...'
            }
        }
    }
    post {
    //runs after all the stages have completed
        always {
            //runs always, similar ones , success, failure
        }
    }
}