#!/bin/sh

chmod u+x {{cookiecutter.name}}.groovy
mv {{cookiecutter.name}}.groovy ../

cd ..; rmdir {{cookiecutter.name}}
