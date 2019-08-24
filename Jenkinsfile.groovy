node {
    stage("hello world"){
        properties([pipelineTriggers([cron('* * * * *')])])
        sh "echo hello"        
    }
}