//
// $Header: /home/due1/cvsreps/due/java/pattern/proxy/MapProxy.java.templ,v 1.1 2003-05-06 09:35:04 due Exp $
//
// Copyright (c) 2001 by Eric Dubuis,
// BFH, HTA Biel-Bienne.
// All rights reserved.


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;

public class MapProxy implements AbstractMap {

    private AbstractMap realMap;

    public MapProxy(String fileName)
    {
        // COMPLETE
        this.realMap = new Map (fileName);

    }

    public String find(String key) throws Exception
    {
        String file = (String) hashtable.get(key);
        if (file.isEmpty()) {
            throw new Exception("File is empty");
        }

        return key;
    }

    public void add(String key, String value) throws Exception
    {

        hashtable.put(key, value);
        String newKey = (String) hashtable.get(key);
        if (newKey.isEmpty()) {throw new Exception("Fail to add");}
        else { System.out.println("Added successfully");}




        // COMPLETE
    }

    private Map getMap() {
	    if (map == null) {
	     map = new Map(fileName);
	    } // end of if (map == null)
	    return map;
    }

    private String get(String key) {
	    return (String) hashtable.get(key);
    }

    private void put(String key, String value)
    {
	    hashtable.put(key, value);
    }

    private String fileName;
    private Map map = null;
    private HashMap hashtable = new HashMap();
}
