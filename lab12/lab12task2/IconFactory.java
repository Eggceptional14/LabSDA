//
// $Header: /home/due1/cvsreps/due/java/pattern/flyweight/IconFactory.java.templ,v 1.1 2002-05-14 09:41:25 due Exp $
//
// Copyright (c) 2002 Eric Dubuis,
// Berner Fachhochschule, HTA Biel.
// All rights reserved.
//
// Based on: J.W. Cooper, Java Design Patterns, Addison-Wesley 2000.


import java.util.*;

public class IconFactory {
    private Map<String,AbstractIcon> iconmap = new HashMap<String,AbstractIcon>();

    // Singleton.
    // COMPLETE

    public AbstractIcon createIcon(String key) {
	// COMPLETE.
        if ( !iconmap.containsKey(key.toLowerCase())) {
            AbstractIcon newIcon;
            switch (key.toLowerCase()) {
                case "folder":
                    newIcon = new FolderIcon();
                    break;
                case "java":
                    newIcon = new JavaIcon();
                    break;
                case "pdf":
                    newIcon = new PdfIcon();
                    break; 
                case "picture":
                    newIcon = new PictureIcon();
                    break;
                case "text":
                    newIcon = new TextIcon();
                    break;
                default:
                    newIcon = new UnknownIcon();
            }
            iconmap.put(key.toLowerCase(), newIcon);
        }
        return (AbstractIcon) iconmap.get(key);

    }

    // Add helper methods here, if any.
}
