package androidx.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import ci.a;
import com.bbva.ethermobilesdk.deviceinfo.component.Sys;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;
import mx.openpay.library.domain.util.Constant;
import z2.b;

/* JADX INFO: loaded from: classes2.dex */
public final class MultiDex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f22250a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f22251b;

    static {
        String property = System.getProperty(Sys.VM_VERSION);
        boolean z10 = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, Constant.DOT_STRING);
            String strNextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (strNextToken != null && strNextToken2 != null) {
                try {
                    int i10 = Integer.parseInt(strNextToken);
                    int i11 = Integer.parseInt(strNextToken2);
                    if (i10 > 2 || (i10 == 2 && i11 >= 1)) {
                        z10 = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        f22251b = z10;
    }

    public static void a(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            file.getPath();
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : fileArrListFiles) {
                file2.getPath();
                file2.length();
                if (file2.delete()) {
                    file2.getPath();
                } else {
                    Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
                }
            }
            if (file.delete()) {
                file.getPath();
                return;
            }
            Log.w("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
        }
    }

    public static void b(Context context, File file, File file2, String str, String str2, boolean z10) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IOException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        ClassLoader classLoader;
        HashSet hashSet = f22250a;
        synchronized (hashSet) {
            try {
                if (hashSet.contains(file)) {
                    return;
                }
                hashSet.add(file);
                Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + Build.VERSION.SDK_INT + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty(Sys.VM_VERSION) + "\"");
                IOException e5 = null;
                try {
                    classLoader = context.getClassLoader();
                    if (!(classLoader instanceof BaseDexClassLoader)) {
                        classLoader = null;
                    }
                } catch (RuntimeException e7) {
                    Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e7);
                }
                if (classLoader == null) {
                    return;
                }
                try {
                    a(context);
                } catch (Throwable th2) {
                    Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th2);
                }
                File file3 = new File(file2, "code_cache");
                try {
                    e(file3);
                } catch (IOException unused) {
                    file3 = new File(context.getFilesDir(), "code_cache");
                    e(file3);
                }
                File file4 = new File(file3, str);
                e(file4);
                b bVar = new b(file, file4);
                try {
                    try {
                        d(file4, classLoader, bVar.d(context, str2, false));
                    } catch (IOException e10) {
                        if (!z10) {
                            throw e10;
                        }
                        Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e10);
                        d(file4, classLoader, bVar.d(context, str2, true));
                    }
                    try {
                        bVar.close();
                    } catch (IOException e11) {
                        e5 = e11;
                    }
                    if (e5 != null) {
                        throw e5;
                    }
                } catch (Throwable th3) {
                    try {
                        bVar.close();
                    } catch (IOException unused2) {
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public static Field c(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        StringBuilder sbD = a.d("Field ", str, " not found in ");
        sbD.append(obj.getClass());
        throw new NoSuchFieldException(sbD.toString());
    }

    public static void d(File file, ClassLoader classLoader, ArrayList arrayList) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IOException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Method declaredMethod;
        IOException[] iOExceptionArr;
        if (arrayList.isEmpty()) {
            return;
        }
        Object obj = c(classLoader, "pathList").get(classLoader);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList);
        Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
        Class<?> superclass = obj.getClass();
        while (true) {
            if (superclass == null) {
                throw new NoSuchMethodException("Method makeDexElements with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
            }
            try {
                declaredMethod = superclass.getDeclaredMethod("makeDexElements", clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                    break;
                }
                break;
            } catch (NoSuchMethodException unused) {
                superclass = superclass.getSuperclass();
            }
        }
        Object[] objArr = (Object[]) declaredMethod.invoke(obj, arrayList3, file, arrayList2);
        Field fieldC = c(obj, "dexElements");
        Object[] objArr2 = (Object[]) fieldC.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        fieldC.set(obj, objArr3);
        if (arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
            }
            Field fieldC2 = c(obj, "dexElementsSuppressedExceptions");
            IOException[] iOExceptionArr2 = (IOException[]) fieldC2.get(obj);
            if (iOExceptionArr2 == null) {
                iOExceptionArr = (IOException[]) arrayList2.toArray(new IOException[arrayList2.size()]);
            } else {
                IOException[] iOExceptionArr3 = new IOException[arrayList2.size() + iOExceptionArr2.length];
                arrayList2.toArray(iOExceptionArr3);
                System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList2.size(), iOExceptionArr2.length);
                iOExceptionArr = iOExceptionArr3;
            }
            fieldC2.set(obj, iOExceptionArr);
            IOException iOException = new IOException("I/O exception during makeDexElement");
            iOException.initCause((Throwable) arrayList2.get(0));
            throw iOException;
        }
    }

    public static void e(File file) throws IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            file.getPath();
        } else {
            file.getPath();
            parentFile.isDirectory();
            parentFile.isFile();
            parentFile.exists();
            parentFile.canRead();
            parentFile.canWrite();
        }
        throw new IOException("Failed to create directory " + file.getPath());
    }

    public static void install(Context context) {
        ApplicationInfo applicationInfo;
        try {
            if (f22251b) {
                return;
            }
            try {
                applicationInfo = context.getApplicationInfo();
            } catch (RuntimeException e5) {
                Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e5);
                applicationInfo = null;
            }
            if (applicationInfo == null) {
                return;
            }
            b(context, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir), "secondary-dexes", "", true);
        } catch (Exception e7) {
            throw new RuntimeException("MultiDex installation failed (" + e7.getMessage() + ").");
        }
    }

    public static void installInstrumentation(Context context, Context context2) {
        ApplicationInfo applicationInfo;
        if (f22251b) {
            return;
        }
        ApplicationInfo applicationInfo2 = null;
        try {
            try {
                applicationInfo = context.getApplicationInfo();
            } catch (RuntimeException e5) {
                Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e5);
                applicationInfo = null;
            }
            if (applicationInfo == null) {
                return;
            }
            try {
                applicationInfo2 = context2.getApplicationInfo();
            } catch (RuntimeException e7) {
                Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e7);
            }
            if (applicationInfo2 == null) {
                return;
            }
            String str = context.getPackageName() + Constant.DOT_STRING;
            File file = new File(applicationInfo2.dataDir);
            b(context2, new File(applicationInfo.sourceDir), file, str + "secondary-dexes", str, false);
            b(context2, new File(applicationInfo2.sourceDir), file, "secondary-dexes", "", false);
        } catch (Exception e10) {
            throw new RuntimeException("MultiDex installation failed (" + e10.getMessage() + ").");
        }
    }
}
