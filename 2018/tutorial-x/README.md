# Tutorial X: Try Line Bot SDK Java

CSCM602023 Advanced Programming @ Faculty of Computer Science Universitas
Indonesia, Term 2 2017/2018

* * *

> Attention: This is an **ungraded tutorial**. You may skip this tutorial
> if you have prior experience in developing Line chatbot.

A Java-based Line chatbot example is available on [GitHub](https://github.com/line/line-bot-sdk-java/tree/master/sample-spring-boot-echo).
Your task is to try deploying the sample on your own Heroku and make
modification to the sample chatbot. You can follow the provided guide in
[Line Messaging API documentation](https://developers.line.me/en/docs/messaging-api/building-sample-bot-with-heroku/)

Once you are able to deploy the bot using Heroku commands or you want to
automate bot deployment each time you pushed new commit to your repository
on GitLab, try to configure GitLab CI pipeline in your repository. Please
refer to [this guide](https://about.gitlab.com/2015/12/14/getting-started-with-gitlab-and-gitlab-ci/)
to know the basic on configuring CI pipeline on GitLab.

> Note: To avoid complicated CI configuration, we recommend you to create a
> new GitLab project specifically for containing chatbot's source code.

> Hint: You may also refer to the CI configuration used in Web Design &
> Programming practical/lab sessions last semester (Term 1 2017/2018). It has
> a CI job example that deploys a Django-based Web app to Heroku using
> [`dpl`](https://github.com/travis-ci/dpl#heroku) tool.
