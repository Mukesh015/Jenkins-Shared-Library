def call(String url, String branch) {
    echo "cloning repository from ${url} on ${branch} branch"
    git url: "${url}", branch:"${branch}"
    echo "Clone completed"
}
