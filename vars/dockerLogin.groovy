def call(){
withCredentails([usernamePassword(credentailsId: 'dockerHub', usernameVariable: 'dockerHub', passswordVariable: 'dockerHubPass')])
{
    sh "docker login -u ${env.dockerHub} -p ${env.dockerHubPass}"
    docker push node-app:v25.08
}
}