package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.camera.camera2.internal.n1;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020 \u0012\u0006\u0010\u0007\u001a\u00020!\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b#\u0010$JQ\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001a\u001a\u00020\u000f8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001f\u001a\u00020\u001b8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d\"\u0004\b\u0011\u0010\u001e"}, d2 = {"Lcom/mypinpad/tsdk/i/oh;", "Lcom/mypinpad/tsdk/i/nt;", "Landroid/content/Context;", "p0", "Lkotlin/Function1;", "Lcom/mypinpad/tsdk/i/px;", "", "p1", "Lcom/mypinpad/tsdk/i/ue;", "Lcom/mypinpad/tsdk/i/ug;", "p2", "", "p3", "Ljava/util/UUID;", "p4", "Lcom/mypinpad/tsdk/i/getEnableLocalAttestationForDebugBuilds;", "p5", "setY", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lcom/mypinpad/tsdk/i/ue;Ljava/lang/String;Ljava/util/UUID;Lcom/mypinpad/tsdk/i/getEnableLocalAttestationForDebugBuilds;)V", "setCompoundDrawableTintBlendMode", "()V", "setDividerPadding", "Lcom/mypinpad/tsdk/i/getEnableLocalAttestationForDebugBuilds;", "()Lcom/mypinpad/tsdk/i/getEnableLocalAttestationForDebugBuilds;", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/getEnableLocalAttestationForDebugBuilds;)V", "setX", "Lcom/mypinpad/tsdk/i/setBackgroundDrawable;", "Lcom/mypinpad/tsdk/i/setBackgroundDrawable;", "()Lcom/mypinpad/tsdk/i/setBackgroundDrawable;", "(Lcom/mypinpad/tsdk/i/setBackgroundDrawable;)V", "setNavigationOnClickListener", "Lcom/mypinpad/tsdk/i/component28;", "Lcom/mypinpad/tsdk/i/setFooterDividersEnabled;", "Lcom/mypinpad/tsdk/i/re;", "<init>", "(Lcom/mypinpad/tsdk/i/component28;Lcom/mypinpad/tsdk/i/setFooterDividersEnabled;Lcom/mypinpad/tsdk/i/re;)V"}, k = 1, mv = {1, 8, 0})
public final class oh extends nt {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final char[] f57466k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f57467l;
    public static final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final boolean f57468n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f57469o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f57470p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f57471q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f57472r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f57473s = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final component28 f57474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final setFooterDividersEnabled f57475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Function1<? super px, Unit> f57476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ue<ug> f57477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final vh f57478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f57479i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f57480j;

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    public setBackgroundDrawable setNavigationOnClickListener;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    public getEnableLocalAttestationForDebugBuilds setX;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/px;", "p0", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/px;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Lambda implements Function1<px, Unit> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f57481r0 = 0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f57482s0 = 1;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<px, Unit> f57484q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super px, Unit> function1) {
            super(1);
            this.f57484q0 = function1;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i11;
            int i14 = i10 | i12;
            if (((i13 | i14) * 668) + ((i10 | (~(i13 | i12))) * 1336) + (((~i14) | i13) * (-668)) + (i11 * (-667)) + (i10 * (-1335)) == 1) {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                int i15 = f57482s0;
                int i16 = ((i15 | 39) << 1) - (i15 ^ 39);
                f57481r0 = i16 % 128;
                px pxVar = (px) obj;
                if (i16 % 2 != 0) {
                    a(new Object[]{aVar, pxVar}, -1502531696, 1502531696, System.identityHashCode(aVar));
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }
                a(new Object[]{aVar, pxVar}, -1502531696, 1502531696, System.identityHashCode(aVar));
                Unit unit2 = Unit.INSTANCE;
                int i17 = f57481r0;
                int i18 = (i17 & 7) + (i17 | 7);
                f57482s0 = i18 % 128;
                int i19 = i18 % 2;
                return unit2;
            }
            a aVar2 = (a) objArr[0];
            px pxVar2 = (px) objArr[1];
            int i20 = f57482s0;
            int i21 = (i20 & (-76)) | ((~i20) & 75);
            int i22 = (i20 & 75) << 1;
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            f57481r0 = i23 % 128;
            int i24 = i23 % 2;
            Intrinsics.checkNotNullParameter(pxVar2, "");
            if (!oh.setX(oh.this).get()) {
                int iIdentityHashCode = System.identityHashCode(aVar2);
                int i25 = ~iIdentityHashCode;
                int i26 = ~((1255265288 & i25) | (1255265288 ^ i25));
                int i27 = -(-(((i26 & (-1475300062)) | ((-1475300062) ^ i26)) * (-865)));
                int i28 = (513019822 & i27) + (i27 | 513019822);
                int i29 = (-1255265289) & iIdentityHashCode;
                int i30 = (~i29) & ((-1255265289) | iIdentityHashCode);
                int i31 = (i29 & i30) | (i30 ^ i29);
                int i32 = ~i31;
                int i33 = ((i31 | i32) & i32) * 865;
                int i34 = ((~i33) & i28) | ((~i28) & i33);
                int i35 = -(-((i33 & i28) << 1));
                int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                int i37 = ~(((-1475300062) & i25) | ((-1475300062) ^ i25));
                int i38 = (iIdentityHashCode | i25) & i25;
                int i39 = (i38 & (-1255265289)) | (i38 ^ (-1255265289));
                int i40 = ~i39;
                int i41 = (i39 | i40) & i40;
                int i42 = ((~i41) & i37) | ((~i37) & i41);
                int i43 = i41 & i37;
                int i44 = -(~(((i43 & i42) | (i42 ^ i43)) * 865));
                int i45 = ((i36 & i44) + (i44 | i36)) - 1;
                int iIdentityHashCode2 = System.identityHashCode(aVar2);
                int i46 = ~iIdentityHashCode2;
                int i47 = 849135637 & i46;
                int i48 = (~i47) & (849135637 | i46);
                int i49 = (i48 & i47) | (i48 ^ i47);
                int i50 = ~i49;
                int i51 = (i49 | i50) & i50;
                int i52 = 557864756 ^ i51;
                int i53 = i51 & 557864756;
                int i54 = -(-(((i53 & i52) | (i52 ^ i53)) * 226));
                int i55 = (((-1737399584) ^ i54) | ((-1737399584) & i54)) << 1;
                int i56 = -((i54 & 1737399583) | ((-1737399584) & (~i54)));
                int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                int i58 = (-557864757) & iIdentityHashCode2;
                int i59 = (~i58) & ((-557864757) | iIdentityHashCode2);
                int i60 = ~((i59 ^ i58) | (i58 & i59));
                int i61 = (536887316 & (~i60)) | (i60 & (-536887317));
                int i62 = 536887316 & i60;
                int i63 = (i61 ^ i62) | (i62 & i61);
                int i64 = i46 & (i46 | iIdentityHashCode2);
                int i65 = ((~i64) & 849135637) | (i64 & (-849135638));
                int i66 = i64 & 849135637;
                int i67 = (i65 ^ i66) | (i66 & i65);
                int i68 = ((-557864757) & i67) | ((~i67) & 557864756);
                int i69 = i67 & 557864756;
                int i70 = ~((i69 & i68) | (i68 ^ i69));
                int i71 = i63 & i70;
                int i72 = (i70 | i63) & (~i71);
                int i73 = ((i72 & i71) | (i72 ^ i71)) * (-113);
                int i74 = i57 & i73;
                int i75 = i74 + ((i73 ^ i57) | i74);
                int i76 = (~((iIdentityHashCode2 & 849135637) | (iIdentityHashCode2 & (-849135638)) | i47)) * 113;
                int i77 = i75 & i76;
                int i78 = ((i75 ^ i76) | i77) << 1;
                int i79 = -((i76 | i75) & (~i77));
                int i80 = (i78 & i79) + (i79 | i78);
                Function1<px, Unit> function1 = aVar2.f57484q0;
                if (i45 <= i80) {
                    function1.invoke(pxVar2);
                    throw null;
                }
                function1.invoke(pxVar2);
            }
            int i81 = f57481r0 + 31;
            f57482s0 = i81 % 128;
            if (i81 % 2 != 0) {
                return null;
            }
            int i82 = 1 / 0;
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(px pxVar) {
            return a(new Object[]{this, pxVar}, -2099457971, 2099457972, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setX", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f57485q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f57486r0 = 1;

        public b() {
            super(0);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~((~i10) | (~i11));
            int i14 = ~i12;
            int i15 = ((i13 | (~(i14 | i10 | i11))) * (-828)) + (i11 * 829) + (i10 * 829);
            int i16 = i10 | i11;
            if (((~i16) * 828) + ((i16 | i14) * (-828)) + i15 != 1) {
                b bVar = (b) objArr[0];
                int i17 = f57486r0;
                int i18 = i17 ^ 59;
                int i19 = ((i17 & 59) | i18) << 1;
                int i20 = -i18;
                int i21 = (i19 & i20) + (i19 | i20);
                f57485q0 = i21 % 128;
                if (i21 % 2 == 0) {
                    a(new Object[]{bVar}, -971780024, 971780025, System.identityHashCode(bVar));
                    return Unit.INSTANCE;
                }
                a(new Object[]{bVar}, -971780024, 971780025, System.identityHashCode(bVar));
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            b bVar2 = (b) objArr[0];
            int i22 = f57486r0;
            int i23 = i22 & 105;
            int i24 = -(-(i22 | 105));
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            f57485q0 = i25 % 128;
            int i26 = i25 % 2;
            oh.setX(oh.this).set(true);
            oh ohVar = oh.this;
            if (ohVar.setNavigationOnClickListener != null) {
                int i27 = f57485q0 + 101;
                f57486r0 = i27 % 128;
                if (i27 % 2 == 0) {
                    ohVar.setOnFocusChangeListener().setX();
                    throw null;
                }
                ohVar.setOnFocusChangeListener().setX();
            }
            if (ohVar.setX != null) {
                int i28 = f57485q0;
                int i29 = i28 & 85;
                int i30 = i29 + ((i28 ^ 85) | i29);
                f57486r0 = i30 % 128;
                if (i30 % 2 == 0) {
                    ohVar.setY().setOnFocusChangeListener();
                    throw null;
                }
                ohVar.setY().setOnFocusChangeListener();
                int i31 = f57486r0;
                int i32 = i31 & 51;
                int i33 = i31 | 51;
                int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                f57485q0 = i34 % 128;
                int i35 = i34 % 2;
            }
            oh.setCompoundDrawableTintBlendMode(ohVar).setY();
            int i36 = f57485q0;
            int i37 = ((((i36 ^ 23) | (i36 & 23)) << 1) - (~(-(((~i36) & 23) | (i36 & (-24)))))) - 1;
            f57486r0 = i37 % 128;
            int i38 = i37 % 2;
            return null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            return a(new Object[]{this}, 829234912, -829234912, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "p0", "p1", "", "setX", "(FF)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c extends Lambda implements Function2<Float, Float, Unit> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f57488r0 = 0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f57489s0 = 1;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ setVisibility f57491q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(setVisibility setvisibility) {
            super(2);
            this.f57491q0 = setvisibility;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            int i13 = ((~i11) * (-783)) + (i11 * (-782)) + (i10 * 784);
            int i14 = ~i10;
            int i15 = ~i12;
            int i16 = ((i14 | (~(i11 | i15))) * 783) + ((~(i14 | i15 | i11)) * (-783)) + i13;
            Unit unit = null;
            if (i16 != 1) {
                c cVar = (c) objArr[0];
                float fFloatValue = ((Number) objArr[1]).floatValue();
                float fFloatValue2 = ((Number) objArr[2]).floatValue();
                oh ohVar = oh.this;
                oh.setDividerPadding(ohVar, cVar.f57491q0, new m7(ohVar, fFloatValue, fFloatValue2));
                int i17 = f57489s0;
                int i18 = i17 & 19;
                int i19 = (i17 | 19) & (~i18);
                int i20 = i18 << 1;
                int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                f57488r0 = i21 % 128;
                int i22 = i21 % 2;
            } else {
                c cVar2 = (c) objArr[0];
                Object obj = objArr[1];
                Object obj2 = objArr[2];
                int i23 = f57489s0;
                int i24 = i23 & 97;
                int i25 = (i23 | 97) & (~i24);
                int i26 = i24 << 1;
                int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
                f57488r0 = i27 % 128;
                Number number = (Number) obj;
                if (i27 % 2 != 0) {
                    a(new Object[]{cVar2, Float.valueOf(number.floatValue()), Float.valueOf(((Number) obj2).floatValue())}, -1136291622, 1136291622, System.identityHashCode(cVar2));
                    Unit unit2 = Unit.INSTANCE;
                    throw null;
                }
                a(new Object[]{cVar2, Float.valueOf(number.floatValue()), Float.valueOf(((Number) obj2).floatValue())}, -1136291622, 1136291622, System.identityHashCode(cVar2));
                unit = Unit.INSTANCE;
                int i28 = f57488r0;
                int i29 = (i28 & (-64)) | ((~i28) & 63);
                int i30 = (i28 & 63) << 1;
                int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                f57489s0 = i31 % 128;
                if (i31 % 2 == 0) {
                    int i32 = 17 / 0;
                }
            }
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Float f6, Float f10) {
            return a(new Object[]{this, f6, f10}, 1818320378, -1818320377, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "p0", "p1", "", "setY", "(II)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class d extends Lambda implements Function2<Integer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ setVisibility f57493q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(setVisibility setvisibility) {
            super(2);
            this.f57493q0 = setvisibility;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            int i13 = ~i10;
            int i14 = ~(i13 | i11);
            int i15 = ~(i13 | i12);
            int i16 = ~i11;
            int i17 = ((i15 | (~(i16 | i12))) * 140) + ((i14 | i15) * (-280)) + (i11 * (-139)) + (i10 * 141);
            int i18 = ~(i13 | i16 | i12);
            int i19 = ~i12;
            if ((((~(i10 | i19 | i16)) | (~(i11 | i13 | i19)) | i18) * 140) + i17 != 1) {
                d dVar = (d) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int iIntValue2 = ((Number) objArr[2]).intValue();
                oh ohVar = oh.this;
                oh.setDividerPadding(ohVar, dVar.f57493q0, new n7(ohVar, iIntValue, iIntValue2));
                return null;
            }
            d dVar2 = (d) objArr[0];
            Object obj = objArr[1];
            Object obj2 = objArr[2];
            int iIntValue3 = ((Number) obj).intValue();
            a(new Object[]{dVar2, Integer.valueOf(iIntValue3), Integer.valueOf(((Number) obj2).intValue())}, 1840111859, -1840111859, iIntValue3);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Integer num, Integer num2) {
            return a(new Object[]{this, num, num2}, -2019196626, 2019196627, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setOnFocusChangeListener", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class e extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ setVisibility f57495q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(setVisibility setvisibility) {
            super(0);
            this.f57495q0 = setvisibility;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            int i13 = ~i10;
            int i14 = ~i12;
            int i15 = ~(i13 | i14);
            int i16 = ~i11;
            int i17 = i13 | i16;
            if ((((~(i10 | i16 | i12)) | (~(i11 | i13 | i12)) | (~(i17 | i14))) * 867) + (((~i17) | (~(i13 | i12)) | (~(i16 | i12))) * (-1734)) + ((i15 | (~(i16 | i14))) * (-867)) + (i11 * 868) + (i10 * 868) == 1) {
                e eVar = (e) objArr[0];
                a(new Object[]{eVar}, -1830381108, 1830381108, System.identityHashCode(eVar));
                return Unit.INSTANCE;
            }
            e eVar2 = (e) objArr[0];
            oh ohVar = oh.this;
            oh.setDividerPadding(ohVar, eVar2.f57495q0, new o7(ohVar));
            return null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            return a(new Object[]{this}, -650804341, 650804342, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setX", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class f extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ setVisibility f57497q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(setVisibility setvisibility) {
            super(0);
            this.f57497q0 = setvisibility;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            int i13 = ~i11;
            int i14 = ~i12;
            if ((((~(i10 | i14 | i11)) | (~(i12 | i13)) | (~((~i10) | i13))) * 988) + ((i10 | i13) * (-988)) + (((~(i13 | i14 | i10)) | (~(i10 | i11 | i12))) * 988) + (i11 * (-987)) + (i10 * 989) == 1) {
                f fVar = (f) objArr[0];
                a(new Object[]{fVar}, -409591953, 409591953, System.identityHashCode(fVar));
                return Unit.INSTANCE;
            }
            f fVar2 = (f) objArr[0];
            oh ohVar = oh.this;
            oh.setDividerPadding(ohVar, fVar2.f57497q0, new p7(ohVar));
            return null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            return a(new Object[]{this}, -1040868571, 1040868572, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setX", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class g extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f57498u0 = 0;
        public static int v0 = 1;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f57500q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ UUID f57501r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Context f57502s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ setCompoundDrawableTintBlendMode f57503t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, UUID uuid, Context context, setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode) {
            super(0);
            this.f57500q0 = str;
            this.f57501r0 = uuid;
            this.f57502s0 = context;
            this.f57503t0 = setcompounddrawabletintblendmode;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            int i13 = ~i12;
            int i14 = i13 | i10;
            int i15 = ((~(i14 | i11)) * 52) + (i11 * 53) + (i10 * (-51));
            int i16 = ~i11;
            int i17 = (((~i14) | (~(i16 | i10)) | (~(i16 | i13))) * (-52)) + i15;
            int i18 = ~i10;
            int i19 = (((~(i18 | i11)) | (~(i13 | i18))) * 52) + i17;
            Unit unit = null;
            if (i19 != 1) {
                g gVar = (g) objArr[0];
                int i20 = v0;
                int i21 = i20 & 63;
                int i22 = (i20 ^ 63) | i21;
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                f57498u0 = i23 % 128;
                if (i23 % 2 != 0) {
                    a(new Object[]{gVar}, 1352078112, -1352078111, System.identityHashCode(gVar));
                    Unit unit2 = Unit.INSTANCE;
                    throw null;
                }
                a(new Object[]{gVar}, 1352078112, -1352078111, System.identityHashCode(gVar));
                unit = Unit.INSTANCE;
                int i24 = v0;
                int i25 = i24 & 39;
                int i26 = ((i24 ^ 39) | i25) << 1;
                int i27 = -((i24 | 39) & (~i25));
                int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                f57498u0 = i28 % 128;
                if (i28 % 2 != 0) {
                    int i29 = 7 / 0;
                }
            } else {
                g gVar2 = (g) objArr[0];
                int i30 = v0 + 75;
                f57498u0 = i30 % 128;
                if (i30 % 2 != 0) {
                    oh ohVar = oh.this;
                    String str = gVar2.f57500q0;
                    UUID uuid = gVar2.f57501r0;
                    oh.setY(ohVar, str, uuid);
                    oh.setOnFocusChangeListener(new Object[]{oh.this, gVar2.f57502s0, uuid, gVar2.f57503t0}, 1716017903, -1716017899, (int) System.currentTimeMillis());
                    throw null;
                }
                oh ohVar2 = oh.this;
                String str2 = gVar2.f57500q0;
                UUID uuid2 = gVar2.f57501r0;
                oh.setY(ohVar2, str2, uuid2);
                oh.setOnFocusChangeListener(new Object[]{oh.this, gVar2.f57502s0, uuid2, gVar2.f57503t0}, 1716017903, -1716017899, (int) System.currentTimeMillis());
                int i31 = f57498u0;
                int i32 = ((i31 | 93) << 1) - (i31 ^ 93);
                v0 = i32 % 128;
                int i33 = i32 % 2;
            }
            return unit;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            return a(new Object[]{this}, 568459205, -568459205, System.identityHashCode(this));
        }
    }

    public static final class setCompoundDrawableTintBlendMode extends setVisibility {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1<px, Unit> f57504a;

        /* JADX WARN: Multi-variable type inference failed */
        public setCompoundDrawableTintBlendMode(Function1<? super px, Unit> function1) {
            this.f57504a = function1;
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) objArr[0];
            Throwable th2 = (Throwable) objArr[1];
            Intrinsics.checkNotNullParameter(th2, "");
            setcompounddrawabletintblendmode.f57504a.invoke(new ps(th2));
            return null;
        }

        @Override // com.mypinpad.tsdk.isolation.setVisibility
        public final void exceptionHandler(@NotNull Throwable th2) {
            setOnFocusChangeListener(new Object[]{this, th2}, -744760300, 744760300, System.identityHashCode(this));
        }
    }

    public static final class setDividerPadding extends setVisibility {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f57505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f57506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f57507c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f57508d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f57509e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final byte[] f57510f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f57511g = 0;

        static {
            b();
            f57508d = 0;
            f57509e = 1;
            f57506b = 0;
            f57507c = 1;
            f57505a = -443079945;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0035). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void a(int r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = 66 - r6
                int r8 = r8 * 2
                int r8 = r8 + 1
                int r7 = r7 * 2
                int r7 = 3 - r7
                byte[] r0 = new byte[r8]
                byte[] r1 = com.mypinpad.tsdk.i.oh.setDividerPadding.f57510f
                r2 = 0
                if (r1 != 0) goto L18
                r3 = r1
                r4 = r2
                r1 = r0
                r0 = r9
                r9 = r8
                r8 = r7
                goto L35
            L18:
                r3 = r2
            L19:
                int r7 = r7 + 1
                byte r4 = (byte) r6
                r0[r3] = r4
                int r3 = r3 + 1
                if (r3 != r8) goto L2a
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L2a:
                r4 = r1[r7]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                r9 = r8
                r8 = r5
            L35:
                int r6 = r6 + r7
                r7 = r8
                r8 = r9
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.oh.setDividerPadding.a(int, int, int, java.lang.Object[]):void");
        }

        public static void b() {
            f57510f = new byte[]{6, 118, -83, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE};
            f57511g = 25;
        }

        /* JADX WARN: Code duplicated, block: B:39:0x01f4  */
        /* JADX WARN: Code duplicated, block: B:40:0x01f5  */
        @Override // com.mypinpad.tsdk.isolation.setVisibility
        public final void exceptionHandler(@NotNull Throwable th2) throws Throwable {
            int i10;
            char[] cArr;
            Throwable cause;
            int i11 = f57506b + 61;
            f57507c = i11 % 128;
            int i12 = 2;
            int i13 = i11 % 2;
            Intrinsics.checkNotNullParameter(th2, "");
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 37;
            int i14 = 0;
            int iNormalizeMetaState = 148 - KeyEvent.normalizeMetaState(0);
            int keyRepeatTimeout = 13 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int i15 = f57508d;
            int i16 = i15 + 5;
            f57509e = i16 % 128;
            int i17 = i16 % 2;
            int i18 = i15 + 123;
            f57509e = i18 % 128;
            if (i18 % 2 == 0) {
                "\u0000ﾻ\u0002\t\u0004\u000e\u000e\u0000\r\u000b\u000b\u0010￮\t\u0012\n\uffff\u000f\u0010\u0003\u000eﾻ\t\u0004\u000bﾻ\u0002\t\u0004\r\u0010\uffffﾻ\r\n\r\r".toCharArray();
                throw null;
            }
            char[] charArray = "\u0000ﾻ\u0002\t\u0004\u000e\u000e\u0000\r\u000b\u000b\u0010￮\t\u0012\n\uffff\u000f\u0010\u0003\u000eﾻ\t\u0004\u000bﾻ\u0002\t\u0004\r\u0010\uffffﾻ\r\n\r\r".toCharArray();
            getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
            char[] cArr2 = new char[keyRepeatDelay];
            getnavbartitlestring.setY = 0;
            while (true) {
                int i19 = getnavbartitlestring.setY;
                i10 = f57511g;
                if (i19 >= keyRepeatDelay) {
                    break;
                }
                char c10 = charArray[i19];
                getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
                char c11 = (char) (c10 + iNormalizeMetaState);
                cArr2[i19] = c11;
                try {
                    Object[] objArr = new Object[i12];
                    objArr[1] = Integer.valueOf(f57505a);
                    objArr[i14] = Integer.valueOf(c11);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(133002375);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getPressedStateDuration() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(i14) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i14) == 0.0d ? 0 : -1)) + 41, 483 - View.MeasureSpec.getSize(i14));
                        byte b10 = (byte) i14;
                        byte b11 = b10;
                        Object[] objArr2 = new Object[1];
                        a(b10, b11, b11, objArr2);
                        String str = (String) objArr2[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str, cls2, cls2);
                        map.put(133002375, method);
                    }
                    cArr2[i19] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    Object[] objArr3 = {getnavbartitlestring, getnavbartitlestring};
                    Object method2 = map.get(1860518195);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (55967 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 43, TextUtils.indexOf("", "", 0) + 2268);
                        byte b12 = (byte) (i10 & 7);
                        byte b13 = (byte) (b12 - 1);
                        Object[] objArr4 = new Object[1];
                        a(b12, b13, b13, objArr4);
                        method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                        map.put(1860518195, method2);
                    }
                    ((Method) method2).invoke(null, objArr3);
                    int i20 = f57509e + 77;
                    f57508d = i20 % 128;
                    int i21 = i20 % 2;
                    iNormalizeMetaState = iNormalizeMetaState;
                    charArray = charArray;
                    i12 = 2;
                    i14 = 0;
                } catch (Throwable th3) {
                    cause = th3.getCause();
                    if (cause != null) {
                        throw th3;
                    }
                    throw cause;
                }
                cause = th3.getCause();
                if (cause != null) {
                    throw th3;
                }
                throw cause;
            }
            if (keyRepeatTimeout > 0) {
                getnavbartitlestring.setOnFocusChangeListener = keyRepeatTimeout;
                char[] cArr3 = new char[keyRepeatDelay];
                System.arraycopy(cArr2, 0, cArr3, 0, keyRepeatDelay);
                int i22 = getnavbartitlestring.setOnFocusChangeListener;
                System.arraycopy(cArr3, 0, cArr2, keyRepeatDelay - i22, i22);
                int i23 = getnavbartitlestring.setOnFocusChangeListener;
                System.arraycopy(cArr3, i23, cArr2, 0, keyRepeatDelay - i23);
            }
            int i24 = 1;
            int i25 = f57509e + 1;
            f57508d = i25 % 128;
            if (i25 % 2 != 0) {
                cArr = new char[keyRepeatDelay];
                getnavbartitlestring.setY = 1;
            } else {
                cArr = new char[keyRepeatDelay];
                getnavbartitlestring.setY = 0;
            }
            while (true) {
                int i26 = getnavbartitlestring.setY;
                if (i26 >= keyRepeatDelay) {
                    break;
                }
                cArr[i26] = cArr2[(keyRepeatDelay - i26) - i24];
                Object[] objArr5 = new Object[2];
                objArr5[i24] = getnavbartitlestring;
                objArr5[0] = getnavbartitlestring;
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(1860518195);
                if (method3 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) (55966 - Drawable.resolveOpacity(0, 0)), 43 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 2269);
                    byte b14 = (byte) (i10 & 7);
                    byte b15 = (byte) (b14 - 1);
                    Object[] objArr6 = new Object[1];
                    a(b14, b15, b15, objArr6);
                    method3 = cls4.getMethod((String) objArr6[0], Object.class, Object.class);
                    map2.put(1860518195, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                i24 = 1;
            }
            mt.setX(new Object[]{n1.f(cArr)}, 1189439426, -1189439420, (int) System.currentTimeMillis());
            int i27 = f57507c + 105;
            f57506b = i27 % 128;
            if (i27 % 2 != 0) {
                int i28 = 53 / 0;
            }
        }
    }

