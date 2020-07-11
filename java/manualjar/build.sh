#!/bin/sh

SRC_ROOT=src
BUILD_ROOT=build
MAIN_CLASS=sv.demo.manualjar.App


SRC_PATH=$SRC_ROOT/main/java/sv/demo/manualjar

SRC_FILES=$SRC_PATH/App.java
CLASS_DIR=$BUILD_ROOT/classes/java/main

JAR_DIR=$BUILD_ROOT/libs
JAR_FILE=manualjar.jar

rm -fr $BUILD_ROOT
javac -d $CLASS_DIR $SRC_FILES
mkdir -p $JAR_DIR
jar --create --file $JAR_DIR/$JAR_FILE --main-class $MAIN_CLASS -C $CLASS_DIR/ .
