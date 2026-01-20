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

