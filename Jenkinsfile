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
	stage('trigger build'){
	steps{
		build("task")
	}
	
	stage('Build Delay'){
	steps{
		builddelay("task1")
	}
	
	stage('disable job'){
	steps{
		disablejob("job")
	}
	
	
	stage('enable job'){
	steps{
		enablejob("jobs")
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