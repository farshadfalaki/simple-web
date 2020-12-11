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
	/*		docker.withRegistry('','dockerHubCred'){
				app.push("${env.BUILD_NUMBER}")
				app.push('latest')
			}
	
*/	
	}
        stage('Deploy to k8s'){
			sh 'whoami'
			sh 'pwd'
			/*kubernetesDeploy(configs: "k8s-deploy.yaml", kubeconfigId: "mkc1")*/
			/*withKubeConfig([credentialsId: 'mkc1', serverUrl: 'https://192.168.49.2:8443']) {
					sh 'kubectl apply -f k8s-deploy.yaml'
				}
			sh 'kubectl apply -f k8s-deploy.yaml' */
			sshagent(['ff-localhost']) {
				sh 'scp -o StrictHostKeyChecking=no k8s-deploy.yaml farshad@localhost:/home/farshad/'
				sh 'ssh farshad@localhost kubectl apply -f k8s-deploy.yaml'
			}	
			
	

        }

}
