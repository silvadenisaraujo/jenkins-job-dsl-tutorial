freeStyleJob('WORKSHOP_RAFAEL') {

    scm {
        github('silvadenisaraujo/djangogirls-example', 'master')
    }

    steps {
        shell('pwd')
        shell('ls')
    }
}