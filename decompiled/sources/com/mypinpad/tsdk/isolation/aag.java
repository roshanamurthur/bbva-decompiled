package com.mypinpad.tsdk.isolation;

import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.io.Closeable;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0006\u001a\u00020 \u0012\u0006\u0010\f\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u0014J\u0015\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\bJ%\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u0015J%\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0016¢\u0006\u0004\b\u0007\u0010\u0017J\u001d\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0018¢\u0006\u0004\b\u0003\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J+\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b\u000e\u0010\u001dR\u0011\u0010\u0003\u001a\u00020\u001eX\u0007¢\u0006\u0006\n\u0004\b\u0007\u0010\u001f"}, d2 = {"Lcom/mypinpad/tsdk/i/aag;", "Ljava/io/Closeable;", "", "setOnFocusChangeListener", "()V", "Lcom/mypinpad/tsdk/i/aam;", "p0", "setX", "(Lcom/mypinpad/tsdk/i/aam;)V", "setY", "", "Lcom/mypinpad/tsdk/i/aac;", "p1", "(ILcom/mypinpad/tsdk/i/aac;)V", "setCompoundDrawableTintBlendMode", "()I", "", "Lcom/mypinpad/tsdk/i/abx;", "p2", "p3", "(ZILcom/mypinpad/tsdk/i/abx;I)V", "(ZII)V", "", "(ILcom/mypinpad/tsdk/i/aac;[B)V", "", "(IJ)V", HearingDisabilitiesConstants.CLOSE_MODAL, "", "Lcom/mypinpad/tsdk/i/aab;", "(ZILjava/util/List;)V", "Lcom/mypinpad/tsdk/i/aaf$setDividerPadding;", "Lcom/mypinpad/tsdk/i/aaf$setDividerPadding;", "Lcom/mypinpad/tsdk/i/abv;", "<init>", "(Lcom/mypinpad/tsdk/i/abv;Z)V"}, k = 1, mv = {1, 6, 0})
public final class aag implements Closeable {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Logger f52044u0 = Logger.getLogger(aae.class.getName());
    public static int v0 = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f52045w0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final abv f52046p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f52047q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final abx f52048r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f52049s0;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @NotNull
    public aaf.setDividerPadding setOnFocusChangeListener;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f52050t0;

    static {
        int i10 = v0;
        int i11 = (i10 & (-68)) | ((~i10) & 67);
        int i12 = -(-((i10 & 67) << 1));
        int i13 = (i11 & i12) + (i12 | i11);
        f52045w0 = i13 % 128;
        int i14 = i13 % 2;
    }

    public aag(@NotNull abv abvVar, boolean z10) {
        Intrinsics.checkNotNullParameter(abvVar, "");
        this.f52046p0 = abvVar;
        this.f52047q0 = z10;
        abx abxVar = new abx();
        this.f52048r0 = abxVar;
        this.f52049s0 = 16384;
        this.setOnFocusChangeListener = new aaf.setDividerPadding(0, false, abxVar, 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0218  */
    /* JADX WARN: Code duplicated, block: B:47:0x0235  */
    /* JADX WARN: Code duplicated, block: B:48:0x025f  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        int i13;
        int i14;
        int i15;
        long jMin;
        int i16;
        int i17 = (~i10) | i11;
        int i18 = ~i17;
        int i19 = ~i12;
        int i20 = (((~(i10 | i19)) | (~((~i11) | i10)) | (~(i17 | i12))) * 140) + ((i18 | (~(i19 | i11))) * (-280)) + ((i11 | i12) * 140) + (i11 * (-279)) + (i10 * 141);
        if (i20 == 1) {
            aag aagVar = (aag) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int iIntValue2 = ((Number) objArr[2]).intValue();
            int iIntValue3 = ((Number) objArr[3]).intValue();
            int iIntValue4 = ((Number) objArr[4]).intValue();
            int i21 = v0;
            int i22 = (i21 & 45) + (i21 | 45);
            f52045w0 = i22 % 128;
            int i23 = i22 % 2;
            Logger logger = f52044u0;
            if (i23 == 0) {
                int i24 = 52 / 0;
                if (logger.isLoggable(Level.FINE)) {
                    int i25 = v0;
                    int i26 = i25 & 97;
                    i13 = ((((i25 ^ 97) | i26) << 1) - (~(-((i25 | 97) & (~i26))))) - 1;
                    f52045w0 = i13 % 128;
                    if (i13 % 2 == 0) {
                        aae aaeVar = aae.INSTANCE;
                        logger.fine((String) aae.setCompoundDrawableTintBlendMode(new Object[]{Boolean.TRUE, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4)}, 1353828415, -1353828414, iIntValue));
                    } else {
                        aae aaeVar2 = aae.INSTANCE;
                        logger.fine((String) aae.setCompoundDrawableTintBlendMode(new Object[]{Boolean.FALSE, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4)}, 1353828415, -1353828414, iIntValue));
                    }
                    int i27 = f52045w0;
                    int i28 = (-2) - (((i27 & 6) + (i27 | 6)) ^ (-1));
                    v0 = i28 % 128;
                    int i29 = i28 % 2;
                }
            } else if (logger.isLoggable(Level.FINE)) {
                int i210 = v0;
                int i211 = i210 & 97;
                i13 = ((((i210 ^ 97) | i211) << 1) - (~(-((i210 | 97) & (~i211))))) - 1;
                f52045w0 = i13 % 128;
                if (i13 % 2 == 0) {
                    aae aaeVar3 = aae.INSTANCE;
                    logger.fine((String) aae.setCompoundDrawableTintBlendMode(new Object[]{Boolean.TRUE, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4)}, 1353828415, -1353828414, iIntValue));
                } else {
                    aae aaeVar4 = aae.INSTANCE;
                    logger.fine((String) aae.setCompoundDrawableTintBlendMode(new Object[]{Boolean.FALSE, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4)}, 1353828415, -1353828414, iIntValue));
                }
                int i212 = f52045w0;
                int i213 = (-2) - (((i212 & 6) + (i212 | 6)) ^ (-1));
                v0 = i213 % 128;
                int i214 = i213 % 2;
            }
            if (iIntValue2 > aagVar.f52049s0) {
                int i30 = v0;
                int i31 = ((i30 ^ 113) | (i30 & 113)) << 1;
                int i32 = -(((~i30) & 113) | (i30 & (-114)));
                int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                f52045w0 = i33 % 128;
                int i34 = i33 % 2;
                StringBuilder sb2 = new StringBuilder("FRAME_SIZE_ERROR length > ");
                sb2.append(aagVar.f52049s0);
                sb2.append(": ");
                sb2.append(iIntValue2);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
            int i35 = v0;
            int i36 = ((i35 & (-50)) | ((~i35) & 49)) + ((i35 & 49) << 1);
            int i37 = i36 % 128;
            f52045w0 = i37;
            int i38 = i36 % 2;
            int i39 = (((i37 | 18) << 1) - (i37 ^ 18)) - 1;
            int i40 = i39 % 128;
            v0 = i40;
            int i41 = i39 % 2;
            if ((Integer.MIN_VALUE & iIntValue) != 0) {
                int i42 = ((i40 | 13) << 1) - (i40 ^ 13);
                f52045w0 = i42 % 128;
                int i43 = i42 % 2;
                throw new IllegalArgumentException(Intrinsics.stringPlus("reserved bit set: ", Integer.valueOf(iIntValue)).toString());
            }
            int i44 = (i37 ^ 51) + ((i37 & 51) << 1);
            v0 = i44 % 128;
            int i45 = i44 % 2;
            int i46 = (i37 & (-74)) | ((~i37) & 73);
            int i47 = -(-((i37 & 73) << 1));
            int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
            v0 = i48 % 128;
            int i49 = i48 % 2;
            abv abvVar = aagVar.f52046p0;
            yt.setY(abvVar, iIntValue2);
            abvVar.setLayoutAnimation(iIntValue3 & 255);
            abvVar.setLayoutAnimation(iIntValue4 & 255);
            abvVar.setNavigationOnClickListener(iIntValue & Integer.MAX_VALUE);
            int i50 = f52045w0;
            int i51 = i50 & 43;
            int i52 = -(-((i50 ^ 43) | i51));
            int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
            v0 = i53 % 128;
            int i54 = i53 % 2;
        } else {
            if (i20 == 2) {
                aag aagVar2 = (aag) objArr[0];
                int i55 = v0;
                int i56 = (i55 & 85) + (i55 | 85);
                int i57 = i56 % 128;
                f52045w0 = i57;
                int i58 = i56 % 2;
                int i59 = aagVar2.f52049s0;
                if (i58 == 0) {
                    int i60 = 10 / 0;
                }
                int i61 = (i57 ^ 61) + ((i57 & 61) << 1);
                v0 = i61 % 128;
                int i62 = i61 % 2;
                return Integer.valueOf(i59);
            }
            if (i20 != 3) {
                aag aagVar3 = (aag) objArr[0];
                int iIntValue5 = ((Number) objArr[1]).intValue();
                long jLongValue = ((Number) objArr[2]).longValue();
                int i63 = f52045w0;
                int i64 = ((i63 | 11) << 1) - (i63 ^ 11);
                int i65 = i64 % 128;
                v0 = i65;
                if (i64 % 2 != 0) {
                    int i66 = 89 / 0;
                }
                int i67 = i65 & 15;
                int i68 = (((i65 | 15) & (~i67)) - (~(i67 << 1))) - 1;
                f52045w0 = i68 % 128;
                int i69 = i68 % 2;
                while (jLongValue > 0) {
                    int i70 = v0 + 45;
                    f52045w0 = i70 % 128;
                    if (i70 % 2 == 0) {
                        jMin = Math.min(aagVar3.f52049s0, jLongValue);
                        jLongValue += jMin;
                        i14 = (int) jMin;
                        i15 = 82;
                        if (jLongValue == 1) {
                            int i71 = f52045w0;
                            int i72 = (-2) - (((i71 ^ 120) + ((i71 & 120) << 1)) ^ (-1));
                            v0 = i72 % 128;
                            int i73 = i72 % 2;
                            i16 = 4;
                        } else {
                            int i74 = f52045w0;
                            int i75 = i74 & 21;
                            int i76 = (i74 | 21) & (~i75);
                            int i77 = -(-(i75 << 1));
                            int i78 = ((i76 | i77) << 1) - (i76 ^ i77);
                            v0 = i78 % 128;
                            int i79 = i78 % 2;
                            i16 = 0;
                        }
                    } else {
                        long jMin2 = Math.min(aagVar3.f52049s0, jLongValue);
                        jLongValue -= jMin2;
                        i14 = (int) jMin2;
                        i15 = 9;
                        if (jLongValue == 0) {
                            jMin = jMin2;
                            int i710 = f52045w0;
                            int i711 = (-2) - (((i710 ^ 120) + ((i710 & 120) << 1)) ^ (-1));
                            v0 = i711 % 128;
                            int i712 = i711 % 2;
                            i16 = 4;
                        } else {
                            jMin = jMin2;
                            int i713 = f52045w0;
                            int i714 = i713 & 21;
                            int i715 = (i713 | 21) & (~i714);
                            int i716 = -(-(i714 << 1));
                            int i717 = ((i715 | i716) << 1) - (i715 ^ i716);
                            v0 = i717 % 128;
                            int i718 = i717 % 2;
                            i16 = 0;
                        }
                    }
                    setY(new Object[]{aagVar3, Integer.valueOf(iIntValue5), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16)}, -164908203, 164908204, iIntValue5);
                    aagVar3.f52046p0.setDividerPadding(aagVar3.f52048r0, jMin);
                    int i80 = v0;
                    int i81 = i80 & 103;
                    int i82 = (i80 | 103) & (~i81);
                    int i83 = -(-(i81 << 1));
                    int i84 = (i82 & i83) + (i82 | i83);
                    f52045w0 = i84 % 128;
                    int i85 = i84 % 2;
                }
                int i86 = v0;
                int i87 = (i86 ^ 45) + ((i86 & 45) << 1);
                f52045w0 = i87 % 128;
                if (i87 % 2 == 0) {
                    int i88 = 72 / 0;
                }
            } else {
                aag aagVar4 = (aag) objArr[0];
                int iIntValue6 = ((Number) objArr[1]).intValue();
                int iIntValue7 = ((Number) objArr[2]).intValue();
                abx abxVar = (abx) objArr[3];
                int iIntValue8 = ((Number) objArr[4]).intValue();
                int i89 = f52045w0 + 13;
                v0 = i89 % 128;
                int i90 = i89 % 2;
                setY(new Object[]{aagVar4, Integer.valueOf(iIntValue6), Integer.valueOf(iIntValue8), 0, Integer.valueOf(iIntValue7)}, -164908203, 164908204, iIntValue6);
                if (iIntValue8 > 0) {
                    int i91 = f52045w0;
                    int i92 = i91 ^ 21;
                    int i93 = ((i91 & 21) | i92) << 1;
                    int i94 = -i92;
                    int i95 = (i93 & i94) + (i93 | i94);
                    v0 = i95 % 128;
                    int i96 = i95 % 2;
                    abv abvVar2 = aagVar4.f52046p0;
                    Intrinsics.checkNotNull(abxVar);
                    abvVar2.setDividerPadding(abxVar, iIntValue8);
                    int i97 = f52045w0;
                    int i98 = (i97 & 123) + (i97 | 123);
                    v0 = i98 % 128;
                    int i99 = i98 % 2;
                }
                int i100 = (-2) - ((v0 + 88) ^ (-1));
                f52045w0 = i100 % 128;
                if (i100 % 2 == 0) {
                    int i101 = 29 / 0;
                }
            }
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        int i10 = v0;
        int i11 = i10 & 1;
        int i12 = ((((i10 ^ 1) | i11) << 1) - (~(-((i10 | 1) & (~i11))))) - 1;
        f52045w0 = i12 % 128;
        int i13 = i12 % 2;
        this.f52050t0 = true;
        this.f52046p0.close();
        int i14 = v0;
        int i15 = (i14 & 25) + (i14 | 25);
        f52045w0 = i15 % 128;
        int i16 = i15 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:21:0x00e9 A[Catch: all -> 0x00bd, TryCatch #1 {all -> 0x00bd, blocks: (B:3:0x0001, B:5:0x0019, B:8:0x007b, B:10:0x008d, B:21:0x00e9, B:24:0x011e, B:22:0x00fe, B:23:0x010f, B:16:0x00c0, B:25:0x0156, B:32:0x016c, B:35:0x016f, B:36:0x0176, B:28:0x0168), top: B:41:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00fe A[Catch: all -> 0x00bd, TryCatch #1 {all -> 0x00bd, blocks: (B:3:0x0001, B:5:0x0019, B:8:0x007b, B:10:0x008d, B:21:0x00e9, B:24:0x011e, B:22:0x00fe, B:23:0x010f, B:16:0x00c0, B:25:0x0156, B:32:0x016c, B:35:0x016f, B:36:0x0176, B:28:0x0168), top: B:41:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x010f A[Catch: all -> 0x00bd, TryCatch #1 {all -> 0x00bd, blocks: (B:3:0x0001, B:5:0x0019, B:8:0x007b, B:10:0x008d, B:21:0x00e9, B:24:0x011e, B:22:0x00fe, B:23:0x010f, B:16:0x00c0, B:25:0x0156, B:32:0x016c, B:35:0x016f, B:36:0x0176, B:28:0x0168), top: B:41:0x0001, inners: #0 }] */
    public final synchronized void setCompoundDrawableTintBlendMode(@NotNull aam p4) throws IOException {
        int i10;
        int i11;
        try {
            int i12 = v0;
            int i13 = ((i12 | 121) << 1) - (i12 ^ 121);
            f52045w0 = i13 % 128;
            int i14 = i13 % 2;
            Intrinsics.checkNotNullParameter(p4, "");
            if (this.f52050t0) {
                throw new IOException("closed");
            }
            setY(new Object[]{this, 0, Integer.valueOf(((Integer) aam.setOnFocusChangeListener(new Object[]{p4}, -1487598367, 1487598368, System.identityHashCode(p4))).intValue() * 6), 4, 0}, -164908203, 164908204, 0);
            int i15 = f52045w0;
            int i16 = ((i15 ^ 29) | (i15 & 29)) << 1;
            int i17 = -(((~i15) & 29) | (i15 & (-30)));
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            v0 = i18 % 128;
            int i19 = i18 % 2;
            int i20 = 0;
            while (i20 < 10) {
                int i21 = f52045w0 + 103;
                v0 = i21 % 128;
                if (i21 % 2 != 0) {
                    int i22 = i20 ^ 184;
                    int i23 = (((i20 & 184) | i22) << 1) - i22;
                    int i24 = (i23 & 119) | ((~i23) & (-120));
                    int i25 = -(-((i23 & (-120)) << 1));
                    i10 = ((i24 | i25) << 1) - (i24 ^ i25);
                    if (((Boolean) aam.setOnFocusChangeListener(new Object[]{p4, Integer.valueOf(i20)}, -255055169, 255055171, i20)).booleanValue()) {
                        if (i20 != 4) {
                            int i26 = v0;
                            int i27 = i26 & 17;
                            int i28 = i27 + ((i26 ^ 17) | i27);
                            f52045w0 = i28 % 128;
                            int i29 = i28 % 2;
                            i11 = 3;
                        } else if (i20 != 7) {
                            int i30 = v0;
                            int i31 = i30 & 61;
                            int i32 = -(-(i30 | 61));
                            int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                            f52045w0 = i33 % 128;
                            int i34 = i33 % 2;
                            i11 = i20;
                        } else {
                            int i35 = f52045w0;
                            int i36 = ((i35 ^ 50) + ((i35 & 50) << 1)) - 1;
                            v0 = i36 % 128;
                            int i37 = i36 % 2;
                            i11 = 4;
                        }
                        this.f52046p0.getNavBarTitleString(i11);
                        this.f52046p0.setNavigationOnClickListener(((Integer) aam.setOnFocusChangeListener(new Object[]{p4, Integer.valueOf(i20)}, -1915529547, 1915529551, i20)).intValue());
                        int i38 = f52045w0;
                        int i39 = ((i38 | 34) << 1) - (i38 ^ 34);
                        int i40 = (i39 ^ (-1)) + (i39 << 1);
                        v0 = i40 % 128;
                        int i41 = i40 % 2;
                    }
                } else {
                    int i42 = i20 & 127;
                    int i43 = -(-((i20 ^ 127) | i42));
                    i10 = ((i42 ^ i43) + ((i42 & i43) << 1)) - 126;
                    if (((Boolean) aam.setOnFocusChangeListener(new Object[]{p4, Integer.valueOf(i20)}, -255055169, 255055171, i20)).booleanValue()) {
                        if (i20 != 4) {
                            int i210 = v0;
                            int i211 = i210 & 17;
                            int i212 = i211 + ((i210 ^ 17) | i211);
                            f52045w0 = i212 % 128;
                            int i213 = i212 % 2;
                            i11 = 3;
                        } else if (i20 != 7) {
                            int i310 = v0;
                            int i311 = i310 & 61;
                            int i312 = -(-(i310 | 61));
                            int i313 = (i311 ^ i312) + ((i312 & i311) << 1);
                            f52045w0 = i313 % 128;
                            int i314 = i313 % 2;
                            i11 = i20;
                        } else {
                            int i315 = f52045w0;
                            int i316 = ((i315 ^ 50) + ((i315 & 50) << 1)) - 1;
                            v0 = i316 % 128;
                            int i317 = i316 % 2;
                            i11 = 4;
                        }
                        this.f52046p0.getNavBarTitleString(i11);
                        this.f52046p0.setNavigationOnClickListener(((Integer) aam.setOnFocusChangeListener(new Object[]{p4, Integer.valueOf(i20)}, -1915529547, 1915529551, i20)).intValue());
                        int i318 = f52045w0;
                        int i319 = ((i318 | 34) << 1) - (i318 ^ 34);
                        int i44 = (i319 ^ (-1)) + (i319 << 1);
                        v0 = i44 % 128;
                        int i45 = i44 % 2;
                    }
                }
                i20 = i10;
            }
            this.f52046p0.flush();
            int i46 = v0 + 57;
            f52045w0 = i46 % 128;
            if (i46 % 2 == 0) {
                int i47 = 31 / 0;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void setOnFocusChangeListener() throws IOException {
        int i10 = v0;
        int i11 = i10 + 87;
        f52045w0 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (this.f52050t0) {
            throw new IOException("closed");
        }
        if (!this.f52047q0) {
            int i12 = ((i10 | 3) << 1) - (i10 ^ 3);
            f52045w0 = i12 % 128;
            int i13 = i12 % 2;
            return;
        }
        Logger logger = f52044u0;
        if (logger.isLoggable(Level.FINE)) {
            int i14 = f52045w0;
            int i15 = i14 & 25;
            int i16 = ((i14 | 25) & (~i15)) + (i15 << 1);
            v0 = i16 % 128;
            logger.fine(i16 % 2 != 0 ? yt.setOnFocusChangeListener(Intrinsics.stringPlus(">> CONNECTION ", aae.setCompoundDrawableTintBlendMode.setLayoutAnimation()), new Object[0]) : yt.setOnFocusChangeListener(Intrinsics.stringPlus(">> CONNECTION ", aae.setCompoundDrawableTintBlendMode.setLayoutAnimation()), new Object[0]));
        }
        this.f52046p0.setCompoundDrawableTintBlendMode(aae.setCompoundDrawableTintBlendMode);
        this.f52046p0.flush();
        int i17 = f52045w0;
        int i18 = (i17 & 33) + (i17 | 33);
        v0 = i18 % 128;
        if (i18 % 2 == 0) {
            return;
        } else {
            throw null;
        }
        throw th;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r10.f52050t0 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        r1 = r10.f52049s0;
        r10.f52049s0 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.aam.setOnFocusChangeListener(new java.lang.Object[]{r11, java.lang.Integer.valueOf(r1)}, -993299434, 993299440, r1)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        if (((java.lang.Integer) com.mypinpad.tsdk.isolation.aam.setOnFocusChangeListener(new java.lang.Object[]{r11}, -1086963513, 1086963516, java.lang.System.identityHashCode(r11))).intValue() == (-1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.aag.f52045w0 + 94;
        r7 = (r1 ^ (-1)) + (r1 << 1);
        com.mypinpad.tsdk.isolation.aag.v0 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        if ((r7 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        r7 = r10.setOnFocusChangeListener;
        r11 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.aam.setOnFocusChangeListener(new java.lang.Object[]{r11}, -1086963513, 1086963516, java.lang.System.identityHashCode(r11))).intValue();
        com.mypinpad.tsdk.i.aaf.setDividerPadding.setDividerPadding(new java.lang.Object[]{r7, java.lang.Integer.valueOf(r11)}, -1027427569, 1027427572, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
    
        r7 = r10.setOnFocusChangeListener;
        r11 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.aam.setOnFocusChangeListener(new java.lang.Object[]{r11}, -1086963513, 1086963516, java.lang.System.identityHashCode(r11))).intValue();
        com.mypinpad.tsdk.i.aaf.setDividerPadding.setDividerPadding(new java.lang.Object[]{r7, java.lang.Integer.valueOf(r11)}, -1027427569, 1027427572, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c3, code lost:
    
        setY(new java.lang.Object[]{r10, 0, 0, 4, 1}, -164908203, 164908204, 0);
        r10.f52046p0.flush();
        r11 = com.mypinpad.tsdk.isolation.aag.v0;
        r1 = ((r11 & (-62)) | ((~r11) & 61)) + ((r11 & 61) << 1);
        com.mypinpad.tsdk.isolation.aag.f52045w0 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0101, code lost:
    
        if ((r1 % 2) == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0105, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010f, code lost:
    
        throw new java.io.IOException("closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r10.f52050t0 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void setX(@org.jetbrains.annotations.NotNull com.mypinpad.tsdk.isolation.aam r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aag.setX(com.mypinpad.tsdk.i.aam):void");
    }

    public final synchronized void setCompoundDrawableTintBlendMode(boolean p4, int p10, int p11) throws IOException {
        int i10;
        try {
            int i11 = v0;
            int i12 = ((i11 & (-36)) | ((~i11) & 35)) + ((i11 & 35) << 1);
            f52045w0 = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
            if (this.f52050t0) {
                throw new IOException("closed");
            }
            if (p4) {
                int i13 = ((((i11 ^ 43) | (i11 & 43)) << 1) - (~(-(((~i11) & 43) | (i11 & (-44)))))) - 1;
                int i14 = i13 % 128;
                f52045w0 = i14;
                int i15 = i13 % 2;
                int i16 = i14 ^ 25;
                int i17 = ((i14 & 25) | i16) << 1;
                int i18 = -i16;
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                v0 = i19 % 128;
                int i20 = i19 % 2;
                i10 = 1;
            } else {
                int i21 = i11 + 87;
                f52045w0 = i21 % 128;
                int i22 = i21 % 2;
                i10 = 0;
            }
            setY(new Object[]{this, 0, 8, 6, Integer.valueOf(i10)}, -164908203, 164908204, 0);
            this.f52046p0.setNavigationOnClickListener(p10);
            this.f52046p0.setNavigationOnClickListener(p11);
            this.f52046p0.flush();
            int i23 = v0;
            int i24 = ((-1) << 1) - ((-1) ^ ((i23 ^ 2) + ((i23 & 2) << 1)));
            f52045w0 = i24 % 128;
            if (i24 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r9 <= 2147483647L) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r9 <= 2147483647L) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        r4 = (r0 & 119) + (r0 | 119);
        com.mypinpad.tsdk.isolation.aag.f52045w0 = r4 % 128;
        r4 = r4 % 2;
        setY(new java.lang.Object[]{r7, java.lang.Integer.valueOf(r8), 4, 8, 0}, -164908203, 164908204, r8);
        r7.f52046p0.setNavigationOnClickListener((int) r9);
        r7.f52046p0.flush();
        r8 = com.mypinpad.tsdk.isolation.aag.f52045w0;
        r9 = (r8 ^ 107) + ((r8 & 107) << 1);
        com.mypinpad.tsdk.isolation.aag.v0 = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
    
        if ((r9 % 2) == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        r8 = 63 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void setOnFocusChangeListener(int r8, long r9) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = com.mypinpad.tsdk.isolation.aag.v0     // Catch: java.lang.Throwable -> L39
            r1 = r0 | 71
            r2 = 1
            int r1 = r1 << r2
            r0 = r0 ^ 71
            int r1 = r1 - r0
            int r0 = r1 % 128
            com.mypinpad.tsdk.isolation.aag.f52045w0 = r0     // Catch: java.lang.Throwable -> L39
            r3 = 2
            int r1 = r1 % r3
            if (r1 == 0) goto Lbc
            boolean r1 = r7.f52050t0     // Catch: java.lang.Throwable -> L39
            if (r1 != 0) goto Lb4
            r4 = 0
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r1 == 0) goto L97
            r1 = r0 & 9
            r0 = r0 | 9
            r4 = r1 & r0
            r0 = r0 | r1
            int r4 = r4 + r0
            int r0 = r4 % 128
            com.mypinpad.tsdk.isolation.aag.v0 = r0     // Catch: java.lang.Throwable -> L39
            int r4 = r4 % r3
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r1 = 0
            if (r4 == 0) goto L3c
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            r5 = 91
            int r5 = r5 / r1
            if (r4 > 0) goto L97
            goto L40
        L37:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L39
        L39:
            r8 = move-exception
            goto Lc0
        L3c:
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 > 0) goto L97
        L40:
            r4 = r0 & 119(0x77, float:1.67E-43)
            r0 = r0 | 119(0x77, float:1.67E-43)
            int r4 = r4 + r0
            int r0 = r4 % 128
            com.mypinpad.tsdk.isolation.aag.f52045w0 = r0     // Catch: java.lang.Throwable -> L39
            int r4 = r4 % r3
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L39
            r0[r1] = r7     // Catch: java.lang.Throwable -> L39
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L39
            r0[r2] = r4     // Catch: java.lang.Throwable -> L39
            r4 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L39
            r0[r3] = r5     // Catch: java.lang.Throwable -> L39
            r5 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L39
            r6 = 3
            r0[r6] = r5     // Catch: java.lang.Throwable -> L39
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L39
            r0[r4] = r5     // Catch: java.lang.Throwable -> L39
            r4 = -164908203(0xfffffffff62bb355, float:-8.7062505E32)
            r5 = 164908204(0x9d44cac, float:5.1109245E-33)
            setY(r0, r4, r5, r8)     // Catch: java.lang.Throwable -> L39
            com.mypinpad.tsdk.i.abv r8 = r7.f52046p0     // Catch: java.lang.Throwable -> L39
            int r9 = (int) r9     // Catch: java.lang.Throwable -> L39
            r8.setNavigationOnClickListener(r9)     // Catch: java.lang.Throwable -> L39
            com.mypinpad.tsdk.i.abv r8 = r7.f52046p0     // Catch: java.lang.Throwable -> L39
            r8.flush()     // Catch: java.lang.Throwable -> L39
            int r8 = com.mypinpad.tsdk.isolation.aag.f52045w0     // Catch: java.lang.Throwable -> L39
            r9 = r8 ^ 107(0x6b, float:1.5E-43)
            r8 = r8 & 107(0x6b, float:1.5E-43)
            int r8 = r8 << r2
            int r9 = r9 + r8
            int r8 = r9 % 128
            com.mypinpad.tsdk.isolation.aag.v0 = r8     // Catch: java.lang.Throwable -> L39
            int r9 = r9 % r3
            if (r9 == 0) goto L95
            r8 = 63
            int r8 = r8 / r1
            monitor-exit(r7)
            return
        L93:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L39
        L95:
            monitor-exit(r7)
            return
        L97:
            int r8 = com.mypinpad.tsdk.isolation.aag.v0     // Catch: java.lang.Throwable -> L39
            int r8 = r8 + 37
            int r0 = r8 % 128
            com.mypinpad.tsdk.isolation.aag.f52045w0 = r0     // Catch: java.lang.Throwable -> L39
            int r8 = r8 % r3
            java.lang.String r8 = "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: "
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L39
            java.lang.String r8 = kotlin.jvm.internal.Intrinsics.stringPlus(r8, r9)     // Catch: java.lang.Throwable -> L39
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L39
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L39
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L39
            throw r9     // Catch: java.lang.Throwable -> L39
        Lb4:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L39
            java.lang.String r9 = "closed"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L39
            throw r8     // Catch: java.lang.Throwable -> L39
        Lbc:
            r8 = 0
            throw r8     // Catch: java.lang.Throwable -> Lbe
        Lbe:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L39
        Lc0:
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aag.setOnFocusChangeListener(int, long):void");
    }

    public final synchronized void setX(boolean p4, int p10, @Nullable abx p11, int p12) throws IOException {
        int i10;
        try {
            int i11 = f52045w0;
            int i12 = i11 & 85;
            int i13 = ((i11 ^ 85) | i12) << 1;
            int i14 = -((~i12) & (i11 | 85));
            int i15 = (i13 & i14) + (i13 | i14);
            v0 = i15 % 128;
            int i16 = i15 % 2;
            if (this.f52050t0) {
                throw new IOException("closed");
            }
            if (p4) {
                int i17 = i11 + 105;
                int i18 = i17 % 128;
                v0 = i18;
                int i19 = i17 % 2;
                int i20 = i18 & 45;
                int i21 = (i20 - (~((i18 ^ 45) | i20))) - 1;
                f52045w0 = i21 % 128;
                int i22 = i21 % 2;
                i10 = 1;
            } else {
                i10 = 0;
            }
            setY(new Object[]{this, Integer.valueOf(p10), Integer.valueOf(i10), p11, Integer.valueOf(p12)}, -598367059, 598367062, p10);
            int i23 = ~p10;
            int i24 = ~((971566554 ^ i23) | (971566554 & i23));
            int i25 = (-549809856) & p10;
            int i26 = ~(i25 | ((~i25) & ((-549809856) | p10)));
            int i27 = i24 & i26;
            int i28 = (i24 | i26) & (~i27);
            int i29 = (i28 & i27) | (i28 ^ i27);
            int i30 = ~p10;
            int i31 = i30 ^ 549809855;
            int i32 = i30 & 549809855;
            int i33 = ~((i31 & i32) | (i31 ^ i32));
            int i34 = ((~i33) & i29) | ((~i29) & i33);
            int i35 = i29 & i33;
            int i36 = -(-(((i35 & i34) | (i34 ^ i35)) * 959));
            int i37 = (315992776 & i36) + (i36 | 315992776);
            int i38 = ((1052520127 & i37) | ((~i37) & (-1052520128))) + ((i37 & (-1052520128)) << 1);
            int i39 = i23 | p10;
            int i40 = i30 & i39;
            int i41 = (~((971566554 & p10) | (971566554 ^ p10))) | (~((i40 & (-549809856)) | ((~i40) & (-549809856)) | (i40 & 549809855)));
            int i42 = (i23 & 549809855) | ((-549809856) & p10) | (549809855 & p10);
            int i43 = (i42 | (~i42)) & (~i42);
            int i44 = i41 & i43;
            int i45 = -(-((((i43 | i41) & (~i44)) | i44) * 959));
            int i46 = i38 & i45;
            int i47 = i45 | i38;
            int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
            int i49 = ~((2012617721 ^ p10) | (2012617721 & p10));
            int i50 = (~p10) & i39;
            int i51 = 1432752369 ^ i50;
            int i52 = 1432752369 & i50;
            int i53 = (i52 & i51) | (i51 ^ i52);
            int i54 = i53 ^ (-1922308986);
            int i55 = i53 & (-1922308986);
            int i56 = (i55 & i54) | (i54 ^ i55);
            int i57 = (i56 | (~i56)) & (~i56);
            int i58 = ((i49 & i57) | ((~i57) & i49) | ((~i49) & i57)) * 920;
            int i59 = (((-485132364) ^ i58) | ((-485132364) & i58)) << 1;
            int i60 = -((i58 & 485132363) | ((-485132364) & (~i58)));
            int i61 = (i59 ^ i60) + ((i60 & i59) << 1);
            int i62 = 1922308985 & i50;
            int i63 = ~(((1922308985 | i50) & (~i62)) | i62);
            int i64 = (-2012617722) & i63;
            int i65 = (i63 | (-2012617722)) & (~i64);
            int i66 = -(-(((i65 & i64) | (i65 ^ i64)) * 920));
            int i67 = ((~i66) & i61) | ((~i61) & i66);
            int i68 = -(-((i66 & i61) << 1));
            int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
            int i70 = 2012617721 ^ i50;
            int i71 = 2012617721 & i50;
            int i72 = ~((i71 & i70) | (i70 ^ i71));
            int i73 = (-90308737) ^ p10;
            int i74 = (-90308737) & p10;
            int i75 = ~((i74 & i73) | (i73 ^ i74));
            int i76 = i72 & i75;
            int i77 = ((i72 | i75) & (~i76)) | i76;
            int i78 = ~((p10 & (-579865353)) | ((-579865353) ^ p10));
            int i79 = ((~i78) & i77) | ((~i77) & i78);
            int i80 = i77 & i78;
            int i81 = -(-(((i80 & i79) | (i79 ^ i80)) * 920));
            int i82 = ((i69 ^ i81) | (i69 & i81)) << 1;
            int i83 = -((i81 & (~i69)) | ((~i81) & i69));
            if (i48 > (i82 ^ i83) + ((i83 & i82) << 1)) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void setX(int p4, @NotNull aac p10, @NotNull byte[] p11) throws IOException {
        try {
            int i10 = f52045w0 + 103;
            v0 = i10 % 128;
            int i11 = i10 % 2;
            Intrinsics.checkNotNullParameter(p10, "");
            Intrinsics.checkNotNullParameter(p11, "");
            if (!this.f52050t0) {
                if (p10.setDividerPadding() != -1) {
                    int i12 = v0;
                    int i13 = i12 & 23;
                    int i14 = ((~i13) & (i12 | 23)) + (i13 << 1);
                    f52045w0 = i14 % 128;
                    int i15 = i14 % 2;
                    int i16 = ((i12 ^ 96) + ((i12 & 96) << 1)) - 1;
                    f52045w0 = i16 % 128;
                    int i17 = i16 % 2;
                    int length = p11.length;
                    boolean z10 = false;
                    setY(new Object[]{this, 0, Integer.valueOf((((length ^ 8) | (length & 8)) << 1) - ((length & (-9)) | ((~length) & 8))), 7, 0}, -164908203, 164908204, 0);
                    this.f52046p0.setNavigationOnClickListener(p4);
                    this.f52046p0.setNavigationOnClickListener(p10.setDividerPadding());
                    if (p11.length == 0) {
                        int i18 = f52045w0;
                        int i19 = (((i18 ^ 89) | (i18 & 89)) << 1) - ((i18 & (-90)) | ((~i18) & 89));
                        v0 = i19 % 128;
                        int i20 = i19 % 2;
                        int i21 = (((i18 | 50) << 1) - (i18 ^ 50)) - 1;
                        v0 = i21 % 128;
                        int i22 = i21 % 2;
                        int i23 = i18 + 9;
                        v0 = i23 % 128;
                        int i24 = i23 % 2;
                    } else {
                        int i25 = v0;
                        int i26 = i25 & 53;
                        int i27 = (i26 - (~(-(-((i25 ^ 53) | i26))))) - 1;
                        int i28 = i27 % 128;
                        f52045w0 = i28;
                        int i29 = i27 % 2;
                        int i30 = i28 & 81;
                        int i31 = (i28 | 81) & (~i30);
                        int i32 = i30 << 1;
                        int i33 = ((i31 | i32) << 1) - (i31 ^ i32);
                        int i34 = i33 % 128;
                        v0 = i34;
                        int i35 = i33 % 2;
                        int i36 = i34 & 13;
                        int i37 = ((i34 | 13) & (~i36)) + (i36 << 1);
                        f52045w0 = i37 % 128;
                        int i38 = i37 % 2;
                        z10 = true;
                    }
                    if (!(!z10)) {
                        int i39 = f52045w0;
                        int i40 = (((i39 | 79) << 1) - (~(-(((~i39) & 79) | (i39 & (-80)))))) - 1;
                        v0 = i40 % 128;
                        int i41 = i40 % 2;
                        this.f52046p0.setDividerPadding(p11);
                        int i42 = v0 + 37;
                        f52045w0 = i42 % 128;
                        int i43 = i42 % 2;
                    }
                    this.f52046p0.flush();
                    int i44 = v0 + 61;
                    f52045w0 = i44 % 128;
                    int i45 = i44 % 2;
                } else {
                    int i46 = f52045w0;
                    int i47 = (i46 & (-88)) | ((~i46) & 87);
                    int i48 = -(-((i46 & 87) << 1));
                    int i49 = (i47 & i48) + (i48 | i47);
                    v0 = i49 % 128;
                    int i50 = i49 % 2;
                    throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
                }
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void setCompoundDrawableTintBlendMode(boolean p4, int p10, @NotNull List<aab> p11) throws IOException {
        int i10;
        try {
            int i11 = f52045w0;
            int i12 = ((i11 ^ 105) | (i11 & 105)) << 1;
            int i13 = -(((~i11) & 105) | (i11 & (-106)));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            v0 = i14 % 128;
            if (i14 % 2 == 0) {
                Intrinsics.checkNotNullParameter(p11, "");
                if (!this.f52050t0) {
                    aaf.setDividerPadding setdividerpadding = this.setOnFocusChangeListener;
                    aaf.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding, p11}, -2027309938, 2027309943, System.identityHashCode(setdividerpadding));
                    abx abxVar = this.f52048r0;
                    long jLongValue = ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue();
                    long jMin = Math.min(this.f52049s0, jLongValue);
                    if (jLongValue == jMin) {
                        int i15 = f52045w0;
                        int i16 = (i15 & 113) + (i15 | 113);
                        v0 = i16 % 128;
                        int i17 = i16 % 2;
                        int i18 = i15 ^ 81;
                        int i19 = (i15 & 81) << 1;
                        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                        v0 = i20 % 128;
                        int i21 = i20 % 2;
                        i10 = 4;
                    } else {
                        int i22 = f52045w0;
                        int i23 = i22 & 39;
                        int i24 = ((i22 ^ 39) | i23) << 1;
                        int i25 = -((i22 | 39) & (~i23));
                        int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                        v0 = i26 % 128;
                        int i27 = i26 % 2;
                        i10 = 0;
                    }
                    if (!(!p4)) {
                        int i28 = f52045w0;
                        int i29 = ((i28 & (-72)) | ((~i28) & 71)) + ((i28 & 71) << 1);
                        int i30 = i29 % 128;
                        v0 = i30;
                        if (i29 % 2 == 0) {
                            i10 = (i10 & 1) | (i10 ^ 1);
                        }
                        int i31 = i30 + 113;
                        f52045w0 = i31 % 128;
                        int i32 = i31 % 2;
                    }
                    setY(new Object[]{this, Integer.valueOf(p10), Integer.valueOf((int) jMin), 1, Integer.valueOf(i10)}, -164908203, 164908204, p10);
                    this.f52046p0.setDividerPadding(this.f52048r0, jMin);
                    if (jLongValue > jMin) {
                        int i33 = v0;
                        int i34 = i33 & 29;
                        int i35 = (i33 | 29) & (~i34);
                        int i36 = i34 << 1;
                        int i37 = (i35 & i36) + (i35 | i36);
                        f52045w0 = i37 % 128;
                        if (i37 % 2 == 0) {
                            setY(new Object[]{this, Integer.valueOf(p10), Long.valueOf(jLongValue & jMin)}, -1169980469, 1169980469, p10);
                        } else {
                            setY(new Object[]{this, Integer.valueOf(p10), Long.valueOf(jLongValue - jMin)}, -1169980469, 1169980469, p10);
                        }
                    }
                    int i38 = f52045w0;
                    int i39 = ((i38 ^ 84) + ((i38 & 84) << 1)) - 1;
                    v0 = i39 % 128;
                    if (i39 % 2 != 0) {
                        int i40 = 41 / 0;
                        return;
                    }
                    return;
                }
                throw new IOException("closed");
            }
            Intrinsics.checkNotNullParameter(p11, "");
            throw null;
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    public final synchronized void setY() throws IOException {
        int i10 = f52045w0;
        int i11 = ((i10 | 25) << 1) - (i10 ^ 25);
        v0 = i11 % 128;
        int i12 = i11 % 2;
        if (!this.f52050t0) {
            this.f52046p0.flush();
            int i13 = ((-1) << 1) - ((v0 + 114) ^ (-1));
            f52045w0 = i13 % 128;
            int i14 = i13 % 2;
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void setY(int p4, @NotNull aac p10) throws IOException {
        int i10 = v0;
        int i11 = ((i10 & (-42)) | ((~i10) & 41)) + ((i10 & 41) << 1);
        f52045w0 = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(p10, "");
        if (!this.f52050t0) {
            if (p10.setDividerPadding() != -1) {
                int i13 = v0;
                int i14 = ((i13 & 25) - (~(-(-(i13 | 25))))) - 1;
                f52045w0 = i14 % 128;
                int i15 = i14 % 2;
                int i16 = ((-1) << 1) - ((-1) ^ (((i13 | 88) << 1) - (i13 ^ 88)));
                f52045w0 = i16 % 128;
                int i17 = i16 % 2;
                setY(new Object[]{this, Integer.valueOf(p4), 4, 3, 0}, -164908203, 164908204, p4);
                this.f52046p0.setNavigationOnClickListener(p10.setDividerPadding());
                this.f52046p0.flush();
                int i18 = f52045w0;
                int i19 = ((i18 ^ 81) | (i18 & 81)) << 1;
                int i20 = -(((~i18) & 81) | (i18 & (-82)));
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                v0 = i21 % 128;
                if (i21 % 2 != 0) {
                    int i22 = 34 / 0;
                    return;
                }
                return;
            }
            int i23 = v0;
            int i24 = ((i23 & 27) - (~(-(-(i23 | 27))))) - 1;
            f52045w0 = i24 % 128;
            int i25 = i24 % 2;
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IOException("closed");
    }

    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setY(new Object[]{this}, -232905700, 232905702, System.identityHashCode(this))).intValue();
    }
}
