# Custom JavaFX & Other Utilities
The library consists of package utilities/tools to speed up develoopment.
This repository contains three main packages & a JAR file containing all of the packages:
  - JavaFXUtils
  - DebugUtils
  - ImportUtils
  - CustomUtilities



## Installation
This is how to build the repository step-by-step
  ### Method #1 (For IntelliJ users)
  1. Go to ```File -> Project Structure -> Artifacts -> Add JAR -> From modules with dependencies```
  2. Go to ```Build -> Build Artifacts```
  ### Method #2 (For Eclipse users)
  1. Go to ```File -> Export -> Java -> JAR file```
  ### Method #3 (Terminal)
  Make sure you are in the root folder (src) before entering this in your IDE's terminal
  ~~~
  javac -d out/production MyProject/src/**/*.java
  ~~~
  You can rename the JAR file to whatever you want
  ~~~
  jar cf RenameThis.jar -C out/production .
  ~~~



## Usage
This is how to add the JAR file to your IDE (For other IDE's refer to google how to import external libraries :> )
  ### IntelliJ IDEA
  1. Go to the top menu and select:```File -> Project Structure -> Libraries -> From modules with dependencies```
  2. Click the ```+``` button -> choose JARs or Directories.
  3. Select the JAR file
  4. Click **Apply** and **OK**
  ### Eclipse
  1. Right click your project folder
  2. Select:```Build Path -> Configure Build Path```
  3. Go to the **Libraries** tab
  4. Click **Add** **External** **JARs**
  5. Choose the JAR file
  6. **Apply** and **Close**

Next step is to import the package similar to how you usually import Java packages
