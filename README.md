# Git-Testing-Gate
1. 1. Initialize the project locally using a name of your choice and configure Git properly.
   Ensure the default branch follows best practices

   git init Git-Testing-Gate

2. Create a remote repository on GitHub and link it to your local project.

   git clone https://github.com/Gady-Hirwa-Ntwali/Git-Testing-Gate.git

3. Create a new branch named dev, switch to it, and push it to the remote repository
   git checkout -b dev
   git push -u origin dev

4. From the dev branch, create another branch named test.
   After confirming, it works correctly, switch back to dev and delete the test branch locally and remotely using safe deletion commands.
   git checkout -b test
   Switched to a new branch 'test'
   git push -u origin test
   git checkout dev
   git branch -d test
   Deleted branch test (was 00290d2).
   git push origin --delete test
5. Create a feature branch named ft/setup from dev
   git checkout -b ft/setup
   Switched to a new branch 'ft/setup'
6. Add a new file called test.java, include meaningful placeholder logic or comments, stage it, and commit using a well-structured commit message.
   touch test.java
   git add test.java
   git commit -m "add java file called test"
   git push --set-upstream origin ft/setup
7. Modify files and temporarily save the changes using Git stash.
   echo "modify the test" >> test.java
   git stash
8. Restore a specific stashed change using its stash index and confirm the changes are correctly reapplied.
   git stash apply stash@{0}
   
   
   
  

  