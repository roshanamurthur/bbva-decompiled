package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.g0;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.notifications.constants.PushConstants;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"LogConditional"})
public class Debug {
    public static void dumpLayoutParams(ViewGroup viewGroup, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + stackTraceElement.getLineNumber() + ") " + str + "  ";
        int childCount = viewGroup.getChildCount();
        System.out.println(str + " children " + childCount);
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            PrintStream printStream = System.out;
            StringBuilder sbE = androidx.camera.core.processing.f.e(str2, "     ");
            sbE.append(getName(childAt));
            printStream.println(sbE.toString());
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            for (Field field : layoutParams.getClass().getFields()) {
                try {
                    Object obj = field.get(layoutParams);
                    if (field.getName().contains("To") && !obj.toString().equals("-1")) {
                        System.out.println(str2 + "       " + field.getName() + " " + obj);
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static void dumpPoc(Object obj) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str = ".(" + stackTraceElement.getFileName() + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + stackTraceElement.getLineNumber() + ")";
        Class<?> cls = obj.getClass();
        PrintStream printStream = System.out;
        StringBuilder sbE = androidx.camera.core.processing.f.e(str, "------------- ");
        sbE.append(cls.getName());
        sbE.append(" --------------------");
        printStream.println(sbE.toString());
        for (Field field : cls.getFields()) {
            try {
                Object obj2 = field.get(obj);
                if (field.getName().startsWith("layout_constraint") && ((!(obj2 instanceof Integer) || !obj2.toString().equals("-1")) && ((!(obj2 instanceof Integer) || !obj2.toString().equals("0")) && ((!(obj2 instanceof Float) || !obj2.toString().equals("1.0")) && (!(obj2 instanceof Float) || !obj2.toString().equals("0.5")))))) {
                    System.out.println(str + "    " + field.getName() + " " + obj2);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        PrintStream printStream2 = System.out;
        StringBuilder sbE2 = androidx.camera.core.processing.f.e(str, "------------- ");
        sbE2.append(cls.getSimpleName());
        sbE2.append(" --------------------");
        printStream2.println(sbE2.toString());
    }

    public static String getActionType(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        for (Field field : MotionEvent.class.getFields()) {
            try {
                if (Modifier.isStatic(field.getModifiers()) && field.getType().equals(Integer.TYPE) && field.getInt(null) == action) {
                    return field.getName();
                }
            } catch (IllegalAccessException unused) {
            }
        }
        return "---";
    }

    public static String getCallFrom(int i10) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[i10 + 2];
        return ".(" + stackTraceElement.getFileName() + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + stackTraceElement.getLineNumber() + ")";
    }

    public static String getLoc() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String getLocation() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + stackTraceElement.getLineNumber() + ")";
    }

    public static String getLocation2() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        return ".(" + stackTraceElement.getFileName() + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + stackTraceElement.getLineNumber() + ")";
    }

    public static String getName(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static String getState(MotionLayout motionLayout, int i10) {
        return getState(motionLayout, i10, -1);
    }

    public static void logStack(String str, String str2, int i10) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(i10, stackTrace.length - 1);
        String str3 = " ";
        for (int i11 = 1; i11 <= iMin; i11++) {
            StackTraceElement stackTraceElement = stackTrace[i11];
            StringBuilder sb2 = new StringBuilder(".(");
            sb2.append(stackTrace[i11].getFileName());
            sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
            sb2.append(stackTrace[i11].getLineNumber());
            sb2.append(") ");
            sb2.append(stackTrace[i11].getMethodName());
            str3 = str3 + " ";
        }
    }

    public static void printStack(String str, int i10) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(i10, stackTrace.length - 1);
        String strF = " ";
        for (int i11 = 1; i11 <= iMin; i11++) {
            StackTraceElement stackTraceElement = stackTrace[i11];
            String str2 = ".(" + stackTrace[i11].getFileName() + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + stackTrace[i11].getLineNumber() + ") ";
            strF = u.f(strF, " ");
            System.out.println(str + strF + str2 + strF);
        }
    }

    public static String getState(MotionLayout motionLayout, int i10, int i11) {
        int length;
        if (i10 == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = motionLayout.getContext().getResources().getResourceEntryName(i10);
        if (i11 == -1) {
            return resourceEntryName;
        }
        if (resourceEntryName.length() > i11) {
            resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
        }
        if (resourceEntryName.length() <= i11 || (length = resourceEntryName.replaceAll("[^_]", "").length()) <= 0) {
            return resourceEntryName;
        }
        return resourceEntryName.replaceAll(CharBuffer.allocate((resourceEntryName.length() - i11) / length).toString().replace((char) 0, '.') + PushConstants.GE_PARAMS_SEPARATOR, PushConstants.GE_PARAMS_SEPARATOR);
    }

    public static String getName(Context context, int i10) {
        if (i10 == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i10);
        } catch (Exception unused) {
            return g0.c("?", i10);
        }
    }

    public static String getName(Context context, int[] iArr) {
        String resourceEntryName;
        try {
            String str = iArr.length + Constant.BRACKET_OPEN;
            int i10 = 0;
            while (i10 < iArr.length) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(i10 == 0 ? "" : " ");
                String string = sb2.toString();
                try {
                    resourceEntryName = context.getResources().getResourceEntryName(iArr[i10]);
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = "? " + iArr[i10] + " ";
                }
                str = string + resourceEntryName;
                i10++;
            }
            return str + Constant.BRACKET_CLOSE;
        } catch (Exception e5) {
            e5.toString();
            return "UNKNOWN";
        }
    }

    public static void dumpLayoutParams(ViewGroup.LayoutParams layoutParams, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + stackTraceElement.getLineNumber() + ") " + str + "  ";
        PrintStream printStream = System.out;
        StringBuilder sbD = ci.a.d(" >>>>>>>>>>>>>>>>>>. dump ", str2, "  ");
        sbD.append(layoutParams.getClass().getName());
        printStream.println(sbD.toString());
        for (Field field : layoutParams.getClass().getFields()) {
            try {
                Object obj = field.get(layoutParams);
                String name = field.getName();
                if (name.contains("To") && !obj.toString().equals("-1")) {
                    System.out.println(str2 + "       " + name + " " + obj);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(" <<<<<<<<<<<<<<<<< dump " + str2);
    }
}
