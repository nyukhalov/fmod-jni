# fmod-jni
Cross-platform Java JNI wrapper for the FMOD audio library. Experimental and Incomplete. Apache 2 License.

The goal of this project is to make the FMOD Studio audio engine available to Java code. This project is in support of my indie game, Wildermyth (http://wildermyth.com/) but you are welcome to use it for whatever, or suggest improvements. Wildermyth is under active development and I expect this API to expand and harden over time to meet the audio needs of the game.

My intention is to support the FMOD Studio workflow where an audio designer works on a project in FMOD studio, and a game programmer works in Java, loading banks, calling events, setting parameters etc. for the FMOD project to consume. So the portion of the API that's concerned with that workflow will be my top priority.

##About FMOD
FMOD Studio is a cross-platform 3D audio engine and designer tool for games.

http://www.fmod.org/

* It is not free (but it does have a free license for individuals and small projects) 
* This repo does not include FMOD Studio itself, just the JNI bindings to it.
* I am not affiliated with FMOD or Firelight Technologies.

To use FMOD with this project you will need to download the FMOD Studio API (tested with version 1.08.04)

## Status
Usable for basic use cases. I'm currently using it to load banks and play sounds, and if that's what you need, this will work. 

* Loading Banks
* Setting the Listener 3d attributes
* Playing 3D sounds with all parameters
* Playing global sounds with parameters
* Triggering Cues
* Live Sessions side-by-side with the FMOD Studio tool.

The nice api is highly incomplete, but the bulk of the FMOD api is covered with a gross raw api that maps directly to the FMOD C API. You can use these bindings if you need something advanced.

## Platforms
* Win64 - working.
* Mac - working.
* Win32 - untested but should work. If not please let me know.

FMOD supports additional platforms (i.e. Linux), and it should be straightforward to generate the dynamic libraries you need. If you do this, send me a pull request with your setup so I can incorporate it.

## Usage
To play sound using FMOD from Java, you will need to build the fmod-jni.jar file, because this repo does not contain the necessary FMOD native libraries.
* You will need to download the FMOD Studio api for your platform(s).
* You will need to build the fmod-jni dynamic libs for your platform. I've included the debug logging dlls for windows and mac, but other platforms are up to you for now. Generating the DLL is fairly simple, you should read the SWIG documentation to get an idea of what it's all about. There's a visual studio express project to reference as well.
* put the FMOD dynamic libs in the fmod_runtimes directory. The windows dlls I created bind to the logging version of the FMOD dlls, so for windows you will put these files in the runtimes folder:
  * fmodL.dll
  * fmodL64.dll
  * fmodstudioL.dll
  * fmodstudioL64.dll
* Build the fmod-jni jar. There's an ant build file in the folder, it was generated by IntelliJ and it should work for building the jar. The jar wraps all of the native dlls and will extract and load them at runtime, so you don't need to manage that. The code is written to be cross platform but is only tested on win64 and mac, and of course you will need to supply all the dynamic libs for your target platform and build them into the jar.
 
From your code:
* depend on fmod-jni.jar
* Call FMOD.loadNatives() first. This will return true if it can load the dynamic libraries.
* Call FMOD apis, starting with e.g. FmodStudioSystem.create()

TODO: Right now the API you will use is spread between the generated source and the api source. In the future it would be good to create a clear distinction so that Java users don't have to worry about the jni internals. There are potentially some performance trade-offs as well.

##Approach
The goal of this project is to be an idiomatic Java implementation of the FMOD Studio and Low Level API. The Java API defines the same classes and functions that the C++ api defines. We want the integration to be as "turnkey" as possible, so we're binding all of the fmod native libraries into our jar and loading them at runtime. In this way consumers need only link the fmod-jni.jar file and call FMOD.loadNatives() in order to use fmod. (However because we don't include FMOD Studio in this repo, you must download it yourself and build the jar before you can use it.) 

### Omissions and Deviations

The main (only real) difference is that I've elected not to return FMOD_RESULT from every api call, instead I'm returning objects and values directly. Since Java can't easily return values via function arguments, this is much cleaner. The FMOD_RESULT is accessible via a getLastResult call on each API Object, and you can optionally define a callback to handle them inline. So no functionality is lost.

The first version is going to be missing some things:
* The DSP api for defining your own DSP. Just do it in C if you need it.
* The Callback apis (These are definitely possible to implement, but are low priority for me)
* The loadFromMemory apis (you need these for your java game?)

### SWIG
Under the hood, I'm using SWIG (http://www.swig.org/) to generate Java JNI bindings around the FMOD C (not C++) api. I chose the C api for maximum portability(?), and hey, they're functionally identical so it shouldn't matter. Then on the Java side, I've stubbed out the API classes and am in the process of filling in an idiomatic Java API to FMOD.

A lot of the code SWIG generates is pretty ugly, and the current setup puts several layers between the application and FMOD. I'm not terribly happy with that but it seems like the fastest path forward for now. A more mature implementation might write more JNI code by hand in order to reduce overhead.

The bindings here were generated with Swig 3.0.9

## Building, Contributing
If you wish to build your own native wrapper libs, or change/extend the swig wrapper, see `nativeSwigWrapperLibraries/README.md` for details. There's a lot that can be done here, including smarter bindings, supporting more of the FMOD API, and supporting more platforms.

If you want to improve the Java API, you don't need to run swig or mess with the natives, unless you want to change something in the generated code.

## Roadmap and TODO
* I'd like to eliminate unnecessary memory allocation in the java api. 
  * Right now we allocate single-element arrays in many functions in order to retrieve values. These arrays could just live on the API objects, or pooled. We maybe need to make a decision about thread safety for this.
  * Pool our API objects (EventDescription! EventInstance!) to avoid garbage collection hitches. Get our new calls down to zero when just playing sounds that are already loaded.
* I want Vectors in particular to be more idiomatic. It should be possible to use SWIG %extend to do this, right? (So that we don't need yet another java object layer.)
* Build out more of the API and make it nicer.. what's our priority? What will actually be used?
* Debug/Release support. Right now we are using debug wrapper libraries and we are hard-coded to use the fmod logging runtimes. This is not ideal for release builds. We want some sort of build-level switch? Two jar targets?

## License
Copyright 2015-2019 Nate Austin

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
