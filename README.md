# Bryan Kao Grainger Interview 2026-10-17
## Prerequisites
Ensure you have the following installed:
- Docker Desktop
- Node.js 26
- JDK 25

## Getting Started
### Database
#### Start the database
```bash
make db-start
```

#### Migrate
```bash
make db-migrate
```

### Start the backend
```bash
make backend-start
```

### Start the frontend
```bash
make frontend-start
```

### Try it out!
1. Navigate to http://localhost:5173 in your browser
2. Type in a new product name into the input field.  Click "Create Product".
3. Verify that the new product is displayed.

## Running Tests
### Run it all
```bash
make test
```

### Backend tests only
```bash
make backend-test
```

### Frontend tests only
```bash
make frontend-test
```
