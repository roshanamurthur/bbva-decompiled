package androidx.constraintlayout.core.motion.utils;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
public class Utils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static DebugHandle f18955a;

    public interface DebugHandle {
        void message(String str);
    }

    public static int a(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static void log(String str, String str2) {
        System.out.println(str + " : " + str2);
    }

    public static void logStack(String str, int i10) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(i10, stackTrace.length - 1);
        String strF = " ";
        for (int i11 = 1; i11 <= iMin; i11++) {
            StackTraceElement stackTraceElement = stackTrace[i11];
            String str2 = ".(" + stackTraceElement.getFileName() + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName();
            strF = u.f(strF, " ");
            System.out.println(str + strF + str2 + strF);
        }
    }

    public static void loge(String str, String str2) {
        System.err.println(str + " : " + str2);
    }

    public static int rgbaTocColor(float f6, float f10, float f11, float f12) {
        int iA = a((int) (f6 * 255.0f));
        int iA2 = a((int) (f10 * 255.0f));
        return (iA << 16) | (a((int) (f12 * 255.0f)) << 24) | (iA2 << 8) | a((int) (f11 * 255.0f));
    }

    public static void setDebugHandle(DebugHandle debugHandle) {
        f18955a = debugHandle;
    }

    public static void socketSend(String str) {
        try {
            OutputStream outputStream = new Socket("127.0.0.1", 5327).getOutputStream();
            outputStream.write(str.getBytes());
            outputStream.close();
        } catch (IOException e5) {
            System.err.println(e5.toString() + RootService.LINE_BREAK + Arrays.toString(e5.getStackTrace()).replace(Constant.BRACKET_OPEN, "   at ").replace(",", "\n   at").replace(Constant.BRACKET_CLOSE, ""));
        }
    }

    public int getInterpolatedColor(float[] fArr) {
        return (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public static void log(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String strSubstring = (stackTraceElement.getMethodName() + "                  ").substring(0, 17);
        String str2 = ".(" + stackTraceElement.getFileName() + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + stackTraceElement.getLineNumber() + ")" + "    ".substring(Integer.toString(stackTraceElement.getLineNumber()).length()) + strSubstring;
        System.out.println(str2 + " " + str);
        DebugHandle debugHandle = f18955a;
        if (debugHandle != null) {
            debugHandle.message(str2 + " " + str);
        }
    }
}
