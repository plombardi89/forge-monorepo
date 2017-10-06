FROM openjdk:8 as runtime
MAINTAINER Datawire <dev@datawire.io>
LABEL PROJECT_REPO_URL         = "git@github.com:datawire/kubernaut.git" \
      PROJECT_REPO_BROWSER_URL = "https://github.com/datawire/kubernaut" \
      DESCRIPTION              = "Datawire Kubernaut" \
      VENDOR                   = "Datawire, Inc." \
      VENDOR_URL               = "https://datawire.io/"

WORKDIR /srv
COPY    . .
RUN     ./gradlew :frontend:test :frontend:shadowJar

ENTRYPOINT ["frontend/src/main/shell/entrypoint.sh"]
