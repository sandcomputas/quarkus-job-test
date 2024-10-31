#!/bin/bash
set -e

./mvnw package

IMAGE_TAG="europe-west1-docker.pkg.dev/sandbox-sondre-a/artifact-repo/quarkus-demo-jvm"

docker build --platform linux/amd64 -f src/main/docker/Dockerfile.jvm -t $IMAGE_TAG .
docker push $IMAGE_TAG

# Deploy
gcloud run jobs deploy quarkus-job --image $IMAGE_TAG --max-retries 0 --task-timeout "100s"
