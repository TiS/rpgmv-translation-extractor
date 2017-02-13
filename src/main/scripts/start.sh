#!/bin/bash
echo @jar.name@
java -jar "$(cd "$(dirname "$0")"; pwd)/${jar.name}.jar" $@