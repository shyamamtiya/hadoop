mv /root/NetBeansProjects/Hadoop_installation2/jdk1.8.0_91 /opt/jdk8
alternatives --install /usr/bin/java java /opt/jdk8/bin/java 2
echo "$1" | alternatives --config java  --stdin
alternatives --install /usr/bin/jar jar /opt/jdk8/bin/jar 2
alternatives --install /usr/bin/javac javac /opt/jdk8/bin/javac 2
alternatives --set jar /opt/jdk8/bin/jar
alternatives --set javac /opt/jdk8/bin/javac
export JAVA_HOME = /opt/jdk8
export JRE_HOME = /opt/jdk8
export PATH = $PATH:/opt/jdk8/jre/bin
