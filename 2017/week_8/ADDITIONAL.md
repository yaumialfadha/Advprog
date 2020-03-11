# Exercise 8: Second Part - Deploy to PaaS (Heroku)

CSCM602023 - Advanced Programming (Pemrograman Lanjut) @ Faculty of
Computer Science Universitas Indonesia, Even Semester 2016/2017

* * *

In this part of exercise, you and your friends will setup a Telegram
bot. The bot will be deployed as a [Heroku](https://www.heroku.com)
app instance. Please follow the instructions below.

1. Create a Telegram bot by sending '/newbot' command to `@BotFather` in Telegram apps and follow its instructions. After creating a new bot, you should get a token associated with your bot. Let's say your bot token is `MyBotToken`.

1. Now we're going to create a Heroku app. Sign up for a Heroku account [here](https://signup.heroku.com).

1. You need to install [Heroku CLI](https://devcenter.heroku.com/articles/heroku-cli). Download and install the toolbelt according to your operating system.

1. Don't forget to login with your Heroku account after installing Heroku CLI with

	```bash
	heroku login
	```

1. Open a terminal/command prompt and navigate to the `csuibot` directory. Create a Heroku application there by running `heroku create` command in your terminal. You might be prompted to enter your Heroku credentials.

1. When a Heroku app is created, its repository URL will be added as a git remote URL in your project. You might want to run `git remote -v` and see it for yourself that there are now two remote URLs in your project: `origin` and `heroku`.

1. Your Heroku app also has a web URL. Type `heroku info` in your terminal. Your app's web URL is listed there. You might notice that the URL is set by Heroku using your app's name that is generated randomly. The URL is needed later so if you want to rename your app (so your web URL is easier to remember), please do it now. Run `heroku help apps` to see the `apps` command docs and find out how to rename an app. Let's say that your web URL is now `https://my-app.herokuapp.com/`.

1. Set your application configuration variables. There are several config vars you can customize (see `csuibot/config.py` or `.env.example`) but for the moment, the most important variables you have to set are `APP_ENV`, `TELEGRAM_BOT_TOKEN`, and `WEBHOOK_HOST`. Type this command in your terminal:

    ```bash
    heroku config:set APP_ENV=production TELEGRAM_BOT_TOKEN=MyBotToken WEBHOOK_HOST=https://my-app.herokuapp.com/bot
    ```

    Note that `WEBHOOK_HOST` should be HTTPS and there must **NOT** be any trailing slashes.

1. Deploy CSUIBot project to your Heroku app. This is done simply by

    ```bash
    git push heroku master
    ```
	
	P.S. Don't forget to `git add` and `git commit` first

1. After deployment is finished, try your Telegram BOT by sending it a private message. Try the zodiac or shio command that you and your friends have implemented. Have fun!
