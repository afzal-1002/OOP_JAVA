
1. Download and unpack the JDK into your home folder
mkdir -p "$HOME/java"
cd "$HOME/java"

wget -O jdk.tar.gz \
  "https://api.adoptium.net/v3/binary/latest/21/ga/linux/x64/jdk/hotspot/normal/eclipse"

tar -xzf jdk.tar.gz

rm jdk.tar.gz

JDK_DIR=$(find "$HOME/java" -maxdepth 1 -type d -name "jdk-*" | head -n 1)

echo "$JAVA_HOME"

export JAVA_HOME="/nfs/homes/cgatabaz/java/jdk-21.0.12.1+1"
export PATH="$JAVA_HOME/bin:$PATH"

echo "$JAVA_HOME"



VS Code doesn't understand Java out of the box -- one extension pack adds it all: syntax highlighting, debugging, and a Run button.
Open VS Code and click the Extensions icon in the left sidebar -- the one that looks like four squares.
Search for "Extension Pack for Java" and install the one published by Microsoft.



Open VS Code :
Click the Extensions icon on the left (the four squares).
Search for Extension Pack for Java.
Install the extension published by Microsoft.


git clone https://github.com/afzal-1002/OOP_JAVA


$ git clone <your-repo-url>   # or unzip the .zip
$ cd */src/main/java
$ javac *.java
$ java Main
 
