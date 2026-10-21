package com.mypinpad.tsdk.isolation;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\"\u001a\u00020\u000f\u0012\u0006\u0010#\u001a\u00020\u0014\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b&\u0010'J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\f\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u000e\u0010\u001cR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010\u0017\u001a\u0004\u0018\u00010 X\u0007¢\u0006\u0006\n\u0004\b\u001f\u0010!"}, d2 = {"Lcom/mypinpad/tsdk/i/rr;", "Lcom/mypinpad/tsdk/i/rs;", "Lcom/mypinpad/tsdk/i/un;", "", "toString", "()Ljava/lang/String;", "", "junkify", "()V", "Lcom/mypinpad/tsdk/i/ru;", "p0", "Lcom/mypinpad/tsdk/i/ru;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/ru;", "setY", "", "q0", "[B", "setX", "()[B", "Lcom/mypinpad/tsdk/i/sa;", "r0", "Lcom/mypinpad/tsdk/i/sa;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/sa;", "Ljava/util/UUID;", "s0", "Ljava/util/UUID;", "()Ljava/util/UUID;", "setNavigationOnClickListener", "t0", "setDividerPadding", "Lcom/mypinpad/tsdk/i/sg;", "Lcom/mypinpad/tsdk/i/sg;", "p1", "p2", "p3", "p4", "<init>", "(Lcom/mypinpad/tsdk/i/ru;[BLcom/mypinpad/tsdk/i/sa;Ljava/util/UUID;[B)V"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSdkTxnResultCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkTxnResultCallback.kt\ncom/mypinpad/tsdk/internal/sdk/callbacks/SdkTransactionCompleted\n+ 2 DebugFunctions.kt\ncom/mypinpad/tsdk/common/buildconstants/DebugFunctionsKt\n*L\n1#1,448:1\n30#2:449\n14#2:450\n*S KotlinDebug\n*F\n+ 1 SdkTxnResultCallback.kt\ncom/mypinpad/tsdk/internal/sdk/callbacks/SdkTransactionCompleted\n*L\n82#1:449\n82#1:450\n*E\n"})
public final class rr extends rs implements un {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f58146u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ru setY;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] setX;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sa setOnFocusChangeListener;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final UUID setNavigationOnClickListener;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @Nullable
    public sg setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final byte[] setDividerPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr(@NotNull ru ruVar, @NotNull byte[] bArr, @NotNull sa saVar, @Nullable UUID uuid, @Nullable byte[] bArr2) {
        super(null);
        Intrinsics.checkNotNullParameter(ruVar, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(saVar, "");
        this.setY = ruVar;
        this.setX = bArr;
        this.setOnFocusChangeListener = saVar;
        this.setNavigationOnClickListener = uuid;
        this.setDividerPadding = bArr2;
        rp rpVar = ruVar instanceof rp ? (rp) ruVar : null;
        this.setCompoundDrawableTintBlendMode = rpVar != null ? (sg) rp.setY(new Object[]{rpVar}, -1859324063, 1859324063, System.identityHashCode(rpVar)) : null;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ((i11 | i13) * (-368)) + (i11 * 185) + (i10 * (-183));
        int i15 = ~i11;
        int i16 = ~i12;
        switch ((((~(i10 | i11)) | (~(i16 | i10)) | (~(i13 | i15))) * 184) + ((i10 | i15 | i16) * 184) + i14) {
            case 1:
                rr rrVar = (rr) objArr[0];
                int i17 = f58146u0 + 85;
                v0 = i17 % 128;
                int i18 = i17 % 2;
                int i19 = v0 + 87;
                f58146u0 = i19 % 128;
                if (i19 % 2 == 0) {
                    return null;
                }
                throw null;
            case 2:
                int i20 = f58146u0;
                int i21 = i20 & 101;
                int i22 = ((~i21) & (i20 | 101)) + (i21 << 1);
                v0 = i22 % 128;
                int i23 = i22 % 2;
                int i24 = i20 + 75;
                v0 = i24 % 128;
                int i25 = i24 % 2;
                return "";
            case 3:
                rr rrVar2 = (rr) objArr[0];
                int i26 = v0;
                int i27 = (i26 ^ 29) + ((i26 & 29) << 1);
                int i28 = i27 % 128;
                f58146u0 = i28;
                int i29 = i27 % 2;
                byte[] bArr = rrVar2.setX;
                int i30 = (((i28 & (-86)) | ((~i28) & 85)) - (~(-(-((i28 & 85) << 1))))) - 1;
                v0 = i30 % 128;
                int i31 = i30 % 2;
                return bArr;
            case 4:
                rr rrVar3 = (rr) objArr[0];
                int i32 = v0;
                int i33 = (i32 & 9) + (i32 | 9);
                f58146u0 = i33 % 128;
                int i34 = i33 % 2;
                ru ruVar = rrVar3.setY;
                int i35 = (i32 ^ 20) + ((i32 & 20) << 1);
                int i36 = (i35 ^ (-1)) + (i35 << 1);
                f58146u0 = i36 % 128;
                int i37 = i36 % 2;
                return ruVar;
            case 5:
                rr rrVar4 = (rr) objArr[0];
                int i38 = f58146u0;
                int i39 = i38 & 87;
                int i40 = -(-((i38 ^ 87) | i39));
                int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                int i42 = i41 % 128;
                v0 = i42;
                int i43 = i41 % 2;
                byte[] bArr2 = rrVar4.setDividerPadding;
                int i44 = (i42 & 13) + (i42 | 13);
                f58146u0 = i44 % 128;
                if (i44 % 2 == 0) {
                    return bArr2;
                }
                int i45 = 96 / 0;
                return bArr2;
            case 6:
                rr rrVar5 = (rr) objArr[0];
                int i46 = f58146u0;
                int i47 = (-2) - (((i46 ^ 84) + ((i46 & 84) << 1)) ^ (-1));
                v0 = i47 % 128;
                if (i47 % 2 != 0) {
                    return rrVar5.setOnFocusChangeListener;
                }
                sa saVar = rrVar5.setOnFocusChangeListener;
                throw null;
            default:
                rr rrVar6 = (rr) objArr[0];
                int i48 = v0;
                int i49 = i48 + 97;
                f58146u0 = i49 % 128;
                int i50 = i49 % 2;
                UUID uuid = rrVar6.setNavigationOnClickListener;
                int i51 = i48 & 3;
                int i52 = (i48 | 3) & (~i51);
                int i53 = i51 << 1;
                int i54 = (i52 ^ i53) + ((i52 & i53) << 1);
                f58146u0 = i54 % 128;
                if (i54 % 2 == 0) {
                    return uuid;
                }
                throw null;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.un
    public final void junkify() {
        setX(new Object[]{this}, -1389038618, 1389038619, System.identityHashCode(this));
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @NotNull
    public final sa setCompoundDrawableTintBlendMode() {
        return (sa) setX(new Object[]{this}, 1692626086, -1692626080, System.identityHashCode(this));
    }

    @JvmName(name = "setDividerPadding")
    @Nullable
    public final byte[] setDividerPadding() {
        return (byte[]) setX(new Object[]{this}, -1159160549, 1159160554, System.identityHashCode(this));
    }

    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final ru setOnFocusChangeListener() {
        return (ru) setX(new Object[]{this}, -1519171482, 1519171486, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    @Nullable
    public final UUID setY() {
        return (UUID) setX(new Object[]{this}, -829404909, 829404909, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setX(new Object[]{this}, 200492384, -200492382, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    @NotNull
    public final byte[] setX() {
        return (byte[]) setX(new Object[]{this}, 1683512953, -1683512950, System.identityHashCode(this));
    }
}
