package com.bbva.ethermobilesdk.tokencompat.model.legacy.impl;

import ad.d;
import androidx.camera.core.processing.f;
import com.bbva.ethermobilesdk.token.model.EtherTokenError;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STRC;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.huawei.hms.feature.model.c;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: STReturnCodeImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\b6\u0018\u00002\u00020\u0001:\u000b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STReturnCodeImpl;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getValue", "()I", "value", "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "BadActivation", "BadEnroll", "EnrollParamsGeneration", "FeatureUnavailable", "InvalidEnrollParams", "Ok", "OtpNull", "TokenEmptyList", "TokenNotDeleted", "TokenNotFound", "TokensNotDeleted", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
public abstract class STReturnCodeImpl implements STReturnCode {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String description;

    /* JADX INFO: compiled from: STReturnCodeImpl.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STReturnCodeImpl$Ok;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "", "component1", "", "component2", "value", "description", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getValue", "()I", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Ok implements STReturnCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String description;

        /* JADX WARN: Multi-variable type inference failed */
        public Ok() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Ok copy$default(Ok ok2, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = ok2.getValue();
            }
            if ((i11 & 2) != 0) {
                str = ok2.getDescription();
            }
            return ok2.copy(i10, str);
        }

        public final int component1() {
            return getValue();
        }

        @NotNull
        public final String component2() {
            return getDescription();
        }

        @NotNull
        public final Ok copy(int value, @NotNull String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            return new Ok(value, description);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ok)) {
                return false;
            }
            Ok ok2 = (Ok) other;
            return getValue() == ok2.getValue() && Intrinsics.areEqual(getDescription(), ok2.getDescription());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        @NotNull
        public String getDescription() {
            return this.description;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        public int getValue() {
            return this.value;
        }

        public int hashCode() {
            return getDescription().hashCode() + (getValue() * 31);
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        public boolean isOk() {
            return STReturnCode.DefaultImpls.isOk(this);
        }

        @NotNull
        public String toString() {
            return z1.c("Ok(value=", getValue(), ", description=", getDescription(), ")");
        }

        public Ok(int i10, @NotNull String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.value = i10;
            this.description = description;
        }

        public /* synthetic */ Ok(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? STRC.RC_OK.getValue() : i10, (i11 & 2) != 0 ? "Success" : str);
        }
    }

    /* JADX INFO: compiled from: STReturnCodeImpl.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STReturnCodeImpl$OtpNull;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "", "component1", "", "component2", "value", "description", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getValue", "()I", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class OtpNull implements STReturnCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String description;

        /* JADX WARN: Multi-variable type inference failed */
        public OtpNull() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ OtpNull copy$default(OtpNull otpNull, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = otpNull.getValue();
            }
            if ((i11 & 2) != 0) {
                str = otpNull.getDescription();
            }
            return otpNull.copy(i10, str);
        }

        public final int component1() {
            return getValue();
        }

        @NotNull
        public final String component2() {
            return getDescription();
        }

        @NotNull
        public final OtpNull copy(int value, @NotNull String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            return new OtpNull(value, description);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OtpNull)) {
                return false;
            }
            OtpNull otpNull = (OtpNull) other;
            return getValue() == otpNull.getValue() && Intrinsics.areEqual(getDescription(), otpNull.getDescription());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        @NotNull
        public String getDescription() {
            return this.description;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        public int getValue() {
            return this.value;
        }

        public int hashCode() {
            return getDescription().hashCode() + (getValue() * 31);
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        public boolean isOk() {
            return STReturnCode.DefaultImpls.isOk(this);
        }

        @NotNull
        public String toString() {
            return z1.c("OtpNull(value=", getValue(), ", description=", getDescription(), ")");
        }

        public OtpNull(int i10, @NotNull String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.value = i10;
            this.description = description;
        }

        public /* synthetic */ OtpNull(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? STRC.RC_ERR_OTP_NULL.getValue() : i10, (i11 & 2) != 0 ? "Otp invalid value (null)" : str);
        }
    }

    /* JADX INFO: compiled from: STReturnCodeImpl.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STReturnCodeImpl$TokenEmptyList;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "", "component1", "", "component2", "value", "description", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getValue", "()I", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class TokenEmptyList implements STReturnCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String description;

        /* JADX WARN: Multi-variable type inference failed */
        public TokenEmptyList() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ TokenEmptyList copy$default(TokenEmptyList tokenEmptyList, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = tokenEmptyList.getValue();
            }
            if ((i11 & 2) != 0) {
                str = tokenEmptyList.getDescription();
            }
            return tokenEmptyList.copy(i10, str);
        }

        public final int component1() {
            return getValue();
        }

        @NotNull
        public final String component2() {
            return getDescription();
        }

        @NotNull
        public final TokenEmptyList copy(int value, @NotNull String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            return new TokenEmptyList(value, description);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TokenEmptyList)) {
                return false;
            }
            TokenEmptyList tokenEmptyList = (TokenEmptyList) other;
            return getValue() == tokenEmptyList.getValue() && Intrinsics.areEqual(getDescription(), tokenEmptyList.getDescription());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        @NotNull
        public String getDescription() {
            return this.description;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        public int getValue() {
            return this.value;
        }

        public int hashCode() {
            return getDescription().hashCode() + (getValue() * 31);
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        public boolean isOk() {
            return STReturnCode.DefaultImpls.isOk(this);
        }

        @NotNull
        public String toString() {
            return z1.c("TokenEmptyList(value=", getValue(), ", description=", getDescription(), ")");
        }

        public TokenEmptyList(int i10, @NotNull String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.value = i10;
            this.description = description;
        }

        public /* synthetic */ TokenEmptyList(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? STRC.RC_ERR_TOKEN_EMPTY_LIST.getValue() : i10, (i11 & 2) != 0 ? "Token list is empty" : str);
        }
    }

    /* JADX INFO: compiled from: STReturnCodeImpl.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STReturnCodeImpl$TokenNotFound;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "", "component1", "", "component2", "value", "description", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getValue", "()I", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class TokenNotFound implements STReturnCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String description;

        /* JADX WARN: Multi-variable type inference failed */
        public TokenNotFound() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ TokenNotFound copy$default(TokenNotFound tokenNotFound, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = tokenNotFound.getValue();
            }
            if ((i11 & 2) != 0) {
                str = tokenNotFound.getDescription();
            }
            return tokenNotFound.copy(i10, str);
        }

        public final int component1() {
            return getValue();
        }

        @NotNull
        public final String component2() {
            return getDescription();
        }

        @NotNull
        public final TokenNotFound copy(int value, @NotNull String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            return new TokenNotFound(value, description);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TokenNotFound)) {
                return false;
            }
            TokenNotFound tokenNotFound = (TokenNotFound) other;
            return getValue() == tokenNotFound.getValue() && Intrinsics.areEqual(getDescription(), tokenNotFound.getDescription());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        @NotNull
        public String getDescription() {
            return this.description;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        public int getValue() {
            return this.value;
        }

        public int hashCode() {
            return getDescription().hashCode() + (getValue() * 31);
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        public boolean isOk() {
            return STReturnCode.DefaultImpls.isOk(this);
        }

        @NotNull
        public String toString() {
            return z1.c("TokenNotFound(value=", getValue(), ", description=", getDescription(), ")");
        }

        public TokenNotFound(int i10, @NotNull String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.value = i10;
            this.description = description;
        }

        public /* synthetic */ TokenNotFound(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? STRC.RC_ERR_TOKEN_NOT_FOUND.getValue() : i10, (i11 & 2) != 0 ? "Token not found" : str);
        }
    }

    /* JADX INFO: compiled from: STReturnCodeImpl.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STReturnCodeImpl$TokensNotDeleted;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "", "component1", "", "component2", "value", "description", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getValue", "()I", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class TokensNotDeleted implements STReturnCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String description;

        /* JADX WARN: Multi-variable type inference failed */
        public TokensNotDeleted() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ TokensNotDeleted copy$default(TokensNotDeleted tokensNotDeleted, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = tokensNotDeleted.getValue();
            }
            if ((i11 & 2) != 0) {
                str = tokensNotDeleted.getDescription();
            }
            return tokensNotDeleted.copy(i10, str);
        }

        public final int component1() {
            return getValue();
        }

        @NotNull
        public final String component2() {
            return getDescription();
        }

        @NotNull
        public final TokensNotDeleted copy(int value, @NotNull String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            return new TokensNotDeleted(value, description);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TokensNotDeleted)) {
                return false;
            }
            TokensNotDeleted tokensNotDeleted = (TokensNotDeleted) other;
            return getValue() == tokensNotDeleted.getValue() && Intrinsics.areEqual(getDescription(), tokensNotDeleted.getDescription());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        @NotNull
        public String getDescription() {
            return this.description;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        public int getValue() {
            return this.value;
        }

        public int hashCode() {
            return getDescription().hashCode() + (getValue() * 31);
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        public boolean isOk() {
            return STReturnCode.DefaultImpls.isOk(this);
        }

        @NotNull
        public String toString() {
            return z1.c("TokensNotDeleted(value=", getValue(), ", description=", getDescription(), ")");
        }

        public TokensNotDeleted(int i10, @NotNull String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.value = i10;
            this.description = description;
        }

        public /* synthetic */ TokensNotDeleted(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? STRC.RC_CUSTOM_ERR_TOKENS_NOT_DELETED.getValue() : i10, (i11 & 2) != 0 ? "An error occurred trying to delete tokens" : str);
        }
    }

    public STReturnCodeImpl(int i10, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.value = i10;
        this.description = str;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
    @NotNull
    public String getDescription() {
        return this.description;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
    public int getValue() {
        return this.value;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
    public boolean isOk() {
        return STReturnCode.DefaultImpls.isOk(this);
    }

    /* JADX INFO: compiled from: STReturnCodeImpl.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0006HÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STReturnCodeImpl$BadActivation;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "", "component1", "", "component2", "", "component3", "cause", "value", "description", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getValue", "()I", "c", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "<init>", "(Ljava/lang/Throwable;ILjava/lang/String;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class BadActivation implements STReturnCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Throwable cause;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String description;

        public BadActivation(@NotNull Throwable cause, int i10, @NotNull String description) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            Intrinsics.checkNotNullParameter(description, "description");
            this.cause = cause;
            this.value = i10;
            this.description = description;
        }

        public static /* synthetic */ BadActivation copy$default(BadActivation badActivation, Throwable th2, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = badActivation.cause;
            }
            if ((i11 & 2) != 0) {
                i10 = badActivation.getValue();
            }
            if ((i11 & 4) != 0) {
                str = badActivation.getDescription();
            }
            return badActivation.copy(th2, i10, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        public final int component2() {
            return getValue();
        }

        @NotNull
        public final String component3() {
            return getDescription();
        }

        @NotNull
        public final BadActivation copy(@NotNull Throwable cause, int value, @NotNull String description) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            Intrinsics.checkNotNullParameter(description, "description");
            return new BadActivation(cause, value, description);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BadActivation)) {
                return false;
            }
            BadActivation badActivation = (BadActivation) other;
            return Intrinsics.areEqual(this.cause, badActivation.cause) && getValue() == badActivation.getValue() && Intrinsics.areEqual(getDescription(), badActivation.getDescription());
        }

        @NotNull
        public final Throwable getCause() {
            return this.cause;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        @NotNull
        public String getDescription() {
            return this.description;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        public int getValue() {
            return this.value;
        }

        public int hashCode() {
            return getDescription().hashCode() + ((getValue() + (this.cause.hashCode() * 31)) * 31);
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        public boolean isOk() {
            return STReturnCode.DefaultImpls.isOk(this);
        }

        @NotNull
        public String toString() {
            int value = getValue();
            String description = getDescription();
            StringBuilder sb2 = new StringBuilder("BadActivation(cause=");
            sb2.append(this.cause);
            sb2.append(", value=");
            sb2.append(value);
            sb2.append(", description=");
            return d.f(sb2, description, ")");
        }

        public /* synthetic */ BadActivation(Throwable th2, int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(th2, (i11 & 2) != 0 ? STRC.RC_ERR_CORE_INTERNAL.getValue() : i10, (i11 & 4) != 0 ? f.d("Bad activation: ", th2.getMessage()) : str);
        }
    }

    /* JADX INFO: compiled from: STReturnCodeImpl.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0006HÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STReturnCodeImpl$BadEnroll;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "", "component1", "", "component2", "", "component3", "cause", "value", "description", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getValue", "()I", "c", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "<init>", "(Ljava/lang/Throwable;ILjava/lang/String;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class BadEnroll implements STReturnCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Throwable cause;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String description;

        public BadEnroll(@NotNull Throwable cause, int i10, @NotNull String description) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            Intrinsics.checkNotNullParameter(description, "description");
            this.cause = cause;
            this.value = i10;
            this.description = description;
        }

        public static /* synthetic */ BadEnroll copy$default(BadEnroll badEnroll, Throwable th2, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = badEnroll.cause;
            }
            if ((i11 & 2) != 0) {
                i10 = badEnroll.getValue();
            }
            if ((i11 & 4) != 0) {
                str = badEnroll.getDescription();
            }
            return badEnroll.copy(th2, i10, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        public final int component2() {
            return getValue();
        }

        @NotNull
        public final String component3() {
            return getDescription();
        }

        @NotNull
        public final BadEnroll copy(@NotNull Throwable cause, int value, @NotNull String description) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            Intrinsics.checkNotNullParameter(description, "description");
            return new BadEnroll(cause, value, description);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BadEnroll)) {
                return false;
            }
            BadEnroll badEnroll = (BadEnroll) other;
            return Intrinsics.areEqual(this.cause, badEnroll.cause) && getValue() == badEnroll.getValue() && Intrinsics.areEqual(getDescription(), badEnroll.getDescription());
        }

        @NotNull
        public final Throwable getCause() {
            return this.cause;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        @NotNull
        public String getDescription() {
            return this.description;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        public int getValue() {
            return this.value;
        }

        public int hashCode() {
            return getDescription().hashCode() + ((getValue() + (this.cause.hashCode() * 31)) * 31);
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        public boolean isOk() {
            return STReturnCode.DefaultImpls.isOk(this);
        }

        @NotNull
        public String toString() {
            int value = getValue();
            String description = getDescription();
            StringBuilder sb2 = new StringBuilder("BadEnroll(cause=");
            sb2.append(this.cause);
            sb2.append(", value=");
            sb2.append(value);
            sb2.append(", description=");
            return d.f(sb2, description, ")");
        }

        public /* synthetic */ BadEnroll(Throwable th2, int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(th2, (i11 & 2) != 0 ? STRC.RC_ERR_ENROLL_NETWORK.getValue() : i10, (i11 & 4) != 0 ? f.d("Bad enroll: ", th2.getMessage()) : str);
        }
    }

    /* JADX INFO: compiled from: STReturnCodeImpl.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0006HÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STReturnCodeImpl$EnrollParamsGeneration;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "Lcom/bbva/ethermobilesdk/token/model/EtherTokenError;", "component1", "", "component2", "", "component3", "cause", "value", "description", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/ethermobilesdk/token/model/EtherTokenError;", "getCause", "()Lcom/bbva/ethermobilesdk/token/model/EtherTokenError;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getValue", "()I", "c", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "<init>", "(Lcom/bbva/ethermobilesdk/token/model/EtherTokenError;ILjava/lang/String;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class EnrollParamsGeneration implements STReturnCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final EtherTokenError cause;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String description;

        public EnrollParamsGeneration(@NotNull EtherTokenError cause, int i10, @NotNull String description) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            Intrinsics.checkNotNullParameter(description, "description");
            this.cause = cause;
            this.value = i10;
            this.description = description;
        }

        public static /* synthetic */ EnrollParamsGeneration copy$default(EnrollParamsGeneration enrollParamsGeneration, EtherTokenError etherTokenError, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                etherTokenError = enrollParamsGeneration.cause;
            }
            if ((i11 & 2) != 0) {
                i10 = enrollParamsGeneration.getValue();
            }
            if ((i11 & 4) != 0) {
                str = enrollParamsGeneration.getDescription();
            }
            return enrollParamsGeneration.copy(etherTokenError, i10, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final EtherTokenError getCause() {
            return this.cause;
        }

        public final int component2() {
            return getValue();
        }

        @NotNull
        public final String component3() {
            return getDescription();
        }

        @NotNull
        public final EnrollParamsGeneration copy(@NotNull EtherTokenError cause, int value, @NotNull String description) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            Intrinsics.checkNotNullParameter(description, "description");
            return new EnrollParamsGeneration(cause, value, description);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EnrollParamsGeneration)) {
                return false;
            }
            EnrollParamsGeneration enrollParamsGeneration = (EnrollParamsGeneration) other;
            return Intrinsics.areEqual(this.cause, enrollParamsGeneration.cause) && getValue() == enrollParamsGeneration.getValue() && Intrinsics.areEqual(getDescription(), enrollParamsGeneration.getDescription());
        }

        @NotNull
        public final EtherTokenError getCause() {
            return this.cause;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        @NotNull
        public String getDescription() {
            return this.description;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        public int getValue() {
            return this.value;
        }

        public int hashCode() {
            return getDescription().hashCode() + ((getValue() + (this.cause.hashCode() * 31)) * 31);
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        public boolean isOk() {
            return STReturnCode.DefaultImpls.isOk(this);
        }

        @NotNull
        public String toString() {
            int value = getValue();
            String description = getDescription();
            StringBuilder sb2 = new StringBuilder("EnrollParamsGeneration(cause=");
            sb2.append(this.cause);
            sb2.append(", value=");
            sb2.append(value);
            sb2.append(", description=");
            return d.f(sb2, description, ")");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ EnrollParamsGeneration(EtherTokenError etherTokenError, int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            i10 = (i11 & 2) != 0 ? STRC.RC_ERR_ENROLL_INVALID_MODE.getValue() : i10;
            if ((i11 & 4) != 0) {
                str = "Cannot generate enroll params: [" + etherTokenError.getType() + "] " + etherTokenError.getMessage();
            }
            this(etherTokenError, i10, str);
        }
    }

    /* JADX INFO: compiled from: STReturnCodeImpl.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STReturnCodeImpl$FeatureUnavailable;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "", "component1", "", "component2", "component3", c.f50460q, "value", "description", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getFeature", "()Ljava/lang/String;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getValue", "()I", "c", "getDescription", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class FeatureUnavailable implements STReturnCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String feature;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String description;

        public FeatureUnavailable(@NotNull String feature, int i10, @NotNull String description) {
            Intrinsics.checkNotNullParameter(feature, "feature");
            Intrinsics.checkNotNullParameter(description, "description");
            this.feature = feature;
            this.value = i10;
            this.description = description;
        }

        public static /* synthetic */ FeatureUnavailable copy$default(FeatureUnavailable featureUnavailable, String str, int i10, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = featureUnavailable.feature;
            }
            if ((i11 & 2) != 0) {
                i10 = featureUnavailable.getValue();
            }
            if ((i11 & 4) != 0) {
                str2 = featureUnavailable.getDescription();
            }
            return featureUnavailable.copy(str, i10, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFeature() {
            return this.feature;
        }

        public final int component2() {
            return getValue();
        }

        @NotNull
        public final String component3() {
            return getDescription();
        }

        @NotNull
        public final FeatureUnavailable copy(@NotNull String feature, int value, @NotNull String description) {
            Intrinsics.checkNotNullParameter(feature, "feature");
            Intrinsics.checkNotNullParameter(description, "description");
            return new FeatureUnavailable(feature, value, description);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeatureUnavailable)) {
                return false;
            }
            FeatureUnavailable featureUnavailable = (FeatureUnavailable) other;
            return Intrinsics.areEqual(this.feature, featureUnavailable.feature) && getValue() == featureUnavailable.getValue() && Intrinsics.areEqual(getDescription(), featureUnavailable.getDescription());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        @NotNull
        public String getDescription() {
            return this.description;
        }

        @NotNull
        public final String getFeature() {
            return this.feature;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        public int getValue() {
            return this.value;
        }

        public int hashCode() {
            return getDescription().hashCode() + ((getValue() + (this.feature.hashCode() * 31)) * 31);
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        public boolean isOk() {
            return STReturnCode.DefaultImpls.isOk(this);
        }

        @NotNull
        public String toString() {
            int value = getValue();
            String description = getDescription();
            StringBuilder sb2 = new StringBuilder("FeatureUnavailable(feature=");
            sb2.append(this.feature);
            sb2.append(", value=");
            sb2.append(value);
            sb2.append(", description=");
            return d.f(sb2, description, ")");
        }

        public /* synthetic */ FeatureUnavailable(String str, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? STRC.RC_CUSTOM_FEATURE_NOT_AVAILABLE.getValue() : i10, (i11 & 4) != 0 ? f.d("Feature unavailable: ", str) : str2);
        }
    }

    /* JADX INFO: compiled from: STReturnCodeImpl.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STReturnCodeImpl$InvalidEnrollParams;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "", "component1", "", "component2", "component3", "param", "value", "description", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getParam", "()Ljava/lang/String;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getValue", "()I", "c", "getDescription", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class InvalidEnrollParams implements STReturnCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String param;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String description;

        public InvalidEnrollParams(@NotNull String param, int i10, @NotNull String description) {
            Intrinsics.checkNotNullParameter(param, "param");
            Intrinsics.checkNotNullParameter(description, "description");
            this.param = param;
            this.value = i10;
            this.description = description;
        }

        public static /* synthetic */ InvalidEnrollParams copy$default(InvalidEnrollParams invalidEnrollParams, String str, int i10, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = invalidEnrollParams.param;
            }
            if ((i11 & 2) != 0) {
                i10 = invalidEnrollParams.getValue();
            }
            if ((i11 & 4) != 0) {
                str2 = invalidEnrollParams.getDescription();
            }
            return invalidEnrollParams.copy(str, i10, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getParam() {
            return this.param;
        }

        public final int component2() {
            return getValue();
        }

        @NotNull
        public final String component3() {
            return getDescription();
        }

        @NotNull
        public final InvalidEnrollParams copy(@NotNull String param, int value, @NotNull String description) {
            Intrinsics.checkNotNullParameter(param, "param");
            Intrinsics.checkNotNullParameter(description, "description");
            return new InvalidEnrollParams(param, value, description);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InvalidEnrollParams)) {
                return false;
            }
            InvalidEnrollParams invalidEnrollParams = (InvalidEnrollParams) other;
            return Intrinsics.areEqual(this.param, invalidEnrollParams.param) && getValue() == invalidEnrollParams.getValue() && Intrinsics.areEqual(getDescription(), invalidEnrollParams.getDescription());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        @NotNull
        public String getDescription() {
            return this.description;
        }

        @NotNull
        public final String getParam() {
            return this.param;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        public int getValue() {
            return this.value;
        }

        public int hashCode() {
            return getDescription().hashCode() + ((getValue() + (this.param.hashCode() * 31)) * 31);
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        public boolean isOk() {
            return STReturnCode.DefaultImpls.isOk(this);
        }

        @NotNull
        public String toString() {
            int value = getValue();
            String description = getDescription();
            StringBuilder sb2 = new StringBuilder("InvalidEnrollParams(param=");
            sb2.append(this.param);
            sb2.append(", value=");
            sb2.append(value);
            sb2.append(", description=");
            return d.f(sb2, description, ")");
        }

        public /* synthetic */ InvalidEnrollParams(String str, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? STRC.RC_ERR_ENROLL_PARAMS.getValue() : i10, (i11 & 4) != 0 ? f.d("Invalid enroll params: ", str) : str2);
        }
    }

    /* JADX INFO: compiled from: STReturnCodeImpl.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STReturnCodeImpl$TokenNotDeleted;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "", "component1", "", "component2", "component3", "cause", "value", "description", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getCause", "()Ljava/lang/String;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getValue", "()I", "c", "getDescription", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class TokenNotDeleted implements STReturnCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String cause;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String description;

        public TokenNotDeleted(@NotNull String cause, int i10, @NotNull String description) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            Intrinsics.checkNotNullParameter(description, "description");
            this.cause = cause;
            this.value = i10;
            this.description = description;
        }

        public static /* synthetic */ TokenNotDeleted copy$default(TokenNotDeleted tokenNotDeleted, String str, int i10, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = tokenNotDeleted.cause;
            }
            if ((i11 & 2) != 0) {
                i10 = tokenNotDeleted.getValue();
            }
            if ((i11 & 4) != 0) {
                str2 = tokenNotDeleted.getDescription();
            }
            return tokenNotDeleted.copy(str, i10, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCause() {
            return this.cause;
        }

        public final int component2() {
            return getValue();
        }

        @NotNull
        public final String component3() {
            return getDescription();
        }

        @NotNull
        public final TokenNotDeleted copy(@NotNull String cause, int value, @NotNull String description) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            Intrinsics.checkNotNullParameter(description, "description");
            return new TokenNotDeleted(cause, value, description);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TokenNotDeleted)) {
                return false;
            }
            TokenNotDeleted tokenNotDeleted = (TokenNotDeleted) other;
            return Intrinsics.areEqual(this.cause, tokenNotDeleted.cause) && getValue() == tokenNotDeleted.getValue() && Intrinsics.areEqual(getDescription(), tokenNotDeleted.getDescription());
        }

        @NotNull
        public final String getCause() {
            return this.cause;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        @NotNull
        public String getDescription() {
            return this.description;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        public int getValue() {
            return this.value;
        }

        public int hashCode() {
            return getDescription().hashCode() + ((getValue() + (this.cause.hashCode() * 31)) * 31);
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode
        public boolean isOk() {
            return STReturnCode.DefaultImpls.isOk(this);
        }

        @NotNull
        public String toString() {
            int value = getValue();
            String description = getDescription();
            StringBuilder sb2 = new StringBuilder("TokenNotDeleted(cause=");
            sb2.append(this.cause);
            sb2.append(", value=");
            sb2.append(value);
            sb2.append(", description=");
            return d.f(sb2, description, ")");
        }

        public /* synthetic */ TokenNotDeleted(String str, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? STRC.RC_CUSTOM_ERR_TOKEN_NOT_DELETED.getValue() : i10, (i11 & 4) != 0 ? f.d("Token not deleted: ", str) : str2);
        }
    }
}
