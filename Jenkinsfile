@Library('shlib')_
pipeline {
agent any 
stages{

	stage('Create Job'){
	steps{
		createjobjson(JSON)
 
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