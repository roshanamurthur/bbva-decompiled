package com.bbva.ethermobilesdk.tokencompat.model.legacy.impl;

import com.bbva.ethermobilesdk.token.model.EtherTokenError;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.TokenPub;
import com.huawei.hms.feature.model.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: STTokenImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b6\u0018\u00002\u00020\u0001:\u0007\u000e\u000f\u0010\u0011\u0012\u0013\u0014R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STTokenImpl;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STToken;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "a", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "getRc", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "rc", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "b", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "getValue", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "value", "BadActivation", "BadEnroll", "EnrollParamsGeneration", "FeatureUnavailable", "InvalidEnrollParams", "TokenNotFound", "TokenValidResult", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
public abstract class STTokenImpl implements STToken {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final STReturnCode rc;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final TokenPub value;

    /* JADX INFO: compiled from: STTokenImpl.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STTokenImpl$TokenNotFound;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STToken;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "component1", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "component2", "rc", "value", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "getRc", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "b", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "getValue", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "<init>", "(Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class TokenNotFound implements STToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final STReturnCode rc;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final TokenPub value;

        /* JADX WARN: Multi-variable type inference failed */
        public TokenNotFound() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ TokenNotFound copy$default(TokenNotFound tokenNotFound, STReturnCode sTReturnCode, TokenPub tokenPub, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                sTReturnCode = tokenNotFound.getRc();
            }
            if ((i10 & 2) != 0) {
                tokenPub = tokenNotFound.getValue();
            }
            return tokenNotFound.copy(sTReturnCode, tokenPub);
        }

        @NotNull
        public final STReturnCode component1() {
            return getRc();
        }

        @Nullable
        public final TokenPub component2() {
            return getValue();
        }

        @NotNull
        public final TokenNotFound copy(@NotNull STReturnCode rc2, @Nullable TokenPub value) {
            Intrinsics.checkNotNullParameter(rc2, "rc");
            return new TokenNotFound(rc2, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TokenNotFound)) {
                return false;
            }
            TokenNotFound tokenNotFound = (TokenNotFound) other;
            return Intrinsics.areEqual(getRc(), tokenNotFound.getRc()) && Intrinsics.areEqual(getValue(), tokenNotFound.getValue());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken
        @NotNull
        public STReturnCode getRc() {
            return this.rc;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken
        @Nullable
        public TokenPub getValue() {
            return this.value;
        }

        public int hashCode() {
            return (getRc().hashCode() * 31) + (getValue() == null ? 0 : getValue().hashCode());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken
        public boolean isOk() {
            return STToken.DefaultImpls.isOk(this);
        }

        @NotNull
        public String toString() {
            return "TokenNotFound(rc=" + getRc() + ", value=" + getValue() + ")";
        }

        public TokenNotFound(@NotNull STReturnCode rc2, @Nullable TokenPub tokenPub) {
            Intrinsics.checkNotNullParameter(rc2, "rc");
            this.rc = rc2;
            this.value = tokenPub;
        }

        public /* synthetic */ TokenNotFound(STReturnCode sTReturnCode, TokenPub tokenPub, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new STReturnCodeImpl.TokenNotFound(0, null, 3, null) : sTReturnCode, (i10 & 2) != 0 ? null : tokenPub);
        }
    }

    public STTokenImpl(STReturnCode sTReturnCode, TokenPub tokenPub, DefaultConstructorMarker defaultConstructorMarker) {
        this.rc = sTReturnCode;
        this.value = tokenPub;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken
    @NotNull
    public STReturnCode getRc() {
        return this.rc;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken
    @Nullable
    public TokenPub getValue() {
        return this.value;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken
    public boolean isOk() {
        return STToken.DefaultImpls.isOk(this);
    }

    /* JADX INFO: compiled from: STTokenImpl.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STTokenImpl$TokenValidResult;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STToken;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "component1", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "component2", "rc", "value", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "getRc", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "b", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "getValue", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "<init>", "(Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class TokenValidResult implements STToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final STReturnCode rc;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final TokenPub value;

        public TokenValidResult(@NotNull STReturnCode rc2, @NotNull TokenPub value) {
            Intrinsics.checkNotNullParameter(rc2, "rc");
            Intrinsics.checkNotNullParameter(value, "value");
            this.rc = rc2;
            this.value = value;
        }

        public static /* synthetic */ TokenValidResult copy$default(TokenValidResult tokenValidResult, STReturnCode sTReturnCode, TokenPub tokenPub, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                sTReturnCode = tokenValidResult.getRc();
            }
            if ((i10 & 2) != 0) {
                tokenPub = tokenValidResult.getValue();
            }
            return tokenValidResult.copy(sTReturnCode, tokenPub);
        }

        @NotNull
        public final STReturnCode component1() {
            return getRc();
        }

        @NotNull
        public final TokenPub component2() {
            return getValue();
        }

        @NotNull
        public final TokenValidResult copy(@NotNull STReturnCode rc2, @NotNull TokenPub value) {
            Intrinsics.checkNotNullParameter(rc2, "rc");
            Intrinsics.checkNotNullParameter(value, "value");
            return new TokenValidResult(rc2, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TokenValidResult)) {
                return false;
            }
            TokenValidResult tokenValidResult = (TokenValidResult) other;
            return Intrinsics.areEqual(getRc(), tokenValidResult.getRc()) && Intrinsics.areEqual(getValue(), tokenValidResult.getValue());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken
        @NotNull
        public STReturnCode getRc() {
            return this.rc;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken
        @NotNull
        public TokenPub getValue() {
            return this.value;
        }

        public int hashCode() {
            return getValue().hashCode() + (getRc().hashCode() * 31);
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken
        public boolean isOk() {
            return STToken.DefaultImpls.isOk(this);
        }

        @NotNull
        public String toString() {
            return "TokenValidResult(rc=" + getRc() + ", value=" + getValue() + ")";
        }

        public /* synthetic */ TokenValidResult(STReturnCode sTReturnCode, TokenPub tokenPub, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new STReturnCodeImpl.Ok(0, null, 3, null) : sTReturnCode, tokenPub);
        }
    }

    /* JADX INFO: compiled from: STTokenImpl.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STTokenImpl$BadActivation;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STToken;", "", "component1", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "component2", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "component3", "cause", "rc", "value", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "b", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "getRc", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "c", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "getValue", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "<init>", "(Ljava/lang/Throwable;Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class BadActivation implements STToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Throwable cause;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final STReturnCode rc;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final TokenPub value;

        public BadActivation(@NotNull Throwable cause, @NotNull STReturnCode rc2, @Nullable TokenPub tokenPub) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            Intrinsics.checkNotNullParameter(rc2, "rc");
            this.cause = cause;
            this.rc = rc2;
            this.value = tokenPub;
        }

        public static /* synthetic */ BadActivation copy$default(BadActivation badActivation, Throwable th2, STReturnCode sTReturnCode, TokenPub tokenPub, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th2 = badActivation.cause;
            }
            if ((i10 & 2) != 0) {
                sTReturnCode = badActivation.getRc();
            }
            if ((i10 & 4) != 0) {
                tokenPub = badActivation.getValue();
            }
            return badActivation.copy(th2, sTReturnCode, tokenPub);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        @NotNull
        public final STReturnCode component2() {
            return getRc();
        }

        @Nullable
        public final TokenPub component3() {
            return getValue();
        }

        @NotNull
        public final BadActivation copy(@NotNull Throwable cause, @NotNull STReturnCode rc2, @Nullable TokenPub value) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            Intrinsics.checkNotNullParameter(rc2, "rc");
            return new BadActivation(cause, rc2, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BadActivation)) {
                return false;
            }
            BadActivation badActivation = (BadActivation) other;
            return Intrinsics.areEqual(this.cause, badActivation.cause) && Intrinsics.areEqual(getRc(), badActivation.getRc()) && Intrinsics.areEqual(getValue(), badActivation.getValue());
        }

        @NotNull
        public final Throwable getCause() {
            return this.cause;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken
        @NotNull
        public STReturnCode getRc() {
            return this.rc;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken
        @Nullable
        public TokenPub getValue() {
            return this.value;
        }

        public int hashCode() {
            return ((getRc().hashCode() + (this.cause.hashCode() * 31)) * 31) + (getValue() == null ? 0 : getValue().hashCode());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken
        public boolean isOk() {
            return STToken.DefaultImpls.isOk(this);
        }

        @NotNull
        public String toString() {
            return "BadActivation(cause=" + this.cause + ", rc=" + getRc() + ", value=" + getValue() + ")";
        }

        public /* synthetic */ BadActivation(Throwable th2, STReturnCode sTReturnCode, TokenPub tokenPub, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(th2, (i10 & 2) != 0 ? new STReturnCodeImpl.BadActivation(th2, 0, null, 6, null) : sTReturnCode, (i10 & 4) != 0 ? null : tokenPub);
        }
    }

    /* JADX INFO: compiled from: STTokenImpl.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STTokenImpl$BadEnroll;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STToken;", "", "component1", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "component2", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "component3", "cause", "rc", "value", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "b", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "getRc", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "c", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "getValue", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "<init>", "(Ljava/lang/Throwable;Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class BadEnroll implements STToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Throwable cause;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final STReturnCode rc;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final TokenPub value;

        public BadEnroll(@NotNull Throwable cause, @NotNull STReturnCode rc2, @Nullable TokenPub tokenPub) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            Intrinsics.checkNotNullParameter(rc2, "rc");
            this.cause = cause;
            this.rc = rc2;
            this.value = tokenPub;
        }

        public static /* synthetic */ BadEnroll copy$default(BadEnroll badEnroll, Throwable th2, STReturnCode sTReturnCode, TokenPub tokenPub, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th2 = badEnroll.cause;
            }
            if ((i10 & 2) != 0) {
                sTReturnCode = badEnroll.getRc();
            }
            if ((i10 & 4) != 0) {
                tokenPub = badEnroll.getValue();
            }
            return badEnroll.copy(th2, sTReturnCode, tokenPub);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        @NotNull
        public final STReturnCode component2() {
            return getRc();
        }

        @Nullable
        public final TokenPub component3() {
            return getValue();
        }

        @NotNull
        public final BadEnroll copy(@NotNull Throwable cause, @NotNull STReturnCode rc2, @Nullable TokenPub value) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            Intrinsics.checkNotNullParameter(rc2, "rc");
            return new BadEnroll(cause, rc2, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BadEnroll)) {
                return false;
            }
            BadEnroll badEnroll = (BadEnroll) other;
            return Intrinsics.areEqual(this.cause, badEnroll.cause) && Intrinsics.areEqual(getRc(), badEnroll.getRc()) && Intrinsics.areEqual(getValue(), badEnroll.getValue());
        }

        @NotNull
        public final Throwable getCause() {
            return this.cause;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken
        @NotNull
        public STReturnCode getRc() {
            return this.rc;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken
        @Nullable
        public TokenPub getValue() {
            return this.value;
        }

        public int hashCode() {
            return ((getRc().hashCode() + (this.cause.hashCode() * 31)) * 31) + (getValue() == null ? 0 : getValue().hashCode());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken
        public boolean isOk() {
            return STToken.DefaultImpls.isOk(this);
        }

        @NotNull
        public String toString() {
            return "BadEnroll(cause=" + this.cause + ", rc=" + getRc() + ", value=" + getValue() + ")";
        }

        public /* synthetic */ BadEnroll(Throwable th2, STReturnCode sTReturnCode, TokenPub tokenPub, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(th2, (i10 & 2) != 0 ? new STReturnCodeImpl.BadEnroll(th2, 0, null, 6, null) : sTReturnCode, (i10 & 4) != 0 ? null : tokenPub);
        }
    }

    /* JADX INFO: compiled from: STTokenImpl.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STTokenImpl$EnrollParamsGeneration;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STToken;", "Lcom/bbva/ethermobilesdk/token/model/EtherTokenError;", "component1", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "component2", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "component3", "cause", "rc", "value", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/ethermobilesdk/token/model/EtherTokenError;", "getCause", "()Lcom/bbva/ethermobilesdk/token/model/EtherTokenError;", "b", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "getRc", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "c", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "getValue", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "<init>", "(Lcom/bbva/ethermobilesdk/token/model/EtherTokenError;Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class EnrollParamsGeneration implements STToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final EtherTokenError cause;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final STReturnCode rc;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final TokenPub value;

        public EnrollParamsGeneration(@NotNull EtherTokenError cause, @NotNull STReturnCode rc2, @Nullable TokenPub tokenPub) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            Intrinsics.checkNotNullParameter(rc2, "rc");
            this.cause = cause;
            this.rc = rc2;
            this.value = tokenPub;
        }

        public static /* synthetic */ EnrollParamsGeneration copy$default(EnrollParamsGeneration enrollParamsGeneration, EtherTokenError etherTokenError, STReturnCode sTReturnCode, TokenPub tokenPub, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                etherTokenError = enrollParamsGeneration.cause;
            }
            if ((i10 & 2) != 0) {
                sTReturnCode = enrollParamsGeneration.getRc();
            }
            if ((i10 & 4) != 0) {
                tokenPub = enrollParamsGeneration.getValue();
            }
            return enrollParamsGeneration.copy(etherTokenError, sTReturnCode, tokenPub);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final EtherTokenError getCause() {
            return this.cause;
        }

        @NotNull
        public final STReturnCode component2() {
            return getRc();
        }

        @Nullable
        public final TokenPub component3() {
            return getValue();
        }

        @NotNull
        public final EnrollParamsGeneration copy(@NotNull EtherTokenError cause, @NotNull STReturnCode rc2, @Nullable TokenPub value) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            Intrinsics.checkNotNullParameter(rc2, "rc");
            return new EnrollParamsGeneration(cause, rc2, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EnrollParamsGeneration)) {
                return false;
            }
            EnrollParamsGeneration enrollParamsGeneration = (EnrollParamsGeneration) other;
            return Intrinsics.areEqual(this.cause, enrollParamsGeneration.cause) && Intrinsics.areEqual(getRc(), enrollParamsGeneration.getRc()) && Intrinsics.areEqual(getValue(), enrollParamsGeneration.getValue());
        }

        @NotNull
        public final EtherTokenError getCause() {
            return this.cause;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken
        @NotNull
        public STReturnCode getRc() {
            return this.rc;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken
        @Nullable
        public TokenPub getValue() {
            return this.value;
        }

        public int hashCode() {
            return ((getRc().hashCode() + (this.cause.hashCode() * 31)) * 31) + (getValue() == null ? 0 : getValue().hashCode());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken
        public boolean isOk() {
            return STToken.DefaultImpls.isOk(this);
        }

        @NotNull
        public String toString() {
            return "EnrollParamsGeneration(cause=" + this.cause + ", rc=" + getRc() + ", value=" + getValue() + ")";
        }

        public /* synthetic */ EnrollParamsGeneration(EtherTokenError etherTokenError, STReturnCode sTReturnCode, TokenPub tokenPub, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(etherTokenError, (i10 & 2) != 0 ? new STReturnCodeImpl.EnrollParamsGeneration(etherTokenError, 0, null, 6, null) : sTReturnCode, (i10 & 4) != 0 ? null : tokenPub);
        }
    }

    /* JADX INFO: compiled from: STTokenImpl.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STTokenImpl$FeatureUnavailable;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STToken;", "", "component1", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "component2", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "component3", c.f50460q, "rc", "value", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getFeature", "()Ljava/lang/String;", "b", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "getRc", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "c", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "getValue", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "<init>", "(Ljava/lang/String;Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class FeatureUnavailable implements STToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String feature;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final STReturnCode rc;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final TokenPub value;

        public FeatureUnavailable(@NotNull String feature, @NotNull STReturnCode rc2, @Nullable TokenPub tokenPub) {
            Intrinsics.checkNotNullParameter(feature, "feature");
            Intrinsics.checkNotNullParameter(rc2, "rc");
            this.feature = feature;
            this.rc = rc2;
            this.value = tokenPub;
        }

        public static /* synthetic */ FeatureUnavailable copy$default(FeatureUnavailable featureUnavailable, String str, STReturnCode sTReturnCode, TokenPub tokenPub, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = featureUnavailable.feature;
            }
            if ((i10 & 2) != 0) {
                sTReturnCode = featureUnavailable.getRc();
            }
            if ((i10 & 4) != 0) {
                tokenPub = featureUnavailable.getValue();
            }
            return featureUnavailable.copy(str, sTReturnCode, tokenPub);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFeature() {
            return this.feature;
        }

        @NotNull
        public final STReturnCode component2() {
            return getRc();
        }

        @Nullable
        public final TokenPub component3() {
            return getValue();
        }

        @NotNull
        public final FeatureUnavailable copy(@NotNull String feature, @NotNull STReturnCode rc2, @Nullable TokenPub value) {
            Intrinsics.checkNotNullParameter(feature, "feature");
            Intrinsics.checkNotNullParameter(rc2, "rc");
            return new FeatureUnavailable(feature, rc2, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeatureUnavailable)) {
                return false;
            }
            FeatureUnavailable featureUnavailable = (FeatureUnavailable) other;
            return Intrinsics.areEqual(this.feature, featureUnavailable.feature) && Intrinsics.areEqual(getRc(), featureUnavailable.getRc()) && Intrinsics.areEqual(getValue(), featureUnavailable.getValue());
        }

        @NotNull
        public final String getFeature() {
            return this.feature;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken
        @NotNull
        public STReturnCode getRc() {
            return this.rc;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken
        @Nullable
        public TokenPub getValue() {
            return this.value;
        }

        public int hashCode() {
            return ((getRc().hashCode() + (this.feature.hashCode() * 31)) * 31) + (getValue() == null ? 0 : getValue().hashCode());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken
        public boolean isOk() {
            return STToken.DefaultImpls.isOk(this);
        }

        @NotNull
        public String toString() {
            return "FeatureUnavailable(feature=" + this.feature + ", rc=" + getRc() + ", value=" + getValue() + ")";
        }

        public /* synthetic */ FeatureUnavailable(String str, STReturnCode sTReturnCode, TokenPub tokenPub, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? new STReturnCodeImpl.FeatureUnavailable(str, 0, null, 6, null) : sTReturnCode, (i10 & 4) != 0 ? null : tokenPub);
        }
    }

    /* JADX INFO: compiled from: STTokenImpl.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STTokenImpl$InvalidEnrollParams;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STToken;", "", "component1", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "component2", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "component3", "param", "rc", "value", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getParam", "()Ljava/lang/String;", "b", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "getRc", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "c", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "getValue", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "<init>", "(Ljava/lang/String;Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class InvalidEnrollParams implements STToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String param;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final STReturnCode rc;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final TokenPub value;

        public InvalidEnrollParams(@NotNull String param, @NotNull STReturnCode rc2, @Nullable TokenPub tokenPub) {
            Intrinsics.checkNotNullParameter(param, "param");
            Intrinsics.checkNotNullParameter(rc2, "rc");
            this.param = param;
            this.rc = rc2;
            this.value = tokenPub;
        }

        public static /* synthetic */ InvalidEnrollParams copy$default(InvalidEnrollParams invalidEnrollParams, String str, STReturnCode sTReturnCode, TokenPub tokenPub, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = invalidEnrollParams.param;
            }
            if ((i10 & 2) != 0) {
                sTReturnCode = invalidEnrollParams.getRc();
            }
            if ((i10 & 4) != 0) {
                tokenPub = invalidEnrollParams.getValue();
            }
            return invalidEnrollParams.copy(str, sTReturnCode, tokenPub);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getParam() {
            return this.param;
        }

        @NotNull
        public final STReturnCode component2() {
            return getRc();
        }

        @Nullable
        public final TokenPub component3() {
            return getValue();
        }

        @NotNull
        public final InvalidEnrollParams copy(@NotNull String param, @NotNull STReturnCode rc2, @Nullable TokenPub value) {
            Intrinsics.checkNotNullParameter(param, "param");
            Intrinsics.checkNotNullParameter(rc2, "rc");
            return new InvalidEnrollParams(param, rc2, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InvalidEnrollParams)) {
                return false;
            }
            InvalidEnrollParams invalidEnrollParams = (InvalidEnrollParams) other;
            return Intrinsics.areEqual(this.param, invalidEnrollParams.param) && Intrinsics.areEqual(getRc(), invalidEnrollParams.getRc()) && Intrinsics.areEqual(getValue(), invalidEnrollParams.getValue());
        }

        @NotNull
        public final String getParam() {
            return this.param;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken
        @NotNull
        public STReturnCode getRc() {
            return this.rc;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken
        @Nullable
        public TokenPub getValue() {
            return this.value;
        }

        public int hashCode() {
            return ((getRc().hashCode() + (this.param.hashCode() * 31)) * 31) + (getValue() == null ? 0 : getValue().hashCode());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken
        public boolean isOk() {
            return STToken.DefaultImpls.isOk(this);
        }

        @NotNull
        public String toString() {
            return "InvalidEnrollParams(param=" + this.param + ", rc=" + getRc() + ", value=" + getValue() + ")";
        }

        public /* synthetic */ InvalidEnrollParams(String str, STReturnCode sTReturnCode, TokenPub tokenPub, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? new STReturnCodeImpl.InvalidEnrollParams(str, 0, null, 6, null) : sTReturnCode, (i10 & 4) != 0 ? null : tokenPub);
        }
    }
}
