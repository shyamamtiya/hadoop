mv /root/NetBeansProjects/Hadoop_installation2/hadoop-2.6.0 /home/hadoop/hadoop
chmod -R 777 /home/hadoop
mkdir -p /home/hadoop/hadoop_tmp/hdfs/namenode/
mkdir -p /home/hadoop/hadoop_tmp/hdfs/datanode/
chown hadoop:hadoop -R /home/hadoop/hadoop_tmp/