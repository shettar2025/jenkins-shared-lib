def call(constant) {

    def ACCOUNT_ID = '438987840260'
    def AWS_REGION = 'eu-north-1'
 def GIT_URL    = 'https://github.com/shettar2025/studentapp.git'
    def ECR_URL = "${ACCOUNT_ID}.dkr.ecr.${AWS_REGION}.amazonaws.com/${constant}"
def ECR_REPO   = 'studentapp-repo'
    return [
        ACCOUNT_ID: ACCOUNT_ID,
        AWS_REGION: AWS_REGION,
        ECR_URL: ECR_URL,
       GIT_URL: GIT_URL,
      ECR_REPO: ECR_REPO,
    ]
}
