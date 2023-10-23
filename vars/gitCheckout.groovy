def call(Map stageParams){
    chekout {[

        $class: 'GitSCM',
        branches: [[name: stageParams.branch]],
        userRemoteConfigs: [[url: stageParams.url]]
    ]
    
    }
}