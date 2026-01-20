# Number Guessing Game – Git & GitHub Team Workflow

## Branch Structure (Initial State)
- main: Stable production branch
- dev: Integration branch for completed features
- feature1: Feature branch merged using merge workflow
- feature2: Feature branch updated using rebase workflow
- feature3: Feature branch with multiple commits that were squashed
- hotfix: Urgent fix branch intended for main
- documentation: Documentation and learning summary

## Branch Changes Summary
- feature1: Added functionality that conflicted with dev and required a merge conflict resolution.
- feature2: Contained multiple commits and was rebased onto dev to keep history linear.
- feature3: Implemented a hint system with messy commits that were squashed into one clean commit.
- hotfix: Included a single fix that was cherry-picked into main and then merged into dev.
- dev: Integrated all features with a clean and readable commit history.
- documentation: Contains project documentation and Git workflow learning summary.

## Learning Summary

### Merge vs Rebase vs Squash vs Cherry-pick
- **Merge** preserves branch history and shows where work came from.
- **Rebase** rewrites history to create a linear commit log.
- **Squash** combines multiple commits into one clean commit before merging.
- **Cherry-pick** applies a single specific commit to another branch.

### Observations
- feature1 used merge and preserved branch structure.
- feature2 used rebase and required resolving conflicts commit-by-commit.
- feature3 was squashed into a single commit before rebasing, making conflict resolution easier and history cleaner.

### When to Use Each
- Use **merge** for shared branches.
- Use **rebase** when working alone to keep history clean.
- Use **squash** before merging feature branches into dev.
- Use **cherry-pick** for urgent fixes that must go directly into main.

