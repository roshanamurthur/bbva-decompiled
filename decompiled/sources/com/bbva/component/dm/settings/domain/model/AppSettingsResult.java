package com.bbva.component.dm.settings.domain.model;

import bk.q;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AppSettingsResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/AppSettingsResult;", "", "Lcom/bbva/component/dm/settings/domain/model/AppSettings;", "a", "Lcom/bbva/component/dm/settings/domain/model/AppSettings;", "getData", "()Lcom/bbva/component/dm/settings/domain/model/AppSettings;", "data", "CachedResult", "ErrorResult", "FreshResult", "Lcom/bbva/component/dm/settings/domain/model/AppSettingsResult$CachedResult;", "Lcom/bbva/component/dm/settings/domain/model/AppSettingsResult$ErrorResult;", "Lcom/bbva/component/dm/settings/domain/model/AppSettingsResult$FreshResult;", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public abstract class AppSettingsResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AppSettings data;

    /* JADX INFO: compiled from: AppSettingsResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/AppSettingsResult$CachedResult;", "Lcom/bbva/component/dm/settings/domain/model/AppSettingsResult;", "Lcom/bbva/component/dm/settings/domain/model/AppSettings;", "b", "Lcom/bbva/component/dm/settings/domain/model/AppSettings;", "getValue", "()Lcom/bbva/component/dm/settings/domain/model/AppSettings;", "value", "<init>", "(Lcom/bbva/component/dm/settings/domain/model/AppSettings;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
    public static final class CachedResult extends AppSettingsResult {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final AppSettings value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CachedResult(@NotNull AppSettings value) {
            super(value, null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        @NotNull
        public final AppSettings getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: AppSettingsResult.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\b\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\b\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/AppSettingsResult$ErrorResult;", "Lcom/bbva/component/dm/settings/domain/model/AppSettingsResult;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "b", "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", "exception", "", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "code", "<init>", "(Ljava/lang/Exception;I)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
    public static final class ErrorResult extends AppSettingsResult {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Exception exception;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorResult(@NotNull Exception exception, int i10) {
            super(new AppSettings(q.emptyMap()), null);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
            this.code = i10;
        }

        public final int getCode() {
            return this.code;
        }

        @NotNull
        public final Exception getException() {
            return this.exception;
        }
    }

    /* JADX INFO: compiled from: AppSettingsResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/AppSettingsResult$FreshResult;", "Lcom/bbva/component/dm/settings/domain/model/AppSettingsResult;", "Lcom/bbva/component/dm/settings/domain/model/AppSettings;", "b", "Lcom/bbva/component/dm/settings/domain/model/AppSettings;", "getValue", "()Lcom/bbva/component/dm/settings/domain/model/AppSettings;", "value", "", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "code", "<init>", "(Lcom/bbva/component/dm/settings/domain/model/AppSettings;I)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
    public static final class FreshResult extends AppSettingsResult {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final AppSettings value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FreshResult(@NotNull AppSettings value, int i10) {
            super(value, null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
            this.code = i10;
        }

        public final int getCode() {
            return this.code;
        }

        @NotNull
        public final AppSettings getValue() {
            return this.value;
        }
    }

    public AppSettingsResult(AppSettings appSettings, DefaultConstructorMarker defaultConstructorMarker) {
        this.data = appSettings;
    }

    @NotNull
    public final AppSettings getData() {
        return this.data;
    }
}
