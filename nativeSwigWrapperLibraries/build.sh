#!/usr/bin/env bash

set -e

rm -r ../fmod-jni-jar/java_generated_src || true
mkdir ../fmod-jni-jar/java_generated_src
mkdir ../fmod-jni-jar/java_generated_src/org
mkdir ../fmod-jni-jar/java_generated_src/org/fmod
mkdir ../fmod-jni-jar/java_generated_src/org/fmod/jni

rm -r c_jni_wrapper || true
mkdir c_jni_wrapper

swig -java -outdir ../fmod-jni-jar/java_generated_src/org/fmod/jni -package org.fmod.jni -o "c_jni_wrapper/fmod_wrap.c" fmodjni.i

rm -r linux_clion/build || true
mkdir linux_clion/build
cd linux_clion/build
cmake ..
cmake --build .