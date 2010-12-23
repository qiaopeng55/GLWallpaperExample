GLWallpaperExample
==================
A sample live wallpaper that uses GLWallpaperService to create OpenGL graphics.


Project Setup
-------------
Install Eclipse, the Android SDK, and Git. Follow the instructions provided by those software projects.


Download the code
-----------------
You can download the code using git or by getting a zip file. 

Go to your folder where you plan to put all the files related to this project.
Unzip the code to this folder. Or, if you're using git, execute this command
    git clone git://github.com/markfguerra/GLWallpaperExample.git


Create your Eclipse workspace
-----------------------------
In any place that makes sense to you, make a folder to hold your workspace. Here we'll call it workspace\

Open Eclipse and choose the workspace\ folder you just created.
Click the Arrow to go to the workbench.

To set up the Android SDK for this project:
In the menu, go to Eclipse->Preferences. Go to the Android section.
Give it the location of your Android SDK folder. Give it a minute to figure things out, then click Ok.


Import the code into the workspace
----------------------------------
In the menu, go to File -> Import
In the dialog, choose General->"Existing Projects Into Workspace". Click Next

Under Select Root Directory, browse to the GLWallpaperExample\ folder. Do not check "Copy Projects into Workspace", as we want the source code to stay where it is. Click Finish.
The code will now be in your workspace.


Build for the first time
------------------------
When you first start out, you will probably have build errors. Here is how you fix them.
Right-click on the "GLWallpaperExample" project in the Package Explorer. Select "Android Tools"-> "Fix Project Properties"
In the menu, click on Project-> Clean.
Your errors should go away at this point.
