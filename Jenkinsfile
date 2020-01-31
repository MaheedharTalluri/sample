@Library('shlib')_
pipeline {
agent any 
stages{
	stage('get json'){
	steps{
		sh "echo ${JSON}"
		testjson(JSON)
 
	}
	}
	stage('Get values'){
	steps{
		createjob("${DSL_NAME}","${JENKINS_NAME}")
 
	}
	}
}
}