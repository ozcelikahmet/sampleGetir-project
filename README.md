# sampleGetir-project

How to run the project?
- First way:
"mvn test" command executes the "TestRunner" class.
- Second way:
Run the "TestRunner" class.

How to run specific scenerio?
1. Write specific tag to scenerio in feature file.
2. Update "tags" option in "TestRunner" class.
3. Apply how to run the project steps above.

Notes:
- "configuration.properties" stores android emulator and setup details:
1. waitOptionsDuration=1 -> It helps to manage wait time as one second for actions.
2. apkAppPath=src/test/java/apps/sampleGetir.apk -> It stores application path. 
3. deviceName=androidEmulator -> It is android emulator name.
4. platformName=android -> It is android emulator platform name.

- "bug-reports" file stores details for the bugs.
