
# swap create with update
gcloud scheduler jobs update http quarkus-job-scheduler \
  --location "europe-west1" \
  --schedule="1 1 1 1 *" \
  --uri="https://europe-west1-run.googleapis.com/apis/run.googleapis.com/v1/namespaces/518295322351/jobs/quarkus-job:run" \
  --http-method POST \
  --oauth-service-account-email terraform-runner@sandbox-sondre-a.iam.gserviceaccount.com

