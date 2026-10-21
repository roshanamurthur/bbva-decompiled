package com.sun.mail.util;

import java.util.Properties;
import javax.mail.Session;

/* JADX INFO: loaded from: classes9.dex */
public class PropUtil {
    public static boolean a(Object obj, boolean z10) {
        if (obj == null) {
            return z10;
        }
        if (obj instanceof String) {
            return z10 ? !((String) obj).equalsIgnoreCase("false") : ((String) obj).equalsIgnoreCase("true");
        }
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z10;
    }

    public static boolean getBooleanProperty(Properties properties, String str, boolean z10) {
        Object property = properties.get(str);
        if (property == null) {
            property = properties.getProperty(str);
        }
        return a(property, z10);
    }

    @Deprecated
    public static boolean getBooleanSessionProperty(Session session, String str, boolean z10) {
        Properties properties = session.getProperties();
        Object property = properties.get(str);
        if (property == null) {
            property = properties.getProperty(str);
        }
        return a(property, z10);
    }

    public static boolean getBooleanSystemProperty(String str, boolean z10) {
        try {
            try {
                Properties properties = System.getProperties();
                Object property = properties.get(str);
                if (property == null) {
                    property = properties.getProperty(str);
                }
                return a(property, z10);
            } catch (SecurityException unused) {
                String property2 = System.getProperty(str);
                if (property2 == null) {
                    return z10;
                }
                return z10 ? !property2.equalsIgnoreCase("false") : property2.equalsIgnoreCase("true");
            }
        } catch (SecurityException unused2) {
            return z10;
        }
    }

    public static int getIntProperty(Properties properties, String str, int i10) {
        Object property = properties.get(str);
        if (property == null) {
            property = properties.getProperty(str);
        }
        if (property == null) {
            return i10;
        }
        if (property instanceof String) {
            try {
                return Integer.parseInt((String) property);
            } catch (NumberFormatException unused) {
            }
        }
        return property instanceof Integer ? ((Integer) property).intValue() : i10;
    }

    @Deprecated
    public static int getIntSessionProperty(Session session, String str, int i10) {
        Properties properties = session.getProperties();
        Object property = properties.get(str);
        if (property == null) {
            property = properties.getProperty(str);
        }
        if (property == null) {
            return i10;
        }
        if (property instanceof String) {
            try {
                return Integer.parseInt((String) property);
            } catch (NumberFormatException unused) {
            }
        }
        return property instanceof Integer ? ((Integer) property).intValue() : i10;
    }
}
