#!/usr/bin/env bash

set -e

mkdir -p ../fmod-jni-jar
mkdir -p ../fmod-jni-jar/java_generated_src
mkdir -p ../fmod-jni-jar/java_generated_src/org
mkdir -p ../fmod-jni-jar/java_generated_src/org/fmod
mkdir -p ../fmod-jni-jar/java_generated_src/org/fmod/jni

mkdir -p c_jni_wrapper

swig -java -outdir ../fmod-jni-jar/java_generated_src/org/fmod/jni -package org.fmod.jni -o "c_jni_wrapper/fmod_wrap.c" fmodjni.i