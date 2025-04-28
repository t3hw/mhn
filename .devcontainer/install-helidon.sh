#!/usr/bin/env bash

# if helidon already installed, exit
if command -v helidon &> /dev/null
then
    echo "helidon already installed"
    exit 0
fi

pwd
# install helidon
curl -L -O https://helidon.io/cli/latest/linux/helidon > /tmp/helidon
if [ $? -ne 0 ]; then
    echo "Failed to download helidon"
    exit 1
fi

chmod +x ./helidon
sudo mv ./helidon /usr/local/bin/
helidon version