def call(Map config = [:]){
    if (!config.projectKey){
        error(Missing SonarQube Project)
    }
    
    #sonarqube api
}