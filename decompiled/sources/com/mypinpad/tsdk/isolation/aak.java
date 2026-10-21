package com.mypinpad.tsdk.isolation;

import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 \u00132\u00020\u0001:\u0004\u0013,\u0017\u0011B3\b\u0000\u0012\u0006\u0010\r\u001a\u00020\u0016\u0012\u0006\u0010\u000f\u001a\u00020&\u0012\u0006\u0010N\u001a\u00020\u0019\u0012\u0006\u0010O\u001a\u00020\u0019\u0012\b\u0010P\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bQ\u0010RJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0014J\u000f\u0010\u001c\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u001e¢\u0006\u0004\b\u0013\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0010H\u0000¢\u0006\u0004\b \u0010\u001dJ\u000f\u0010!\u001a\u00020\u0010H\u0000¢\u0006\u0004\b!\u0010\u001dR\u001a\u0010%\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0013\u0010$R\u001a\u0010\u0011\u001a\u00020&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001a\u0010)R*\u0010.\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u001e8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b,\u0010\u001fR*\u00100\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u001e8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010+\u001a\u0004\b\u0017\u0010-\"\u0004\b\u0011\u0010\u001fR*\u00102\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u001e8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b\u0011\u0010-\"\u0004\b\u0017\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u001e8\u0007X\u0087\u0006¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b0\u0010-R\u001e\u00109\u001a\u000604R\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001e\u0010>\u001a\u00060:R\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b.\u0010=R\u001e\u0010D\u001a\u00060?R\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001e\u0010 \u001a\u00060?R\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\bE\u0010A\u001a\u0004\b%\u0010CR$\u0010,\u001a\u0004\u0018\u00010\f8A@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bD\u0010H\"\u0004\b\u0011\u0010\u0014R$\u0010\u001a\u001a\u0004\u0018\u00010\u000e8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\b2\u0010K\"\u0004\b,\u0010LR\u0011\u0010B\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b9\u0010MR\u0011\u00107\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b>\u0010M"}, d2 = {"Lcom/mypinpad/tsdk/i/aak;", "", "Lcom/mypinpad/tsdk/i/ye;", "setIncludeFontPadding", "()Lcom/mypinpad/tsdk/i/ye;", "Lcom/mypinpad/tsdk/i/acq;", "setTextScaleX", "()Lcom/mypinpad/tsdk/i/acq;", "setCompoundDrawablePadding", "Lcom/mypinpad/tsdk/i/aco;", "getAmountFieldTextColor", "()Lcom/mypinpad/tsdk/i/aco;", "Lcom/mypinpad/tsdk/i/aac;", "p0", "Ljava/io/IOException;", "p1", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/aac;Ljava/io/IOException;)V", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/aac;)V", "Lcom/mypinpad/tsdk/i/aby;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/aby;I)V", "", "setX", "(Lcom/mypinpad/tsdk/i/ye;Z)V", "setChildDivider", "()V", "", "(J)V", "setOnEditorActionListener", "setImageResource", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "()I", "setOnLongClickListener", "Lcom/mypinpad/tsdk/i/aah;", "b", "Lcom/mypinpad/tsdk/i/aah;", "()Lcom/mypinpad/tsdk/i/aah;", "c", "J", "setY", "()J", "getNavBarTitleString", "d", "setNavigationOnClickListener", "e", "UiMessageCallbackKtWhenMappings", "f", "Lcom/mypinpad/tsdk/i/aak$setDividerPadding;", "i", "Lcom/mypinpad/tsdk/i/aak$setDividerPadding;", "setLayoutAnimation", "()Lcom/mypinpad/tsdk/i/aak$setDividerPadding;", "setTextAlignment", "Lcom/mypinpad/tsdk/i/aak$setY;", "j", "Lcom/mypinpad/tsdk/i/aak$setY;", "()Lcom/mypinpad/tsdk/i/aak$setY;", "setZ", "Lcom/mypinpad/tsdk/i/aak$setCompoundDrawableTintBlendMode;", "k", "Lcom/mypinpad/tsdk/i/aak$setCompoundDrawableTintBlendMode;", "setOnDragListener", "()Lcom/mypinpad/tsdk/i/aak$setCompoundDrawableTintBlendMode;", "setAlwaysDrawnWithCacheEnabled", "l", "m", "Lcom/mypinpad/tsdk/i/aac;", "()Lcom/mypinpad/tsdk/i/aac;", "n", "Ljava/io/IOException;", "()Ljava/io/IOException;", "(Ljava/io/IOException;)V", "()Z", "p2", "p3", "p4", "<init>", "(ILcom/mypinpad/tsdk/i/aah;ZZLcom/mypinpad/tsdk/i/ye;)V"}, k = 1, mv = {1, 6, 0})
public final class aak {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f52145o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f52146p = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int setOnLongClickListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final aah setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long getNavBarTitleString;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public long setNavigationOnClickListener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public long UiMessageCallbackKtWhenMappings;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public long setIncludeFontPadding;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<ye> f52153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f52154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final setDividerPadding setTextAlignment;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final setY setZ;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final setCompoundDrawableTintBlendMode setAlwaysDrawnWithCacheEnabled;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final setCompoundDrawableTintBlendMode setOnEditorActionListener;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public aac setY;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public IOException setX;

    public final class setCompoundDrawableTintBlendMode extends abp {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static int f52160o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static int f52161p = 1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ aak f52162n;

        public setCompoundDrawableTintBlendMode(aak aakVar) {
            Intrinsics.checkNotNullParameter(aakVar, "");
            this.f52162n = aakVar;
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws IOException {
            int i13 = ((~(i10 | i11)) * (-495)) + (i11 * (-494)) + (i10 * (-494));
            int i14 = (~i12) | i10;
            int i15 = (((~((~i10) | (~i11))) | (~i14)) * 495) + (i14 * 495) + i13;
            SocketTimeoutException socketTimeoutException = null;
            if (i15 == 1) {
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) objArr[0];
                int i16 = f52160o;
                int i17 = i16 & 105;
                int i18 = (i16 ^ 105) | i17;
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                f52161p = i19 % 128;
                if (i19 % 2 == 0) {
                    aak aakVar = setcompounddrawabletintblendmode.f52162n;
                    aak.setOnFocusChangeListener(new Object[]{aakVar, aac.CANCEL}, 1937161244, -1937161244, System.identityHashCode(aakVar));
                    aak aakVar2 = setcompounddrawabletintblendmode.f52162n;
                    aah aahVar = (aah) aak.setOnFocusChangeListener(new Object[]{aakVar2}, 1720650987, -1720650970, System.identityHashCode(aakVar2));
                    aah.setX(new Object[]{aahVar}, 1465015964, -1465015926, System.identityHashCode(aahVar));
                    int i20 = 49 / 0;
                } else {
                    aak aakVar3 = setcompounddrawabletintblendmode.f52162n;
                    aak.setOnFocusChangeListener(new Object[]{aakVar3, aac.CANCEL}, 1937161244, -1937161244, System.identityHashCode(aakVar3));
                    aak aakVar4 = setcompounddrawabletintblendmode.f52162n;
                    aah aahVar2 = (aah) aak.setOnFocusChangeListener(new Object[]{aakVar4}, 1720650987, -1720650970, System.identityHashCode(aakVar4));
                    aah.setX(new Object[]{aahVar2}, 1465015964, -1465015926, System.identityHashCode(aahVar2));
                }
                int i21 = f52160o;
                int i22 = (i21 & 79) + (i21 | 79);
                f52161p = i22 % 128;
                if (i22 % 2 == 0) {
                    int i23 = 54 / 0;
                }
            } else if (i15 != 2) {
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = (setCompoundDrawableTintBlendMode) objArr[0];
                int i24 = f52161p + 89;
                f52160o = i24 % 128;
                int i25 = i24 % 2;
                if (((Boolean) abp.setY(new Object[]{setcompounddrawabletintblendmode2}, -844782123, 844782128, System.identityHashCode(setcompounddrawabletintblendmode2))).booleanValue()) {
                    int i26 = f52161p;
                    int i27 = (((i26 | 74) << 1) - (i26 ^ 74)) - 1;
                    f52160o = i27 % 128;
                    int i28 = i27 % 2;
                    throw ((IOException) setDividerPadding(new Object[]{setcompounddrawabletintblendmode2, null}, 1488426681, -1488426679, System.identityHashCode(setcompounddrawabletintblendmode2)));
                }
                int i29 = f52160o;
                int i30 = ((i29 | 59) << 1) - (i29 ^ 59);
                f52161p = i30 % 128;
                if (i30 % 2 == 0) {
                    throw null;
                }
            } else {
                IOException iOException = (IOException) objArr[1];
                socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    int i31 = f52161p;
                    int i32 = (((i31 | 91) << 1) - (~(-(i31 ^ 91)))) - 1;
                    f52160o = i32 % 128;
                    int i33 = i32 % 2;
                    socketTimeoutException.initCause(iOException);
                    int i34 = f52161p;
                    int i35 = i34 & 125;
                    int i36 = i35 + ((i34 ^ 125) | i35);
                    f52160o = i36 % 128;
                    int i37 = i36 % 2;
                }
                int i38 = f52160o + 109;
                f52161p = i38 % 128;
                int i39 = i38 % 2;
            }
            return socketTimeoutException;
        }

