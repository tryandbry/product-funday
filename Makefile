.PHONY: db-validate
db-validate:
	docker compose run --rm liquibase liquibase validate --changelog-file=changelog-root.yaml

.PHONY: db-migrate
db-migrate:
	docker compose run --rm liquibase liquibase update --changelog-file=changelog-root.yaml

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

.PHONY: frontend-start
frontend-start:
	cd frontend && npm run dev

.PHONY: frontend-test
frontend-test:
	cd frontend && npm test

.PHONY: test
test: backend-test frontend-test
