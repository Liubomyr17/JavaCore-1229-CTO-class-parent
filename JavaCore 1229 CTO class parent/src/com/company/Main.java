package com.company;

/*

1229 Parent of the CTO class
Add such a parent class to the CTO (CTO) class so that the class ceases to be abstract.
Adding / implementing methods in the CTO class is forbidden.

Requirements:
1. The Solution class must contain the Businessman interface with the void workHard () method.
2. The Solution class must contain a non-abstract CTO class.
3. The CTO class must implement the Businessman interface.
4. The CTO class must not contain methods.
5. The Solution class must contain an additional class.
6. The CTO class must inherit from the additional class.
7. An additional class must contain one method.



 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class Test implements Businessman {
        @Override
        public void workHard() {

        }
    }
    public static class CTO extends Test implements Businessman {

    }
}




