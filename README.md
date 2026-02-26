# Git-Testing-Gate
   git init Git-Testing-Gat
   git clone https://github.com/Gady-Hirwa-Ntwali/Git-Testing-Gate.git

   git checkout -b dev
   git push -u origin dev


   git checkout -b test
   Switched to a new branch 'test'
   git push -u origin test
   git checkout dev
   git branch -d test
   Deleted branch test (was 00290d2).
   git push origin --delete test

   git checkout -b ft/setup
   Switched to a new branch 'ft/setup'

   touch test.java
   git add test.java
   git commit -m "add java file called test"
   git push --set-upstream origin ft/setup

   echo "modify the test" >> test.java
   git stash

   git stash apply stash@{0}

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate (main)
$ git config --list
diff.astextplain.textconv=astextplain
filter.lfs.clean=git-lfs clean -- %f
filter.lfs.smudge=git-lfs smudge -- %f
filter.lfs.process=git-lfs filter-process
filter.lfs.required=true
http.sslbackend=openssl
http.sslcainfo=C:/softwre/Git/mingw64/etc/ssl/certs/ca-bundle.crt
core.autocrlf=true
core.fscache=true
:
diff.astextplain.textconv=astextplain
filter.lfs.clean=git-lfs clean -- %f
filter.lfs.smudge=git-lfs smudge -- %f
filter.lfs.process=git-lfs filter-process
filter.lfs.required=true
http.sslbackend=openssl
http.sslcainfo=C:/softwre/Git/mingw64/etc/ssl/certs/ca-bundle.crt
core.autocrlf=true
core.fscache=true

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate (main)
$ git config user.name
git config user.email
Gady-Hirwa-Ntwali
hirwagad767@gmail.com

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate (main)
$ git init Testing Gate
usage: git init [-q | --quiet] [--bare] [--template=<template-directory>]
[--separate-git-dir <git-dir>] [--object-format=<format>]
[--ref-format=<format>]
[-b <branch-name> | --initial-branch=<branch-name>]
[--shared[=<permissions>]] [<directory>]

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate (main)
$ git init TEsting-Git-Gate
Initialized empty Git repository in C:/Users/user/Desktop/peer review/Git-Testing-Gate/TEsting-Git-Gate/.git/

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate (main)
$ git checkout -b dev
Switched to a new branch 'dev'

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate (dev)
$ git push
fatal: The current branch dev has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin dev

To have this happen automatically for branches without a tracking
upstream, see 'push.autoSetupRemote' in 'git help config'.


user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate (dev)
$  git push --set-upstream origin dev
Total 0 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
remote:
remote: Create a pull request for 'dev' on GitHub by visiting:
remote:      https://github.com/Gady-Hirwa-Ntwali/Git-Testing-Gate/pull/new/dev
remote:
To https://github.com/Gady-Hirwa-Ntwali/Git-Testing-Gate.git
* [new branch]      dev -> dev
  branch 'dev' set up to track 'origin/dev'.

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate (dev)
$ git checkout -b test
Switched to a new branch 'test'

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate (test)
$ git checkout dev
M       README.md
Switched to branch 'dev'
Your branch is up to date with 'origin/dev'.

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate (dev)
$ git checkout test
M       README.md
Switched to branch 'test'

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate (test)
$ git add .
error: 'Testing-Git-Gate/' does not have a commit checked out
fatal: adding files failed

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate (test)
$ git add .
error: 'Testing-Git-Gate/' does not have a commit checked out
fatal: adding files failed

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate (test)
$ git add .
error: 'Desktop/peer review/Git-Testing-Gate/Testing-Git-Gate/' does not have a commit checked out
fatal: adding files failed

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate (dev)
$ git add .
error: 'Desktop/peer review/Git-Testing-Gate/Testing-Git-Gate/' does not have a commit checked out
fatal: adding files failed

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate (dev)
$ git checkout test
error: pathspec 'test' did not match any file(s) known to git

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate (dev)
$ git checkout main
error: pathspec 'main' did not match any file(s) known to git

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate (dev)
$ cd Git-Testing-Gate
bash: cd: Git-Testing-Gate: No such file or directory

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate (dev)
$ cd /Git-Testing-Gate
bash: cd: /Git-Testing-Gate: No such file or directory

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate (dev)
$ cd Testing-Git-Gate

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Testing-Git-Gate (main)
$ git checkout dev
error: pathspec 'dev' did not match any file(s) known to git

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Testing-Git-Gate (main)
$ git pull
There is no tracking information for the current branch.
Please specify which branch you want to merge with.
See git-pull(1) for details.

    git pull <remote> <branch>

