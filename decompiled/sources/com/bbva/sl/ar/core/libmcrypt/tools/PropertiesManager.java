package com.bbva.sl.ar.core.libmcrypt.tools;

import java.util.Properties;

/* JADX INFO: loaded from: classes8.dex */
public interface PropertiesManager {
    Properties getProperties();

    String getProperty(String str);

    void put(String str, String str2);
}
