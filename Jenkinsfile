node {
	
	stage('Clean Workspace'){
	       deleteDir()
	}
	
	stage('GIT Checkout') {
	              git 'https://github.com/kartiksagar14/JavaPipe.git'
	       }
	
	stage('SonarQube Report Analysis') {
	
	              withSonarQubeEnv('Sonarqube') {
	              bat "C:/Users/130736/Downloads/sonar-scanner-3.0.3.778-windows/bin/sonar-scanner"
	              }
	       }
	
	 stage('Unit Test Cases') {
	     dir('JavaPipe'){
	       try  {
	                     bat 'mvn test'
	       }
	         
	     
	        catch(exc) {
	       stage('Jira Ticket'){
	       withEnv(['JIRA_SITE=JIRA']){
	              def testIssue = [fields: [ project: [key: 'KS'],
	                           summary: 'New JIRA Created from Jenkins.',
	                           description: 'New JIRA Created from Jenkins.',
	                          issuetype: [name: 'Bug']]]
	
	                     response = jiraNewIssue issue: testIssue
	                     echo response.successful.toString()
	                     echo response.data.toString()
	                    }    
	              }
	         error('Unit Testing Failed so stopping pipeline')
	       }
	     }
	       stage('Maven Build'){
	           dir('JavaPipe'){
	        bat 'mvn clean install'
	           }
	  }
	  } 
	}

