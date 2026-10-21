package com.google.android.gms.internal.measurement;

import androidx.camera.core.processing.f;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.plugin.localstorage.command.SetCommand;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzle {
    public static String zza(zzlc zzlcVar, String str) {
        StringBuilder sbE = f.e("# ", str);
        zzd(zzlcVar, sbE, 0);
        return sbE.toString();
    }

    public static final void zzb(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb2, i10, str, (Map.Entry) it2.next());
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
            sb2.append(zzlz.zza(zzix.zzm((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzix) {
            sb2.append(": \"");
            sb2.append(zzlz.zza((zzix) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzjx) {
            sb2.append(" {");
            zzd((zzjx) obj, sb2, i10 + 2);
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
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i13 = i10 + 2;
        zzb(sb2, i13, "key", entry.getKey());
        zzb(sb2, i13, "value", entry.getValue());
        sb2.append(RootService.LINE_BREAK);
        while (i11 < i10) {
            sb2.append(' ');
            i11++;
        }
        sb2.append("}");
    }

    private static final String zzc(String str) {
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

    private static void zzd(zzlc zzlcVar, StringBuilder sb2, int i10) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : zzlcVar.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String strValueOf = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf2 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 4));
                String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb2, i10, zzc(strConcat), zzjx.zzbC(method2, zzlcVar, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String strValueOf3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf4 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 3));
                String strConcat2 = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb2, i10, zzc(strConcat2), zzjx.zzbC(method3, zzlcVar, new Object[0]));
                }
            }
            if (((Method) map2.get(strSubstring.length() != 0 ? SetCommand.ID.concat(strSubstring) : new String(SetCommand.ID))) != null) {
                if (strSubstring.endsWith("Bytes")) {
                    String strValueOf5 = String.valueOf(strSubstring.substring(0, strSubstring.length() - 5));
                    if (!map.containsKey(strValueOf5.length() != 0 ? "get".concat(strValueOf5) : new String("get"))) {
                    }
                }
                String strValueOf6 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf7 = String.valueOf(strSubstring.substring(1));
                String strConcat3 = strValueOf7.length() != 0 ? strValueOf6.concat(strValueOf7) : new String(strValueOf6);
                Method method4 = (Method) map.get(strSubstring.length() != 0 ? "get".concat(strSubstring) : new String("get"));
                Method method5 = (Method) map.get(strSubstring.length() != 0 ? "has".concat(strSubstring) : new String("has"));
                if (method4 != null) {
                    Object objZzbC = zzjx.zzbC(method4, zzlcVar, new Object[0]);
                    if (method5 == null) {
                        if (objZzbC instanceof Boolean) {
                            if (((Boolean) objZzbC).booleanValue()) {
                                zzb(sb2, i10, zzc(strConcat3), objZzbC);
                            }
                        } else if (objZzbC instanceof Integer) {
                            if (((Integer) objZzbC).intValue() != 0) {
                                zzb(sb2, i10, zzc(strConcat3), objZzbC);
                            }
                        } else if (objZzbC instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZzbC).floatValue()) != 0) {
                                zzb(sb2, i10, zzc(strConcat3), objZzbC);
                            }
                        } else if (!(objZzbC instanceof Double)) {
                            if (objZzbC instanceof String) {
                                zEquals = objZzbC.equals("");
                            } else if (objZzbC instanceof zzix) {
                                zEquals = objZzbC.equals(zzix.zzb);
                            } else if (objZzbC instanceof zzlc) {
                                if (objZzbC != ((zzlc) objZzbC).zzbJ()) {
                                    zzb(sb2, i10, zzc(strConcat3), objZzbC);
                                }
                            } else if (!(objZzbC instanceof Enum) || ((Enum) objZzbC).ordinal() != 0) {
                                zzb(sb2, i10, zzc(strConcat3), objZzbC);
                            }
                            if (!zEquals) {
                                zzb(sb2, i10, zzc(strConcat3), objZzbC);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZzbC).doubleValue()) != 0) {
                            zzb(sb2, i10, zzc(strConcat3), objZzbC);
                        }
                    } else if (((Boolean) zzjx.zzbC(method5, zzlcVar, new Object[0])).booleanValue()) {
                        zzb(sb2, i10, zzc(strConcat3), objZzbC);
                    }
                }
            }
        }
        if (zzlcVar instanceof zzju) {
            throw null;
        }
        zzmc zzmcVar = ((zzjx) zzlcVar).zzc;
        if (zzmcVar != null) {
            zzmcVar.zzg(sb2, i10);
        }
    }
}
