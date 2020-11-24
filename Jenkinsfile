node{
	stage('pull code'){
		git 'https://github.com/farshadfalaki/simple-web.git'
	}
	
	stage('build code'){
		sh 'mvn clean package'
	}
	
	stage('build docker image'){
		sh 'docker build -t simple-web-image .'
	}
	
	stage('Push to docker hub'){
		script{
			docker.withRegistry('',dockerHubCred){
				dockerImage.push("$BUILD_NUMBER")
				dockerImage.push('latest')
			}
		}
	}
}