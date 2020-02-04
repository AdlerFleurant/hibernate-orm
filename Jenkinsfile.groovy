pipeline{
    agent{label: 'maven'}
    
    stages{
        stage('Build Hibernate'){
            sh "./gradlew --no-daemon --system-prop 'org.gradle.jvmargs=-Xmx${env.XMX} -XX:MaxMetaspaceSize=512m' clean build"
        }
    }
}