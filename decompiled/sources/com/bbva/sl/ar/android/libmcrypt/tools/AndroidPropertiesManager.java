package com.bbva.sl.ar.android.libmcrypt.tools;

import android.content.Context;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.bbva.sl.ar.core.libmcrypt.exception.LibMCryptException;
import com.bbva.sl.ar.core.libmcrypt.tools.PropertiesManager;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: loaded from: classes8.dex */
public class AndroidPropertiesManager implements PropertiesManager {
    private Properties properties = new Properties();

    public AndroidPropertiesManager(Context context) throws LibMCryptException {
        try {
            this.properties.load(context.getAssets().open("Configuration.properties"));
        } catch (IOException unused) {
            throw new LibMCryptException(ErrorCodes.ERR_CRY_IO_PROPERTIES, ErrorCodes.ERR_CRY_IO_PROPERTIES_MSG);
        }
    }

    @Override // com.bbva.sl.ar.core.libmcrypt.tools.PropertiesManager
    public Properties getProperties() {
        return this.properties;
    }

    @Override // com.bbva.sl.ar.core.libmcrypt.tools.PropertiesManager
    public String getProperty(String str) {
        return this.properties.getProperty(str);
    }

    @Override // com.bbva.sl.ar.core.libmcrypt.tools.PropertiesManager
    public void put(String str, String str2) {
        this.properties.put(str, str2);
    }
}
