Simple Impala Java UDF Example.

After building the jar (mvn compile) copy the jar into a HDFS directory (e.g. copied the jar into /user/cloudera/udfs/impala-udf.jar)

Open an impala-shell and create a custom UDF using below command,

[master.skpabba.com:21000] > create function hello(string) returns string location '/user/cloudera/udfs/impala-udf.jar' symbol='com.skpabba.udf.MyUDF';
Query: create function hello(string) returns string location '/user/cloudera/udfs/impala-udf.jar' symbol='com.skpabba.udf.MyUDF'

Returned 0 row(s) in 0.01s

Below is how you can test the UDF,

[master.skpabba.com:21000] > select hello('sean');
Query: select hello('sean')
+-----------------------+
| default.hello('sean') |
+-----------------------+
| Hello sean            |
+-----------------------+
Returned 1 row(s) in 0.16s

