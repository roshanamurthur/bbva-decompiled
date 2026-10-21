package javax.activation;

import java.io.File;
import java.util.WeakHashMap;
import zj.d;

/* JADX INFO: loaded from: classes12.dex */
public abstract class FileTypeMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static FileTypeMap f78864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f78865b = new WeakHashMap();

    public static synchronized FileTypeMap getDefaultFileTypeMap() {
        FileTypeMap fileTypeMap = f78864a;
        if (fileTypeMap != null) {
            return fileTypeMap;
        }
        ClassLoader classLoaderA = d.a();
        WeakHashMap weakHashMap = f78865b;
        FileTypeMap mimetypesFileTypeMap = (FileTypeMap) weakHashMap.get(classLoaderA);
        if (mimetypesFileTypeMap == null) {
            mimetypesFileTypeMap = new MimetypesFileTypeMap();
            weakHashMap.put(classLoaderA, mimetypesFileTypeMap);
        }
        return mimetypesFileTypeMap;
    }

    public static synchronized void setDefaultFileTypeMap(FileTypeMap fileTypeMap) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            try {
                securityManager.checkSetFactory();
            } catch (SecurityException e5) {
                ClassLoader classLoader = FileTypeMap.class.getClassLoader();
                if (classLoader == null || classLoader.getParent() == null || classLoader != fileTypeMap.getClass().getClassLoader()) {
                    throw e5;
                }
            }
        }
        f78865b.remove(d.a());
        f78864a = fileTypeMap;
    }

    public abstract String getContentType(File file);

    public abstract String getContentType(String str);
}
