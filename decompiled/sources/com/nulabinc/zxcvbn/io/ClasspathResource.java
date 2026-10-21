package com.nulabinc.zxcvbn.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes11.dex */
public class ClasspathResource implements Resource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63662a;

    public ClasspathResource(String str) {
        this.f63662a = str;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0022 A[PHI: r2
      0x0022: PHI (r2v6 java.io.InputStream) = (r2v4 java.io.InputStream), (r2v10 java.io.InputStream) binds: [B:20:0x0036, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    @Override // com.nulabinc.zxcvbn.io.Resource
    public InputStream getInputStream() throws IOException {
        InputStream resourceAsStream;
        InputStream resourceAsStream2;
        Class<?> cls = getClass();
        String str = this.f63662a;
        InputStream resourceAsStream3 = cls.getResourceAsStream(str);
        if (resourceAsStream3 == null) {
            resourceAsStream3 = null;
            try {
                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                if (contextClassLoader != null) {
                    try {
                        resourceAsStream2 = contextClassLoader.getResourceAsStream(str);
                        if (resourceAsStream2 == null) {
                            resourceAsStream2 = null;
                        }
                    } catch (Throwable unused) {
                    }
                } else {
                    resourceAsStream2 = null;
                }
                if (resourceAsStream2 != null) {
                    resourceAsStream3 = resourceAsStream2;
                } else {
                    try {
                        ClassLoader classLoader = getClass().getClassLoader();
                        if (classLoader != null) {
                            try {
                                resourceAsStream2 = classLoader.getResourceAsStream(str);
                                if (resourceAsStream2 == null) {
                                    resourceAsStream2 = null;
                                }
                            } catch (Throwable unused2) {
                            }
                        } else {
                            resourceAsStream2 = null;
                        }
                        if (resourceAsStream2 != null) {
                            resourceAsStream3 = resourceAsStream2;
                        } else {
                            try {
                                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                                if (systemClassLoader != null) {
                                    try {
                                        resourceAsStream = systemClassLoader.getResourceAsStream(str);
                                        if (resourceAsStream == null) {
                                            resourceAsStream = null;
                                        }
                                    } catch (Throwable unused3) {
                                    }
                                } else {
                                    resourceAsStream = null;
                                }
                                if (resourceAsStream != null) {
                                    resourceAsStream3 = resourceAsStream;
                                }
                            } catch (Throwable unused4) {
                            }
                        }
                    } catch (Throwable unused5) {
                    }
                }
            } catch (Throwable unused6) {
            }
        }
        if (resourceAsStream3 != null) {
            return resourceAsStream3;
        }
        throw new FileNotFoundException("Could not get resource as stream");
    }
}
