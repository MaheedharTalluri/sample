@Library('sharedlibrary')_
pipeline {
agent any 
stages{

	stage('Create Job'){
	steps{
		jenkins_createjob(JSON)
 
	}
	}
	
	
	
	stage('Delete Job'){
	steps{
		jenkins_deletejob("freestyle")
 
	}
	}
	stage('trigger build'){
	steps{
		jenkins_buildjob("task")
	}
	}
	
	stage('Build Delay'){
	steps{
		jenkins_schedulebuild("task1")
	}
	}
	stage('disable job'){
	steps{
		jenkins_disablejob("job")
	}
	}
	
	stage('enable job'){
	steps{
		jenkins_enablejob("jobs")
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
