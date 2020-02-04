pipeline{
    agent{label 'maven'}
    
    stages{
        stage('Build Hibernate'){
            steps {
                sh "./gradlew --no-daemon --system-prop 'org.gradle.jvmargs=-Xmx${env.XMX} -XX:MaxMetaspaceSize=512m' clean build"
            }
        }
    }
}