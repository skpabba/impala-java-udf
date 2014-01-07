package com.skpabba.udf;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

/**
 * Created with IntelliJ IDEA.
 * User: spabba
 * Date: 12/11/13
 * Time: 2:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyUDF extends UDF {

    public MyUDF(){

    }

    public Text hello (Text args) {
        return evaluate(args);
    }

    public Text evaluate (Text args) {

        if (args != null) {
            return new Text("Hello " + args);
        } else {
            return new Text("Hello World !!");
        }
    }
}
