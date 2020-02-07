@Library('shlib1')_
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
	}
	
	stage('Build Delay'){
	steps{
		build-delay("task1")
	}
	}
	stage('disable job'){
	steps{
		disablejob("job")
	}
	}
	
	stage('enable job'){
	steps{
		enablejob("jobs")
	}
	}
	
	
	
	
	
	
	stage('Delete builds from range'){
	steps{
		deletebuilds("EDN250","1-2")
 
	}
	}
	
	stage('Rename job'){
	steps{
		renamejob()
 
	}
	}
	
	
	stage('Fetch jobs list'){
	steps{
		jenkinscollector()
 
	}
	}
	
	
	stage('Builds of a job'){
	steps{
		buildsofjob()
 
	}
	}
	
	
	
	
	stage('adding Credentials'){
	steps{
		getsystemconfig()
 
	}
	}
	
	
	/*stage('log info'){
	steps{
		loginfo()
 
	}
	}*/
	
	
	
	stage('create a node'){
	steps{
		createsnode()
 
	}
	}
	
	
	stage('Last Successful Build Status'){
	steps{
		lastsuccessfulbuild("task")
 
	}
	}
	
	
	
	
	
}
}
