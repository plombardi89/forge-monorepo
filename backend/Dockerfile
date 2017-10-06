FROM openjdk:8 as runtime
MAINTAINER Datawire <dev@datawire.io>
LABEL PROJECT_REPO_URL         = "git@github.com:datawire/kubernaut.git" \
      PROJECT_REPO_BROWSER_URL = "https://github.com/datawire/kubernaut" \
      DESCRIPTION              = "Datawire Kubernaut" \
      VENDOR                   = "Datawire, Inc." \
      VENDOR_URL               = "https://datawire.io/"

ENV TERM=dumb

WORKDIR /srv
COPY    . .
RUN     ./gradlew :backend:test :backend:shadowJar

ENTRYPOINT ["backend/src/main/shell/entrypoint.sh"]
