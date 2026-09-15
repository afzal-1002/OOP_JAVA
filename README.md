# Student Enrollment System — OOP Demo Project

A small, fully runnable Java project that demonstrates every concept from
the slide deck on the same set of classes: `Person`, `Student`,
`Instructor`, `Project`, `Enrollable`, `Gradable`.

## Files

| File            | Demonstrates |
|-----------------|--------------|
| `Person.java`      | Abstract class, abstract method |
| `Enrollable.java`  | Interface (abstraction, contract) |
| `Gradable.java`    | A second, independent interface |
| `Project.java`     | Basic encapsulation |
| `Student.java`     | Inheritance + interface implementation + encapsulation |
| `Instructor.java`  | Inheritance + a different interface |
| `Main.java`        | Everything running together |

## 1. Install Java (Ubuntu)

Skip this section if `java -version` and `javac -version` already print a
version number.

**No sudo access?** Download a JDK straight into your own home folder —
nothing outside your account changes:

```bash
# Download a JDK build into your home folder
mkdir -p ~/java
curl -L -o ~/jdk.tar.gz \
  "https://api.adoptium.net/v3/binary/latest/21/ga/linux/x64/jdk/hotspot/normal/eclipse"

# Unpack it -- no sudo, it's all inside ~/java
tar -xzf ~/jdk.tar.gz -C ~/java --strip-components=1

# Add it to PATH permanently
echo 'export JAVA_HOME=$HOME/java' >> ~/.bashrc
echo 'export PATH=$JAVA_HOME/bin:$PATH' >> ~/.bashrc
source ~/.bashrc

# Confirm
java -version
javac -version
```

**Have sudo?** This does the same thing in one line:

```bash
sudo apt update
sudo apt install openjdk-21-jdk -y
```

## 2. Get the project

Either clone it from your own Git repository, or unzip the file that came
with the slide deck:

```bash
# Option A -- clone your repo
git clone <your-repo-url>
cd <your-repo-folder>/src

# Option B -- unzip the provided file
unzip StudentEnrollmentSystem-Java.zip
cd StudentEnrollmentSystem-Java/src
```

## 3. Compile and run

From inside the `src` folder:

```bash
javac *.java
java Main
```

## Expected output

```
== Creating objects from classes ==

== Encapsulation: valid vs invalid data ==
Rejected: Age must be positive
Ana is 20 years old

== Abstraction: enroll through the interface ==
Ana enrolled in Capstone

== Reference type vs. object type ==
Ana is a Student (age 20)

== Polymorphism: one call, many behaviors ==
Ana is a Student (age 20)
Mr. Lee is an Instructor

== Grading (Gradable) ==
Mr. Lee grades Ana on Capstone: 95/100
```

## Try this live in class

- Open `Main.java` and uncomment `// p.enroll(capstone);` to show the class
  the exact compile error caused by the reference-type rule.
- Change `ana.setAge(-5)` to a positive number and re-run, to show the
  encapsulation guard letting valid data through.
- Add a new class, e.g. `TeachingAssistant extends Person`, and call it from
  the `people` list in `Main` to show polymorphism handling it automatically.
