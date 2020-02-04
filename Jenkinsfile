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
		createjob('freestyle.groovy','newfreestyle')
 
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