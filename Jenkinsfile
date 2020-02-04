@Library('shlib')_
pipeline {
agent any 
stages{

	stage('Create Job'){
	steps{
		createjobjson(JSON)
 
	}
	}
	
	
	
	stage('Delete Job'){
	steps{
		Deletejob("freestyle")
 
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