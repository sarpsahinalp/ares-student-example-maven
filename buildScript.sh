#!/usr/bin/env bash
set -e

maven () {
  echo '⚙️ executing maven'
  mvn clean
  mvn package -DskipTests
  mvn test
}

main () {
  maven
}

main "${@}"