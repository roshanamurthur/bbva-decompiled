package javax.activation;

import ad.d;
import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.impl.utils.c;
import com.bbva.network.constant.ConstantsKt;
import com.sun.activation.registries.LogSupport;
import com.sun.activation.registries.MimeTypeFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.util.Vector;
import mx.openpay.library.domain.util.Constant;
import zj.e;
import zj.f;
import zj.g;
import zj.h;

/* JADX INFO: loaded from: classes12.dex */
public class MimetypesFileTypeMap extends FileTypeMap {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f78872d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MimeTypeFile[] f78873c;

    public static class a implements PrivilegedAction {
        @Override // java.security.PrivilegedAction
        public final Object run() {
            String property = System.getProperty("java.home");
            StringBuilder sbD = c.d(property);
            String str = File.separator;
            String strF = d.f(sbD, str, "conf");
            if (new File(strF).exists()) {
                return u.f(strF, str);
            }
            return property + str + "lib" + str;
        }
    }

    static {
        String str;
        try {
            str = (String) AccessController.doPrivileged(new a());
        } catch (Exception unused) {
            str = null;
        }
        f78872d = str;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x017b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0188  */
    public MimetypesFileTypeMap() throws Throwable {
        MimeTypeFile mimeTypeFileA;
        SecurityException e5;
        InputStream inputStream;
        IOException e7;
        MimeTypeFile mimeTypeFile;
        MimeTypeFile mimeTypeFile2;
        Vector vector = new Vector(5);
        InputStream inputStream2 = null;
        vector.addElement(null);
        LogSupport.log("MimetypesFileTypeMap: load HOME");
        try {
            String property = System.getProperty("user.home");
            if (property != null) {
                try {
                    mimeTypeFile2 = new MimeTypeFile(property + File.separator + ".mime.types");
                } catch (IOException unused) {
                    mimeTypeFile2 = null;
                }
                if (mimeTypeFile2 != null) {
                    vector.addElement(mimeTypeFile2);
                }
            }
        } catch (SecurityException unused2) {
        }
        LogSupport.log("MimetypesFileTypeMap: load SYS");
        try {
            String str = f78872d;
            if (str != null) {
                try {
                    mimeTypeFile = new MimeTypeFile(str.concat("mime.types"));
                } catch (IOException unused3) {
                    mimeTypeFile = null;
                }
                if (mimeTypeFile != null) {
                    vector.addElement(mimeTypeFile);
                }
            }
        } catch (SecurityException unused4) {
        }
        LogSupport.log("MimetypesFileTypeMap: load JAR");
        int i10 = 0;
        try {
            ClassLoader classLoaderA = zj.d.a();
            classLoaderA = classLoaderA == null ? getClass().getClassLoader() : classLoaderA;
            URL[] urlArr = classLoaderA != null ? (URL[]) AccessController.doPrivileged(new f(classLoaderA, "META-INF/mime.types")) : (URL[]) AccessController.doPrivileged(new g("META-INF/mime.types"));
            if (urlArr == null) {
                LogSupport.log("MimetypesFileTypeMap: !anyLoaded");
                mimeTypeFileA = a("/META-INF/mime.types");
                if (mimeTypeFileA != null) {
                    vector.addElement(mimeTypeFileA);
                }
            } else {
                if (LogSupport.isLoggable()) {
                    LogSupport.log("MimetypesFileTypeMap: getResources");
                }
                int i11 = 0;
                while (i10 < urlArr.length) {
                    try {
                        URL url = urlArr[i10];
                        if (LogSupport.isLoggable()) {
                            LogSupport.log("MimetypesFileTypeMap: URL " + url);
                        }
                        try {
                            try {
                                inputStream = (InputStream) AccessController.doPrivileged(new h(url));
                                if (inputStream != null) {
                                    try {
                                        try {
                                            vector.addElement(new MimeTypeFile(inputStream));
                                            i11 = 1;
                                            if (LogSupport.isLoggable()) {
                                                LogSupport.log("MimetypesFileTypeMap: successfully loaded mime types from URL: " + url);
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            i10 = i11;
                                            inputStream2 = inputStream;
                                            if (inputStream2 != null) {
                                                try {
                                                    inputStream2.close();
                                                } catch (IOException unused5) {
                                                }
                                            }
                                            throw th;
                                        }
                                    } catch (IOException e10) {
                                        e7 = e10;
                                        if (LogSupport.isLoggable()) {
                                            LogSupport.log("MimetypesFileTypeMap: can't load " + url, e7);
                                        }
                                        if (inputStream != null) {
                                        }
                                        i10++;
                                    } catch (SecurityException e11) {
                                        e5 = e11;
                                        if (LogSupport.isLoggable()) {
                                            LogSupport.log("MimetypesFileTypeMap: can't load " + url, e5);
                                        }
                                        if (inputStream != null) {
                                        }
                                        i10++;
                                    }
                                } else if (LogSupport.isLoggable()) {
                                    LogSupport.log("MimetypesFileTypeMap: not loading mime types from URL: " + url);
                                }
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException unused6) {
                                    }
                                }
                            } catch (PrivilegedActionException e12) {
                                throw ((IOException) e12.getException());
                            }
                        } catch (IOException e13) {
                            e7 = e13;
                            inputStream = null;
                        } catch (SecurityException e14) {
                            e5 = e14;
                            inputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            i10 = i11;
                        }
                        i10++;
                    } catch (Exception e15) {
                        e = e15;
                        i10 = i11;
                        if (LogSupport.isLoggable()) {
                            LogSupport.log("MimetypesFileTypeMap: can't load META-INF/mime.types", e);
                        }
                        i11 = i10;
                    }
                }
                if (i11 == 0) {
                    LogSupport.log("MimetypesFileTypeMap: !anyLoaded");
                    mimeTypeFileA = a("/META-INF/mime.types");
                    if (mimeTypeFileA != null) {
                        vector.addElement(mimeTypeFileA);
                    }
                }
            }
        } catch (Exception e16) {
            e = e16;
        }
        LogSupport.log("MimetypesFileTypeMap: load DEF");
        MimeTypeFile mimeTypeFileA2 = a("/META-INF/mimetypes.default");
        if (mimeTypeFileA2 != null) {
            vector.addElement(mimeTypeFileA2);
        }
        MimeTypeFile[] mimeTypeFileArr = new MimeTypeFile[vector.size()];
        this.f78873c = mimeTypeFileArr;
        vector.copyInto(mimeTypeFileArr);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0056 A[EXC_TOP_SPLITTER, PHI: r4
      0x0056: PHI (r4v5 java.io.InputStream) = (r4v3 java.io.InputStream), (r4v4 java.io.InputStream), (r4v8 java.io.InputStream) binds: [B:37:0x0081, B:43:0x0099, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0034: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:53), block:B:11:0x0034 */
    public final MimeTypeFile a(String str) throws Throwable {
        InputStream inputStream;
        InputStream inputStream2;
        InputStream inputStream3 = null;
        try {
            try {
                try {
                    inputStream = (InputStream) AccessController.doPrivileged(new e(getClass(), str));
                    try {
                        if (inputStream != null) {
                            MimeTypeFile mimeTypeFile = new MimeTypeFile(inputStream);
                            if (LogSupport.isLoggable()) {
                                LogSupport.log("MimetypesFileTypeMap: successfully loaded mime types file: " + str);
                            }
                            try {
                                inputStream.close();
                            } catch (IOException unused) {
                            }
                            return mimeTypeFile;
                        }
                        if (LogSupport.isLoggable()) {
                            LogSupport.log("MimetypesFileTypeMap: not loading mime types file: " + str);
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        return null;
                    } catch (IOException e5) {
                        e = e5;
                        if (LogSupport.isLoggable()) {
                            LogSupport.log("MimetypesFileTypeMap: can't load " + str, e);
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (SecurityException e7) {
                        e = e7;
                        if (LogSupport.isLoggable()) {
                            LogSupport.log("MimetypesFileTypeMap: can't load " + str, e);
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    }
                } catch (PrivilegedActionException e10) {
                    throw ((IOException) e10.getException());
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream3 = inputStream2;
                if (inputStream3 != null) {
                    try {
                        inputStream3.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            inputStream = null;
        } catch (SecurityException e12) {
            e = e12;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            if (inputStream3 != null) {
                inputStream3.close();
            }
            throw th;
        }
    }

    public synchronized void addMimeTypes(String str) {
        try {
            MimeTypeFile[] mimeTypeFileArr = this.f78873c;
            if (mimeTypeFileArr[0] == null) {
                mimeTypeFileArr[0] = new MimeTypeFile();
            }
            this.f78873c[0].appendToRegistry(str);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // javax.activation.FileTypeMap
    public String getContentType(File file) {
        return getContentType(file.getName());
    }

    @Override // javax.activation.FileTypeMap
    public synchronized String getContentType(String str) {
        String mIMETypeString;
        int iLastIndexOf = str.lastIndexOf(Constant.DOT_STRING);
        if (iLastIndexOf < 0) {
            return ConstantsKt.DEFAULT_MEDIATYPE;
        }
        String strSubstring = str.substring(iLastIndexOf + 1);
        if (strSubstring.length() == 0) {
            return ConstantsKt.DEFAULT_MEDIATYPE;
        }
        int i10 = 0;
        while (true) {
            MimeTypeFile[] mimeTypeFileArr = this.f78873c;
            if (i10 >= mimeTypeFileArr.length) {
                return ConstantsKt.DEFAULT_MEDIATYPE;
            }
            MimeTypeFile mimeTypeFile = mimeTypeFileArr[i10];
            if (mimeTypeFile != null && (mIMETypeString = mimeTypeFile.getMIMETypeString(strSubstring)) != null) {
                return mIMETypeString;
            }
            i10++;
        }
    }

    public MimetypesFileTypeMap(String str) throws IOException {
        this();
        this.f78873c[0] = new MimeTypeFile(str);
    }

    public MimetypesFileTypeMap(InputStream inputStream) {
        this();
        try {
            this.f78873c[0] = new MimeTypeFile(inputStream);
        } catch (IOException unused) {
        }
    }
}
