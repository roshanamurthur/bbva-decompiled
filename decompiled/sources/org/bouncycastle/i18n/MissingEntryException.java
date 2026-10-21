package org.bouncycastle.i18n;

import ad.d;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes5.dex */
public class MissingEntryException extends RuntimeException {
    protected final String key;
    protected final ClassLoader loader;
    protected final Locale locale;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f89655p0;
    protected final String resource;

    public MissingEntryException(String str, String str2, String str3, Locale locale, ClassLoader classLoader) {
        super(str);
        this.resource = str2;
        this.key = str3;
        this.locale = locale;
        this.loader = classLoader;
    }

    public ClassLoader getClassLoader() {
        return this.loader;
    }

    public String getDebugMsg() {
        if (this.f89655p0 == null) {
            this.f89655p0 = "Can not find entry " + this.key + " in resource file " + this.resource + " for the locale " + this.locale + Constant.DOT_STRING;
            ClassLoader classLoader = this.loader;
            if (classLoader instanceof URLClassLoader) {
                URL[] uRLs = ((URLClassLoader) classLoader).getURLs();
                this.f89655p0 = d.f(new StringBuilder(), this.f89655p0, " The following entries in the classpath were searched: ");
                for (int i10 = 0; i10 != uRLs.length; i10++) {
                    this.f89655p0 += uRLs[i10] + " ";
                }
            }
        }
        return this.f89655p0;
    }

    public String getKey() {
        return this.key;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public String getResource() {
        return this.resource;
    }

    public MissingEntryException(String str, Throwable th2, String str2, String str3, Locale locale, ClassLoader classLoader) {
        super(str, th2);
        this.resource = str2;
        this.key = str3;
        this.locale = locale;
        this.loader = classLoader;
    }
}