    public /* synthetic */ class setY {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f57512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f57513b;
        public static final /* synthetic */ int[] setCompoundDrawableTintBlendMode;

        static {
            int[] iArr = new int[setElegantTextHeight.values().length];
            try {
                iArr[setElegantTextHeight.setOnFocusChangeListener.ordinal()] = 1;
                int i10 = (1 & 59) + (1 | 59);
                f57512a = i10 % 128;
                int i11 = i10 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setElegantTextHeight.setCompoundDrawableTintBlendMode.ordinal()] = 2;
                int i12 = f57513b;
                int i13 = ((i12 & 104) + (i12 | 104)) - 1;
                f57512a = i13 % 128;
                int i14 = i13 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[setElegantTextHeight.setX.ordinal()] = 3;
                int i15 = f57512a;
                int i16 = (i15 ^ 21) + ((i15 & 21) << 1);
                f57513b = i16 % 128;
                int i17 = i16 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[setElegantTextHeight.setDividerPadding.ordinal()] = 4;
                int i18 = f57513b;
                int i19 = (i18 & (-16)) | ((~i18) & 15);
                int i20 = (i18 & 15) << 1;
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                f57512a = i21 % 128;
                int i22 = i21 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            setCompoundDrawableTintBlendMode = iArr;
            int i23 = f57512a;
            int i24 = ((i23 ^ 74) + ((i23 & 74) << 1)) - 1;
            f57513b = i24 % 128;
            int i25 = i24 % 2;
        }
    }

