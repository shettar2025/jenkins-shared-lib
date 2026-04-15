parameters {
        string(name: 'AWS_REGION', defaultValue: 'eu-north-1', description: 'AWS Region')
        string(name: 'ACCOUNT_ID', defaultValue: '', description: 'AWS Account ID')
        string(name: 'ECR_REPO', defaultValue: 'studentapp-repo', description: 'ECR Repo Name')
        string(name: 'IMAGE_TAG', defaultValue: 'latest', description: 'Docker Image Tag')
    }
