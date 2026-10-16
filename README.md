# Product Funday
## Table of Contents
- [Product Funday](#product-funday)
  - [Table of Contents](#table-of-contents)
  - [Prerequisites](#prerequisites)
  - [Quick Start](#quick-start)
  - [Basic use instruction](#basic-use-instruction)
  - [Database setup](#database-setup)
    - [Start the database](#start-the-database)
    - [Migrate](#migrate)
  - [Build, Test, and Run command](#build-test-and-run-command)
    - [Install dependencies](#install-dependencies)
    - [Build](#build)
      - [Build it all](#build-it-all)
      - [Backend build only](#backend-build-only)
      - [Frontend build only](#frontend-build-only)
    - [Tests](#tests)
      - [Test it all](#test-it-all)
      - [Backend tests only](#backend-tests-only)
      - [Frontend tests only](#frontend-tests-only)
    - [Run](#run)
      - [Run it all](#run-it-all)
      - [Start the backend](#start-the-backend)
      - [Start the frontend](#start-the-frontend)


## Prerequisites
Ensure you have the following installed:
- Docker Desktop
- Node.js 26
- JDK 25

Ensure Docker Desktop is running.

## Quick Start

```bash
# start the database
make db-start
# migrate the database
make db-migrate
# install frontend dependencies
make frontend-install
# start the frontend and backend dev servers
make -j2 start
```

## Basic use instruction
1. Navigate to http://localhost:5173 in your browser
2. Type in a new product name into the input field.  Click "Create Product".
3. Verify that the new product is displayed.

## Database setup
### Start the database
```bash
make db-start
```

### Migrate
```bash
make db-migrate
```

## Build, Test, and Run command
### Install dependencies
```bash
make frontend-install
```

### Build
#### Build it all
```bash
make -j2 build
```

#### Backend build only
```bash
make backend-build
```

#### Frontend build only
```bash
make frontend-build
```

### Tests
#### Test it all
```bash
make -j2 test
```

#### Backend tests only
```bash
make backend-test
```

#### Frontend tests only
```bash
make frontend-test
```

### Run
#### Run it all
```bash
make -j2 start
```

#### Start the backend
```bash
make backend-start
```

#### Start the frontend
```bash
make frontend-start
```
