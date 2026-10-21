package com.appsflyer.internal;

import android.os.Build;
import android.view.View;
import androidx.annotation.WorkerThread;
import androidx.appcompat.widget.w1;
import androidx.appcompat.widget.x1;
import androidx.camera.core.z;
import bk.p;
import bk.q;
import com.appsflyer.AFLogger;
import com.appsflyer.CreateOneLinkHttpTask;
import com.bbva.ethermobilesdk.devicechecker.emulator.EmulatorApi;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SqlContracts;
import com.nulabinc.zxcvbn.Guess;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFc1wSDK implements AFc1vSDK {
    private static char AFLogger$LogLevel = 18427;
    private static int AFVersionDeclaration = 1;
    private static char afErrorLog = 3476;
    private static int afErrorLogForExcManagerOnly = 0;
    private static char afWarnLog = 13891;
    private static char getLevel = 44979;

    @NotNull
    private AFc1zSDK AFInAppEventParameterName;

    @NotNull
    private final Lazy AFInAppEventType;

    @NotNull
    private final Lazy AFKeystoreWrapper;

    @NotNull
    private final Lazy AFLogger;

    @NotNull
    private final String afDebugLog;

    @NotNull
    private final Lazy afInfoLog;

    @NotNull
    private final Lazy afRDLog;

    @NotNull
    private final Lazy valueOf;

    @NotNull
    private final Lazy values;

    public AFc1wSDK(@NotNull AFc1zSDK aFc1zSDK) {
        Intrinsics.checkNotNullParameter(aFc1zSDK, "");
        this.AFInAppEventParameterName = aFc1zSDK;
        this.valueOf = LazyKt__LazyJVMKt.lazy(new Function0<AFc1tSDK>() { // from class: com.appsflyer.internal.AFc1wSDK.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
            public final AFc1tSDK invoke() {
                AFc1tSDK aFc1tSDKAfDebugLog = AFc1wSDK.AFKeystoreWrapper(AFc1wSDK.this).afDebugLog();
                Intrinsics.checkNotNullExpressionValue(aFc1tSDKAfDebugLog, "");
                return aFc1tSDKAfDebugLog;
            }
        });
        this.values = LazyKt__LazyJVMKt.lazy(new Function0<AFb1cSDK>() { // from class: com.appsflyer.internal.AFc1wSDK.4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
            public final AFb1cSDK invoke() {
                AFb1cSDK aFb1cSDKAFInAppEventParameterName = AFc1wSDK.AFKeystoreWrapper(AFc1wSDK.this).AFInAppEventParameterName();
                Intrinsics.checkNotNullExpressionValue(aFb1cSDKAFInAppEventParameterName, "");
                return aFb1cSDKAFInAppEventParameterName;
            }
        });
        this.AFKeystoreWrapper = LazyKt__LazyJVMKt.lazy(new Function0<AFb1fSDK>() { // from class: com.appsflyer.internal.AFc1wSDK.3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
            public final AFb1fSDK invoke() {
                AFb1fSDK aFb1fSDKAFKeystoreWrapper = AFc1wSDK.AFKeystoreWrapper(AFc1wSDK.this).AFKeystoreWrapper();
                Intrinsics.checkNotNullExpressionValue(aFb1fSDKAFKeystoreWrapper, "");
                return aFb1fSDKAFKeystoreWrapper;
            }
        });
        this.AFInAppEventType = LazyKt__LazyJVMKt.lazy(new Function0<AFe1xSDK>() { // from class: com.appsflyer.internal.AFc1wSDK.10
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
            public final AFe1xSDK invoke() {
                AFe1xSDK aFe1xSDKAFVersionDeclaration = AFc1wSDK.AFKeystoreWrapper(AFc1wSDK.this).AFVersionDeclaration();
                Intrinsics.checkNotNullExpressionValue(aFe1xSDKAFVersionDeclaration, "");
                return aFe1xSDKAFVersionDeclaration;
            }
        });
        this.afRDLog = LazyKt__LazyJVMKt.lazy(new Function0<ExecutorService>() { // from class: com.appsflyer.internal.AFc1wSDK.5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
            public final ExecutorService invoke() {
                ExecutorService executorServiceValueOf = AFc1wSDK.AFKeystoreWrapper(AFc1wSDK.this).valueOf();
                Intrinsics.checkNotNullExpressionValue(executorServiceValueOf, "");
                return executorServiceValueOf;
            }
        });
        this.afDebugLog = "6.12.1";
        this.AFLogger = LazyKt__LazyJVMKt.lazy(new Function0<AFa1cSDK>() { // from class: com.appsflyer.internal.AFc1wSDK.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
            public final AFa1cSDK invoke() {
                AFb1bSDK aFb1bSDKOnAppOpenAttributionNative = AFc1wSDK.AFKeystoreWrapper(AFc1wSDK.this).onAppOpenAttributionNative();
                Intrinsics.checkNotNullExpressionValue(aFb1bSDKOnAppOpenAttributionNative, "");
                return new AFa1cSDK(aFb1bSDKOnAppOpenAttributionNative);
            }
        });
        this.afInfoLog = LazyKt__LazyJVMKt.lazy(new Function0<CreateOneLinkHttpTask>() { // from class: com.appsflyer.internal.AFc1wSDK.6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
            public final CreateOneLinkHttpTask invoke() {
                return new CreateOneLinkHttpTask(AFc1wSDK.this.valueOf());
            }
        });
    }

    private final AFc1tSDK AFInAppEventParameterName() {
        int i10 = AFVersionDeclaration + 93;
        afErrorLogForExcManagerOnly = i10 % 128;
        int i11 = i10 % 2;
        AFc1tSDK aFc1tSDK = (AFc1tSDK) this.valueOf.getValue();
        int i12 = AFVersionDeclaration + 91;
        afErrorLogForExcManagerOnly = i12 % 128;
        int i13 = i12 % 2;
        return aFc1tSDK;
    }

    public static final /* synthetic */ AFc1zSDK AFKeystoreWrapper(AFc1wSDK aFc1wSDK) {
        int i10 = AFVersionDeclaration + 79;
        int i11 = i10 % 128;
        afErrorLogForExcManagerOnly = i11;
        int i12 = i10 % 2;
        AFc1zSDK aFc1zSDK = aFc1wSDK.AFInAppEventParameterName;
        if (i12 != 0) {
            int i13 = 29 / 0;
        }
        int i14 = i11 + 113;
        AFVersionDeclaration = i14 % 128;
        int i15 = i14 % 2;
        return aFc1zSDK;
    }

    private final AFb1fSDK AFLogger() {
        int i10 = afErrorLogForExcManagerOnly + 79;
        AFVersionDeclaration = i10 % 128;
        if (i10 % 2 != 0) {
            return (AFb1fSDK) this.AFKeystoreWrapper.getValue();
        }
        int i11 = 76 / 0;
        return (AFb1fSDK) this.AFKeystoreWrapper.getValue();
    }

    @NotNull
    private AFc1uSDK AFLogger$LogLevel() {
        int i10 = afErrorLogForExcManagerOnly + 49;
        AFVersionDeclaration = i10 % 128;
        if (i10 % 2 != 0) {
            return (AFc1uSDK) this.afInfoLog.getValue();
        }
        int i11 = 30 / 0;
        return (AFc1uSDK) this.afInfoLog.getValue();
    }

    private final synchronized void AFVersionDeclaration() {
        AFe1pSDK aFe1pSDKAfErrorLogForExcManagerOnly = afErrorLogForExcManagerOnly();
        if (aFe1pSDKAfErrorLogForExcManagerOnly != null) {
            if (aFe1pSDKAfErrorLogForExcManagerOnly.AFKeystoreWrapper == -1) {
                int i10 = afErrorLogForExcManagerOnly + 41;
                AFVersionDeclaration = i10 % 128;
                int i11 = i10 % 2;
                AFLogger().AFInAppEventType("af_send_exc_to_server_window");
                return;
            }
            if (AFLogger().values("af_send_exc_to_server_window", -1L) == -1) {
                int i12 = aFe1pSDKAfErrorLogForExcManagerOnly.values;
                long jCurrentTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(aFe1pSDKAfErrorLogForExcManagerOnly.AFKeystoreWrapper);
                AFb1fSDK aFb1fSDKAFLogger = AFLogger();
                aFb1fSDKAFLogger.AFInAppEventType("af_send_exc_to_server_window", jCurrentTimeMillis);
                aFb1fSDKAFLogger.valueOf("af_send_exc_min", i12);
                int i13 = afErrorLogForExcManagerOnly + 61;
                AFVersionDeclaration = i13 % 128;
                int i14 = i13 % 2;
            }
        }
    }

    @NotNull
    private String afDebugLog() {
        int i10 = afErrorLogForExcManagerOnly + 17;
        int i11 = i10 % 128;
        AFVersionDeclaration = i11;
        int i12 = i10 % 2;
        String str = this.afDebugLog;
        int i13 = i11 + 65;
        afErrorLogForExcManagerOnly = i13 % 128;
        int i14 = i13 % 2;
        return str;
    }

    private final AFb1cSDK afErrorLog() {
        int i10 = AFVersionDeclaration + 103;
        afErrorLogForExcManagerOnly = i10 % 128;
        int i11 = i10 % 2;
        AFb1cSDK aFb1cSDK = (AFb1cSDK) this.values.getValue();
        int i12 = AFVersionDeclaration + 91;
        afErrorLogForExcManagerOnly = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 2 / 0;
        }
        return aFb1cSDK;
    }

    private final AFe1pSDK afErrorLogForExcManagerOnly() {
        AFe1mSDK aFe1mSDK;
        int i10 = afErrorLogForExcManagerOnly + 95;
        AFVersionDeclaration = i10 % 128;
        if (i10 % 2 == 0) {
            AFInAppEventParameterName().valueOf();
            throw null;
        }
        AFf1vSDK aFf1vSDKValueOf = AFInAppEventParameterName().valueOf();
        if (aFf1vSDKValueOf == null || (aFe1mSDK = aFf1vSDKValueOf.AFInAppEventType) == null) {
            return null;
        }
        int i11 = AFVersionDeclaration + 59;
        afErrorLogForExcManagerOnly = i11 % 128;
        int i12 = i11 % 2;
        AFe1pSDK aFe1pSDK = aFe1mSDK.values;
        if (i12 != 0) {
            int i13 = 83 / 0;
        }
        return aFe1pSDK;
    }

    private final AFe1xSDK afInfoLog() {
        int i10 = AFVersionDeclaration + 73;
        afErrorLogForExcManagerOnly = i10 % 128;
        if (i10 % 2 == 0) {
            return (AFe1xSDK) this.AFInAppEventType.getValue();
        }
        int i11 = 96 / 0;
        return (AFe1xSDK) this.AFInAppEventType.getValue();
    }

    private final ExecutorService afRDLog() {
        int i10 = AFVersionDeclaration + 39;
        afErrorLogForExcManagerOnly = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        ExecutorService executorService = (ExecutorService) this.afRDLog.getValue();
        int i11 = afErrorLogForExcManagerOnly + 101;
        AFVersionDeclaration = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 28 / 0;
        }
        return executorService;
    }

    private final void afWarnLog() {
        String str;
        int i10 = AFVersionDeclaration + 35;
        afErrorLogForExcManagerOnly = i10 % 128;
        if (i10 % 2 != 0) {
            afErrorLogForExcManagerOnly();
            throw null;
        }
        AFe1pSDK aFe1pSDKAfErrorLogForExcManagerOnly = afErrorLogForExcManagerOnly();
        if (aFe1pSDKAfErrorLogForExcManagerOnly != null) {
            if (!AFInAppEventType(aFe1pSDKAfErrorLogForExcManagerOnly)) {
                Intrinsics.checkNotNullParameter("skipping", "");
                AFLogger.afRDLog("[Exception Manager]: ".concat("skipping"));
                int i11 = afErrorLogForExcManagerOnly + 115;
                AFVersionDeclaration = i11 % 128;
                int i12 = i11 % 2;
                return;
            }
            int i13 = AFVersionDeclaration + 7;
            afErrorLogForExcManagerOnly = i13 % 128;
            if (i13 % 2 != 0) {
                str = afInfoLog().AFInAppEventType;
                int i14 = 46 / 0;
                if (str == null) {
                    return;
                }
            } else {
                str = afInfoLog().AFInAppEventType;
                if (str == null) {
                    return;
                }
            }
            String string = new JSONObject(AFInAppEventType(AFInAppEventParameterName(aFe1pSDKAfErrorLogForExcManagerOnly), valueOf().values())).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            Intrinsics.checkNotNullExpressionValue(str, "");
            AFInAppEventType(string, str);
        }
    }

    private final synchronized void getLevel() {
        String str;
        try {
            AFe1pSDK aFe1pSDKAfErrorLogForExcManagerOnly = afErrorLogForExcManagerOnly();
            long j10 = aFe1pSDKAfErrorLogForExcManagerOnly != null ? aFe1pSDKAfErrorLogForExcManagerOnly.valueOf : -1L;
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            try {
                AFe1pSDK aFe1pSDKAfErrorLogForExcManagerOnly2 = afErrorLogForExcManagerOnly();
                if (aFe1pSDKAfErrorLogForExcManagerOnly2 != null) {
                    str = aFe1pSDKAfErrorLogForExcManagerOnly2.AFInAppEventType;
                } else {
                    int i10 = afErrorLogForExcManagerOnly + 95;
                    AFVersionDeclaration = i10 % 128;
                    int i11 = i10 % 2;
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
            } catch (NullPointerException unused) {
                str = "NOT_DETECTED";
            }
            if (j10 >= jCurrentTimeMillis) {
                if (AFc1uSDK.AFa1wSDK.valueOf(str) != -1) {
                    int i12 = AFVersionDeclaration + 13;
                    afErrorLogForExcManagerOnly = i12 % 128;
                    int i13 = i12 % 2;
                    if (AFc1uSDK.AFa1wSDK.valueOf(str) <= AFc1uSDK.AFa1wSDK.valueOf(afDebugLog())) {
                        valueOf().AFInAppEventParameterName(afDebugLog());
                        return;
                    }
                }
                AFLogger().AFInAppEventType("af_send_exc_to_server_window");
                valueOf().AFKeystoreWrapper();
                return;
            }
            int i14 = AFVersionDeclaration + 71;
            afErrorLogForExcManagerOnly = i14 % 128;
            if (i14 % 2 == 0) {
                Intrinsics.checkNotNullParameter("TTL is already passed", "");
                AFLogger.afRDLog("[Exception Manager]: ".concat("TTL is already passed"));
                AFLogger().AFInAppEventType("af_send_exc_to_server_window");
                valueOf().AFKeystoreWrapper();
                return;
            }
            Intrinsics.checkNotNullParameter("TTL is already passed", "");
            AFLogger.afRDLog("[Exception Manager]: ".concat("TTL is already passed"));
            AFLogger().AFInAppEventType("af_send_exc_to_server_window");
            valueOf().AFKeystoreWrapper();
            int i15 = 83 / 0;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void AFInAppEventType() {
        int i10 = afErrorLogForExcManagerOnly + 67;
        AFVersionDeclaration = i10 % 128;
        int i11 = 2;
        if (i10 % 2 != 0) {
            afRDLog().execute(new androidx.room.h(this, 1));
        } else {
            afRDLog().execute(new z(this, i11));
            int i12 = 37 / 0;
        }
    }

    @NotNull
    public final AFc1ySDK valueOf() {
        int i10 = AFVersionDeclaration + 103;
        afErrorLogForExcManagerOnly = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        AFc1ySDK aFc1ySDK = (AFc1ySDK) this.AFLogger.getValue();
        int i11 = afErrorLogForExcManagerOnly + 73;
        AFVersionDeclaration = i11 % 128;
        int i12 = i11 % 2;
        return aFc1ySDK;
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void values(@NotNull Throwable th2, @NotNull String str) {
        int i10 = AFVersionDeclaration + 7;
        afErrorLogForExcManagerOnly = i10 % 128;
        int i11 = 0;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th2, "");
            Intrinsics.checkNotNullParameter(str, "");
            afRDLog().execute(new f(this, th2, i11, str));
        } else {
            Intrinsics.checkNotNullParameter(th2, "");
            Intrinsics.checkNotNullParameter(str, "");
            afRDLog().execute(new g(this, th2, i11, str));
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventParameterName(AFc1wSDK aFc1wSDK) {
        int i10 = AFVersionDeclaration + 71;
        afErrorLogForExcManagerOnly = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(aFc1wSDK, "");
        aFc1wSDK.afWarnLog();
        int i12 = afErrorLogForExcManagerOnly + 89;
        AFVersionDeclaration = i12 % 128;
        int i13 = i12 % 2;
    }

    private static Map<String, Object> AFInAppEventType(Map<String, ? extends Object> map, List<AFb1aSDK> list) {
        Map<String, Object> mapMapOf;
        int i10 = AFVersionDeclaration + 19;
        afErrorLogForExcManagerOnly = i10 % 128;
        if (i10 % 2 != 0) {
            Pair[] pairArr = new Pair[5];
            pairArr[1] = TuplesKt.to("deviceInfo", map);
            pairArr[0] = TuplesKt.to("excs", AFc1uSDK.AFa1wSDK.valueOf(list));
            mapMapOf = q.mapOf(pairArr);
        } else {
            mapMapOf = q.mapOf(TuplesKt.to("deviceInfo", map), TuplesKt.to("excs", AFc1uSDK.AFa1wSDK.valueOf(list)));
        }
        int i11 = AFVersionDeclaration + 21;
        afErrorLogForExcManagerOnly = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 74 / 0;
        }
        return mapMapOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(AFc1wSDK aFc1wSDK, Throwable th2, String str) {
        Intrinsics.checkNotNullParameter(aFc1wSDK, "");
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFe1pSDK aFe1pSDKAfErrorLogForExcManagerOnly = aFc1wSDK.afErrorLogForExcManagerOnly();
        boolean z10 = false;
        if (aFe1pSDKAfErrorLogForExcManagerOnly != null) {
            int i10 = afErrorLogForExcManagerOnly + 97;
            AFVersionDeclaration = i10 % 128;
            int i11 = i10 % 2;
            if (aFc1wSDK.valueOf(aFe1pSDKAfErrorLogForExcManagerOnly)) {
                int i12 = AFVersionDeclaration + 29;
                afErrorLogForExcManagerOnly = i12 % 128;
                if (i12 % 2 == 0) {
                    z10 = true;
                }
            } else {
                int i13 = afErrorLogForExcManagerOnly + 101;
                AFVersionDeclaration = i13 % 128;
                int i14 = i13 % 2;
            }
        }
        if (!(!z10)) {
            aFc1wSDK.valueOf().AFKeystoreWrapper(th2, str);
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void AFKeystoreWrapper() {
        int i10 = AFVersionDeclaration + 5;
        afErrorLogForExcManagerOnly = i10 % 128;
        int i11 = i10 % 2;
        afRDLog().execute(new w1(this, 3));
        int i12 = AFVersionDeclaration + 29;
        afErrorLogForExcManagerOnly = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 14 / 0;
        }
    }

    private final boolean AFInAppEventType(AFe1pSDK aFe1pSDK) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jValues = AFLogger().values("af_send_exc_to_server_window", -1L);
        if (aFe1pSDK.valueOf < jCurrentTimeMillis / 1000) {
            return false;
        }
        if (jValues != -1) {
            int i10 = AFVersionDeclaration + 53;
            afErrorLogForExcManagerOnly = i10 % 128;
            int i11 = i10 % 2;
            if (jValues >= jCurrentTimeMillis) {
                int iAFInAppEventType = AFLogger().AFInAppEventType("af_send_exc_min", -1);
                if (iAFInAppEventType != -1) {
                    int i12 = AFVersionDeclaration + 121;
                    afErrorLogForExcManagerOnly = i12 % 128;
                    int i13 = i12 % 2;
                    if (valueOf().AFInAppEventType() >= iAFInAppEventType) {
                        String str = aFe1pSDK.AFInAppEventType;
                        Intrinsics.checkNotNullExpressionValue(str, "");
                        if (AFc1uSDK.AFa1wSDK.valueOf(str) == AFc1uSDK.AFa1wSDK.valueOf(afDebugLog())) {
                            int i14 = afErrorLogForExcManagerOnly + 35;
                            AFVersionDeclaration = i14 % 128;
                            int i15 = i14 % 2;
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        int i16 = afErrorLogForExcManagerOnly + 59;
        AFVersionDeclaration = i16 % 128;
        if (i16 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void values() {
        int i10 = afErrorLogForExcManagerOnly + 1;
        AFVersionDeclaration = i10 % 128;
        int i11 = i10 % 2;
        afRDLog().execute(new x1(this, 2));
        int i12 = afErrorLogForExcManagerOnly + 31;
        AFVersionDeclaration = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    private final Map<String, String> AFInAppEventParameterName(AFe1pSDK aFe1pSDK) {
        Object[] objArr = new Object[1];
        AFInAppEventParameterName("섇\uf6fd굱꿜盧骑", 5 - View.MeasureSpec.getMode(0), objArr);
        AFb1cSDK aFb1cSDKAfErrorLog = afErrorLog();
        Map<String, String> mapMapOf = q.mapOf(TuplesKt.to(((String) objArr[0]).intern(), Build.BRAND), TuplesKt.to("model", Build.MODEL), TuplesKt.to("app_id", afErrorLog().values.AFInAppEventParameterName.getPackageName()), TuplesKt.to("p_ex", new AFb1xSDK().values()), TuplesKt.to(SqlContracts.TokenEntry.API, String.valueOf(Build.VERSION.SDK_INT)), TuplesKt.to(EmulatorApi.SDK, afDebugLog()), TuplesKt.to("uid", AFa1aSDK.AFInAppEventParameterName(aFb1cSDKAfErrorLog.values, aFb1cSDKAfErrorLog.AFInAppEventType)), TuplesKt.to("exc_config", aFe1pSDK.values()));
        int i10 = afErrorLogForExcManagerOnly + 115;
        AFVersionDeclaration = i10 % 128;
        int i11 = i10 % 2;
        return mapMapOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(AFc1wSDK aFc1wSDK) {
        int i10 = afErrorLogForExcManagerOnly + 3;
        AFVersionDeclaration = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(aFc1wSDK, "");
        aFc1wSDK.AFVersionDeclaration();
        int i12 = afErrorLogForExcManagerOnly + 15;
        AFVersionDeclaration = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(AFc1wSDK aFc1wSDK) {
        int i10 = afErrorLogForExcManagerOnly + 57;
        AFVersionDeclaration = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(aFc1wSDK, "");
        aFc1wSDK.getLevel();
        int i12 = AFVersionDeclaration + 55;
        afErrorLogForExcManagerOnly = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 55 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0065  */
    /* JADX WARN: Code duplicated, block: B:9:0x003b A[PHI: r7 r9
      0x003b: PHI (r7v1 long) = (r7v0 long), (r7v2 long) binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r9v1 long) = (r9v0 long), (r9v2 long) binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    private final boolean valueOf(AFe1pSDK aFe1pSDK) {
        long jCurrentTimeMillis;
        long jValues;
        int i10;
        int i11 = afErrorLogForExcManagerOnly + 79;
        AFVersionDeclaration = i11 % 128;
        if (i11 % 2 == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            jValues = AFLogger().values("af_send_exc_to_server_window", -1L);
            if (aFe1pSDK.valueOf >= (1000 ^ jCurrentTimeMillis)) {
                int i12 = afErrorLogForExcManagerOnly + 103;
                i10 = i12 % 128;
                AFVersionDeclaration = i10;
                int i13 = i12 % 2;
                if (jValues != -1 || jValues < jCurrentTimeMillis) {
                    int i14 = i10 + 101;
                    afErrorLogForExcManagerOnly = i14 % 128;
                    int i15 = i14 % 2;
                } else {
                    String str = aFe1pSDK.AFInAppEventType;
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    if (AFc1uSDK.AFa1wSDK.valueOf(str) == AFc1uSDK.AFa1wSDK.valueOf(afDebugLog())) {
                        return true;
                    }
                }
            }
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            jValues = AFLogger().values("af_send_exc_to_server_window", -1L);
            if (aFe1pSDK.valueOf >= jCurrentTimeMillis / 1000) {
                int i16 = afErrorLogForExcManagerOnly + 103;
                i10 = i16 % 128;
                AFVersionDeclaration = i10;
                int i17 = i16 % 2;
                if (jValues != -1) {
                    int i18 = i10 + 101;
                    afErrorLogForExcManagerOnly = i18 % 128;
                    int i19 = i18 % 2;
                } else {
                    int i110 = i10 + 101;
                    afErrorLogForExcManagerOnly = i110 % 128;
                    int i111 = i110 % 2;
                }
            }
        }
        return false;
    }

    @WorkerThread
    private final void AFInAppEventType(String str, String str2) {
        int i10 = AFVersionDeclaration + 37;
        afErrorLogForExcManagerOnly = i10 % 128;
        int i11 = i10 % 2;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        AFLogger$LogLevel().valueOf(bytes, p.mapOf(TuplesKt.to("Authorization", AFb1zSDK.AFKeystoreWrapper(str, str2))), Guess.REFERENCE_YEAR);
        int i12 = afErrorLogForExcManagerOnly + 85;
        AFVersionDeclaration = i12 % 128;
        int i13 = i12 % 2;
    }

    private static void AFInAppEventParameterName(String str, int i10, Object[] objArr) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (AFg1kSDK.AFKeystoreWrapper) {
            try {
                char[] cArr2 = new char[cArr.length];
                AFg1kSDK.AFInAppEventType = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = AFg1kSDK.AFInAppEventType;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c10 = cArr3[1];
                            char c11 = cArr3[0];
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + getLevel)) ^ ((c11 >>> 5) + afWarnLog)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + AFLogger$LogLevel) ^ ((c12 + i12) ^ ((c12 << 4) + afErrorLog))));
                            i12 -= 40503;
                        }
                        int i14 = AFg1kSDK.AFInAppEventType;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        AFg1kSDK.AFInAppEventType = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str2;
    }
}
