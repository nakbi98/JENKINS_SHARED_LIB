def call(String project, String ImageTag, String hubUser) {
    sh """

       trivy image ${hubUser.toLowerCase()}/${project}:${ImageTag} ${hubUser.toLowerCase()}/${project}:latest > scan.txt
       cat scan.txt
    """
}