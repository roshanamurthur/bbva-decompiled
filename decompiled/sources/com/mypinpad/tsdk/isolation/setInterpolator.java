package com.mypinpad.tsdk.isolation;

import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import java.io.Closeable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B=\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0012\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b \u0010!J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\r\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0011\u0010\u001b"}, d2 = {"Lcom/mypinpad/tsdk/i/setInterpolator;", "Ljava/io/Closeable;", "", "getNavBarTitleString", "()Ljava/lang/String;", "", HearingDisabilitiesConstants.CLOSE_MODAL, "()V", "", "p0", "Ljava/util/Map;", "setOnFocusChangeListener", "()Ljava/util/Map;", "setCompoundDrawableTintBlendMode", "q0", "Ljava/lang/String;", "setDividerPadding", "setY", "Lcom/mypinpad/tsdk/i/Metadata;", "r0", "Lcom/mypinpad/tsdk/i/Metadata;", "()Lcom/mypinpad/tsdk/i/Metadata;", "setX", "s0", "Lcom/mypinpad/tsdk/i/TransactionNotAuthorisedReason;", "t0", "Lcom/mypinpad/tsdk/i/TransactionNotAuthorisedReason;", "()Lcom/mypinpad/tsdk/i/TransactionNotAuthorisedReason;", "p1", "p2", "p3", "p4", "<init>", "(Ljava/util/Map;Ljava/lang/String;Lcom/mypinpad/tsdk/i/Metadata;Ljava/lang/String;Lcom/mypinpad/tsdk/i/TransactionNotAuthorisedReason;)V"}, k = 1, mv = {1, 5, 1})
public final class setInterpolator implements Closeable {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f59925u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, String> setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setY;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Metadata setX;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setOnFocusChangeListener;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TransactionNotAuthorisedReason setDividerPadding;

