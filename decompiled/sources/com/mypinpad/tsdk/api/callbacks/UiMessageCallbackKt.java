package com.mypinpad.tsdk.api.callbacks;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003*\"\u0010\u0007\"\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004"}, d2 = {"Lcom/mypinpad/tsdk/api/callbacks/UiMessageId;", "", "description", "(Lcom/mypinpad/tsdk/api/callbacks/UiMessageId;)Ljava/lang/String;", "Lkotlin/Function1;", "Lcom/mypinpad/tsdk/api/callbacks/UiMessage;", "", "OnUiMessage"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class UiMessageCallbackKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f51659a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f51660b = 1;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f51661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f51662b;

        static {
            int[] iArr = new int[UiMessageId.valuesCustom().length];
            try {
                iArr[UiMessageId.APPROVED.ordinal()] = 1;
                int i10 = (1 & (-66)) | ((~1) & 65);
                int i11 = -(-((1 & 65) << 1));
                int i12 = (i10 & i11) + (i10 | i11);
                f51661a = i12 % 128;
                int i13 = i12 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UiMessageId.NOT_AUTHORISED.ordinal()] = 2;
                int i14 = f51662b;
                int i15 = i14 ^ 85;
                int i16 = ((((i14 & 85) | i15) << 1) - (~(-i15))) - 1;
                f51661a = i16 % 128;
                int i17 = i16 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UiMessageId.PLEASE_ENTER_PIN.ordinal()] = 3;
                int i18 = f51662b;
                int i19 = i18 & 93;
                int i20 = (i18 ^ 93) | i19;
                int i21 = (i19 & i20) + (i20 | i19);
                f51661a = i21 % 128;
                int i22 = i21 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UiMessageId.PROCESSING_ERROR.ordinal()] = 4;
                int i23 = f51661a;
                int i24 = ((-1) << 1) - ((((i23 | 116) << 1) - (i23 ^ 116)) ^ (-1));
                f51662b = i24 % 128;
                int i25 = i24 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UiMessageId.PRESENT_CARD.ordinal()] = 5;
                int i26 = f51662b;
                int i27 = i26 & 101;
                int i28 = i26 | 101;
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                f51661a = i29 % 128;
                int i30 = i29 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UiMessageId.CARD_READ_OK_PLEASE_REMOVE.ordinal()] = 6;
                int i31 = f51662b;
                int i32 = i31 & 43;
                int i33 = i32 + ((i31 ^ 43) | i32);
                f51661a = i33 % 128;
                int i34 = i33 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[UiMessageId.APPROVED_PLEASE_SIGN.ordinal()] = 7;
                int i35 = f51661a + 25;
                f51662b = i35 % 128;
                int i36 = i35 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[UiMessageId.AUTHORISING_PLEASE_WAIT.ordinal()] = 8;
                int i37 = f51661a;
                int i38 = (i37 & 107) + (i37 | 107);
                f51662b = i38 % 128;
                int i39 = i38 % 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[UiMessageId.TRY_ANOTHER_CARD.ordinal()] = 9;
                int i40 = f51661a;
                int i41 = (i40 | 35) << 1;
                int i42 = -(((~i40) & 35) | (i40 & (-36)));
                int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                f51662b = i43 % 128;
                int i44 = i43 % 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[UiMessageId.CLEAR_DISPLAY.ordinal()] = 10;
                int i45 = f51662b;
                int i46 = i45 & 41;
                int i47 = ((i45 | 41) & (~i46)) + (i46 << 1);
                f51661a = i47 % 128;
                int i48 = i47 % 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[UiMessageId.SEE_PHONE.ordinal()] = 11;
                int i49 = f51661a;
                int i50 = i49 & 21;
                int i51 = (i50 - (~(-(-((i49 ^ 21) | i50))))) - 1;
                f51662b = i51 % 128;
                int i52 = i51 % 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[UiMessageId.PRESENT_CARD_AGAIN.ordinal()] = 12;
                int i53 = f51661a;
                int i54 = ((((i53 ^ 41) | (i53 & 41)) << 1) - (~(-((41 & (~i53)) | (i53 & (-42)))))) - 1;
                f51662b = i54 % 128;
                int i55 = i54 % 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[UiMessageId.HOLD_STILL.ordinal()] = 13;
                int i56 = f51662b;
                int i57 = i56 & 35;
                int i58 = i57 + ((35 ^ i56) | i57);
                f51661a = i58 % 128;
                int i59 = i58 % 2;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
            int i60 = ((-1) << 1) - ((f51662b + 4) ^ (-1));
            f51661a = i60 % 128;
            if (i60 % 2 != 0) {
                int i61 = 56 / 0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0044  */
    /* JADX WARN: Code duplicated, block: B:13:0x005e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0061  */
    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX WARN: Code duplicated, block: B:18:0x007e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0081  */
    /* JADX WARN: Code duplicated, block: B:21:0x0082  */
    /* JADX WARN: Code duplicated, block: B:23:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:26:0x0092  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00df  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:41:0x010a  */
    /* JADX WARN: Code duplicated, block: B:43:0x011e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0121  */
    /* JADX WARN: Code duplicated, block: B:46:0x0122  */
    /* JADX WARN: Code duplicated, block: B:48:0x0135 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0138  */
    /* JADX WARN: Code duplicated, block: B:51:0x0139  */
    /* JADX WARN: Code duplicated, block: B:53:0x0146  */
    /* JADX WARN: Code duplicated, block: B:9:0x003e  */
    @NotNull
    public static final String description(@NotNull UiMessageId uiMessageId) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = f51659a;
        int i17 = i16 & 17;
        int i18 = (i16 | 17) & (~i17);
        int i19 = -(-(i17 << 1));
        int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
        f51660b = i20 % 128;
        if (i20 % 2 != 0) {
            Intrinsics.checkNotNullParameter(uiMessageId, "");
            switch (WhenMappings.$EnumSwitchMapping$0[uiMessageId.ordinal()]) {
                case 1:
                    int i21 = f51659a;
                    int i22 = i21 & 93;
                    int i23 = -(-((i21 ^ 93) | i22));
                    int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                    f51660b = i24 % 128;
                    int i25 = i24 % 2;
                    return "Transaction Approved";
                case 2:
                    int i26 = f51659a + 111;
                    f51660b = i26 % 128;
                    int i27 = i26 % 2;
                    return "Transaction not authorised";
                case 3:
                    int i28 = f51660b;
                    i10 = (((i28 | 32) << 1) - (i28 ^ 32)) - 1;
                    f51659a = i10 % 128;
                    if (i10 % 2 == 0) {
                        return "Please enter pin";
                    }
                    throw null;
                case 4:
                    int i29 = f51660b;
                    int i30 = i29 ^ 7;
                    int i31 = (i29 & 7) << 1;
                    i11 = (i30 & i31) + (i31 | i30);
                    f51659a = i11 % 128;
                    if (i11 % 2 == 0) {
                        return "Transaction processing error";
                    }
                    throw null;
                case 5:
                    int i32 = f51660b;
                    int i33 = i32 ^ 61;
                    int i34 = ((i32 & 61) | i33) << 1;
                    int i35 = -i33;
                    int i36 = ((i34 | i35) << 1) - (i34 ^ i35);
                    f51659a = i36 % 128;
                    int i37 = i36 % 2;
                    return "Please present card";
                case 6:
                    int i38 = f51660b;
                    int i39 = ((i38 | 23) << 1) - (i38 ^ 23);
                    f51659a = i39 % 128;
                    int i40 = i39 % 2;
                    return "Card reading complete, please remove card";
                case 7:
                    int i41 = f51659a + 59;
                    f51660b = i41 % 128;
                    int i42 = i41 % 2;
                    return "Transaction approved, please sign";
                case 8:
                    int i43 = f51660b;
                    int i44 = i43 ^ 33;
                    int i45 = (i43 & 33) << 1;
                    i12 = (i44 ^ i45) + ((i45 & i44) << 1);
                    f51659a = i12 % 128;
                    if (i12 % 2 == 0) {
                        return "Authorising, please wait";
                    }
                    throw null;
                case 9:
                    int i46 = f51659a;
                    int i47 = ((i46 ^ 80) + ((i46 & 80) << 1)) - 1;
                    f51660b = i47 % 128;
                    int i48 = i47 % 2;
                    return "Please try another card";
                case 10:
                    int i49 = f51659a + 32;
                    int i50 = (i49 ^ (-1)) + (i49 << 1);
                    f51660b = i50 % 128;
                    int i51 = i50 % 2;
                    return "Clear display";
                case 11:
                    i13 = f51659a + 83;
                    f51660b = i13 % 128;
                    if (i13 % 2 != 0) {
                        return "Please see phone";
                    }
                    throw null;
                case 12:
                    int i52 = f51660b;
                    i14 = ((((i52 ^ 87) | (i52 & 87)) << 1) - (~(-(((~i52) & 87) | (i52 & (-88)))))) - 1;
                    f51659a = i14 % 128;
                    if (i14 % 2 == 0) {
                        return "Please present card again";
                    }
                    throw null;
                case 13:
                    int i53 = f51660b;
                    int i54 = i53 & 89;
                    int i55 = (i53 | 89) & (~i54);
                    int i56 = -(-(i54 << 1));
                    i15 = ((i55 | i56) << 1) - (i55 ^ i56);
                    f51659a = i15 % 128;
                    if (i15 % 2 == 0) {
                        return "Please hold still";
                    }
                    throw null;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        Intrinsics.checkNotNullParameter(uiMessageId, "");
        int i57 = 12 / 0;
        switch (WhenMappings.$EnumSwitchMapping$0[uiMessageId.ordinal()]) {
            case 1:
                int i210 = f51659a;
                int i211 = i210 & 93;
                int i212 = -(-((i210 ^ 93) | i211));
                int i213 = ((i211 | i212) << 1) - (i212 ^ i211);
                f51660b = i213 % 128;
                int i214 = i213 % 2;
                return "Transaction Approved";
            case 2:
                int i215 = f51659a + 111;
                f51660b = i215 % 128;
                int i216 = i215 % 2;
                return "Transaction not authorised";
            case 3:
                int i217 = f51660b;
                i10 = (((i217 | 32) << 1) - (i217 ^ 32)) - 1;
                f51659a = i10 % 128;
                if (i10 % 2 == 0) {
                    return "Please enter pin";
                }
                throw null;
            case 4:
                int i218 = f51660b;
                int i310 = i218 ^ 7;
                int i311 = (i218 & 7) << 1;
                i11 = (i310 & i311) + (i311 | i310);
                f51659a = i11 % 128;
                if (i11 % 2 == 0) {
                    return "Transaction processing error";
                }
                throw null;
            case 5:
                int i312 = f51660b;
                int i313 = i312 ^ 61;
                int i314 = ((i312 & 61) | i313) << 1;
                int i315 = -i313;
                int i316 = ((i314 | i315) << 1) - (i314 ^ i315);
                f51659a = i316 % 128;
                int i317 = i316 % 2;
                return "Please present card";
            case 6:
                int i318 = f51660b;
                int i319 = ((i318 | 23) << 1) - (i318 ^ 23);
                f51659a = i319 % 128;
                int i410 = i319 % 2;
                return "Card reading complete, please remove card";
            case 7:
                int i411 = f51659a + 59;
                f51660b = i411 % 128;
                int i412 = i411 % 2;
                return "Transaction approved, please sign";
            case 8:
                int i413 = f51660b;
                int i414 = i413 ^ 33;
                int i415 = (i413 & 33) << 1;
                i12 = (i414 ^ i415) + ((i415 & i414) << 1);
                f51659a = i12 % 128;
                if (i12 % 2 == 0) {
                    return "Authorising, please wait";
                }
                throw null;
            case 9:
                int i416 = f51659a;
                int i417 = ((i416 ^ 80) + ((i416 & 80) << 1)) - 1;
                f51660b = i417 % 128;
                int i418 = i417 % 2;
                return "Please try another card";
            case 10:
                int i419 = f51659a + 32;
                int i58 = (i419 ^ (-1)) + (i419 << 1);
                f51660b = i58 % 128;
                int i59 = i58 % 2;
                return "Clear display";
            case 11:
                i13 = f51659a + 83;
                f51660b = i13 % 128;
                if (i13 % 2 != 0) {
                    return "Please see phone";
                }
                throw null;
            case 12:
                int i510 = f51660b;
                i14 = ((((i510 ^ 87) | (i510 & 87)) << 1) - (~(-(((~i510) & 87) | (i510 & (-88)))))) - 1;
                f51659a = i14 % 128;
                if (i14 % 2 == 0) {
                    return "Please present card again";
                }
                throw null;
            case 13:
                int i511 = f51660b;
                int i512 = i511 & 89;
                int i513 = (i511 | 89) & (~i512);
                int i514 = -(-(i512 << 1));
                i15 = ((i513 | i514) << 1) - (i513 ^ i514);
                f51659a = i15 % 128;
                if (i15 % 2 == 0) {
                    return "Please hold still";
                }
                throw null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