    static {
        c();
        f57471q = 0;
        f57472r = 1;
        f57469o = 0;
        f57470p = 1;
        m = true;
        f57468n = true;
        f57467l = 1794962420;
        f57466k = new char[]{62296, 62299, 62298, 62295, 62283, 62272, 62280};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh(@NotNull component28 component28Var, @NotNull setFooterDividersEnabled setfooterdividersenabled, @Nullable re reVar) {
        super(reVar);
        Intrinsics.checkNotNullParameter(component28Var, "");
        Intrinsics.checkNotNullParameter(setfooterdividersenabled, "");
        this.f57474d = component28Var;
        this.f57475e = setfooterdividersenabled;
        vi viVar = vi.setDividerPadding;
        TerminalCallbackKt terminalCallbackKt = (TerminalCallbackKt) vi.setOnFocusChangeListener(new Object[0], 486117644, -486117644, (int) System.currentTimeMillis());
        Intrinsics.checkNotNull(terminalCallbackKt, "");
        this.f57478h = (vh) terminalCallbackKt;
        this.f57480j = new AtomicBoolean(false);
    }

    public static void a(int i10, Object[] objArr) throws Throwable {
        byte[] bytes;
        int i11 = f57472r + 113;
        f57471q = i11 % 128;
        int i12 = 2;
        if (i11 % 2 != 0) {
            bytes = "\u0087\u0086\u0085\u0084\u0083\u0082\u0081".getBytes("ISO-8859-1");
            int i13 = 90 / 0;
        } else {
            bytes = "\u0087\u0086\u0085\u0084\u0083\u0082\u0081".getBytes("ISO-8859-1");
        }
        setZ setz = new setZ();
        char[] cArr = f57466k;
        long j10 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i14 = 0;
            while (i14 < length) {
                int i15 = f57471q + 103;
                f57472r = i15 % 128;
                int i16 = i15 % i12;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i14])};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1129500232);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (26289 - (ViewConfiguration.getZoomControlsTimeout() > j10 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j10 ? 0 : -1))), 65 - (ViewConfiguration.getGlobalActionKeyTimeout() > j10 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j10 ? 0 : -1)), 1595 - View.resolveSizeAndState(0, 0, 0));
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        b(b10, (byte) (b11 + 2), b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(1129500232, method);
                    }
                    cArr2[i14] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i14++;
                    i12 = 2;
                    j10 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(f57467l)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(1019674483);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (ExpandableListView.getPackedPositionType(0L) + 10744), 43 - KeyEvent.normalizeMetaState(0), TextUtils.getOffsetBefore("", 0) + 566);
            byte b12 = (byte) 0;
            byte b13 = b12;
            Object[] objArr5 = new Object[1];
            b(b12, (byte) (b13 + 1), b13, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(1019674483, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
        if (!f57468n) {
            if (!m) {
                throw null;
            }
            throw null;
        }
        int length2 = bytes.length;
        setz.setOnFocusChangeListener = length2;
        char[] cArr3 = new char[length2];
        setz.setDividerPadding = 0;
        while (true) {
            int i17 = setz.setDividerPadding;
            int i18 = setz.setOnFocusChangeListener;
            if (i17 >= i18) {
                objArr[0] = new String(cArr3);
                return;
            }
            cArr3[i17] = (char) (cArr[bytes[(i18 - 1) - i17] + i10] - iIntValue);
            Object[] objArr6 = {setz, setz};
            Map map3 = setTextScaleX.setMaxEms;
            Object method3 = map3.get(-1539766653);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", "", 0, 0), 51 - Color.blue(0), Drawable.resolveOpacity(0, 0) + 2880);
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                b(b14, b15, b15, objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map3.put(-1539766653, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:11:0x003a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 4
            int r6 = r6 * 2
            int r0 = 1 - r6
            int r7 = r7 * 2
            int r7 = 122 - r7
            byte[] r0 = new byte[r0]
            r1 = 0
            int r6 = 0 - r6
            byte[] r2 = com.mypinpad.tsdk.isolation.oh.f57473s
            if (r2 != 0) goto L1c
            r7 = r6
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L3a
        L1c:
            r3 = r1
            r5 = r8
            r8 = r7
        L1f:
            r7 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L2d
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2d:
            int r3 = r3 + 1
            r4 = r2[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L3a:
            int r8 = r8 + 1
            int r6 = r6 + r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.oh.b(int, byte, int, java.lang.Object[]):void");
    }

    public static void c() {
        f57473s = new byte[]{122, -107, 66, -93};
    }

    public static px d(setSecondaryProgressTintBlendMode setsecondaryprogresstintblendmode) {
        int i10 = f57470p;
        int i11 = i10 + 33;
        f57469o = i11 % 128;
        if (i11 % 2 != 0) {
            boolean z10 = setsecondaryprogresstintblendmode instanceof setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode;
            throw null;
        }
        if (setsecondaryprogresstintblendmode instanceof setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode) {
            return e((setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode) setsecondaryprogresstintblendmode);
        }
        if (setsecondaryprogresstintblendmode instanceof setSecondaryProgressTintBlendMode.setX) {
            ps psVar = new ps(((setSecondaryProgressTintBlendMode.setX) setsecondaryprogresstintblendmode).setCompoundDrawableTintBlendMode());
            int i12 = f57470p + 29;
            f57469o = i12 % 128;
            int i13 = i12 % 2;
            return psVar;
        }
        if (setsecondaryprogresstintblendmode instanceof setSecondaryProgressTintBlendMode.setOnFocusChangeListener) {
            int i14 = i10 + 81;
            f57469o = i14 % 128;
            if (i14 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (!(setsecondaryprogresstintblendmode instanceof setSecondaryProgressTintBlendMode.setY)) {
            if (setsecondaryprogresstintblendmode instanceof setSecondaryProgressTintBlendMode.setDividerPadding) {
                return new pt(((setSecondaryProgressTintBlendMode.setDividerPadding) setsecondaryprogresstintblendmode).setOnFocusChangeListener());
            }
            throw new NoWhenBranchMatchedException();
        }
        pk pkVar = pk.INSTANCE;
        int i15 = f57469o + 123;
        f57470p = i15 % 128;
        int i16 = i15 % 2;
        return pkVar;
    }

    public static pp e(setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode) {
        pq pqVar;
        int i10 = setY.setCompoundDrawableTintBlendMode[setcompounddrawabletintblendmode.setY().ordinal()];
        if (i10 == 1) {
            pqVar = pq.setDividerPadding;
        } else if (i10 == 2) {
            pqVar = pq.setY;
        } else if (i10 == 3) {
            pqVar = pq.setOnFocusChangeListener;
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            pqVar = pq.setCompoundDrawableTintBlendMode;
        }
        return new pp(pqVar);
    }

    public static final /* synthetic */ vh setCompoundDrawableTintBlendMode(oh ohVar) {
        int i10 = f57469o;
        int i11 = i10 + 73;
        f57470p = i11 % 128;
        int i12 = i11 % 2;
        vh vhVar = ohVar.f57478h;
        int i13 = i10 + 27;
        f57470p = i13 % 128;
        if (i13 % 2 != 0) {
            return vhVar;
        }
        throw null;
    }

    public static final void setDividerPadding(oh ohVar) {
        int i10 = f57469o + 31;
        f57470p = i10 % 128;
        int i11 = i10 % 2;
        ohVar.getClass();
        int i12 = f57469o + 15;
        f57470p = i12 % 128;
        int i13 = i12 % 2;
        mu.setCompoundDrawableTintBlendMode(new Object[]{131010, null, null, 6}, -1968587119, 1968587120, 131010);
        try {
            setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = ohVar.setY().setX().get();
            Function1<px, Unit> function1G = ohVar.g();
            Intrinsics.checkNotNullExpressionValue(setcompounddrawabletintblendmode, "");
            function1G.invoke(e(setcompounddrawabletintblendmode));
            int i14 = f57470p + 55;
            f57469o = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
        } catch (Exception e5) {
            ohVar.g().invoke(new ps((Throwable) nk.setY(new Object[]{e5}, -889189031, 889189032, (int) System.currentTimeMillis())));
        }
        int i15 = f57469o + 109;
        f57470p = i15 % 128;
        int i16 = i15 % 2;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ((~(i10 | i14)) * 69) + (((~(i11 | i12)) | (~(i13 | i12)) | (~(i13 | i11))) * (-69)) + (((~(i13 | i14 | i12)) | (~(i10 | i11 | i12))) * 69) + (i11 * (-68)) + (i10 * 70);
        if (i15 == 1) {
            oh ohVar = (oh) objArr[0];
            try {
                Future<Unit> compoundDrawableTintBlendMode = ohVar.setY().setCompoundDrawableTintBlendMode(ohVar.f57475e, new qm((String) objArr[1], (UUID) objArr[2]));
                Boolean bool = mg.setCompoundDrawableTintBlendMode;
                Intrinsics.checkNotNullExpressionValue(bool, "");
                if (bool.booleanValue()) {
                    int i16 = f57470p + 85;
                    f57469o = i16 % 128;
                    if (i16 % 2 != 0) {
                        boolean z10 = mk.setOnFocusChangeListener(mk.setOnFocusChangeListener) instanceof hashCode.setX;
                        try {
                            throw null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    hashCode onFocusChangeListener = mk.setOnFocusChangeListener(mk.setOnFocusChangeListener);
                    if (onFocusChangeListener instanceof hashCode.setX) {
                        ohVar.g().invoke((px) mi.setX(new Object[]{(hashCode.setX) onFocusChangeListener}, -598260002, 598260010, (int) System.currentTimeMillis()));
                        return null;
                    }
                }
                compoundDrawableTintBlendMode.get();
                int i17 = f57470p + 3;
                f57469o = i17 % 128;
                int i18 = i17 % 2;
                return null;
            } catch (Exception e5) {
                Throwable th3 = (Throwable) nk.setY(new Object[]{e5}, -889189031, 889189032, (int) System.currentTimeMillis());
                mu.setCompoundDrawableTintBlendMode(new Object[]{131006, null, th3, 2}, -1968587119, 1968587120, 131006);
                ohVar.g().invoke(new ps(new or(th3)));
                return null;
            }
        }
        if (i15 == 2) {
            oh ohVar2 = (oh) objArr[0];
            setVisibility setvisibility = (setVisibility) objArr[1];
            Function0 function0 = (Function0) objArr[2];
            int i19 = f57470p + 89;
            f57469o = i19 % 128;
            if (i19 % 2 != 0) {
                ohVar2.f57480j.get();
                throw null;
            }
            if (ohVar2.f57480j.get()) {
                return null;
            }
            q7 q7Var = new q7(ohVar2, function0);
            vh vhVar = ohVar2.f57478h;
            vh.setCompoundDrawableTintBlendMode(new Object[]{vhVar, setvisibility, q7Var}, 268290187, -268290185, System.identityHashCode(vhVar));
            int i20 = f57470p + 95;
            f57469o = i20 % 128;
            int i21 = i20 % 2;
            return null;
        }
        if (i15 == 3) {
            oh ohVar3 = (oh) objArr[0];
            int i22 = f57469o;
            int i23 = i22 + 109;
            f57470p = i23 % 128;
            int i24 = i23 % 2;
            ue<ug> ueVar = ohVar3.f57477g;
            if (i24 == 0) {
                throw null;
            }
            if (ueVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                return null;
            }
            int i25 = i22 + 23;
            f57470p = i25 % 128;
            if (i25 % 2 != 0) {
                return ueVar;
            }
            throw null;
        }
        if (i15 == 4) {
            oh ohVar4 = (oh) objArr[0];
            Context context = (Context) objArr[1];
            UUID uuid = (UUID) objArr[2];
            setVisibility setvisibility2 = (setVisibility) objArr[3];
            int i26 = f57469o + 9;
            f57470p = i26 % 128;
            int i27 = i26 % 2;
            ohVar4.f(context, uuid, setvisibility2);
            if (i27 != 0) {
                return null;
            }
            throw null;
        }
        oh ohVar5 = (oh) objArr[0];
        getEnableLocalAttestationForDebugBuilds getenablelocalattestationfordebugbuilds = (getEnableLocalAttestationForDebugBuilds) objArr[1];
        int i28 = f57469o + 57;
        f57470p = i28 % 128;
        int i29 = i28 % 2;
        Intrinsics.checkNotNullParameter(getenablelocalattestationfordebugbuilds, "");
        ohVar5.setX = getenablelocalattestationfordebugbuilds;
        int i30 = f57469o + 123;
        f57470p = i30 % 128;
        if (i30 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ AtomicBoolean setX(oh ohVar) {
        int i10 = f57469o + 1;
        f57470p = i10 % 128;
        int i11 = i10 % 2;
        AtomicBoolean atomicBoolean = ohVar.f57480j;
        if (i11 != 0) {
            return atomicBoolean;
        }
        throw null;
    }

    public static final void setY(oh ohVar) {
        int i10 = f57470p + 19;
        f57469o = i10 % 128;
        int i11 = i10 % 2;
        ohVar.getClass();
        int i12 = f57469o + 65;
        f57470p = i12 % 128;
        int i13 = i12 % 2;
        mu.setCompoundDrawableTintBlendMode(new Object[]{131011, null, null, 6}, -1968587119, 1968587120, 131011);
        try {
            setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = ohVar.setY().setY().get();
            Function1<px, Unit> function1G = ohVar.g();
            Intrinsics.checkNotNullExpressionValue(setcompounddrawabletintblendmode, "");
            function1G.invoke(e(setcompounddrawabletintblendmode));
            int i14 = f57470p + 93;
            f57469o = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
        } catch (Exception e5) {
            ohVar.g().invoke(new ps((Throwable) nk.setY(new Object[]{e5}, -889189031, 889189032, (int) System.currentTimeMillis())));
        }
        int i15 = f57469o + 119;
        f57470p = i15 % 128;
        int i16 = i15 % 2;
    }

    public final void f(Context context, UUID uuid, setVisibility setvisibility) throws Throwable {
        component28 component28Var = this.f57474d;
        try {
            setBackgroundDrawable onFocusChangeListener = setOnFocusChangeListener();
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            onFocusChangeListener.setX(applicationContext, this.f57474d, new d(setvisibility), new c(setvisibility), new e(setvisibility), new f(setvisibility));
            ((ue) setOnFocusChangeListener(new Object[]{this}, 455363174, -455363171, System.identityHashCode(this))).setOnFocusChangeListener(ug.setX);
            String compoundDrawableTintBlendMode = component28Var.setCompoundDrawableTintBlendMode();
            if (compoundDrawableTintBlendMode == null) {
                Object[] objArr = new Object[1];
                a(127 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
                compoundDrawableTintBlendMode = ((String) objArr[0]).intern();
            }
            pc.setY(new ph(uuid, compoundDrawableTintBlendMode, component28Var.getNavBarTitleString(), null, 8, null));
        } catch (Exception e5) {
            Throwable th2 = (Throwable) nk.setY(new Object[]{e5}, -889189031, 889189032, (int) System.currentTimeMillis());
            mu.setCompoundDrawableTintBlendMode(new Object[]{131014, null, th2, 2}, -1968587119, 1968587120, 131014);
            g().invoke(new ps(th2));
        }
    }

    @JvmName(name = "setNavigationOnClickListener")
    @NotNull
    public final Function1<px, Unit> g() {
        int i10 = f57470p;
        int i11 = i10 + 17;
        f57469o = i11 % 128;
        int i12 = i11 % 2;
        Function1 function1 = this.f57476f;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i13 = i10 + 35;
        f57469o = i13 % 128;
        int i14 = i13 % 2;
        return function1;
    }

    public final void h(float f6, float f10) {
        px pxVarD;
        mu.setCompoundDrawableTintBlendMode(new Object[]{131012, null, null, 6}, -1968587119, 1968587120, 131012);
        ((ue) setOnFocusChangeListener(new Object[]{this}, 455363174, -455363171, System.identityHashCode(this))).setOnFocusChangeListener(ug.setX);
        try {
            setDividerDrawable setdividerdrawable = setY().setOnFocusChangeListener(f6, f10).get();
            if (this.f57480j.get()) {
                return;
            }
            mu.setCompoundDrawableTintBlendMode(new Object[]{131013, null, null, 6}, -1968587119, 1968587120, 131013);
            setOnFocusChangeListener().setDividerPadding(setdividerdrawable.setOnFocusChangeListener());
            if (!(!(setdividerdrawable.setX() instanceof setSecondaryProgressTintBlendMode.setOnFocusChangeListener))) {
                setOnFocusChangeListener().setY();
                return;
            }
            setSecondaryProgressTintBlendMode x4 = setdividerdrawable.setX();
            if (x4 != null) {
                pxVarD = d(x4);
            } else {
                int i10 = f57469o + 43;
                f57470p = i10 % 128;
                int i11 = i10 % 2;
                pxVarD = null;
            }
            if (pxVarD != null) {
                setOnFocusChangeListener().setX();
                g().invoke(pxVarD);
                return;
            }
            int i12 = f57469o + 23;
            f57470p = i12 % 128;
            int i13 = i12 % 2;
        } catch (Exception e5) {
            Throwable th2 = (Throwable) nk.setY(new Object[]{e5}, -889189031, 889189032, (int) System.currentTimeMillis());
            mu.setCompoundDrawableTintBlendMode(new Object[]{131013, null, th2, 2}, -1968587119, 1968587120, 131013);
            g().invoke(new ps(th2));
        }
    }

    public static final void setX(oh ohVar, int i10, int i11) {
        int i12 = f57469o + 65;
        f57470p = i12 % 128;
        int i13 = i12 % 2;
        ohVar.getClass();
        if (i10 != 0 && i11 != 0) {
            int i14 = f57470p + 95;
            f57469o = i14 % 128;
            int i15 = i14 % 2;
            if (!ohVar.f57479i) {
                mu.setCompoundDrawableTintBlendMode(new Object[]{131007, null, null, 6}, -1968587119, 1968587120, 131007);
                try {
                    byte[] bArr = ohVar.setY().setDividerPadding(i10, i11).get();
                    if (ohVar.f57480j.get()) {
                        int i16 = f57470p + 59;
                        f57469o = i16 % 128;
                        int i17 = i16 % 2;
                    } else {
                        mu.setCompoundDrawableTintBlendMode(new Object[]{131008, null, null, 6}, -1968587119, 1968587120, 131008);
                        setBackgroundDrawable onFocusChangeListener = ohVar.setOnFocusChangeListener();
                        Intrinsics.checkNotNullExpressionValue(bArr, "");
                        onFocusChangeListener.setY(bArr);
                        ohVar.f57479i = true;
                    }
                } catch (Exception e5) {
                    Throwable th2 = (Throwable) nk.setY(new Object[]{e5}, -889189031, 889189032, (int) System.currentTimeMillis());
                    mu.setCompoundDrawableTintBlendMode(new Object[]{131008, null, th2, 2}, -1968587119, 1968587120, 131008);
                    ohVar.g().invoke(new ps(th2));
                }
            }
        }
        int i18 = f57470p + 31;
        f57469o = i18 % 128;
        if (i18 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.nt
    public final void setCompoundDrawableTintBlendMode() throws Throwable {
        setOnFocusChangeListener(new Object[]{this, new setDividerPadding(), new b()}, 452661627, -452661625, System.identityHashCode(this));
        int i10 = f57469o + 1;
        f57470p = i10 % 128;
        int i11 = i10 % 2;
    }

    public static final /* synthetic */ void setDividerPadding(oh ohVar, setVisibility setvisibility, Function0 function0) throws Throwable {
        int i10 = f57469o + 59;
        f57470p = i10 % 128;
        int i11 = i10 % 2;
        setOnFocusChangeListener(new Object[]{ohVar, setvisibility, function0}, 452661627, -452661625, System.identityHashCode(ohVar));
        int i12 = f57469o + 51;
        f57470p = i12 % 128;
        int i13 = i12 % 2;
    }

    public static final /* synthetic */ void setY(oh ohVar, String str, UUID uuid) throws Throwable {
        int i10 = f57469o + 67;
        f57470p = i10 % 128;
        if (i10 % 2 != 0) {
            setOnFocusChangeListener(new Object[]{ohVar, str, uuid}, 62240882, -62240881, System.identityHashCode(ohVar));
        } else {
            setOnFocusChangeListener(new Object[]{ohVar, str, uuid}, 62240882, -62240881, System.identityHashCode(ohVar));
            throw null;
        }
    }

    @JvmName(name = "setY")
    @NotNull
    public final getEnableLocalAttestationForDebugBuilds setY() {
        int i10 = f57469o + 39;
        f57470p = i10 % 128;
        int i11 = i10 % 2;
        getEnableLocalAttestationForDebugBuilds getenablelocalattestationfordebugbuilds = this.setX;
        if (getenablelocalattestationfordebugbuilds != null) {
            return getenablelocalattestationfordebugbuilds;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i12 = f57469o + 69;
        f57470p = i12 % 128;
        if (i12 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.nt
    public final void setY(@NotNull Context p4, @NotNull Function1<? super px, Unit> p10, @NotNull ue<ug> p11, @NotNull String p12, @NotNull UUID p13, @NotNull getEnableLocalAttestationForDebugBuilds p14) throws Throwable {
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p10, "");
        Intrinsics.checkNotNullParameter(p11, "");
        Intrinsics.checkNotNullParameter(p12, "");
        Intrinsics.checkNotNullParameter(p13, "");
        Intrinsics.checkNotNullParameter(p14, "");
        mu.setCompoundDrawableTintBlendMode(new Object[]{131005, null, null, 6}, -1968587119, 1968587120, 131005);
        this.f57479i = false;
        setOnFocusChangeListener(new Object[]{this, p14}, 1835715373, -1835715373, System.identityHashCode(this));
        a aVar = new a(p10);
        int i10 = f57469o + 115;
        f57470p = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(aVar, "");
        this.f57476f = aVar;
        int i12 = f57470p + 51;
        int i13 = i12 % 128;
        f57469o = i13;
        int i14 = i12 % 2;
        int i15 = i13 + 89;
        f57470p = i15 % 128;
        if (i15 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p11, "");
            this.f57477g = p11;
            try {
                setBackgroundDrawable y7 = nf.setY();
                int i16 = f57469o + 71;
                int i17 = i16 % 128;
                f57470p = i17;
                int i18 = i16 % 2;
                int i19 = i17 + 77;
                f57469o = i19 % 128;
                int i20 = i19 % 2;
                Intrinsics.checkNotNullParameter(y7, "");
                this.setNavigationOnClickListener = y7;
                int i21 = f57469o + 73;
                f57470p = i21 % 128;
                if (i21 % 2 != 0) {
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode(p10);
                    setOnFocusChangeListener(new Object[]{this, setcompounddrawabletintblendmode, new g(p12, p13, p4, setcompounddrawabletintblendmode)}, 452661627, -452661625, System.identityHashCode(this));
                    int i22 = f57470p + 61;
                    f57469o = i22 % 128;
                    int i23 = i22 % 2;
                    return;
                }
                throw null;
            } catch (init e5) {
                p10.invoke(new ps(e5));
                return;
            }
        }
        Intrinsics.checkNotNullParameter(p11, "");
        this.f57477g = p11;
        throw null;
    }

    public static final /* synthetic */ void setOnFocusChangeListener(oh ohVar, float f6, float f10) {
        int i10 = f57469o + 59;
        f57470p = i10 % 128;
        int i11 = i10 % 2;
        ohVar.h(f6, f10);
        if (i11 == 0) {
            int i12 = 74 / 0;
        }
        int i13 = f57470p + 35;
        f57469o = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 58 / 0;
        }
    }

    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final setBackgroundDrawable setOnFocusChangeListener() {
        int i10 = f57470p + 55;
        f57469o = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        setBackgroundDrawable setbackgrounddrawable = this.setNavigationOnClickListener;
        if (setbackgrounddrawable != null) {
            return setbackgrounddrawable;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i11 = f57470p + 51;
        f57469o = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw null;
    }
}
