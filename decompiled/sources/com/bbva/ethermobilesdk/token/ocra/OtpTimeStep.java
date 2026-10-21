package com.bbva.ethermobilesdk.token.ocra;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.noknok.android.client.metrics.Tabulator;
import com.noknok.android.client.utils.UIConfigTags;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OcraSuite.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/bbva/ethermobilesdk/token/ocra/OtpTimeStep;", "", "value", "", Tabulator.KEY_UNIT, "Lcom/bbva/ethermobilesdk/token/ocra/OtpTimeUnit;", "(ILcom/bbva/ethermobilesdk/token/ocra/OtpTimeUnit;)V", UIConfigTags.TAG_SECONDS, "getSeconds", "()I", "getUnit", "()Lcom/bbva/ethermobilesdk/token/ocra/OtpTimeUnit;", "getValue", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "", "ethertoken_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OtpTimeStep {

    @NotNull
    private final OtpTimeUnit unit;
    private final int value;

    /* JADX INFO: compiled from: OcraSuite.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OtpTimeUnit.values().length];
            try {
                iArr[OtpTimeUnit.H.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OtpTimeUnit.M.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OtpTimeUnit.S.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OtpTimeStep(int i10, @NotNull OtpTimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.value = i10;
        this.unit = unit;
    }

    public static /* synthetic */ OtpTimeStep copy$default(OtpTimeStep otpTimeStep, int i10, OtpTimeUnit otpTimeUnit, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = otpTimeStep.value;
        }
        if ((i11 & 2) != 0) {
            otpTimeUnit = otpTimeStep.unit;
        }
        return otpTimeStep.copy(i10, otpTimeUnit);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OtpTimeUnit getUnit() {
        return this.unit;
    }

    @NotNull
    public final OtpTimeStep copy(int value, @NotNull OtpTimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return new OtpTimeStep(value, unit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtpTimeStep)) {
            return false;
        }
        OtpTimeStep otpTimeStep = (OtpTimeStep) other;
        return this.value == otpTimeStep.value && this.unit == otpTimeStep.unit;
    }

    public final int getSeconds() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i10 == 1) {
            return this.value * 3600;
        }
        if (i10 == 2) {
            return this.value * 60;
        }
        if (i10 == 3) {
            return this.value;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final OtpTimeUnit getUnit() {
        return this.unit;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.unit.hashCode() + (this.value * 31);
    }

    @NotNull
    public String toString() {
        return "OtpTimeStep(value=" + this.value + ", unit=" + this.unit + ")";
    }
}
