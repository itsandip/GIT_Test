pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "apache-maven-3.8.1"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
               // git 'https://github.com/thechetantalwar/java-demos.git'
	       echo "This is multi branch projet"

                // Run Maven on a Unix agent.
                sh '''pwd
		ls -ltr
		'''
		sh 'mvn --version'

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    
                    archiveArtifacts 'target/*.war'
                }
            }
        }
    }
}
