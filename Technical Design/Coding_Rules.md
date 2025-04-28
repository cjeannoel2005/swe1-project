# Java Project Coding Guidelines

## 1. Naming Conventions
- **Classes**: `camelCase` (e.g., `shoppingCart`)
- **Methods**: `camelCase` (e.g., `calculateTotal`)
- **Variables**: `camelCase` (e.g., `itemPrice`)

## 2. File Organization
- Clear, descriptive names (no unnecessary abbreviations)
- One class per file (match filename to class name)

## 3. Git Practices
- Commit small, logical changes
- Write clear commit messages (e.g., "Fix cart total calculation")
- Sync with team before major changes

## 4. Code Structure
- Keep methods small and focused
- Break complex logic into helper methods
- stay away from  deep nesting (max 2-3 levels)

## 5. Comments
- Class header: Brief purpose description
- Method comments: Explain what it does (not how)
- Important logic: Short clarifying comments

## 6. Code Quality
- No duplicate code (reuse methods)
- Validate all user inputs
- Remove unused code
- Test thoroughly before pushing

## 7. Error Handling
- Check for null values
- Handle exceptions properly
- Provide meaningful error messages
