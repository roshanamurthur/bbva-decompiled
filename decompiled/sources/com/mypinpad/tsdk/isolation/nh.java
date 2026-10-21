package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mypinpad.tsdk.api.errors.TerminalException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u00002\u00020\u0001:\u00018B/\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020+j\u0002`,\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b6\u00107J\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0004J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH$J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\rH$J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u000fH$J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0011H$J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0013H$J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0015H$J\b\u0010\u0017\u001a\u00020\u0002H$J\b\u0010\u0018\u001a\u00020\u0002H$J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0019H$J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u001dH\u0016R\u001a\u0010 \u001a\u00020\u001f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010%\u001a\u00020$8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020+j\u0002`,8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00102\u001a\u0002018\u0004X\u0084\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/mypinpad/tsdk/internal/emvlib/OutcomeListener;", "Lcom/mypinpad/softpos/emv/integration/contract/EmvTerminalListener;", "", "dispose", "Lcom/mypinpad/softpos/emv/integration/contract/UiMessageId;", "uiMessageId", "Lcom/mypinpad/softpos/emv/integration/contract/UiRequestData;", "requestData", "Lcom/mypinpad/tsdk/internal/sdk/callbacks/SdkUiMessage;", "getSdkUiMessage", "Lcom/mypinpad/softpos/emv/integration/contract/DeclineRequestOutcome;", "outcome", "handleDeclineRequestOutcome", "Lcom/mypinpad/softpos/emv/integration/contract/IllegalStateOutcome;", "handleIllegalStateOutcome", "Lcom/mypinpad/softpos/emv/integration/contract/OnlineRequestOutcome;", "handleOnlineRequestOutcome", "Lcom/mypinpad/softpos/emv/integration/contract/OnlineRequestWithPinOutcome;", "handleOnlineRequestWithPinOutcome", "Lcom/mypinpad/softpos/emv/integration/contract/PinRequestOutcome;", "handlePinRequestOutcome", "Lcom/mypinpad/softpos/emv/integration/contract/SignatureRequestOutcome;", "handleSignatureRequestOutcome", "handleTimeoutTransactionOutcome", "handleTransactionCancelledOutcome", "Lcom/mypinpad/softpos/emv/integration/contract/TransactionFinishedOutcome;", "handleTransactionFinishedOutcome", "Lcom/mypinpad/softpos/emv/integration/contract/UiOutcome;", "handleUiOutcome", "Lcom/mypinpad/softpos/emv/integration/contract/EmvTerminalOutcome;", "onTerminalOutcome", "Lcom/mypinpad/common/threading/ExecutionContext;", "context", "Lcom/mypinpad/common/threading/ExecutionContext;", "getContext", "()Lcom/mypinpad/common/threading/ExecutionContext;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "disposed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getDisposed", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setDisposed", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "Lkotlin/Function1;", "Lcom/mypinpad/tsdk/internal/sdk/callbacks/OnSdkUiMessage;", "onSdkUiMessage", "Lkotlin/jvm/functions/Function1;", "getOnSdkUiMessage", "()Lkotlin/jvm/functions/Function1;", "Ljava/util/UUID;", "transactionId", "Ljava/util/UUID;", "getTransactionId", "()Ljava/util/UUID;", "<init>", "(Lcom/mypinpad/common/threading/ExecutionContext;Lkotlin/jvm/functions/Function1;Ljava/util/UUID;)V", "Companion", "sdk-android_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOutcomeListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutcomeListener.kt\ncom/mypinpad/tsdk/internal/emvlib/OutcomeListener\n+ 2 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n12#2,3:167\n1#3:170\n*S KotlinDebug\n*F\n+ 1 OutcomeListener.kt\ncom/mypinpad/tsdk/internal/emvlib/OutcomeListener\n*L\n93#1:167,3\n*E\n"})
public abstract class nh implements component20 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static char f57284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static char f57285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static char f57286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static char f57287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f57288i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f57289j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f57290k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f57291l;
    public static final byte[] m = null;

    @NotNull
    public static final setCompoundDrawableTintBlendMode setY;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setVisibility f57292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<sa, Unit> f57293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final UUID f57294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f57295d;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setX", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f57296r0 = 0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f57297s0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ setSystemGestureExclusionRects f57298p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ nh f57299q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(setSystemGestureExclusionRects setsystemgestureexclusionrects, nh nhVar) {
            super(0);
            this.f57298p0 = setsystemgestureexclusionrects;
            this.f57299q0 = nhVar;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            int i13;
            int i14 = ~i11;
            int i15 = i14 | i10;
            if ((((~(i10 | i12)) | (~(i14 | i12)) | (~i15)) * 623) + (((~(i11 | (~i10))) | (~i12)) * (-623)) + ((~(i15 | i12)) * 623) + (i11 * (-622)) + (i10 * 624) != 1) {
                a aVar = (a) objArr[0];
                int i16 = f57297s0;
                int i17 = i16 & 71;
                int i18 = i17 + ((i16 ^ 71) | i17);
                f57296r0 = i18 % 128;
                if (i18 % 2 != 0) {
                    a(new Object[]{aVar}, -1367865725, 1367865726, System.identityHashCode(aVar));
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }
                a(new Object[]{aVar}, -1367865725, 1367865726, System.identityHashCode(aVar));
                Unit unit2 = Unit.INSTANCE;
                int i19 = f57297s0;
                int i20 = i19 & 25;
                int i21 = ((i19 ^ 25) | i20) << 1;
                int i22 = -((i19 | 25) & (~i20));
                int i23 = (i21 & i22) + (i22 | i21);
                f57296r0 = i23 % 128;
                if (i23 % 2 == 0) {
                    return unit2;
                }
                throw null;
            }
            a aVar2 = (a) objArr[0];
            int i24 = f57296r0;
            int i25 = i24 + 17;
            int i26 = i25 % 128;
            f57297s0 = i26;
            int i27 = i25 % 2;
            setSystemGestureExclusionRects setsystemgestureexclusionrects = aVar2.f57298p0;
            boolean z10 = setsystemgestureexclusionrects instanceof setAccessibilityHeading;
            nh nhVar = aVar2.f57299q0;
            if (z10) {
                int i28 = i26 + 51;
                f57296r0 = i28 % 128;
                if (i28 % 2 == 0) {
                    nh.setDividerPadding(nhVar, (setAccessibilityHeading) setsystemgestureexclusionrects);
                    return null;
                }
                nh.setDividerPadding(nhVar, (setAccessibilityHeading) setsystemgestureexclusionrects);
                i13 = 66;
            } else {
                if (setsystemgestureexclusionrects instanceof description) {
                    int i29 = i26 & 55;
                    int i30 = ((~i29) & (i26 | 55)) + (i29 << 1);
                    f57296r0 = i30 % 128;
                    if (i30 % 2 != 0) {
                        nhVar.setOnFocusChangeListener((description) setsystemgestureexclusionrects);
                        throw null;
                    }
                    nhVar.setOnFocusChangeListener((description) setsystemgestureexclusionrects);
                    int i31 = f57297s0;
                    int i32 = i31 & 117;
                    int i33 = (i32 - (~(-(-((i31 ^ 117) | i32))))) - 1;
                    f57296r0 = i33 % 128;
                    if (i33 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                if (setsystemgestureexclusionrects instanceof component21) {
                    int i34 = i24 ^ 35;
                    int i35 = (i24 & 35) << 1;
                    int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
                    f57297s0 = i36 % 128;
                    if (i36 % 2 == 0) {
                        nhVar.setDividerPadding((component21) setsystemgestureexclusionrects);
                        int i37 = 61 / 0;
                    } else {
                        nhVar.setDividerPadding((component21) setsystemgestureexclusionrects);
                    }
                    int i38 = f57297s0;
                    int i39 = ((i38 | 57) << 1) - (((~i38) & 57) | (i38 & (-58)));
                    f57296r0 = i39 % 128;
                    if (i39 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                if (setsystemgestureexclusionrects instanceof setHovered) {
                    int i40 = i24 & 117;
                    int i41 = (((i24 ^ 117) | i40) << 1) - ((i24 | 117) & (~i40));
                    f57297s0 = i41 % 128;
                    int i42 = i41 % 2;
                    nhVar.setOnFocusChangeListener((setHovered) setsystemgestureexclusionrects);
                    int i43 = f57297s0;
                    int i44 = i43 & 49;
                    int i45 = (i43 | 49) & (~i44);
                    int i46 = i44 << 1;
                    int i47 = (i45 & i46) + (i45 | i46);
                    f57296r0 = i47 % 128;
                    if (i47 % 2 == 0) {
                        return null;
                    }
                    i13 = 97;
                } else {
                    if (!(!(setsystemgestureexclusionrects instanceof setAutoSizeTextTypeUniformWithConfiguration))) {
                        int i48 = i26 & 73;
                        int i49 = i26 | 73;
                        int i50 = (i48 & i49) + (i48 | i49);
                        f57296r0 = i50 % 128;
                        int i51 = i50 % 2;
                        nhVar.setCompoundDrawableTintBlendMode((setAutoSizeTextTypeUniformWithConfiguration) setsystemgestureexclusionrects);
                        int i52 = f57296r0;
                        int i53 = (i52 & (-44)) | ((~i52) & 43);
                        int i54 = (i52 & 43) << 1;
                        int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
                        f57297s0 = i55 % 128;
                        int i56 = i55 % 2;
                        return null;
                    }
                    if (!(setsystemgestureexclusionrects instanceof setHintTextColor)) {
                        if (setsystemgestureexclusionrects instanceof setSelectedGroup) {
                            int i57 = i26 + 9;
                            f57296r0 = i57 % 128;
                            int i58 = i57 % 2;
                            nhVar.setX((setSelectedGroup) setsystemgestureexclusionrects);
                            int i59 = f57296r0;
                            int i60 = i59 & 63;
                            int i61 = (((i59 ^ 63) | i60) << 1) - ((i59 | 63) & (~i60));
                            f57297s0 = i61 % 128;
                            if (i61 % 2 != 0) {
                                return null;
                            }
                            throw null;
                        }
                        if (setsystemgestureexclusionrects instanceof setMapTrackballToArrowKeys) {
                            int i62 = i26 & 121;
                            int i63 = ((i26 ^ 121) | i62) << 1;
                            int i64 = -((~i62) & (i26 | 121));
                            int i65 = (i63 ^ i64) + ((i63 & i64) << 1);
                            f57296r0 = i65 % 128;
                            int i66 = i65 % 2;
                            nhVar.setOnDragListener();
                            int i67 = f57296r0;
                            int i68 = (i67 & 125) + (i67 | 125);
                            f57297s0 = i68 % 128;
                            if (i68 % 2 != 0) {
                                return null;
                            }
                            throw null;
                        }
                        if (setsystemgestureexclusionrects instanceof getId) {
                            int i69 = (i26 & 57) + (i26 | 57);
                            f57296r0 = i69 % 128;
                            if (i69 % 2 == 0) {
                                nhVar.setX();
                                return null;
                            }
                            nhVar.setX();
                            throw null;
                        }
                        if (!(!(setsystemgestureexclusionrects instanceof setStateDescription))) {
                            int i70 = i26 & 109;
                            int i71 = (i26 | 109) & (~i70);
                            int i72 = i70 << 1;
                            int i73 = (i71 & i72) + (i72 | i71);
                            f57296r0 = i73 % 128;
                            if (i73 % 2 != 0) {
                                nhVar.setCompoundDrawableTintBlendMode((setStateDescription) setsystemgestureexclusionrects);
                                int i74 = 98 / 0;
                            } else {
                                nhVar.setCompoundDrawableTintBlendMode((setStateDescription) setsystemgestureexclusionrects);
                            }
                            int i75 = f57297s0;
                            int i76 = i75 & 65;
                            int i77 = (((i75 | 65) & (~i76)) - (~(i76 << 1))) - 1;
                            f57296r0 = i77 % 128;
                            int i78 = i77 % 2;
                        }
                        System.identityHashCode(aVar2);
                        System.identityHashCode(aVar2);
                        return null;
                    }
                    int i79 = i26 + 21;
                    f57296r0 = i79 % 128;
                    int i80 = i79 % 2;
                    nhVar.setOnFocusChangeListener((setHintTextColor) setsystemgestureexclusionrects);
                    int i81 = f57296r0;
                    int i82 = i81 & 25;
                    int i83 = ((i81 | 25) & (~i82)) + (i82 << 1);
                    f57297s0 = i83 % 128;
                    if (i83 % 2 != 0) {
                        return null;
                    }
                    i13 = 10;
                }
            }
            int i84 = i13 / 0;
            return null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            return a(new Object[]{this}, 422965412, -422965412, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JK\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/mypinpad/tsdk/internal/emvlib/OutcomeListener$Companion;", "", "()V", "getSdkUiMessage", "Lcom/mypinpad/tsdk/internal/sdk/callbacks/SdkUiMessage;", "id", "Lcom/mypinpad/tsdk/internal/sdk/callbacks/SdkUiMessageId;", "holdTime", "", "value", "sdkValueQualifier", "Lcom/mypinpad/tsdk/internal/sdk/callbacks/SdkValueQualifier;", "sdkCurrency", "Lcom/mypinpad/tsdk/internal/sdk/models/SdkIso4217Currency;", "Lcom/mypinpad/tsdk/internal/sdk/models/SdkCurrency;", "sdkPreferredLanguage", "Lcom/mypinpad/tsdk/internal/sdk/callbacks/SdkLanguagePreference;", "getSdkUiMessage$sdk_android_release", "(Lcom/mypinpad/tsdk/internal/sdk/callbacks/SdkUiMessageId;JLjava/lang/Long;Lcom/mypinpad/tsdk/internal/sdk/callbacks/SdkValueQualifier;Lcom/mypinpad/tsdk/internal/sdk/models/SdkIso4217Currency;Lcom/mypinpad/tsdk/internal/sdk/callbacks/SdkLanguagePreference;)Lcom/mypinpad/tsdk/internal/sdk/callbacks/SdkUiMessage;", "sdk-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class setCompoundDrawableTintBlendMode {
        public setCompoundDrawableTintBlendMode() {
        }

        public /* synthetic */ setCompoundDrawableTintBlendMode(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            sb sbVar = (sb) objArr[0];
            long jLongValue = ((Number) objArr[1]).longValue();
            Long l6 = (Long) objArr[2];
            rz rzVar = (rz) objArr[3];
            sl slVar = (sl) objArr[4];
            rf rfVar = (rf) objArr[5];
            Intrinsics.checkNotNullParameter(sbVar, "");
            Intrinsics.checkNotNullParameter(rzVar, "");
            setX setx = new setX();
            setx.f57303p0 = sbVar;
            setx.f57304q0 = jLongValue;
            setx.f57305r0 = l6;
            setx.f57306s0 = rzVar;
            setx.f57307t0 = slVar;
            setx.f57308u0 = rfVar;
            return setx;
        }

        public static final class setX implements sa {
            public static int E0;
            public static final byte[] F0 = null;
            public static final char[] v0;

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public static int f57300w0;

            /* JADX INFO: renamed from: x0, reason: collision with root package name */
            public static int f57301x0;

            /* JADX INFO: renamed from: y0, reason: collision with root package name */
            public static int f57302y0;

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public /* synthetic */ sb f57303p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public /* synthetic */ long f57304q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public /* synthetic */ Long f57305r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public /* synthetic */ rz f57306s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public /* synthetic */ sl f57307t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public /* synthetic */ rf f57308u0;

            static {
                c();
                f57302y0 = 0;
                E0 = 1;
                f57300w0 = 0;
                f57301x0 = 1;
                v0 = new char[]{59011, 59059};
            }

            public static void a(int[] iArr, Object[] objArr) throws Throwable {
                Class<?> cls;
                int i10;
                int i11;
                int i12;
                Class<?> cls2 = Object.class;
                int i13 = f57302y0 + 93;
                E0 = i13 % 128;
                int i14 = 2;
                int i15 = i13 % 2;
                byte[] bytes = "\u0000\u0000".getBytes("ISO-8859-1");
                setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener();
                int i16 = iArr[0];
                int i17 = 1;
                int i18 = iArr[1];
                int i19 = iArr[2];
                int i20 = iArr[3];
                char[] cArr = v0;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i21 = 0;
                    while (i21 < length) {
                        int i22 = E0 + 63;
                        f57302y0 = i22 % 128;
                        if (i22 % i14 != 0) {
                            try {
                                Object[] objArr2 = new Object[i17];
                                objArr2[0] = Integer.valueOf(cArr[i21]);
                                Map map = setTextScaleX.setMaxEms;
                                Object method = map.get(-637734149);
                                if (method == null) {
                                    Class cls3 = (Class) setTextScaleX.setX((char) Color.red(0), 37 - TextUtils.indexOf("", "", 0, 0), TextUtils.getOffsetAfter("", 0) + TypedValues.MotionType.TYPE_POLAR_RELATIVETO);
                                    byte b10 = (byte) 1;
                                    byte b11 = (byte) (b10 - 1);
                                    Object[] objArr3 = new Object[1];
                                    b(b10, b11, b11, objArr3);
                                    method = cls3.getMethod((String) objArr3[0], Integer.TYPE);
                                    map.put(-637734149, method);
                                }
                                cArr2[i21] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                            } catch (Throwable th2) {
                                Throwable cause = th2.getCause();
                                if (cause == null) {
                                    throw th2;
                                }
                                throw cause;
                            }
                        } else {
                            cls2 = cls2;
                            i19 = i19;
                            length = length;
                            i20 = i20;
                            Object[] objArr4 = {Integer.valueOf(cArr[i21])};
                            Map map2 = setTextScaleX.setMaxEms;
                            Object method2 = map2.get(-637734149);
                            if (method2 == null) {
                                Class cls4 = (Class) setTextScaleX.setX((char) Color.green(0), 37 - TextUtils.indexOf("", "", 0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + TypedValues.MotionType.TYPE_DRAW_PATH);
                                byte b12 = (byte) 1;
                                byte b13 = (byte) (b12 - 1);
                                Object[] objArr5 = new Object[1];
                                b(b12, b13, b13, objArr5);
                                method2 = cls4.getMethod((String) objArr5[0], Integer.TYPE);
                                map2.put(-637734149, method2);
                            }
                            cArr2[i21] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                            i21++;
                        }
                        length = length;
                        i19 = i19;
                        i20 = i20;
                        cls2 = cls2;
                        i14 = 2;
                        i17 = 1;
                    }
                    cls = cls2;
                    i10 = i19;
                    i11 = i20;
                    cArr = cArr2;
                } else {
                    cls = cls2;
                    i10 = i19;
                    i11 = i20;
                }
                char[] cArr3 = new char[i18];
                System.arraycopy(cArr, i16, cArr3, 0, i18);
                if (bytes != null) {
                    int i23 = E0 + 65;
                    f57302y0 = i23 % 128;
                    int i24 = i23 % 2;
                    char[] cArr4 = new char[i18];
                    setnavigationonclicklistener.setX = 0;
                    char c10 = 0;
                    while (true) {
                        int i25 = setnavigationonclicklistener.setX;
                        if (i25 >= i18) {
                            break;
                        }
                        if (bytes[i25] == 1) {
                            int i26 = f57302y0 + 93;
                            E0 = i26 % 128;
                            int i27 = i26 % 2;
                            Object[] objArr6 = {Integer.valueOf(cArr3[i25]), Integer.valueOf(c10)};
                            Map map3 = setTextScaleX.setMaxEms;
                            Object method3 = map3.get(1737824323);
                            if (method3 == null) {
                                Class cls5 = (Class) setTextScaleX.setX((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4450), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 42, TextUtils.lastIndexOf("", '0', 0, 0) + 1022);
                                byte length2 = (byte) F0.length;
                                byte b14 = (byte) (length2 - 4);
                                Object[] objArr7 = new Object[1];
                                b(length2, b14, b14, objArr7);
                                String str = (String) objArr7[0];
                                Class<?> cls6 = Integer.TYPE;
                                method3 = cls5.getMethod(str, cls6, cls6);
                                map3.put(1737824323, method3);
                            }
                            cArr4[i25] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                        } else {
                            Object[] objArr8 = {Integer.valueOf(cArr3[i25]), Integer.valueOf(c10)};
                            Map map4 = setTextScaleX.setMaxEms;
                            Object method4 = map4.get(-504758789);
                            if (method4 == null) {
                                Class cls7 = (Class) setTextScaleX.setX((char) TextUtils.getOffsetBefore("", 0), 45 - TextUtils.indexOf("", "", 0), Color.green(0) + 2627);
                                byte b15 = (byte) 0;
                                byte b16 = b15;
                                Object[] objArr9 = new Object[1];
                                b(b15, b16, b16, objArr9);
                                String str2 = (String) objArr9[0];
                                Class<?> cls8 = Integer.TYPE;
                                method4 = cls7.getMethod(str2, cls8, cls8);
                                map4.put(-504758789, method4);
                            }
                            cArr4[i25] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                        }
                        c10 = cArr4[setnavigationonclicklistener.setX];
                        Object[] objArr10 = {setnavigationonclicklistener, setnavigationonclicklistener};
                        Map map5 = setTextScaleX.setMaxEms;
                        Object method5 = map5.get(-265085633);
                        if (method5 == null) {
                            Class cls9 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31347), 48 - (ViewConfiguration.getTapTimeout() >> 16), 840 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                            byte b17 = (byte) 3;
                            byte b18 = (byte) (b17 - 3);
                            Object[] objArr11 = new Object[1];
                            b(b17, b18, b18, objArr11);
                            method5 = cls9.getMethod((String) objArr11[0], cls, cls);
                            map5.put(-265085633, method5);
                        }
                        ((Method) method5).invoke(null, objArr10);
                    }
                    cArr3 = cArr4;
                }
                if (i11 > 0) {
                    int i28 = f57302y0 + 41;
                    E0 = i28 % 128;
                    if (i28 % 2 == 0) {
                        char[] cArr5 = new char[i18];
                        i12 = 0;
                        System.arraycopy(cArr3, 0, cArr5, 1, i18);
                        int i29 = i11;
                        System.arraycopy(cArr5, 0, cArr3, i18 >> i11, i29);
                        System.arraycopy(cArr5, i29, cArr3, 0, i18 >>> i29);
                    } else {
                        int i30 = i11;
                        i12 = 0;
                        char[] cArr6 = new char[i18];
                        System.arraycopy(cArr3, 0, cArr6, 0, i18);
                        int i31 = i18 - i30;
                        System.arraycopy(cArr6, 0, cArr3, i31, i30);
                        System.arraycopy(cArr6, i30, cArr3, 0, i31);
                    }
                } else {
                    i12 = 0;
                }
                char[] cArr7 = new char[i18];
                while (true) {
                    setnavigationonclicklistener.setX = i12;
                    int i32 = setnavigationonclicklistener.setX;
                    if (i32 >= i18) {
                        break;
                    }
                    cArr7[i32] = cArr3[(i18 - i32) - 1];
                    i12 = i32 + 1;
                }
                if (i10 > 0) {
                    int i33 = f57302y0 + 57;
                    E0 = i33 % 128;
                    int i34 = i33 % 2 == 0 ? 1 : 0;
                    while (true) {
                        setnavigationonclicklistener.setX = i34;
                        int i35 = setnavigationonclicklistener.setX;
                        if (i35 >= i18) {
                            break;
                        }
                        cArr7[i35] = (char) (cArr7[i35] - iArr[2]);
                        i34 = i35 + 1;
                    }
                }
                objArr[0] = new String(cArr7);
            }

            public static void b(byte b10, int i10, short s4, Object[] objArr) {
                int i11 = b10 + 97;
                int i12 = 3 - (s4 * 4);
                int i13 = i10 * 2;
                byte[] bArr = new byte[i13 + 1];
                int i14 = -1;
                byte[] bArr2 = F0;
                if (bArr2 == null) {
                    int i15 = i13 + i12;
                    i12 = i12;
                    objArr = objArr;
                    bArr = bArr;
                    i14 = -1;
                    bArr2 = bArr2;
                    i13 = i13;
                    i11 = i15;
                }
                while (true) {
                    int i16 = i14 + 1;
                    int i17 = i12 + 1;
                    bArr[i16] = (byte) i11;
                    if (i16 == i13) {
                        objArr[0] = new String(bArr, 0);
                        return;
                    }
                    byte b11 = bArr2[i17];
                    int i18 = i11;
                    int i19 = i13;
                    int i20 = b11 + i18;
                    i12 = i17;
                    objArr = objArr;
                    bArr = bArr;
                    i14 = i16;
                    bArr2 = bArr2;
                    i13 = i19;
                    i11 = i20;
                }
            }

            public static void c() {
                F0 = new byte[]{57, 118, 8, 89};
            }

            public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws Throwable {
                setX setx = (setX) objArr[0];
                int i13 = f57300w0 + 67;
                f57301x0 = i13 % 128;
                int i14 = i13 % 2;
                String x4 = setx.setX();
                int i15 = f57300w0 + 9;
                f57301x0 = i15 % 128;
                int i16 = i15 % 2;
                return x4;
            }

            @Override // com.mypinpad.tsdk.isolation.sa
            @Nullable
            public final sl getNavBarTitleString() {
                int i10 = f57301x0;
                int i11 = i10 + 9;
                f57300w0 = i11 % 128;
                int i12 = i11 % 2;
                int i13 = i10 + 21;
                f57300w0 = i13 % 128;
                if (i13 % 2 == 0) {
                    return this.f57307t0;
                }
                throw null;
            }

            @Override // com.mypinpad.tsdk.isolation.sa
            @NotNull
            public final sb setDividerPadding() {
                int i10 = f57301x0 + 9;
                int i11 = i10 % 128;
                f57300w0 = i11;
                if (i10 % 2 != 0) {
                    throw null;
                }
                int i12 = i11 + 7;
                f57301x0 = i12 % 128;
                int i13 = i12 % 2;
                return this.f57303p0;
            }

            @Override // com.mypinpad.tsdk.isolation.sa
            @Nullable
            public final rf setNavigationOnClickListener() {
                int i10 = f57301x0 + 89;
                f57300w0 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 26 / 0;
                }
                return this.f57308u0;
            }

            @Override // com.mypinpad.tsdk.isolation.sa
            @NotNull
            public final rz setOnFocusChangeListener() {
                int i10 = f57300w0 + 105;
                int i11 = i10 % 128;
                f57301x0 = i11;
                int i12 = i10 % 2;
                int i13 = i11 + 35;
                f57300w0 = i13 % 128;
                if (i13 % 2 == 0) {
                    return this.f57306s0;
                }
                throw null;
            }

            @Override // com.mypinpad.tsdk.isolation.getDynamicButtonIconTextSpacingDp
            @NotNull
            public final String setX() throws Throwable {
                String y7;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((int) this.f57303p0.setY());
                sb2.append(AbstractJsonLexerKt.COMMA);
                sb2.append(this.f57304q0);
                Object[] objArr = new Object[1];
                a(new int[]{0, 2, 0, 1}, objArr);
                sb2.append(((String) objArr[0]).intern());
                sb2.append(this.f57305r0);
                Object[] objArr2 = new Object[1];
                a(new int[]{0, 2, 0, 1}, objArr2);
                sb2.append(((String) objArr2[0]).intern());
                sb2.append(this.f57306s0);
                Object[] objArr3 = new Object[1];
                a(new int[]{0, 2, 0, 1}, objArr3);
                sb2.append(((String) objArr3[0]).intern());
                sb2.append(this.f57307t0);
                Object[] objArr4 = new Object[1];
                a(new int[]{0, 2, 0, 1}, objArr4);
                sb2.append(((String) objArr4[0]).intern());
                rf rfVar = this.f57308u0;
                if (rfVar != null) {
                    int i10 = f57301x0 + 45;
                    f57300w0 = i10 % 128;
                    if (i10 % 2 != 0) {
                        y7 = rfVar.setY();
                        int i11 = 30 / 0;
                    } else {
                        y7 = rfVar.setY();
                    }
                } else {
                    y7 = null;
                }
                sb2.append(y7);
                return sb2.toString();
            }

            @Override // com.mypinpad.tsdk.isolation.sa
            public final long setY() {
                int i10 = f57301x0;
                int i11 = i10 + 27;
                f57300w0 = i11 % 128;
                int i12 = i11 % 2;
                int i13 = i10 + 105;
                f57300w0 = i13 % 128;
                int i14 = i13 % 2;
                return this.f57304q0;
            }

            @NotNull
            public final String toString() {
                return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 776960652, -776960652, System.identityHashCode(this));
            }

            @Override // com.mypinpad.tsdk.isolation.sa
            @Nullable
            public final Long setCompoundDrawableTintBlendMode() {
                int i10 = f57301x0 + 113;
                f57300w0 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 48 / 0;
                }
                return this.f57305r0;
            }
        }

        @NotNull
        public static sa setDividerPadding(@NotNull sb sbVar, long j10, @Nullable Long l6, @NotNull rz rzVar, @Nullable sl slVar, @Nullable rf rfVar) {
            return (sa) setDividerPadding(new Object[]{sbVar, Long.valueOf(j10), l6, rzVar, slVar, rfVar}, -1344801733, 1344801733, (int) System.currentTimeMillis());
        }
    }

    public /* synthetic */ class setY {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f57309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f57310b;
        public static final /* synthetic */ int[] setOnFocusChangeListener;

        static {
            int[] iArr = new int[sb.values().length];
            try {
                iArr[sb.setCompoundDrawableTintBlendMode.ordinal()] = 1;
                int i10 = (((1 & (-16)) | ((~1) & 15)) - (~(-(-((1 & 15) << 1))))) - 1;
                f57309a = i10 % 128;
                int i11 = i10 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sb.UiMessageCallbackKtWhenMappings.ordinal()] = 2;
                int i12 = f57310b;
                int i13 = i12 & 61;
                int i14 = ((i12 | 61) & (~i13)) + (i13 << 1);
                f57309a = i14 % 128;
                int i15 = i14 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[sb.getNavBarTitleString.ordinal()] = 3;
                int i16 = f57309a + 19;
                f57310b = i16 % 128;
                int i17 = i16 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            setOnFocusChangeListener = iArr;
            int i18 = f57309a;
            int i19 = ((i18 ^ 55) | (i18 & 55)) << 1;
            int i20 = -(((~i18) & 55) | (i18 & (-56)));
            int i21 = (i19 & i20) + (i20 | i19);
            f57310b = i21 % 128;
            if (i21 % 2 == 0) {
                int i22 = 98 / 0;
            }
        }
    }

    static {
        c();
        f57290k = 0;
        f57291l = 1;
        f57288i = 0;
        f57289j = 1;
        d();
        setY = new setCompoundDrawableTintBlendMode(null);
        int i10 = f57289j + 75;
        f57288i = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nh(@NotNull setVisibility setvisibility, @NotNull Function1<? super sa, Unit> function1, @NotNull UUID uuid) {
        Intrinsics.checkNotNullParameter(setvisibility, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        this.f57292a = setvisibility;
        this.f57293b = function1;
        this.f57294c = uuid;
        this.f57295d = new AtomicBoolean(false);
    }

    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        int i11;
        char[] charArray = str.toCharArray();
        int i12 = f57291l + 41;
        f57290k = i12 % 128;
        int i13 = 2;
        int i14 = i12 % 2;
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        int i15 = 0;
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        char[] cArr2 = new char[2];
        while (true) {
            int i16 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i16 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            int i17 = f57290k + 23;
            f57291l = i17 % 128;
            int i18 = i17 % i13;
            cArr2[i15] = charArray[i16];
            cArr2[1] = charArray[i16 + 1];
            int i19 = 58224;
            int i20 = i15;
            while (i20 < 16) {
                int i21 = f57291l + 79;
                f57290k = i21 % 128;
                int i22 = i21 % i13;
                char c10 = cArr2[1];
                char c11 = cArr2[i15];
                int i23 = (c11 + i19) ^ ((c11 << 4) + ((char) (((long) f57286g) ^ 4333817592127744003L)));
                int i24 = c11 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f57287h);
                    objArr2[i13] = Integer.valueOf(i24);
                    objArr2[1] = Integer.valueOf(i23);
                    objArr2[0] = Integer.valueOf(c10);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (Color.green(0) + 48534), 47 - KeyEvent.normalizeMetaState(0), 2672 - TextUtils.getOffsetAfter("", 0));
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        b(b10, b11, b11, objArr3);
                        String str2 = (String) objArr3[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str2, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr2[1] = cCharValue;
                    Object[] objArr4 = {Integer.valueOf(cArr2[0]), Integer.valueOf((cCharValue + i19) ^ ((cCharValue << 4) + ((char) (((long) f57284e) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f57285f)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 48534), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 46, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2672);
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        b(b12, b13, b13, objArr5);
                        String str3 = (String) objArr5[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str3, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i19 -= 40503;
                    i20++;
                    int i25 = f57290k + 3;
                    f57291l = i25 % 128;
                    int i26 = i25 % 2;
                    i13 = 2;
                    i15 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i27 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            cArr[i27] = cArr2[0];
            cArr[i27 + 1] = cArr2[1];
            Object[] objArr6 = {setalwaysdrawnwithcacheenabled, setalwaysdrawnwithcacheenabled};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 != null) {
                i11 = 2;
            } else {
                Class cls5 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getTouchSlop() >> 8), 37 - Color.red(0), KeyEvent.keyCodeFromString("") + 2145);
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                b(b14, b15, (byte) (b15 + 1), objArr7);
                i11 = 2;
                method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i13 = i11;
            i15 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r7 = 1 - r7
            int r8 = r8 * 2
            int r8 = r8 + 103
            byte[] r0 = new byte[r7]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.nh.m
            if (r2 != 0) goto L19
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r7
            goto L35
        L19:
            r3 = r1
            r5 = r8
            r8 = r7
            r7 = r5
        L1d:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2c:
            r4 = r2[r6]
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r5
        L35:
            int r8 = -r8
            int r7 = r7 + r8
            int r6 = r6 + 1
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.nh.b(byte, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        m = new byte[]{15, -41, -95, -53};
    }

    public static void d() {
        f57287h = (char) 19893;
        f57286g = (char) 42639;
        f57284e = (char) 16937;
        f57285f = (char) 29745;
    }

    public static final /* synthetic */ void setDividerPadding(nh nhVar, setAccessibilityHeading setaccessibilityheading) throws Throwable {
        int i10 = f57289j + 81;
        f57288i = i10 % 128;
        int i11 = i10 % 2;
        setOnFocusChangeListener(new Object[]{nhVar, setaccessibilityheading}, 958877025, -958877025, System.identityHashCode(nhVar));
        int i12 = f57288i + 11;
        f57289j = i12 % 128;
        int i13 = i12 % 2;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        nh nhVar = (nh) objArr[0];
        setAccessibilityHeading setaccessibilityheading = (setAccessibilityHeading) objArr[1];
        int i13 = f57288i + 101;
        f57289j = i13 % 128;
        int i14 = i13 % 2;
        sa dividerPadding = setDividerPadding((setClipChildren) setAccessibilityHeading.setY(new Object[]{setaccessibilityheading}, -1450404791, 1450404792, System.identityHashCode(setaccessibilityheading)), (setProgressTintList) setAccessibilityHeading.setY(new Object[]{setaccessibilityheading}, -639969926, 639969926, System.identityHashCode(setaccessibilityheading)));
        mu.setCompoundDrawableTintBlendMode(new Object[]{130005, dividerPadding, null, 4}, -1968587119, 1968587120, 130005);
        int i15 = setY.setOnFocusChangeListener[dividerPadding.setDividerPadding().ordinal()];
        if (i15 == 1) {
            pc.setY(new pg(nhVar.f57294c));
        } else if (i15 == 2) {
            pc.setY(new pm(nhVar.f57294c));
            int i16 = f57289j + 41;
            f57288i = i16 % 128;
            int i17 = i16 % 2;
        } else if (i15 == 3) {
            pc.setY(new ox(nhVar.f57294c));
        }
        try {
            nhVar.f57293b.invoke(dividerPadding);
            return null;
        } catch (Exception e5) {
            pc.setY(new ou(nhVar.f57294c, null, 10051, dividerPadding, 2, null));
            TerminalException terminalException = new TerminalException(16, e5.toString(), e5);
            mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
            throw terminalException;
        }
    }

    @NotNull
    public final setVisibility setCompoundDrawableTintBlendMode() {
        int i10 = f57289j;
        int i11 = i10 + 123;
        f57288i = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 125;
        f57288i = i13 % 128;
        if (i13 % 2 == 0) {
            return this.f57292a;
        }
        throw null;
    }

    public abstract void setCompoundDrawableTintBlendMode(@NotNull setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration);

    public abstract void setCompoundDrawableTintBlendMode(@NotNull setStateDescription setstatedescription);

    public abstract void setDividerPadding(@NotNull component21 component21Var);

    public abstract void setOnDragListener();

    public abstract void setOnFocusChangeListener(@NotNull description descriptionVar);

    public abstract void setOnFocusChangeListener(@NotNull setHintTextColor sethinttextcolor);

    public abstract void setOnFocusChangeListener(@NotNull setHovered sethovered);

    public abstract void setX();

    public abstract void setX(@NotNull setSelectedGroup setselectedgroup);

    @Override // com.mypinpad.tsdk.isolation.component20
    public final void setY(@NotNull byte[] bArr) {
        int i10 = f57289j + 53;
        f57288i = i10 % 128;
        int i11 = i10 % 2;
        component20.setDividerPadding.setCompoundDrawableTintBlendMode(new Object[]{this, bArr}, -669423152, 669423152, (int) System.currentTimeMillis());
        int i12 = f57288i + 61;
        f57289j = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.mypinpad.tsdk.isolation.component20
    public void setCompoundDrawableTintBlendMode(@NotNull setSystemGestureExclusionRects setsystemgestureexclusionrects) throws Throwable {
        Intrinsics.checkNotNullParameter(setsystemgestureexclusionrects, "");
        mr mrVar = mr.setOnDragListener;
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a("⍂苍䪛\uf283ᡙ泂쯖꾯䚮\u082f뉗돿眢欻륰➥님캢", 18 - Color.argb(0, 0, 0, 0), objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(setsystemgestureexclusionrects);
        mt.setX(new Object[]{mrVar, sb2.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
        getDynamicButtonIconTextSpacingDp dividerPadding = mw.setDividerPadding(setsystemgestureexclusionrects);
        AtomicBoolean atomicBoolean = this.f57295d;
        mu.setCompoundDrawableTintBlendMode(new Object[]{130004, getDisplayExponent.setCompoundDrawableTintBlendMode(dividerPadding, getDisplayExponent.setDividerPadding(atomicBoolean.get())), null, 4}, -1968587119, 1968587120, 130004);
        if (!atomicBoolean.get()) {
            this.f57292a.execute(new a(setsystemgestureexclusionrects, this));
            return;
        }
        int i10 = f57288i + 15;
        f57289j = i10 % 128;
        int i11 = i10 % 2;
    }

    public final void setDividerPadding() throws Throwable {
        int i10 = f57288i + 71;
        f57289j = i10 % 128;
        int i11 = i10 % 2;
        AtomicBoolean atomicBoolean = this.f57295d;
        if (i11 == 0) {
            mr mrVar = mr.setOnDragListener;
            Object[] objArr = new Object[1];
            a("웅ፆ\ud8b3胘瑂ꨏ\uf0c9從", 101 >> (ViewConfiguration.getMinimumFlingVelocity() - 74), objArr);
            mt.setX(new Object[]{mrVar, ((String) objArr[0]).intern()}, -225944049, 225944051, (int) System.currentTimeMillis());
            atomicBoolean.set(false);
            return;
        }
        mr mrVar2 = mr.setOnDragListener;
        Object[] objArr2 = new Object[1];
        a("웅ፆ\ud8b3胘瑂ꨏ\uf0c9從", 7 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
        mt.setX(new Object[]{mrVar2, ((String) objArr2[0]).intern()}, -225944049, 225944051, (int) System.currentTimeMillis());
        atomicBoolean.set(true);
    }

    @NotNull
    public final Function1<sa, Unit> setY() {
        int i10 = f57288i + 53;
        int i11 = i10 % 128;
        f57289j = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 9;
        f57288i = i13 % 128;
        if (i13 % 2 == 0) {
            return this.f57293b;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x005c A[PHI: r13
      0x005c: PHI (r13v13 com.mypinpad.tsdk.i.sb) = (r13v3 com.mypinpad.tsdk.i.sb), (r13v16 com.mypinpad.tsdk.i.sb) binds: [B:8:0x0041, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0043 A[PHI: r13
      0x0043: PHI (r13v4 com.mypinpad.tsdk.i.sb) = (r13v3 com.mypinpad.tsdk.i.sb), (r13v16 com.mypinpad.tsdk.i.sb) binds: [B:8:0x0041, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    @NotNull
    public static sa setDividerPadding(@NotNull setClipChildren setclipchildren, @Nullable setProgressTintList setprogresstintlist) throws Throwable {
        sb sbVar;
        long jLongValue;
        Long l6;
        rz compoundDrawableTintBlendMode;
        byte[] bArr;
        component14 component14Var;
        setOnItemLongClickListener setonitemlongclicklistener;
        int i10 = f57289j + 79;
        f57288i = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setclipchildren, "");
            sbVar = (sb) nc.setDividerPadding(new Object[]{setclipchildren}, -709068470, 709068470, (int) System.currentTimeMillis());
            int i11 = 66 / 0;
            if (setprogresstintlist != null) {
                jLongValue = ((Long) setProgressTintList.setCompoundDrawableTintBlendMode(new Object[]{setprogresstintlist}, 1545724039, -1545724034, System.identityHashCode(setprogresstintlist))).longValue();
            } else {
                jLongValue = 0;
            }
        } else {
            Intrinsics.checkNotNullParameter(setclipchildren, "");
            sbVar = (sb) nc.setDividerPadding(new Object[]{setclipchildren}, -709068470, 709068470, (int) System.currentTimeMillis());
            if (setprogresstintlist != null) {
                jLongValue = ((Long) setProgressTintList.setCompoundDrawableTintBlendMode(new Object[]{setprogresstintlist}, 1545724039, -1545724034, System.identityHashCode(setprogresstintlist))).longValue();
            } else {
                jLongValue = 0;
            }
        }
        rf y7 = null;
        if (setprogresstintlist != null) {
            int i12 = f57288i + 87;
            f57289j = i12 % 128;
            if (i12 % 2 == 0) {
                l6 = (Long) setProgressTintList.setCompoundDrawableTintBlendMode(new Object[]{setprogresstintlist}, 20953999, -20953998, System.identityHashCode(setprogresstintlist));
                int i13 = 43 / 0;
            } else {
                l6 = (Long) setProgressTintList.setCompoundDrawableTintBlendMode(new Object[]{setprogresstintlist}, 20953999, -20953998, System.identityHashCode(setprogresstintlist));
            }
        } else {
            l6 = null;
        }
        if (setprogresstintlist == null || (setonitemlongclicklistener = (setOnItemLongClickListener) setProgressTintList.setCompoundDrawableTintBlendMode(new Object[]{setprogresstintlist}, -1931532234, 1931532237, System.identityHashCode(setprogresstintlist))) == null || (compoundDrawableTintBlendMode = nc.setCompoundDrawableTintBlendMode(setonitemlongclicklistener)) == null) {
            compoundDrawableTintBlendMode = rz.setCompoundDrawableTintBlendMode;
        }
        sl slVar = (setprogresstintlist == null || (component14Var = (component14) setProgressTintList.setCompoundDrawableTintBlendMode(new Object[]{setprogresstintlist}, 1312334878, -1312334874, System.identityHashCode(setprogresstintlist))) == null) ? null : new sl(component14Var.setOnFocusChangeListener());
        if (setprogresstintlist != null && (bArr = (byte[]) setProgressTintList.setCompoundDrawableTintBlendMode(new Object[]{setprogresstintlist}, -614920731, 614920731, System.identityHashCode(setprogresstintlist))) != null) {
            y7 = nc.setY(bArr);
        }
        sa saVar = (sa) setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{sbVar, Long.valueOf(jLongValue), l6, compoundDrawableTintBlendMode, slVar, y7}, -1344801733, 1344801733, (int) System.currentTimeMillis());
        int i14 = f57288i + 111;
        f57289j = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 79 / 0;
        }
        return saVar;
    }

    @NotNull
    public final AtomicBoolean setOnFocusChangeListener() {
        int i10 = f57288i + 117;
        int i11 = i10 % 128;
        f57289j = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        AtomicBoolean atomicBoolean = this.f57295d;
        int i12 = i11 + 83;
        f57288i = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 19 / 0;
        }
        return atomicBoolean;
    }
}
