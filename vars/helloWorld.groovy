def call(Map config = [:]) {
    sh "echo Hello ${config.name}. ${config.message}."
}
