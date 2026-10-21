package com.bbva.glomohybrid.splash.model;

import androidx.camera.core.impl.utils.a;
import com.bbva.component.dm.settings.domain.model.AppSettingsResult;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkException.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0011B\u001d\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/bbva/glomohybrid/splash/model/NetworkException;", "", "cause", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "", "getMessage", "()Ljava/lang/String;", "message", "Lcom/bbva/component/dm/settings/domain/model/AppSettingsResult;", "appSettingsResult", "", "", "errorCodes", "<init>", "(Lcom/bbva/component/dm/settings/domain/model/AppSettingsResult;Ljava/util/List;)V", "NetworkCapabilityState", "Splash_mexicoProdRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNetworkException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkException.kt\ncom/bbva/glomohybrid/splash/model/NetworkException\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1549#2:42\n1620#2,3:43\n*S KotlinDebug\n*F\n+ 1 NetworkException.kt\ncom/bbva/glomohybrid/splash/model/NetworkException\n*L\n23#1:42\n23#1:43,3\n*E\n"})
public final class NetworkException extends Throwable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final AppSettingsResult f34499p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final List<Integer> f34500q0;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v4 com.bbva.glomohybrid.splash.model.NetworkException$NetworkCapabilityState[], still in use, count: 1, list:
      (r7v4 com.bbva.glomohybrid.splash.model.NetworkException$NetworkCapabilityState[]) from 0x0053: INVOKE (r7v4 com.bbva.glomohybrid.splash.model.NetworkException$NetworkCapabilityState[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:84)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: NetworkException.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/bbva/glomohybrid/splash/model/NetworkException$NetworkCapabilityState;", "", "", "code", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Companion", "NETWORK_OK", "NETWORK_KO", "NETWORK_CAP_INTERNET", "NETWORK_CAP_NOT_RESTRICTED", "NETWORK_CAP_TRUSTED", "Splash_mexicoProdRelease"}, k = 1, mv = {1, 9, 0})
    public static final class NetworkCapabilityState {
        NETWORK_OK(-2, "Network OK"),
        NETWORK_KO(-1, "Network KO"),
        NETWORK_CAP_INTERNET(12, "Internet KO"),
        NETWORK_CAP_NOT_RESTRICTED(13, "Not restricted KO"),
        NETWORK_CAP_TRUSTED(14, "Trusted OK");

        private static final /* synthetic */ EnumEntries $ENTRIES;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final int code;

        @NotNull
        private final String message;

        /* JADX INFO: compiled from: NetworkException.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/splash/model/NetworkException$NetworkCapabilityState$Companion;", "", "()V", "getByCode", "Lcom/bbva/glomohybrid/splash/model/NetworkException$NetworkCapabilityState;", "code", "", "Splash_mexicoProdRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nNetworkException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkException.kt\ncom/bbva/glomohybrid/splash/model/NetworkException$NetworkCapabilityState$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,41:1\n1282#2,2:42\n*S KotlinDebug\n*F\n+ 1 NetworkException.kt\ncom/bbva/glomohybrid/splash/model/NetworkException$NetworkCapabilityState$Companion\n*L\n37#1:42,2\n*E\n"})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final NetworkCapabilityState getByCode(int code) {
                for (NetworkCapabilityState networkCapabilityState : NetworkCapabilityState.values()) {
                    if (networkCapabilityState.getCode() == code) {
                        return networkCapabilityState;
                    }
                }
                return null;
            }
        }

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(new NetworkCapabilityState[]{r0, r1, r2, r3, r5});
        }

        public NetworkCapabilityState(int i10, String str) {
            super(str, i);
            this.code = i10;
            this.message = str;
        }

        @NotNull
        public static EnumEntries<NetworkCapabilityState> getEntries() {
            return $ENTRIES;
        }

        public static NetworkCapabilityState valueOf(String str) {
            return (NetworkCapabilityState) Enum.valueOf(NetworkCapabilityState.class, str);
        }

        public static NetworkCapabilityState[] values() {
            return (NetworkCapabilityState[]) $VALUES.clone();
        }

        public final int getCode() {
            return this.code;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }
    }

    public NetworkException(@NotNull AppSettingsResult appSettingsResult, @NotNull List<Integer> errorCodes) {
        Intrinsics.checkNotNullParameter(appSettingsResult, "appSettingsResult");
        Intrinsics.checkNotNullParameter(errorCodes, "errorCodes");
        this.f34499p0 = appSettingsResult;
        this.f34500q0 = errorCodes;
    }

    @Override // java.lang.Throwable
    @Nullable
    public Throwable getCause() {
        return null;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        String str;
        String strJoinToString$default;
        AppSettingsResult appSettingsResult = this.f34499p0;
        if (appSettingsResult instanceof AppSettingsResult.FreshResult) {
            str = "AppSettings obtained from Network";
        } else if (appSettingsResult instanceof AppSettingsResult.CachedResult) {
            str = "AppSettings obtained from cache";
        } else {
            if (!(appSettingsResult instanceof AppSettingsResult.ErrorResult)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "AppSettings not obtained";
        }
        List<Integer> list = this.f34500q0;
        if (list.isEmpty()) {
            strJoinToString$default = NetworkCapabilityState.NETWORK_OK.getMessage();
        } else {
            List<Integer> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                NetworkCapabilityState byCode = NetworkCapabilityState.INSTANCE.getByCode(((Number) it.next()).intValue());
                arrayList.add(byCode != null ? byCode.getMessage() : null);
            }
            strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, " - ", null, null, 0, null, null, 62, null);
        }
        return a.b(str, " - ", strJoinToString$default);
    }
}
