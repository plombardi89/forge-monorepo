FROM openjdk:8 as runtime
MAINTAINER Datawire <dev@datawire.io>
LABEL PROJECT_REPO_URL         = "git@github.com:datawire/kubernaut.git" \
      PROJECT_REPO_BROWSER_URL = "https://github.com/datawire/kubernaut" \
      DESCRIPTION              = "Datawire Kubernaut" \
      VENDOR                   = "Datawire, Inc." \
      VENDOR_URL               = "https://datawire.io/"

WORKDIR /srv
COPY    . .
RUN     ./gradlew :web:test :web:shadowJar

ENTRYPOINT ["web/src/shell/entrypoint.sh"]
