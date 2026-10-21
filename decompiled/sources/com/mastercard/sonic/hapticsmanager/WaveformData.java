package com.mastercard.sonic.hapticsmanager;

import androidx.appcompat.widget.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.dasnano.vdphotoselfiecapture.VDPhotoSelfieCapture;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AHAPConverter.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/mastercard/sonic/hapticsmanager/WaveformData;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "component1", "", "component2", "component3", "timings", "amplitudes", VDPhotoSelfieCapture.LOG_TAG_REPEAT, "copy", "", "toString", "a", "[J", "getTimings", "()[J", "b", "[I", "getAmplitudes", "()[I", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getRepeat", "()I", "<init>", "([J[II)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class WaveformData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final long[] timings;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final int[] amplitudes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int repeat;

    public WaveformData(@NotNull long[] timings, @NotNull int[] amplitudes, int i10) {
        Intrinsics.checkNotNullParameter(timings, "timings");
        Intrinsics.checkNotNullParameter(amplitudes, "amplitudes");
        this.timings = timings;
        this.amplitudes = amplitudes;
        this.repeat = i10;
    }

    public static /* synthetic */ WaveformData copy$default(WaveformData waveformData, long[] jArr, int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            jArr = waveformData.timings;
        }
        if ((i11 & 2) != 0) {
            iArr = waveformData.amplitudes;
        }
        if ((i11 & 4) != 0) {
            i10 = waveformData.repeat;
        }
        return waveformData.copy(jArr, iArr, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long[] getTimings() {
        return this.timings;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int[] getAmplitudes() {
        return this.amplitudes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRepeat() {
        return this.repeat;
    }

    @NotNull
    public final WaveformData copy(@NotNull long[] timings, @NotNull int[] amplitudes, int repeat) {
        Intrinsics.checkNotNullParameter(timings, "timings");
        Intrinsics.checkNotNullParameter(amplitudes, "amplitudes");
        return new WaveformData(timings, amplitudes, repeat);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(WaveformData.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.mastercard.sonic.hapticsmanager.WaveformData");
        WaveformData waveformData = (WaveformData) other;
        return Arrays.equals(this.timings, waveformData.timings) && Arrays.equals(this.amplitudes, waveformData.amplitudes) && this.repeat == waveformData.repeat;
    }

    @NotNull
    public final int[] getAmplitudes() {
        return this.amplitudes;
    }

    public final int getRepeat() {
        return this.repeat;
    }

    @NotNull
    public final long[] getTimings() {
        return this.timings;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.amplitudes) + (Arrays.hashCode(this.timings) * 31)) * 31) + this.repeat;
    }

    @NotNull
    public String toString() {
        return a.c(androidx.constraintlayout.core.parser.a.c("WaveformData(timings=", Arrays.toString(this.timings), ", amplitudes=", Arrays.toString(this.amplitudes), ", repeat="), this.repeat, ")");
    }
}
