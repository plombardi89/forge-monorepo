FROM openjdk:8-jdk-slim as runtime
MAINTAINER Datawire <dev@datawire.io>
LABEL PROJECT_REPO_URL         = "git@github.com:datawire/forge-jdk-multimodule.git" \
      PROJECT_REPO_BROWSER_URL = "https://github.com/datawire/forge-jdk-multimodule" \
      DESCRIPTION              = "Datawire Forge multi-module JDK example" \
      VENDOR                   = "Datawire, Inc." \
      VENDOR_URL               = "https://datawire.io/"

ENV TERM=dumb

WORKDIR /srv
COPY    . .
RUN     ./gradlew :backend:test :backend:shadowJar

ENTRYPOINT ["backend/src/main/shell/entrypoint.sh"]
