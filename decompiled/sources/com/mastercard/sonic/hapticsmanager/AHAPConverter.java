package com.mastercard.sonic.hapticsmanager;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import com.veridas.detect.ImageAnalysisKt;
import java.io.BufferedReader;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AHAPConverter.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/mastercard/sonic/hapticsmanager/AHAPConverter;", "", "Ljava/io/BufferedReader;", "reader", "Landroid/os/VibrationEffect;", "convertAHAPtoWaveform", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAHAPConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AHAPConverter.kt\ncom/mastercard/sonic/hapticsmanager/AHAPConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n1#2:140\n*E\n"})
public final class AHAPConverter {
    public AHAPConverter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static WaveformData a() {
        Pair pairB = b(25, 0, 0, 158L);
        long[] jArr = (long[]) pairB.component1();
        int[] iArr = (int[]) pairB.component2();
        Pair pairB2 = b(25, 255, 50, 52L);
        long[] jArr2 = (long[]) pairB2.component1();
        int[] iArr2 = (int[]) pairB2.component2();
        Pair pairB3 = b(25, 50, 255, 53L);
        long[] jArr3 = (long[]) pairB3.component1();
        int[] iArr3 = (int[]) pairB3.component2();
        Pair pairB4 = b(10, 0, 200, 26L);
        long[] jArr4 = (long[]) pairB4.component1();
        int[] iArr4 = (int[]) pairB4.component2();
        Pair pairB5 = b(5, 0, 255, 10L);
        long[] jArr5 = (long[]) pairB5.component1();
        int[] iArr5 = (int[]) pairB5.component2();
        Pair pairB6 = b(4, 0, 255, 9L);
        long[] jArr6 = (long[]) pairB6.component1();
        int[] iArr6 = (int[]) pairB6.component2();
        Pair pairB7 = b(25, ImageAnalysisKt.OVER_EXPOSED_THRESHOLD, 75, 82L);
        long[] jArr7 = (long[]) pairB7.component1();
        int[] iArr7 = (int[]) pairB7.component2();
        Pair pairB8 = b(25, ImageAnalysisKt.OVER_EXPOSED_THRESHOLD, 75, 62L);
        long[] jArr8 = (long[]) pairB8.component1();
        int[] iArr8 = (int[]) pairB8.component2();
        Pair pairB9 = b(25, ImageAnalysisKt.OVER_EXPOSED_THRESHOLD, 75, 71L);
        long[] jArr9 = (long[]) pairB9.component1();
        int[] iArr9 = (int[]) pairB9.component2();
        Pair pairB10 = b(25, 100, 250, 250L);
        return new WaveformData(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(jArr, jArr2), jArr3), 40L), jArr4), 30L), jArr5), 50L), jArr6), 210L), jArr7), 50L), jArr8), 120L), jArr9), 100L), (long[]) pairB10.component1()), ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(iArr, iArr2), iArr3), 0), iArr4), 0), iArr5), 0), iArr6), 0), iArr7), 0), iArr8), 0), iArr9), 0), (int[]) pairB10.component2()), -1);
    }

    public static Pair b(int i10, int i11, int i12, long j10) {
        long[] jArr = new long[i10];
        int[] iArr = new int[i10];
        float f6 = (i11 - i12) / i10;
        for (int i13 = 0; i13 < i10; i13++) {
            jArr[i13] = j10 / ((long) i10);
            iArr[i13] = (int) (i11 - (i13 * f6));
        }
        return new Pair(jArr, iArr);
    }

    @Nullable
    public final VibrationEffect convertAHAPtoWaveform(@NotNull BufferedReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        try {
            String text = TextStreamsKt.readText(reader);
            CloseableKt.closeFinally(reader, null);
            if (l.isBlank(text)) {
                return null;
            }
            try {
                WaveformData waveformDataA = a();
                if (Build.VERSION.SDK_INT >= 26) {
                    return VibrationEffect.createWaveform(waveformDataA.getTimings(), waveformDataA.getAmplitudes(), waveformDataA.getRepeat());
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(reader, th2);
                throw th3;
            }
        }
    }
}
