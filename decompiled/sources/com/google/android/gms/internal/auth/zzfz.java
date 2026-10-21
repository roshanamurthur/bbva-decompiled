package com.google.android.gms.internal.auth;

import androidx.camera.core.processing.f;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.plugin.localstorage.command.SetCommand;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfz {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzfx zzfxVar, String str) {
        StringBuilder sbE = f.e("# ", str);
        zzd(zzfxVar, sbE, 0);
        return sbE.toString();
    }

    public static void zzb(StringBuilder sb2, int i10, String str, Object obj) {
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
        zzc(i10, sb2);
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
            sb2.append(zzgx.zza(new zzec(((String) obj).getBytes(zzfa.zzb))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzef) {
            sb2.append(": \"");
            sb2.append(zzgx.zza((zzef) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzev) {
            sb2.append(" {");
            zzd((zzev) obj, sb2, i10 + 2);
            sb2.append(RootService.LINE_BREAK);
            zzc(i10, sb2);
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
        zzb(sb2, i12, "key", entry.getKey());
        zzb(sb2, i12, "value", entry.getValue());
        sb2.append(RootService.LINE_BREAK);
        zzc(i10, sb2);
        sb2.append("}");
    }

    private static void zzc(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(zza, 0, i11);
            i10 -= i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    private static void zzd(zzfx zzfxVar, StringBuilder sb2, int i10) {
        int i11;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzfxVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith(SetCommand.ID)) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb2, i10, strSubstring.substring(0, strSubstring.length() - 4), zzev.zzg(method2, zzfxVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb2, i10, strSubstring.substring(0, strSubstring.length() - 3), zzev.zzg(method, zzfxVar, new Object[0]));
            } else if (hashSet.contains(SetCommand.ID.concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZzg = zzev.zzg(method4, zzfxVar, new Object[0]);
                    if (method5 == null) {
                        if (objZzg instanceof Boolean) {
                            if (((Boolean) objZzg).booleanValue()) {
                                zzb(sb2, i10, strSubstring, objZzg);
                            }
                        } else if (objZzg instanceof Integer) {
                            if (((Integer) objZzg).intValue() != 0) {
                                zzb(sb2, i10, strSubstring, objZzg);
                            }
                        } else if (objZzg instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZzg).floatValue()) != 0) {
                                zzb(sb2, i10, strSubstring, objZzg);
                            }
                        } else if (!(objZzg instanceof Double)) {
                            if (objZzg instanceof String) {
                                zEquals = objZzg.equals("");
                            } else if (objZzg instanceof zzef) {
                                zEquals = objZzg.equals(zzef.zzb);
                            } else if (objZzg instanceof zzfx) {
                                if (objZzg != ((zzfx) objZzg).zze()) {
                                    zzb(sb2, i10, strSubstring, objZzg);
                                }
                            } else if (!(objZzg instanceof Enum) || ((Enum) objZzg).ordinal() != 0) {
                                zzb(sb2, i10, strSubstring, objZzg);
                            }
                            if (!zEquals) {
                                zzb(sb2, i10, strSubstring, objZzg);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZzg).doubleValue()) != 0) {
                            zzb(sb2, i10, strSubstring, objZzg);
                        }
                    } else if (((Boolean) zzev.zzg(method5, zzfxVar, new Object[0])).booleanValue()) {
                        zzb(sb2, i10, strSubstring, objZzg);
                    }
                }
            }
            i11 = 3;
        }
        if (zzfxVar instanceof zzeu) {
            throw null;
        }
        zzha zzhaVar = ((zzev) zzfxVar).zzc;
        if (zzhaVar != null) {
            zzhaVar.zzg(sb2, i10);
        }
    }
}
