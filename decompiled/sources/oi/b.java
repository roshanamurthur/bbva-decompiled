package oi;

import androidx.collection.f;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.Printer;
import com.orhanobut.logger.Settings;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import mx.openpay.library.domain.util.Constant;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: LoggerPrinter.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b implements Printer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f85404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadLocal<String> f85405b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadLocal<Integer> f85406c = new ThreadLocal<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Settings f85407d = new Settings();

    public b() {
        init("PRETTYLOGGER");
    }

    public final synchronized void a(int i10, Throwable th2, String str, Object... objArr) {
        if (this.f85407d.getLogLevel() == LogLevel.NONE) {
            return;
        }
        ThreadLocal<String> threadLocal = this.f85405b;
        String str2 = threadLocal.get();
        if (str2 != null) {
            threadLocal.remove();
        } else {
            str2 = this.f85404a;
        }
        if (objArr != null && objArr.length != 0) {
            str = String.format(str, objArr);
        }
        log(i10, str2, str, th2);
    }

    public final void b(int i10, String str, String str2) {
        String str3;
        String strC = (str == null || str.length() == 0 || (str3 = this.f85404a) == str || (str3 != null && str != null && str3.length() == str.length() && str3.equals(str))) ? this.f85404a : f.c(new StringBuilder(), this.f85404a, Constant.DASH_STRING, str);
        Settings settings = this.f85407d;
        if (i10 == 2) {
            settings.getLogAdapter().v(strC, str2);
            return;
        }
        if (i10 == 4) {
            settings.getLogAdapter().i(strC, str2);
            return;
        }
        if (i10 == 5) {
            settings.getLogAdapter().w(strC, str2);
            return;
        }
        if (i10 == 6) {
            settings.getLogAdapter().e(strC, str2);
        } else if (i10 != 7) {
            settings.getLogAdapter().d(strC, str2);
        } else {
            settings.getLogAdapter().wtf(strC, str2);
        }
    }

    public final void c(int i10, String str, String str2) {
        for (String str3 : str2.split(System.getProperty("line.separator"))) {
            b(i10, str, "║ " + str3);
        }
    }

    @Override // com.orhanobut.logger.Printer
    public final void d(String str, Object... objArr) {
        a(3, null, str, objArr);
    }

    @Override // com.orhanobut.logger.Printer
    public final void e(String str, Object... objArr) {
        e(null, str, objArr);
    }

    public final void f(int i10, int i11, String str) {
        int i12;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        Settings settings = this.f85407d;
        if (settings.isShowThreadInfo()) {
            b(i10, str, "║ Thread: " + Thread.currentThread().getName());
            b(i10, str, "╟────────────────────────────────────────────────────────────────────────────────────────");
        }
        int i13 = 3;
        while (true) {
            i12 = -1;
            if (i13 >= stackTrace.length) {
                break;
            }
            String className = stackTrace[i13].getClassName();
            if (!className.equals(b.class.getName()) && !className.equals(Logger.class.getName())) {
                i12 = (-1) + i13;
                break;
            }
            i13++;
        }
        int methodOffset = settings.getMethodOffset() + i12;
        if (i11 + methodOffset > stackTrace.length) {
            i11 = (stackTrace.length - methodOffset) - 1;
        }
        String str2 = "";
        while (i11 > 0) {
            int i14 = i11 + methodOffset;
            if (i14 < stackTrace.length) {
                StringBuilder sb2 = new StringBuilder("║ ");
                sb2.append(str2);
                String className2 = stackTrace[i14].getClassName();
                sb2.append(className2.substring(className2.lastIndexOf(Constant.DOT_STRING) + 1));
                sb2.append(Constant.DOT_STRING);
                sb2.append(stackTrace[i14].getMethodName());
                sb2.append("  (");
                sb2.append(stackTrace[i14].getFileName());
                sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                sb2.append(stackTrace[i14].getLineNumber());
                sb2.append(")");
                str2 = str2 + "   ";
                b(i10, str, sb2.toString());
            }
            i11--;
        }
    }

    @Override // com.orhanobut.logger.Printer
    public final Settings getSettings() {
        return this.f85407d;
    }

    @Override // com.orhanobut.logger.Printer
    public final void i(String str, Object... objArr) {
        a(4, null, str, objArr);
    }

    @Override // com.orhanobut.logger.Printer
    public final Settings init(String str) {
        if (str == null) {
            throw new NullPointerException("tag may not be null");
        }
        if (str.trim().length() == 0) {
            throw new IllegalStateException("tag may not be empty");
        }
        this.f85404a = str;
        return this.f85407d;
    }

    @Override // com.orhanobut.logger.Printer
    public final void json(String str) {
        if (str == null || str.length() == 0) {
            d("Empty/Null json content");
            return;
        }
        try {
            String strTrim = str.trim();
            if (strTrim.startsWith("{")) {
                d(new JSONObject(strTrim).toString(2));
            } else if (strTrim.startsWith(Constant.BRACKET_OPEN)) {
                d(new JSONArray(strTrim).toString(2));
            } else {
                e(null, "Invalid Json", new Object[0]);
            }
        } catch (JSONException unused) {
            e(null, "Invalid Json", new Object[0]);
        }
    }

    @Override // com.orhanobut.logger.Printer
    public final synchronized void log(int i10, String str, String str2, Throwable th2) {
        try {
            if (this.f85407d.getLogLevel() == LogLevel.NONE) {
                return;
            }
            if (th2 != null && str2 != null) {
                str2 = str2 + " : " + a.a(th2);
            }
            if (th2 != null && str2 == null) {
                str2 = a.a(th2);
            }
            if (str2 == null) {
                str2 = "No message/exception is set";
            }
            ThreadLocal<Integer> threadLocal = this.f85406c;
            Integer num = threadLocal.get();
            int methodCount = this.f85407d.getMethodCount();
            if (num != null) {
                threadLocal.remove();
                methodCount = num.intValue();
            }
            if (methodCount < 0) {
                throw new IllegalStateException("methodCount cannot be negative");
            }
            if (str2.length() == 0) {
                str2 = "Empty/NULL log message";
            }
            b(i10, str, "╔════════════════════════════════════════════════════════════════════════════════════════");
            f(i10, methodCount, str);
            byte[] bytes = str2.getBytes();
            int length = bytes.length;
            if (length <= 4000) {
                if (methodCount > 0) {
                    b(i10, str, "╟────────────────────────────────────────────────────────────────────────────────────────");
                }
                c(i10, str, str2);
                b(i10, str, "╚════════════════════════════════════════════════════════════════════════════════════════");
                return;
            }
            if (methodCount > 0) {
                b(i10, str, "╟────────────────────────────────────────────────────────────────────────────────────────");
            }
            for (int i11 = 0; i11 < length; i11 += WearableStatusCodes.TARGET_NODE_NOT_CONNECTED) {
                c(i10, str, new String(bytes, i11, Math.min(length - i11, WearableStatusCodes.TARGET_NODE_NOT_CONNECTED)));
            }
            b(i10, str, "╚════════════════════════════════════════════════════════════════════════════════════════");
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.orhanobut.logger.Printer
    public final void resetSettings() {
        this.f85407d.reset();
    }

    @Override // com.orhanobut.logger.Printer
    public final Printer t(String str, int i10) {
        if (str != null) {
            this.f85405b.set(str);
        }
        this.f85406c.set(Integer.valueOf(i10));
        return this;
    }

    @Override // com.orhanobut.logger.Printer
    public final void v(String str, Object... objArr) {
        a(2, null, str, objArr);
    }

    @Override // com.orhanobut.logger.Printer
    public final void w(String str, Object... objArr) {
        a(5, null, str, objArr);
    }

    @Override // com.orhanobut.logger.Printer
    public final void wtf(String str, Object... objArr) {
        a(7, null, str, objArr);
    }

    @Override // com.orhanobut.logger.Printer
    public final void xml(String str) {
        if (str == null || str.length() == 0) {
            d("Empty/Null xml content");
            return;
        }
        try {
            StreamSource streamSource = new StreamSource(new StringReader(str));
            StreamResult streamResult = new StreamResult(new StringWriter());
            Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
            transformerNewTransformer.setOutputProperty("indent", "yes");
            transformerNewTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            transformerNewTransformer.transform(streamSource, streamResult);
            d(streamResult.getWriter().toString().replaceFirst(">", ">\n"));
        } catch (TransformerException unused) {
            e(null, "Invalid xml", new Object[0]);
        }
    }

    @Override // com.orhanobut.logger.Printer
    public final void d(Object obj) {
        a(3, null, obj.getClass().isArray() ? Arrays.deepToString((Object[]) obj) : obj.toString(), new Object[0]);
    }

    @Override // com.orhanobut.logger.Printer
    public final void e(Throwable th2, String str, Object... objArr) {
        a(6, th2, str, objArr);
    }
}
