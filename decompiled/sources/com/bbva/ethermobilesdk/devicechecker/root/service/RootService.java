package com.bbva.ethermobilesdk.devicechecker.root.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import androidx.collection.j;
import bk.q;
import com.bbva.ethermobile.elogger.EtherLogger;
import com.bbva.ethermobilesdk.devicechecker.RootServiceApi;
import com.bbva.ethermobilesdk.devicechecker.common.util.SystemBuild;
import com.bbva.ethermobilesdk.devicechecker.extension.ContextKt;
import com.bbva.ethermobilesdk.devicechecker.logger.DeviceCheckerLoggerKt;
import com.bbva.ethermobilesdk.devicechecker.model.ServiceResponse;
import com.bbva.ethermobilesdk.devicechecker.util.EtherFile;
import com.sun.mail.imap.IMAPStore;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RootService.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010 \u001a\u00020\tH\u0000¢\u0006\u0004\b\u001f\u0010\u0014J\u000f\u0010\"\u001a\u00020\tH\u0000¢\u0006\u0004\b!\u0010\u0014J\u000f\u0010$\u001a\u00020\tH\u0000¢\u0006\u0004\b#\u0010\u0014¨\u0006'"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/root/service/RootService;", "Landroid/app/Service;", "Landroid/content/Intent;", "intent", "Lcom/bbva/ethermobilesdk/devicechecker/RootServiceApi$Stub;", "onBind", "Landroid/content/Context;", "context", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", "isRootFound$devicechecker_release", "(Landroid/content/Context;)Lcom/bbva/ethermobile/help/kit/result/Result;", "isRootFound", "", "", "packages", "isAnyPackageInstalled$devicechecker_release", "(Landroid/content/Context;Ljava/util/List;)Z", "isAnyPackageInstalled", "isSuPathFound$devicechecker_release", "()Z", "isSuPathFound", IMAPStore.ID_COMMAND, "", "commandExecution$devicechecker_release", "(Ljava/lang/String;)[Ljava/lang/String;", "commandExecution", "commands", "isRuntimeCommandExecutionFound$devicechecker_release", "([Ljava/lang/String;)Z", "isRuntimeCommandExecutionFound", "isRootTagFound$devicechecker_release", "isRootTagFound", "isDangerousPropertiesFound$devicechecker_release", "isDangerousPropertiesFound", "isNotWritablePathFound$devicechecker_release", "isNotWritablePathFound", "<init>", "()V", "devicechecker_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRootService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootService.kt\ncom/bbva/ethermobilesdk/devicechecker/root/service/RootService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,185:1\n1747#2,3:186\n1747#2,3:189\n1747#2,3:195\n1855#2:200\n1855#2,2:201\n1856#2:203\n37#3,2:192\n12474#4:194\n12475#4:198\n13309#4:199\n13310#4:204\n*S KotlinDebug\n*F\n+ 1 RootService.kt\ncom/bbva/ethermobilesdk/devicechecker/root/service/RootService\n*L\n60#1:186,3\n64#1:189,3\n97#1:195,3\n109#1:200\n114#1:201,2\n109#1:203\n71#1:192,2\n96#1:194\n96#1:198\n105#1:199\n105#1:204\n*E\n"})
public final class RootService extends Service {

    @Deprecated
    @NotNull
    public static final String BLANK_SPACE = " ";

    @Deprecated
    public static final char CLOSE_BRACKET = ')';

    @Deprecated
    @NotNull
    public static final String COMMA = ",";

    @Deprecated
    @NotNull
    public static final String DELIMITER_A = "\\A";

    @Deprecated
    @NotNull
    public static final String GET_PROP = "getprop";

    @Deprecated
    @NotNull
    public static final String LINE_BREAK = "\n";

    @Deprecated
    @NotNull
    public static final String MOUNT = "mount";

    @Deprecated
    public static final char OPEN_BRACKET = '(';

    @Deprecated
    @NotNull
    public static final String PATH_SYSTEM_XBIN_WHICH = "/system/xbin/which";

    @Deprecated
    @NotNull
    public static final String RO_DEBUGGABLE = "ro.debuggable";

    @Deprecated
    @NotNull
    public static final String RO_SECURE = "ro.secure";

    @Deprecated
    @NotNull
    public static final String RW = "rw";

    @Deprecated
    @NotNull
    public static final String SU = "su";

    @Deprecated
    @NotNull
    public static final String TEST_KEYS = "test-keys";

    @Deprecated
    @NotNull
    public static final String WHICH = "which";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final List<String> f29502p0 = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/sbin/su", "/su/bin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/system/xbin/su", "/system/app/Superuser.apk"});

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final List<String> f29503q0 = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"});

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final List<String> f29504r0 = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro"});

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final List<String> f29505s0 = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su"});

