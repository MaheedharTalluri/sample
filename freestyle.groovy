freeStyleJob('Test') {
	scm{
		git{
		remote{
		name('origin')
        url('https://github.com/maheedhar132/Devops_assesment.git')
		credentials('git_creds')
		}
		}
	}
}