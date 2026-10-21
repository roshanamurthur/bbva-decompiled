package com.google.android.gms.internal.wearable;

import androidx.webkit.ProxyConfig;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.plugin.localstorage.command.SetCommand;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public final class zzu {
    private static void zza(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException, InvocationTargetException {
        if (obj != null) {
            if (!(obj instanceof zzt)) {
                String strZzh = zzh(str);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(strZzh);
                stringBuffer2.append(": ");
                if (obj instanceof String) {
                    String strConcat = (String) obj;
                    if (!strConcat.startsWith(ProxyConfig.MATCH_HTTP) && strConcat.length() > 200) {
                        strConcat = String.valueOf(strConcat.substring(0, 200)).concat("[...]");
                    }
                    int length = strConcat.length();
                    StringBuilder sb2 = new StringBuilder(length);
                    for (int i10 = 0; i10 < length; i10++) {
                        char cCharAt = strConcat.charAt(i10);
                        if (cCharAt < ' ' || cCharAt > '~' || cCharAt == '\"' || cCharAt == '\'') {
                            sb2.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                        } else {
                            sb2.append(cCharAt);
                        }
                    }
                    String string = sb2.toString();
                    stringBuffer2.append("\"");
                    stringBuffer2.append(string);
                    stringBuffer2.append("\"");
                } else if (obj instanceof byte[]) {
                    stringBuffer2.append('\"');
                    for (byte b10 : (byte[]) obj) {
                        int i11 = b10 & 255;
                        if (i11 == 92 || i11 == 34) {
                            stringBuffer2.append(AbstractJsonLexerKt.STRING_ESC);
                            stringBuffer2.append((char) i11);
                        } else if (i11 < 32 || i11 >= 127) {
                            stringBuffer2.append(String.format("\\%03o", Integer.valueOf(i11)));
                        } else {
                            stringBuffer2.append((char) i11);
                        }
                    }
                    stringBuffer2.append('\"');
                } else {
                    stringBuffer2.append(obj);
                }
                stringBuffer2.append(RootService.LINE_BREAK);
                return;
            }
            int length2 = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(zzh(str));
                stringBuffer2.append(" <\n");
                stringBuffer.append("  ");
            }
            Class<?> cls = obj.getClass();
            for (Field field : cls.getFields()) {
                int modifiers = field.getModifiers();
                String name = field.getName();
                if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith(PushConstants.GE_PARAMS_SEPARATOR) && !name.endsWith(PushConstants.GE_PARAMS_SEPARATOR)) {
                    Class<?> type = field.getType();
                    Object obj2 = field.get(obj);
                    if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                        zza(name, obj2, stringBuffer, stringBuffer2);
                    } else {
                        int length3 = obj2 == null ? 0 : Array.getLength(obj2);
                        for (int i12 = 0; i12 < length3; i12++) {
                            zza(name, Array.get(obj2, i12), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            for (Method method : cls.getMethods()) {
                String name2 = method.getName();
                if (name2.startsWith(SetCommand.ID)) {
                    String strSubstring = name2.substring(3);
                    try {
                        String strValueOf = String.valueOf(strSubstring);
                        if (((Boolean) cls.getMethod(strValueOf.length() != 0 ? "has".concat(strValueOf) : new String("has"), new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                            String strValueOf2 = String.valueOf(strSubstring);
                            zza(strSubstring, cls.getMethod(strValueOf2.length() != 0 ? "get".concat(strValueOf2) : new String("get"), new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
            }
            if (str != null) {
                stringBuffer.setLength(length2);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
            }
        }
    }

    public static <T extends zzt> String zzc(T t10) {
        if (t10 == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            zza(null, t10, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e5) {
            String strValueOf = String.valueOf(e5.getMessage());
            return strValueOf.length() != 0 ? "Error printing proto: ".concat(strValueOf) : new String("Error printing proto: ");
        } catch (InvocationTargetException e7) {
            String strValueOf2 = String.valueOf(e7.getMessage());
            return strValueOf2.length() != 0 ? "Error printing proto: ".concat(strValueOf2) : new String("Error printing proto: ");
        }
    }

    private static String zzh(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (i10 == 0) {
                stringBuffer.append(Character.toLowerCase(cCharAt));
            } else if (Character.isUpperCase(cCharAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(cCharAt));
            } else {
                stringBuffer.append(cCharAt);
            }
        }
        return stringBuffer.toString();
    }
}