        public final void setOnFocusChangeListener() throws IOException {
            setDividerPadding(new Object[]{this}, 1024790889, -1024790889, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.abp
        @NotNull
        public final IOException setOnFocusChangeListener(@Nullable IOException iOException) {
            return (IOException) setDividerPadding(new Object[]{this, iOException}, 1488426681, -1488426679, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.abp
        public final void setDividerPadding() throws IOException {
            setDividerPadding(new Object[]{this}, -1500067053, 1500067054, System.identityHashCode(this));
        }
    }

    public final class setDividerPadding implements acp {
        public static int v0 = 0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static int f52163w0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final long f52164p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f52165q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @NotNull
        public final abx f52166r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        @NotNull
        public final abx f52167s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f52168t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ aak f52169u0;

        public setDividerPadding(aak aakVar, long j10, boolean z10) {
            Intrinsics.checkNotNullParameter(aakVar, "");
            this.f52169u0 = aakVar;
            this.f52164p0 = j10;
            this.f52165q0 = z10;
            this.f52166r0 = new abx();
            this.f52167s0 = new abx();
        }

        public static /* synthetic */ Long a(Object[] objArr) throws Throwable {
            Throwable aapVar;
            boolean z10;
            long jLongValue;
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            int i10 = 1;
            abx abxVar = (abx) objArr[1];
            long jLongValue2 = ((Number) objArr[2]).longValue();
            Intrinsics.checkNotNullParameter(abxVar, "");
            long j10 = 0;
            if (jLongValue2 < 0) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(jLongValue2)).toString());
            }
            while (true) {
                aak aakVar = setdividerpadding.f52169u0;
                synchronized (aakVar) {
                    Object[] objArr2 = new Object[i10];
                    objArr2[0] = aakVar;
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) aak.setOnFocusChangeListener(objArr2, 434717771, -434717762, System.identityHashCode(aakVar));
                    Object[] objArr3 = new Object[i10];
                    objArr3[0] = setcompounddrawabletintblendmode;
                    abp.setY(objArr3, -1179150768, 1179150769, System.identityHashCode(setcompounddrawabletintblendmode));
                    try {
                        if (aakVar.setAlwaysDrawnWithCacheEnabled() != null) {
                            Object[] objArr4 = new Object[i10];
                            objArr4[0] = aakVar;
                            aapVar = (IOException) aak.setOnFocusChangeListener(objArr4, 835945179, -835945158, System.identityHashCode(aakVar));
                            if (aapVar == null) {
                                aac alwaysDrawnWithCacheEnabled = aakVar.setAlwaysDrawnWithCacheEnabled();
                                Intrinsics.checkNotNull(alwaysDrawnWithCacheEnabled);
                                aapVar = new aap(alwaysDrawnWithCacheEnabled);
                            }
                        } else {
                            aapVar = null;
                        }
                        Object[] objArr5 = new Object[i10];
                        objArr5[0] = setdividerpadding;
                        if (((Boolean) setOnFocusChangeListener(objArr5, -1629488671, 1629488671, System.identityHashCode(setdividerpadding))).booleanValue()) {
                            throw new IOException("stream closed");
                        }
                        Object[] objArr6 = new Object[i10];
                        objArr6[0] = setdividerpadding;
                        abx abxVar2 = (abx) setOnFocusChangeListener(objArr6, 1224624600, -1224624597, System.identityHashCode(setdividerpadding));
                        Object[] objArr7 = new Object[i10];
                        objArr7[0] = abxVar2;
                        if (((Long) abx.setOnFocusChangeListener(objArr7, 1395393434, -1395393402, System.identityHashCode(abxVar2))).longValue() > j10) {
                            Object[] objArr8 = new Object[i10];
                            objArr8[0] = setdividerpadding;
                            abx abxVar3 = (abx) setOnFocusChangeListener(objArr8, 1224624600, -1224624597, System.identityHashCode(setdividerpadding));
                            Object[] objArr9 = new Object[i10];
                            objArr9[0] = setdividerpadding;
                            abx abxVar4 = (abx) setOnFocusChangeListener(objArr9, 1224624600, -1224624597, System.identityHashCode(setdividerpadding));
                            Object[] objArr10 = new Object[i10];
                            objArr10[0] = abxVar4;
                            long jMin = Math.min(jLongValue2, ((Long) abx.setOnFocusChangeListener(objArr10, 1395393434, -1395393402, System.identityHashCode(abxVar4))).longValue());
                            Object[] objArr11 = new Object[3];
                            objArr11[0] = abxVar3;
                            objArr11[i10] = abxVar;
                            objArr11[2] = Long.valueOf(jMin);
                            jLongValue = ((Long) abx.setOnFocusChangeListener(objArr11, -1652089489, 1652089516, System.identityHashCode(abxVar3))).longValue();
                            Object[] objArr12 = new Object[i10];
                            objArr12[0] = aakVar;
                            long jLongValue3 = ((Long) aak.setOnFocusChangeListener(objArr12, 36091768, -36091749, System.identityHashCode(aakVar))).longValue() + jLongValue;
                            Object[] objArr13 = new Object[2];
                            objArr13[0] = aakVar;
                            objArr13[i10] = Long.valueOf(jLongValue3);
                            aak.setOnFocusChangeListener(objArr13, -1510996236, 1510996264, System.identityHashCode(aakVar));
                            Object[] objArr14 = new Object[i10];
                            objArr14[0] = aakVar;
                            long jLongValue4 = ((Long) aak.setOnFocusChangeListener(objArr14, 36091768, -36091749, System.identityHashCode(aakVar))).longValue();
                            Object[] objArr15 = new Object[i10];
                            objArr15[0] = aakVar;
                            long jLongValue5 = jLongValue4 - ((Long) aak.setOnFocusChangeListener(objArr15, 29526374, -29526369, System.identityHashCode(aakVar))).longValue();
                            if (aapVar == null) {
                                Object[] objArr16 = new Object[i10];
                                objArr16[0] = aakVar;
                                aah aahVar = (aah) aak.setOnFocusChangeListener(objArr16, 1720650987, -1720650970, System.identityHashCode(aakVar));
                                Object[] objArr17 = new Object[i10];
                                objArr17[0] = aahVar;
                                aam aamVar = (aam) aah.setX(objArr17, 579610465, -579610439, System.identityHashCode(aahVar));
                                Object[] objArr18 = new Object[i10];
                                objArr18[0] = aamVar;
                                if (jLongValue5 >= ((Integer) aam.setOnFocusChangeListener(objArr18, -1082853585, 1082853592, System.identityHashCode(aamVar))).intValue() / 2) {
                                    Object[] objArr19 = new Object[i10];
                                    objArr19[0] = aakVar;
                                    aah aahVar2 = (aah) aak.setOnFocusChangeListener(objArr19, 1720650987, -1720650970, System.identityHashCode(aakVar));
                                    Object[] objArr20 = new Object[i10];
                                    objArr20[0] = aakVar;
                                    try {
                                        int iIntValue = ((Integer) aak.setOnFocusChangeListener(objArr20, 2012833449, -2012833441, System.identityHashCode(aakVar))).intValue();
                                        Object[] objArr21 = new Object[3];
                                        objArr21[0] = aahVar2;
                                        try {
                                            objArr21[1] = Integer.valueOf(iIntValue);
                                            objArr21[2] = Long.valueOf(jLongValue5);
                                            aah.setX(objArr21, -933000425, 933000476, iIntValue);
                                            Object[] objArr22 = new Object[1];
                                            objArr22[0] = aakVar;
                                            long jLongValue6 = ((Long) aak.setOnFocusChangeListener(objArr22, 36091768, -36091749, System.identityHashCode(aakVar))).longValue();
                                            Object[] objArr23 = new Object[2];
                                            objArr23[0] = aakVar;
                                            try {
                                                objArr23[1] = Long.valueOf(jLongValue6);
                                                aak.setOnFocusChangeListener(objArr23, 1652721237, -1652721234, System.identityHashCode(aakVar));
                                            } catch (Throwable th2) {
                                                th = th2;
                                                i10 = 1;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            i10 = 1;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        i10 = 1;
                                    }
                                }
                            }
                            z10 = false;
                        } else {
                            Object[] objArr24 = new Object[i10];
                            objArr24[0] = setdividerpadding;
                            if (((Boolean) setOnFocusChangeListener(objArr24, 1875229206, -1875229198, System.identityHashCode(setdividerpadding))).booleanValue() || aapVar != null) {
                                z10 = false;
                                jLongValue = -1;
                            } else {
                                Object[] objArr25 = new Object[1];
                                objArr25[0] = aakVar;
                                aak.setOnFocusChangeListener(objArr25, 1097831599, -1097831583, System.identityHashCode(aakVar));
                                jLongValue = -1;
                                z10 = true;
                            }
                        }
                        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = (setCompoundDrawableTintBlendMode) aak.setOnFocusChangeListener(new Object[]{aakVar}, 434717771, -434717762, System.identityHashCode(aakVar));
                        setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{setcompounddrawabletintblendmode2}, 1024790889, -1024790889, System.identityHashCode(setcompounddrawabletintblendmode2));
                        Unit unit = Unit.INSTANCE;
                        th = th4;
                        i10 = 1;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                    Object[] objArr26 = new Object[i10];
                    objArr26[0] = aakVar;
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = (setCompoundDrawableTintBlendMode) aak.setOnFocusChangeListener(objArr26, 434717771, -434717762, System.identityHashCode(aakVar));
                    Object[] objArr27 = new Object[i10];
                    objArr27[0] = setcompounddrawabletintblendmode3;
                    setCompoundDrawableTintBlendMode.setDividerPadding(objArr27, 1024790889, -1024790889, System.identityHashCode(setcompounddrawabletintblendmode3));
                    throw th;
                }
                if (!z10) {
                    if (jLongValue != -1) {
                        setOnFocusChangeListener(new Object[]{setdividerpadding, Long.valueOf(jLongValue)}, 505923018, -505923009, System.identityHashCode(setdividerpadding));
                        return Long.valueOf(jLongValue);
                    }
                    if (aapVar == null) {
                        return -1L;
                    }
                    throw aapVar;
                }
                i10 = 1;
                j10 = 0;
            }
        }

        public static /* synthetic */ void b(Object[] objArr) throws IOException {
            long jLongValue;
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            aak aakVar = setdividerpadding.f52169u0;
            synchronized (aakVar) {
                setOnFocusChangeListener(new Object[]{setdividerpadding}, -35030181, 35030185, System.identityHashCode(setdividerpadding));
                abx abxVar = (abx) setOnFocusChangeListener(new Object[]{setdividerpadding}, 1224624600, -1224624597, System.identityHashCode(setdividerpadding));
                jLongValue = ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue();
                abx abxVar2 = (abx) setOnFocusChangeListener(new Object[]{setdividerpadding}, 1224624600, -1224624597, System.identityHashCode(setdividerpadding));
                abx.setOnFocusChangeListener(new Object[]{abxVar2}, 502611487, -502611445, System.identityHashCode(abxVar2));
                aakVar.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
            if (jLongValue > 0) {
                setOnFocusChangeListener(new Object[]{setdividerpadding, Long.valueOf(jLongValue)}, 505923018, -505923009, System.identityHashCode(setdividerpadding));
            }
            aak aakVar2 = setdividerpadding.f52169u0;
            aak.setOnFocusChangeListener(new Object[]{aakVar2}, 1817193165, -1817193143, System.identityHashCode(aakVar2));
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws IOException {
            Object objValueOf;
            boolean zBooleanValue;
            boolean z10;
            long jLongValue;
            int i13 = ~i11;
            int i14 = (((~((~i12) | i13)) | (~(i13 | i10))) * (-245)) + (i11 * 246) + (i10 * (-244));
            int i15 = ~(i13 | i12);
            switch (((i10 | i15) * 245) + (i15 * (-245)) + i14) {
                case 1:
                    objValueOf = null;
                    setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
                    int i16 = f52163w0;
                    int i17 = ((i16 | 45) << 1) - (i16 ^ 45);
                    int i18 = i17 % 128;
                    v0 = i18;
                    int i19 = i17 % 2;
                    setdividerpadding.f52165q0 = true;
                    int i20 = (((i18 | 118) << 1) - (i18 ^ 118)) - 1;
                    f52163w0 = i20 % 128;
                    int i21 = i20 % 2;
                    return objValueOf;
                case 2:
                    b(objArr);
                    return null;
                case 3:
                    setDividerPadding setdividerpadding2 = (setDividerPadding) objArr[0];
                    int i22 = v0;
                    int i23 = ((i22 | 47) << 1) - (i22 ^ 47);
                    int i24 = i23 % 128;
                    f52163w0 = i24;
                    int i25 = i23 % 2;
                    objValueOf = setdividerpadding2.f52167s0;
                    int i26 = i24 & 125;
                    int i27 = -(-((i24 ^ 125) | i26));
                    int i28 = (i26 & i27) + (i27 | i26);
                    v0 = i28 % 128;
                    if (i28 % 2 != 0) {
                        throw null;
                    }
                    return objValueOf;
                case 4:
                    setDividerPadding setdividerpadding3 = (setDividerPadding) objArr[0];
                    int i29 = f52163w0;
                    int i30 = i29 ^ 89;
                    int i31 = (((i29 & 89) | i30) << 1) - i30;
                    v0 = i31 % 128;
                    int i32 = i31 % 2;
                    setdividerpadding3.f52168t0 = true;
                    int i33 = ((i29 ^ 77) | (i29 & 77)) << 1;
                    int i34 = -(((~i29) & 77) | (i29 & (-78)));
                    int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
                    v0 = i35 % 128;
                    if (i35 % 2 != 0) {
                        throw null;
                    }
                    return null;
                case 5:
                    setDividerPadding setdividerpadding4 = (setDividerPadding) objArr[0];
                    int i36 = f52163w0 + 3;
                    int i37 = i36 % 128;
                    v0 = i37;
                    if (i36 % 2 != 0) {
                        abx abxVar = setdividerpadding4.f52166r0;
                        throw null;
                    }
                    abx abxVar2 = setdividerpadding4.f52166r0;
                    int i38 = (-2) - (((i37 ^ 52) + ((i37 & 52) << 1)) ^ (-1));
                    f52163w0 = i38 % 128;
                    int i39 = i38 % 2;
                    return abxVar2;
                case 6:
                    return a(objArr);
                case 7:
                    setDividerPadding setdividerpadding5 = (setDividerPadding) objArr[0];
                    int i40 = v0;
                    int i41 = (i40 ^ 35) + ((i40 & 35) << 1);
                    f52163w0 = i41 % 128;
                    int i42 = i41 % 2;
                    aak aakVar = setdividerpadding5.f52169u0;
                    objValueOf = (setCompoundDrawableTintBlendMode) aak.setOnFocusChangeListener(new Object[]{aakVar}, 434717771, -434717762, System.identityHashCode(aakVar));
                    int i43 = f52163w0;
                    int i44 = i43 & 95;
                    int i45 = ((i43 ^ 95) | i44) << 1;
                    int i46 = -((i43 | 95) & (~i44));
                    int i47 = (i45 & i46) + (i46 | i45);
                    v0 = i47 % 128;
                    if (i47 % 2 != 0) {
                        throw null;
                    }
                    return objValueOf;
                case 8:
                    setDividerPadding setdividerpadding6 = (setDividerPadding) objArr[0];
                    int i48 = v0;
                    int i49 = i48 & 37;
                    int i50 = (i48 ^ 37) | i49;
                    int i51 = (i49 ^ i50) + ((i49 & i50) << 1);
                    f52163w0 = i51 % 128;
                    int i52 = i51 % 2;
                    boolean z11 = setdividerpadding6.f52165q0;
                    int i53 = i48 & 1;
                    int i54 = (i53 - (~((i48 ^ 1) | i53))) - 1;
                    f52163w0 = i54 % 128;
                    if (i54 % 2 == 0) {
                        int i55 = 3 / 0;
                    }
                    objValueOf = Boolean.valueOf(z11);
                    return objValueOf;
                case 9:
                    setDividerPadding setdividerpadding7 = (setDividerPadding) objArr[0];
                    long jLongValue2 = ((Number) objArr[1]).longValue();
                    int i56 = v0;
                    int i57 = ((i56 | 13) << 1) - (i56 ^ 13);
                    f52163w0 = i57 % 128;
                    if (i57 % 2 == 0) {
                        aak aakVar2 = setdividerpadding7.f52169u0;
                        byte[] bArr = yt.setX;
                        throw null;
                    }
                    aak aakVar3 = setdividerpadding7.f52169u0;
                    if (yt.setOnFocusChangeListener) {
                        int i58 = f52163w0;
                        int i59 = i58 & 3;
                        int i60 = ((3 | i58) & (~i59)) + (i59 << 1);
                        v0 = i60 % 128;
                        int i61 = i60 % 2;
                        if (Thread.holdsLock(aakVar3)) {
                            StringBuilder sb2 = new StringBuilder("Thread ");
                            sb2.append((Object) Thread.currentThread().getName());
                            sb2.append(" MUST NOT hold lock on ");
                            sb2.append(aakVar3);
                            throw new AssertionError(sb2.toString());
                        }
                    }
                    aak aakVar4 = setdividerpadding7.f52169u0;
                    ((aah) aak.setOnFocusChangeListener(new Object[]{aakVar4}, 1720650987, -1720650970, System.identityHashCode(aakVar4))).setDividerPadding(jLongValue2);
                    int i62 = f52163w0;
                    int i63 = i62 & 61;
                    int i64 = (i63 - (~(-(-((i62 ^ 61) | i63))))) - 1;
                    v0 = i64 % 128;
                    int i65 = i64 % 2;
                    return null;
                case 10:
                    setDividerPadding setdividerpadding8 = (setDividerPadding) objArr[0];
                    aby abyVar = (aby) objArr[1];
                    long jLongValue3 = ((Number) objArr[2]).longValue();
                    Intrinsics.checkNotNullParameter(abyVar, "");
                    aak aakVar5 = setdividerpadding8.f52169u0;
                    if (yt.setOnFocusChangeListener && Thread.holdsLock(aakVar5)) {
                        StringBuilder sb3 = new StringBuilder("Thread ");
                        sb3.append((Object) Thread.currentThread().getName());
                        sb3.append(" MUST NOT hold lock on ");
                        sb3.append(aakVar5);
                        throw new AssertionError(sb3.toString());
                    }
                    while (jLongValue3 > 0) {
                        synchronized (setdividerpadding8.f52169u0) {
                            zBooleanValue = ((Boolean) setOnFocusChangeListener(new Object[]{setdividerpadding8}, 1875229206, -1875229198, System.identityHashCode(setdividerpadding8))).booleanValue();
                            abx abxVar3 = (abx) setOnFocusChangeListener(new Object[]{setdividerpadding8}, 1224624600, -1224624597, System.identityHashCode(setdividerpadding8));
                            z10 = ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar3}, 1395393434, -1395393402, System.identityHashCode(abxVar3))).longValue() + jLongValue3 > setdividerpadding8.f52164p0;
                            Unit unit = Unit.INSTANCE;
                        }
                        if (z10) {
                            abyVar.setNavigationOnClickListener(jLongValue3);
                            aak aakVar6 = setdividerpadding8.f52169u0;
                            aak.setOnFocusChangeListener(new Object[]{aakVar6, aac.FLOW_CONTROL_ERROR}, 1937161244, -1937161244, System.identityHashCode(aakVar6));
                        } else if (zBooleanValue) {
                            abyVar.setNavigationOnClickListener(jLongValue3);
                        } else {
                            long y7 = abyVar.setY(setdividerpadding8.f52166r0, jLongValue3);
                            if (y7 == -1) {
                                throw new EOFException();
                            }
                            jLongValue3 -= y7;
                            aak aakVar7 = setdividerpadding8.f52169u0;
                            synchronized (aakVar7) {
                                try {
                                    if (((Boolean) setOnFocusChangeListener(new Object[]{setdividerpadding8}, -1629488671, 1629488671, System.identityHashCode(setdividerpadding8))).booleanValue()) {
                                        abx abxVar4 = (abx) setOnFocusChangeListener(new Object[]{setdividerpadding8}, -939507184, 939507189, System.identityHashCode(setdividerpadding8));
                                        jLongValue = ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar4}, 1395393434, -1395393402, System.identityHashCode(abxVar4))).longValue();
                                        abx abxVar5 = (abx) setOnFocusChangeListener(new Object[]{setdividerpadding8}, -939507184, 939507189, System.identityHashCode(setdividerpadding8));
                                        abx.setOnFocusChangeListener(new Object[]{abxVar5}, 502611487, -502611445, System.identityHashCode(abxVar5));
                                    } else {
                                        abx abxVar6 = (abx) setOnFocusChangeListener(new Object[]{setdividerpadding8}, 1224624600, -1224624597, System.identityHashCode(setdividerpadding8));
                                        boolean z12 = ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar6}, 1395393434, -1395393402, System.identityHashCode(abxVar6))).longValue() == 0;
                                        abx abxVar7 = (abx) setOnFocusChangeListener(new Object[]{setdividerpadding8}, 1224624600, -1224624597, System.identityHashCode(setdividerpadding8));
                                        ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar7, (abx) setOnFocusChangeListener(new Object[]{setdividerpadding8}, -939507184, 939507189, System.identityHashCode(setdividerpadding8))}, -1844326734, 1844326753, System.identityHashCode(abxVar7))).longValue();
                                        if (z12) {
                                            aakVar7.notifyAll();
                                        }
                                        jLongValue = 0;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (jLongValue > 0) {
                                setOnFocusChangeListener(new Object[]{setdividerpadding8, Long.valueOf(jLongValue)}, 505923018, -505923009, System.identityHashCode(setdividerpadding8));
                            }
                        }
                        return null;
                    }
                    return null;
                default:
                    setDividerPadding setdividerpadding9 = (setDividerPadding) objArr[0];
                    int iIdentityHashCode = System.identityHashCode(setdividerpadding9);
                    int i66 = ~iIdentityHashCode;
                    int i67 = (iIdentityHashCode | i66) & i66;
                    int i68 = ((~i67) & (-1883826478)) | (i67 & 1883826477);
                    int i69 = i67 & (-1883826478);
                    int i70 = (i69 & i68) | (i68 ^ i69);
                    int i71 = ~((i70 & 689568368) | (i70 ^ 689568368));
                    int i72 = (-689568369) & i66;
                    int i73 = (689568368 & i66) | ((~i66) & (-689568369)) | i72;
                    int i74 = (i73 & (-1883826478)) | ((~i73) & 1883826477);
                    int i75 = i73 & 1883826477;
                    int i76 = ~((i75 & i74) | (i74 ^ i75));
                    int i77 = i71 & i76;
                    int i78 = (i71 | i76) & (~i77);
                    int i79 = ((i78 & i77) | (i78 ^ i77)) * (-184);
                    int i80 = 1515145925 & i79;
                    int i81 = (i79 | 1515145925) & (~i80);
                    int i82 = i80 << 1;
                    int i83 = ((i81 | i82) << 1) - (i81 ^ i82);
                    int i84 = (-1883826478) ^ i66;
                    int i85 = (-1883826478) & i66;
                    int i86 = (~((i84 & i85) | (i84 ^ i85))) | 537454624;
                    int i87 = i66 ^ (-689568369);
                    int i88 = (i87 & i72) | (i87 ^ i72);
                    int i89 = ~i88;
                    int i90 = (i88 | i89) & i89;
                    int i91 = i86 ^ i90;
                    int i92 = i86 & i90;
                    int i93 = -(-(((i92 & i91) | (i91 ^ i92)) * 184));
                    int i94 = (i83 ^ i93) + ((i93 & i83) << 1);
                    int i95 = i94 & 950845912;
                    int i96 = 950845912 | i94;
                    int i97 = ((i95 | i96) << 1) - (i96 ^ i95);
                    int iIdentityHashCode2 = System.identityHashCode(setdividerpadding9);
                    int i98 = ~iIdentityHashCode2;
                    int i99 = ((-2065574768) & i98) | (i98 ^ (-2065574768));
                    int i100 = ~i99;
                    int i101 = -(-(((i99 | i100) & i100) * (-560)));
                    int i102 = 1149172216 & i101;
                    int i103 = (i101 | 1149172216) & (~i102);
                    int i104 = i102 << 1;
                    int i105 = ((i103 | i104) << 1) - (i103 ^ i104);
                    int i106 = (-1527783529) & iIdentityHashCode2;
                    int i107 = ((-1527783529) | iIdentityHashCode2) & (~i106);
                    int i108 = (~((i107 & i106) | (i107 ^ i106))) * (-560);
                    int i109 = i105 & i108;
                    int i110 = ((i105 ^ i108) | i109) << 1;
                    int i111 = -((i108 | i105) & (~i109));
                    int i112 = (i110 ^ i111) + ((i111 & i110) << 1);
                    int i113 = (iIdentityHashCode2 | i98) & i98;
                    int i114 = ((-1603364073) & i113) | ((~i113) & 1603364072);
                    int i115 = i113 & 1603364072;
                    int i116 = ~((i115 & i114) | (i114 ^ i115));
                    int i117 = ((i116 & (-2141155312)) | ((-2141155312) ^ i116)) * 560;
                    int i118 = (((i112 | i117) << 1) - (~(-((i117 & (~i112)) | ((~i117) & i112))))) - 1;
                    boolean z13 = setdividerpadding9.f52168t0;
                    if (i97 <= i118) {
                        return Boolean.valueOf(z13);
                    }
                    throw null;
            }
        }

        @Override // com.mypinpad.tsdk.isolation.acp, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            setOnFocusChangeListener(new Object[]{this}, -1280557993, 1280557995, System.identityHashCode(this));
        }

        public final boolean setCompoundDrawableTintBlendMode() {
            return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 1875229206, -1875229198, System.identityHashCode(this))).booleanValue();
        }

        public final boolean setDividerPadding() {
            return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -1629488671, 1629488671, System.identityHashCode(this))).booleanValue();
        }

        public final void setX() throws IOException {
            setOnFocusChangeListener(new Object[]{this}, -967813620, 967813621, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.acp
        @NotNull
        public final acq setY() {
            return (acq) setOnFocusChangeListener(new Object[]{this}, -1101429905, 1101429912, System.identityHashCode(this));
        }

        public final void setY(@NotNull aby abyVar, long j10) throws IOException {
            setOnFocusChangeListener(new Object[]{this, abyVar, Long.valueOf(j10)}, 1426624520, -1426624510, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.acp
        public final long setY(@NotNull abx abxVar, long j10) throws IOException {
            return ((Long) setOnFocusChangeListener(new Object[]{this, abxVar, Long.valueOf(j10)}, -1469903299, 1469903305, System.identityHashCode(this))).longValue();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\nR\u001a\u0010\u0013\u001a\u00020\u000f8\u0007X\u0087\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0014X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\"\u0010\f\u001a\u00020\u000f8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0007\u0010\n"}, d2 = {"Lcom/mypinpad/tsdk/i/aak$setY;", "Lcom/mypinpad/tsdk/i/aco;", "Lcom/mypinpad/tsdk/i/abx;", "p0", "", "p1", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/abx;J)V", "flush", "()V", "Lcom/mypinpad/tsdk/i/acq;", "setY", "()Lcom/mypinpad/tsdk/i/acq;", HearingDisabilitiesConstants.CLOSE_MODAL, "", "Z", "setOnFocusChangeListener", "()Z", "setX", "Lcom/mypinpad/tsdk/i/ye;", "Lcom/mypinpad/tsdk/i/ye;", "r0", "setCompoundDrawableTintBlendMode", "<init>", "(Lcom/mypinpad/tsdk/i/aak;Z)V"}, k = 1, mv = {1, 6, 0})
    public final class setY implements aco {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f52170t0 = 0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f52171u0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public final boolean setX;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NotNull
        public final abx f52173q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        public boolean setY;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ aak f52175s0;

        /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
        @Nullable
        public ye setOnFocusChangeListener;

        public setY(aak aakVar, boolean z10) {
            Intrinsics.checkNotNullParameter(aakVar, "");
            this.f52175s0 = aakVar;
            this.setX = z10;
            this.f52173q0 = new abx();
        }

        public static /* synthetic */ void a(Object[] objArr) throws InterruptedException, NoSuchAlgorithmException, IOException {
            setY sety = (setY) objArr[0];
            aak aakVar = sety.f52175s0;
            if (yt.setOnFocusChangeListener && Thread.holdsLock(aakVar)) {
                StringBuilder sb2 = new StringBuilder("Thread ");
                sb2.append((Object) Thread.currentThread().getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(aakVar);
                throw new AssertionError(sb2.toString());
            }
            aak aakVar2 = sety.f52175s0;
            synchronized (aakVar2) {
                aak.setOnFocusChangeListener(new Object[]{aakVar2}, -1848937745, 1848937757, System.identityHashCode(aakVar2));
                Unit unit = Unit.INSTANCE;
            }
            while (true) {
                abx abxVar = sety.f52173q0;
                if (((Long) abx.setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() <= 0) {
                    return;
                }
                setX(new Object[]{sety, Boolean.FALSE}, -1273433141, 1273433141, System.identityHashCode(sety));
                aak aakVar3 = sety.f52175s0;
                aah aahVar = (aah) aak.setOnFocusChangeListener(new Object[]{aakVar3}, 1720650987, -1720650970, System.identityHashCode(aakVar3));
                aah.setX(new Object[]{aahVar}, 1706538080, -1706538032, System.identityHashCode(aahVar));
            }
        }

        public static /* synthetic */ void b(Object[] objArr) throws InterruptedException, NoSuchAlgorithmException, IOException {
            setY sety = (setY) objArr[0];
            aak aakVar = sety.f52175s0;
            if (yt.setOnFocusChangeListener && Thread.holdsLock(aakVar)) {
                StringBuilder sb2 = new StringBuilder("Thread ");
                sb2.append((Object) Thread.currentThread().getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(aakVar);
                throw new AssertionError(sb2.toString());
            }
            aak aakVar2 = sety.f52175s0;
            synchronized (aakVar2) {
                if (((Boolean) setX(new Object[]{sety}, -1677107848, 1677107850, System.identityHashCode(sety))).booleanValue()) {
                    return;
                }
                boolean z10 = aakVar2.setAlwaysDrawnWithCacheEnabled() == null;
                Unit unit = Unit.INSTANCE;
                aak aakVar3 = sety.f52175s0;
                if (!((setY) aak.setOnFocusChangeListener(new Object[]{aakVar3}, -198801307, 198801311, System.identityHashCode(aakVar3))).setX) {
                    abx abxVar = sety.f52173q0;
                    if (((Long) abx.setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() > 0) {
                        while (true) {
                            abx abxVar2 = sety.f52173q0;
                            if (((Long) abx.setOnFocusChangeListener(new Object[]{abxVar2}, 1395393434, -1395393402, System.identityHashCode(abxVar2))).longValue() <= 0) {
                                break;
                            } else {
                                setX(new Object[]{sety, Boolean.TRUE}, -1273433141, 1273433141, System.identityHashCode(sety));
                            }
                        }
                    } else if (z10) {
                        aak aakVar4 = sety.f52175s0;
                        aah aahVar = (aah) aak.setOnFocusChangeListener(new Object[]{aakVar4}, 1720650987, -1720650970, System.identityHashCode(aakVar4));
                        aak aakVar5 = sety.f52175s0;
                        int iIntValue = ((Integer) aak.setOnFocusChangeListener(new Object[]{aakVar5}, 2012833449, -2012833441, System.identityHashCode(aakVar5))).intValue();
                        aah.setX(new Object[]{aahVar, Integer.valueOf(iIntValue), Boolean.TRUE, null, 0L}, 1454261949, -1454261916, iIntValue);
                    }
                }
                synchronized (sety.f52175s0) {
                    setX(new Object[]{sety}, 227210999, -227210998, System.identityHashCode(sety));
                    Unit unit2 = Unit.INSTANCE;
                }
                aak aakVar6 = sety.f52175s0;
                aah aahVar2 = (aah) aak.setOnFocusChangeListener(new Object[]{aakVar6}, 1720650987, -1720650970, System.identityHashCode(aakVar6));
                aah.setX(new Object[]{aahVar2}, 1706538080, -1706538032, System.identityHashCode(aahVar2));
                aak aakVar7 = sety.f52175s0;
                aak.setOnFocusChangeListener(new Object[]{aakVar7}, 1817193165, -1817193143, System.identityHashCode(aakVar7));
            }
        }

        /* JADX WARN: Code duplicated, block: B:27:0x01b9  */
        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws InterruptedException, NoSuchAlgorithmException, IOException {
            long jMin;
            boolean z10;
            int i13 = ~((~i10) | i11);
            int i14 = ~i12;
            int i15 = (((~(i14 | i11)) | i13) * (-1188)) + (i11 * (-1187)) + (i10 * 595);
            int i16 = ~i11;
            int i17 = (~(i12 | i16)) | i13;
            int i18 = ~(i14 | i10);
            switch ((((~(i10 | i16)) | (~(i16 | i14)) | i18) * 594) + ((i17 | i18) * 594) + i15) {
                case 1:
                    setY sety = (setY) objArr[0];
                    int i19 = f52170t0;
                    int i20 = ((i19 | 96) << 1) - (i19 ^ 96);
                    int i21 = (i20 ^ (-1)) + (i20 << 1);
                    int i22 = i21 % 128;
                    f52171u0 = i22;
                    int i23 = i21 % 2;
                    sety.setY = true;
                    int i24 = i22 & 57;
                    int i25 = -(-((i22 ^ 57) | i24));
                    int i26 = (i24 & i25) + (i24 | i25);
                    f52170t0 = i26 % 128;
                    if (i26 % 2 != 0) {
                        throw null;
                    }
                    return null;
                case 2:
                    setY sety2 = (setY) objArr[0];
                    int i27 = f52171u0;
                    int i28 = ((i27 & 94) + (i27 | 94)) - 1;
                    f52170t0 = i28 % 128;
                    if (i28 % 2 != 0) {
                        boolean z11 = sety2.setY;
                        throw null;
                    }
                    boolean z12 = sety2.setY;
                    int i29 = i27 & 89;
                    int i30 = i27 | 89;
                    int i31 = (i29 & i30) + (i30 | i29);
                    f52170t0 = i31 % 128;
                    if (i31 % 2 == 0) {
                        return Boolean.valueOf(z12);
                    }
                    throw null;
                case 3:
                    setY sety3 = (setY) objArr[0];
                    int i32 = f52170t0;
                    int i33 = (((i32 & (-126)) | ((~i32) & 125)) - (~(-(-((i32 & 125) << 1))))) - 1;
                    f52171u0 = i33 % 128;
                    int i34 = i33 % 2;
                    boolean z13 = sety3.setX;
                    if (i34 == 0) {
                        int i35 = 82 / 0;
                    }
                    int i36 = i32 & 83;
                    int i37 = ((i32 ^ 83) | i36) << 1;
                    int i38 = -((i32 | 83) & (~i36));
                    int i39 = (i37 & i38) + (i38 | i37);
                    f52171u0 = i39 % 128;
                    if (i39 % 2 != 0) {
                        return Boolean.valueOf(z13);
                    }
                    throw null;
                case 4:
                    b(objArr);
                    return null;
                case 5:
                    setY sety4 = (setY) objArr[0];
                    abx abxVar = (abx) objArr[1];
                    long jLongValue = ((Number) objArr[2]).longValue();
                    int i40 = f52170t0;
                    int i41 = (i40 | 101) << 1;
                    int i42 = -(((~i40) & 101) | (i40 & (-102)));
                    int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                    f52171u0 = i43 % 128;
                    int i44 = i43 % 2;
                    Intrinsics.checkNotNullParameter(abxVar, "");
                    aak aakVar = sety4.f52175s0;
                    if (!(!yt.setOnFocusChangeListener)) {
                        int i45 = f52170t0;
                        int i46 = ((i45 ^ 41) | (i45 & 41)) << 1;
                        int i47 = -(((~i45) & 41) | (i45 & (-42)));
                        int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
                        f52171u0 = i48 % 128;
                        if (i48 % 2 == 0) {
                            Thread.holdsLock(aakVar);
                            throw null;
                        }
                        if (Thread.holdsLock(aakVar)) {
                            StringBuilder sb2 = new StringBuilder("Thread ");
                            sb2.append((Object) Thread.currentThread().getName());
                            sb2.append(" MUST NOT hold lock on ");
                            sb2.append(aakVar);
                            throw new AssertionError(sb2.toString());
                        }
                    }
                    abx abxVar2 = sety4.f52173q0;
                    abx.setOnFocusChangeListener(new Object[]{abxVar2, abxVar, Long.valueOf(jLongValue)}, -2065855263, 2065855285, System.identityHashCode(abxVar2));
                    int i49 = f52170t0 + 19;
                    while (true) {
                        f52171u0 = i49 % 128;
                        int i50 = i49 % 2;
                        if (((Long) abx.setOnFocusChangeListener(new Object[]{abxVar2}, 1395393434, -1395393402, System.identityHashCode(abxVar2))).longValue() < 16384) {
                            int i51 = f52171u0;
                            int i52 = ((i51 ^ 83) | (i51 & 83)) << 1;
                            int i53 = -(((~i51) & 83) | (i51 & (-84)));
                            int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
                            f52170t0 = i54 % 128;
                            if (i54 % 2 != 0) {
                                throw null;
                            }
                            return null;
                        }
                        int i55 = f52170t0;
                        int i56 = (((i55 & (-124)) | ((~i55) & 123)) - (~(-(-((i55 & 123) << 1))))) - 1;
                        f52171u0 = i56 % 128;
                        int i57 = i56 % 2;
                        setX(new Object[]{sety4, Boolean.FALSE}, -1273433141, 1273433141, System.identityHashCode(sety4));
                        int i58 = f52170t0;
                        i49 = (-2) - (((i58 & 124) + (i58 | 124)) ^ (-1));
                    }
                    break;
                case 6:
                    a(objArr);
                    return null;
                case 7:
                    setY sety5 = (setY) objArr[0];
                    int i59 = f52170t0;
                    int i60 = i59 & 21;
                    int i61 = (i59 ^ 21) | i60;
                    int i62 = (i60 & i61) + (i61 | i60);
                    f52171u0 = i62 % 128;
                    int i63 = i62 % 2;
                    aak aakVar2 = sety5.f52175s0;
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) aak.setOnFocusChangeListener(new Object[]{aakVar2}, 1659916810, -1659916797, System.identityHashCode(aakVar2));
                    int i64 = f52171u0;
                    int i65 = i64 & 31;
                    int i66 = i65 + ((i64 ^ 31) | i65);
                    f52170t0 = i66 % 128;
                    int i67 = i66 % 2;
                    return setcompounddrawabletintblendmode;
                default:
                    setY sety6 = (setY) objArr[0];
                    boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                    aak aakVar3 = sety6.f52175s0;
                    synchronized (aakVar3) {
                        try {
                            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = (setCompoundDrawableTintBlendMode) aak.setOnFocusChangeListener(new Object[]{aakVar3}, 1659916810, -1659916797, System.identityHashCode(aakVar3));
                            abp.setY(new Object[]{setcompounddrawabletintblendmode2}, -1179150768, 1179150769, System.identityHashCode(setcompounddrawabletintblendmode2));
                            while (((Long) aak.setOnFocusChangeListener(new Object[]{aakVar3}, 269929162, -269929144, System.identityHashCode(aakVar3))).longValue() >= ((Long) aak.setOnFocusChangeListener(new Object[]{aakVar3}, -910961715, 910961735, System.identityHashCode(aakVar3))).longValue() && !((Boolean) setX(new Object[]{sety6}, -1882865611, 1882865614, System.identityHashCode(sety6))).booleanValue() && !((Boolean) setX(new Object[]{sety6}, -1677107848, 1677107850, System.identityHashCode(sety6))).booleanValue() && aakVar3.setAlwaysDrawnWithCacheEnabled() == null) {
                                try {
                                    aak.setOnFocusChangeListener(new Object[]{aakVar3}, 1097831599, -1097831583, System.identityHashCode(aakVar3));
                                } catch (Throwable th2) {
                                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = (setCompoundDrawableTintBlendMode) aak.setOnFocusChangeListener(new Object[]{aakVar3}, 1659916810, -1659916797, System.identityHashCode(aakVar3));
                                    setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{setcompounddrawabletintblendmode3}, 1024790889, -1024790889, System.identityHashCode(setcompounddrawabletintblendmode3));
                                    throw th2;
                                }
                            }
                            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode4 = (setCompoundDrawableTintBlendMode) aak.setOnFocusChangeListener(new Object[]{aakVar3}, 1659916810, -1659916797, System.identityHashCode(aakVar3));
                            setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{setcompounddrawabletintblendmode4}, 1024790889, -1024790889, System.identityHashCode(setcompounddrawabletintblendmode4));
                            aak.setOnFocusChangeListener(new Object[]{aakVar3}, -1848937745, 1848937757, System.identityHashCode(aakVar3));
                            long jLongValue2 = ((Long) aak.setOnFocusChangeListener(new Object[]{aakVar3}, -910961715, 910961735, System.identityHashCode(aakVar3))).longValue() - ((Long) aak.setOnFocusChangeListener(new Object[]{aakVar3}, 269929162, -269929144, System.identityHashCode(aakVar3))).longValue();
                            abx abxVar3 = sety6.f52173q0;
                            jMin = Math.min(jLongValue2, ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar3}, 1395393434, -1395393402, System.identityHashCode(abxVar3))).longValue());
                            aak.setOnFocusChangeListener(new Object[]{aakVar3, Long.valueOf(((Long) aak.setOnFocusChangeListener(new Object[]{aakVar3}, 269929162, -269929144, System.identityHashCode(aakVar3))).longValue() + jMin)}, 1940197349, -1940197323, System.identityHashCode(aakVar3));
                            if (zBooleanValue) {
                                abx abxVar4 = sety6.f52173q0;
                                if (jMin == ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar4}, 1395393434, -1395393402, System.identityHashCode(abxVar4))).longValue()) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            } else {
                                z10 = false;
                            }
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    aak aakVar4 = sety6.f52175s0;
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode5 = (setCompoundDrawableTintBlendMode) aak.setOnFocusChangeListener(new Object[]{aakVar4}, 1659916810, -1659916797, System.identityHashCode(aakVar4));
                    abp.setY(new Object[]{setcompounddrawabletintblendmode5}, -1179150768, 1179150769, System.identityHashCode(setcompounddrawabletintblendmode5));
                    try {
                        aak aakVar5 = sety6.f52175s0;
                        aah aahVar = (aah) aak.setOnFocusChangeListener(new Object[]{aakVar5}, 1720650987, -1720650970, System.identityHashCode(aakVar5));
                        aak aakVar6 = sety6.f52175s0;
                        int iIntValue = ((Integer) aak.setOnFocusChangeListener(new Object[]{aakVar6}, 2012833449, -2012833441, System.identityHashCode(aakVar6))).intValue();
                        aah.setX(new Object[]{aahVar, Integer.valueOf(iIntValue), Boolean.valueOf(z10), sety6.f52173q0, Long.valueOf(jMin)}, 1454261949, -1454261916, iIntValue);
                        aak aakVar7 = sety6.f52175s0;
                        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode6 = (setCompoundDrawableTintBlendMode) aak.setOnFocusChangeListener(new Object[]{aakVar7}, 1659916810, -1659916797, System.identityHashCode(aakVar7));
                        setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{setcompounddrawabletintblendmode6}, 1024790889, -1024790889, System.identityHashCode(setcompounddrawabletintblendmode6));
                        return null;
                    } catch (Throwable th4) {
                        aak aakVar8 = sety6.f52175s0;
                        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode7 = (setCompoundDrawableTintBlendMode) aak.setOnFocusChangeListener(new Object[]{aakVar8}, 1659916810, -1659916797, System.identityHashCode(aakVar8));
                        setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{setcompounddrawabletintblendmode7}, 1024790889, -1024790889, System.identityHashCode(setcompounddrawabletintblendmode7));
                        throw th4;
                    }
            }
        }

        @Override // com.mypinpad.tsdk.isolation.aco, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws InterruptedException, NoSuchAlgorithmException, IOException {
            setX(new Object[]{this}, -307456318, 307456322, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.aco, java.io.Flushable
        public final void flush() throws InterruptedException, NoSuchAlgorithmException, IOException {
            setX(new Object[]{this}, -1055779919, 1055779925, System.identityHashCode(this));
        }

        @JvmName(name = "setCompoundDrawableTintBlendMode")
        public final boolean setCompoundDrawableTintBlendMode() {
            return ((Boolean) setX(new Object[]{this}, -1677107848, 1677107850, System.identityHashCode(this))).booleanValue();
        }

        @Override // com.mypinpad.tsdk.isolation.aco
        public final void setDividerPadding(@NotNull abx p4, long p10) throws InterruptedException, NoSuchAlgorithmException, IOException {
            setX(new Object[]{this, p4, Long.valueOf(p10)}, -525767160, 525767165, System.identityHashCode(this));
        }

        @JvmName(name = "setOnFocusChangeListener")
        public final boolean setOnFocusChangeListener() {
            return ((Boolean) setX(new Object[]{this}, -1882865611, 1882865614, System.identityHashCode(this))).booleanValue();
        }

        @Override // com.mypinpad.tsdk.isolation.aco
        @NotNull
        public final acq setY() {
            return (acq) setX(new Object[]{this}, 1928552927, -1928552920, System.identityHashCode(this));
        }
    }

    static {
        int i10 = f52146p;
        int i11 = ((((i10 ^ 101) | (i10 & 101)) << 1) - (~(-(((~i10) & 101) | (i10 & (-102)))))) - 1;
        f52145o = i11 % 128;
        int i12 = i11 % 2;
    }

    public aak(int i10, @NotNull aah aahVar, boolean z10, boolean z11, @Nullable ye yeVar) {
        Intrinsics.checkNotNullParameter(aahVar, "");
        this.setOnLongClickListener = i10;
        this.setCompoundDrawableTintBlendMode = aahVar;
        aam aamVar = (aam) aah.setX(new Object[]{aahVar}, -2003530648, 2003530669, System.identityHashCode(aahVar));
        this.setIncludeFontPadding = ((Integer) aam.setOnFocusChangeListener(new Object[]{aamVar}, -1082853585, 1082853592, System.identityHashCode(aamVar))).intValue();
        ArrayDeque<ye> arrayDeque = new ArrayDeque<>();
        this.f52153g = arrayDeque;
        aam layoutAnimation = aahVar.setLayoutAnimation();
        this.setTextAlignment = new setDividerPadding(this, ((Integer) aam.setOnFocusChangeListener(new Object[]{layoutAnimation}, -1082853585, 1082853592, System.identityHashCode(layoutAnimation))).intValue(), z11);
        this.setZ = new setY(this, z10);
        this.setAlwaysDrawnWithCacheEnabled = new setCompoundDrawableTintBlendMode(this);
        this.setOnEditorActionListener = new setCompoundDrawableTintBlendMode(this);
        if (yeVar == null) {
            if (!((Boolean) setOnFocusChangeListener(new Object[]{this}, 348660389, -348660362, System.identityHashCode(this))).booleanValue()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(true ^ ((Boolean) setOnFocusChangeListener(new Object[]{this}, 348660389, -348660362, System.identityHashCode(this))).booleanValue())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(yeVar);
        }
    }

    public static /* synthetic */ setY a(Object[] objArr) {
        aak aakVar = (aak) objArr[0];
        synchronized (aakVar) {
            try {
                if (!aakVar.f52154h && !((Boolean) setOnFocusChangeListener(new Object[]{aakVar}, 348660389, -348660362, System.identityHashCode(aakVar))).booleanValue()) {
                    throw new IllegalStateException("reply before requesting the sink".toString());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aakVar.setZ;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00e7  */
    public static /* synthetic */ void b(Object[] objArr) {
        boolean z10;
        boolean textAlignment;
        aak aakVar = (aak) objArr[0];
        if (yt.setOnFocusChangeListener && Thread.holdsLock(aakVar)) {
            StringBuilder sb2 = new StringBuilder("Thread ");
            sb2.append((Object) Thread.currentThread().getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(aakVar);
            throw new AssertionError(sb2.toString());
        }
        synchronized (aakVar) {
            try {
                setDividerPadding setdividerpadding = (setDividerPadding) setOnFocusChangeListener(new Object[]{aakVar}, 334486782, -334486771, System.identityHashCode(aakVar));
                if (((Boolean) setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding}, 1875229206, -1875229198, System.identityHashCode(setdividerpadding))).booleanValue()) {
                    z10 = false;
                } else {
                    setDividerPadding setdividerpadding2 = (setDividerPadding) setOnFocusChangeListener(new Object[]{aakVar}, 334486782, -334486771, System.identityHashCode(aakVar));
                    if (((Boolean) setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding2}, -1629488671, 1629488671, System.identityHashCode(setdividerpadding2))).booleanValue()) {
                        setY sety = (setY) setOnFocusChangeListener(new Object[]{aakVar}, -198801307, 198801311, System.identityHashCode(aakVar));
                        if (!((Boolean) setY.setX(new Object[]{sety}, -1882865611, 1882865614, System.identityHashCode(sety))).booleanValue()) {
                            setY sety2 = (setY) setOnFocusChangeListener(new Object[]{aakVar}, -198801307, 198801311, System.identityHashCode(aakVar));
                            if (!((Boolean) setY.setX(new Object[]{sety2}, -1677107848, 1677107850, System.identityHashCode(sety2))).booleanValue()) {
                                z10 = false;
                            }
                        }
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                textAlignment = aakVar.setTextAlignment();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            setOnFocusChangeListener(new Object[]{aakVar, aac.CANCEL, null}, 1944285140, -1944285130, System.identityHashCode(aakVar));
        } else {
            if (textAlignment) {
                return;
            }
            aakVar.setCompoundDrawableTintBlendMode.setDividerPadding(aakVar.setOnLongClickListener);
        }
    }

    public static /* synthetic */ Boolean c(Object[] objArr) {
        aak aakVar = (aak) objArr[0];
        aac aacVar = (aac) objArr[1];
        IOException iOException = (IOException) objArr[2];
        if (yt.setOnFocusChangeListener && Thread.holdsLock(aakVar)) {
            StringBuilder sb2 = new StringBuilder("Thread ");
            sb2.append((Object) Thread.currentThread().getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(aakVar);
            throw new AssertionError(sb2.toString());
        }
        synchronized (aakVar) {
            if (aakVar.setAlwaysDrawnWithCacheEnabled() != null) {
                return Boolean.FALSE;
            }
            setDividerPadding setdividerpadding = (setDividerPadding) setOnFocusChangeListener(new Object[]{aakVar}, 334486782, -334486771, System.identityHashCode(aakVar));
            if (((Boolean) setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding}, 1875229206, -1875229198, System.identityHashCode(setdividerpadding))).booleanValue()) {
                setY sety = (setY) setOnFocusChangeListener(new Object[]{aakVar}, -198801307, 198801311, System.identityHashCode(aakVar));
                if (((Boolean) setY.setX(new Object[]{sety}, -1882865611, 1882865614, System.identityHashCode(sety))).booleanValue()) {
                    return Boolean.FALSE;
                }
            }
            setOnFocusChangeListener(new Object[]{aakVar, aacVar}, -1828481441, 1828481455, System.identityHashCode(aakVar));
            setOnFocusChangeListener(new Object[]{aakVar, iOException}, 1691568695, -1691568672, System.identityHashCode(aakVar));
            aakVar.notifyAll();
            Unit unit = Unit.INSTANCE;
            aakVar.setCompoundDrawableTintBlendMode.setDividerPadding(aakVar.setOnLongClickListener);
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0441  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        long j10;
        long j11;
        boolean textAlignment;
        boolean z10;
        int i13 = ((~(i10 | i11 | i12)) * (-301)) + (i11 * 302) + (i10 * (-300));
        int i14 = ~i11;
        switch ((((~((~i10) | i12)) | i14) * 301) + (((~(i14 | i12)) | (~((~i12) | i10))) * (-301)) + i13) {
            case 1:
                return c(objArr);
            case 2:
                aak aakVar = (aak) objArr[0];
                int i15 = f52145o;
                int i16 = i15 + 93;
                f52146p = i16 % 128;
                if (i16 % 2 == 0) {
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = aakVar.setAlwaysDrawnWithCacheEnabled;
                    throw null;
                }
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = aakVar.setAlwaysDrawnWithCacheEnabled;
                int i17 = i15 & 95;
                int i18 = (i15 ^ 95) | i17;
                int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                f52146p = i19 % 128;
                if (i19 % 2 != 0) {
                    return setcompounddrawabletintblendmode2;
                }
                int i20 = 6 / 0;
                return setcompounddrawabletintblendmode2;
            case 3:
                aak aakVar2 = (aak) objArr[0];
                long jLongValue = ((Number) objArr[1]).longValue();
                int i21 = f52146p;
                int i22 = (i21 ^ 97) + ((i21 & 97) << 1);
                int i23 = i22 % 128;
                f52145o = i23;
                int i24 = i22 % 2;
                aakVar2.setNavigationOnClickListener = jLongValue;
                int i25 = i23 & 27;
                int i26 = ((i23 ^ 27) | i25) << 1;
                int i27 = -((i23 | 27) & (~i25));
                int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                f52146p = i28 % 128;
                if (i28 % 2 != 0) {
                    return null;
                }
                throw null;
            case 4:
                aak aakVar3 = (aak) objArr[0];
                int i29 = f52145o;
                int i30 = i29 & 67;
                int i31 = (i29 ^ 67) | i30;
                int i32 = (i30 & i31) + (i31 | i30);
                int i33 = i32 % 128;
                f52146p = i33;
                int i34 = i32 % 2;
                obj = aakVar3.setZ;
                int i35 = (-2) - ((((i33 | 86) << 1) - (i33 ^ 86)) ^ (-1));
                f52145o = i35 % 128;
                if (i35 % 2 != 0) {
                    throw null;
                }
                break;
            case 5:
                aak aakVar4 = (aak) objArr[0];
                int i36 = f52145o;
                int i37 = i36 & 11;
                int i38 = (i37 - (~(-(-((i36 ^ 11) | i37))))) - 1;
                int i39 = i38 % 128;
                f52146p = i39;
                int i40 = i38 % 2;
                long j12 = aakVar4.setNavigationOnClickListener;
                int i41 = (i39 & (-74)) | ((~i39) & 73);
                int i42 = (i39 & 73) << 1;
                int i43 = (i41 ^ i42) + ((i41 & i42) << 1);
                f52145o = i43 % 128;
                if (i43 % 2 == 0) {
                    return Long.valueOf(j12);
                }
                throw null;
            case 6:
                return a(objArr);
            case 7:
                aak aakVar5 = (aak) objArr[0];
                int i44 = f52146p;
                int i45 = i44 & 21;
                int i46 = ((i44 | 21) & (~i45)) + (i45 << 1);
                int i47 = i46 % 128;
                f52145o = i47;
                int i48 = i46 % 2;
                obj = aakVar5.setOnEditorActionListener;
                if (i48 != 0) {
                    throw null;
                }
                int i49 = (i47 ^ 103) + ((i47 & 103) << 1);
                f52146p = i49 % 128;
                if (i49 % 2 == 0) {
                    throw null;
                }
                break;
            case 8:
                aak aakVar6 = (aak) objArr[0];
                int i50 = f52146p;
                int i51 = (i50 & 14) + (i50 | 14);
                int i52 = (i51 ^ (-1)) + (i51 << 1);
                f52145o = i52 % 128;
                int i53 = i52 % 2;
                int i54 = aakVar6.setOnLongClickListener;
                if (i53 != 0) {
                    int i55 = 43 / 0;
                }
                return Integer.valueOf(i54);
            case 9:
                aak aakVar7 = (aak) objArr[0];
                int i56 = f52145o;
                int i57 = i56 & 5;
                int i58 = ((i56 | 5) & (~i57)) + (i57 << 1);
                f52146p = i58 % 128;
                int i59 = i58 % 2;
                obj = aakVar7.setAlwaysDrawnWithCacheEnabled;
                if (i59 == 0) {
                    int i60 = 78 / 0;
                }
                break;
            case 10:
                aak aakVar8 = (aak) objArr[0];
                aac aacVar = (aac) objArr[1];
                IOException iOException = (IOException) objArr[2];
                int i61 = f52145o;
                int i62 = ((i61 | 108) << 1) - (i61 ^ 108);
                int i63 = (i62 ^ (-1)) + (i62 << 1);
                f52146p = i63 % 128;
                int i64 = i63 % 2;
                Intrinsics.checkNotNullParameter(aacVar, "");
                if (!((Boolean) setOnFocusChangeListener(new Object[]{aakVar8, aacVar, iOException}, -71301485, 71301486, System.identityHashCode(aakVar8))).booleanValue()) {
                    int i65 = f52145o;
                    int i66 = (i65 & (-54)) | ((~i65) & 53);
                    int i67 = (i65 & 53) << 1;
                    int i68 = ((i66 | i67) << 1) - (i67 ^ i66);
                    f52146p = i68 % 128;
                    int i69 = i68 % 2;
                    return null;
                }
                int i70 = aakVar8.setOnLongClickListener;
                aah.setX(new Object[]{aakVar8.setCompoundDrawableTintBlendMode, Integer.valueOf(i70), aacVar}, -1687800830, 1687800858, i70);
                int i71 = f52145o;
                int i72 = (i71 | 103) << 1;
                int i73 = -(i71 ^ 103);
                int i74 = (i72 & i73) + (i73 | i72);
                f52146p = i74 % 128;
                if (i74 % 2 != 0) {
                    return null;
                }
                throw null;
            case 11:
                aak aakVar9 = (aak) objArr[0];
                int i75 = f52145o;
                int i76 = i75 & 79;
                int i77 = i76 + ((i75 ^ 79) | i76);
                f52146p = i77 % 128;
                int i78 = i77 % 2;
                obj = aakVar9.setTextAlignment;
                if (i78 == 0) {
                    int i79 = 50 / 0;
                }
                break;
            case 12:
                aak aakVar10 = (aak) objArr[0];
                int i80 = f52145o;
                int i81 = (i80 & 5) + (i80 | 5);
                f52146p = i81 % 128;
                if (i81 % 2 == 0) {
                    setY sety = aakVar10.setZ;
                    ((Boolean) setY.setX(new Object[]{sety}, -1677107848, 1677107850, System.identityHashCode(sety))).booleanValue();
                    throw null;
                }
                setY sety2 = aakVar10.setZ;
                if (((Boolean) setY.setX(new Object[]{sety2}, -1677107848, 1677107850, System.identityHashCode(sety2))).booleanValue()) {
                    throw new IOException("stream closed");
                }
                setY sety3 = aakVar10.setZ;
                if (((Boolean) setY.setX(new Object[]{sety3}, -1882865611, 1882865614, System.identityHashCode(sety3))).booleanValue()) {
                    throw new IOException("stream finished");
                }
                if (aakVar10.setY == null) {
                    int i82 = f52145o;
                    int i83 = i82 & 13;
                    int i84 = -(-((i82 ^ 13) | i83));
                    int i85 = (i83 ^ i84) + ((i84 & i83) << 1);
                    f52146p = i85 % 128;
                    int i86 = i85 % 2;
                    return null;
                }
                int i87 = f52145o;
                int i88 = (i87 ^ 55) + ((i87 & 55) << 1);
                f52146p = i88 % 128;
                int i89 = i88 % 2;
                IOException iOException2 = aakVar10.setX;
                if (iOException2 != null) {
                    throw iOException2;
                }
                aac aacVar2 = aakVar10.setY;
                Intrinsics.checkNotNull(aacVar2);
                aap aapVar = new aap(aacVar2);
                int i90 = f52145o;
                int i91 = i90 ^ 33;
                int i92 = ((i90 & 33) | i91) << 1;
                int i93 = -i91;
                int i94 = ((i92 | i93) << 1) - (i92 ^ i93);
                f52146p = i94 % 128;
                int i95 = i94 % 2;
                throw aapVar;
            case 13:
                aak aakVar11 = (aak) objArr[0];
                int i96 = f52146p + 55;
                f52145o = i96 % 128;
                int i97 = i96 % 2;
                obj = aakVar11.setOnEditorActionListener;
                if (i97 != 0) {
                    int i98 = 59 / 0;
                }
                break;
            case 14:
                aak aakVar12 = (aak) objArr[0];
                aac aacVar3 = (aac) objArr[1];
                int i99 = f52145o + 19;
                f52146p = i99 % 128;
                int i100 = i99 % 2;
                aakVar12.setY = aacVar3;
                if (i100 != 0) {
                    return null;
                }
                throw null;
            case 15:
                aak aakVar13 = (aak) objArr[0];
                long jLongValue2 = ((Number) objArr[1]).longValue();
                int i101 = f52145o;
                int i102 = ((i101 | 121) << 1) - (i101 ^ 121);
                f52146p = i102 % 128;
                if (i102 % 2 == 0) {
                    aakVar13.setIncludeFontPadding *= jLongValue2;
                    if (jLongValue2 > 0) {
                        aakVar13.notifyAll();
                        int i103 = f52145o;
                        int i104 = i103 & 27;
                        int i105 = ((i103 ^ 27) | i104) << 1;
                        int i106 = -((i103 | 27) & (~i104));
                        int i107 = ((i105 | i106) << 1) - (i106 ^ i105);
                        f52146p = i107 % 128;
                        int i108 = i107 % 2;
                    }
                } else {
                    aakVar13.setIncludeFontPadding += jLongValue2;
                    if (jLongValue2 > 0) {
                        aakVar13.notifyAll();
                        int i109 = f52145o;
                        int i1010 = i109 & 27;
                        int i1011 = ((i109 ^ 27) | i1010) << 1;
                        int i1012 = -((i109 | 27) & (~i1010));
                        int i1013 = ((i1011 | i1012) << 1) - (i1012 ^ i1011);
                        f52146p = i1013 % 128;
                        int i1014 = i1013 % 2;
                    }
                }
                int i110 = f52146p;
                int i111 = (((i110 & (-48)) | ((~i110) & 47)) - (~(-(-((i110 & 47) << 1))))) - 1;
                f52145o = i111 % 128;
                int i112 = i111 % 2;
                return null;
            case 16:
                aak aakVar14 = (aak) objArr[0];
                int i113 = f52145o;
                int i114 = i113 & 83;
                int i115 = -(-(i113 | 83));
                int i116 = (i114 & i115) + (i115 | i114);
                f52146p = i116 % 128;
                try {
                    if (i116 % 2 != 0) {
                        aakVar14.wait();
                        return null;
                    }
                    aakVar14.wait();
                    throw null;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            case 17:
                aak aakVar15 = (aak) objArr[0];
                int i117 = f52146p;
                int i118 = (((i117 | 124) << 1) - (i117 ^ 124)) - 1;
                f52145o = i118 % 128;
                int i119 = i118 % 2;
                obj = aakVar15.setCompoundDrawableTintBlendMode;
                if (i119 != 0) {
                    int i120 = 93 / 0;
                }
                int i121 = (((i117 | 68) << 1) - (i117 ^ 68)) - 1;
                f52145o = i121 % 128;
                if (i121 % 2 != 0) {
                    throw null;
                }
                break;
            case 18:
                aak aakVar16 = (aak) objArr[0];
                int i122 = f52145o;
                int i123 = (i122 & 50) + (i122 | 50);
                int i124 = (i123 ^ (-1)) + (i123 << 1);
                int i125 = i124 % 128;
                f52146p = i125;
                if (i124 % 2 == 0) {
                    j10 = aakVar16.UiMessageCallbackKtWhenMappings;
                    int i126 = 89 / 0;
                } else {
                    j10 = aakVar16.UiMessageCallbackKtWhenMappings;
                }
                int i127 = i125 + 94;
                int i128 = (i127 ^ (-1)) + (i127 << 1);
                f52145o = i128 % 128;
                int i129 = i128 % 2;
                return Long.valueOf(j10);
            case 19:
                aak aakVar17 = (aak) objArr[0];
                int i130 = f52146p;
                int i131 = (i130 & 71) + (i130 | 71);
                int i132 = i131 % 128;
                f52145o = i132;
                int i133 = i131 % 2;
                long j13 = aakVar17.getNavBarTitleString;
                int i134 = (((i132 | 50) << 1) - (i132 ^ 50)) - 1;
                f52146p = i134 % 128;
                int i135 = i134 % 2;
                return Long.valueOf(j13);
            case 20:
                aak aakVar18 = (aak) objArr[0];
                int i136 = f52145o + 43;
                f52146p = i136 % 128;
                if (i136 % 2 == 0) {
                    j11 = aakVar18.setIncludeFontPadding;
                    int i137 = 71 / 0;
                } else {
                    j11 = aakVar18.setIncludeFontPadding;
                }
                return Long.valueOf(j11);
            case 21:
                aak aakVar19 = (aak) objArr[0];
                int i138 = f52145o;
                int i139 = i138 ^ 13;
                int i140 = ((i138 & 13) | i139) << 1;
                int i141 = -i139;
                int i142 = ((i140 | i141) << 1) - (i140 ^ i141);
                int i143 = i142 % 128;
                f52146p = i143;
                int i144 = i142 % 2;
                IOException iOException3 = aakVar19.setX;
                int i145 = i143 & 9;
                int i146 = (i143 | 9) & (~i145);
                int i147 = -(-(i145 << 1));
                int i148 = (i146 & i147) + (i147 | i146);
                f52145o = i148 % 128;
                int i149 = i148 % 2;
                return iOException3;
            case 22:
                b(objArr);
                return null;
            case 23:
                aak aakVar20 = (aak) objArr[0];
                IOException iOException4 = (IOException) objArr[1];
                int i150 = f52145o;
                int i151 = i150 & 13;
                int i152 = (((i150 ^ 13) | i151) << 1) - ((~i151) & (i150 | 13));
                f52146p = i152 % 128;
                int i153 = i152 % 2;
                aakVar20.setX = iOException4;
                int i154 = (i150 & 107) + (i150 | 107);
                f52146p = i154 % 128;
                int i155 = i154 % 2;
                return null;
            case 24:
                aak aakVar21 = (aak) objArr[0];
                aby abyVar = (aby) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i156 = f52145o;
                int i157 = (i156 & 96) + (i156 | 96);
                int i158 = (i157 ^ (-1)) + (i157 << 1);
                f52146p = i158 % 128;
                if (i158 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(abyVar, "");
                    byte[] bArr = yt.setX;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(abyVar, "");
                if (yt.setOnFocusChangeListener) {
                    int i159 = f52146p;
                    int i160 = i159 & 17;
                    int i161 = ((i159 ^ 17) | i160) << 1;
                    int i162 = -((i159 | 17) & (~i160));
                    int i163 = (i161 & i162) + (i162 | i161);
                    f52145o = i163 % 128;
                    int i164 = i163 % 2;
                    if (Thread.holdsLock(aakVar21)) {
                        StringBuilder sb2 = new StringBuilder("Thread ");
                        sb2.append((Object) Thread.currentThread().getName());
                        sb2.append(" MUST NOT hold lock on ");
                        sb2.append(aakVar21);
                        throw new AssertionError(sb2.toString());
                    }
                }
                setDividerPadding setdividerpadding = aakVar21.setTextAlignment;
                setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding, abyVar, Long.valueOf(iIntValue)}, 1426624520, -1426624510, System.identityHashCode(setdividerpadding));
                int i165 = f52146p;
                int i166 = ((i165 ^ 49) | (i165 & 49)) << 1;
                int i167 = -(((~i165) & 49) | (i165 & (-50)));
                int i168 = ((i166 | i167) << 1) - (i167 ^ i166);
                f52145o = i168 % 128;
                if (i168 % 2 == 0) {
                    return null;
                }
                int i169 = 91 / 0;
                return null;
            case 25:
                aak aakVar22 = (aak) objArr[0];
                ye yeVar = (ye) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                Intrinsics.checkNotNullParameter(yeVar, "");
                if (yt.setOnFocusChangeListener && Thread.holdsLock(aakVar22)) {
                    StringBuilder sb3 = new StringBuilder("Thread ");
                    sb3.append((Object) Thread.currentThread().getName());
                    sb3.append(" MUST NOT hold lock on ");
                    sb3.append(aakVar22);
                    throw new AssertionError(sb3.toString());
                }
                synchronized (aakVar22) {
                    try {
                        if (aakVar22.f52154h && zBooleanValue) {
                        } else {
                            aakVar22.f52154h = true;
                            aakVar22.f52153g.add(yeVar);
                        }
                        if (zBooleanValue) {
                            setDividerPadding setdividerpadding2 = (setDividerPadding) setOnFocusChangeListener(new Object[]{aakVar22}, 334486782, -334486771, System.identityHashCode(aakVar22));
                            setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding2}, -967813620, 967813621, System.identityHashCode(setdividerpadding2));
                        }
                        textAlignment = aakVar22.setTextAlignment();
                        aakVar22.notifyAll();
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (textAlignment) {
                    return null;
                }
                aakVar22.setCompoundDrawableTintBlendMode.setDividerPadding(aakVar22.setOnLongClickListener);
                return null;
            case 26:
                aak aakVar23 = (aak) objArr[0];
                long jLongValue3 = ((Number) objArr[1]).longValue();
                int i170 = f52146p;
                int i171 = i170 ^ 69;
                int i172 = -(-((i170 & 69) << 1));
                int i173 = ((i171 | i172) << 1) - (i171 ^ i172);
                f52145o = i173 % 128;
                int i174 = i173 % 2;
                aakVar23.UiMessageCallbackKtWhenMappings = jLongValue3;
                if (i174 != 0) {
                    int i175 = 33 / 0;
                }
                int i176 = (i170 & 109) + (i170 | 109);
                f52145o = i176 % 128;
                if (i176 % 2 == 0) {
                    return null;
                }
                throw null;
            case 27:
                aak aakVar24 = (aak) objArr[0];
                int i177 = f52146p;
                int i178 = i177 & 113;
                int i179 = -(-((i177 ^ 113) | i178));
                int i180 = (i178 ^ i179) + ((i178 & i179) << 1);
                int i181 = i180 % 128;
                f52145o = i181;
                int i182 = i180 % 2;
                if ((aakVar24.setOnLongClickListener & 1) == 1) {
                    int i183 = i181 & 87;
                    int i184 = -(-((i181 ^ 87) | i183));
                    int i185 = ((i183 | i184) << 1) - (i183 ^ i184);
                    f52146p = i185 % 128;
                    int i186 = i185 % 2;
                    z10 = true;
                } else {
                    int i187 = (i177 | 49) << 1;
                    int i188 = -(((~i177) & 49) | (i177 & (-50)));
                    int i189 = (i187 & i188) + (i188 | i187);
                    f52145o = i189 % 128;
                    int i190 = i189 % 2;
                    z10 = false;
                }
                aah aahVar = aakVar24.setCompoundDrawableTintBlendMode;
                if (((Boolean) aah.setX(new Object[]{aahVar}, -979470142, 979470166, System.identityHashCode(aahVar))).booleanValue() == z10) {
                    int i191 = f52145o;
                    int i192 = ((i191 | 109) << 1) - (i191 ^ 109);
                    f52146p = i192 % 128;
                    int i193 = i192 % 2;
                    int i194 = ((i191 & (-26)) | ((~i191) & 25)) + ((i191 & 25) << 1);
                    f52146p = i194 % 128;
                    if (i194 % 2 == 0) {
                        throw null;
                    }
                    obj = Boolean.TRUE;
                } else {
                    int i195 = f52145o;
                    int i196 = i195 & 73;
                    int i197 = (i195 ^ 73) | i196;
                    int i198 = (i196 & i197) + (i197 | i196);
                    f52146p = i198 % 128;
                    if (i198 % 2 == 0) {
                        throw null;
                    }
                    obj = Boolean.FALSE;
                }
                break;
            case 28:
                aak aakVar25 = (aak) objArr[0];
                long jLongValue4 = ((Number) objArr[1]).longValue();
                int i199 = f52146p;
                int i200 = (i199 & (-34)) | ((~i199) & 33);
                int i201 = -(-((i199 & 33) << 1));
                int i202 = ((i200 | i201) << 1) - (i201 ^ i200);
                f52145o = i202 % 128;
                int i203 = i202 % 2;
                aakVar25.getNavBarTitleString = jLongValue4;
                if (i203 == 0) {
                    return null;
                }
                throw null;
            default:
                aak aakVar26 = (aak) objArr[0];
                aac aacVar4 = (aac) objArr[1];
                int i204 = f52145o;
                int i205 = i204 | 91;
                int i206 = i205 << 1;
                int i207 = -((~(i204 & 91)) & i205);
                int i208 = ((i206 | i207) << 1) - (i207 ^ i206);
                f52146p = i208 % 128;
                int i209 = i208 % 2;
                Intrinsics.checkNotNullParameter(aacVar4, "");
                if (!((Boolean) setOnFocusChangeListener(new Object[]{aakVar26, aacVar4, null}, -71301485, 71301486, System.identityHashCode(aakVar26))).booleanValue()) {
                    int i210 = f52145o;
                    int i211 = (i210 & 95) + (i210 | 95);
                    f52146p = i211 % 128;
                    if (i211 % 2 != 0) {
                        return null;
                    }
                    throw null;
                }
                int i212 = aakVar26.setOnLongClickListener;
                aah.setX(new Object[]{aakVar26.setCompoundDrawableTintBlendMode, Integer.valueOf(i212), aacVar4}, -1642947737, 1642947747, i212);
                int i213 = f52146p;
                int i214 = i213 & 73;
                int i215 = (i213 ^ 73) | i214;
                int i216 = (i214 & i215) + (i215 | i214);
                f52145o = i216 % 128;
                if (i216 % 2 == 0) {
                    return null;
                }
                int i217 = 55 / 0;
                return null;
        }
        return obj;
    }

    @JvmName(name = "UiMessageCallbackKtWhenMappings")
    @Nullable
    public final IOException UiMessageCallbackKtWhenMappings() {
        return (IOException) setOnFocusChangeListener(new Object[]{this}, 835945179, -835945158, System.identityHashCode(this));
    }

    @NotNull
    public final aco getAmountFieldTextColor() {
        return (aco) setOnFocusChangeListener(new Object[]{this}, 1804763460, -1804763454, System.identityHashCode(this));
    }

    @JvmName(name = "getNavBarTitleString")
    @NotNull
    public final setY getNavBarTitleString() {
        return (setY) setOnFocusChangeListener(new Object[]{this}, -198801307, 198801311, System.identityHashCode(this));
    }

    @JvmName(name = "setAlwaysDrawnWithCacheEnabled")
    @Nullable
    public final synchronized aac setAlwaysDrawnWithCacheEnabled() {
        int i10 = f52145o;
        int i11 = (i10 ^ 125) + ((i10 & 125) << 1);
        f52146p = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        aac aacVar = this.setY;
        int i12 = ((((i10 ^ 37) | (i10 & 37)) << 1) - (~(-(((~i10) & 37) | (i10 & (-38)))))) - 1;
        f52146p = i12 % 128;
        if (i12 % 2 != 0) {
            return aacVar;
        }
        int i13 = 10 / 0;
        return aacVar;
        throw th;
    }

    public final void setChildDivider() throws IOException {
        setOnFocusChangeListener(new Object[]{this}, 1817193165, -1817193143, System.identityHashCode(this));
    }

    @NotNull
    public final acq setCompoundDrawablePadding() {
        return (acq) setOnFocusChangeListener(new Object[]{this}, -253897860, 253897867, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode(@NotNull aac p4, @Nullable IOException p10) throws IOException {
        setOnFocusChangeListener(new Object[]{this, p4, p10}, 1944285140, -1944285130, System.identityHashCode(this));
    }

    public final synchronized void setDividerPadding(@NotNull aac p4) {
        try {
            int i10 = f52146p;
            int i11 = i10 & 125;
            int i12 = ((i10 | 125) & (~i11)) + (i11 << 1);
            f52145o = i12 % 128;
            if (i12 % 2 != 0) {
                Intrinsics.checkNotNullParameter(p4, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(p4, "");
            if (this.setY == null) {
                int i13 = f52146p;
                int i14 = (i13 ^ 113) + ((i13 & 113) << 1);
                f52145o = i14 % 128;
                int i15 = i14 % 2;
                this.setY = p4;
                notifyAll();
                int i16 = f52146p;
                int i17 = i16 & 27;
                int i18 = ((i16 ^ 27) | i17) << 1;
                int i19 = -((i16 | 27) & (~i17));
                int i20 = (i18 & i19) + (i19 | i18);
                f52145o = i20 % 128;
                int i21 = i20 % 2;
            }
            int i22 = f52145o + 85;
            f52146p = i22 % 128;
            if (i22 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    public final void setImageResource() throws InterruptedIOException {
        setOnFocusChangeListener(new Object[]{this}, 1097831599, -1097831583, System.identityHashCode(this));
    }

    @NotNull
    public final synchronized ye setIncludeFontPadding() throws IOException {
        ye yeVarRemoveFirst;
        try {
            int i10 = f52146p;
            int i11 = i10 & 95;
            int i12 = i10 | 95;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            f52145o = i13 % 128;
            if (i13 % 2 != 0) {
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = this.setAlwaysDrawnWithCacheEnabled;
                abp.setY(new Object[]{setcompounddrawabletintblendmode}, -1179150768, 1179150769, System.identityHashCode(setcompounddrawabletintblendmode));
                try {
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = this.setAlwaysDrawnWithCacheEnabled;
            abp.setY(new Object[]{setcompounddrawabletintblendmode2}, -1179150768, 1179150769, System.identityHashCode(setcompounddrawabletintblendmode2));
            int i14 = f52145o + 94;
            int i15 = (i14 ^ (-1)) + (i14 << 1);
            f52146p = i15 % 128;
            int i16 = i15 % 2;
            while (this.f52153g.isEmpty()) {
                try {
                    int i17 = f52146p;
                    int i18 = i17 & 121;
                    int i19 = ((i17 ^ 121) | i18) << 1;
                    int i20 = -((i17 | 121) & (~i18));
                    int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                    int i22 = i21 % 128;
                    f52145o = i22;
                    int i23 = i21 % 2;
                    if (this.setY != null) {
                        break;
                    }
                    int i24 = i22 & 57;
                    int i25 = -(-((i22 ^ 57) | i24));
                    int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                    f52146p = i26 % 128;
                    if (i26 % 2 == 0) {
                        setOnFocusChangeListener(new Object[]{this}, 1097831599, -1097831583, System.identityHashCode(this));
                        int i27 = 16 / 0;
                    } else {
                        setOnFocusChangeListener(new Object[]{this}, 1097831599, -1097831583, System.identityHashCode(this));
                    }
                    int i28 = f52145o;
                    int i29 = i28 & 81;
                    int i30 = ((i28 | 81) & (~i29)) + (i29 << 1);
                    f52146p = i30 % 128;
                    int i31 = i30 % 2;
                } catch (Throwable th3) {
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = this.setAlwaysDrawnWithCacheEnabled;
                    setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{setcompounddrawabletintblendmode3}, 1024790889, -1024790889, System.identityHashCode(setcompounddrawabletintblendmode3));
                    throw th3;
                }
            }
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode4 = this.setAlwaysDrawnWithCacheEnabled;
            setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{setcompounddrawabletintblendmode4}, 1024790889, -1024790889, System.identityHashCode(setcompounddrawabletintblendmode4));
            int i32 = f52146p + 99;
            int i33 = i32 % 128;
            f52145o = i33;
            int i34 = i32 % 2;
            int i35 = i33 + 69;
            f52146p = i35 % 128;
            int i36 = i35 % 2;
            if (this.f52153g.isEmpty()) {
                System.identityHashCode(this);
                System.identityHashCode(this);
            } else {
                int i37 = f52146p;
                int i38 = (i37 ^ 107) + ((i37 & 107) << 1);
                int i39 = i38 % 128;
                f52145o = i39;
                boolean z10 = !(i38 % 2 != 0);
                int i40 = ((-1) << 1) - ((i39 + 42) ^ (-1));
                f52146p = i40 % 128;
                int i41 = i40 % 2;
                if (z10) {
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i42 = ~iIdentityHashCode;
                    int i43 = ~(((-1088104176) ^ iIdentityHashCode) | ((-1088104176) & iIdentityHashCode));
                    int i44 = 508711349 & i43;
                    int i45 = (i43 | 508711349) & (~i44);
                    int i46 = 1801834411 - (~(-(~(((i45 & i44) | (i45 ^ i44)) * 56))));
                    int i47 = i46 & (-503341104);
                    int i48 = (((-503341104) | i46) & (~i47)) + (i47 << 1);
                    int i49 = (iIdentityHashCode | i42) & (~iIdentityHashCode);
                    int i50 = ((-508711350) & i49) | ((~i49) & 508711349);
                    int i51 = i49 & 508711349;
                    int i52 = (i48 - (~(((~((i51 & i50) | (i50 ^ i51))) | (-1088104176)) * 56))) - 1;
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i53 = ~((474435958 ^ iIdentityHashCode2) | (474435958 & iIdentityHashCode2));
                    int i54 = ((-1) << 1) - ((1783147806 - (~(((i53 & (-1132450806)) | ((-1132450806) ^ i53)) * 262))) ^ (-1));
                    int i55 = i54 & 913887088;
                    int i56 = (i54 | 913887088) & (~i55);
                    int i57 = -(-(i55 << 1));
                    int i58 = (i56 ^ i57) + ((i56 & i57) << 1);
                    int i59 = ~iIdentityHashCode2;
                    int i60 = ((~i59) & 474435958) | ((-474435959) & i59);
                    int i61 = i59 & 474435958;
                    int i62 = ~((i61 & i60) | (i60 ^ i61));
                    int i63 = ((-469762051) & i62) | ((~i62) & 469762050);
                    int i64 = i62 & 469762050;
                    int i65 = (i64 & i63) | (i63 ^ i64);
                    int i66 = (1602212855 & i65) | ((~i65) & (-1602212856));
                    int i67 = i65 & (-1602212856);
                    int i68 = -(-(((i67 & i66) | (i66 ^ i67)) * 262));
                    int i69 = i58 ^ i68;
                    if (i52 > (((i68 & i58) | i69) << 1) - i69) {
                        ye yeVarRemoveFirst2 = this.f52153g.removeFirst();
                        Intrinsics.checkNotNullExpressionValue(yeVarRemoveFirst2, "");
                        ye yeVar = yeVarRemoveFirst2;
                        try {
                            throw null;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    yeVarRemoveFirst = this.f52153g.removeFirst();
                    Intrinsics.checkNotNullExpressionValue(yeVarRemoveFirst, "");
                }
            }
            IOException iOException = this.setX;
            if (iOException != null) {
                throw iOException;
            }
            aac aacVar = this.setY;
            Intrinsics.checkNotNull(aacVar);
            aap aapVar = new aap(aacVar);
            int i70 = f52145o;
            int i71 = i70 & 101;
            int i72 = ((((i70 ^ 101) | i71) << 1) - (~(-((i70 | 101) & (~i71))))) - 1;
            f52146p = i72 % 128;
            int i73 = i72 % 2;
            throw aapVar;
        } catch (Throwable th5) {
            throw th5;
        }
        throw th5;
        return yeVarRemoveFirst;
    }

    @JvmName(name = "setLayoutAnimation")
    @NotNull
    public final setDividerPadding setLayoutAnimation() {
        return (setDividerPadding) setOnFocusChangeListener(new Object[]{this}, 334486782, -334486771, System.identityHashCode(this));
    }

    @JvmName(name = "setNavigationOnClickListener")
    public final long setNavigationOnClickListener() {
        return ((Long) setOnFocusChangeListener(new Object[]{this}, -910961715, 910961735, System.identityHashCode(this))).longValue();
    }

    @JvmName(name = "setOnDragListener")
    @NotNull
    public final setCompoundDrawableTintBlendMode setOnDragListener() {
        return (setCompoundDrawableTintBlendMode) setOnFocusChangeListener(new Object[]{this}, 434717771, -434717762, System.identityHashCode(this));
    }

    public final void setOnEditorActionListener() throws IOException {
        setOnFocusChangeListener(new Object[]{this}, -1848937745, 1848937757, System.identityHashCode(this));
    }

    @JvmName(name = "setOnLongClickListener")
    @NotNull
    public final setCompoundDrawableTintBlendMode setOnLongClickListener() {
        return (setCompoundDrawableTintBlendMode) setOnFocusChangeListener(new Object[]{this}, 1659916810, -1659916797, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ba A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:3:0x0001, B:5:0x0017, B:11:0x0034, B:14:0x0038, B:16:0x0055, B:18:0x0071, B:40:0x010a, B:46:0x011a, B:21:0x0088, B:24:0x009d, B:25:0x009e, B:27:0x00ba, B:29:0x00d4, B:35:0x00ef, B:36:0x00f0, B:38:0x0106, B:47:0x011b, B:53:0x013c, B:9:0x0032, B:44:0x0118, B:51:0x013a, B:22:0x009b, B:31:0x00ea), top: B:58:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00d4 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:3:0x0001, B:5:0x0017, B:11:0x0034, B:14:0x0038, B:16:0x0055, B:18:0x0071, B:40:0x010a, B:46:0x011a, B:21:0x0088, B:24:0x009d, B:25:0x009e, B:27:0x00ba, B:29:0x00d4, B:35:0x00ef, B:36:0x00f0, B:38:0x0106, B:47:0x011b, B:53:0x013c, B:9:0x0032, B:44:0x0118, B:51:0x013a, B:22:0x009b, B:31:0x00ea), top: B:58:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00f0 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:3:0x0001, B:5:0x0017, B:11:0x0034, B:14:0x0038, B:16:0x0055, B:18:0x0071, B:40:0x010a, B:46:0x011a, B:21:0x0088, B:24:0x009d, B:25:0x009e, B:27:0x00ba, B:29:0x00d4, B:35:0x00ef, B:36:0x00f0, B:38:0x0106, B:47:0x011b, B:53:0x013c, B:9:0x0032, B:44:0x0118, B:51:0x013a, B:22:0x009b, B:31:0x00ea), top: B:58:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0106 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:3:0x0001, B:5:0x0017, B:11:0x0034, B:14:0x0038, B:16:0x0055, B:18:0x0071, B:40:0x010a, B:46:0x011a, B:21:0x0088, B:24:0x009d, B:25:0x009e, B:27:0x00ba, B:29:0x00d4, B:35:0x00ef, B:36:0x00f0, B:38:0x0106, B:47:0x011b, B:53:0x013c, B:9:0x0032, B:44:0x0118, B:51:0x013a, B:22:0x009b, B:31:0x00ea), top: B:58:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x011b A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:3:0x0001, B:5:0x0017, B:11:0x0034, B:14:0x0038, B:16:0x0055, B:18:0x0071, B:40:0x010a, B:46:0x011a, B:21:0x0088, B:24:0x009d, B:25:0x009e, B:27:0x00ba, B:29:0x00d4, B:35:0x00ef, B:36:0x00f0, B:38:0x0106, B:47:0x011b, B:53:0x013c, B:9:0x0032, B:44:0x0118, B:51:0x013a, B:22:0x009b, B:31:0x00ea), top: B:58:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0138 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:61:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x0138, please report this as an issue */
    @JvmName(name = "setTextAlignment")
    public final synchronized boolean setTextAlignment() {
        setY sety;
        int i10;
        int i11;
        setY sety2;
        setY sety3;
        try {
            int i12 = ((-1) << 1) - ((f52146p + 8) ^ (-1));
            int i13 = i12 % 128;
            f52145o = i13;
            int i14 = i12 % 2;
            if (this.setY != null) {
                int i15 = (i13 ^ 57) + ((i13 & 57) << 1);
                int i16 = i15 % 128;
                f52146p = i16;
                int i17 = i15 % 2;
                int i18 = (i16 & 67) + (i16 | 67);
                f52145o = i18 % 128;
                if (i18 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            setDividerPadding setdividerpadding = this.setTextAlignment;
            if (!((Boolean) setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding}, 1875229206, -1875229198, System.identityHashCode(setdividerpadding))).booleanValue()) {
                int i19 = f52145o;
                int i20 = i19 & 103;
                int i21 = (((i19 | 103) & (~i20)) - (~(-(-(i20 << 1))))) - 1;
                f52146p = i21 % 128;
                if (i21 % 2 == 0) {
                    setDividerPadding setdividerpadding2 = this.setTextAlignment;
                    ((Boolean) setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding2}, -1629488671, 1629488671, System.identityHashCode(setdividerpadding2))).booleanValue();
                    throw null;
                }
                setDividerPadding setdividerpadding3 = this.setTextAlignment;
                if (((Boolean) setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding3}, -1629488671, 1629488671, System.identityHashCode(setdividerpadding3))).booleanValue()) {
                    sety = this.setZ;
                    if (!((Boolean) setY.setX(new Object[]{sety}, -1882865611, 1882865614, System.identityHashCode(sety))).booleanValue()) {
                        int i22 = f52145o;
                        i11 = ((-1) << 1) - (((i22 & 70) + (i22 | 70)) ^ (-1));
                        f52146p = i11 % 128;
                        if (i11 % 2 == 0) {
                            sety3 = this.setZ;
                            int i23 = 78 / 0;
                            if (((Boolean) setY.setX(new Object[]{sety3}, -1677107848, 1677107850, System.identityHashCode(sety3))).booleanValue()) {
                                if (!this.f52154h) {
                                    int i24 = f52145o;
                                    int i25 = i24 & 9;
                                    int i26 = -(-((i24 ^ 9) | i25));
                                    int i27 = (i25 & i26) + (i25 | i26);
                                    f52146p = i27 % 128;
                                    int i28 = i27 % 2;
                                    i10 = i24 + 93;
                                    f52146p = i10 % 128;
                                    if (i10 % 2 != 0) {
                                        return false;
                                    }
                                    throw null;
                                }
                            }
                        } else {
                            sety2 = this.setZ;
                            if (((Boolean) setY.setX(new Object[]{sety2}, -1677107848, 1677107850, System.identityHashCode(sety2))).booleanValue()) {
                                if (!this.f52154h) {
                                    int i29 = f52145o;
                                    int i210 = i29 & 9;
                                    int i211 = -(-((i29 ^ 9) | i210));
                                    int i212 = (i210 & i211) + (i210 | i211);
                                    f52146p = i212 % 128;
                                    int i213 = i212 % 2;
                                    i10 = i29 + 93;
                                    f52146p = i10 % 128;
                                    if (i10 % 2 != 0) {
                                        return false;
                                    }
                                    throw null;
                                }
                            }
                        }
                    } else if (!this.f52154h) {
                        int i214 = f52145o;
                        int i215 = i214 & 9;
                        int i216 = -(-((i214 ^ 9) | i215));
                        int i217 = (i215 & i216) + (i215 | i216);
                        f52146p = i217 % 128;
                        int i218 = i217 % 2;
                        i10 = i214 + 93;
                        f52146p = i10 % 128;
                        if (i10 % 2 != 0) {
                            return false;
                        }
                        throw null;
                    }
                }
            } else {
                sety = this.setZ;
                if (!((Boolean) setY.setX(new Object[]{sety}, -1882865611, 1882865614, System.identityHashCode(sety))).booleanValue()) {
                    int i219 = f52145o;
                    i11 = ((-1) << 1) - (((i219 & 70) + (i219 | 70)) ^ (-1));
                    f52146p = i11 % 128;
                    if (i11 % 2 == 0) {
                        sety3 = this.setZ;
                        int i220 = 78 / 0;
                        if (((Boolean) setY.setX(new Object[]{sety3}, -1677107848, 1677107850, System.identityHashCode(sety3))).booleanValue()) {
                            if (!this.f52154h) {
                                int i2110 = f52145o;
                                int i2111 = i2110 & 9;
                                int i2112 = -(-((i2110 ^ 9) | i2111));
                                int i2113 = (i2111 & i2112) + (i2111 | i2112);
                                f52146p = i2113 % 128;
                                int i2114 = i2113 % 2;
                                i10 = i2110 + 93;
                                f52146p = i10 % 128;
                                if (i10 % 2 != 0) {
                                    return false;
                                }
                                throw null;
                            }
                        }
                    } else {
                        sety2 = this.setZ;
                        if (((Boolean) setY.setX(new Object[]{sety2}, -1677107848, 1677107850, System.identityHashCode(sety2))).booleanValue()) {
                            if (!this.f52154h) {
                                int i2115 = f52145o;
                                int i2116 = i2115 & 9;
                                int i2117 = -(-((i2115 ^ 9) | i2116));
                                int i2118 = (i2116 & i2117) + (i2116 | i2117);
                                f52146p = i2118 % 128;
                                int i2119 = i2118 % 2;
                                i10 = i2115 + 93;
                                f52146p = i10 % 128;
                                if (i10 % 2 != 0) {
                                    return false;
                                }
                                throw null;
                            }
                        }
                    }
                } else if (!this.f52154h) {
                    int i21110 = f52145o;
                    int i21111 = i21110 & 9;
                    int i21112 = -(-((i21110 ^ 9) | i21111));
                    int i21113 = (i21111 & i21112) + (i21111 | i21112);
                    f52146p = i21113 % 128;
                    int i21114 = i21113 % 2;
                    i10 = i21110 + 93;
                    f52146p = i10 % 128;
                    if (i10 % 2 != 0) {
                        return false;
                    }
                    throw null;
                }
            }
            int i30 = f52145o + 55;
            f52146p = i30 % 128;
            if (i30 % 2 != 0) {
                return true;
            }
            throw null;
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    @NotNull
    public final acq setTextScaleX() {
        return (acq) setOnFocusChangeListener(new Object[]{this}, -941467534, 941467536, System.identityHashCode(this));
    }

    public final void setX(@NotNull ye p4, boolean p10) {
        setOnFocusChangeListener(new Object[]{this, p4, Boolean.valueOf(p10)}, -830450716, 830450741, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    public final void setY(long j10) {
        setOnFocusChangeListener(new Object[]{this, Long.valueOf(j10)}, -1510996236, 1510996264, System.identityHashCode(this));
    }

    @JvmName(name = "setZ")
    public final boolean setZ() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 348660389, -348660362, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final long setCompoundDrawableTintBlendMode() {
        return ((Long) setOnFocusChangeListener(new Object[]{this}, 269929162, -269929144, System.identityHashCode(this))).longValue();
    }

    @JvmName(name = "setX")
    @NotNull
    public final aah setX() {
        return (aah) setOnFocusChangeListener(new Object[]{this}, 1720650987, -1720650970, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    public final long setY() {
        return ((Long) setOnFocusChangeListener(new Object[]{this}, 36091768, -36091749, System.identityHashCode(this))).longValue();
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final void setCompoundDrawableTintBlendMode(long j10) {
        setOnFocusChangeListener(new Object[]{this, Long.valueOf(j10)}, 1652721237, -1652721234, System.identityHashCode(this));
    }

    public final void setDividerPadding(@NotNull aby p4, int p10) throws IOException {
        setOnFocusChangeListener(new Object[]{this, p4, Integer.valueOf(p10)}, -40019943, 40019967, p10);
    }

    @JvmName(name = "setDividerPadding")
    public final void setDividerPadding(long j10) {
        setOnFocusChangeListener(new Object[]{this, Long.valueOf(j10)}, 1940197349, -1940197323, System.identityHashCode(this));
    }

    @JvmName(name = "setDividerPadding")
    public final long setDividerPadding() {
        return ((Long) setOnFocusChangeListener(new Object[]{this}, 29526374, -29526369, System.identityHashCode(this))).longValue();
    }

    public final void setOnFocusChangeListener(long p4) {
        setOnFocusChangeListener(new Object[]{this, Long.valueOf(p4)}, -1720803552, 1720803567, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@NotNull aac p4) {
        setOnFocusChangeListener(new Object[]{this, p4}, 1937161244, -1937161244, System.identityHashCode(this));
    }

    @JvmName(name = "setOnFocusChangeListener")
    public final int setOnFocusChangeListener() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, 2012833449, -2012833441, System.identityHashCode(this))).intValue();
    }
}
