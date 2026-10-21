package org.junit.internal;

import gn.d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes13.dex */
public final class Throwables {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f91848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f91849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f91850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f91851d;

    static {
        Method method;
        try {
            method = Throwable.class.getMethod("getSuppressed", new Class[0]);
        } catch (Throwable unused) {
            method = null;
        }
        f91848a = method;
        f91849b = new String[]{"org.junit.runner.", "org.junit.runners.", "org.junit.experimental.runners.", "org.junit.internal.", "junit.extensions", "junit.framework", "junit.runner", "junit.textui"};
        f91850c = new String[]{"org.junit.internal.StackTracesTest"};
        f91851d = new String[]{"sun.reflect.", "java.lang.reflect.", "jdk.internal.reflect.", "org.junit.rules.RunRules.<init>(", "org.junit.rules.RunRules.applyAll(", "org.junit.runners.RuleContainer.apply(", "junit.framework.TestCase.runBare("};
    }

    public static boolean a(String str) {
        return c(str, f91849b) && !c(str, f91850c);
    }

    public static void b(StringBuilder sb2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb2.append(String.format("%s%n", (String) it.next()));
        }
    }

    public static boolean c(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static String getStacktrace(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:30:0x011c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0139 A[LOOP:3: B:35:0x0133->B:37:0x0139, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x013d A[EDGE_INSN: B:48:0x013d->B:38:0x013d BREAK  A[LOOP:2: B:28:0x0116->B:50:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0141 A[EDGE_INSN: B:51:0x0141->B:39:0x0141 BREAK  A[LOOP:3: B:35:0x0133->B:37:0x0139], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    public static String getTrimmedStackTrace(Throwable th2) throws IOException {
        List listEmptyList;
        BufferedReader bufferedReader;
        ?? arrayList;
        String line;
        String line2;
        List listAsList = Arrays.asList(th2.getStackTrace());
        int size = listAsList.size();
        a aVarA = a.PROCESSING_OTHER_CODE;
        Iterator<Object> it = new d(listAsList).iterator();
        while (true) {
            if (!it.hasNext()) {
                listEmptyList = Collections.emptyList();
                break;
            }
            StackTraceElement stackTraceElement = (StackTraceElement) it.next();
            aVarA.getClass();
            aVarA = aVarA.a(stackTraceElement.getClassName() + Constant.DOT_STRING + stackTraceElement.getMethodName() + "()");
            if (aVarA == a.DONE) {
                ArrayList arrayList2 = new ArrayList(size + 2);
                arrayList2.add("");
                Iterator it2 = listAsList.subList(0, size).iterator();
                while (it2.hasNext()) {
                    arrayList2.add("\tat " + ((StackTraceElement) it2.next()));
                }
                listEmptyList = arrayList2;
                if (th2.getCause() == null) {
                    break;
                }
                arrayList2.add("\t... " + (listAsList.size() - arrayList2.size()) + " trimmed");
                listEmptyList = arrayList2;
                break;
            }
            size--;
        }
        if (listEmptyList.isEmpty()) {
            StringWriter stringWriter = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }
        StringBuilder sb2 = new StringBuilder(th2.toString());
        b(sb2, listEmptyList);
        if (th2.getCause() != null) {
            StringWriter stringWriter2 = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter2));
            bufferedReader = new BufferedReader(new StringReader(stringWriter2.toString().substring(th2.toString().length())));
            arrayList = new ArrayList();
            while (true) {
                line = bufferedReader.readLine();
                if (line != null) {
                    break;
                }
                if (!line.startsWith("Caused by: ") || line.trim().startsWith("Suppressed: ")) {
                    arrayList.add(line);
                    while (true) {
                        line2 = bufferedReader.readLine();
                        if (line2 != null) {
                            break;
                        }
                        arrayList.add(line2);
                    }
                }
            }
            arrayList = Collections.emptyList();
        } else {
            Method method = f91848a;
            if (method != null) {
                try {
                    if (((Throwable[]) method.invoke(th2, new Object[0])).length != 0) {
                        StringWriter stringWriter3 = new StringWriter();
                        th2.printStackTrace(new PrintWriter(stringWriter3));
                        bufferedReader = new BufferedReader(new StringReader(stringWriter3.toString().substring(th2.toString().length())));
                        arrayList = new ArrayList();
                        while (true) {
                            line = bufferedReader.readLine();
                            if (line != null) {
                                break;
                                break;
                            }
                            if (!line.startsWith("Caused by: ")) {
                            }
                            arrayList.add(line);
                            while (true) {
                                line2 = bufferedReader.readLine();
                                if (line2 != null) {
                                    break;
                                    break;
                                }
                                arrayList.add(line2);
                            }
                        }
                    }
                } catch (IOException unused) {
                }
            }
            arrayList = Collections.emptyList();
        }
        b(sb2, arrayList);
        return sb2.toString();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a DONE;
        public static final a PROCESSING_OTHER_CODE;
        public static final a PROCESSING_REFLECTION_CODE;
        public static final a PROCESSING_TEST_FRAMEWORK_CODE;

        /* JADX INFO: renamed from: org.junit.internal.Throwables$a$a, reason: collision with other inner class name */
        public static enum C0475a extends a {
            public C0475a() {
                super("PROCESSING_OTHER_CODE", 0);
            }

            @Override // org.junit.internal.Throwables.a
            public final a a(String str) {
                return Throwables.a(str) ? a.PROCESSING_TEST_FRAMEWORK_CODE : this;
            }
        }

        public static enum b extends a {
            public b() {
                super("PROCESSING_TEST_FRAMEWORK_CODE", 1);
            }

            @Override // org.junit.internal.Throwables.a
            public final a a(String str) {
                if (Throwables.c(str, Throwables.f91851d)) {
                    return a.PROCESSING_REFLECTION_CODE;
                }
                return Throwables.a(str) ? this : a.PROCESSING_OTHER_CODE;
            }
        }

        public static enum c extends a {
            public c() {
                super("PROCESSING_REFLECTION_CODE", 2);
            }

            @Override // org.junit.internal.Throwables.a
            public final a a(String str) {
                if (Throwables.c(str, Throwables.f91851d)) {
                    return this;
                }
                return Throwables.a(str) ? a.PROCESSING_TEST_FRAMEWORK_CODE : a.DONE;
            }
        }

        static {
            C0475a c0475a = new C0475a();
            PROCESSING_OTHER_CODE = c0475a;
            b bVar = new b();
            PROCESSING_TEST_FRAMEWORK_CODE = bVar;
            c cVar = new c();
            PROCESSING_REFLECTION_CODE = cVar;
            d dVar = new d();
            DONE = dVar;
            $VALUES = new a[]{c0475a, bVar, cVar, dVar};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public abstract a a(String str);

        public static enum d extends a {
            public d() {
                super("DONE", 3);
            }

            @Override // org.junit.internal.Throwables.a
            public final a a(String str) {
                return this;
            }
        }
    }

    public static Exception rethrowAsException(Throwable th2) throws Exception {
        throw th2;
    }
}
