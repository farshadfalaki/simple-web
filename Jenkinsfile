node{
	stage('pull code'){
		git 'https://github.com/farshadfalaki/simple-web.git'
	}
	
	stage('build it'){
		sh 'mvn clean package'
	}
}