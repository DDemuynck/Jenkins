node{   
	stage('Hello')
	{echo "Hello ADEO"
	}
 
	stage('ENV')
	{
	sh 'echo Environment variables :'
	sh 'env'
	}
} 
