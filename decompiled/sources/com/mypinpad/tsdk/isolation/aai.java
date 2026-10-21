package com.mypinpad.tsdk.isolation;

import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0003\u0010\u0011\u0005B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\r\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/mypinpad/tsdk/i/aai;", "Ljava/io/Closeable;", "Lcom/mypinpad/tsdk/i/aai$setDividerPadding;", "p0", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/aai$setDividerPadding;)V", "", "p1", "setOnFocusChangeListener", "(ZLcom/mypinpad/tsdk/i/aai$setDividerPadding;)Z", HearingDisabilitiesConstants.CLOSE_MODAL, "()V", "Lcom/mypinpad/tsdk/i/aby;", "<init>", "(Lcom/mypinpad/tsdk/i/aby;Z)V", "setY", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 6, 0})
public final class aai implements Closeable {

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public static final Logger f52118t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52119u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final aby f52120p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f52121q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final setCompoundDrawableTintBlendMode f52122r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final aaf.setOnFocusChangeListener f52123s0;

    public static final class setCompoundDrawableTintBlendMode implements acp {
        public static int v0 = 0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static int f52124w0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final aby f52125p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f52126q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f52127r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f52128s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f52129t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f52130u0;

        public setCompoundDrawableTintBlendMode(@NotNull aby abyVar) {
            Intrinsics.checkNotNullParameter(abyVar, "");
            this.f52125p0 = abyVar;
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
            int i13;
            Object y7;
            int i14 = ~i10;
            int i15 = ~i11;
            int i16 = ~(i14 | i15);
            switch ((i16 * 576) + (((~(i10 | (~i12) | i15)) | (~(i11 | i14))) * 576) + (((~(i15 | i12)) | i16) * 576) + (i11 * (-575)) + (i10 * (-575))) {
                case 1:
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) objArr[0];
                    int iIntValue = ((Number) objArr[1]).intValue();
                    int i17 = v0;
                    int i18 = i17 ^ 111;
                    int i19 = ((i17 & 111) | i18) << 1;
                    int i20 = -i18;
                    int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                    int i22 = i21 % 128;
                    f52124w0 = i22;
                    int i23 = i21 % 2;
                    setcompounddrawabletintblendmode.f52126q0 = iIntValue;
                    int i24 = i22 & 83;
                    int i25 = -(-((i22 ^ 83) | i24));
                    int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
                    v0 = i26 % 128;
                    int i27 = i26 % 2;
                    return null;
                case 2:
                    int i28 = f52124w0;
                    int i29 = (i28 & (-122)) | ((~i28) & 121);
                    int i30 = (i28 & 121) << 1;
                    int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                    v0 = i31 % 128;
                    int i32 = i31 % 2;
                    return null;
                case 3:
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = (setCompoundDrawableTintBlendMode) objArr[0];
                    int iIntValue2 = ((Number) objArr[1]).intValue();
                    int i33 = f52124w0;
                    int i34 = (i33 & (-78)) | ((~i33) & 77);
                    int i35 = (i33 & 77) << 1;
                    int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                    int i37 = i36 % 128;
                    v0 = i37;
                    int i38 = i36 % 2;
                    setcompounddrawabletintblendmode2.f52130u0 = iIntValue2;
                    if (i38 != 0) {
                        throw null;
                    }
                    int i39 = (i37 & (-56)) | ((~i37) & 55);
                    int i40 = (55 & i37) << 1;
                    int i41 = (i39 & i40) + (i40 | i39);
                    f52124w0 = i41 % 128;
                    int i42 = i41 % 2;
                    return null;
                case 4:
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = (setCompoundDrawableTintBlendMode) objArr[0];
                    int i43 = f52124w0;
                    int i44 = (i43 ^ 69) + ((i43 & 69) << 1);
                    v0 = i44 % 128;
                    int i45 = i44 % 2;
                    int i46 = setcompounddrawabletintblendmode3.f52128s0;
                    aby abyVar = setcompounddrawabletintblendmode3.f52125p0;
                    int x4 = yt.setX(abyVar);
                    setcompounddrawabletintblendmode3.f52129t0 = x4;
                    setcompounddrawabletintblendmode3.f52126q0 = x4;
                    int x6 = yt.setX(abyVar.getNavBarTitleString());
                    setcompounddrawabletintblendmode3.f52127r0 = yt.setX(abyVar.getNavBarTitleString());
                    Companion companion = aai.INSTANCE;
                    if (((Logger) Companion.setX(new Object[0], -389899274, 389899274, (int) System.currentTimeMillis())).isLoggable(Level.FINE)) {
                        int i47 = v0;
                        int i48 = ((i47 | 3) << 1) - (i47 ^ 3);
                        f52124w0 = i48 % 128;
                        if (i48 % 2 == 0) {
                            Logger logger = (Logger) Companion.setX(new Object[0], -389899274, 389899274, (int) System.currentTimeMillis());
                            aae aaeVar = aae.INSTANCE;
                            int i49 = setcompounddrawabletintblendmode3.f52128s0;
                            logger.fine((String) aae.setCompoundDrawableTintBlendMode(new Object[]{Boolean.TRUE, Integer.valueOf(i49), Integer.valueOf(setcompounddrawabletintblendmode3.f52126q0), Integer.valueOf(x6), Integer.valueOf(setcompounddrawabletintblendmode3.f52127r0)}, 1353828415, -1353828414, i49));
                            i13 = 3;
                        } else {
                            Logger logger2 = (Logger) Companion.setX(new Object[0], -389899274, 389899274, (int) System.currentTimeMillis());
                            aae aaeVar2 = aae.INSTANCE;
                            int i50 = setcompounddrawabletintblendmode3.f52128s0;
                            i13 = 3;
                            logger2.fine((String) aae.setCompoundDrawableTintBlendMode(new Object[]{Boolean.TRUE, Integer.valueOf(i50), Integer.valueOf(setcompounddrawabletintblendmode3.f52126q0), Integer.valueOf(x6), Integer.valueOf(setcompounddrawabletintblendmode3.f52127r0)}, 1353828415, -1353828414, i50));
                        }
                        int i51 = f52124w0;
                        int i52 = (i51 & (-4)) | ((~i51) & i13);
                        int i53 = -(-((i51 & i13) << 1));
                        int i54 = (i52 & i53) + (i53 | i52);
                        v0 = i54 % 128;
                        int i55 = i54 % 2;
                    }
                    int layoutAnimation = abyVar.setLayoutAnimation() & Integer.MAX_VALUE;
                    setcompounddrawabletintblendmode3.f52128s0 = layoutAnimation;
                    if (x6 != 9) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(x6);
                        sb2.append(" != TYPE_CONTINUATION");
                        throw new IOException(sb2.toString());
                    }
                    if (layoutAnimation != i46) {
                        throw new IOException("TYPE_CONTINUATION streamId changed");
                    }
                    int i56 = v0 + 91;
                    f52124w0 = i56 % 128;
                    if (i56 % 2 != 0) {
                        return null;
                    }
                    throw null;
                case 5:
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode4 = (setCompoundDrawableTintBlendMode) objArr[0];
                    int i57 = f52124w0;
                    int i58 = i57 ^ 93;
                    int i59 = ((i57 & 93) | i58) << 1;
                    int i60 = -i58;
                    int i61 = (i59 & i60) + (i60 | i59);
                    v0 = i61 % 128;
                    int i62 = i61 % 2;
                    int i63 = setcompounddrawabletintblendmode4.f52129t0;
                    int i64 = ((i57 ^ 55) | (i57 & 55)) << 1;
                    int i65 = -((55 & (~i57)) | (i57 & (-56)));
                    int i66 = (i64 ^ i65) + ((i65 & i64) << 1);
                    v0 = i66 % 128;
                    int i67 = i66 % 2;
                    return Integer.valueOf(i63);
                case 6:
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode5 = (setCompoundDrawableTintBlendMode) objArr[0];
                    int iIntValue3 = ((Number) objArr[1]).intValue();
                    int i68 = f52124w0 + 43;
                    v0 = i68 % 128;
                    int i69 = i68 % 2;
                    setcompounddrawabletintblendmode5.f52127r0 = iIntValue3;
                    if (i69 == 0) {
                        return null;
                    }
                    throw null;
                case 7:
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode6 = (setCompoundDrawableTintBlendMode) objArr[0];
                    int iIntValue4 = ((Number) objArr[1]).intValue();
                    int i70 = v0;
                    int i71 = i70 & 87;
                    int i72 = (~i71) & (i70 | 87);
                    int i73 = -(-(i71 << 1));
                    int i74 = (i72 & i73) + (i73 | i72);
                    f52124w0 = i74 % 128;
                    int i75 = i74 % 2;
                    setcompounddrawabletintblendmode6.f52128s0 = iIntValue4;
                    if (i75 == 0) {
                        throw null;
                    }
                    int i76 = ((i70 | 17) << 1) - (i70 ^ 17);
                    f52124w0 = i76 % 128;
                    int i77 = i76 % 2;
                    return null;
                case 8:
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode7 = (setCompoundDrawableTintBlendMode) objArr[0];
                    int i78 = f52124w0;
                    int i79 = (i78 | 77) << 1;
                    int i80 = -(i78 ^ 77);
                    int i81 = ((i79 | i80) << 1) - (i80 ^ i79);
                    v0 = i81 % 128;
                    int i82 = i81 % 2;
                    y7 = setcompounddrawabletintblendmode7.f52125p0.setY();
                    int i83 = v0 + 31;
                    f52124w0 = i83 % 128;
                    if (i83 % 2 == 0) {
                        throw null;
                    }
                    break;
                case 9:
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode8 = (setCompoundDrawableTintBlendMode) objArr[0];
                    int iIntValue5 = ((Number) objArr[1]).intValue();
                    int i84 = f52124w0;
                    int i85 = ((i84 ^ 33) - (~((i84 & 33) << 1))) - 1;
                    int i86 = i85 % 128;
                    v0 = i86;
                    int i87 = i85 % 2;
                    setcompounddrawabletintblendmode8.f52129t0 = iIntValue5;
                    int i88 = i86 & 71;
                    int i89 = (i86 ^ 71) | i88;
                    int i90 = (i88 & i89) + (i88 | i89);
                    f52124w0 = i90 % 128;
                    int i91 = i90 % 2;
                    return null;
                default:
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode9 = (setCompoundDrawableTintBlendMode) objArr[0];
                    abx abxVar = (abx) objArr[1];
                    long jLongValue = ((Number) objArr[2]).longValue();
                    int i92 = v0;
                    int i93 = (i92 & 47) + (i92 | 47);
                    f52124w0 = i93 % 128;
                    if (i93 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(abxVar, "");
                        int i94 = 58 / 0;
                    } else {
                        Intrinsics.checkNotNullParameter(abxVar, "");
                    }
                    int i95 = v0;
                    int i96 = (i95 & (-24)) | ((~i95) & 23);
                    int i97 = (i95 & 23) << 1;
                    int i98 = ((i96 | i97) << 1) - (i97 ^ i96);
                    f52124w0 = i98 % 128;
                    int i99 = i98 % 2;
                    while (true) {
                        int i100 = setcompounddrawabletintblendmode9.f52129t0;
                        aby abyVar2 = setcompounddrawabletintblendmode9.f52125p0;
                        if (i100 != 0) {
                            long y10 = abyVar2.setY(abxVar, Math.min(jLongValue, i100));
                            if (y10 != -1) {
                                int i101 = setcompounddrawabletintblendmode9.f52129t0;
                                int i102 = -((int) y10);
                                int iIdentityHashCode = System.identityHashCode(setcompounddrawabletintblendmode9);
                                int i103 = (-2) - ((609 - (~(-(~(-(-(i102 * 306))))))) ^ (-1));
                                int i104 = -(-(i101 * 306));
                                int i105 = ((i103 | i104) << 1) - (i103 ^ i104);
                                int i106 = ~i101;
                                int i107 = ~i102;
                                int i108 = (i102 & i106) | (i101 & i107);
                                int i109 = i101 & i102;
                                int i110 = (i109 & i108) | (i108 ^ i109);
                                int i111 = ~i110;
                                int i112 = (i110 | i111) & i111;
                                int i113 = i102 | iIdentityHashCode;
                                int i114 = ~i113;
                                int i115 = (i113 | i114) & i114;
                                int i116 = i112 ^ i115;
                                int i117 = i112 & i115;
                                int i118 = -(-(((i117 & i116) | (i116 ^ i117)) * 305));
                                int i119 = i105 ^ i118;
                                int i120 = (i118 & i105) << 1;
                                int i121 = (i119 & i120) + (i120 | i119);
                                int i122 = ~iIdentityHashCode;
                                int i123 = (i122 & i107) | ((~i122) & i102);
                                int i124 = i122 & i102;
                                int i125 = ~((i124 & i123) | (i123 ^ i124));
                                int i126 = ((i125 & i106) | ((~i125) & i106) | ((~i106) & i125)) * 305;
                                int i127 = i121 & i126;
                                setcompounddrawabletintblendmode9.f52129t0 = i127 + ((i126 ^ i121) | i127);
                                int i128 = f52124w0 + 72;
                                int i129 = (i128 ^ (-1)) + (i128 << 1);
                                v0 = i129 % 128;
                                int i130 = i129 % 2;
                                y7 = Long.valueOf(y10);
                            } else {
                                int i131 = f52124w0;
                                int i132 = i131 & 85;
                                int i133 = i132 + ((i131 ^ 85) | i132);
                                v0 = i133 % 128;
                                if (i133 % 2 != 0) {
                                    throw null;
                                }
                                int i134 = i131 + 83;
                                v0 = i134 % 128;
                                int i135 = i134 % 2;
                            }
                            break;
                        } else {
                            int i136 = v0;
                            int i137 = ((i136 ^ 125) | (i136 & 125)) << 1;
                            int i138 = -(((~i136) & 125) | (i136 & (-126)));
                            int i139 = (i137 ^ i138) + ((i138 & i137) << 1);
                            f52124w0 = i139 % 128;
                            int i140 = i139 % 2;
                            abyVar2.setNavigationOnClickListener(setcompounddrawabletintblendmode9.f52130u0);
                            setcompounddrawabletintblendmode9.f52130u0 = 0;
                            if ((setcompounddrawabletintblendmode9.f52127r0 & 4) != 0) {
                                int i141 = v0;
                                int i142 = i141 + 91;
                                f52124w0 = i142 % 128;
                                if (i142 % 2 == 0) {
                                    int i143 = 11 / 0;
                                }
                                int i144 = ((i141 ^ 70) + ((i141 & 70) << 1)) - 1;
                                f52124w0 = i144 % 128;
                                int i145 = i144 % 2;
                            } else {
                                setY(new Object[]{setcompounddrawabletintblendmode9}, 1111199109, -1111199105, System.identityHashCode(setcompounddrawabletintblendmode9));
                                int i146 = f52124w0 + 37;
                                v0 = i146 % 128;
                                int i147 = i146 % 2;
                            }
                        }
                    }
                    y7 = -1L;
                    break;
            }
            return y7;
        }

        @Override // com.mypinpad.tsdk.isolation.acp, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
            setY(new Object[]{this}, 1331216772, -1331216770, System.identityHashCode(this));
        }

        public final int setCompoundDrawableTintBlendMode() {
            return ((Integer) setY(new Object[]{this}, -925988435, 925988440, System.identityHashCode(this))).intValue();
        }

        public final void setDividerPadding(int i10) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
            setY(new Object[]{this, Integer.valueOf(i10)}, 311839297, -311839288, i10);
        }

        public final void setOnFocusChangeListener(int i10) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
            setY(new Object[]{this, Integer.valueOf(i10)}, 455936218, -455936215, i10);
        }

        public final void setX(int i10) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
            setY(new Object[]{this, Integer.valueOf(i10)}, -702507791, 702507798, i10);
        }

        public final void setCompoundDrawableTintBlendMode(int i10) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
            setY(new Object[]{this, Integer.valueOf(i10)}, 1365106188, -1365106187, i10);
        }

        @Override // com.mypinpad.tsdk.isolation.acp
        @NotNull
        public final acq setY() {
            return (acq) setY(new Object[]{this}, -398567860, 398567868, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.acp
        public final long setY(@NotNull abx abxVar, long j10) throws IOException {
            return ((Long) setY(new Object[]{this, abxVar, Long.valueOf(j10)}, -1163124911, 1163124911, System.identityHashCode(this))).longValue();
        }

        public final void setY(int i10) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
            setY(new Object[]{this, Integer.valueOf(i10)}, -171169950, 171169956, i10);
        }
    }

    public interface setDividerPadding {
        void setDividerPadding(int i10, @NotNull aac aacVar, @NotNull abw abwVar);

        void setDividerPadding(int i10, @NotNull List<aab> list) throws IOException;

        void setDividerPadding(@NotNull aam aamVar);

        void setDividerPadding(boolean z10, int i10, @NotNull List<aab> list);

        void setOnFocusChangeListener(int i10, @NotNull aac aacVar);

        void setOnFocusChangeListener(boolean z10, int i10, int i11);

        void setX(int i10, long j10);

        void setY(boolean z10, int i10, @NotNull aby abyVar, int i11) throws IOException;
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.aai$setY, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0006\u0010\u000b"}, d2 = {"Lcom/mypinpad/tsdk/i/aai$setY;", "", "", "p0", "p1", "p2", "setOnFocusChangeListener", "(III)I", "Ljava/util/logging/Logger;", "setNavigationOnClickListener", "Ljava/util/logging/Logger;", "()Ljava/util/logging/Logger;", "setCompoundDrawableTintBlendMode", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f52131a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f52132b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static int setOnFocusChangeListener(int p4, int p10, int p11) throws IOException {
            return ((Integer) setX(new Object[]{Integer.valueOf(p4), Integer.valueOf(p10), Integer.valueOf(p11)}, 1449210397, -1449210396, p4)).intValue();
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws IOException {
            int i13;
            int i14 = ~i12;
            int i15 = ((i10 | i12) * 164) + (((~(i14 | i11)) | i10) * (-328)) + (i11 * (-163)) + (i10 * 165);
            int i16 = ~i10;
            int i17 = ~i11;
            if ((((~(i10 | i14 | i11)) | (~(i12 | i17)) | (~(i16 | i17))) * 164) + i15 != 1) {
                int i18 = f52132b;
                int i19 = ((i18 | 105) << 1) - (i18 ^ 105);
                f52131a = i19 % 128;
                if (i19 % 2 != 0) {
                    throw null;
                }
                Logger logger = (Logger) aai.setY(new Object[0], 318812317, -318812315, (int) System.currentTimeMillis());
                int i20 = f52132b;
                int i21 = (i20 & (-58)) | ((~i20) & 57);
                int i22 = (i20 & 57) << 1;
                int i23 = (i21 & i22) + (i22 | i21);
                f52131a = i23 % 128;
                if (i23 % 2 == 0) {
                    return logger;
                }
                throw null;
            }
            int iIntValue = ((Number) objArr[0]).intValue();
            int iIntValue2 = ((Number) objArr[1]).intValue();
            int iIntValue3 = ((Number) objArr[2]).intValue();
            int i24 = f52131a;
            int i25 = i24 + 73;
            f52132b = i25 % 128;
            int i26 = i25 % 2;
            if ((iIntValue2 & 8) != 0) {
                int i27 = i24 & 1;
                int i28 = (i27 - (~(-(-((i24 ^ 1) | i27))))) - 1;
                f52132b = i28 % 128;
                i13 = i28 % 2 == 0 ? ((iIntValue ^ (-1)) | iIntValue) + iIntValue : iIntValue - 1;
            } else {
                i13 = iIntValue;
            }
            if (iIntValue3 > i13) {
                StringBuilder sb2 = new StringBuilder("PROTOCOL_ERROR padding ");
                sb2.append(iIntValue3);
                sb2.append(" > remaining length ");
                sb2.append(i13);
                throw new IOException(sb2.toString());
            }
            int i29 = -iIntValue3;
            int i30 = (i13 * 131) + (i29 * (-129));
            int i31 = ~i13;
            int i32 = ~iIntValue;
            int i33 = i32 & (i32 | iIntValue);
            int i34 = i31 ^ i33;
            int i35 = i33 & i31;
            int i36 = (i35 & i34) | (i34 ^ i35);
            int i37 = i36 & i29;
            int i38 = ((i36 | i29) & (~i37)) | i37;
            int i39 = ~i38;
            int i40 = -(-(((i38 | i39) & i39) * 130));
            int i41 = i30 & i40;
            int i42 = (i30 ^ i40) | i41;
            int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
            int i44 = (i31 | i13) & i31;
            int i45 = i44 ^ i29;
            int i46 = i44 & i29;
            int i47 = (~((i46 & i45) | (i45 ^ i46))) * (-260);
            int i48 = i43 & i47;
            int i49 = -(-(i47 | i43));
            int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
            int i51 = ~i29;
            int i52 = ~((i13 & i51) | (i51 ^ i13));
            int i53 = (i29 & i31) | (i31 ^ i29);
            int i54 = ~((i53 & iIntValue) | (i53 ^ iIntValue));
            int i55 = i52 & i54;
            int i56 = (i54 | i52) & (~i55);
            int i57 = -(~(-(-(((i56 & i55) | (i56 ^ i55)) * 130))));
            int i58 = (-2) - ((((i50 | i57) << 1) - (i57 ^ i50)) ^ (-1));
            int i59 = f52132b;
            int i60 = i59 & 35;
            int i61 = ((i59 | 35) & (~i60)) + (i60 << 1);
            f52131a = i61 % 128;
            if (i61 % 2 == 0) {
                return Integer.valueOf(i58);
            }
            throw null;
        }

        @JvmName(name = "setOnFocusChangeListener")
        @NotNull
        public static Logger setOnFocusChangeListener() {
            return (Logger) setX(new Object[0], -389899274, 389899274, (int) System.currentTimeMillis());
        }
    }

    static {
        Logger logger = Logger.getLogger(aae.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "");
        f52118t0 = logger;
        int i10 = v0;
        int i11 = i10 & 65;
        int i12 = -(-((i10 ^ 65) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f52119u0 = i13 % 128;
        int i14 = i13 % 2;
    }

    public aai(@NotNull aby abyVar, boolean z10) {
        Intrinsics.checkNotNullParameter(abyVar, "");
        this.f52120p0 = abyVar;
        this.f52121q0 = z10;
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode(abyVar);
        this.f52122r0 = setcompounddrawabletintblendmode;
        this.f52123s0 = new aaf.setOnFocusChangeListener(setcompounddrawabletintblendmode, 4096, 0, 4, null);
    }

    public static /* synthetic */ void a(Object[] objArr) throws IOException {
        aai aaiVar = (aai) objArr[0];
        setDividerPadding setdividerpadding = (setDividerPadding) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i10 = f52119u0;
        int i11 = ((i10 | 33) << 1) - (((~i10) & 33) | (i10 & (-34)));
        v0 = i11 % 128;
        int i12 = i11 % 2;
        if (iIntValue != 4) {
            StringBuilder sb2 = new StringBuilder("TYPE_RST_STREAM length: ");
            sb2.append(iIntValue);
            sb2.append(" != 4");
            throw new IOException(sb2.toString());
        }
        if (iIntValue2 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int layoutAnimation = aaiVar.f52120p0.setLayoutAnimation();
        aac.Companion companion = aac.INSTANCE;
        aac aacVar = (aac) aac.Companion.setOnFocusChangeListener(new Object[]{Integer.valueOf(layoutAnimation)}, -1744119768, 1744119768, layoutAnimation);
        if (aacVar == null) {
            throw new IOException(Intrinsics.stringPlus("TYPE_RST_STREAM unexpected error code: ", Integer.valueOf(layoutAnimation)));
        }
        setdividerpadding.setOnFocusChangeListener(iIntValue2, aacVar);
        int i13 = v0;
        int i14 = (((i13 & (-84)) | ((~i13) & 83)) - (~(-(-((i13 & 83) << 1))))) - 1;
        f52119u0 = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x00e6. Please report as an issue. */
    public static /* synthetic */ Boolean b(Object[] objArr) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        aai aaiVar = (aai) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        setDividerPadding setdividerpadding = (setDividerPadding) objArr[2];
        int i17 = v0;
        int i18 = (i17 | 29) << 1;
        int i19 = -(((~i17) & 29) | (i17 & (-30)));
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        f52119u0 = i20 % 128;
        int i21 = i20 % 2;
        Intrinsics.checkNotNullParameter(setdividerpadding, "");
        try {
            aaiVar.f52120p0.setCompoundDrawableTintBlendMode(9L);
            int i22 = f52119u0;
            int i23 = i22 & 63;
            int i24 = (i22 ^ 63) | i23;
            int i25 = (i23 & i24) + (i23 | i24);
            v0 = i25 % 128;
            int i26 = i25 % 2;
            int i27 = i22 & 27;
            int i28 = (i22 | 27) & (~i27);
            int i29 = -(-(i27 << 1));
            int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
            v0 = i30 % 128;
            int i31 = i30 % 2;
            aby abyVar = aaiVar.f52120p0;
            int x4 = yt.setX(abyVar);
            if (x4 > 16384) {
                throw new IOException(Intrinsics.stringPlus("FRAME_SIZE_ERROR: ", Integer.valueOf(x4)));
            }
            int x6 = yt.setX(abyVar.getNavBarTitleString());
            int x7 = yt.setX(abyVar.getNavBarTitleString());
            int layoutAnimation = abyVar.setLayoutAnimation() & Integer.MAX_VALUE;
            Level level = Level.FINE;
            Logger logger = f52118t0;
            if (logger.isLoggable(level)) {
                int i32 = f52119u0;
                int i33 = (i32 & 73) + (i32 | 73);
                v0 = i33 % 128;
                int i34 = i33 % 2;
                aae aaeVar = aae.INSTANCE;
                logger.fine((String) aae.setCompoundDrawableTintBlendMode(new Object[]{Boolean.TRUE, Integer.valueOf(layoutAnimation), Integer.valueOf(x4), Integer.valueOf(x6), Integer.valueOf(x7)}, 1353828415, -1353828414, layoutAnimation));
                int i35 = f52119u0 + 97;
                v0 = i35 % 128;
                int i36 = i35 % 2;
            }
            if (!(!zBooleanValue)) {
                int i37 = v0;
                int i38 = i37 ^ 25;
                int i39 = (i37 & 25) << 1;
                int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                f52119u0 = i40 % 128;
                int i41 = i40 % 2;
                if (x6 != 4) {
                    aae aaeVar2 = aae.INSTANCE;
                    throw new IOException(Intrinsics.stringPlus("Expected a SETTINGS frame but was ", (String) aae.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(x6)}, 582530844, -582530842, x6)));
                }
            }
            switch (x6) {
                case 0:
                    setY(new Object[]{aaiVar, setdividerpadding, Integer.valueOf(x4), Integer.valueOf(x7), Integer.valueOf(layoutAnimation)}, 448928649, -448928637, x4);
                    i10 = f52119u0 + 5;
                    v0 = i10 % 128;
                    int i42 = i10 % 2;
                    break;
                case 1:
                    setY(new Object[]{aaiVar, setdividerpadding, Integer.valueOf(x4), Integer.valueOf(x7), Integer.valueOf(layoutAnimation)}, 505967778, -505967775, x4);
                    int i43 = f52119u0;
                    int i44 = i43 & 63;
                    int i45 = -(-((i43 ^ 63) | i44));
                    i11 = i44 ^ i45;
                    i12 = (i45 & i44) << 1;
                    i16 = i11 + i12;
                    v0 = i16 % 128;
                    int i46 = i16 % 2;
                    break;
                case 2:
                    setY(new Object[]{aaiVar, setdividerpadding, Integer.valueOf(x4), Integer.valueOf(layoutAnimation)}, -1941238672, 1941238676, x4);
                    i10 = (-2) - ((v0 + 64) ^ (-1));
                    f52119u0 = i10 % 128;
                    int i47 = i10 % 2;
                    break;
                case 3:
                    setY(new Object[]{aaiVar, setdividerpadding, Integer.valueOf(x4), Integer.valueOf(layoutAnimation)}, 563229428, -563229427, x4);
                    int i48 = v0;
                    int i49 = i48 & 81;
                    i13 = ((((i48 ^ 81) | i49) << 1) - (~(-((i48 | 81) & (~i49))))) - 1;
                    f52119u0 = i13 % 128;
                    int i50 = i13 % 2;
                    break;
                case 4:
                    setY(new Object[]{aaiVar, setdividerpadding, Integer.valueOf(x4), Integer.valueOf(x7), Integer.valueOf(layoutAnimation)}, -32699790, 32699795, x4);
                    int i51 = v0;
                    i13 = (i51 ^ 49) + ((i51 & 49) << 1);
                    f52119u0 = i13 % 128;
                    int i52 = i13 % 2;
                    break;
                case 5:
                    setY(new Object[]{aaiVar, setdividerpadding, Integer.valueOf(x4), Integer.valueOf(x7), Integer.valueOf(layoutAnimation)}, -1226618228, 1226618228, x4);
                    int i53 = v0;
                    int i54 = i53 ^ 27;
                    int i55 = (i53 & 27) << 1;
                    i14 = i54 & i55;
                    i15 = i55 | i54;
                    i16 = i14 + i15;
                    f52119u0 = i16 % 128;
                    int i410 = i16 % 2;
                    break;
                case 6:
                    setY(new Object[]{aaiVar, setdividerpadding, Integer.valueOf(x4), Integer.valueOf(x7), Integer.valueOf(layoutAnimation)}, 88774591, -88774578, x4);
                    int i56 = v0;
                    int i57 = i56 & 27;
                    int i58 = -(-(i56 | 27));
                    i14 = i57 ^ i58;
                    i15 = (i58 & i57) << 1;
                    i16 = i14 + i15;
                    f52119u0 = i16 % 128;
                    int i411 = i16 % 2;
                    break;
                case 7:
                    setY(new Object[]{aaiVar, setdividerpadding, Integer.valueOf(x4), Integer.valueOf(layoutAnimation)}, 1541674798, -1541674792, x4);
                    int i59 = f52119u0;
                    int i60 = i59 ^ 93;
                    int i61 = -(-((i59 & 93) << 1));
                    i11 = i60 & i61;
                    i12 = i61 | i60;
                    i16 = i11 + i12;
                    v0 = i16 % 128;
                    int i412 = i16 % 2;
                    break;
                case 8:
                    setY(new Object[]{aaiVar, setdividerpadding, Integer.valueOf(x4), Integer.valueOf(layoutAnimation)}, 101728650, -101728643, x4);
                    int i62 = f52119u0;
                    i13 = ((i62 | 103) << 1) - (i62 ^ 103);
                    v0 = i13 % 128;
                    int i510 = i13 % 2;
                    break;
                default:
                    abyVar.setNavigationOnClickListener(x4);
                    int i63 = f52119u0;
                    int i64 = i63 & 117;
                    int i65 = ((i63 ^ 117) | i64) << 1;
                    int i66 = -((i63 | 117) & (~i64));
                    i16 = ((i65 | i66) << 1) - (i66 ^ i65);
                    v0 = i16 % 128;
                    int i413 = i16 % 2;
                    break;
            }
            int i67 = f52119u0;
            int i68 = (i67 ^ 85) + ((i67 & 85) << 1);
            v0 = i68 % 128;
            int i69 = i68 % 2;
            return Boolean.TRUE;
        } catch (EOFException unused) {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        r1 = (r10 | 75) << 1;
        r3 = -(r10 ^ 75);
        r6 = (r1 ^ r3) + ((r1 & r3) << 1);
        r1 = r6 % 128;
        com.mypinpad.tsdk.isolation.aai.f52119u0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        if ((r6 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        r2 = 64 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r5 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r5 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        r1 = r1 + 29;
        com.mypinpad.tsdk.isolation.aai.v0 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        throw new java.io.IOException("FRAME_SIZE_ERROR ack frame should be empty!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if ((r5 % 6) != 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        r7 = new com.mypinpad.tsdk.isolation.aam();
        r9 = kotlin.ranges.c.step(kotlin.ranges.c.until(0, r5), 6);
        r10 = r9.getFirst();
        r11 = r9.getLast();
        r9 = r9.getStep();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r9 <= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        r12 = com.mypinpad.tsdk.isolation.aai.f52119u0;
        r13 = r12 & 97;
        r12 = (r12 ^ 97) | r13;
        r14 = ((r13 | r12) << 1) - (r12 ^ r13);
        com.mypinpad.tsdk.isolation.aai.v0 = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        if ((r14 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
    
        if (r10 <= r11) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        if (r9 >= 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
    
        r12 = com.mypinpad.tsdk.isolation.aai.f52119u0;
        r13 = (r12 & 36) + (r12 | 36);
        r12 = (r13 ^ (-1)) + (r13 << 1);
        com.mypinpad.tsdk.isolation.aai.v0 = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        if (r11 > r10) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        r12 = r9 * (-575);
        r13 = r10 * (-575);
        r14 = (r12 & r13) + (r12 | r13);
        r12 = ~r9;
        r13 = ~r10;
        r15 = (r13 | r10) & r13;
        r15 = (r12 ^ r15) | (r15 & r12);
        r0 = ~r15;
        r0 = r0 & (r15 | r0);
        r15 = r13 & r5;
        r8 = (~r15) & (r13 | r5);
        r8 = (r8 ^ r15) | (r8 & r15);
        r15 = ~r8;
        r8 = (r8 | r15) & r15;
        r0 = -(~(((r0 & r8) | (r0 ^ r8)) * 576));
        r8 = ((r14 | r0) << 1) - (r0 ^ r14);
        r0 = (r8 ^ (-1)) + (r8 << 1);
        r8 = r12 ^ r10;
        r14 = r12 & r10;
        r8 = ~((r8 & r14) | (r8 ^ r14));
        r14 = ~r5;
        r14 = (r14 & r13) | (r13 ^ r14);
        r15 = r14 & r9;
        r6 = (~r15) & (r14 | r9);
        r6 = ~((r6 & r15) | (r6 ^ r15));
        r14 = ((~r6) & r8) | ((~r8) & r6);
        r6 = r6 & r8;
        r6 = ((r6 & r14) | (r14 ^ r6)) * 576;
        r8 = (((~r6) & r0) | ((~r0) & r6)) + ((r0 & r6) << 1);
        r0 = (r12 | r9) & r12;
        r6 = r0 ^ r13;
        r0 = r0 & r13;
        r0 = -(-((~((r0 & r6) | (r6 ^ r0))) * 576));
        r0 = ((r8 | r0) << 1) - (r0 ^ r8);
        r6 = com.mypinpad.tsdk.isolation.yt.setY(r1.f52120p0.setNavigationOnClickListener());
        r8 = r1.f52120p0.setLayoutAnimation();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0138, code lost:
    
        if (r6 == 1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x013a, code lost:
    
        if (r6 == 2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013d, code lost:
    
        if (r6 == 3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0140, code lost:
    
        if (r6 == 4) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0143, code lost:
    
        if (r6 == 5) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0148, code lost:
    
        if (r8 < 16384) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x014a, code lost:
    
        r12 = com.mypinpad.tsdk.isolation.aai.v0;
        r14 = (((r12 | 10) << 1) - (r12 ^ 10)) - 1;
        com.mypinpad.tsdk.isolation.aai.f52119u0 = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x015b, code lost:
    
        if ((r14 % 2) == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x015d, code lost:
    
        r14 = 42 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0161, code lost:
    
        if (r8 > 16777215) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0164, code lost:
    
        if (r8 > 16777215) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0176, code lost:
    
        throw new java.io.IOException(kotlin.jvm.internal.Intrinsics.stringPlus("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", java.lang.Integer.valueOf(r8)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0177, code lost:
    
        if (r8 < 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0179, code lost:
    
        r6 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0183, code lost:
    
        throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0184, code lost:
    
        r6 = com.mypinpad.tsdk.isolation.aai.v0;
        r12 = r6 & 91;
        r6 = (r6 | 91) & (~r12);
        r12 = -(-(r12 << 1));
        r14 = (r6 & r12) + (r6 | r12);
        com.mypinpad.tsdk.isolation.aai.f52119u0 = r14 % 128;
        r14 = r14 % 2;
        r6 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
    
        if (r9 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x019c, code lost:
    
        if (r8 == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x019e, code lost:
    
        r12 = com.mypinpad.tsdk.isolation.aai.f52119u0;
        r14 = ((r12 ^ 28) + ((r12 & 28) << 1)) - 1;
        com.mypinpad.tsdk.isolation.aai.v0 = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ac, code lost:
    
        if ((r14 % 2) != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ae, code lost:
    
        if (r8 != 1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b1, code lost:
    
        if (r8 != 1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01bb, code lost:
    
        throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01bc, code lost:
    
        r14 = com.mypinpad.tsdk.isolation.aai.f52119u0;
        r15 = r14 & 7;
        r12 = (7 | r14) & (~r15);
        r13 = -(-(r15 << 1));
        r14 = (r12 & r13) + (r12 | r13);
        com.mypinpad.tsdk.isolation.aai.v0 = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01d2, code lost:
    
        r6 = (com.mypinpad.tsdk.isolation.aam) com.mypinpad.tsdk.isolation.aam.setOnFocusChangeListener(new java.lang.Object[]{r7, java.lang.Integer.valueOf(r6), java.lang.Integer.valueOf(r8)}, 444410959, -444410954, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ef, code lost:
    
        if (r10 != r11) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01f2, code lost:
    
        r10 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f8, code lost:
    
        r3.setDividerPadding(r7);
        r0 = com.mypinpad.tsdk.isolation.aai.v0;
        r1 = r0 & 93;
        r0 = (r0 | 93) & (~r1);
        r1 = r1 << 1;
        r3 = (r0 ^ r1) + ((r0 & r1) << 1);
        com.mypinpad.tsdk.isolation.aai.f52119u0 = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x020e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021e, code lost:
    
        throw new java.io.IOException(kotlin.jvm.internal.Intrinsics.stringPlus("TYPE_SETTINGS length % 6 != 0: ", java.lang.Integer.valueOf(r5)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
    
        if (r9 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0226, code lost:
    
        throw new java.io.IOException("TYPE_SETTINGS streamId != 0");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if ((r7 & 1) == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void c(java.lang.Object[] r18) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aai.c(java.lang.Object[]):void");
    }

    public static /* synthetic */ void d(Object[] objArr) throws IOException {
        aai aaiVar = (aai) objArr[0];
        setDividerPadding setdividerpadding = (setDividerPadding) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i10 = v0;
        int i11 = (i10 & (-20)) | ((~i10) & 19);
        int i12 = -(-((i10 & 19) << 1));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f52119u0 = i13 % 128;
        if (i13 % 2 == 0 ? iIntValue < 8 : iIntValue < 43) {
            throw new IOException(Intrinsics.stringPlus("TYPE_GOAWAY length < 8: ", Integer.valueOf(iIntValue)));
        }
        if (iIntValue2 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int layoutAnimation = aaiVar.f52120p0.setLayoutAnimation();
        aby abyVar = aaiVar.f52120p0;
        int layoutAnimation2 = abyVar.setLayoutAnimation();
        int i14 = (iIntValue & (-8)) + (iIntValue | (-8));
        aac.Companion companion = aac.INSTANCE;
        aac aacVar = (aac) aac.Companion.setOnFocusChangeListener(new Object[]{Integer.valueOf(layoutAnimation2)}, -1744119768, 1744119768, layoutAnimation2);
        if (aacVar == null) {
            throw new IOException(Intrinsics.stringPlus("TYPE_GOAWAY unexpected error code: ", Integer.valueOf(layoutAnimation2)));
        }
        abw y7 = abw.setOnFocusChangeListener;
        if (i14 > 0) {
            int i15 = f52119u0 + 40;
            int i16 = (i15 ^ (-1)) + (i15 << 1);
            v0 = i16 % 128;
            if (i16 % 2 == 0) {
                abyVar.setY(i14);
                throw null;
            }
            y7 = abyVar.setY(i14);
        }
        setdividerpadding.setDividerPadding(layoutAnimation, aacVar, y7);
        int i17 = f52119u0;
        int i18 = (i17 & (-68)) | ((~i17) & 67);
        int i19 = -(-((i17 & 67) << 1));
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        v0 = i20 % 128;
        if (i20 % 2 == 0) {
            int i21 = 92 / 0;
        }
    }

    public static /* synthetic */ void e(Object[] objArr) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        aai aaiVar = (aai) objArr[0];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i10 = f52119u0 + 53;
        v0 = i10 % 128;
        if (i10 % 2 != 0 ? iIntValue != 5 : iIntValue != 5) {
            StringBuilder sb2 = new StringBuilder("TYPE_PRIORITY length: ");
            sb2.append(iIntValue);
            sb2.append(" != 5");
            throw new IOException(sb2.toString());
        }
        if (iIntValue2 == 0) {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
        setY(new Object[]{aaiVar}, 1024160739, -1024160731, System.identityHashCode(aaiVar));
        int i11 = v0;
        int i12 = (i11 & 43) + (i11 | 43);
        f52119u0 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 3 / 0;
        }
    }

    public static /* synthetic */ void f(Object[] objArr) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        boolean z10;
        int x4;
        aai aaiVar = (aai) objArr[0];
        setDividerPadding setdividerpadding = (setDividerPadding) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int iIntValue3 = ((Number) objArr[4]).intValue();
        int i10 = f52119u0;
        int i11 = (i10 & 31) + (i10 | 31);
        v0 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (iIntValue3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        if ((iIntValue2 & 1) != 0) {
            int i12 = i10 + 39;
            v0 = i12 % 128;
            int i13 = i12 % 2;
            int i14 = (i10 ^ 55) + ((i10 & 55) << 1);
            v0 = i14 % 128;
            int i15 = i14 % 2;
            z10 = true;
        } else {
            int i16 = (-2) - (((i10 ^ 50) + ((i10 & 50) << 1)) ^ (-1));
            v0 = i16 % 128;
            int i17 = i16 % 2;
            z10 = false;
        }
        if ((iIntValue2 & 8) != 0) {
            int i18 = v0;
            int i19 = (i18 | 11) << 1;
            int i20 = -(i18 ^ 11);
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            f52119u0 = i21 % 128;
            int i22 = i21 % 2;
            x4 = yt.setX(aaiVar.f52120p0.getNavBarTitleString());
            int i23 = f52119u0;
            int i24 = i23 ^ 125;
            int i25 = ((i23 & 125) | i24) << 1;
            int i26 = -i24;
            int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
            v0 = i27 % 128;
            int i28 = i27 % 2;
        } else {
            int i29 = v0;
            int i30 = i29 ^ 81;
            int i31 = ((i29 & 81) | i30) << 1;
            int i32 = -i30;
            int i33 = (i31 & i32) + (i31 | i32);
            f52119u0 = i33 % 128;
            int i34 = i33 % 2;
            x4 = 0;
        }
        if ((iIntValue2 & 32) != 0) {
            int i35 = v0;
            int i36 = i35 ^ 47;
            int i37 = ((((i35 & 47) | i36) << 1) - (~(-i36))) - 1;
            f52119u0 = i37 % 128;
            int i38 = i37 % 2;
            setY(new Object[]{aaiVar}, 1024160739, -1024160731, System.identityHashCode(aaiVar));
            int i39 = (iIntValue & 45) + (iIntValue | 45);
            iIntValue = (i39 & (-50)) + (i39 | (-50));
            int i40 = v0;
            int i41 = ((i40 | 115) << 1) - (((~i40) & 115) | (i40 & (-116)));
            f52119u0 = i41 % 128;
            int i42 = i41 % 2;
        }
        int iIntValue4 = ((Integer) Companion.setX(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(x4)}, 1449210397, -1449210396, iIntValue)).intValue();
        setdividerpadding.setDividerPadding(z10, iIntValue3, (List<aab>) setY(new Object[]{aaiVar, Integer.valueOf(iIntValue4), Integer.valueOf(x4), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)}, -792722274, 792722285, iIntValue4));
        int i43 = f52119u0;
        int i44 = i43 ^ 85;
        int i45 = (i43 & 85) << 1;
        int i46 = (i44 & i45) + (i45 | i44);
        v0 = i46 % 128;
        if (i46 % 2 == 0) {
            int i47 = 22 / 0;
        }
    }

    public static final /* synthetic */ Logger setX() {
        return (Logger) setY(new Object[0], 318812317, -318812315, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        boolean z10;
        int x4;
        int x6;
        int i13 = ~i10;
        int i14 = (((~(i10 | i11)) | (~(i12 | i13))) * 433) + (((~((~i11) | i12)) | i13) * (-433)) + ((~((~i12) | i13 | i11)) * 433) + (i11 * 434) + (i10 * (-432));
        Logger logger = f52118t0;
        boolean z11 = false;
        switch (i14) {
            case 1:
                a(objArr);
                return null;
            case 2:
                int i15 = v0 + 87;
                f52119u0 = i15 % 128;
                if (i15 % 2 == 0) {
                    return logger;
                }
                throw null;
            case 3:
                f(objArr);
                return null;
            case 4:
                e(objArr);
                return null;
            case 5:
                c(objArr);
                return null;
            case 6:
                d(objArr);
                return null;
            case 7:
                aai aaiVar = (aai) objArr[0];
                setDividerPadding setdividerpadding = (setDividerPadding) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int iIntValue2 = ((Number) objArr[3]).intValue();
                int i16 = f52119u0;
                int i17 = i16 & 121;
                int i18 = -(-(i16 | 121));
                int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                v0 = i19 % 128;
                int i20 = i19 % 2;
                if (iIntValue != 4) {
                    throw new IOException(Intrinsics.stringPlus("TYPE_WINDOW_UPDATE length !=4: ", Integer.valueOf(iIntValue)));
                }
                long dividerPadding = yt.setDividerPadding(aaiVar.f52120p0.setLayoutAnimation());
                if (dividerPadding == 0) {
                    throw new IOException("windowSizeIncrement was 0");
                }
                setdividerpadding.setX(iIntValue2, dividerPadding);
                return null;
            case 8:
                aai aaiVar2 = (aai) objArr[0];
                int i21 = v0;
                int i22 = ((i21 ^ 107) | (i21 & 107)) << 1;
                int i23 = -(((~i21) & 107) | (i21 & (-108)));
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                f52119u0 = i24 % 128;
                if (i24 % 2 != 0) {
                    aaiVar2.f52120p0.setLayoutAnimation();
                    yt.setX(aaiVar2.f52120p0.getNavBarTitleString());
                    int i25 = 4 / 0;
                } else {
                    aaiVar2.f52120p0.setLayoutAnimation();
                    yt.setX(aaiVar2.f52120p0.getNavBarTitleString());
                }
                return null;
            case 9:
                aai aaiVar3 = (aai) objArr[0];
                int i26 = v0;
                int i27 = (i26 ^ 37) + ((i26 & 37) << 1);
                f52119u0 = i27 % 128;
                if (i27 % 2 != 0) {
                    aaiVar3.f52120p0.close();
                    int i28 = 79 / 0;
                } else {
                    aaiVar3.f52120p0.close();
                }
                int i29 = v0 + 52;
                int i30 = (i29 ^ (-1)) + (i29 << 1);
                f52119u0 = i30 % 128;
                if (i30 % 2 != 0) {
                    throw null;
                }
                return null;
            case 10:
                return b(objArr);
            case 11:
                aai aaiVar4 = (aai) objArr[0];
                int iIntValue3 = ((Number) objArr[1]).intValue();
                int iIntValue4 = ((Number) objArr[2]).intValue();
                int iIntValue5 = ((Number) objArr[3]).intValue();
                int iIntValue6 = ((Number) objArr[4]).intValue();
                int i31 = f52119u0;
                int i32 = (i31 & (-24)) | ((~i31) & 23);
                int i33 = (i31 & 23) << 1;
                int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                v0 = i34 % 128;
                int i35 = i34 % 2;
                setCompoundDrawableTintBlendMode.setY(new Object[]{aaiVar4.f52122r0, Integer.valueOf(iIntValue3)}, 311839297, -311839288, iIntValue3);
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = aaiVar4.f52122r0;
                int iIntValue7 = ((Integer) setCompoundDrawableTintBlendMode.setY(new Object[]{setcompounddrawabletintblendmode}, -925988435, 925988440, System.identityHashCode(setcompounddrawabletintblendmode))).intValue();
                setCompoundDrawableTintBlendMode.setY(new Object[]{setcompounddrawabletintblendmode, Integer.valueOf(iIntValue7)}, 1365106188, -1365106187, iIntValue7);
                setCompoundDrawableTintBlendMode.setY(new Object[]{setcompounddrawabletintblendmode, Integer.valueOf(iIntValue4)}, 455936218, -455936215, iIntValue4);
                setCompoundDrawableTintBlendMode.setY(new Object[]{setcompounddrawabletintblendmode, Integer.valueOf(iIntValue5)}, -171169950, 171169956, iIntValue5);
                setCompoundDrawableTintBlendMode.setY(new Object[]{setcompounddrawabletintblendmode, Integer.valueOf(iIntValue6)}, -702507791, 702507798, iIntValue6);
                aaf.setOnFocusChangeListener setonfocuschangelistener = aaiVar4.f52123s0;
                aaf.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, 1916548618, -1916548615, System.identityHashCode(setonfocuschangelistener));
                List list = (List) aaf.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -1990918445, 1990918447, System.identityHashCode(setonfocuschangelistener));
                int i36 = v0;
                int i37 = i36 & 59;
                int i38 = ((i36 | 59) & (~i37)) + (i37 << 1);
                f52119u0 = i38 % 128;
                if (i38 % 2 == 0) {
                    return list;
                }
                throw null;
            case 12:
                aai aaiVar5 = (aai) objArr[0];
                setDividerPadding setdividerpadding2 = (setDividerPadding) objArr[1];
                int iIntValue8 = ((Number) objArr[2]).intValue();
                int iIntValue9 = ((Number) objArr[3]).intValue();
                int iIntValue10 = ((Number) objArr[4]).intValue();
                int i39 = v0;
                int i40 = ((i39 | 65) << 1) - ((i39 & (-66)) | ((~i39) & 65));
                int i41 = i40 % 128;
                f52119u0 = i41;
                int i42 = i40 % 2;
                if (iIntValue10 == 0) {
                    throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                }
                if ((iIntValue9 & 1) != 0) {
                    int i43 = i41 + 67;
                    v0 = i43 % 128;
                    int i44 = i43 % 2;
                    int i45 = (i41 & 67) + (i41 | 67);
                    v0 = i45 % 128;
                    int i46 = i45 % 2;
                    z10 = true;
                } else {
                    int i47 = i39 + 42;
                    int i48 = (i47 ^ (-1)) + (i47 << 1);
                    f52119u0 = i48 % 128;
                    int i49 = i48 % 2;
                    z10 = false;
                }
                if ((iIntValue9 & 32) != 0) {
                    int i50 = v0;
                    int i51 = i50 & 101;
                    int i52 = (i50 ^ 101) | i51;
                    int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                    int i54 = i53 % 128;
                    f52119u0 = i54;
                    int i55 = i53 % 2;
                    int i56 = i54 & 125;
                    int i57 = -(-((i54 ^ 125) | i56));
                    int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                    v0 = i58 % 128;
                    int i59 = i58 % 2;
                    throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                }
                int i60 = f52119u0;
                int i61 = i60 & 83;
                int i62 = i60 | 83;
                int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
                int i64 = i63 % 128;
                v0 = i64;
                int i65 = i63 % 2;
                if ((iIntValue9 & 8) != 0) {
                    int i66 = i64 & 89;
                    int i67 = (i64 | 89) & (~i66);
                    int i68 = -(-(i66 << 1));
                    int i69 = ((i67 | i68) << 1) - (i67 ^ i68);
                    f52119u0 = i69 % 128;
                    if (i69 % 2 != 0) {
                        yt.setX(aaiVar5.f52120p0.getNavBarTitleString());
                        throw null;
                    }
                    x4 = yt.setX(aaiVar5.f52120p0.getNavBarTitleString());
                    int i70 = v0;
                    int i71 = (((i70 ^ 81) | (i70 & 81)) << 1) - ((81 & (~i70)) | (i70 & (-82)));
                    f52119u0 = i71 % 128;
                    int i72 = i71 % 2;
                } else {
                    int i73 = i64 ^ 83;
                    int i74 = ((i64 & 83) | i73) << 1;
                    int i75 = -i73;
                    int i76 = (i74 ^ i75) + ((i74 & i75) << 1);
                    f52119u0 = i76 % 128;
                    int i77 = i76 % 2;
                    x4 = 0;
                }
                setdividerpadding2.setY(z10, iIntValue10, aaiVar5.f52120p0, ((Integer) Companion.setX(new Object[]{Integer.valueOf(iIntValue8), Integer.valueOf(iIntValue9), Integer.valueOf(x4)}, 1449210397, -1449210396, iIntValue8)).intValue());
                aaiVar5.f52120p0.setNavigationOnClickListener(x4);
                int i78 = v0;
                int i79 = ((i78 & 1) - (~(i78 | 1))) - 1;
                f52119u0 = i79 % 128;
                if (i79 % 2 != 0) {
                    int i80 = 78 / 0;
                }
                return null;
            case 13:
                aai aaiVar6 = (aai) objArr[0];
                setDividerPadding setdividerpadding3 = (setDividerPadding) objArr[1];
                int iIntValue11 = ((Number) objArr[2]).intValue();
                int iIntValue12 = ((Number) objArr[3]).intValue();
                int iIntValue13 = ((Number) objArr[4]).intValue();
                int i81 = f52119u0;
                int i82 = (i81 & (-70)) | ((~i81) & 69);
                int i83 = (i81 & 69) << 1;
                int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
                v0 = i84 % 128;
                if (i84 % 2 != 0 ? iIntValue11 != 8 : iIntValue11 != 84) {
                    throw new IOException(Intrinsics.stringPlus("TYPE_PING length != 8: ", Integer.valueOf(iIntValue11)));
                }
                if (iIntValue13 != 0) {
                    throw new IOException("TYPE_PING streamId != 0");
                }
                int layoutAnimation = aaiVar6.f52120p0.setLayoutAnimation();
                int layoutAnimation2 = aaiVar6.f52120p0.setLayoutAnimation();
                if ((iIntValue12 & 1) != 0) {
                    int i85 = v0 + 51;
                    f52119u0 = i85 % 128;
                    int i86 = i85 % 2;
                    z11 = true;
                } else {
                    int i87 = f52119u0;
                    int i88 = ((((i87 ^ 21) | (i87 & 21)) << 1) - (~(-(((~i87) & 21) | (i87 & (-22)))))) - 1;
                    v0 = i88 % 128;
                    int i89 = i88 % 2;
                }
                setdividerpadding3.setOnFocusChangeListener(z11, layoutAnimation, layoutAnimation2);
                int i90 = v0;
                int i91 = (i90 & 25) + (i90 | 25);
                f52119u0 = i91 % 128;
                int i92 = i91 % 2;
                return null;
            case 14:
                aai aaiVar7 = (aai) objArr[0];
                setDividerPadding setdividerpadding4 = (setDividerPadding) objArr[1];
                int i93 = v0;
                int i94 = ((i93 & 45) - (~(-(-(i93 | 45))))) - 1;
                f52119u0 = i94 % 128;
                if (i94 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(setdividerpadding4, "");
                    boolean z12 = aaiVar7.f52121q0;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(setdividerpadding4, "");
                if (!aaiVar7.f52121q0) {
                    abw abwVar = aae.setCompoundDrawableTintBlendMode;
                    abw y7 = aaiVar7.f52120p0.setY(((Integer) abw.setX(new Object[]{abwVar}, -1716166708, 1716166712, System.identityHashCode(abwVar))).intValue());
                    if (logger.isLoggable(Level.FINE)) {
                        int i95 = v0;
                        int i96 = i95 | 11;
                        int i97 = i96 << 1;
                        int i98 = -((~(i95 & 11)) & i96);
                        int i99 = ((i97 | i98) << 1) - (i98 ^ i97);
                        f52119u0 = i99 % 128;
                        int i100 = i99 % 2;
                        logger.fine(yt.setOnFocusChangeListener(Intrinsics.stringPlus("<< CONNECTION ", y7.setLayoutAnimation()), new Object[0]));
                        int i101 = f52119u0;
                        int i102 = i101 ^ 125;
                        int i103 = -(-((i101 & 125) << 1));
                        int i104 = (i102 ^ i103) + ((i103 & i102) << 1);
                        v0 = i104 % 128;
                        int i105 = i104 % 2;
                    }
                    if (!Intrinsics.areEqual(abwVar, y7)) {
                        throw new IOException(Intrinsics.stringPlus("Expected a connection header but was ", (String) abw.setX(new Object[]{y7}, -623922005, 623922012, System.identityHashCode(y7))));
                    }
                } else if (!((Boolean) setY(new Object[]{aaiVar7, Boolean.TRUE, setdividerpadding4}, -1001910009, 1001910019, System.identityHashCode(aaiVar7))).booleanValue()) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                int i106 = v0;
                int i107 = (i106 | 77) << 1;
                int i108 = -(i106 ^ 77);
                int i109 = (i107 & i108) + (i108 | i107);
                f52119u0 = i109 % 128;
                int i110 = i109 % 2;
                return null;
            default:
                aai aaiVar8 = (aai) objArr[0];
                setDividerPadding setdividerpadding5 = (setDividerPadding) objArr[1];
                int iIntValue14 = ((Number) objArr[2]).intValue();
                int iIntValue15 = ((Number) objArr[3]).intValue();
                int iIntValue16 = ((Number) objArr[4]).intValue();
                int i111 = f52119u0;
                int i112 = ((i111 | 95) << 1) - (i111 ^ 95);
                v0 = i112 % 128;
                if (i112 % 2 == 0) {
                    throw null;
                }
                if (iIntValue16 == 0) {
                    throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                }
                if ((iIntValue15 & 8) != 0) {
                    int i113 = ((i111 | 77) << 1) - (i111 ^ 77);
                    v0 = i113 % 128;
                    int i114 = i113 % 2;
                    x6 = yt.setX(aaiVar8.f52120p0.getNavBarTitleString());
                    int i115 = f52119u0;
                    int i116 = i115 & 85;
                    int i117 = (~i116) & (i115 | 85);
                    int i118 = -(-(i116 << 1));
                    int i119 = (i117 ^ i118) + ((i117 & i118) << 1);
                    v0 = i119 % 128;
                    int i120 = i119 % 2;
                } else {
                    int i121 = (i111 | 53) << 1;
                    int i122 = -(i111 ^ 53);
                    int i123 = (i121 ^ i122) + ((i121 & i122) << 1);
                    v0 = i123 % 128;
                    int i124 = i123 % 2;
                    x6 = 0;
                }
                int layoutAnimation3 = aaiVar8.f52120p0.setLayoutAnimation() & Integer.MAX_VALUE;
                int i125 = (iIntValue14 & 3) | ((-4) & (~iIntValue14));
                int i126 = -(-((iIntValue14 & (-4)) << 1));
                int i127 = ((i125 | i126) << 1) - (i126 ^ i125);
                int iIntValue17 = ((Integer) Companion.setX(new Object[]{Integer.valueOf(i127), Integer.valueOf(iIntValue15), Integer.valueOf(x6)}, 1449210397, -1449210396, i127)).intValue();
                setdividerpadding5.setDividerPadding(layoutAnimation3, (List) setY(new Object[]{aaiVar8, Integer.valueOf(iIntValue17), Integer.valueOf(x6), Integer.valueOf(iIntValue15), Integer.valueOf(iIntValue16)}, -792722274, 792722285, iIntValue17));
                int i128 = f52119u0;
                int i129 = ((i128 & (-96)) | ((~i128) & 95)) + ((i128 & 95) << 1);
                v0 = i129 % 128;
                int i130 = i129 % 2;
                return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        setY(new Object[]{this}, 86713294, -86713285, System.identityHashCode(this));
    }

    public final void setDividerPadding(@NotNull setDividerPadding p4) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        setY(new Object[]{this, p4}, -1546084773, 1546084787, System.identityHashCode(this));
    }

    public final boolean setOnFocusChangeListener(boolean p4, @NotNull setDividerPadding p10) throws IOException {
        return ((Boolean) setY(new Object[]{this, Boolean.valueOf(p4), p10}, -1001910009, 1001910019, System.identityHashCode(this))).booleanValue();
    }
}
