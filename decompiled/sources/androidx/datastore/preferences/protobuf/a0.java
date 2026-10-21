package androidx.datastore.preferences.protobuf;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.plugin.localstorage.command.SetCommand;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: compiled from: MessageLiteToString.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 {
    public static final String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt)) {
                sb2.append(PushConstants.GE_PARAMS_SEPARATOR);
            }
            sb2.append(Character.toLowerCase(cCharAt));
        }
        return sb2.toString();
    }

    public static final void b(StringBuilder sb2, int i10, String str, Object obj) {
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
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(s0.c(ByteString.copyFromUtf8((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb2.append(": \"");
            sb2.append(s0.c((ByteString) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb2.append(" {");
            c((GeneratedMessageLite) obj, sb2, i10 + 2);
            sb2.append(RootService.LINE_BREAK);
            while (i11 < i10) {
                sb2.append(' ');
                i11++;
            }
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj.toString());
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i13 = i10 + 2;
        b(sb2, i13, "key", entry.getKey());
        b(sb2, i13, "value", entry.getValue());
        sb2.append(RootService.LINE_BREAK);
        while (i11 < i10) {
            sb2.append(' ');
            i11++;
        }
        sb2.append("}");
    }

    public static void c(MessageLite messageLite, StringBuilder sb2, int i10) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (java.lang.reflect.Method method : messageLite.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strReplaceFirst = str.replaceFirst("get", "");
            if (strReplaceFirst.endsWith("List") && !strReplaceFirst.endsWith("OrBuilderList") && !strReplaceFirst.equals("List")) {
                String str2 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 4);
                java.lang.reflect.Method method2 = (java.lang.reflect.Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    b(sb2, i10, a(str2), GeneratedMessageLite.g(method2, messageLite, new Object[0]));
                }
            }
            if (strReplaceFirst.endsWith("Map") && !strReplaceFirst.equals("Map")) {
                String str3 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 3);
                java.lang.reflect.Method method3 = (java.lang.reflect.Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb2, i10, a(str3), GeneratedMessageLite.g(method3, messageLite, new Object[0]));
                }
            }
            if (((java.lang.reflect.Method) map2.get(SetCommand.ID.concat(strReplaceFirst))) != null) {
                if (strReplaceFirst.endsWith("Bytes")) {
                    if (map.containsKey("get" + strReplaceFirst.substring(0, strReplaceFirst.length() - 5))) {
                    }
                }
                String str4 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1);
                java.lang.reflect.Method method4 = (java.lang.reflect.Method) map.get("get".concat(strReplaceFirst));
                java.lang.reflect.Method method5 = (java.lang.reflect.Method) map.get("has".concat(strReplaceFirst));
                if (method4 != null) {
                    Object objG = GeneratedMessageLite.g(method4, messageLite, new Object[0]);
                    if (method5 == null) {
                        if (objG instanceof Boolean) {
                            zEquals = !((Boolean) objG).booleanValue();
                        } else if (objG instanceof Integer) {
                            if (((Integer) objG).intValue() != 0) {
                                b(sb2, i10, a(str4), objG);
                            }
                        } else if (objG instanceof Float) {
                            if (((Float) objG).floatValue() != 0.0f) {
                                b(sb2, i10, a(str4), objG);
                            }
                        } else if (objG instanceof Double) {
                            if (((Double) objG).doubleValue() != 0.0d) {
                                b(sb2, i10, a(str4), objG);
                            }
                        } else if (objG instanceof String) {
                            zEquals = objG.equals("");
                        } else if (objG instanceof ByteString) {
                            zEquals = objG.equals(ByteString.EMPTY);
                        } else if (objG instanceof MessageLite) {
                            if (objG != ((MessageLite) objG).getDefaultInstanceForType()) {
                                b(sb2, i10, a(str4), objG);
                            }
                        } else if (!(objG instanceof java.lang.Enum) || ((java.lang.Enum) objG).ordinal() != 0) {
                            b(sb2, i10, a(str4), objG);
                        }
                        if (!zEquals) {
                            b(sb2, i10, a(str4), objG);
                        }
                    } else if (((Boolean) GeneratedMessageLite.g(method5, messageLite, new Object[0])).booleanValue()) {
                        b(sb2, i10, a(str4), objG);
                    }
                }
            }
        }
        if (messageLite instanceof GeneratedMessageLite.ExtendableMessage) {
            Iterator<Map.Entry<T, Object>> itM = ((GeneratedMessageLite.ExtendableMessage) messageLite).extensions.m();
            while (itM.hasNext()) {
                Map.Entry entry = (Map.Entry) itM.next();
                b(sb2, i10, androidx.appcompat.widget.a.c(new StringBuilder(Constant.BRACKET_OPEN), ((GeneratedMessageLite.b) entry.getKey()).f20937q0, Constant.BRACKET_CLOSE), entry.getValue());
            }
        }
        UnknownFieldSetLite unknownFieldSetLite = ((GeneratedMessageLite) messageLite).unknownFields;
        if (unknownFieldSetLite != null) {
            for (int i11 = 0; i11 < unknownFieldSetLite.f21004a; i11++) {
                b(sb2, i10, String.valueOf(WireFormat.getTagFieldNumber(unknownFieldSetLite.f21005b[i11])), unknownFieldSetLite.f21006c[i11]);
            }
        }
    }
}
