.PHONY: validate
validate:
	docker compose run --rm liquibase liquibase validate --changelog-file=changelog-root.yaml

.PHONY: update
update:
	docker compose run --rm liquibase liquibase update --changelog-file=changelog-root.yaml