If you wish to set tracking information for this branch you can do so with:

    git branch --set-upstream-to=<remote>/<branch> main


user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Testing-Git-Gate (main)
$ git pull remove main
fatal: 'remove' does not appear to be a git repository
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Testing-Git-Gate (main)
$ git pull main
fatal: 'main' does not appear to be a git repository
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Testing-Git-Gate (main)
$ cd ..

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate (dev)
$ git clone https://github.com/Gady-Hirwa-Ntwali/Git-Testing-Gate.git
Cloning into 'Git-Testing-Gate'...
remote: Enumerating objects: 3, done.
remote: Counting objects: 100% (3/3), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
Receiving objects: 100% (3/3), done.

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate (dev)
$ git checkut main
git: 'checkut' is not a git command. See 'git --help'.

The most similar command is
checkout

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate (dev)
$ git checkout main
error: pathspec 'main' did not match any file(s) known to git

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate (dev)
$ cd Testing-Git-Gate
bash: cd: Testing-Git-Gate: No such file or directory

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate (dev)
$ cd /Testing-Git-Gate
bash: cd: /Testing-Git-Gate: No such file or directory

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate (dev)
$ cd Git-Testing-Gate

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (main)
$ git checout dev
git: 'checout' is not a git command. See 'git --help'.

The most similar command is
checkout

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (main)
$ git fetch --all

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (main)
$ git branch
* main

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (main)
$ git checkout dev
branch 'dev' set up to track 'origin/dev'.
Switched to a new branch 'dev'

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (dev)
$ git checkout test
error: pathspec 'test' did not match any file(s) known to git

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (dev)
$ git fetech --all
git: 'fetech' is not a git command. See 'git --help'.

The most similar command is
fetch

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (dev)
$ git checkout test
error: pathspec 'test' did not match any file(s) known to git

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (dev)
$ git checkout -b test
Switched to a new branch 'test'

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (test)
$ git push -u origin test
Total 0 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
remote:
remote: Create a pull request for 'test' on GitHub by visiting:
remote:      https://github.com/Gady-Hirwa-Ntwali/Git-Testing-Gate/pull/new/test
remote:
To https://github.com/Gady-Hirwa-Ntwali/Git-Testing-Gate.git
* [new branch]      test -> test
  branch 'test' set up to track 'origin/test'.

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (test)
$ git chechkout dev
git: 'chechkout' is not a git command. See 'git --help'.

The most similar command is
checkout

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (test)
$ git checkout dev
M       README.md
Switched to branch 'dev'
Your branch is up to date with 'origin/dev'.

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (dev)
$ git branch -d test
Deleted branch test (was 00290d2).

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (dev)
$ git push origin --delete test
To https://github.com/Gady-Hirwa-Ntwali/Git-Testing-Gate.git
- [deleted]         test

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (dev)
$ git checkout -b ft/setup
Switched to a new branch 'ft/setup'

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ touch test.java

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git add .

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git add test.java

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git commit -m "add java file called test"
[ft/setup 72ce6e1] add java file called test
2 files changed, 33 insertions(+), 1 deletion(-)
create mode 100644 test.java

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git push
fatal: The current branch ft/setup has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin ft/setup

