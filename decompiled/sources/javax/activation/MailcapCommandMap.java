package javax.activation;

import ad.d;
import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.impl.utils.c;
import com.sun.activation.registries.LogSupport;
import com.sun.activation.registries.MailcapFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import zj.e;
import zj.f;
import zj.g;
import zj.h;

/* JADX INFO: loaded from: classes12.dex */
public class MailcapCommandMap extends CommandMap {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f78866d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MailcapFile[] f78867c;

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
        f78866d = str;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x017b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0181  */
    /* JADX WARN: Code duplicated, block: B:98:0x018e  */
    public MailcapCommandMap() throws Throwable {
        MailcapFile mailcapFileD;
        SecurityException e5;
        InputStream inputStream;
        IOException e7;
        MailcapFile mailcapFile;
        MailcapFile mailcapFile2;
        ArrayList arrayList = new ArrayList(5);
        InputStream inputStream2 = null;
        arrayList.add(null);
        LogSupport.log("MailcapCommandMap: load HOME");
        try {
            String property = System.getProperty("user.home");
            if (property != null) {
                try {
                    mailcapFile2 = new MailcapFile(property + File.separator + ".mailcap");
                } catch (IOException unused) {
                    mailcapFile2 = null;
                }
                if (mailcapFile2 != null) {
                    arrayList.add(mailcapFile2);
                }
            }
        } catch (SecurityException unused2) {
        }
        LogSupport.log("MailcapCommandMap: load SYS");
        try {
            String str = f78866d;
            if (str != null) {
                try {
                    mailcapFile = new MailcapFile(str.concat("mailcap"));
                } catch (IOException unused3) {
                    mailcapFile = null;
                }
                if (mailcapFile != null) {
                    arrayList.add(mailcapFile);
                }
            }
        } catch (SecurityException unused4) {
        }
        LogSupport.log("MailcapCommandMap: load JAR");
        int i10 = 0;
        try {
            ClassLoader classLoaderA = zj.d.a();
            classLoaderA = classLoaderA == null ? getClass().getClassLoader() : classLoaderA;
            URL[] urlArr = classLoaderA != null ? (URL[]) AccessController.doPrivileged(new f(classLoaderA, "META-INF/mailcap")) : (URL[]) AccessController.doPrivileged(new g("META-INF/mailcap"));
            if (urlArr == null) {
                if (LogSupport.isLoggable()) {
                    LogSupport.log("MailcapCommandMap: !anyLoaded");
                }
                mailcapFileD = d("/META-INF/mailcap");
                if (mailcapFileD != null) {
                    arrayList.add(mailcapFileD);
                }
            } else {
                if (LogSupport.isLoggable()) {
                    LogSupport.log("MailcapCommandMap: getResources");
                }
                int i11 = 0;
                while (i10 < urlArr.length) {
                    try {
                        URL url = urlArr[i10];
                        if (LogSupport.isLoggable()) {
                            LogSupport.log("MailcapCommandMap: URL " + url);
                        }
                        try {
                            try {
                                inputStream = (InputStream) AccessController.doPrivileged(new h(url));
                                if (inputStream != null) {
                                    try {
                                        try {
                                            arrayList.add(new MailcapFile(inputStream));
                                            i11 = 1;
                                            if (LogSupport.isLoggable()) {
                                                LogSupport.log("MailcapCommandMap: successfully loaded mailcap file from URL: " + url);
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
                                            LogSupport.log("MailcapCommandMap: can't load " + url, e7);
                                        }
                                        if (inputStream != null) {
                                        }
                                        i10++;
                                    } catch (SecurityException e11) {
                                        e5 = e11;
                                        if (LogSupport.isLoggable()) {
                                            LogSupport.log("MailcapCommandMap: can't load " + url, e5);
                                        }
                                        if (inputStream != null) {
                                        }
                                        i10++;
                                    }
                                } else if (LogSupport.isLoggable()) {
                                    LogSupport.log("MailcapCommandMap: not loading mailcap file from URL: " + url);
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
                            LogSupport.log("MailcapCommandMap: can't load META-INF/mailcap", e);
                        }
                        i11 = i10;
                    }
                }
                if (i11 == 0) {
                    if (LogSupport.isLoggable()) {
                        LogSupport.log("MailcapCommandMap: !anyLoaded");
                    }
                    mailcapFileD = d("/META-INF/mailcap");
                    if (mailcapFileD != null) {
                        arrayList.add(mailcapFileD);
                    }
                }
            }
        } catch (Exception e16) {
            e = e16;
        }
        LogSupport.log("MailcapCommandMap: load DEF");
        MailcapFile mailcapFileD2 = d("/META-INF/mailcap.default");
        if (mailcapFileD2 != null) {
            arrayList.add(mailcapFileD2);
        }
        MailcapFile[] mailcapFileArr = new MailcapFile[arrayList.size()];
        this.f78867c = mailcapFileArr;
        this.f78867c = (MailcapFile[]) arrayList.toArray(mailcapFileArr);
    }

    public static void a(ArrayList arrayList, Map map) {
        for (String str : map.keySet()) {
            Iterator it = ((List) map.get(str)).iterator();
            while (it.hasNext()) {
                arrayList.add(new CommandInfo(str, (String) it.next()));
            }
        }
    }

    public static void b(ArrayList arrayList, Map map) {
        for (String str : map.keySet()) {
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    arrayList.add(new CommandInfo(str, (String) ((List) map.get(str)).get(0)));
                    break;
                }
            } while (!((CommandInfo) it.next()).getCommandName().equals(str));
        }
    }

    public synchronized void addMailcap(String str) {
        try {
            LogSupport.log("MailcapCommandMap: add to PROG");
            MailcapFile[] mailcapFileArr = this.f78867c;
            if (mailcapFileArr[0] == null) {
                mailcapFileArr[0] = new MailcapFile();
            }
            this.f78867c[0].appendToMailcap(str);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final DataContentHandler c(String str) {
        Class<?> cls;
        if (LogSupport.isLoggable()) {
            LogSupport.log("    got content-handler");
        }
        if (LogSupport.isLoggable()) {
            LogSupport.log("      class " + str);
        }
        try {
            ClassLoader classLoaderA = zj.d.a();
            if (classLoaderA == null) {
                classLoaderA = getClass().getClassLoader();
            }
            try {
                cls = classLoaderA.loadClass(str);
            } catch (Exception unused) {
                cls = Class.forName(str);
            }
            if (cls != null) {
                return (DataContentHandler) cls.newInstance();
            }
            return null;
        } catch (ClassNotFoundException e5) {
            if (!LogSupport.isLoggable()) {
                return null;
            }
            LogSupport.log("Can't load DCH " + str, e5);
            return null;
        } catch (IllegalAccessException e7) {
            if (!LogSupport.isLoggable()) {
                return null;
            }
            LogSupport.log("Can't load DCH " + str, e7);
            return null;
        } catch (InstantiationException e10) {
            if (!LogSupport.isLoggable()) {
                return null;
            }
            LogSupport.log("Can't load DCH " + str, e10);
            return null;
        }
    }

    @Override // javax.activation.CommandMap
    public synchronized DataContentHandler createDataContentHandler(String str) {
        List list;
        DataContentHandler dataContentHandlerC;
        List list2;
        DataContentHandler dataContentHandlerC2;
        try {
            if (LogSupport.isLoggable()) {
                LogSupport.log("MailcapCommandMap: createDataContentHandler for " + str);
            }
            if (str != null) {
                str = str.toLowerCase(Locale.ENGLISH);
            }
            int i10 = 0;
            while (true) {
                MailcapFile[] mailcapFileArr = this.f78867c;
                if (i10 < mailcapFileArr.length) {
                    if (mailcapFileArr[i10] != null) {
                        if (LogSupport.isLoggable()) {
                            LogSupport.log("  search DB #" + i10);
                        }
                        Map mailcapList = this.f78867c[i10].getMailcapList(str);
                        if (mailcapList != null && (list2 = (List) mailcapList.get("content-handler")) != null && (dataContentHandlerC2 = c((String) list2.get(0))) != null) {
                            return dataContentHandlerC2;
                        }
                    }
                    i10++;
                } else {
                    int i11 = 0;
                    while (true) {
                        MailcapFile[] mailcapFileArr2 = this.f78867c;
                        if (i11 >= mailcapFileArr2.length) {
                            return null;
                        }
                        if (mailcapFileArr2[i11] != null) {
                            if (LogSupport.isLoggable()) {
                                LogSupport.log("  search fallback DB #" + i11);
                            }
                            Map mailcapFallbackList = this.f78867c[i11].getMailcapFallbackList(str);
                            if (mailcapFallbackList != null && (list = (List) mailcapFallbackList.get("content-handler")) != null && (dataContentHandlerC = c((String) list.get(0))) != null) {
                                return dataContentHandlerC;
                            }
                        }
                        i11++;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0056 A[EXC_TOP_SPLITTER, PHI: r4
      0x0056: PHI (r4v5 java.io.InputStream) = (r4v3 java.io.InputStream), (r4v4 java.io.InputStream), (r4v8 java.io.InputStream) binds: [B:37:0x0081, B:43:0x0099, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0034: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:53), block:B:11:0x0034 */
    public final MailcapFile d(String str) throws Throwable {
        InputStream inputStream;
        InputStream inputStream2;
        InputStream inputStream3 = null;
        try {
            try {
                try {
                    inputStream = (InputStream) AccessController.doPrivileged(new e(getClass(), str));
                    try {
                        if (inputStream != null) {
                            MailcapFile mailcapFile = new MailcapFile(inputStream);
                            if (LogSupport.isLoggable()) {
                                LogSupport.log("MailcapCommandMap: successfully loaded mailcap file: " + str);
                            }
                            try {
                                inputStream.close();
                            } catch (IOException unused) {
                            }
                            return mailcapFile;
                        }
                        if (LogSupport.isLoggable()) {
                            LogSupport.log("MailcapCommandMap: not loading mailcap file: " + str);
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
                            LogSupport.log("MailcapCommandMap: can't load " + str, e);
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (SecurityException e7) {
                        e = e7;
                        if (LogSupport.isLoggable()) {
                            LogSupport.log("MailcapCommandMap: can't load " + str, e);
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

    @Override // javax.activation.CommandMap
    public synchronized CommandInfo[] getAllCommands(String str) {
        ArrayList arrayList;
        Map mailcapFallbackList;
        Map mailcapList;
        try {
            arrayList = new ArrayList();
            if (str != null) {
                str = str.toLowerCase(Locale.ENGLISH);
            }
            int i10 = 0;
            int i11 = 0;
            while (true) {
                MailcapFile[] mailcapFileArr = this.f78867c;
                if (i11 >= mailcapFileArr.length) {
                    break;
                }
                MailcapFile mailcapFile = mailcapFileArr[i11];
                if (mailcapFile != null && (mailcapList = mailcapFile.getMailcapList(str)) != null) {
                    a(arrayList, mailcapList);
                }
                i11++;
            }
            while (true) {
                MailcapFile[] mailcapFileArr2 = this.f78867c;
                if (i10 < mailcapFileArr2.length) {
                    MailcapFile mailcapFile2 = mailcapFileArr2[i10];
                    if (mailcapFile2 != null && (mailcapFallbackList = mailcapFile2.getMailcapFallbackList(str)) != null) {
                        a(arrayList, mailcapFallbackList);
                    }
                    i10++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (CommandInfo[]) arrayList.toArray(new CommandInfo[arrayList.size()]);
    }

    @Override // javax.activation.CommandMap
    public synchronized CommandInfo getCommand(String str, String str2) {
        Map mailcapFallbackList;
        List list;
        String str3;
        Map mailcapList;
        List list2;
        String str4;
        if (str != null) {
            try {
                str = str.toLowerCase(Locale.ENGLISH);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i10 = 0;
        while (true) {
            MailcapFile[] mailcapFileArr = this.f78867c;
            if (i10 < mailcapFileArr.length) {
                MailcapFile mailcapFile = mailcapFileArr[i10];
                if (mailcapFile != null && (mailcapList = mailcapFile.getMailcapList(str)) != null && (list2 = (List) mailcapList.get(str2)) != null && (str4 = (String) list2.get(0)) != null) {
                    return new CommandInfo(str2, str4);
                }
                i10++;
            } else {
                int i11 = 0;
                while (true) {
                    MailcapFile[] mailcapFileArr2 = this.f78867c;
                    if (i11 >= mailcapFileArr2.length) {
                        return null;
                    }
                    MailcapFile mailcapFile2 = mailcapFileArr2[i11];
                    if (mailcapFile2 != null && (mailcapFallbackList = mailcapFile2.getMailcapFallbackList(str)) != null && (list = (List) mailcapFallbackList.get(str2)) != null && (str3 = (String) list.get(0)) != null) {
                        return new CommandInfo(str2, str3);
                    }
                    i11++;
                }
            }
        }
    }

    @Override // javax.activation.CommandMap
    public synchronized String[] getMimeTypes() {
        ArrayList arrayList;
        String[] mimeTypes;
        try {
            arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                MailcapFile[] mailcapFileArr = this.f78867c;
                if (i10 < mailcapFileArr.length) {
                    MailcapFile mailcapFile = mailcapFileArr[i10];
                    if (mailcapFile != null && (mimeTypes = mailcapFile.getMimeTypes()) != null) {
                        for (int i11 = 0; i11 < mimeTypes.length; i11++) {
                            if (!arrayList.contains(mimeTypes[i11])) {
                                arrayList.add(mimeTypes[i11]);
                            }
                        }
                    }
                    i10++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public synchronized String[] getNativeCommands(String str) {
        ArrayList arrayList;
        String[] nativeCommands;
        try {
            arrayList = new ArrayList();
            if (str != null) {
                str = str.toLowerCase(Locale.ENGLISH);
            }
            int i10 = 0;
            while (true) {
                MailcapFile[] mailcapFileArr = this.f78867c;
                if (i10 < mailcapFileArr.length) {
                    MailcapFile mailcapFile = mailcapFileArr[i10];
                    if (mailcapFile != null && (nativeCommands = mailcapFile.getNativeCommands(str)) != null) {
                        for (int i11 = 0; i11 < nativeCommands.length; i11++) {
                            if (!arrayList.contains(nativeCommands[i11])) {
                                arrayList.add(nativeCommands[i11]);
                            }
                        }
                    }
                    i10++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // javax.activation.CommandMap
    public synchronized CommandInfo[] getPreferredCommands(String str) {
        ArrayList arrayList;
        Map mailcapFallbackList;
        Map mailcapList;
        try {
            arrayList = new ArrayList();
            if (str != null) {
                str = str.toLowerCase(Locale.ENGLISH);
            }
            int i10 = 0;
            int i11 = 0;
            while (true) {
                MailcapFile[] mailcapFileArr = this.f78867c;
                if (i11 >= mailcapFileArr.length) {
                    break;
                }
                MailcapFile mailcapFile = mailcapFileArr[i11];
                if (mailcapFile != null && (mailcapList = mailcapFile.getMailcapList(str)) != null) {
                    b(arrayList, mailcapList);
                }
                i11++;
            }
            while (true) {
                MailcapFile[] mailcapFileArr2 = this.f78867c;
                if (i10 < mailcapFileArr2.length) {
                    MailcapFile mailcapFile2 = mailcapFileArr2[i10];
                    if (mailcapFile2 != null && (mailcapFallbackList = mailcapFile2.getMailcapFallbackList(str)) != null) {
                        b(arrayList, mailcapFallbackList);
                    }
                    i10++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (CommandInfo[]) arrayList.toArray(new CommandInfo[arrayList.size()]);
    }

    public MailcapCommandMap(String str) throws IOException {
        this();
        if (LogSupport.isLoggable()) {
            LogSupport.log("MailcapCommandMap: load PROG from " + str);
        }
        MailcapFile[] mailcapFileArr = this.f78867c;
        if (mailcapFileArr[0] == null) {
            mailcapFileArr[0] = new MailcapFile(str);
        }
    }

    public MailcapCommandMap(InputStream inputStream) {
        this();
        LogSupport.log("MailcapCommandMap: load PROG");
        MailcapFile[] mailcapFileArr = this.f78867c;
        if (mailcapFileArr[0] == null) {
            try {
                mailcapFileArr[0] = new MailcapFile(inputStream);
            } catch (IOException unused) {
            }
        }
    }
}
