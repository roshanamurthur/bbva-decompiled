package com.bbva.ethermobilesdk.tokencompat.model.legacy.impl;

import com.bbva.ethermobilesdk.tokencompat.model.legacy.STRemainingTime;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: STRemainingTimeImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000e\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0001\u0010¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STRemainingTimeImpl;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STRemainingTime;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "a", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "getRc", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "rc", "", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getRemainingTime", "()I", "remainingTime", "Ok", "OtpNull", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STRemainingTimeImpl$Ok;", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
public abstract class STRemainingTimeImpl implements STRemainingTime {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final STReturnCode rc;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int remainingTime;

    /* JADX INFO: compiled from: STRemainingTimeImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STRemainingTimeImpl$Ok;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STRemainingTimeImpl;", "remainingTime", "", "(I)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Ok extends STRemainingTimeImpl {
        public Ok(int i10) {
            super(new STReturnCodeImpl.Ok(0, null, 3, null), i10, null);
        }
    }

    /* JADX INFO: compiled from: STRemainingTimeImpl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STRemainingTimeImpl$OtpNull;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STRemainingTime;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "a", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "getRc", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "rc", "", "remainingTime", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getRemainingTime", "()I", "<init>", "()V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final class OtpNull implements STRemainingTime {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final STReturnCodeImpl.OtpNull f30525a = new STReturnCodeImpl.OtpNull(0, null, 3, null);

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STRemainingTime
        @NotNull
        public STReturnCode getRc() {
            return this.f30525a;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STRemainingTime
        public int getRemainingTime() {
            return 0;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STRemainingTime
        public boolean isOk() {
            return STRemainingTime.DefaultImpls.isOk(this);
        }
    }

    public STRemainingTimeImpl(STReturnCode sTReturnCode, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this.rc = sTReturnCode;
        this.remainingTime = i10;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STRemainingTime
    @NotNull
    public STReturnCode getRc() {
        return this.rc;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STRemainingTime
    public int getRemainingTime() {
        return this.remainingTime;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STRemainingTime
    public boolean isOk() {
        return STRemainingTime.DefaultImpls.isOk(this);
    }
}
