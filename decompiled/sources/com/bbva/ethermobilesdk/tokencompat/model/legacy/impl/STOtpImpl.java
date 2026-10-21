package com.bbva.ethermobilesdk.tokencompat.model.legacy.impl;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STOtp;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: STOtpImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b6\u0018\u00002\u00020\u0001:\u0002\u000e\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STOtpImpl;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STOtp;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "a", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "getRc", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "rc", "", "b", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "OtpNull", "OtpOk", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
public abstract class STOtpImpl implements STOtp {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final STReturnCode rc;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String value;

    /* JADX INFO: compiled from: STOtpImpl.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STOtpImpl$OtpNull;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STOtp;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "component1", "", "component2", "rc", "value", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "getRc", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "b", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;Ljava/lang/String;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class OtpNull implements STOtp {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final STReturnCode rc;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String value;

        /* JADX WARN: Multi-variable type inference failed */
        public OtpNull() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ OtpNull copy$default(OtpNull otpNull, STReturnCode sTReturnCode, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                sTReturnCode = otpNull.getRc();
            }
            if ((i10 & 2) != 0) {
                str = otpNull.getValue();
            }
            return otpNull.copy(sTReturnCode, str);
        }

        @NotNull
        public final STReturnCode component1() {
            return getRc();
        }

        @Nullable
        public final String component2() {
            return getValue();
        }

        @NotNull
        public final OtpNull copy(@NotNull STReturnCode rc2, @Nullable String value) {
            Intrinsics.checkNotNullParameter(rc2, "rc");
            return new OtpNull(rc2, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OtpNull)) {
                return false;
            }
            OtpNull otpNull = (OtpNull) other;
            return Intrinsics.areEqual(getRc(), otpNull.getRc()) && Intrinsics.areEqual(getValue(), otpNull.getValue());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STOtp
        @NotNull
        public STReturnCode getRc() {
            return this.rc;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STOtp
        @Nullable
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return (getRc().hashCode() * 31) + (getValue() == null ? 0 : getValue().hashCode());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STOtp
        public boolean isOk() {
            return STOtp.DefaultImpls.isOk(this);
        }

        @NotNull
        public String toString() {
            return "OtpNull(rc=" + getRc() + ", value=" + getValue() + ")";
        }

        public OtpNull(@NotNull STReturnCode rc2, @Nullable String str) {
            Intrinsics.checkNotNullParameter(rc2, "rc");
            this.rc = rc2;
            this.value = str;
        }

        public /* synthetic */ OtpNull(STReturnCode sTReturnCode, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new STReturnCodeImpl.OtpNull(0, null, 3, null) : sTReturnCode, (i10 & 2) != 0 ? null : str);
        }
    }

    public STOtpImpl(STReturnCode sTReturnCode, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.rc = sTReturnCode;
        this.value = str;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STOtp
    @NotNull
    public STReturnCode getRc() {
        return this.rc;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STOtp
    @Nullable
    public String getValue() {
        return this.value;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STOtp
    public boolean isOk() {
        return STOtp.DefaultImpls.isOk(this);
    }

    /* JADX INFO: compiled from: STOtpImpl.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STOtpImpl$OtpOk;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STOtp;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "component1", "", "component2", "rc", "value", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "getRc", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "b", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;Ljava/lang/String;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class OtpOk implements STOtp {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final STReturnCode rc;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String value;

        public OtpOk(@NotNull STReturnCode rc2, @Nullable String str) {
            Intrinsics.checkNotNullParameter(rc2, "rc");
            this.rc = rc2;
            this.value = str;
        }

        public static /* synthetic */ OtpOk copy$default(OtpOk otpOk, STReturnCode sTReturnCode, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                sTReturnCode = otpOk.getRc();
            }
            if ((i10 & 2) != 0) {
                str = otpOk.getValue();
            }
            return otpOk.copy(sTReturnCode, str);
        }

        @NotNull
        public final STReturnCode component1() {
            return getRc();
        }

        @Nullable
        public final String component2() {
            return getValue();
        }

        @NotNull
        public final OtpOk copy(@NotNull STReturnCode rc2, @Nullable String value) {
            Intrinsics.checkNotNullParameter(rc2, "rc");
            return new OtpOk(rc2, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OtpOk)) {
                return false;
            }
            OtpOk otpOk = (OtpOk) other;
            return Intrinsics.areEqual(getRc(), otpOk.getRc()) && Intrinsics.areEqual(getValue(), otpOk.getValue());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STOtp
        @NotNull
        public STReturnCode getRc() {
            return this.rc;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STOtp
        @Nullable
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return (getRc().hashCode() * 31) + (getValue() == null ? 0 : getValue().hashCode());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STOtp
        public boolean isOk() {
            return STOtp.DefaultImpls.isOk(this);
        }

        @NotNull
        public String toString() {
            return "OtpOk(rc=" + getRc() + ", value=" + getValue() + ")";
        }

        public /* synthetic */ OtpOk(STReturnCode sTReturnCode, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new STReturnCodeImpl.Ok(0, null, 3, null) : sTReturnCode, str);
        }
    }
}
