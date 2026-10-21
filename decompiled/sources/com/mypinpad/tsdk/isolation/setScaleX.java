package com.mypinpad.tsdk.isolation;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setScaleX {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60430c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60431d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setSubtitle f60432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setColorFilter f60433b;

    public setScaleX(@NotNull setSubtitle setsubtitle, @NotNull setColorFilter setcolorfilter) {
        Intrinsics.checkNotNullParameter(setsubtitle, "");
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        this.f60432a = setsubtitle;
        this.f60433b = setcolorfilter;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i10;
        int i15 = ~i12;
        if ((((~(i10 | i15)) | (~(i13 | i15))) * 865) + ((~(i12 | i10)) * 865) + (((~(i14 | i15)) | i13) * (-865)) + (i11 * (-864)) + (i10 * 866) == 1) {
            setScaleX setscalex = (setScaleX) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            Intrinsics.checkNotNullParameter(bArr, "");
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setscalex.f60433b, 200, null, null, 6}, 1173867142, -1173867141, 200);
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "");
            byte[] bArr2 = (byte[]) setTextClassifier.setCompoundDrawableTintBlendMode(new Object[]{uuidRandomUUID}, 230957076, -230957076, (int) System.currentTimeMillis());
            setSubtitle setsubtitle = setscalex.f60432a;
            setForegroundTintBlendMode setforegroundtintblendmode = new setForegroundTintBlendMode((byte[]) setSubtitle.setDividerPadding(new Object[]{setsubtitle, bArr, bArr2}, -884069764, 884069771, System.identityHashCode(setsubtitle)), uuidRandomUUID);
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setscalex.f60433b, 201, null, null, 6}, 1173867142, -1173867141, 201);
            int i16 = f60430c + 101;
            f60431d = i16 % 128;
            int i17 = i16 % 2;
            return setforegroundtintblendmode;
        }
        setScaleX setscalex2 = (setScaleX) objArr[0];
        byte[] bArr3 = (byte[]) objArr[1];
        UUID uuid = (UUID) objArr[2];
        int i18 = f60431d + 67;
        f60430c = i18 % 128;
        int i19 = i18 % 2;
        Intrinsics.checkNotNullParameter(bArr3, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setscalex2.f60433b, 202, null, null, 6}, 1173867142, -1173867141, 202);
        byte[] bArr4 = (byte[]) setTextClassifier.setCompoundDrawableTintBlendMode(new Object[]{uuid}, 230957076, -230957076, (int) System.currentTimeMillis());
        setSubtitle setsubtitle2 = setscalex2.f60432a;
        byte[] bArr5 = (byte[]) setSubtitle.setDividerPadding(new Object[]{setsubtitle2, bArr3, bArr4}, -569441381, 569441385, System.identityHashCode(setsubtitle2));
        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setscalex2.f60433b, 203, null, null, 6}, 1173867142, -1173867141, 203);
        int i20 = f60431d + 89;
        f60430c = i20 % 128;
        if (i20 % 2 == 0) {
            return bArr5;
        }
        int i21 = 6 / 0;
        return bArr5;
    }

    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode(@NotNull byte[] bArr, @NotNull UUID uuid) {
        return (byte[]) setX(new Object[]{this, bArr, uuid}, -794665330, 794665330, System.identityHashCode(this));
    }

    @NotNull
    public final setForegroundTintBlendMode setCompoundDrawableTintBlendMode(@NotNull byte[] bArr) {
        return (setForegroundTintBlendMode) setX(new Object[]{this, bArr}, -750789259, 750789260, System.identityHashCode(this));
    }
}
