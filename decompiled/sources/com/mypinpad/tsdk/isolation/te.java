package com.mypinpad.tsdk.isolation;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.mypinpad.tsdk.api.errors.TerminalException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015JB\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ(\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0002¨\u0006\u0017"}, d2 = {"Lcom/mypinpad/tsdk/internal/terminal/SdkTerminalFactory;", "", "", "baseUrl", "Lcom/mypinpad/tsdk/internal/host/HostDateProvider;", "hostDateProvider", "Lcom/mypinpad/tsdk/internal/host/HostCsprng;", "hostCsprng", "Lcom/mypinpad/tsdk/internal/host/HostNetworkStateProvider;", "hostNetworkStateProvider", "Lcom/mypinpad/tsdk/internal/host/HostBeepProvider;", "hostBeepProvider", "Lcom/mypinpad/tsdk/internal/crypto/SdkSecureEncryptor;", "secureEncryptor", "Lcom/mypinpad/softpos/emv/integration/contract/EmvTerminal;", "testEmvTerminal", "Lcom/mypinpad/tsdk/internal/terminal/SdkTerminal;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mypinpad/softpos/emv/integration/security/SecureEncryptor;", "getEmvTerminal", "<init>", "()V", "Companion", "sdk-android_release"}, k = 1, mv = {1, 8, 0})
public final class te {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static component24 f61041a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f61042b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f61043c = 1;

    @NotNull
    public static final setY setDividerPadding = new setY(null);

    @SourceDebugExtension({"SMAP\nSdkTerminalFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkTerminalFactory.kt\ncom/mypinpad/tsdk/internal/terminal/SdkTerminalFactory$getEmvTerminal$InMemorySecureConfigProvider\n+ 2 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n*L\n1#1,121:1\n7#2,8:122\n*S KotlinDebug\n*F\n+ 1 SdkTerminalFactory.kt\ncom/mypinpad/tsdk/internal/terminal/SdkTerminalFactory$getEmvTerminal$InMemorySecureConfigProvider\n*L\n79#1:122,8\n*E\n"})
    public final class setCompoundDrawableTintBlendMode implements setVerticalScrollbarOverlay {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public byte[] f61044a;

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws TerminalException {
            int i13 = (i11 * 591) + (i10 * (-589));
            int i14 = ~i11;
            int i15 = ~i12;
            int i16 = (~(i14 | i10)) | (~(i14 | i15)) | (~(i15 | i10));
            int i17 = ~i10;
            if ((((~(i17 | i15)) | (~(i11 | i15))) * 590) + (i16 * (-1180)) + (((~(i12 | i17 | i11)) | i16) * 590) + i13 != 1) {
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                Intrinsics.checkNotNullParameter(bArr, "");
                setcompounddrawabletintblendmode.f61044a = bArr;
                return null;
            }
            byte[] bArr2 = ((setCompoundDrawableTintBlendMode) objArr[0]).f61044a;
            if (bArr2 != null) {
                return bArr2;
            }
            TerminalException terminalException = new TerminalException(10004, null, null);
            mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
            throw terminalException;
        }

        @Override // com.mypinpad.tsdk.isolation.setVerticalScrollbarOverlay
        public final void setDividerPadding(@NotNull byte[] bArr) throws TerminalException {
            setCompoundDrawableTintBlendMode(new Object[]{this, bArr}, -673402930, 673402930, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.setVerticalScrollbarOverlay
        @NotNull
        public final byte[] setOnFocusChangeListener() {
            return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -2017082634, 2017082635, System.identityHashCode(this));
        }
    }

    public final class setOnFocusChangeListener implements component19 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f61046a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f61047b = 1;

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            getDynamicButtonIconTextSpacingDp y7;
            int iIntValue = ((Number) objArr[1]).intValue();
            String str = (String) objArr[2];
            Throwable th2 = (Throwable) objArr[3];
            int i13 = f61046a;
            int i14 = (i13 & 65) + (i13 | 65);
            int i15 = i14 % 128;
            f61047b = i15;
            if (i14 % 2 == 0) {
                throw null;
            }
            if (str != null) {
                y7 = getDisplayExponent.setY(str);
                int i16 = f61046a;
                int i17 = ((i16 | 53) << 1) - (i16 ^ 53);
                f61047b = i17 % 128;
                int i18 = i17 % 2;
            } else {
                int i19 = (i15 & 61) + (i15 | 61);
                f61046a = i19 % 128;
                int i20 = i19 % 2;
                y7 = null;
            }
            mu.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(iIntValue), y7, th2}, -1087921663, 1087921663, iIntValue);
            int i21 = f61047b;
            int i22 = ((i21 | 17) << 1) - (i21 ^ 17);
            f61046a = i22 % 128;
            if (i22 % 2 == 0) {
                return null;
            }
            throw null;
        }

        @Override // com.mypinpad.tsdk.isolation.component19
        public final void setOnFocusChangeListener(int i10, @Nullable String str, @Nullable Throwable th2) {
            setX(new Object[]{this, Integer.valueOf(i10), str, th2}, -1342035828, 1342035828, i10);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/te$setY;", "", "Lcom/mypinpad/tsdk/i/component24;", "setX", "Lcom/mypinpad/tsdk/i/component24;", "setDividerPadding", "<init>", "()V"}, k = 1, mv = {1, 8, 0})
    public static final class setY {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f61048a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f61049b = 1;

        public setY() {
        }

        public /* synthetic */ setY(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            boolean zBooleanValue;
            int i13 = ~i10;
            if ((((~(i13 | i11 | i12)) | (~(i10 | (~i11)))) * 235) + (((~(i13 | i12)) | i11) * (-470)) + (((~((~i12) | i13)) | i11) * (-235)) + (i11 * 471) + (i10 * 236) == 1) {
                int i14 = f61048a + 121;
                f61049b = i14 % 128;
                if (i14 % 2 == 0) {
                    zBooleanValue = ((Boolean) setOnFocusChangeListener(new Object[0], -1851851910, 1851851910, (int) System.currentTimeMillis())).booleanValue();
                    int i15 = 45 / 0;
                } else {
                    zBooleanValue = ((Boolean) setOnFocusChangeListener(new Object[0], -1851851910, 1851851910, (int) System.currentTimeMillis())).booleanValue();
                }
                int i16 = f61048a;
                int i17 = i16 & 25;
                int i18 = ((i16 ^ 25) | i17) << 1;
                int i19 = -((i16 | 25) & (~i17));
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                f61049b = i20 % 128;
                int i21 = i20 % 2;
                return Boolean.valueOf(zBooleanValue);
            }
            int i22 = f61048a;
            int i23 = i22 & 67;
            int i24 = (i22 | 67) & (~i23);
            int i25 = i23 << 1;
            int i26 = (i24 & i25) + (i24 | i25);
            f61049b = i26 % 128;
            int i27 = i26 % 2;
            if (((component24) te.setOnFocusChangeListener(new Object[0], -169079781, 169079783, (int) System.currentTimeMillis())) == null) {
                int i28 = f61049b;
                int i29 = ((i28 | 49) << 1) - (i28 ^ 49);
                f61048a = i29 % 128;
                int i30 = i29 % 2;
                return Boolean.FALSE;
            }
            int i31 = f61049b;
            int i32 = i31 | 27;
            int i33 = i32 << 1;
            int i34 = -((~(i31 & 27)) & i32);
            int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
            int i36 = i35 % 128;
            f61048a = i36;
            int i37 = i35 % 2;
            int i38 = (i36 ^ 57) + ((i36 & 57) << 1);
            f61049b = i38 % 128;
            int i39 = i38 % 2;
            return true;
        }
    }

    static {
        int i10 = f61042b + 7;
        f61043c = i10 % 128;
        int i11 = i10 % 2;
    }

    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object tdVar;
        int i13 = ~((~i10) | i11);
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = (((~((~i12) | i14)) | i13 | i15) * 398) + ((i10 | i11) * (-1194)) + ((i13 | i15 | (~(i14 | i12))) * 398) + (i11 * 399) + (i10 * 399);
        if (i16 == 1) {
            te teVar = (te) objArr[0];
            String str = (String) objArr[1];
            np npVar = (np) objArr[2];
            no noVar = (no) objArr[3];
            nr nrVar = (nr) objArr[4];
            nn nnVar = (nn) objArr[5];
            mz mzVar = (mz) objArr[6];
            int i17 = f61042b;
            int i18 = (i17 | 89) << 1;
            int i19 = -(i17 ^ 89);
            int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
            f61043c = i20 % 128;
            int i21 = i20 % 2;
            td tdVar2 = (td) setOnFocusChangeListener(new Object[]{teVar, str, npVar, noVar, nrVar, nnVar, mzVar, null}, -1141501522, 1141501525, System.identityHashCode(teVar));
            int i22 = f61042b;
            int i23 = ((i22 ^ 96) + ((i22 & 96) << 1)) - 1;
            f61043c = i23 % 128;
            int i24 = i23 % 2;
            return tdVar2;
        }
        if (i16 == 2) {
            int i25 = f61043c;
            int i26 = ((i25 & (-82)) | ((~i25) & 81)) + ((i25 & 81) << 1);
            int i27 = i26 % 128;
            f61042b = i27;
            int i28 = i26 % 2;
            component24 component24Var = f61041a;
            int i29 = ((i27 | 49) << 1) - (i27 ^ 49);
            f61043c = i29 % 128;
            int i30 = i29 % 2;
            return component24Var;
        }
        if (i16 != 3) {
            te teVar2 = (te) objArr[0];
            np npVar2 = (np) objArr[1];
            no noVar2 = (no) objArr[2];
            component15 component15Var = (component15) objArr[3];
            nn nnVar2 = (nn) objArr[4];
            synchronized (teVar2) {
                try {
                    if (!((Boolean) setY.setOnFocusChangeListener(new Object[0], 347816125, -347816124, (int) System.currentTimeMillis())).booleanValue()) {
                        getProcessingTimeout getprocessingtimeout = getProcessingTimeout.INSTANCE;
                        f61041a = (component24) getProcessingTimeout.setX(new Object[]{new setDividerPadding(noVar2), component15Var, new setCompoundDrawableTintBlendMode(), new setOnFocusChangeListener(), nnVar2, npVar2}, 990638892, -990638892, (int) System.currentTimeMillis());
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            tdVar = f61041a;
            if (tdVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                return null;
            }
        } else {
            te teVar3 = (te) objArr[0];
            String str2 = (String) objArr[1];
            np npVar3 = (np) objArr[2];
            no noVar3 = (no) objArr[3];
            nr nrVar2 = (nr) objArr[4];
            nn nnVar3 = (nn) objArr[5];
            mz mzVar2 = (mz) objArr[6];
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(npVar3, "");
            Intrinsics.checkNotNullParameter(noVar3, "");
            Intrinsics.checkNotNullParameter(nrVar2, "");
            Intrinsics.checkNotNullParameter(nnVar3, "");
            Intrinsics.checkNotNullParameter(mzVar2, "");
            teVar3.getClass();
            tdVar = new td(str2, (component24) setOnFocusChangeListener(new Object[]{teVar3, npVar3, noVar3, mzVar2, nnVar3}, 917493174, -917493174, System.identityHashCode(teVar3)), npVar3, noVar3, nrVar2);
            int i31 = f61043c + 13;
            f61042b = i31 % 128;
            if (i31 % 2 != 0) {
                throw null;
            }
        }
        return tdVar;
    }

    public static final /* synthetic */ component24 setX() {
        return (component24) setOnFocusChangeListener(new Object[0], -169079781, 169079783, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ td setX(te teVar, String str, np npVar, no noVar, nr nrVar, nn nnVar, mz mzVar) {
        return (td) setOnFocusChangeListener(new Object[]{teVar, str, npVar, noVar, nrVar, nnVar, mzVar}, 489182964, -489182963, (int) System.currentTimeMillis());
    }

    public final class setDividerPadding implements component17 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ no f61045a;

        public setDividerPadding(@NotNull no noVar) {
            Intrinsics.checkNotNullParameter(noVar, "");
            this.f61045a = noVar;
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            ((Number) objArr[1]).intValue();
            byte[] bArr = new byte[4];
            setdividerpadding.f61045a.setX(bArr);
            return bArr;
        }

        @Override // com.mypinpad.tsdk.isolation.component17
        @NotNull
        public final byte[] setCompoundDrawableTintBlendMode(int i10) {
            return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10)}, 1894576060, -1894576060, i10);
        }
    }
}
