package com.salesforce.marketingcloud;

import androidx.annotation.RestrictTo;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.tohu.android.product.valkyria.sdk.constants.NotifyProvisionResult;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@MCKeep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0012\b\u0007\u0018\u0000 .2\u00020\u0001:\u0003/01Bu\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\u0006\u0010\u0019\u001a\u00020\n\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\u0006\u0010\u001d\u001a\u00020\n\u0012\u0006\u0010\u001f\u001a\u00020\n\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120 \u0012\b\b\u0002\u0010+\u001a\u00020\n¢\u0006\u0004\b,\u0010-J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0019\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0018\u0010\fJ\u000f\u0010\u001b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001a\u0010\fJ\u000f\u0010\u001d\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001c\u0010\fJ\u000f\u0010\u001f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001e\u0010\fJ\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120 H\u0007¢\u0006\u0004\b!\u0010\"J\b\u0010$\u001a\u00020\u0012H\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b\u0005\u0010\u0004R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b\t\u0010\bR\u0017\u0010\r\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0011\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b\u0011\u0010\u0010R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0007¢\u0006\f\n\u0004\b\u0015\u0010)\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u0017\u0010'\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0019\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u0019\u0010'\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u001b\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u001d\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u001d\u0010'\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u001f\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u001f\u0010'\u001a\u0004\b\u001f\u0010\fR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120 8\u0007¢\u0006\f\n\u0004\b#\u0010*\u001a\u0004\b#\u0010\"R\u0017\u0010+\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b+\u0010\f¨\u00062"}, d2 = {"Lcom/salesforce/marketingcloud/InitializationStatus;", "", "Lcom/salesforce/marketingcloud/InitializationStatus$Status;", "-deprecated_status", "()Lcom/salesforce/marketingcloud/InitializationStatus$Status;", "status", "", "-deprecated_unrecoverableException", "()Ljava/lang/Throwable;", "unrecoverableException", "", "-deprecated_locationsError", "()Z", "locationsError", "", "-deprecated_playServicesStatus", "()I", "playServicesStatus", "", "-deprecated_playServicesMessage", "()Ljava/lang/String;", "playServicesMessage", "-deprecated_encryptionChanged", "encryptionChanged", "-deprecated_storageError", "storageError", "-deprecated_proximityError", "proximityError", "-deprecated_messagingPermissionError", "messagingPermissionError", "-deprecated_sslProviderEnablementError", "sslProviderEnablementError", "", "-deprecated_initializedComponents", "()Ljava/util/List;", "initializedComponents", "toString", "Lcom/salesforce/marketingcloud/InitializationStatus$Status;", "Ljava/lang/Throwable;", "Z", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Ljava/lang/String;", "Ljava/util/List;", "isUsable", "<init>", "(Lcom/salesforce/marketingcloud/InitializationStatus$Status;Ljava/lang/Throwable;ZILjava/lang/String;ZZZZZLjava/util/List;Z)V", "Companion", "a", "b", "Status", "sdk_release"}, k = 1, mv = {1, 8, 0})
public final class InitializationStatus {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean encryptionChanged;

    @NotNull
    private final List<String> initializedComponents;
    private final boolean isUsable;
    private final boolean locationsError;
    private final boolean messagingPermissionError;

    @Nullable
    private final String playServicesMessage;
    private final int playServicesStatus;
    private final boolean proximityError;
    private final boolean sslProviderEnablementError;

    @NotNull
    private final Status status;
    private final boolean storageError;

    @Nullable
    private final Throwable unrecoverableException;

    @MCKeep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/salesforce/marketingcloud/InitializationStatus$Status;", "", "(Ljava/lang/String;I)V", NotifyProvisionResult.SUCCESS_RESULT, "COMPLETED_WITH_DEGRADED_FUNCTIONALITY", "FAILED", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Status {
        SUCCESS,
        COMPLETED_WITH_DEGRADED_FUNCTIONALITY,
        FAILED
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0017R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/salesforce/marketingcloud/InitializationStatus$a;", "", "", "changed", "", "a", "error", "f", "c", "b", "d", "", "status", "", "message", "e", "", "throwable", "Lcom/salesforce/marketingcloud/d;", "component", "Lcom/salesforce/marketingcloud/InitializationStatus;", "Ljava/lang/Throwable;", "unrecoverableException", "Z", "locationsError", "encryptionChanged", "storageError", "messagingPermissionError", "sslProviderEnablementError", "g", "Ljava/lang/String;", "playServicesMessage", "h", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "playServicesStatus", "i", "proximityError", "", "j", "Ljava/util/List;", "initializedComponents", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @SourceDebugExtension({"SMAP\nInitializationStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializationStatus.kt\ncom/salesforce/marketingcloud/InitializationStatus$Builder\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,346:1\n37#2,2:347\n*S KotlinDebug\n*F\n+ 1 InitializationStatus.kt\ncom/salesforce/marketingcloud/InitializationStatus$Builder\n*L\n341#1:347,2\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        private Throwable unrecoverableException;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean locationsError;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean encryptionChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean storageError;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean messagingPermissionError;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean sslProviderEnablementError;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        private String playServicesMessage;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean proximityError;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private int playServicesStatus = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        private final List<String> initializedComponents = new ArrayList();

        @NotNull
        public final InitializationStatus a() {
            Status status;
            if (b()) {
                status = (this.locationsError || this.storageError || this.messagingPermissionError || this.proximityError || this.sslProviderEnablementError) ? Status.COMPLETED_WITH_DEGRADED_FUNCTIONALITY : Status.SUCCESS;
            } else {
                status = Status.FAILED;
            }
            Status status2 = status;
            Throwable th2 = this.unrecoverableException;
            boolean z10 = this.locationsError;
            int i10 = this.playServicesStatus;
            String str = this.playServicesMessage;
            boolean z11 = this.encryptionChanged;
            boolean z12 = this.storageError;
            boolean z13 = this.proximityError;
            boolean z14 = this.messagingPermissionError;
            boolean z15 = this.sslProviderEnablementError;
            String[] strArr = (String[]) this.initializedComponents.toArray(new String[0]);
            return new InitializationStatus(status2, th2, z10, i10, str, z11, z12, z13, z14, z15, CollectionsKt__CollectionsKt.listOf(Arrays.copyOf(strArr, strArr.length)), false, 2048, null);
        }

        public final void b(boolean error) {
            this.locationsError = error;
        }

        public final void c(boolean error) {
            this.messagingPermissionError = error;
        }

        public final void d(boolean error) {
            this.proximityError = error;
        }

        public final void e(boolean error) {
            this.sslProviderEnablementError = error;
        }

        public final void f(boolean error) {
            this.storageError = error;
        }

        public final void a(int status) {
            this.playServicesStatus = status;
        }

        public final boolean b() {
            return this.unrecoverableException == null;
        }

        public final void a(@NotNull d component) {
            Intrinsics.checkNotNullParameter(component, "component");
            List<String> list = this.initializedComponents;
            String strComponentName = component.componentName();
            Intrinsics.checkNotNullExpressionValue(strComponentName, "component.componentName()");
            list.add(strComponentName);
        }

        public final void a(@Nullable String message) {
            if (message != null) {
                if (this.playServicesMessage != null) {
                    message = this.playServicesMessage + '\n' + message;
                }
                this.playServicesMessage = message;
            }
        }

        public final void a(@NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.unrecoverableException = throwable;
        }

        public final void a(boolean changed) {
            this.encryptionChanged = changed;
        }
    }

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.InitializationStatus$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/salesforce/marketingcloud/InitializationStatus$b;", "", "Lcom/salesforce/marketingcloud/InitializationStatus$a;", "b", "()Lcom/salesforce/marketingcloud/InitializationStatus$a;", "Lcom/salesforce/marketingcloud/InitializationStatus;", "a", "()Lcom/salesforce/marketingcloud/InitializationStatus;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmName(name = "-amazonStatus")
        @NotNull
        public final InitializationStatus a() {
            a aVarB = b();
            aVarB.a(new IllegalStateException("Amazon devices are not supported"));
            return aVarB.a();
        }

        @JvmName(name = "-builder")
        @NotNull
        public final a b() {
            return new a();
        }
    }

    public InitializationStatus(@NotNull Status status, @Nullable Throwable th2, boolean z10, int i10, @Nullable String str, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, @NotNull List<String> initializedComponents, boolean z16) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(initializedComponents, "initializedComponents");
        this.status = status;
        this.unrecoverableException = th2;
        this.locationsError = z10;
        this.playServicesStatus = i10;
        this.playServicesMessage = str;
        this.encryptionChanged = z11;
        this.storageError = z12;
        this.proximityError = z13;
        this.messagingPermissionError = z14;
        this.sslProviderEnablementError = z15;
        this.initializedComponents = initializedComponents;
        this.isUsable = z16;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encryptionChanged", imports = {}))
    @JvmName(name = "-deprecated_encryptionChanged")
    /* JADX INFO: renamed from: -deprecated_encryptionChanged, reason: not valid java name and from getter */
    public final boolean getEncryptionChanged() {
        return this.encryptionChanged;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "initializedComponents", imports = {}))
    @JvmName(name = "-deprecated_initializedComponents")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_initializedComponents, reason: not valid java name */
    public final List<String> m5300deprecated_initializedComponents() {
        return this.initializedComponents;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "locationsError", imports = {}))
    @JvmName(name = "-deprecated_locationsError")
    /* JADX INFO: renamed from: -deprecated_locationsError, reason: not valid java name and from getter */
    public final boolean getLocationsError() {
        return this.locationsError;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "messagingPermissionError", imports = {}))
    @JvmName(name = "-deprecated_messagingPermissionError")
    /* JADX INFO: renamed from: -deprecated_messagingPermissionError, reason: not valid java name and from getter */
    public final boolean getMessagingPermissionError() {
        return this.messagingPermissionError;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "playServicesMessage", imports = {}))
    @JvmName(name = "-deprecated_playServicesMessage")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_playServicesMessage, reason: not valid java name and from getter */
    public final String getPlayServicesMessage() {
        return this.playServicesMessage;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "playServicesStatus", imports = {}))
    @JvmName(name = "-deprecated_playServicesStatus")
    /* JADX INFO: renamed from: -deprecated_playServicesStatus, reason: not valid java name and from getter */
    public final int getPlayServicesStatus() {
        return this.playServicesStatus;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proximityError", imports = {}))
    @JvmName(name = "-deprecated_proximityError")
    /* JADX INFO: renamed from: -deprecated_proximityError, reason: not valid java name and from getter */
    public final boolean getProximityError() {
        return this.proximityError;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sslProviderEnablementError", imports = {}))
    @JvmName(name = "-deprecated_sslProviderEnablementError")
    /* JADX INFO: renamed from: -deprecated_sslProviderEnablementError, reason: not valid java name and from getter */
    public final boolean getSslProviderEnablementError() {
        return this.sslProviderEnablementError;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "status", imports = {}))
    @JvmName(name = "-deprecated_status")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_status, reason: not valid java name and from getter */
    public final Status getStatus() {
        return this.status;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "storageError", imports = {}))
    @JvmName(name = "-deprecated_storageError")
    /* JADX INFO: renamed from: -deprecated_storageError, reason: not valid java name and from getter */
    public final boolean getStorageError() {
        return this.storageError;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "unrecoverableException", imports = {}))
    @JvmName(name = "-deprecated_unrecoverableException")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_unrecoverableException, reason: not valid java name and from getter */
    public final Throwable getUnrecoverableException() {
        return this.unrecoverableException;
    }

    @JvmName(name = "encryptionChanged")
    public final boolean encryptionChanged() {
        return this.encryptionChanged;
    }

    @JvmName(name = "initializedComponents")
    @NotNull
    public final List<String> initializedComponents() {
        return this.initializedComponents;
    }

    @JvmName(name = "isUsable")
    /* JADX INFO: renamed from: isUsable, reason: from getter */
    public final boolean getIsUsable() {
        return this.isUsable;
    }

    @JvmName(name = "locationsError")
    public final boolean locationsError() {
        return this.locationsError;
    }

    @JvmName(name = "messagingPermissionError")
    public final boolean messagingPermissionError() {
        return this.messagingPermissionError;
    }

    @JvmName(name = "playServicesMessage")
    @Nullable
    public final String playServicesMessage() {
        return this.playServicesMessage;
    }

    @JvmName(name = "playServicesStatus")
    public final int playServicesStatus() {
        return this.playServicesStatus;
    }

    @JvmName(name = "proximityError")
    public final boolean proximityError() {
        return this.proximityError;
    }

    @JvmName(name = "sslProviderEnablementError")
    public final boolean sslProviderEnablementError() {
        return this.sslProviderEnablementError;
    }

    @JvmName(name = "status")
    @NotNull
    public final Status status() {
        return this.status;
    }

    @JvmName(name = "storageError")
    public final boolean storageError() {
        return this.storageError;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("InitializationStatus(status=");
        sb2.append(this.status);
        sb2.append(", unrecoverableException=");
        sb2.append(this.unrecoverableException);
        sb2.append(", locationsError=");
        sb2.append(this.locationsError);
        sb2.append(", playServicesStatus=");
        sb2.append(this.playServicesStatus);
        sb2.append(", playServicesMessage=");
        sb2.append(this.playServicesMessage);
        sb2.append(", encryptionChanged=");
        sb2.append(this.encryptionChanged);
        sb2.append(", storageError=");
        sb2.append(this.storageError);
        sb2.append(", proximityError=");
        sb2.append(this.proximityError);
        sb2.append(", messagingPermissionError=");
        sb2.append(this.messagingPermissionError);
        sb2.append(", sslProviderEnablementError=");
        sb2.append(this.sslProviderEnablementError);
        sb2.append(", initializedComponents=");
        sb2.append(this.initializedComponents);
        sb2.append(", isUsable=");
        return bc.org.bouncycastle.math.ec.custom.sec.a.d(sb2, this.isUsable, RootService.CLOSE_BRACKET);
    }

    @JvmName(name = "unrecoverableException")
    @Nullable
    public final Throwable unrecoverableException() {
        return this.unrecoverableException;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InitializationStatus(Status status, Throwable th2, boolean z10, int i10, String str, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, List list, boolean z16, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z17;
        if ((i11 & 2048) != 0) {
            z17 = status != Status.FAILED;
        } else {
            z17 = z16;
        }
        this(status, th2, z10, i10, str, z11, z12, z13, z14, z15, list, z17);
    }
}
