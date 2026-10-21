package oi;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: Helper.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static String a(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
            if (cause instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }
}
