def call(Map config) {
    node {
      sh '''
                  git version
                  java -version
                  python --version
      '''
    }
}
