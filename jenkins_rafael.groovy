freeStyleJob('WORKSHOP_RAFAEL') {

    scm {
        github('silvadenisaraujo/djangogirls-example.git', 'master')
    }

    steps {
        shell('pwd')
        shell('ls')
    }
}