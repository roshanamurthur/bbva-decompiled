package com.appsflyer.internal;

import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AFe1xSDK {
    Map<String, Object> AFInAppEventParameterName;
    public volatile String AFInAppEventType;

    @NonNull
    public final AFb1bSDK AFKeystoreWrapper;

    @NonNull
    private final AFe1wSDK afRDLog;

    @Nullable
    public volatile String valueOf;
    private boolean afInfoLog = false;
    public volatile boolean values = false;

    public AFe1xSDK(@NonNull AFb1bSDK aFb1bSDK, @NonNull AFe1wSDK aFe1wSDK) {
        this.AFKeystoreWrapper = aFb1bSDK;
        this.afRDLog = aFe1wSDK;
    }

    private boolean valueOf() {
        Map<String, Object> map = this.AFInAppEventParameterName;
        return (map == null || map.isEmpty()) ? false : true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.appsflyer.internal.AFe1wSDK.3.<init>(com.appsflyer.internal.AFe1wSDK, com.appsflyer.internal.AFe1wSDK$AFa1zSDK):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:309)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:224)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:93)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public final boolean AFInAppEventParameterName() {
        /*
            r13 = this;
            java.lang.String r0 = "com.appsflyer.lvl.AppsFlyerLVL"
            r1 = 0
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L90
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.ClassNotFoundException -> L90
            com.appsflyer.internal.AFe1wSDK r4 = r13.afRDLog     // Catch: java.lang.ClassNotFoundException -> L90
            com.appsflyer.internal.AFb1bSDK r5 = r13.AFKeystoreWrapper     // Catch: java.lang.ClassNotFoundException -> L90
            android.content.Context r5 = r5.AFInAppEventParameterName     // Catch: java.lang.ClassNotFoundException -> L90
            com.appsflyer.internal.AFe1xSDK$4 r6 = new com.appsflyer.internal.AFe1xSDK$4     // Catch: java.lang.ClassNotFoundException -> L90
            r6.<init>()     // Catch: java.lang.ClassNotFoundException -> L90
            r7 = 1
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.String r8 = "com.appsflyer.lvl.AppsFlyerLVL$resultListener"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.String r9 = "checkLicense"
            r10 = 3
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.Class r12 = java.lang.Long.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            r11[r1] = r12     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.Class<android.content.Context> r12 = android.content.Context.class
            r11[r7] = r12     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            r12 = 2
            r11[r12] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.reflect.Method r0 = r0.getMethod(r9, r11)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            com.appsflyer.internal.AFe1wSDK$3 r9 = new com.appsflyer.internal.AFe1wSDK$3     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            r9.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.ClassLoader r4 = r8.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.Class[] r11 = new java.lang.Class[r7]     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            r11[r1] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.Object r4 = java.lang.reflect.Proxy.newProxyInstance(r4, r11, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.Object[] r8 = new java.lang.Object[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            r8[r1] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            r8[r7] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            r8[r12] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            r2 = 0
            r0.invoke(r2, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            goto L8d
        L56:
            r0 = move-exception
            goto L5e
        L58:
            r0 = move-exception
            goto L6a
        L5a:
            r0 = move-exception
            goto L76
        L5c:
            r0 = move-exception
            goto L82
        L5e:
            java.lang.Class r2 = r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L90
            java.lang.String r2 = r2.getSimpleName()     // Catch: java.lang.ClassNotFoundException -> L90
            r6.valueOf(r2, r0)     // Catch: java.lang.ClassNotFoundException -> L90
            goto L8d
        L6a:
            java.lang.Class r2 = r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L90
            java.lang.String r2 = r2.getSimpleName()     // Catch: java.lang.ClassNotFoundException -> L90
            r6.valueOf(r2, r0)     // Catch: java.lang.ClassNotFoundException -> L90
            goto L8d
        L76:
            java.lang.Class r2 = r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L90
            java.lang.String r2 = r2.getSimpleName()     // Catch: java.lang.ClassNotFoundException -> L90
            r6.valueOf(r2, r0)     // Catch: java.lang.ClassNotFoundException -> L90
            goto L8d
        L82:
            java.lang.Class r2 = r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L90
            java.lang.String r2 = r2.getSimpleName()     // Catch: java.lang.ClassNotFoundException -> L90
            r6.valueOf(r2, r0)     // Catch: java.lang.ClassNotFoundException -> L90
        L8d:
            r13.afInfoLog = r7     // Catch: java.lang.ClassNotFoundException -> L90
            goto L92
        L90:
            r13.afInfoLog = r1
        L92:
            boolean r0 = r13.afInfoLog
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1xSDK.AFInAppEventParameterName():boolean");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    @Nullable
    public final String AFInAppEventType(AFb1fSDK aFb1fSDK) {
        String str;
        boolean z10 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        String strValueOf = aFb1fSDK.valueOf("imeiCached", (String) null);
        if (z10 && AFb1vSDK.AFInAppEventParameterName(this.valueOf)) {
            Context context = this.AFKeystoreWrapper.AFInAppEventParameterName;
            if (context == null || !AFInAppEventParameterName(context)) {
                str = null;
            } else {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    str = (String) telephonyManager.getClass().getMethod("getDeviceId", new Class[0]).invoke(telephonyManager, new Object[0]);
                    if (str == null) {
                        if (strValueOf != null) {
                            AFLogger.afDebugLog("use cached IMEI: ".concat(strValueOf));
                        } else {
                            strValueOf = null;
                        }
                        str = strValueOf;
                    }
                } catch (InvocationTargetException e5) {
                    if (strValueOf != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(strValueOf));
                    } else {
                        strValueOf = null;
                    }
                    StringBuilder sb2 = new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
                    sb2.append(e5.getMessage());
                    AFLogger.afErrorLog(sb2.toString(), e5);
                } catch (Exception e7) {
                    if (strValueOf != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(strValueOf));
                    } else {
                        strValueOf = null;
                    }
                    StringBuilder sb3 = new StringBuilder("WARNING: Can't collect IMEI: other reason: ");
                    sb3.append(e7.getMessage());
                    AFLogger.afErrorLog(sb3.toString(), e7);
                }
            }
        } else if (this.valueOf != null) {
            str = this.valueOf;
        } else {
            str = null;
        }
        if (AFb1vSDK.AFInAppEventParameterName(str)) {
            AFLogger.afInfoLog("IMEI was not collected.");
            return null;
        }
        aFb1fSDK.values("imeiCached", str);
        return str;
    }

    @NonNull
    public final Map<String, Object> AFKeystoreWrapper() {
        HashMap map = new HashMap();
        if (valueOf()) {
            map.put("lvl", this.AFInAppEventParameterName);
        } else if (this.afInfoLog) {
            HashMap map2 = new HashMap();
            this.AFInAppEventParameterName = map2;
            map2.put("error", "operation timed out.");
            map.put("lvl", this.AFInAppEventParameterName);
        }
        return map;
    }

    public final boolean values() {
        return this.values;
    }

    private static boolean AFInAppEventParameterName(Context context) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        AFa1dSDK.valueOf();
        return !AFa1dSDK.AFKeystoreWrapper(context);
    }

    public final boolean AFInAppEventType() {
        return this.afInfoLog && !valueOf();
    }
}
