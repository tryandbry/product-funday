.PHONY: db-validate
db-validate:
	docker compose run --rm liquibase liquibase validate --changelog-file=changelog-root.yaml

.PHONY: db-migrate
db-migrate:
	docker compose run --rm liquibase liquibase --hub-mode=off update --changelog-file=changelog-root.yaml

.PHONY: db-start
db-start:
	docker compose up -d db

.PHONY: db-down
db-down:
	docker compose down db

.PHONY: backend-start
backend-start:
	cd backend && ./gradlew bootRun

.PHONY: backend-test
backend-test:
	cd backend && ./gradlew test

.PHONY: backend-build
backend-build:
	cd backend && ./gradlew build

.PHONY: frontend-install
frontend-install:
	cd frontend && npm ci

.PHONY: frontend-start
frontend-start:
	cd frontend && npm run dev

.PHONY: frontend-test
frontend-test:
	cd frontend && npm test

.PHONY: frontend-build
frontend-build:
	cd frontend && npm run build

.PHONY: test
test: backend-test frontend-test

.PHONY: build
build: backend-build frontend-build

.PHONY: start
start: backend-start frontend-start
