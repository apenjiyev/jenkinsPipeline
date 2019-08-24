node {
    stage("hello world"){
        properties([parameters([string(defaultValue: 'Azat', description: 'Paste your name', name: 'NAME', trim: true)]), pipelineTriggers([cron('* * * * * ')])])
        sh "echo hello"        
    }
}