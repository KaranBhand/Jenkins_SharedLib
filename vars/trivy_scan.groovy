def call() {
  sh "trivy fs . --skip-db-update || true"
}
