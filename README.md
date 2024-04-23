# Ant Build
In this project we will show how to set up the ant build.

## asbuild.config.xml

Define the ant config inside the asbild.config.xml:

```xml
<property name="actifsource.version" value="10.10.0.202005121415" />
<property name="bundle.directory" value="D:\Eclipse\eclipse-rcp-oxygen-3a-win32-x86_64\eclipse\plugins" />
<property name="ant.workspace" value="${basedir}/.." />
<property name="ant.project" value="${ant.workspace}/ch.actifsource.example.ant" />
<property name="junit.test.report" value="${ant.project}/reports" />
```

## Run Ant
![Diagram](images/runant.png)

* The ant script 'asbuild.unittest.xml' is used to execute the junit test. 

## Export Ant to Generate BuildConfig
![Diagram](images/exportant2.png)

![Diagram](images/exportant1.png)

![Diagram](images/exportant3.png)


## Export Ant to Validate Project

The corresponding Ant file can be generated automatically via Project Explorer 'Export->Actifsource->Ant BuildFiel Export':

![exportant-validation-1](images/exportant-validation-1.png)

![exportant-validation-2](images/exportant-validation-2.png)

The validator can now be configured using the exceptiontype, validationproperty and validationfilepath properties.

- exceptiontype: Defines the error types that must occur for the target to produce an exception which stops the build.
- validationproperty: All errors that occur (error, warning or info) are written to this property, which can be used in the antscript.
- validationfilepath: All errors that occur (error, warning or info) are exported to this file. 
    
See 'asbuild.dynamic.loading.compile_validate_generate.xml'


## Export Ant to Compile Project

The corresponding Ant file can be generated automatically via Project Explorer 'Export->Actifsource->Ant BuildFiel Export':

![exportant-compilation-1](images/exportant-compilation-1.png)

The Ant file now contains the following two essential targets:

1. export-classpath

This target can be used to collect the class path of a project, which is required to compile the project:

![exportant-compilation-2](images/exportant-compilation-2.png)

The export dependency can now be configured with the following properties:

- classpathproperty: The project classpath is written to the property and can be used in the antscript.  
- classpathseparator: The ClassPath separator (default ;) can be customized .
- classpathfile: The project classpath is written to the file.  

![exportant-compilation-4](images/exportant-compilation-4.png)


- classpathmapproperty: The Project ClasspathMap is written to the property and can be used in the antscript.    
- classpathmapfile: The Project ClasspathMap is written to the file.  

![exportant-compilation-5](images/exportant-compilation-5.png)

- dependencytreeproperty: The project dependencytree is written to the property and can be used in the antscript.    
- dependencytreefile: The project dependencytree is written to the file.

![exportant-compilation-6](images/exportant-compilation-6.png)


2. compile-project

The project can now be compiled using this target:

The 'classpathproperty' property from the 'export-classpath' target is used for the ClassPath.

![exportant-compilation-3](images/exportant-compilation-3.png)


## Requirements
Actifsource Workbench Enterprise Edition

## License
[http://www.actifsource.com/company/license](http://www.actifsource.com/company/license)
