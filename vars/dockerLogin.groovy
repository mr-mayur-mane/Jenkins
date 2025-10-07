def call(){
withCredentails([usernamePassword(credentailsId: 'dockerHub', usernameVariable: 'dockerHub', passswordVariable: 'dockerHubPass')])
{
    sh "docker login -u ${env.dockerHub} -p ${env.dockerHubPass}"
}
}