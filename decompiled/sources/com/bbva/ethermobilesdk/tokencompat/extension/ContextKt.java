package com.bbva.ethermobilesdk.tokencompat.extension;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.provider.Settings;
import com.bbva.ethermobilesdk.tokencompat.R;
import com.bbva.ethermobilesdk.tokencompat.TokenCompatConfig;
import com.bbva.ethermobilesdk.tokencompat.TokenCompatStorage;
import com.bbva.ethermobilesdk.tokencompat.util.EtherPackageInfo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0002H\u0000\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u0002H\u0000\u001a*\u0010\b\u001a\u00020\t*\u00020\u00022\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0000¨\u0006\r"}, d2 = {"androidFirstInstallTimeDeviceInfoOrThrow", "", "Landroid/content/Context;", "androidId", "firstInstallTime", "", "readStorageMode", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$StorageMode;", "relay", "", "values", "", "storageMode", "ethertoken-compat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ContextKt {

    /* JADX INFO: compiled from: Context.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.extension.ContextKt$relay$1", f = "Context.kt", i = {0, 0, 1}, l = {91, 92}, m = "invokeSuspend", n = {"destination$iv$iv", "it", "destination$iv$iv"}, s = {"L$1", "L$3", "L$1"})
    @SourceDebugExtension({"SMAP\nContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Context.kt\ncom/bbva/ethermobilesdk/tokencompat/extension/ContextKt$relay$1\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,96:1\n551#2:97\n536#2,6:98\n125#3:104\n152#3,3:105\n*S KotlinDebug\n*F\n+ 1 Context.kt\ncom/bbva/ethermobilesdk/tokencompat/extension/ContextKt$relay$1\n*L\n87#1:97\n87#1:98,6\n89#1:104\n89#1:105,3\n*E\n"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TokenCompatStorage f30465p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Collection f30466q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Iterator f30467r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Object f30468s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Collection f30469t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f30470u0;
        public final /* synthetic */ Map<String, String> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ TokenCompatStorage f30471w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<String, String> map, TokenCompatStorage tokenCompatStorage, Continuation<? super a> continuation) {
            super(2, continuation);
            this.v0 = map;
            this.f30471w0 = tokenCompatStorage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.v0, this.f30471w0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Unit>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0091  */
        /* JADX WARN: Code duplicated, block: B:21:0x009f  */
        /* JADX WARN: Code duplicated, block: B:23:0x00ba A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:27:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:29:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:31:0x00e2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:32:0x00e3  */
        /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00e3 -> B:33:0x00e5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00e7 -> B:35:0x00e8). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:24:0x00bb
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 243
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bbva.ethermobilesdk.tokencompat.extension.ContextKt.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @NotNull
    public static final String androidFirstInstallTimeDeviceInfoOrThrow(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        String string = Long.toString(firstInstallTime(context), CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
        return string;
    }

    @NotNull
    public static final String androidId(@NotNull Context context) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(Settings.Secure.getString(context.getContentResolver(), "android_id"));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
        kotlin.ResultKt.throwOnFailure(objM5535constructorimpl);
        Intrinsics.checkNotNullExpressionValue(objM5535constructorimpl, "runCatching {\n        Se…ID_ID)\n    }.getOrThrow()");
        return (String) objM5535constructorimpl;
    }

    public static final long firstInstallTime(@NotNull Context context) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("android", 0);
            Intrinsics.checkNotNullExpressionValue(packageInfo, "packageInfo");
            objM5535constructorimpl = Result.m5535constructorimpl(Long.valueOf(new EtherPackageInfo(packageInfo).getFirstInstallTime()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
        kotlin.ResultKt.throwOnFailure(objM5535constructorimpl);
        return ((Number) objM5535constructorimpl).longValue();
    }

    @Nullable
    public static final TokenCompatConfig.StorageMode readStorageMode(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Resources resources = context.getResources();
        if (resources == null) {
            return null;
        }
        String string = resources.getString(R.string.tokencompat_storage_mode_private);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.token…pat_storage_mode_private)");
        String string2 = resources.getString(R.string.tokencompat_storage_mode_shared);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.token…mpat_storage_mode_shared)");
        String string3 = resources.getString(R.string.tokencompat_storage_mode);
        if (Intrinsics.areEqual(string3, string)) {
            return TokenCompatConfig.StorageMode.PRIVATE;
        }
        if (Intrinsics.areEqual(string3, string2)) {
            return TokenCompatConfig.StorageMode.SHARED;
        }
        LoggerKt.logError$default("                        Could not determine TokenCompat storage mode. \nDid you forget to set R.string.tokencompat_storage_mode in strings.xml?\nYou must use one of:\n    @string/tokencompat_storage_mode_shared\n    @string/tokencompat_storage_mode_private", null, 2, null);
        return null;
    }

    public static final void relay(@NotNull Context context, @NotNull Map<String, String> values, @NotNull TokenCompatConfig.StorageMode storageMode) throws InterruptedException {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(storageMode, "storageMode");
        BuildersKt__BuildersKt.runBlocking$default(null, new a(values, new TokenCompatStorage(context, storageMode, null, 4, null), null), 1, null);
    }
}
