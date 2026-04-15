def call(appName) {

    def ACCOUNT_ID = '438987840260'
    def AWS_REGION = 'eu-north-1'
    def ECR_REPO   = appName
    def GIT_URL    = "https://github.com/shettar2025/studentapp.git"

    def ECR_URL = "${ACCOUNT_ID}.dkr.ecr.${AWS_REGION}.amazonaws.com/${ECR_REPO}"

    return [
        ACCOUNT_ID: ACCOUNT_ID,
        AWS_REGION: AWS_REGION,
        ECR_REPO  : ECR_REPO,
        ECR_URL   : ECR_URL,
        GIT_URL   : GIT_URL
    ]
}
