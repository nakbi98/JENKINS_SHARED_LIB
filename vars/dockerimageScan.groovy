def call(String project, String ImageTag, String hubUser) {
    try {
        sh """
           trivy image ${hubUser.toLowerCase()}/${project}:${ImageTag} ${hubUser.toLowerCase()}/${project}:latest > scan.txt
           cat scan.txt
        """
    } catch (Exception e) {
        currentBuild.result = 'FAILURE'
        error("Échec de l'analyse de sécurité de l'image : ${e.getMessage()}")
    }
}
