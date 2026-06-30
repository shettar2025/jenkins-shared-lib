def call(appName) {

    def ACCOUNT_ID = '438987840260'
    def AWS_REGION = 'eu-north-1'

    // Application
    def ECR_REPO   = appName
    def IMAGE_NAME = appName
    def GIT_URL    = "https://github.com/shettar2025/${appName}.git"
    def ECR_URL    = "${ACCOUNT_ID}.dkr.ecr.${AWS_REGION}.amazonaws.com"

    // EKS
    def EKS_CLUSTER = "eks-dev"

    // Terraform
    def TF_DIR = "terraform"

    // Helm
    def HELM_DIR = "helm-chart"

    // Kubernetes
    def NAMESPACE = "ecommerce"

    return [

        ACCOUNT_ID : ACCOUNT_ID,
        AWS_REGION : AWS_REGION,

        ECR_REPO   : ECR_REPO,
        ECR_URL    : ECR_URL,
        IMAGE_NAME : IMAGE_NAME,
        GIT_URL    : GIT_URL,

        EKS_CLUSTER: EKS_CLUSTER,
        TF_DIR     : TF_DIR,
        HELM_DIR   : HELM_DIR,
        NAMESPACE  : NAMESPACE

    ]
}