To have this happen automatically for branches without a tracking
upstream, see 'push.autoSetupRemote' in 'git help config'.


user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git push --set-upstream origin ft/setup
Enumerating objects: 6, done.
Counting objects: 100% (6/6), done.
Delta compression using up to 12 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (4/4), 842 bytes | 421.00 KiB/s, done.
Total 4 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
remote:
remote: Create a pull request for 'ft/setup' on GitHub by visiting:
remote:      https://github.com/Gady-Hirwa-Ntwali/Git-Testing-Gate/pull/new/ft/setup
remote:
To https://github.com/Gady-Hirwa-Ntwali/Git-Testing-Gate.git
* [new branch]      ft/setup -> ft/setup
  branch 'ft/setup' set up to track 'origin/ft/setup'.

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ echo "modify the test" >> test.java

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git stash
warning: in the working copy of 'test.java', LF will be replaced by CRLF the next time Git touches it
Saved working directory and index state WIP on ft/setup: 72ce6e1 add java file called test

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git stash apply
On branch ft/setup
Your branch is up to date with 'origin/ft/setup'.

Changes not staged for commit:
(use "git add <file>..." to update what will be committed)
(use "git restore <file>..." to discard changes in working directory)
modified:   README.md
modified:   test.java

no changes added to commit (use "git add" and/or "git commit -a")

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git stash list
stash@{0}: WIP on ft/setup: 72ce6e1 add java file called test

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git stash
Saved working directory and index state WIP on ft/setup: 72ce6e1 add java file called test

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git stash list
stash@{0}: WIP on ft/setup: 72ce6e1 add java file called test
stash@{1}: WIP on ft/setup: 72ce6e1 add java file called test

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git stash appy
fatal: subcommand wasn't specified; 'push' can't be assumed due to unexpected token 'appy'

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git stash apply stash{1}
error: stash{1} is not a valid reference

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git stash apply stash@{1}
On branch ft/setup
Your branch is up to date with 'origin/ft/setup'.

Changes not staged for commit:
(use "git add <file>..." to update what will be committed)
(use "git restore <file>..." to discard changes in working directory)
modified:   README.md
modified:   test.java

no changes added to commit (use "git add" and/or "git commit -a")

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git stash apply @{0}
fatal: '@{0}' is not a stash-like commit

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git stash apply stash @{0}
Too many revisions specified: 'stash' '@{0}'

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git stash apply stash@{0}
error: Your local changes to the following files would be overwritten by merge:
README.md
test.java
Please commit your changes or stash them before you merge.
Aborting
On branch ft/setup
Your branch is up to date with 'origin/ft/setup'.

Changes not staged for commit:
(use "git add <file>..." to update what will be committed)
(use "git restore <file>..." to discard changes in working directory)
modified:   README.md
modified:   test.java

no changes added to commit (use "git add" and/or "git commit -a")

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git stash list
stash@{0}: WIP on ft/setup: 72ce6e1 add java file called test
stash@{1}: WIP on ft/setup: 72ce6e1 add java file called test

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git add test.java

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git commit -m "modify test file"
[ft/setup 71bc1f9] modify test file
1 file changed, 3 insertions(+)

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git push
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 12 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 351 bytes | 117.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/Gady-Hirwa-Ntwali/Git-Testing-Gate.git
72ce6e1..71bc1f9  ft/setup -> ft/setup

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git status
On branch ft/setup
Your branch is up to date with 'origin/ft/setup'.

Changes not staged for commit:
(use "git add <file>..." to update what will be committed)
(use "git restore <file>..." to discard changes in working directory)
modified:   README.md

