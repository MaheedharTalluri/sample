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
	stage('Create Job'){
	steps{
		createjob("${DSL_NAME}","${JENKINS_NAME}")
 
	}
	}
	stage('Fetch jobs list'){
	steps{
		jenkinscollector()
 
	}
	}
	stage('Last Successful Build Status'){
	steps{
		lastsuccessfulbuild("task")
 
	}
	}
	
	
	
	
	
}
}