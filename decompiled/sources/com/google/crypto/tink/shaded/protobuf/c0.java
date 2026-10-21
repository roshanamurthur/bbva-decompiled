package com.google.crypto.tink.shaded.protobuf;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.plugin.localstorage.command.SetCommand;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: compiled from: MessageLiteToString.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f47186a;

    static {
        char[] cArr = new char[80];
        f47186a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f47186a, 0, i11);
            i10 -= i11;
        }
    }

    public static void b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        a(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append(PushConstants.GE_PARAMS_SEPARATOR);
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(u0.a(ByteString.copyFromUtf8((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb2.append(": \"");
            sb2.append(u0.a((ByteString) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb2.append(" {");
            c((GeneratedMessageLite) obj, sb2, i10 + 2);
            sb2.append(RootService.LINE_BREAK);
            a(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i12 = i10 + 2;
        b(sb2, i12, "key", entry.getKey());
        b(sb2, i12, "value", entry.getValue());
        sb2.append(RootService.LINE_BREAK);
        a(i10, sb2);
        sb2.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:105:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:63:0x015a  */
    /* JADX WARN: Code duplicated, block: B:65:0x016c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0174  */
    /* JADX WARN: Code duplicated, block: B:69:0x0178  */
    /* JADX WARN: Code duplicated, block: B:70:0x0182  */
    /* JADX WARN: Code duplicated, block: B:72:0x0186  */
    /* JADX WARN: Code duplicated, block: B:75:0x0190  */
    /* JADX WARN: Code duplicated, block: B:77:0x0194  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d1  */
    public static void c(MessageLite messageLite, StringBuilder sb2, int i10) {
        int i11;
        int i12;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        Object objI;
        boolean zEquals;
        java.lang.reflect.Method method3;
        java.lang.reflect.Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        java.lang.reflect.Method[] declaredMethods = messageLite.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i11 = 3;
            if (i13 >= length) {
                break;
            }
            java.lang.reflect.Method method5 = declaredMethods[i13];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith(SetCommand.ID)) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method4 = (java.lang.reflect.Method) entry.getValue()) == null || !method4.getReturnType().equals(List.class)) {
                if (!strSubstring.endsWith("Map") || strSubstring.equals("Map") || (method3 = (java.lang.reflect.Method) entry.getValue()) == null || !method3.getReturnType().equals(Map.class) || method3.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method3.getModifiers())) {
                    i12 = 3;
                    if (hashSet.contains(SetCommand.ID.concat(strSubstring))) {
                        if (strSubstring.endsWith("Bytes")) {
                            if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                                method = (java.lang.reflect.Method) entry.getValue();
                                method2 = (java.lang.reflect.Method) map.get("has".concat(strSubstring));
                                if (method != null) {
                                    objI = GeneratedMessageLite.i(method, messageLite, new Object[0]);
                                    if (method2 == null) {
                                        if (objI instanceof Boolean) {
                                            zEquals = !((Boolean) objI).booleanValue();
                                        } else if (objI instanceof Integer) {
                                            if (((Integer) objI).intValue() != 0) {
                                                b(sb2, i10, strSubstring, objI);
                                            }
                                        } else if (objI instanceof Float) {
                                            if (Float.floatToRawIntBits(((Float) objI).floatValue()) != 0) {
                                                b(sb2, i10, strSubstring, objI);
                                            }
                                        } else if (objI instanceof Double) {
                                            if (Double.doubleToRawLongBits(((Double) objI).doubleValue()) != 0) {
                                                b(sb2, i10, strSubstring, objI);
                                            }
                                        } else if (objI instanceof String) {
                                            zEquals = objI.equals("");
                                        } else if (objI instanceof ByteString) {
                                            zEquals = objI.equals(ByteString.EMPTY);
                                        } else if ((objI instanceof MessageLite) ? !(objI instanceof java.lang.Enum) || ((java.lang.Enum) objI).ordinal() != 0 : objI != ((MessageLite) objI).getDefaultInstanceForType()) {
                                            b(sb2, i10, strSubstring, objI);
                                        }
                                        if (!zEquals) {
                                            b(sb2, i10, strSubstring, objI);
                                        }
                                    } else if (((Boolean) GeneratedMessageLite.i(method2, messageLite, new Object[0])).booleanValue()) {
                                        b(sb2, i10, strSubstring, objI);
                                    }
                                }
                            }
                        } else {
                            method = (java.lang.reflect.Method) entry.getValue();
                            method2 = (java.lang.reflect.Method) map.get("has".concat(strSubstring));
                            if (method != null) {
                                objI = GeneratedMessageLite.i(method, messageLite, new Object[0]);
                                if (method2 == null) {
                                    if (objI instanceof Boolean) {
                                        zEquals = !((Boolean) objI).booleanValue();
                                    } else if (objI instanceof Integer) {
                                        if (((Integer) objI).intValue() != 0) {
                                            b(sb2, i10, strSubstring, objI);
                                        }
                                    } else if (objI instanceof Float) {
                                        if (Float.floatToRawIntBits(((Float) objI).floatValue()) != 0) {
                                            b(sb2, i10, strSubstring, objI);
                                        }
                                    } else if (objI instanceof Double) {
                                        if (Double.doubleToRawLongBits(((Double) objI).doubleValue()) != 0) {
                                            b(sb2, i10, strSubstring, objI);
                                        }
                                    } else if (objI instanceof String) {
                                        zEquals = objI.equals("");
                                    } else if (objI instanceof ByteString) {
                                        zEquals = objI.equals(ByteString.EMPTY);
                                    } else if (objI instanceof MessageLite) {
                                        b(sb2, i10, strSubstring, objI);
                                    } else {
                                        b(sb2, i10, strSubstring, objI);
                                    }
                                    if (!zEquals) {
                                        b(sb2, i10, strSubstring, objI);
                                    }
                                } else if (((Boolean) GeneratedMessageLite.i(method2, messageLite, new Object[0])).booleanValue()) {
                                    b(sb2, i10, strSubstring, objI);
                                }
                            }
                        }
                    }
                } else {
                    i12 = 3;
                    b(sb2, i10, androidx.databinding.e.c(strSubstring, 3, 0), GeneratedMessageLite.i(method3, messageLite, new Object[0]));
                }
                i11 = i12;
            } else {
                b(sb2, i10, androidx.databinding.e.c(strSubstring, 4, 0), GeneratedMessageLite.i(method4, messageLite, new Object[0]));
                i11 = 3;
            }
        }
        if (messageLite instanceof GeneratedMessageLite.ExtendableMessage) {
            Iterator<Map.Entry<T, Object>> itM = ((GeneratedMessageLite.ExtendableMessage) messageLite).extensions.m();
            while (itM.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itM.next();
                b(sb2, i10, androidx.appcompat.widget.a.c(new StringBuilder(Constant.BRACKET_OPEN), ((GeneratedMessageLite.b) entry2.getKey()).f47100q0, Constant.BRACKET_CLOSE), entry2.getValue());
            }
        }
        UnknownFieldSetLite unknownFieldSetLite = ((GeneratedMessageLite) messageLite).unknownFields;
        if (unknownFieldSetLite != null) {
            for (int i14 = 0; i14 < unknownFieldSetLite.f47168a; i14++) {
                b(sb2, i10, String.valueOf(WireFormat.getTagFieldNumber(unknownFieldSetLite.f47169b[i14])), unknownFieldSetLite.f47170c[i14]);
            }
        }
    }
}