no changes added to commit (use "git add" and/or "git commit -a")

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git add README.md
git commit -m "Update README.md with new content"
git push
[ft/setup 6b7861d] Update README.md with new content
1 file changed, 10 insertions(+)
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 12 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 570 bytes | 570.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/Gady-Hirwa-Ntwali/Git-Testing-Gate.git
71bc1f9..6b7861d  ft/setup -> ft/setup

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git checkout main
Switched to branch 'main'
Your branch is up to date with 'origin/main'.

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (main)
$ touch teachme.java

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (main)
$ git add teachme.java

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (main)
$ git commit -m "add file to the main branch"
[main 02244e7] add file to the main branch
1 file changed, 0 insertions(+), 0 deletions(-)
create mode 100644 teachme.java

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (main)
$ git push
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 12 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 299 bytes | 299.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/Gady-Hirwa-Ntwali/Git-Testing-Gate.git
00290d2..02244e7  main -> main

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (main)
$ git checkout ft/setup
Switched to branch 'ft/setup'
Your branch is up to date with 'origin/ft/setup'.

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git merge main
Merge made by the 'ort' strategy.
teachme.java | 0
1 file changed, 0 insertions(+), 0 deletions(-)
create mode 100644 teachme.java

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git stash
Saved working directory and index state WIP on ft/setup: c28e8da Merge branch 'main' into ft/setup

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git stash apply
On branch ft/setup
Your branch is ahead of 'origin/ft/setup' by 2 commits.
(use "git push" to publish your local commits)

Changes not staged for commit:
(use "git add <file>..." to update what will be committed)
(use "git restore <file>..." to discard changes in working directory)
modified:   README.md

no changes added to commit (use "git add" and/or "git commit -a")

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git shash list
git: 'shash' is not a git command. See 'git --help'.

The most similar command is
stash

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git stash list
stash@{0}: WIP on ft/setup: c28e8da Merge branch 'main' into ft/setup
stash@{1}: WIP on ft/setup: 72ce6e1 add java file called test
stash@{2}: WIP on ft/setup: 72ce6e1 add java file called test

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git stash apply stash@{2}
error: Your local changes to the following files would be overwritten by merge:
README.md
Please commit your changes or stash them before you merge.
Aborting
On branch ft/setup
Your branch is ahead of 'origin/ft/setup' by 2 commits.
(use "git push" to publish your local commits)

Changes not staged for commit:
(use "git add <file>..." to update what will be committed)
(use "git restore <file>..." to discard changes in working directory)
modified:   README.md

no changes added to commit (use "git add" and/or "git commit -a")

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git add .

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git commit -m "merge main"
[ft/setup fcf0991] merge main
1 file changed, 1 deletion(-)

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git checkout main
Switched to branch 'main'
Your branch is up to date with 'origin/main'.

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (main)
$ git add README.md

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (main)
$ git commit -m "modify readme from main"
[main 4fdbb78] modify readme from main
1 file changed, 1 insertion(+), 1 deletion(-)

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (main)
$ git push
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 12 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 317 bytes | 105.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/Gady-Hirwa-Ntwali/Git-Testing-Gate.git
02244e7..4fdbb78  main -> main

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (main)
$ git checkout ft/setup
Switched to branch 'ft/setup'
Your branch is ahead of 'origin/ft/setup' by 3 commits.
(use "git push" to publish your local commits)

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git merge main
Auto-merging README.md
CONFLICT (content): Merge conflict in README.md
Automatic merge failed; fix conflicts and then commit the result.

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup|MERGING)
$ git add .

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup|MERGING)
$ git commit -m "resolve confict"
[ft/setup c548b80] resolve confict

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git push
Enumerating objects: 12, done.
Counting objects: 100% (12/12), done.
Delta compression using up to 12 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 789 bytes | 112.00 KiB/s, done.
Total 6 (delta 2), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (2/2), completed with 1 local object.
To https://github.com/Gady-Hirwa-Ntwali/Git-Testing-Gate.git
6b7861d..c548b80  ft/setup -> ft/setup

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)
$ git checkout dev
error: Your local changes to the following files would be overwritten by checkout:
README.md
Please commit your changes or stash them before you switch branches.
Aborting

user@LAPTOP-O0VE7N6D MINGW64 ~/Desktop/peer review/Git-Testing-Gate/Git-Testing-Gate (ft/setup)

   
   
   
  

  