    @Nullable
    public final String[] commandExecution$devicechecker_release(@NotNull String command) {
        Object objM5535constructorimpl;
        String[] strArr;
        Intrinsics.checkNotNullParameter(command, "command");
        try {
            Result.Companion companion = Result.INSTANCE;
            InputStream inputStream = Runtime.getRuntime().exec(command).getInputStream();
            if (inputStream != null) {
                Intrinsics.checkNotNullExpressionValue(inputStream, "inputStream");
                String next = new Scanner(inputStream).useDelimiter(DELIMITER_A).next();
                Intrinsics.checkNotNullExpressionValue(next, "Scanner(it).useDelimiter(DELIMITER_A).next()");
                strArr = (String[]) new Regex(LINE_BREAK).split(next, 0).toArray(new String[0]);
            } else {
                strArr = null;
            }
            objM5535constructorimpl = Result.m5535constructorimpl(strArr);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        return (String[]) (Result.m5540isFailureimpl(objM5535constructorimpl) ? null : objM5535constructorimpl);
    }

    public final boolean isAnyPackageInstalled$devicechecker_release(@NotNull Context context, @NotNull List<String> packages) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packages, "packages");
        List<String> list = packages;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (ContextKt.isPackageInstalled(context, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean isDangerousPropertiesFound$devicechecker_release() {
        boolean z10 = true;
        Map mapMutableMapOf = q.mutableMapOf(new Pair(RO_DEBUGGABLE, 1), new Pair(RO_SECURE, 0));
        String[] strArrCommandExecution$devicechecker_release = commandExecution$devicechecker_release(GET_PROP);
        if (strArrCommandExecution$devicechecker_release == null) {
            return false;
        }
        for (String str : strArrCommandExecution$devicechecker_release) {
            Set<String> setKeySet = mapMutableMapOf.keySet();
            if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                for (String str2 : setKeySet) {
                    if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) str2, false, 2, (Object) null) && StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) j.b(Constant.BRACKET_OPEN, mapMutableMapOf.get(str2), Constant.BRACKET_CLOSE), false, 2, (Object) null)) {
                        return z10;
                    }
                }
            }
        }
        z10 = false;
        return z10;
    }

    public final boolean isNotWritablePathFound$devicechecker_release() {
        String[] strArrCommandExecution$devicechecker_release = commandExecution$devicechecker_release(MOUNT);
        if (strArrCommandExecution$devicechecker_release != null) {
            for (String str : strArrCommandExecution$devicechecker_release) {
                List<String> listSplit = new Regex(" ").split(str, 0);
                if (listSplit.size() >= 4) {
                    String str2 = listSplit.get(5);
                    Iterator<T> it = f29503q0.iterator();
                    while (it.hasNext()) {
                        if (l.equals((String) it.next(), listSplit.get(2), true)) {
                            Iterator<T> it2 = new Regex(",").split(StringsKt__StringsKt.trimEnd(StringsKt__StringsKt.trimStart(str2, OPEN_BRACKET), CLOSE_BRACKET), 0).iterator();
                            while (it2.hasNext()) {
                                if (l.equals((String) it2.next(), RW, true)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @NotNull
    public final com.bbva.ethermobile.help.kit.result.Result<Boolean> isRootFound$devicechecker_release(@NotNull Context context) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            boolean z10 = true;
            if (!isAnyPackageInstalled$devicechecker_release(context, f29505s0) && !isAnyPackageInstalled$devicechecker_release(context, f29504r0) && !isSuPathFound$devicechecker_release() && !isDangerousPropertiesFound$devicechecker_release() && !isNotWritablePathFound$devicechecker_release() && !isRuntimeCommandExecutionFound$devicechecker_release(new String[]{WHICH, SU}) && !isRuntimeCommandExecutionFound$devicechecker_release(new String[]{PATH_SYSTEM_XBIN_WHICH, SU}) && !isRootTagFound$devicechecker_release()) {
                z10 = false;
            }
            objM5535constructorimpl = Result.m5535constructorimpl(new com.bbva.ethermobile.help.kit.result.Result.Success(Boolean.valueOf(z10)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            objM5535constructorimpl = new com.bbva.ethermobile.help.kit.result.Result.Error(thM5538exceptionOrNullimpl);
        }
        return (com.bbva.ethermobile.help.kit.result.Result) objM5535constructorimpl;
    }

    public final boolean isRootTagFound$devicechecker_release() {
        String buildTags = SystemBuild.INSTANCE.getTags();
        if (buildTags == null || buildTags.length() == 0) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue(buildTags, "buildTags");
        return StringsKt__StringsKt.contains$default((CharSequence) buildTags, (CharSequence) TEST_KEYS, false, 2, (Object) null);
    }

    public final boolean isRuntimeCommandExecutionFound$devicechecker_release(@NotNull String[] commands) {
        Intrinsics.checkNotNullParameter(commands, "commands");
        boolean z10 = false;
        Process processExec = null;
        try {
            processExec = Runtime.getRuntime().exec(commands);
            String line = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine();
            z10 = !(line == null || line.length() == 0);
        } catch (Throwable unused) {
            if (processExec != null) {
            }
            return z10;
        }
        processExec.destroy();
        return z10;
    }

    public final boolean isSuPathFound$devicechecker_release() {
        List<String> list = f29502p0;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (new EtherFile((String) it.next()).exists()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Service
    @NotNull
    public RootServiceApi.Stub onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return new RootServiceApi.Stub() { // from class: com.bbva.ethermobilesdk.devicechecker.root.service.RootService.onBind.1
            @Override // com.bbva.ethermobilesdk.devicechecker.RootServiceApi
            public int isRootPresent() {
                RootService rootService = RootService.this;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Context applicationContext = rootService.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    return ((Boolean) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow(rootService.isRootFound$devicechecker_release(applicationContext))).booleanValue() ? ServiceResponse.SERVICE_TRUE.getCode() : ServiceResponse.SERVICE_FALSE.getCode();
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(Result.m5535constructorimpl(ResultKt.createFailure(th2)));
                    if (thM5538exceptionOrNullimpl == null) {
                        throw new KotlinNothingValueException();
                    }
                    DeviceCheckerLoggerKt.logDeviceCheckerError(EtherLogger.INSTANCE, thM5538exceptionOrNullimpl, AnonymousClass1.class);
                    return ServiceResponse.SERVICE_ERROR.getCode();
                }
            }
        };
    }
}