    public setInterpolator(@NotNull Map<String, String> map, @NotNull String str, @NotNull Metadata metadata, @NotNull String str2, @NotNull TransactionNotAuthorisedReason transactionNotAuthorisedReason) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(metadata, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(transactionNotAuthorisedReason, "");
        this.setCompoundDrawableTintBlendMode = map;
        this.setY = str;
        this.setX = metadata;
        this.setOnFocusChangeListener = str2;
        this.setDividerPadding = transactionNotAuthorisedReason;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = (((~(i13 | i14)) | (~(i13 | i12))) * ReturnCode.ERR_CONN_IO) + (i11 * (-751)) + (i10 * (-751));
        int i16 = i11 | i13;
        switch ((((~(i10 | i14)) | (~i16)) * 752) + ((~(i12 | i16)) * (-1504)) + i15) {
            case 1:
                Metadata metadata = ((setInterpolator) objArr[0]).setX;
                String str = new String((byte[]) Metadata.setY(new Object[]{metadata}, 1982236974, -1982236973, System.identityHashCode(metadata)), Charsets.UTF_8);
                int i17 = v0;
                int i18 = (i17 ^ 4) + ((i17 & 4) << 1);
                int i19 = (i18 ^ (-1)) + (i18 << 1);
                f59925u0 = i19 % 128;
                if (i19 % 2 == 0) {
                    return str;
                }
                throw null;
            case 2:
                setInterpolator setinterpolator = (setInterpolator) objArr[0];
                int i20 = f59925u0;
                int i21 = i20 ^ 73;
                int i22 = ((i20 & 73) | i21) << 1;
                int i23 = -i21;
                int i24 = (i22 & i23) + (i23 | i22);
                v0 = i24 % 128;
                int i25 = i24 % 2;
                Metadata metadata2 = setinterpolator.setX;
                int i26 = i20 & 33;
                int i27 = (i20 | 33) & (~i26);
                int i28 = i26 << 1;
                int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                v0 = i29 % 128;
                int i30 = i29 % 2;
                return metadata2;
            case 3:
                setInterpolator setinterpolator2 = (setInterpolator) objArr[0];
                int i31 = v0;
                int i32 = i31 + 45;
                f59925u0 = i32 % 128;
                if (i32 % 2 != 0) {
                    String str2 = setinterpolator2.setOnFocusChangeListener;
                    throw null;
                }
                String str3 = setinterpolator2.setOnFocusChangeListener;
                int i33 = (((i31 | 78) << 1) - (i31 ^ 78)) - 1;
                f59925u0 = i33 % 128;
                if (i33 % 2 == 0) {
                    return str3;
                }
                int i34 = 13 / 0;
                return str3;
            case 4:
                setInterpolator setinterpolator3 = (setInterpolator) objArr[0];
                int i35 = f59925u0;
                int i36 = i35 & 23;
                int i37 = ((i35 ^ 23) | i36) << 1;
                int i38 = -((~i36) & (i35 | 23));
                int i39 = ((i37 | i38) << 1) - (i37 ^ i38);
                v0 = i39 % 128;
                int i40 = i39 % 2;
                obj = setinterpolator3.setY;
                int i41 = (-2) - ((i35 + 84) ^ (-1));
                v0 = i41 % 128;
                if (i41 % 2 == 0) {
                    throw null;
                }
                break;
            case 5:
                setInterpolator setinterpolator4 = (setInterpolator) objArr[0];
                int i42 = v0;
                int i43 = i42 & 95;
                int i44 = -(-(i42 | 95));
                int i45 = ((i43 | i44) << 1) - (i43 ^ i44);
                f59925u0 = i45 % 128;
                int i46 = i45 % 2;
                obj = setinterpolator4.setDividerPadding;
                int i47 = i42 + 4;
                int i48 = (i47 ^ (-1)) + (i47 << 1);
                f59925u0 = i48 % 128;
                if (i48 % 2 != 0) {
                    throw null;
                }
                break;
            case 6:
                setInterpolator setinterpolator5 = (setInterpolator) objArr[0];
                int i49 = f59925u0;
                int i50 = ((i49 | 17) << 1) - (i49 ^ 17);
                v0 = i50 % 128;
                int i51 = i50 % 2;
                Metadata metadata3 = setinterpolator5.setX;
                Metadata.setY(new Object[]{metadata3}, -1222766384, 1222766384, System.identityHashCode(metadata3));
                int i52 = v0;
                int i53 = (((i52 ^ 91) | (i52 & 91)) << 1) - (((~i52) & 91) | (i52 & (-92)));
                f59925u0 = i53 % 128;
                int i54 = i53 % 2;
                return null;
            default:
                setInterpolator setinterpolator6 = (setInterpolator) objArr[0];
                int i55 = v0;
                int i56 = (i55 & (-70)) | ((~i55) & 69);
                int i57 = -(-((i55 & 69) << 1));
                int i58 = (i56 ^ i57) + ((i56 & i57) << 1);
                f59925u0 = i58 % 128;
                int i59 = i58 % 2;
                Map<String, String> map = setinterpolator6.setCompoundDrawableTintBlendMode;
                int i60 = i55 ^ 19;
                int i61 = -(-((i55 & 19) << 1));
                int i62 = (i60 & i61) + (i60 | i61);
                f59925u0 = i62 % 128;
                int i63 = i62 % 2;
                return map;
        }
        return obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        setCompoundDrawableTintBlendMode(new Object[]{this}, -1226907221, 1226907227, System.identityHashCode(this));
    }

    @NotNull
    public final String getNavBarTitleString() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -395916299, 395916300, System.identityHashCode(this));
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final String setDividerPadding() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -767659663, 767659667, System.identityHashCode(this));
    }

    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final Map<String, String> setOnFocusChangeListener() {
        return (Map) setCompoundDrawableTintBlendMode(new Object[]{this}, 1992993716, -1992993716, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    @NotNull
    public final String setX() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -2059749119, 2059749122, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    @NotNull
    public final TransactionNotAuthorisedReason setY() {
        return (TransactionNotAuthorisedReason) setCompoundDrawableTintBlendMode(new Object[]{this}, -130991403, 130991408, System.identityHashCode(this));
    }

    public /* synthetic */ setInterpolator(Map map, String str, Metadata metadata, String str2, TransactionNotAuthorisedReason transactionNotAuthorisedReason, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, str, metadata, str2, (i10 & 16) != 0 ? TransactionNotAuthorisedReason.setY : transactionNotAuthorisedReason);
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @NotNull
    public final Metadata setCompoundDrawableTintBlendMode() {
        return (Metadata) setCompoundDrawableTintBlendMode(new Object[]{this}, -1644707261, 1644707263, System.identityHashCode(this));
    }
}
