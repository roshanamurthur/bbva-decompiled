package junit.runner;

import com.bbva.glomoconfig.constants.RouteConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.NumberFormat;
import java.util.Properties;
import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestListener;
import junit.framework.TestSuite;
import mx.openpay.library.domain.util.Constant;
import org.junit.internal.Throwables;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseTestRunner implements TestListener {
    public static final String SUITE_METHODNAME = "suite";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Properties f79135b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f79136c = getPreference("maxmessage", 500);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f79137d = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f79138a = true;

    public static String getFilteredTrace(Throwable th2) {
        return getFilteredTrace(Throwables.getStacktrace(th2));
    }

    public static String getPreference(String str) {
        return getPreferences().getProperty(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r0 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r0 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Properties getPreferences() throws java.lang.Throwable {
        /*
            java.util.Properties r0 = junit.runner.BaseTestRunner.f79135b
            if (r0 != 0) goto L5c
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            junit.runner.BaseTestRunner.f79135b = r0
            java.lang.String r1 = "loading"
            java.lang.String r2 = "true"
            r0.put(r1, r2)
            java.util.Properties r0 = junit.runner.BaseTestRunner.f79135b
            java.lang.String r1 = "filterstack"
            r0.put(r1, r2)
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L49 java.lang.SecurityException -> L53 java.io.IOException -> L59
            java.lang.String r2 = "user.home"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch: java.lang.Throwable -> L49 java.lang.SecurityException -> L53 java.io.IOException -> L59
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L49 java.lang.SecurityException -> L53 java.io.IOException -> L59
            java.lang.String r4 = "junit.properties"
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L49 java.lang.SecurityException -> L53 java.io.IOException -> L59
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L49 java.lang.SecurityException -> L53 java.io.IOException -> L59
            java.util.Properties r0 = new java.util.Properties     // Catch: java.lang.Throwable -> L43 java.lang.SecurityException -> L45 java.io.IOException -> L47
            java.util.Properties r2 = getPreferences()     // Catch: java.lang.Throwable -> L43 java.lang.SecurityException -> L45 java.io.IOException -> L47
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L43 java.lang.SecurityException -> L45 java.io.IOException -> L47
            setPreferences(r0)     // Catch: java.lang.Throwable -> L43 java.lang.SecurityException -> L45 java.io.IOException -> L47
            java.util.Properties r0 = getPreferences()     // Catch: java.lang.Throwable -> L43 java.lang.SecurityException -> L45 java.io.IOException -> L47
            r0.load(r1)     // Catch: java.lang.Throwable -> L43 java.lang.SecurityException -> L45 java.io.IOException -> L47
            r1.close()     // Catch: java.io.IOException -> L5c
            goto L5c
        L43:
            r0 = move-exception
            goto L4d
        L45:
            r0 = r1
            goto L53
        L47:
            r0 = r1
            goto L59
        L49:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L4d:
            if (r1 == 0) goto L52
            r1.close()     // Catch: java.io.IOException -> L52
        L52:
            throw r0
        L53:
            if (r0 == 0) goto L5c
        L55:
            r0.close()     // Catch: java.io.IOException -> L5c
            goto L5c
        L59:
            if (r0 == 0) goto L5c
            goto L55
        L5c:
            java.util.Properties r0 = junit.runner.BaseTestRunner.f79135b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: junit.runner.BaseTestRunner.getPreferences():java.util.Properties");
    }

    public static void savePreferences() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(System.getProperty("user.home"), "junit.properties"));
        try {
            getPreferences().store(fileOutputStream, "");
        } finally {
            fileOutputStream.close();
        }
    }

    public static void setPreference(String str, String str2) {
        getPreferences().put(str, str2);
    }

    public static void setPreferences(Properties properties) {
        f79135b = properties;
    }

    public static boolean showStackRaw() {
        return (getPreference("filterstack").equals("true") && f79137d) ? false : true;
    }

    public static String truncate(String str) {
        int i10 = f79136c;
        if (i10 == -1 || str.length() <= i10) {
            return str;
        }
        return str.substring(0, i10) + "...";
    }

    @Override // junit.framework.TestListener
    public synchronized void addError(Test test, Throwable th2) {
        testFailed(1, test, th2);
    }

    @Override // junit.framework.TestListener
    public synchronized void addFailure(Test test, AssertionFailedError assertionFailedError) {
        testFailed(2, test, assertionFailedError);
    }

    public String elapsedTimeAsString(long j10) {
        return NumberFormat.getInstance().format(j10 / 1000.0d);
    }

    @Override // junit.framework.TestListener
    public synchronized void endTest(Test test) {
        testEnded(test.toString());
    }

    public String extractClassName(String str) {
        return str.startsWith("Default package for") ? str.substring(str.lastIndexOf(Constant.DOT_STRING) + 1) : str;
    }

    public Test getTest(String str) {
        if (str.length() <= 0) {
            clearStatus();
            return null;
        }
        try {
            Class<?> clsLoadSuiteClass = loadSuiteClass(str);
            try {
                Method method = clsLoadSuiteClass.getMethod(SUITE_METHODNAME, new Class[0]);
                if (!Modifier.isStatic(method.getModifiers())) {
                    runFailed("Suite() method must be static");
                    return null;
                }
                try {
                    Test test = (Test) method.invoke(null, new Object[0]);
                    if (test == null) {
                        return test;
                    }
                    clearStatus();
                    return test;
                } catch (IllegalAccessException e5) {
                    runFailed("Failed to invoke suite():" + e5.toString());
                    return null;
                } catch (InvocationTargetException e7) {
                    runFailed("Failed to invoke suite():" + e7.getTargetException().toString());
                    return null;
                }
            } catch (Exception unused) {
                clearStatus();
                return new TestSuite(clsLoadSuiteClass);
            }
        } catch (ClassNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null) {
                str = message;
            }
            runFailed("Class not found \"" + str + "\"");
            return null;
        } catch (Exception e11) {
            runFailed("Error: " + e11.toString());
            return null;
        }
    }

    public Class<?> loadSuiteClass(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    public String processArguments(String[] strArr) {
        String strExtractClassName = null;
        int i10 = 0;
        while (i10 < strArr.length) {
            if (strArr[i10].equals("-noloading")) {
                setLoading(false);
            } else if (strArr[i10].equals("-nofilterstack")) {
                f79137d = false;
            } else if (strArr[i10].equals("-c")) {
                i10++;
                if (strArr.length > i10) {
                    strExtractClassName = extractClassName(strArr[i10]);
                } else {
                    System.out.println("Missing Test class name");
                }
            } else {
                strExtractClassName = strArr[i10];
            }
            i10++;
        }
        return strExtractClassName;
    }

    public abstract void runFailed(String str);

    public void setLoading(boolean z10) {
        this.f79138a = z10;
    }

    @Override // junit.framework.TestListener
    public synchronized void startTest(Test test) {
        testStarted(test.toString());
    }

    public abstract void testEnded(String str);

    public abstract void testFailed(int i10, Test test, Throwable th2);

    public abstract void testStarted(String str);

    public boolean useReloadingTestSuiteLoader() {
        return getPreference(RouteConstants.LOADING).equals("true") && this.f79138a;
    }

    public static String getFilteredTrace(String str) {
        if (showStackRaw()) {
            return str;
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return stringWriter.toString();
                }
                String[] strArr = {"junit.framework.TestCase", "junit.framework.TestResult", "junit.framework.TestSuite", "junit.framework.Assert.", "junit.swingui.TestRunner", "junit.awtui.TestRunner", "junit.textui.TestRunner", "java.lang.reflect.Method.invoke("};
                int i10 = 0;
                while (true) {
                    if (i10 >= 8) {
                        printWriter.println(line);
                        break;
                    }
                    if (line.indexOf(strArr[i10]) > 0) {
                        break;
                    }
                    i10++;
                }
            } catch (Exception unused) {
                return str;
            }
        }
    }

    public static int getPreference(String str, int i10) {
        String preference = getPreference(str);
        if (preference == null) {
            return i10;
        }
        try {
            return Integer.parseInt(preference);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public void clearStatus() {
    }
}
