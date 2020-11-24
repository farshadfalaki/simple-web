node{
	def app
	stage('pull code'){
		git 'https://github.com/farshadfalaki/simple-web.git'
	}
	
	stage('build code'){
		sh 'mvn clean package'
	}
	
	stage('build docker image'){
		/* sh 'docker build -t simple-web-image .' */
		app = docker.build("falakidocker/simple-web-image")
	}
	
	stage('Push to docker hub'){
		
			echo "Trying to push to docker hub"
			docker.withRegistry('https://registry.hub.docker.com','dockerHubCred'){
				app.push("${env.BUILD_NUMBER}")
				app.push('latest')
			}
		
	}
}