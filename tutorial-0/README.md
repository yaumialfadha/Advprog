# Tutorial 0: Development Environment Setup & Deeper Understanding of Git

CSCM602023 Advanced Programming @ Faculty of Computer Science Universitas
Indonesia, Term 2 2018/2019

* * *

Hello! Welcome to the first Advanced Programming tutorial! You are
going to setup your development environment and learn deeper how to use
Git commands.

This tutorial is divided into four parts. The first part is to make you
install all the required tools for your development environment. The second part
is introduction to basic Git commands. You will learn how to create a Git
repository in your local machine, saving your work into repository, and pushing
your repository to a remote Git repository. The third part of the tutorial will
introduce Git branching mechanism and how to work with branches. The fourth part 
of the tutorial will introduce git revert. You will learn how to undoing
 changes to a repository's commit history. 

## First Part: Development Environment Setup

As mentioned in the first lecture, there are several tools that you will use
in this course. The list is as follows:

- [Git](https://git-scm.com/downloads)
- [Gradle v5.2](https://gradle.org/install/)
- [Java SDK (JDK) 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
    - Note: You can also use Java 9, but it might produce some warning messages
    when using Gradle
- [IntelliJ Community Edition](https://www.jetbrains.com/idea/)
    - Note: You can get the Ultimate version if you registered on JetBrains using
    your student email

The instructions on how to install all the required tools are available on their
official website. After you have installed all the tools, make sure that Git
(`git`), Gradle (`gradle`), and Java (`javac` and `java`) binaries can be run
from your command prompt/shell. You can do so by ensuring the path to the binaries
have been set in your environment variables on your OS.

There is also a Web-based project management and version control called
[GitLab](https://gitlab.com) that we will use during this semester. Please
make an account on GitLab if you have not done so. If you already have a GitLab
account, please tell your TA or lecturer.

## Second Part: Git 101

During your life as a CS student, you may have used some sort of version
control system. Probably the most pervasive example is undo functionality
in text editor. Whenever you make some mistakes, you can revert back to
previous state of your work by using undo function in text editor. Another
example is when you are working on a document collaboratively using Google
Drive where you can see every revisions made to the document.

In this course, you are going to use Git extensively. Git is a version
control system that commonly used to track changes in software artifacts.
It works by capturing the states of items in the software artifacts as
series of commits. The commits are arranged in linear manner from the
oldest commit to the most recent commit and may have several branches.
Think of it like a graph in which a node represents a commit and
directed edge(s) represent the connection from a commit to its
subsequent commit(s).

Enough with the background information. Let's start with the exercise!

**Notes: GitLab project and repository that you will create in this part until the final part
is different from GitLab project that you will use to store all tutorial
work. But you must fill todo on tasks, links, and my notes. Subsequent tutorials starting from `tutorial-0` will use
the main GitLab project and repository that you cloned when reading in
the root README file.**

1. Start your command-prompt or shell. In Windows, run `Git Bash`. In
Linux-based OS or Mac OS, you can use your favourite shell (e.g. bash,
zsh).
2. Set your current directory to a directory where you will store any
Advanced Programming-related work. Use `cd` commands to navigate to
a directory of your choice.
3. Create a new directory to store new files related to this exercise.
Try naming the directory to `git-exercise` and set your current
directory to the recently created directory.
4. Inside the new directory, execute `git init`. An empty Git
repository will be created inside this directory.
5. Try executing `git status`. It will print the state of Git repository
at the time of command execution.

Congratulations! You have created your first local Git repository.
Before we can continue the tutorial, there are several configurations
need to be done to your local Git repository.

1. Set the username and email that will be associated with your work in
this Git repository. Run this command in your local Git repository:
`git config user.name "<YOURNAME>"` and `git config user.email <YOUREMAIL>`
Example: `git config user.name "John Doe"` followed by
`git config user.email example@gmail.com`
2. If you are using PC in Fasilkom labs, you need to set HTTP proxy
in Git configuration as well. Set the proxy by using this command: 
`git config http.proxy 152.118.24.10:8080`
3. If you want to set the configuration globally (i.e. for every Git
repositories in your local machine and new local repositories in the
future), add `--global` flag in `git config` calls.
4. If you want to know the configurations set to your local repository,
try this command: `git config --list --local`

Once you have configured your username and email, you may proceed to the
next tutorial instructions.

1. Create a new file named **README.md** and write your name, NPM, and class
using following format:
```
Name: YOUR NAME HERE
blank line
NPM: YOUR STUDENT ID HERE
blank line
Class: YOUR CLASS HERE
```

2. Run `git status` again. Notice that there is an untracked file. It
means that there is a file that is not yet tracked by Git.
3. Add the file into Git by executing `git add README.md`.
4. Run `git status` again. The status message will be different from
previous `git status` execution. See that the `README.md` file is
put into section named `Changes to be committed`. It means that
README.md will be tracked by Git in the next commit.
> As of now, README.md is not yet tracked by Git even though you
> have run `git add README.md`. `git add` command only tells Git to
> include changes in file(s) into Git's *staging area*.

5. To persist the changes permanently into Git, run `git commit`.
A text editor (Vim) will appear where you have to write a message
describing the commit.
> How to use Vim: `h j k l` to move cursor in Vim, `i` to switch to
> INSERT mode, `escape` to switch back to COMMAND mode, `:w` in COMMAND
> mode to write content buffer to output stream, `:q` in COMMAND mode
> to exit Vim.

6. Once you have written the commit message, write the content and
then exit the text editor. The changes will be persisted into a commit
and stored in Git.

You have just created a Git repository and start tracking changes to a
file in the repository. The repository that you just created is stored
in your own machine. If you are going to share your work with your
colleagues, you need to have the repository accessible via Web. In order
to do that, you are going to put a copy of your repository to an online
Git hosting service named GitLab.

1. Go to GitLab.com by using your favourite Web browser.
2. Create an account or use an existing one if you have registered prior
to taking this course.
3. Create a new repository named **My First Git Repo** on GitLab and go
to its repository page. Ensure that you set the visibility to Public.
4. Find a section named clone URL in the page. Notice that there are 2
kinds of URL: HTTPS and SSH. Take note of the HTTPS URL.
5. You are going to update your local Git repository so your commits
can be stored in GitLab as well. Execute `git remote add origin <URL>`
where `<URL>` is the HTTPS URL of your GitLab repository. Example:
`git remote add origin https://gitlab.com/JohnDoe/my-first-repo.git`
`git remote` adds a path from your local repository to the online
repository on GitLab. The path has an identifier named `origin`. By
having this path, you can begin storing your commits to the online
repository as well.
6. To store your commits to your online GitLab repository, run
`git push -u origin master`. `git push -u` tells Git to push commits in
your local `master` branch to repository pointed by `origin` and ensure
subsequent `git push` calls will be sent to `master` branch at `origin`.
7. Check your GitLab repository page. You will see that your files are
available on GitLab.

You can also get (i.e. clone) other repository to your local machine.
Let's try making a copy of your repository from GitLab to a different
directory in your machine.

1. Go to your repository page on GitLab.
2. Take note of its HTTPS clone URL.
3. Switch back to your command-prompt or shell. Go to a different
directory outside of your own local Git repository.
4. Run this command: `git clone <URL>` where `<URL>` is the clone URL.
5. Confirm that a new directory is created at the location where you
executed the `git clone` command.

This ends the second part of the tutorial. Make sure that you have
informed your GitLab username to the teaching team (TA or lecturer)
so they can monitor your work.

## Third Part: Git Branches

When you need to edit something but it is still unclear whether it would
actually work or not, that's when the branch feature becomes important to
your group project. If you edit something in your branch, your files on
`master` branch still the same as before.

How to create branch from latest commit in `master`:

1. Make sure you are inside the `master` branch. You can check the branch
that you are currently working at by using `git branch`.
2. Create a new branch by using `git branch <BRANCHNAME>`. Example:
`git branch cool-feature`
3. Switch to your new branch using `git checkout <BRANCHNAME>`. Example:
`git checkout cool-feature`
> Actually, step 2 and 3 can be shortened into a single `git checkout`
> call: `git checkout -b <BRANCHNAME>`

4. Verify that you have switched to the new branch. Try invoke `git branch -v`.
The branch name in bold text is the current branch you are working on.

Now you are working on your new branch, let's try to simulate concurrent working
on the same project:

1. Open the README.md file.
2. Create one new line below the third line. Write your hobby in that line.
3. Save the README.md file.
4. Add the README.md file into *staging area*. Use the command:
`git add README.md`
5. Commit the README.md file into the Git. Use the command `git commit`
and write a commit message.
6. Push the commit. Use the command `git push -u origin <BRANCHNAME>`

Do you have any problem with the instructions above? If you don't, do
the following:

1. Work on the `master` branch. Use the command `git checkout master`
to switch back to `master` branch.
2. Open the README.md file.
3. Create one new line below the third line. Write your *other* hobby
in that line (must be different with previous one).
4. Save the README.md file. Add the modified README.md to *staging area*
by using `git add README.md` then commit it into Git.
5. Merge the new branch with the `master` branch. Use this command:
`git merge <BRANCHNAME>` Example: `git merge cool-feature`

There should be a problem in your `git merge`, which Git will provide some
options to resolve the conflict. Choose anything suitable with your merge
conflict condition. (In this case you will need to choose what hobby really
suitable with you). The conflict can be resolved by opening the conflicting
file in a text editor and choose which portion that you consider correct.

To give you an example, suppose that you call `git merge` in `master`
branch. Git reported that there is a merge conflict in README.md file.
Consequently, Git included the conflicting changes from both branches
in README.md and ask the programmer to resolve the conflict. The
conflicting part in the README.md file is as follows:

```
Name    : John Doe

NPM     : 123456789

Class   : A/B/INT

<<<<< HEAD
Hobby   : Sleeping
=========
Hobby   : Dreaming
>>>>> cool-feature
```

Notice that there are 2 sections labelled with name of branches: `HEAD`
and `cool-feature`. Section between `HEAD` and `===` line contains the
content from `master` branch whereas the section between `===` line and
`cool-feature` contains the content from `cool-feature` branch. As a
programmer that resolving the conflict, there are 3 options that you
can follow.

1. Pick the changes from `master` and discard content from `cool-feature`.

    The final result should be similar to this example:
    ```
    Name    : John Doe

    NPM     : 123456789

    Class   : A/B/INT

    Hobby   : Sleeping
    ```
2. The other way around: pick the changes from `cool-feature` and
discard content from `master`.

    The final result should be similar to this example:
    ```
    Name    : John Doe

    NPM     : 123456789

    Class   : A/B/INT

    Hobby   : Dreaming
    ```
3. Integrate changes from both branches, or even came up with completely
different content. One example is as follows:

    ```
    Name    : John Doe

    NPM     : 123456789

    Class   : A/B/INT

    Hobby   : Sleeping, dreaming, listening to music
    ```

* * *

## Fourth Part: Git Revert
Sometimes, you make changes to the source code that is not supposed to be committed. 
To cancel the previous change to the source code repository, we can use git revert. 
Git revert allows us to rollback any changes applied to source code by reverting the 
file back to the initial state.

Maybe you've heard git reset can also rollback any changes, but git revert is the safest command to use.
Git revert undoes a single commit, while git reset roll back to the previous state of a project by removing all subsequent commits.

Enough with the introduction. Let's start practice!
1. Type `git status` to see state of the working directory and the staging area. It lets you see which changes have been staged, which haven't, and which files aren't being tracked by Git.
    ```
    [arga@Arga-Linux-K401LB - Tue Feb 05, 08:46 AM] ~/Documents/My-First-Git-Repo [master] > git status
    On branch master
    Your branch is up to date with 'origin/master'.
    
    nothing to commit, working tree clean
    ```
2. List the files that exist on the repository.
    ```
    [arga@Arga-Linux-K401LB - Tue Feb 05, 08:46 AM] ~/Documents/My-First-Git-Repo [master] > ls
    README.md
    ```
3. Let's see what's in that file.
    ```
    [arga@Arga-Linux-K401LB - Tue Feb 05, 09:01 AM] ~/Documents/My-First-Git-Repo [master] > cat README.md 
    Name    : Arga Ghulam Ahmad
    
    NPM     : 1606821601
    
    Class   : C
    
    Hobby   : Reading, Programming, and Gaming
    ```
4. Type `git log` display lists the commits made in that repository in reverse chronological order.
    ```
    Author: Arga Ghulam Ahmad <argaghulamahmad@gmail.com>
    Date:   Fri Feb 9 11:06:56 2018 +0700
    
        Integrate changes from both branches
    
    commit 3048b26a6b41c1a2289ccc80178f838b96848344
    Merge: 69df5f1 a3b0771
    Author: Arga Ghulam Ahmad <argaghulamahmad@gmail.com>
    Date:   Fri Feb 9 11:05:27 2018 +0700
    
        Pick changes from branch 'master'
    
    commit 69df5f19b1ab4e9f1658abe5828bfca9a19ebb69
    Author: Arga Ghulam Ahmad <argaghulamahmad@gmail.com>
    Date:   Fri Feb 9 11:01:17 2018 +0700
    
        Update 'README.md'
    
    commit a3b07717e110c33464df12e24b13a0cd18be3bfa (origin/cool-feature)
    Author: Arga Ghulam Ahmad <argaghulamahmad@gmail.com>
    Date:   Fri Feb 9 10:59:15 2018 +0700
    
        Update 'README.md'
    
    commit 93f6903fbf88cd1244f50a4fd5b2d01f31de7cea
    Author: Arga Ghulam Ahmad <argaghulamahmad@gmail.com>
    Date:   Fri Feb 9 10:32:08 2018 +0700
    
        Add 'README.md'

    ```
5. You can freely take the random commit that you want to rollback.

    Lets type `git checkout <commit hash>`.
    ```
    [arga@Arga-Linux-K401LB - Tue Feb 05, 09:04 AM] ~/Documents/My-First-Git-Repo [master] > git checkout a3b07717e110c33464df12e24b13a0cd18be3bfa
    Note: checking out 'a3b07717e110c33464df12e24b13a0cd18be3bfa'.
    
    You are in 'detached HEAD' state. You can look around, make experimental
    changes and commit them, and you can discard any commits you make in this
    state without impacting any branches by performing another checkout.
    
    If you want to create a new branch to retain commits you create, you may
    do so (now or later) by using -b with the checkout command again. Example:
    
      git checkout -b <new-branch-name>
    
    HEAD is now at a3b0771 Update 'README.md'
    ```
    That command will give you access to look around the state of the file on that commit snapshot.
    
    Lets type `cat README.md` and you will see the state of file 'README.md' on that commit snapshot.
    ```
    [arga@Arga-Linux-K401LB - Tue Feb 05, 09:05 AM] ~/Documents/My-First-Git-Repo [(HEAD detached at a3b0771)] > cat README.md 
    Name    : Arga Ghulam Ahmad
    
    NPM     : 1606821601
    
    Class   : C
    
    Hobby   : Gaming
    ```
6. After seeing the state of the file on that commit, let's go back to HEAD and do `git revert`.
    Let's type `git checkout master` to return to the last commit on the master branch.
    ```
    [arga@Arga-Linux-K401LB - Tue Feb 05, 09:05 AM] ~/Documents/My-First-Git-Repo [(HEAD detached at a3b0771)] > git checkout master
    Previous HEAD position was a3b0771 Update 'README.md'
    Switched to branch 'master'
    Your branch is up to date with 'origin/master'.
    ```
    
    Use `git revert <commit hash>` to rollback to the commit snapshot that you want.
    ```
    [arga@Arga-Linux-K401LB - Tue Feb 05, 09:19 AM] ~/Documents/My-First-Git-Repo [master] > git revert a3b07717e110c33464df12e24b13a0cd18be3bfa
    error: could not revert a3b0771... Update 'README.md'
    hint: after resolving the conflicts, mark the corrected paths
    hint: with 'git add <paths>' or 'git rm <paths>'
    hint: and commit the result with 'git commit'
    ```
    
7. There should be a/some conflict/conflicts after we do `git revert`. Let's see the file that affected by git revert using `git status`.
    ```
    On branch master
    Your branch is up to date with 'origin/master'.
    
    You are currently reverting commit a3b0771.
      (fix conflicts and run "git revert --continue")
      (use "git revert --abort" to cancel the revert operation)
    
    Unmerged paths:
      (use "git reset HEAD <file>..." to unstage)
      (use "git add <file>..." to mark resolution)
    
    	both modified:   README.md
    ```
    
    Notice that there is a conflict on file 'README.md'. Let's see what's the content of that file.
    ```
    [arga@Arga-Linux-K401LB - Tue Feb 05, 09:20 AM] ~/Documents/My-First-Git-Repo [master !] > cat README.md 
    Name    : Arga Ghulam Ahmad
    
    NPM     : 1606821601
    
    <<<<<<< HEAD
    Class   : C
    
    Hobby   : Reading, Programming, and Gaming
    =======
    Class   : C
    >>>>>>> parent of a3b0771... Update 'README.md'
    ```
    
    After you learn how to resolve the conflict in the previous part, You can solve the conflict in that file depend on your need.
    ```
    [arga@Arga-Linux-K401LB - Tue Feb 05, 09:37 AM] ~/Documents/My-First-Git-Repo [master !] > cat README.md 
    Name    : Arga Ghulam Ahmad
    
    NPM     : 1606821601
    
    Role	: Teaching Assistant
    
    Hobby   : Reading, Programming, and Gaming

    ```
    
8. Do `git add .` and `git revert --continue` to save changes of revert process. 
    On the `git revert --continue` command, you may be redirected to vim, please press button `esc`, type `:wq`, and press button `enter` to save your changes.
    ```
    [arga@Arga-Linux-K401LB - Tue Feb 05, 09:37 AM] ~/Documents/My-First-Git-Repo [master !] > git add .
    [arga@Arga-Linux-K401LB - Tue Feb 05, 09:38 AM] ~/Documents/My-First-Git-Repo [master !] > git revert --continue
    [master 225d6da] Add role on README and Revert "Update 'README.md'"
     1 file changed, 1 insertion(+), 1 deletion(-)
    ```
    
    Type `git log 'to see whether the revert process was successful or not.
    ```
    [arga@Arga-Linux-K401LB - Tue Feb 05, 09:38 AM] ~/Documents/My-First-Git-Repo [master *] > git log
    commit 225d6daebaf1263ae20322f492707ddab9f7d4b6 (HEAD -> master)
    Author: Arga Ghulam Ahmad <argaghulamahmad@gmail.com>
    Date:   Tue Feb 5 09:38:03 2019 +0700
    
        Add role on README and Revert "Update 'README.md'"
        
        This reverts commit a3b07717e110c33464df12e24b13a0cd18be3bfa.
    
    commit c9a1e37af3daaa42df31f94404f5ce8d1426f5ba (origin/master, origin/HEAD)
    Author: Arga Ghulam Ahmad <argaghulamahmad@gmail.com>
    Date:   Fri Feb 9 11:06:56 2018 +0700
    
        Integrate changes from both branches
    
    commit 3048b26a6b41c1a2289ccc80178f838b96848344
    Merge: 69df5f1 a3b0771
    Author: Arga Ghulam Ahmad <argaghulamahmad@gmail.com>
    Date:   Fri Feb 9 11:05:27 2018 +0700
    
        Pick changes from branch 'master'
    
    commit 69df5f19b1ab4e9f1658abe5828bfca9a19ebb69
    Author: Arga Ghulam Ahmad <argaghulamahmad@gmail.com>
    Date:   Fri Feb 9 11:01:17 2018 +0700
    
        Update 'README.md'
    
    commit a3b07717e110c33464df12e24b13a0cd18be3bfa (origin/cool-feature)
    Author: Arga Ghulam Ahmad <argaghulamahmad@gmail.com>
    Date:   Fri Feb 9 10:59:15 2018 +0700
    
        Update 'README.md'
    
    commit 93f6903fbf88cd1244f50a4fd5b2d01f31de7cea
    Author: Arga Ghulam Ahmad <argaghulamahmad@gmail.com>
    Date:   Fri Feb 9 10:32:08 2018 +0700
    
        Add 'README.md'
    ```
    Note that the result of `git log` will display the last commit that has a commit description containing the word 'revert'.    
## Final Part: Apply Your Deeper Understanding of Git on The Real Project
Once you understand how to use git branch and git revert, you can't wait to apply the knowledge to the actual project. 
Therefore, you can apply git branches and git revert to the repo containing your DDP 2 last assignment, the Match-Pair Memory Game.

You can create scenarios where you need to apply git branch and git revert to the project. And write the explanation in my note.

### Mandatory Tasks Checklist

- [ ] Install all required tools
- [ ] Create a local Git repository and make at least one commit
- [ ] Create a new GitLab project
- [ ] Make local Git repository synchronised with the online Git repository
on the new GitLab project
    - Hint: `git push -u origin master`
- [ ] Clone the Git repository from the new GitLab project to a different
directory (Hint: it should contain the same set of files that you have
pushed before from the original directory)
- [ ] Create a new branch other than `master` and make at least one commit
in the new branch
- [ ] Write your git exercise repository link on links

## Additional Tasks Checklist

- [ ] Simulate a merge conflict and able to resolve it
    - Hint: on a branch, try `git merge <BRANCH_NAME>` where
    `<BRANCH_NAME>` is the name of branch that you want to merge into
    currently active branch (e.g. `master`, `a-branch`, etc.)
- [ ] Clone your DDP2 last assignment (Match-Pair Memory Game) repository or https://gitlab.com/DDP2-CSUI/assignment to your local machine
- [ ] Try to simulate Git Branches and Git Revert usage on your DDP2 last assignment (Match-Pair Memory Game) repository and write your explanation on My Notes
    - [ ] Git Branches Usage
        - [ ] Find a reason why you should use git branches
            - Write your explanation on my notes
        - [ ] Describe how you use git branches on that repository  
            - Write your explanation on my notes
    - [ ] Git Revert Usage
        - [ ] Find a scenario so you should use git revert
            - Write your explanation on my notes
        - [ ] Describe how you use git revert on that repository
            - Write your explanation on my notes
- [ ] Write your DDP2 last assignment (Javari Park Festival) repository on links

## Links
//todo write your git exercise and Javari Park Festival repository link here

## My Notes
//todo write your note here, this note will help you demonstrate your work to teaching assistant

## Additional Resources

- [Git Tutorials & Training by Atlassian](https://www.atlassian.com/git/tutorials)
- [Try Git in your Web browser](https://try.github.io/)
- [Pro Git e-Book by Scott Chacon & Ben Straub](https://git-scm.com/book/en/v2)
- [Graph theory](http://think-like-a-git.net/sections/graph-theory.html) and
[ applications in Git](http://think-like-a-git.net/sections/graphs-and-git.html)

## Attributions
This problem set is based on last year's tutorial 0 with addition about git revert and some additional tasks. This tutorial last modified by Arga Ghulam Ahmad.