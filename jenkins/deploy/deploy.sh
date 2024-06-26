!#bin/bash

echo "********************"
echo "** Deploy image ***"
echo "********************"

echo "** Logging in ***"
docker login -u phatijava -p $DOCKER_HUB_PASSWORD

echo "*** Pull docker image image ***"
docker pull phatijava/$IMAGE:$RELEASE_VERSION

docker kill test
docker rm test


echo "*** Run image ***"
