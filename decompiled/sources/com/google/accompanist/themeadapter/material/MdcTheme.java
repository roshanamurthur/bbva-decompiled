package com.google.accompanist.themeadapter.material;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.compose.material.Colors;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.material.Shapes;
import androidx.compose.material.Typography;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.content.res.TypedArrayKt;
import androidx.profileinstaller.ProfileVerifier;
import com.google.accompanist.themeadapter.core.FontFamilyWithWeight;
import com.google.accompanist.themeadapter.core.ResourceUtilsKt;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MdcTheme.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a^\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aR\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002¨\u0006\u0014"}, d2 = {"Landroid/content/Context;", "context", "", "readColors", "readTypography", "readShapes", "setTextColors", "setDefaultFontFamily", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "MdcTheme", "(Landroid/content/Context;ZZZZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "Lcom/google/accompanist/themeadapter/material/ThemeParameters;", "createMdcTheme", "themeadapter-material_release"}, k = 2, mv = {1, 9, 0})
@JvmName(name = "MdcTheme")
@SourceDebugExtension({"SMAP\nMdcTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MdcTheme.kt\ncom/google/accompanist/themeadapter/material/MdcTheme\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,403:1\n381#1,5:405\n386#1,13:411\n76#2:404\n76#2:424\n1#3:410\n1#3:435\n36#4:425\n1097#5,6:426\n233#6,3:432\n*S KotlinDebug\n*F\n+ 1 MdcTheme.kt\ncom/google/accompanist/themeadapter/material/MdcTheme\n*L\n92#1:405,5\n92#1:411,13\n77#1:404\n94#1:424\n92#1:410\n96#1:425\n96#1:426,6\n172#1:432,3\n*E\n"})
public final class MdcTheme {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Shapes f43552a = new Shapes(null, null, null, 7, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f43553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static Method f43554c;

    /* JADX INFO: compiled from: MdcTheme.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f43555p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f43556q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, Function2 function2) {
            super(2);
            this.f43555p0 = function2;
            this.f43556q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-125411654, iIntValue, -1, "com.google.accompanist.themeadapter.material.MdcTheme.<anonymous> (MdcTheme.kt:114)");
                }
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(MaterialTheme.INSTANCE.getColors(composer2, MaterialTheme.$stable).m708getOnBackground0d7_KjU()))}, this.f43555p0, composer2, ((this.f43556q0 >> 15) & 112) | 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: MdcTheme.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f43557p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f43558q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f43559r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f43560s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f43561t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ boolean f43562u0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f43563w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f43564x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Context context, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f43557p0 = context;
            this.f43558q0 = z10;
            this.f43559r0 = z11;
            this.f43560s0 = z12;
            this.f43561t0 = z13;
            this.f43562u0 = z14;
            this.v0 = function2;
            this.f43563w0 = i10;
            this.f43564x0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MdcTheme.MdcTheme(this.f43557p0, this.f43558q0, this.f43559r0, this.f43560s0, this.f43561t0, this.f43562u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f43563w0 | 1), this.f43564x0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0124  */
    /* JADX WARN: Code duplicated, block: B:103:0x0127  */
    /* JADX WARN: Code duplicated, block: B:106:0x0135  */
    /* JADX WARN: Code duplicated, block: B:113:0x0163 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x0171  */
    /* JADX WARN: Code duplicated, block: B:121:0x0191  */
    /* JADX WARN: Code duplicated, block: B:123:0x0199  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:129:0x01da  */
    /* JADX WARN: Code duplicated, block: B:132:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:135:0x021b  */
    /* JADX WARN: Code duplicated, block: B:140:0x022b  */
    /* JADX WARN: Code duplicated, block: B:145:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fb A[PHI: r0 r2 r3 r9 r11 r13
      0x00fb: PHI (r0v10 android.content.Context) = (r0v5 android.content.Context), (r0v12 android.content.Context) binds: [B:102:0x0125, B:87:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x00fb: PHI (r2v6 boolean) = (r2v2 boolean), (r2v7 boolean) binds: [B:102:0x0125, B:87:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x00fb: PHI (r3v18 int) = (r3v13 int), (r3v19 int) binds: [B:102:0x0125, B:87:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x00fb: PHI (r9v10 boolean) = (r9v3 boolean), (r9v2 boolean) binds: [B:102:0x0125, B:87:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x00fb: PHI (r11v19 boolean) = (r11v3 boolean), (r11v2 boolean) binds: [B:102:0x0125, B:87:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x00fb: PHI (r13v10 boolean) = (r13v4 boolean), (r13v3 boolean) binds: [B:102:0x0125, B:87:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:92:0x0114  */
    /* JADX WARN: Code duplicated, block: B:94:0x0118  */
    /* JADX WARN: Code duplicated, block: B:95:0x011a  */
    /* JADX WARN: Code duplicated, block: B:97:0x011e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0121  */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void MdcTheme(@Nullable Context context, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        boolean z15;
        int i13;
        int i14;
        boolean z16;
        int i15;
        int i16;
        boolean z17;
        int i17;
        int i18;
        boolean z18;
        int i19;
        int i20;
        Context context2;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        int i21;
        Resources.Theme theme;
        Method method;
        Object theme2;
        LayoutDirection layoutDirection;
        boolean zChanged;
        Object objRememberedValue;
        Colors colors;
        Typography typography;
        Shapes shapes;
        boolean z24;
        boolean z25;
        boolean z26;
        Context context3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1864238106);
        int i22 = i11 & 1;
        int i23 = i22 != 0 ? i10 | 2 : i10;
        int i24 = i11 & 2;
        if (i24 == 0) {
            if ((i10 & 112) == 0) {
                i23 |= composerStartRestartGroup.changed(z10) ? 32 : 16;
            }
            i12 = i11 & 4;
            if (i12 != 0) {
                if ((i10 & 896) == 0) {
                    z15 = z11;
                    if (composerStartRestartGroup.changed(z15)) {
                        i13 = 256;
                    } else {
                        i13 = 128;
                    }
                    i23 |= i13;
                }
                i14 = i11 & 8;
                if (i14 != 0) {
                    if ((i10 & 7168) == 0) {
                        z16 = z12;
                        if (composerStartRestartGroup.changed(z16)) {
                            i15 = 2048;
                        } else {
                            i15 = 1024;
                        }
                        i23 |= i15;
                    }
                    i16 = i11 & 16;
                    if (i16 != 0) {
                        if ((57344 & i10) == 0) {
                            z17 = z13;
                            if (composerStartRestartGroup.changed(z17)) {
                                i17 = 16384;
                            } else {
                                i17 = 8192;
                            }
                            i23 |= i17;
                        }
                        i18 = i11 & 32;
                        if (i18 != 0) {
                            if ((458752 & i10) == 0) {
                                z18 = z14;
                                if (composerStartRestartGroup.changed(z18)) {
                                    i19 = 131072;
                                } else {
                                    i19 = 65536;
                                }
                                i23 |= i19;
                            }
                            if ((i11 & 64) != 0) {
                                if ((i10 & 3670016) == 0) {
                                    if (composerStartRestartGroup.changedInstance(content)) {
                                        i20 = 1048576;
                                    } else {
                                        i20 = 524288;
                                    }
                                }
                                if (i22 != 1 && (i23 & 2995931) == 599186 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    context3 = context;
                                    z26 = z10;
                                    z21 = z16;
                                    z24 = z17;
                                    z25 = z18;
                                } else {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        if (i22 != 0) {
                                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                            i23 &= -15;
                                        } else {
                                            context2 = context;
                                        }
                                        if (i24 != 0) {
                                            z19 = true;
                                        } else {
                                            z19 = z10;
                                        }
                                        if (i12 != 0) {
                                            z15 = true;
                                        }
                                        if (i14 != 0) {
                                            z16 = true;
                                        }
                                        if (i16 != 0) {
                                            z17 = false;
                                        }
                                        if (i18 != 0) {
                                            z20 = false;
                                            z21 = z16;
                                            z22 = z17;
                                        }
                                        z23 = z15;
                                        i21 = i23;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                                        }
                                        theme = context2.getTheme();
                                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                                        if (!f43553b) {
                                            try {
                                                Method declaredMethod = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                                declaredMethod.setAccessible(true);
                                                f43554c = declaredMethod;
                                            } catch (ReflectiveOperationException unused) {
                                            }
                                            f43553b = true;
                                        }
                                        method = f43554c;
                                        theme2 = null;
                                        if (method != null && method != null) {
                                            try {
                                                theme2 = method.invoke(theme, new Object[0]);
                                            } catch (ReflectiveOperationException unused2) {
                                                theme2 = Unit.INSTANCE;
                                            }
                                        }
                                        if (theme2 == null) {
                                            theme2 = context2.getTheme();
                                        }
                                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                                        zChanged = composerStartRestartGroup.changed(theme2);
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        ThemeParameters themeParameters = (ThemeParameters) objRememberedValue;
                                        colors = themeParameters.getColors();
                                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                                        if (colors == null) {
                                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        typography = themeParameters.getTypography();
                                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                                        if (typography == null) {
                                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        shapes = themeParameters.getShapes();
                                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                                        if (shapes == null) {
                                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        z15 = z23;
                                        z24 = z22;
                                        z25 = z20;
                                        z26 = z19;
                                        context3 = context2;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if (i22 != 0) {
                                            i23 &= -15;
                                        }
                                        context2 = context;
                                        z19 = z10;
                                    }
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                    z23 = z15;
                                    i21 = i23;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                                    }
                                    theme = context2.getTheme();
                                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                                    if (!f43553b) {
                                        Method declaredMethod2 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                        declaredMethod2.setAccessible(true);
                                        f43554c = declaredMethod2;
                                        f43553b = true;
                                    }
                                    method = f43554c;
                                    theme2 = null;
                                    if (method != null) {
                                        theme2 = method.invoke(theme, new Object[0]);
                                    }
                                    if (theme2 == null) {
                                        theme2 = context2.getTheme();
                                    }
                                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                                    zChanged = composerStartRestartGroup.changed(theme2);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (zChanged) {
                                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    } else {
                                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    ThemeParameters themeParameters2 = (ThemeParameters) objRememberedValue;
                                    colors = themeParameters2.getColors();
                                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                                    if (colors == null) {
                                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    typography = themeParameters2.getTypography();
                                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                                    if (typography == null) {
                                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    shapes = themeParameters2.getShapes();
                                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                                    if (shapes == null) {
                                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    z15 = z23;
                                    z24 = z22;
                                    z25 = z20;
                                    z26 = z19;
                                    context3 = context2;
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                    return;
                                }
                                scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                            }
                            i20 = 1572864;
                            i23 |= i20;
                            if (i22 != 1) {
                                composerStartRestartGroup.startDefaults();
                                if ((i10 & 1) != 0) {
                                    if (i22 != 0) {
                                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        i23 &= -15;
                                    } else {
                                        context2 = context;
                                    }
                                    if (i24 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = z10;
                                    }
                                    if (i12 != 0) {
                                        z15 = true;
                                    }
                                    if (i14 != 0) {
                                        z16 = true;
                                    }
                                    if (i16 != 0) {
                                        z17 = false;
                                    }
                                    if (i18 != 0) {
                                        z20 = false;
                                        z21 = z16;
                                        z22 = z17;
                                    } else {
                                        z21 = z16;
                                        z22 = z17;
                                        z20 = z18;
                                    }
                                } else {
                                    if (i22 != 0) {
                                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        i23 &= -15;
                                    } else {
                                        context2 = context;
                                    }
                                    if (i24 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = z10;
                                    }
                                    if (i12 != 0) {
                                        z15 = true;
                                    }
                                    if (i14 != 0) {
                                        z16 = true;
                                    }
                                    if (i16 != 0) {
                                        z17 = false;
                                    }
                                    if (i18 != 0) {
                                        z20 = false;
                                        z21 = z16;
                                        z22 = z17;
                                    } else {
                                        z21 = z16;
                                        z22 = z17;
                                        z20 = z18;
                                    }
                                }
                                z23 = z15;
                                i21 = i23;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                                }
                                theme = context2.getTheme();
                                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                                if (!f43553b) {
                                    Method declaredMethod3 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                    declaredMethod3.setAccessible(true);
                                    f43554c = declaredMethod3;
                                    f43553b = true;
                                }
                                method = f43554c;
                                theme2 = null;
                                if (method != null) {
                                    theme2 = method.invoke(theme, new Object[0]);
                                }
                                if (theme2 == null) {
                                    theme2 = context2.getTheme();
                                }
                                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(theme2);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                ThemeParameters themeParameters3 = (ThemeParameters) objRememberedValue;
                                colors = themeParameters3.getColors();
                                composerStartRestartGroup.startReplaceableGroup(-535944663);
                                if (colors == null) {
                                    colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                typography = themeParameters3.getTypography();
                                composerStartRestartGroup.startReplaceableGroup(-535944598);
                                if (typography == null) {
                                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                shapes = themeParameters3.getShapes();
                                composerStartRestartGroup.startReplaceableGroup(-535944529);
                                if (shapes == null) {
                                    shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z15 = z23;
                                z24 = z22;
                                z25 = z20;
                                z26 = z19;
                                context3 = context2;
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if ((i10 & 1) != 0) {
                                    if (i22 != 0) {
                                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        i23 &= -15;
                                    } else {
                                        context2 = context;
                                    }
                                    if (i24 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = z10;
                                    }
                                    if (i12 != 0) {
                                        z15 = true;
                                    }
                                    if (i14 != 0) {
                                        z16 = true;
                                    }
                                    if (i16 != 0) {
                                        z17 = false;
                                    }
                                    if (i18 != 0) {
                                        z20 = false;
                                        z21 = z16;
                                        z22 = z17;
                                    } else {
                                        z21 = z16;
                                        z22 = z17;
                                        z20 = z18;
                                    }
                                } else {
                                    if (i22 != 0) {
                                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        i23 &= -15;
                                    } else {
                                        context2 = context;
                                    }
                                    if (i24 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = z10;
                                    }
                                    if (i12 != 0) {
                                        z15 = true;
                                    }
                                    if (i14 != 0) {
                                        z16 = true;
                                    }
                                    if (i16 != 0) {
                                        z17 = false;
                                    }
                                    if (i18 != 0) {
                                        z20 = false;
                                        z21 = z16;
                                        z22 = z17;
                                    } else {
                                        z21 = z16;
                                        z22 = z17;
                                        z20 = z18;
                                    }
                                }
                                z23 = z15;
                                i21 = i23;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                                }
                                theme = context2.getTheme();
                                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                                if (!f43553b) {
                                    Method declaredMethod4 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                    declaredMethod4.setAccessible(true);
                                    f43554c = declaredMethod4;
                                    f43553b = true;
                                }
                                method = f43554c;
                                theme2 = null;
                                if (method != null) {
                                    theme2 = method.invoke(theme, new Object[0]);
                                }
                                if (theme2 == null) {
                                    theme2 = context2.getTheme();
                                }
                                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(theme2);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                ThemeParameters themeParameters4 = (ThemeParameters) objRememberedValue;
                                colors = themeParameters4.getColors();
                                composerStartRestartGroup.startReplaceableGroup(-535944663);
                                if (colors == null) {
                                    colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                typography = themeParameters4.getTypography();
                                composerStartRestartGroup.startReplaceableGroup(-535944598);
                                if (typography == null) {
                                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                shapes = themeParameters4.getShapes();
                                composerStartRestartGroup.startReplaceableGroup(-535944529);
                                if (shapes == null) {
                                    shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z15 = z23;
                                z24 = z22;
                                z25 = z20;
                                z26 = z19;
                                context3 = context2;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                        }
                        i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        z18 = z14;
                        if ((i11 & 64) != 0) {
                            if ((i10 & 3670016) == 0) {
                                if (composerStartRestartGroup.changedInstance(content)) {
                                    i20 = 1048576;
                                } else {
                                    i20 = 524288;
                                }
                            }
                            if (i22 != 1) {
                                composerStartRestartGroup.startDefaults();
                                if ((i10 & 1) != 0) {
                                    if (i22 != 0) {
                                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        i23 &= -15;
                                    } else {
                                        context2 = context;
                                    }
                                    if (i24 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = z10;
                                    }
                                    if (i12 != 0) {
                                        z15 = true;
                                    }
                                    if (i14 != 0) {
                                        z16 = true;
                                    }
                                    if (i16 != 0) {
                                        z17 = false;
                                    }
                                    if (i18 != 0) {
                                        z20 = false;
                                        z21 = z16;
                                        z22 = z17;
                                    } else {
                                        z21 = z16;
                                        z22 = z17;
                                        z20 = z18;
                                    }
                                } else {
                                    if (i22 != 0) {
                                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        i23 &= -15;
                                    } else {
                                        context2 = context;
                                    }
                                    if (i24 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = z10;
                                    }
                                    if (i12 != 0) {
                                        z15 = true;
                                    }
                                    if (i14 != 0) {
                                        z16 = true;
                                    }
                                    if (i16 != 0) {
                                        z17 = false;
                                    }
                                    if (i18 != 0) {
                                        z20 = false;
                                        z21 = z16;
                                        z22 = z17;
                                    } else {
                                        z21 = z16;
                                        z22 = z17;
                                        z20 = z18;
                                    }
                                }
                                z23 = z15;
                                i21 = i23;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                                }
                                theme = context2.getTheme();
                                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                                if (!f43553b) {
                                    Method declaredMethod5 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                    declaredMethod5.setAccessible(true);
                                    f43554c = declaredMethod5;
                                    f43553b = true;
                                }
                                method = f43554c;
                                theme2 = null;
                                if (method != null) {
                                    theme2 = method.invoke(theme, new Object[0]);
                                }
                                if (theme2 == null) {
                                    theme2 = context2.getTheme();
                                }
                                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(theme2);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                ThemeParameters themeParameters5 = (ThemeParameters) objRememberedValue;
                                colors = themeParameters5.getColors();
                                composerStartRestartGroup.startReplaceableGroup(-535944663);
                                if (colors == null) {
                                    colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                typography = themeParameters5.getTypography();
                                composerStartRestartGroup.startReplaceableGroup(-535944598);
                                if (typography == null) {
                                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                shapes = themeParameters5.getShapes();
                                composerStartRestartGroup.startReplaceableGroup(-535944529);
                                if (shapes == null) {
                                    shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z15 = z23;
                                z24 = z22;
                                z25 = z20;
                                z26 = z19;
                                context3 = context2;
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if ((i10 & 1) != 0) {
                                    if (i22 != 0) {
                                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        i23 &= -15;
                                    } else {
                                        context2 = context;
                                    }
                                    if (i24 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = z10;
                                    }
                                    if (i12 != 0) {
                                        z15 = true;
                                    }
                                    if (i14 != 0) {
                                        z16 = true;
                                    }
                                    if (i16 != 0) {
                                        z17 = false;
                                    }
                                    if (i18 != 0) {
                                        z20 = false;
                                        z21 = z16;
                                        z22 = z17;
                                    } else {
                                        z21 = z16;
                                        z22 = z17;
                                        z20 = z18;
                                    }
                                } else {
                                    if (i22 != 0) {
                                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        i23 &= -15;
                                    } else {
                                        context2 = context;
                                    }
                                    if (i24 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = z10;
                                    }
                                    if (i12 != 0) {
                                        z15 = true;
                                    }
                                    if (i14 != 0) {
                                        z16 = true;
                                    }
                                    if (i16 != 0) {
                                        z17 = false;
                                    }
                                    if (i18 != 0) {
                                        z20 = false;
                                        z21 = z16;
                                        z22 = z17;
                                    } else {
                                        z21 = z16;
                                        z22 = z17;
                                        z20 = z18;
                                    }
                                }
                                z23 = z15;
                                i21 = i23;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                                }
                                theme = context2.getTheme();
                                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                                if (!f43553b) {
                                    Method declaredMethod6 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                    declaredMethod6.setAccessible(true);
                                    f43554c = declaredMethod6;
                                    f43553b = true;
                                }
                                method = f43554c;
                                theme2 = null;
                                if (method != null) {
                                    theme2 = method.invoke(theme, new Object[0]);
                                }
                                if (theme2 == null) {
                                    theme2 = context2.getTheme();
                                }
                                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(theme2);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                ThemeParameters themeParameters6 = (ThemeParameters) objRememberedValue;
                                colors = themeParameters6.getColors();
                                composerStartRestartGroup.startReplaceableGroup(-535944663);
                                if (colors == null) {
                                    colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                typography = themeParameters6.getTypography();
                                composerStartRestartGroup.startReplaceableGroup(-535944598);
                                if (typography == null) {
                                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                shapes = themeParameters6.getShapes();
                                composerStartRestartGroup.startReplaceableGroup(-535944529);
                                if (shapes == null) {
                                    shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z15 = z23;
                                z24 = z22;
                                z25 = z20;
                                z26 = z19;
                                context3 = context2;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                        }
                        i20 = 1572864;
                        i23 |= i20;
                        if (i22 != 1) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod7 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod7.setAccessible(true);
                                f43554c = declaredMethod7;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters7 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters7.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters7.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters7.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod8 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod8.setAccessible(true);
                                f43554c = declaredMethod8;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters8 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters8.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters8.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters8.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                    }
                    i23 |= 24576;
                    z17 = z13;
                    i18 = i11 & 32;
                    if (i18 != 0) {
                        if ((458752 & i10) == 0) {
                            z18 = z14;
                            if (composerStartRestartGroup.changed(z18)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i23 |= i19;
                        }
                        if ((i11 & 64) != 0) {
                            if ((i10 & 3670016) == 0) {
                                if (composerStartRestartGroup.changedInstance(content)) {
                                    i20 = 1048576;
                                } else {
                                    i20 = 524288;
                                }
                            }
                            if (i22 != 1) {
                                composerStartRestartGroup.startDefaults();
                                if ((i10 & 1) != 0) {
                                    if (i22 != 0) {
                                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        i23 &= -15;
                                    } else {
                                        context2 = context;
                                    }
                                    if (i24 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = z10;
                                    }
                                    if (i12 != 0) {
                                        z15 = true;
                                    }
                                    if (i14 != 0) {
                                        z16 = true;
                                    }
                                    if (i16 != 0) {
                                        z17 = false;
                                    }
                                    if (i18 != 0) {
                                        z20 = false;
                                        z21 = z16;
                                        z22 = z17;
                                    } else {
                                        z21 = z16;
                                        z22 = z17;
                                        z20 = z18;
                                    }
                                } else {
                                    if (i22 != 0) {
                                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        i23 &= -15;
                                    } else {
                                        context2 = context;
                                    }
                                    if (i24 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = z10;
                                    }
                                    if (i12 != 0) {
                                        z15 = true;
                                    }
                                    if (i14 != 0) {
                                        z16 = true;
                                    }
                                    if (i16 != 0) {
                                        z17 = false;
                                    }
                                    if (i18 != 0) {
                                        z20 = false;
                                        z21 = z16;
                                        z22 = z17;
                                    } else {
                                        z21 = z16;
                                        z22 = z17;
                                        z20 = z18;
                                    }
                                }
                                z23 = z15;
                                i21 = i23;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                                }
                                theme = context2.getTheme();
                                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                                if (!f43553b) {
                                    Method declaredMethod9 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                    declaredMethod9.setAccessible(true);
                                    f43554c = declaredMethod9;
                                    f43553b = true;
                                }
                                method = f43554c;
                                theme2 = null;
                                if (method != null) {
                                    theme2 = method.invoke(theme, new Object[0]);
                                }
                                if (theme2 == null) {
                                    theme2 = context2.getTheme();
                                }
                                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(theme2);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                ThemeParameters themeParameters9 = (ThemeParameters) objRememberedValue;
                                colors = themeParameters9.getColors();
                                composerStartRestartGroup.startReplaceableGroup(-535944663);
                                if (colors == null) {
                                    colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                typography = themeParameters9.getTypography();
                                composerStartRestartGroup.startReplaceableGroup(-535944598);
                                if (typography == null) {
                                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                shapes = themeParameters9.getShapes();
                                composerStartRestartGroup.startReplaceableGroup(-535944529);
                                if (shapes == null) {
                                    shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z15 = z23;
                                z24 = z22;
                                z25 = z20;
                                z26 = z19;
                                context3 = context2;
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if ((i10 & 1) != 0) {
                                    if (i22 != 0) {
                                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        i23 &= -15;
                                    } else {
                                        context2 = context;
                                    }
                                    if (i24 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = z10;
                                    }
                                    if (i12 != 0) {
                                        z15 = true;
                                    }
                                    if (i14 != 0) {
                                        z16 = true;
                                    }
                                    if (i16 != 0) {
                                        z17 = false;
                                    }
                                    if (i18 != 0) {
                                        z20 = false;
                                        z21 = z16;
                                        z22 = z17;
                                    } else {
                                        z21 = z16;
                                        z22 = z17;
                                        z20 = z18;
                                    }
                                } else {
                                    if (i22 != 0) {
                                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        i23 &= -15;
                                    } else {
                                        context2 = context;
                                    }
                                    if (i24 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = z10;
                                    }
                                    if (i12 != 0) {
                                        z15 = true;
                                    }
                                    if (i14 != 0) {
                                        z16 = true;
                                    }
                                    if (i16 != 0) {
                                        z17 = false;
                                    }
                                    if (i18 != 0) {
                                        z20 = false;
                                        z21 = z16;
                                        z22 = z17;
                                    } else {
                                        z21 = z16;
                                        z22 = z17;
                                        z20 = z18;
                                    }
                                }
                                z23 = z15;
                                i21 = i23;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                                }
                                theme = context2.getTheme();
                                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                                if (!f43553b) {
                                    Method declaredMethod10 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                    declaredMethod10.setAccessible(true);
                                    f43554c = declaredMethod10;
                                    f43553b = true;
                                }
                                method = f43554c;
                                theme2 = null;
                                if (method != null) {
                                    theme2 = method.invoke(theme, new Object[0]);
                                }
                                if (theme2 == null) {
                                    theme2 = context2.getTheme();
                                }
                                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(theme2);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                ThemeParameters themeParameters10 = (ThemeParameters) objRememberedValue;
                                colors = themeParameters10.getColors();
                                composerStartRestartGroup.startReplaceableGroup(-535944663);
                                if (colors == null) {
                                    colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                typography = themeParameters10.getTypography();
                                composerStartRestartGroup.startReplaceableGroup(-535944598);
                                if (typography == null) {
                                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                shapes = themeParameters10.getShapes();
                                composerStartRestartGroup.startReplaceableGroup(-535944529);
                                if (shapes == null) {
                                    shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z15 = z23;
                                z24 = z22;
                                z25 = z20;
                                z26 = z19;
                                context3 = context2;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                        }
                        i20 = 1572864;
                        i23 |= i20;
                        if (i22 != 1) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod11 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod11.setAccessible(true);
                                f43554c = declaredMethod11;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters11 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters11.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters11.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters11.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod12 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod12.setAccessible(true);
                                f43554c = declaredMethod12;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters12 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters12.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters12.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters12.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                    }
                    i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    z18 = z14;
                    if ((i11 & 64) != 0) {
                        if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                        }
                        if (i22 != 1) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod13 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod13.setAccessible(true);
                                f43554c = declaredMethod13;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters13 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters13.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters13.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters13.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod14 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod14.setAccessible(true);
                                f43554c = declaredMethod14;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters14 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters14.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters14.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters14.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                    }
                    i20 = 1572864;
                    i23 |= i20;
                    if (i22 != 1) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod15 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod15.setAccessible(true);
                            f43554c = declaredMethod15;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters15 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters15.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters15.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters15.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod16 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod16.setAccessible(true);
                            f43554c = declaredMethod16;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters16 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters16.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters16.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters16.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                }
                i23 |= 3072;
                z16 = z12;
                i16 = i11 & 16;
                if (i16 != 0) {
                    if ((57344 & i10) == 0) {
                        z17 = z13;
                        if (composerStartRestartGroup.changed(z17)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i23 |= i17;
                    }
                    i18 = i11 & 32;
                    if (i18 != 0) {
                        if ((458752 & i10) == 0) {
                            z18 = z14;
                            if (composerStartRestartGroup.changed(z18)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i23 |= i19;
                        }
                        if ((i11 & 64) != 0) {
                            if ((i10 & 3670016) == 0) {
                                if (composerStartRestartGroup.changedInstance(content)) {
                                    i20 = 1048576;
                                } else {
                                    i20 = 524288;
                                }
                            }
                            if (i22 != 1) {
                                composerStartRestartGroup.startDefaults();
                                if ((i10 & 1) != 0) {
                                    if (i22 != 0) {
                                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        i23 &= -15;
                                    } else {
                                        context2 = context;
                                    }
                                    if (i24 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = z10;
                                    }
                                    if (i12 != 0) {
                                        z15 = true;
                                    }
                                    if (i14 != 0) {
                                        z16 = true;
                                    }
                                    if (i16 != 0) {
                                        z17 = false;
                                    }
                                    if (i18 != 0) {
                                        z20 = false;
                                        z21 = z16;
                                        z22 = z17;
                                    } else {
                                        z21 = z16;
                                        z22 = z17;
                                        z20 = z18;
                                    }
                                } else {
                                    if (i22 != 0) {
                                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        i23 &= -15;
                                    } else {
                                        context2 = context;
                                    }
                                    if (i24 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = z10;
                                    }
                                    if (i12 != 0) {
                                        z15 = true;
                                    }
                                    if (i14 != 0) {
                                        z16 = true;
                                    }
                                    if (i16 != 0) {
                                        z17 = false;
                                    }
                                    if (i18 != 0) {
                                        z20 = false;
                                        z21 = z16;
                                        z22 = z17;
                                    } else {
                                        z21 = z16;
                                        z22 = z17;
                                        z20 = z18;
                                    }
                                }
                                z23 = z15;
                                i21 = i23;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                                }
                                theme = context2.getTheme();
                                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                                if (!f43553b) {
                                    Method declaredMethod17 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                    declaredMethod17.setAccessible(true);
                                    f43554c = declaredMethod17;
                                    f43553b = true;
                                }
                                method = f43554c;
                                theme2 = null;
                                if (method != null) {
                                    theme2 = method.invoke(theme, new Object[0]);
                                }
                                if (theme2 == null) {
                                    theme2 = context2.getTheme();
                                }
                                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(theme2);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                ThemeParameters themeParameters17 = (ThemeParameters) objRememberedValue;
                                colors = themeParameters17.getColors();
                                composerStartRestartGroup.startReplaceableGroup(-535944663);
                                if (colors == null) {
                                    colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                typography = themeParameters17.getTypography();
                                composerStartRestartGroup.startReplaceableGroup(-535944598);
                                if (typography == null) {
                                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                shapes = themeParameters17.getShapes();
                                composerStartRestartGroup.startReplaceableGroup(-535944529);
                                if (shapes == null) {
                                    shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z15 = z23;
                                z24 = z22;
                                z25 = z20;
                                z26 = z19;
                                context3 = context2;
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if ((i10 & 1) != 0) {
                                    if (i22 != 0) {
                                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        i23 &= -15;
                                    } else {
                                        context2 = context;
                                    }
                                    if (i24 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = z10;
                                    }
                                    if (i12 != 0) {
                                        z15 = true;
                                    }
                                    if (i14 != 0) {
                                        z16 = true;
                                    }
                                    if (i16 != 0) {
                                        z17 = false;
                                    }
                                    if (i18 != 0) {
                                        z20 = false;
                                        z21 = z16;
                                        z22 = z17;
                                    } else {
                                        z21 = z16;
                                        z22 = z17;
                                        z20 = z18;
                                    }
                                } else {
                                    if (i22 != 0) {
                                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        i23 &= -15;
                                    } else {
                                        context2 = context;
                                    }
                                    if (i24 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = z10;
                                    }
                                    if (i12 != 0) {
                                        z15 = true;
                                    }
                                    if (i14 != 0) {
                                        z16 = true;
                                    }
                                    if (i16 != 0) {
                                        z17 = false;
                                    }
                                    if (i18 != 0) {
                                        z20 = false;
                                        z21 = z16;
                                        z22 = z17;
                                    } else {
                                        z21 = z16;
                                        z22 = z17;
                                        z20 = z18;
                                    }
                                }
                                z23 = z15;
                                i21 = i23;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                                }
                                theme = context2.getTheme();
                                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                                if (!f43553b) {
                                    Method declaredMethod18 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                    declaredMethod18.setAccessible(true);
                                    f43554c = declaredMethod18;
                                    f43553b = true;
                                }
                                method = f43554c;
                                theme2 = null;
                                if (method != null) {
                                    theme2 = method.invoke(theme, new Object[0]);
                                }
                                if (theme2 == null) {
                                    theme2 = context2.getTheme();
                                }
                                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(theme2);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                ThemeParameters themeParameters18 = (ThemeParameters) objRememberedValue;
                                colors = themeParameters18.getColors();
                                composerStartRestartGroup.startReplaceableGroup(-535944663);
                                if (colors == null) {
                                    colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                typography = themeParameters18.getTypography();
                                composerStartRestartGroup.startReplaceableGroup(-535944598);
                                if (typography == null) {
                                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                shapes = themeParameters18.getShapes();
                                composerStartRestartGroup.startReplaceableGroup(-535944529);
                                if (shapes == null) {
                                    shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z15 = z23;
                                z24 = z22;
                                z25 = z20;
                                z26 = z19;
                                context3 = context2;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                        }
                        i20 = 1572864;
                        i23 |= i20;
                        if (i22 != 1) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod19 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod19.setAccessible(true);
                                f43554c = declaredMethod19;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters19 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters19.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters19.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters19.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod110 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod110.setAccessible(true);
                                f43554c = declaredMethod110;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters110 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters110.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters110.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters110.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                    }
                    i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    z18 = z14;
                    if ((i11 & 64) != 0) {
                        if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                        }
                        if (i22 != 1) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod111 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod111.setAccessible(true);
                                f43554c = declaredMethod111;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters111 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters111.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters111.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters111.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod112 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod112.setAccessible(true);
                                f43554c = declaredMethod112;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters112 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters112.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters112.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters112.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                    }
                    i20 = 1572864;
                    i23 |= i20;
                    if (i22 != 1) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod113 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod113.setAccessible(true);
                            f43554c = declaredMethod113;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters113 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters113.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters113.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters113.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod114 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod114.setAccessible(true);
                            f43554c = declaredMethod114;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters114 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters114.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters114.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters114.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                }
                i23 |= 24576;
                z17 = z13;
                i18 = i11 & 32;
                if (i18 != 0) {
                    if ((458752 & i10) == 0) {
                        z18 = z14;
                        if (composerStartRestartGroup.changed(z18)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i23 |= i19;
                    }
                    if ((i11 & 64) != 0) {
                        if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                        }
                        if (i22 != 1) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod115 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod115.setAccessible(true);
                                f43554c = declaredMethod115;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters115 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters115.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters115.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters115.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod116 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod116.setAccessible(true);
                                f43554c = declaredMethod116;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters116 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters116.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters116.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters116.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                    }
                    i20 = 1572864;
                    i23 |= i20;
                    if (i22 != 1) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod117 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod117.setAccessible(true);
                            f43554c = declaredMethod117;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters117 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters117.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters117.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters117.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod118 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod118.setAccessible(true);
                            f43554c = declaredMethod118;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters118 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters118.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters118.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters118.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                }
                i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z18 = z14;
                if ((i11 & 64) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                    }
                    if (i22 != 1) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod119 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod119.setAccessible(true);
                            f43554c = declaredMethod119;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters119 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters119.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters119.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters119.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod1110 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod1110.setAccessible(true);
                            f43554c = declaredMethod1110;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters1110 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters1110.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters1110.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters1110.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                }
                i20 = 1572864;
                i23 |= i20;
                if (i22 != 1) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod1111 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod1111.setAccessible(true);
                        f43554c = declaredMethod1111;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters1111 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters1111.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters1111.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters1111.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod1112 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod1112.setAccessible(true);
                        f43554c = declaredMethod1112;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters1112 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters1112.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters1112.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters1112.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
            }
            i23 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            z15 = z11;
            i14 = i11 & 8;
            if (i14 != 0) {
                if ((i10 & 7168) == 0) {
                    z16 = z12;
                    if (composerStartRestartGroup.changed(z16)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i23 |= i15;
                }
                i16 = i11 & 16;
                if (i16 != 0) {
                    if ((57344 & i10) == 0) {
                        z17 = z13;
                        if (composerStartRestartGroup.changed(z17)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i23 |= i17;
                    }
                    i18 = i11 & 32;
                    if (i18 != 0) {
                        if ((458752 & i10) == 0) {
                            z18 = z14;
                            if (composerStartRestartGroup.changed(z18)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i23 |= i19;
                        }
                        if ((i11 & 64) != 0) {
                            if ((i10 & 3670016) == 0) {
                                if (composerStartRestartGroup.changedInstance(content)) {
                                    i20 = 1048576;
                                } else {
                                    i20 = 524288;
                                }
                            }
                            if (i22 != 1) {
                                composerStartRestartGroup.startDefaults();
                                if ((i10 & 1) != 0) {
                                    if (i22 != 0) {
                                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        i23 &= -15;
                                    } else {
                                        context2 = context;
                                    }
                                    if (i24 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = z10;
                                    }
                                    if (i12 != 0) {
                                        z15 = true;
                                    }
                                    if (i14 != 0) {
                                        z16 = true;
                                    }
                                    if (i16 != 0) {
                                        z17 = false;
                                    }
                                    if (i18 != 0) {
                                        z20 = false;
                                        z21 = z16;
                                        z22 = z17;
                                    } else {
                                        z21 = z16;
                                        z22 = z17;
                                        z20 = z18;
                                    }
                                } else {
                                    if (i22 != 0) {
                                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        i23 &= -15;
                                    } else {
                                        context2 = context;
                                    }
                                    if (i24 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = z10;
                                    }
                                    if (i12 != 0) {
                                        z15 = true;
                                    }
                                    if (i14 != 0) {
                                        z16 = true;
                                    }
                                    if (i16 != 0) {
                                        z17 = false;
                                    }
                                    if (i18 != 0) {
                                        z20 = false;
                                        z21 = z16;
                                        z22 = z17;
                                    } else {
                                        z21 = z16;
                                        z22 = z17;
                                        z20 = z18;
                                    }
                                }
                                z23 = z15;
                                i21 = i23;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                                }
                                theme = context2.getTheme();
                                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                                if (!f43553b) {
                                    Method declaredMethod1113 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                    declaredMethod1113.setAccessible(true);
                                    f43554c = declaredMethod1113;
                                    f43553b = true;
                                }
                                method = f43554c;
                                theme2 = null;
                                if (method != null) {
                                    theme2 = method.invoke(theme, new Object[0]);
                                }
                                if (theme2 == null) {
                                    theme2 = context2.getTheme();
                                }
                                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(theme2);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                ThemeParameters themeParameters1113 = (ThemeParameters) objRememberedValue;
                                colors = themeParameters1113.getColors();
                                composerStartRestartGroup.startReplaceableGroup(-535944663);
                                if (colors == null) {
                                    colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                typography = themeParameters1113.getTypography();
                                composerStartRestartGroup.startReplaceableGroup(-535944598);
                                if (typography == null) {
                                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                shapes = themeParameters1113.getShapes();
                                composerStartRestartGroup.startReplaceableGroup(-535944529);
                                if (shapes == null) {
                                    shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z15 = z23;
                                z24 = z22;
                                z25 = z20;
                                z26 = z19;
                                context3 = context2;
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if ((i10 & 1) != 0) {
                                    if (i22 != 0) {
                                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        i23 &= -15;
                                    } else {
                                        context2 = context;
                                    }
                                    if (i24 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = z10;
                                    }
                                    if (i12 != 0) {
                                        z15 = true;
                                    }
                                    if (i14 != 0) {
                                        z16 = true;
                                    }
                                    if (i16 != 0) {
                                        z17 = false;
                                    }
                                    if (i18 != 0) {
                                        z20 = false;
                                        z21 = z16;
                                        z22 = z17;
                                    } else {
                                        z21 = z16;
                                        z22 = z17;
                                        z20 = z18;
                                    }
                                } else {
                                    if (i22 != 0) {
                                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        i23 &= -15;
                                    } else {
                                        context2 = context;
                                    }
                                    if (i24 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = z10;
                                    }
                                    if (i12 != 0) {
                                        z15 = true;
                                    }
                                    if (i14 != 0) {
                                        z16 = true;
                                    }
                                    if (i16 != 0) {
                                        z17 = false;
                                    }
                                    if (i18 != 0) {
                                        z20 = false;
                                        z21 = z16;
                                        z22 = z17;
                                    } else {
                                        z21 = z16;
                                        z22 = z17;
                                        z20 = z18;
                                    }
                                }
                                z23 = z15;
                                i21 = i23;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                                }
                                theme = context2.getTheme();
                                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                                if (!f43553b) {
                                    Method declaredMethod1114 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                    declaredMethod1114.setAccessible(true);
                                    f43554c = declaredMethod1114;
                                    f43553b = true;
                                }
                                method = f43554c;
                                theme2 = null;
                                if (method != null) {
                                    theme2 = method.invoke(theme, new Object[0]);
                                }
                                if (theme2 == null) {
                                    theme2 = context2.getTheme();
                                }
                                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(theme2);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                ThemeParameters themeParameters1114 = (ThemeParameters) objRememberedValue;
                                colors = themeParameters1114.getColors();
                                composerStartRestartGroup.startReplaceableGroup(-535944663);
                                if (colors == null) {
                                    colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                typography = themeParameters1114.getTypography();
                                composerStartRestartGroup.startReplaceableGroup(-535944598);
                                if (typography == null) {
                                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                shapes = themeParameters1114.getShapes();
                                composerStartRestartGroup.startReplaceableGroup(-535944529);
                                if (shapes == null) {
                                    shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z15 = z23;
                                z24 = z22;
                                z25 = z20;
                                z26 = z19;
                                context3 = context2;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                        }
                        i20 = 1572864;
                        i23 |= i20;
                        if (i22 != 1) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod1115 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod1115.setAccessible(true);
                                f43554c = declaredMethod1115;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters1115 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters1115.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters1115.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters1115.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod1116 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod1116.setAccessible(true);
                                f43554c = declaredMethod1116;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters1116 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters1116.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters1116.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters1116.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                    }
                    i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    z18 = z14;
                    if ((i11 & 64) != 0) {
                        if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                        }
                        if (i22 != 1) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod1117 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod1117.setAccessible(true);
                                f43554c = declaredMethod1117;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters1117 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters1117.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters1117.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters1117.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod1118 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod1118.setAccessible(true);
                                f43554c = declaredMethod1118;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters1118 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters1118.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters1118.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters1118.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                    }
                    i20 = 1572864;
                    i23 |= i20;
                    if (i22 != 1) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod1119 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod1119.setAccessible(true);
                            f43554c = declaredMethod1119;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters1119 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters1119.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters1119.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters1119.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod11110 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod11110.setAccessible(true);
                            f43554c = declaredMethod11110;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters11110 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters11110.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters11110.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters11110.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                }
                i23 |= 24576;
                z17 = z13;
                i18 = i11 & 32;
                if (i18 != 0) {
                    if ((458752 & i10) == 0) {
                        z18 = z14;
                        if (composerStartRestartGroup.changed(z18)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i23 |= i19;
                    }
                    if ((i11 & 64) != 0) {
                        if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                        }
                        if (i22 != 1) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod11111 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod11111.setAccessible(true);
                                f43554c = declaredMethod11111;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters11111 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters11111.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters11111.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters11111.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod11112 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod11112.setAccessible(true);
                                f43554c = declaredMethod11112;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters11112 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters11112.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters11112.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters11112.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                    }
                    i20 = 1572864;
                    i23 |= i20;
                    if (i22 != 1) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod11113 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod11113.setAccessible(true);
                            f43554c = declaredMethod11113;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters11113 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters11113.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters11113.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters11113.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod11114 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod11114.setAccessible(true);
                            f43554c = declaredMethod11114;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters11114 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters11114.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters11114.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters11114.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                }
                i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z18 = z14;
                if ((i11 & 64) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                    }
                    if (i22 != 1) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod11115 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod11115.setAccessible(true);
                            f43554c = declaredMethod11115;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters11115 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters11115.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters11115.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters11115.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod11116 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod11116.setAccessible(true);
                            f43554c = declaredMethod11116;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters11116 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters11116.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters11116.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters11116.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                }
                i20 = 1572864;
                i23 |= i20;
                if (i22 != 1) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod11117 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod11117.setAccessible(true);
                        f43554c = declaredMethod11117;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters11117 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters11117.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters11117.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters11117.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod11118 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod11118.setAccessible(true);
                        f43554c = declaredMethod11118;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters11118 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters11118.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters11118.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters11118.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
            }
            i23 |= 3072;
            z16 = z12;
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((57344 & i10) == 0) {
                    z17 = z13;
                    if (composerStartRestartGroup.changed(z17)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i23 |= i17;
                }
                i18 = i11 & 32;
                if (i18 != 0) {
                    if ((458752 & i10) == 0) {
                        z18 = z14;
                        if (composerStartRestartGroup.changed(z18)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i23 |= i19;
                    }
                    if ((i11 & 64) != 0) {
                        if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                        }
                        if (i22 != 1) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod11119 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod11119.setAccessible(true);
                                f43554c = declaredMethod11119;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters11119 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters11119.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters11119.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters11119.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod111110 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod111110.setAccessible(true);
                                f43554c = declaredMethod111110;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters111110 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters111110.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters111110.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters111110.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                    }
                    i20 = 1572864;
                    i23 |= i20;
                    if (i22 != 1) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod111111 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod111111.setAccessible(true);
                            f43554c = declaredMethod111111;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters111111 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters111111.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters111111.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters111111.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod111112 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod111112.setAccessible(true);
                            f43554c = declaredMethod111112;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters111112 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters111112.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters111112.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters111112.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                }
                i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z18 = z14;
                if ((i11 & 64) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                    }
                    if (i22 != 1) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod111113 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod111113.setAccessible(true);
                            f43554c = declaredMethod111113;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters111113 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters111113.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters111113.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters111113.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod111114 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod111114.setAccessible(true);
                            f43554c = declaredMethod111114;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters111114 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters111114.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters111114.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters111114.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                }
                i20 = 1572864;
                i23 |= i20;
                if (i22 != 1) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod111115 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod111115.setAccessible(true);
                        f43554c = declaredMethod111115;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters111115 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters111115.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters111115.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters111115.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod111116 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod111116.setAccessible(true);
                        f43554c = declaredMethod111116;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters111116 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters111116.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters111116.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters111116.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
            }
            i23 |= 24576;
            z17 = z13;
            i18 = i11 & 32;
            if (i18 != 0) {
                if ((458752 & i10) == 0) {
                    z18 = z14;
                    if (composerStartRestartGroup.changed(z18)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i23 |= i19;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                    }
                    if (i22 != 1) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod111117 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod111117.setAccessible(true);
                            f43554c = declaredMethod111117;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters111117 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters111117.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters111117.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters111117.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod111118 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod111118.setAccessible(true);
                            f43554c = declaredMethod111118;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters111118 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters111118.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters111118.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters111118.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                }
                i20 = 1572864;
                i23 |= i20;
                if (i22 != 1) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod111119 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod111119.setAccessible(true);
                        f43554c = declaredMethod111119;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters111119 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters111119.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters111119.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters111119.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod1111110 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod1111110.setAccessible(true);
                        f43554c = declaredMethod1111110;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters1111110 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters1111110.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters1111110.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters1111110.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
            }
            i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z18 = z14;
            if ((i11 & 64) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                }
                if (i22 != 1) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod1111111 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod1111111.setAccessible(true);
                        f43554c = declaredMethod1111111;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters1111111 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters1111111.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters1111111.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters1111111.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod1111112 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod1111112.setAccessible(true);
                        f43554c = declaredMethod1111112;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters1111112 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters1111112.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters1111112.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters1111112.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
            }
            i20 = 1572864;
            i23 |= i20;
            if (i22 != 1) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        i23 &= -15;
                    } else {
                        context2 = context;
                    }
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z10;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z20 = false;
                        z21 = z16;
                        z22 = z17;
                    } else {
                        z21 = z16;
                        z22 = z17;
                        z20 = z18;
                    }
                } else {
                    if (i22 != 0) {
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        i23 &= -15;
                    } else {
                        context2 = context;
                    }
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z10;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z20 = false;
                        z21 = z16;
                        z22 = z17;
                    } else {
                        z21 = z16;
                        z22 = z17;
                        z20 = z18;
                    }
                }
                z23 = z15;
                i21 = i23;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                }
                theme = context2.getTheme();
                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                if (!f43553b) {
                    Method declaredMethod1111113 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                    declaredMethod1111113.setAccessible(true);
                    f43554c = declaredMethod1111113;
                    f43553b = true;
                }
                method = f43554c;
                theme2 = null;
                if (method != null) {
                    theme2 = method.invoke(theme, new Object[0]);
                }
                if (theme2 == null) {
                    theme2 = context2.getTheme();
                }
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(theme2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ThemeParameters themeParameters1111113 = (ThemeParameters) objRememberedValue;
                colors = themeParameters1111113.getColors();
                composerStartRestartGroup.startReplaceableGroup(-535944663);
                if (colors == null) {
                    colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                typography = themeParameters1111113.getTypography();
                composerStartRestartGroup.startReplaceableGroup(-535944598);
                if (typography == null) {
                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                shapes = themeParameters1111113.getShapes();
                composerStartRestartGroup.startReplaceableGroup(-535944529);
                if (shapes == null) {
                    shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z23;
                z24 = z22;
                z25 = z20;
                z26 = z19;
                context3 = context2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        i23 &= -15;
                    } else {
                        context2 = context;
                    }
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z10;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z20 = false;
                        z21 = z16;
                        z22 = z17;
                    } else {
                        z21 = z16;
                        z22 = z17;
                        z20 = z18;
                    }
                } else {
                    if (i22 != 0) {
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        i23 &= -15;
                    } else {
                        context2 = context;
                    }
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z10;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z20 = false;
                        z21 = z16;
                        z22 = z17;
                    } else {
                        z21 = z16;
                        z22 = z17;
                        z20 = z18;
                    }
                }
                z23 = z15;
                i21 = i23;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                }
                theme = context2.getTheme();
                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                if (!f43553b) {
                    Method declaredMethod1111114 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                    declaredMethod1111114.setAccessible(true);
                    f43554c = declaredMethod1111114;
                    f43553b = true;
                }
                method = f43554c;
                theme2 = null;
                if (method != null) {
                    theme2 = method.invoke(theme, new Object[0]);
                }
                if (theme2 == null) {
                    theme2 = context2.getTheme();
                }
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(theme2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ThemeParameters themeParameters1111114 = (ThemeParameters) objRememberedValue;
                colors = themeParameters1111114.getColors();
                composerStartRestartGroup.startReplaceableGroup(-535944663);
                if (colors == null) {
                    colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                typography = themeParameters1111114.getTypography();
                composerStartRestartGroup.startReplaceableGroup(-535944598);
                if (typography == null) {
                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                shapes = themeParameters1111114.getShapes();
                composerStartRestartGroup.startReplaceableGroup(-535944529);
                if (shapes == null) {
                    shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z23;
                z24 = z22;
                z25 = z20;
                z26 = z19;
                context3 = context2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
        }
        i23 |= 48;
        i12 = i11 & 4;
        if (i12 != 0) {
            if ((i10 & 896) == 0) {
                z15 = z11;
                if (composerStartRestartGroup.changed(z15)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i23 |= i13;
            }
            i14 = i11 & 8;
            if (i14 != 0) {
                if ((i10 & 7168) == 0) {
                    z16 = z12;
                    if (composerStartRestartGroup.changed(z16)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i23 |= i15;
                }
                i16 = i11 & 16;
                if (i16 != 0) {
                    if ((57344 & i10) == 0) {
                        z17 = z13;
                        if (composerStartRestartGroup.changed(z17)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i23 |= i17;
                    }
                    i18 = i11 & 32;
                    if (i18 != 0) {
                        if ((458752 & i10) == 0) {
                            z18 = z14;
                            if (composerStartRestartGroup.changed(z18)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i23 |= i19;
                        }
                        if ((i11 & 64) != 0) {
                            if ((i10 & 3670016) == 0) {
                                if (composerStartRestartGroup.changedInstance(content)) {
                                    i20 = 1048576;
                                } else {
                                    i20 = 524288;
                                }
                            }
                            if (i22 != 1) {
                                composerStartRestartGroup.startDefaults();
                                if ((i10 & 1) != 0) {
                                    if (i22 != 0) {
                                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        i23 &= -15;
                                    } else {
                                        context2 = context;
                                    }
                                    if (i24 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = z10;
                                    }
                                    if (i12 != 0) {
                                        z15 = true;
                                    }
                                    if (i14 != 0) {
                                        z16 = true;
                                    }
                                    if (i16 != 0) {
                                        z17 = false;
                                    }
                                    if (i18 != 0) {
                                        z20 = false;
                                        z21 = z16;
                                        z22 = z17;
                                    } else {
                                        z21 = z16;
                                        z22 = z17;
                                        z20 = z18;
                                    }
                                } else {
                                    if (i22 != 0) {
                                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        i23 &= -15;
                                    } else {
                                        context2 = context;
                                    }
                                    if (i24 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = z10;
                                    }
                                    if (i12 != 0) {
                                        z15 = true;
                                    }
                                    if (i14 != 0) {
                                        z16 = true;
                                    }
                                    if (i16 != 0) {
                                        z17 = false;
                                    }
                                    if (i18 != 0) {
                                        z20 = false;
                                        z21 = z16;
                                        z22 = z17;
                                    } else {
                                        z21 = z16;
                                        z22 = z17;
                                        z20 = z18;
                                    }
                                }
                                z23 = z15;
                                i21 = i23;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                                }
                                theme = context2.getTheme();
                                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                                if (!f43553b) {
                                    Method declaredMethod1111115 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                    declaredMethod1111115.setAccessible(true);
                                    f43554c = declaredMethod1111115;
                                    f43553b = true;
                                }
                                method = f43554c;
                                theme2 = null;
                                if (method != null) {
                                    theme2 = method.invoke(theme, new Object[0]);
                                }
                                if (theme2 == null) {
                                    theme2 = context2.getTheme();
                                }
                                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(theme2);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                ThemeParameters themeParameters1111115 = (ThemeParameters) objRememberedValue;
                                colors = themeParameters1111115.getColors();
                                composerStartRestartGroup.startReplaceableGroup(-535944663);
                                if (colors == null) {
                                    colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                typography = themeParameters1111115.getTypography();
                                composerStartRestartGroup.startReplaceableGroup(-535944598);
                                if (typography == null) {
                                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                shapes = themeParameters1111115.getShapes();
                                composerStartRestartGroup.startReplaceableGroup(-535944529);
                                if (shapes == null) {
                                    shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z15 = z23;
                                z24 = z22;
                                z25 = z20;
                                z26 = z19;
                                context3 = context2;
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if ((i10 & 1) != 0) {
                                    if (i22 != 0) {
                                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        i23 &= -15;
                                    } else {
                                        context2 = context;
                                    }
                                    if (i24 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = z10;
                                    }
                                    if (i12 != 0) {
                                        z15 = true;
                                    }
                                    if (i14 != 0) {
                                        z16 = true;
                                    }
                                    if (i16 != 0) {
                                        z17 = false;
                                    }
                                    if (i18 != 0) {
                                        z20 = false;
                                        z21 = z16;
                                        z22 = z17;
                                    } else {
                                        z21 = z16;
                                        z22 = z17;
                                        z20 = z18;
                                    }
                                } else {
                                    if (i22 != 0) {
                                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        i23 &= -15;
                                    } else {
                                        context2 = context;
                                    }
                                    if (i24 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = z10;
                                    }
                                    if (i12 != 0) {
                                        z15 = true;
                                    }
                                    if (i14 != 0) {
                                        z16 = true;
                                    }
                                    if (i16 != 0) {
                                        z17 = false;
                                    }
                                    if (i18 != 0) {
                                        z20 = false;
                                        z21 = z16;
                                        z22 = z17;
                                    } else {
                                        z21 = z16;
                                        z22 = z17;
                                        z20 = z18;
                                    }
                                }
                                z23 = z15;
                                i21 = i23;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                                }
                                theme = context2.getTheme();
                                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                                if (!f43553b) {
                                    Method declaredMethod1111116 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                    declaredMethod1111116.setAccessible(true);
                                    f43554c = declaredMethod1111116;
                                    f43553b = true;
                                }
                                method = f43554c;
                                theme2 = null;
                                if (method != null) {
                                    theme2 = method.invoke(theme, new Object[0]);
                                }
                                if (theme2 == null) {
                                    theme2 = context2.getTheme();
                                }
                                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(theme2);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                ThemeParameters themeParameters1111116 = (ThemeParameters) objRememberedValue;
                                colors = themeParameters1111116.getColors();
                                composerStartRestartGroup.startReplaceableGroup(-535944663);
                                if (colors == null) {
                                    colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                typography = themeParameters1111116.getTypography();
                                composerStartRestartGroup.startReplaceableGroup(-535944598);
                                if (typography == null) {
                                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                shapes = themeParameters1111116.getShapes();
                                composerStartRestartGroup.startReplaceableGroup(-535944529);
                                if (shapes == null) {
                                    shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z15 = z23;
                                z24 = z22;
                                z25 = z20;
                                z26 = z19;
                                context3 = context2;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                        }
                        i20 = 1572864;
                        i23 |= i20;
                        if (i22 != 1) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod1111117 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod1111117.setAccessible(true);
                                f43554c = declaredMethod1111117;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters1111117 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters1111117.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters1111117.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters1111117.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod1111118 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod1111118.setAccessible(true);
                                f43554c = declaredMethod1111118;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters1111118 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters1111118.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters1111118.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters1111118.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                    }
                    i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    z18 = z14;
                    if ((i11 & 64) != 0) {
                        if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                        }
                        if (i22 != 1) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod1111119 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod1111119.setAccessible(true);
                                f43554c = declaredMethod1111119;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters1111119 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters1111119.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters1111119.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters1111119.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod11111110 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod11111110.setAccessible(true);
                                f43554c = declaredMethod11111110;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters11111110 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters11111110.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters11111110.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters11111110.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                    }
                    i20 = 1572864;
                    i23 |= i20;
                    if (i22 != 1) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod11111111 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod11111111.setAccessible(true);
                            f43554c = declaredMethod11111111;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters11111111 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters11111111.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters11111111.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters11111111.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod11111112 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod11111112.setAccessible(true);
                            f43554c = declaredMethod11111112;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters11111112 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters11111112.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters11111112.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters11111112.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                }
                i23 |= 24576;
                z17 = z13;
                i18 = i11 & 32;
                if (i18 != 0) {
                    if ((458752 & i10) == 0) {
                        z18 = z14;
                        if (composerStartRestartGroup.changed(z18)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i23 |= i19;
                    }
                    if ((i11 & 64) != 0) {
                        if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                        }
                        if (i22 != 1) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod11111113 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod11111113.setAccessible(true);
                                f43554c = declaredMethod11111113;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters11111113 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters11111113.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters11111113.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters11111113.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod11111114 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod11111114.setAccessible(true);
                                f43554c = declaredMethod11111114;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters11111114 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters11111114.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters11111114.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters11111114.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                    }
                    i20 = 1572864;
                    i23 |= i20;
                    if (i22 != 1) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod11111115 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod11111115.setAccessible(true);
                            f43554c = declaredMethod11111115;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters11111115 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters11111115.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters11111115.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters11111115.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod11111116 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod11111116.setAccessible(true);
                            f43554c = declaredMethod11111116;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters11111116 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters11111116.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters11111116.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters11111116.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                }
                i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z18 = z14;
                if ((i11 & 64) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                    }
                    if (i22 != 1) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod11111117 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod11111117.setAccessible(true);
                            f43554c = declaredMethod11111117;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters11111117 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters11111117.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters11111117.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters11111117.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod11111118 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod11111118.setAccessible(true);
                            f43554c = declaredMethod11111118;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters11111118 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters11111118.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters11111118.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters11111118.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                }
                i20 = 1572864;
                i23 |= i20;
                if (i22 != 1) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod11111119 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod11111119.setAccessible(true);
                        f43554c = declaredMethod11111119;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters11111119 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters11111119.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters11111119.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters11111119.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod111111110 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod111111110.setAccessible(true);
                        f43554c = declaredMethod111111110;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters111111110 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters111111110.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters111111110.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters111111110.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
            }
            i23 |= 3072;
            z16 = z12;
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((57344 & i10) == 0) {
                    z17 = z13;
                    if (composerStartRestartGroup.changed(z17)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i23 |= i17;
                }
                i18 = i11 & 32;
                if (i18 != 0) {
                    if ((458752 & i10) == 0) {
                        z18 = z14;
                        if (composerStartRestartGroup.changed(z18)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i23 |= i19;
                    }
                    if ((i11 & 64) != 0) {
                        if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                        }
                        if (i22 != 1) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod111111111 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod111111111.setAccessible(true);
                                f43554c = declaredMethod111111111;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters111111111 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters111111111.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters111111111.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters111111111.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod111111112 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod111111112.setAccessible(true);
                                f43554c = declaredMethod111111112;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters111111112 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters111111112.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters111111112.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters111111112.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                    }
                    i20 = 1572864;
                    i23 |= i20;
                    if (i22 != 1) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod111111113 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod111111113.setAccessible(true);
                            f43554c = declaredMethod111111113;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters111111113 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters111111113.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters111111113.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters111111113.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod111111114 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod111111114.setAccessible(true);
                            f43554c = declaredMethod111111114;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters111111114 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters111111114.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters111111114.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters111111114.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                }
                i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z18 = z14;
                if ((i11 & 64) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                    }
                    if (i22 != 1) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod111111115 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod111111115.setAccessible(true);
                            f43554c = declaredMethod111111115;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters111111115 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters111111115.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters111111115.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters111111115.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod111111116 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod111111116.setAccessible(true);
                            f43554c = declaredMethod111111116;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters111111116 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters111111116.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters111111116.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters111111116.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                }
                i20 = 1572864;
                i23 |= i20;
                if (i22 != 1) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod111111117 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod111111117.setAccessible(true);
                        f43554c = declaredMethod111111117;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters111111117 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters111111117.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters111111117.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters111111117.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod111111118 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod111111118.setAccessible(true);
                        f43554c = declaredMethod111111118;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters111111118 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters111111118.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters111111118.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters111111118.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
            }
            i23 |= 24576;
            z17 = z13;
            i18 = i11 & 32;
            if (i18 != 0) {
                if ((458752 & i10) == 0) {
                    z18 = z14;
                    if (composerStartRestartGroup.changed(z18)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i23 |= i19;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                    }
                    if (i22 != 1) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod111111119 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod111111119.setAccessible(true);
                            f43554c = declaredMethod111111119;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters111111119 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters111111119.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters111111119.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters111111119.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod1111111110 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod1111111110.setAccessible(true);
                            f43554c = declaredMethod1111111110;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters1111111110 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters1111111110.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters1111111110.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters1111111110.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                }
                i20 = 1572864;
                i23 |= i20;
                if (i22 != 1) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod1111111111 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod1111111111.setAccessible(true);
                        f43554c = declaredMethod1111111111;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters1111111111 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters1111111111.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters1111111111.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters1111111111.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod1111111112 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod1111111112.setAccessible(true);
                        f43554c = declaredMethod1111111112;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters1111111112 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters1111111112.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters1111111112.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters1111111112.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
            }
            i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z18 = z14;
            if ((i11 & 64) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                }
                if (i22 != 1) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod1111111113 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod1111111113.setAccessible(true);
                        f43554c = declaredMethod1111111113;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters1111111113 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters1111111113.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters1111111113.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters1111111113.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod1111111114 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod1111111114.setAccessible(true);
                        f43554c = declaredMethod1111111114;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters1111111114 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters1111111114.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters1111111114.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters1111111114.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
            }
            i20 = 1572864;
            i23 |= i20;
            if (i22 != 1) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        i23 &= -15;
                    } else {
                        context2 = context;
                    }
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z10;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z20 = false;
                        z21 = z16;
                        z22 = z17;
                    } else {
                        z21 = z16;
                        z22 = z17;
                        z20 = z18;
                    }
                } else {
                    if (i22 != 0) {
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        i23 &= -15;
                    } else {
                        context2 = context;
                    }
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z10;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z20 = false;
                        z21 = z16;
                        z22 = z17;
                    } else {
                        z21 = z16;
                        z22 = z17;
                        z20 = z18;
                    }
                }
                z23 = z15;
                i21 = i23;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                }
                theme = context2.getTheme();
                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                if (!f43553b) {
                    Method declaredMethod1111111115 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                    declaredMethod1111111115.setAccessible(true);
                    f43554c = declaredMethod1111111115;
                    f43553b = true;
                }
                method = f43554c;
                theme2 = null;
                if (method != null) {
                    theme2 = method.invoke(theme, new Object[0]);
                }
                if (theme2 == null) {
                    theme2 = context2.getTheme();
                }
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(theme2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ThemeParameters themeParameters1111111115 = (ThemeParameters) objRememberedValue;
                colors = themeParameters1111111115.getColors();
                composerStartRestartGroup.startReplaceableGroup(-535944663);
                if (colors == null) {
                    colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                typography = themeParameters1111111115.getTypography();
                composerStartRestartGroup.startReplaceableGroup(-535944598);
                if (typography == null) {
                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                shapes = themeParameters1111111115.getShapes();
                composerStartRestartGroup.startReplaceableGroup(-535944529);
                if (shapes == null) {
                    shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z23;
                z24 = z22;
                z25 = z20;
                z26 = z19;
                context3 = context2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        i23 &= -15;
                    } else {
                        context2 = context;
                    }
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z10;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z20 = false;
                        z21 = z16;
                        z22 = z17;
                    } else {
                        z21 = z16;
                        z22 = z17;
                        z20 = z18;
                    }
                } else {
                    if (i22 != 0) {
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        i23 &= -15;
                    } else {
                        context2 = context;
                    }
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z10;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z20 = false;
                        z21 = z16;
                        z22 = z17;
                    } else {
                        z21 = z16;
                        z22 = z17;
                        z20 = z18;
                    }
                }
                z23 = z15;
                i21 = i23;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                }
                theme = context2.getTheme();
                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                if (!f43553b) {
                    Method declaredMethod1111111116 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                    declaredMethod1111111116.setAccessible(true);
                    f43554c = declaredMethod1111111116;
                    f43553b = true;
                }
                method = f43554c;
                theme2 = null;
                if (method != null) {
                    theme2 = method.invoke(theme, new Object[0]);
                }
                if (theme2 == null) {
                    theme2 = context2.getTheme();
                }
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(theme2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ThemeParameters themeParameters1111111116 = (ThemeParameters) objRememberedValue;
                colors = themeParameters1111111116.getColors();
                composerStartRestartGroup.startReplaceableGroup(-535944663);
                if (colors == null) {
                    colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                typography = themeParameters1111111116.getTypography();
                composerStartRestartGroup.startReplaceableGroup(-535944598);
                if (typography == null) {
                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                shapes = themeParameters1111111116.getShapes();
                composerStartRestartGroup.startReplaceableGroup(-535944529);
                if (shapes == null) {
                    shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z23;
                z24 = z22;
                z25 = z20;
                z26 = z19;
                context3 = context2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
        }
        i23 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        z15 = z11;
        i14 = i11 & 8;
        if (i14 != 0) {
            if ((i10 & 7168) == 0) {
                z16 = z12;
                if (composerStartRestartGroup.changed(z16)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i23 |= i15;
            }
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((57344 & i10) == 0) {
                    z17 = z13;
                    if (composerStartRestartGroup.changed(z17)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i23 |= i17;
                }
                i18 = i11 & 32;
                if (i18 != 0) {
                    if ((458752 & i10) == 0) {
                        z18 = z14;
                        if (composerStartRestartGroup.changed(z18)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i23 |= i19;
                    }
                    if ((i11 & 64) != 0) {
                        if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                        }
                        if (i22 != 1) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod1111111117 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod1111111117.setAccessible(true);
                                f43554c = declaredMethod1111111117;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters1111111117 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters1111111117.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters1111111117.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters1111111117.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            } else {
                                if (i22 != 0) {
                                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    i23 &= -15;
                                } else {
                                    context2 = context;
                                }
                                if (i24 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z10;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                }
                                if (i14 != 0) {
                                    z16 = true;
                                }
                                if (i16 != 0) {
                                    z17 = false;
                                }
                                if (i18 != 0) {
                                    z20 = false;
                                    z21 = z16;
                                    z22 = z17;
                                } else {
                                    z21 = z16;
                                    z22 = z17;
                                    z20 = z18;
                                }
                            }
                            z23 = z15;
                            i21 = i23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                            }
                            theme = context2.getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            if (!f43553b) {
                                Method declaredMethod1111111118 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                declaredMethod1111111118.setAccessible(true);
                                f43554c = declaredMethod1111111118;
                                f43553b = true;
                            }
                            method = f43554c;
                            theme2 = null;
                            if (method != null) {
                                theme2 = method.invoke(theme, new Object[0]);
                            }
                            if (theme2 == null) {
                                theme2 = context2.getTheme();
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(theme2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ThemeParameters themeParameters1111111118 = (ThemeParameters) objRememberedValue;
                            colors = themeParameters1111111118.getColors();
                            composerStartRestartGroup.startReplaceableGroup(-535944663);
                            if (colors == null) {
                                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            typography = themeParameters1111111118.getTypography();
                            composerStartRestartGroup.startReplaceableGroup(-535944598);
                            if (typography == null) {
                                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            shapes = themeParameters1111111118.getShapes();
                            composerStartRestartGroup.startReplaceableGroup(-535944529);
                            if (shapes == null) {
                                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z23;
                            z24 = z22;
                            z25 = z20;
                            z26 = z19;
                            context3 = context2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                    }
                    i20 = 1572864;
                    i23 |= i20;
                    if (i22 != 1) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod1111111119 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod1111111119.setAccessible(true);
                            f43554c = declaredMethod1111111119;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters1111111119 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters1111111119.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters1111111119.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters1111111119.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod11111111110 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod11111111110.setAccessible(true);
                            f43554c = declaredMethod11111111110;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters11111111110 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters11111111110.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters11111111110.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters11111111110.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                }
                i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z18 = z14;
                if ((i11 & 64) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                    }
                    if (i22 != 1) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod11111111111 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod11111111111.setAccessible(true);
                            f43554c = declaredMethod11111111111;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters11111111111 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters11111111111.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters11111111111.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters11111111111.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod11111111112 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod11111111112.setAccessible(true);
                            f43554c = declaredMethod11111111112;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters11111111112 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters11111111112.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters11111111112.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters11111111112.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                }
                i20 = 1572864;
                i23 |= i20;
                if (i22 != 1) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod11111111113 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod11111111113.setAccessible(true);
                        f43554c = declaredMethod11111111113;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters11111111113 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters11111111113.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters11111111113.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters11111111113.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod11111111114 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod11111111114.setAccessible(true);
                        f43554c = declaredMethod11111111114;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters11111111114 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters11111111114.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters11111111114.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters11111111114.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
            }
            i23 |= 24576;
            z17 = z13;
            i18 = i11 & 32;
            if (i18 != 0) {
                if ((458752 & i10) == 0) {
                    z18 = z14;
                    if (composerStartRestartGroup.changed(z18)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i23 |= i19;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                    }
                    if (i22 != 1) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod11111111115 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod11111111115.setAccessible(true);
                            f43554c = declaredMethod11111111115;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters11111111115 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters11111111115.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters11111111115.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters11111111115.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod11111111116 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod11111111116.setAccessible(true);
                            f43554c = declaredMethod11111111116;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters11111111116 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters11111111116.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters11111111116.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters11111111116.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                }
                i20 = 1572864;
                i23 |= i20;
                if (i22 != 1) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod11111111117 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod11111111117.setAccessible(true);
                        f43554c = declaredMethod11111111117;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters11111111117 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters11111111117.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters11111111117.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters11111111117.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod11111111118 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod11111111118.setAccessible(true);
                        f43554c = declaredMethod11111111118;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters11111111118 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters11111111118.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters11111111118.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters11111111118.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
            }
            i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z18 = z14;
            if ((i11 & 64) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                }
                if (i22 != 1) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod11111111119 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod11111111119.setAccessible(true);
                        f43554c = declaredMethod11111111119;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters11111111119 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters11111111119.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters11111111119.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters11111111119.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod111111111110 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod111111111110.setAccessible(true);
                        f43554c = declaredMethod111111111110;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters111111111110 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters111111111110.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters111111111110.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters111111111110.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
            }
            i20 = 1572864;
            i23 |= i20;
            if (i22 != 1) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        i23 &= -15;
                    } else {
                        context2 = context;
                    }
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z10;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z20 = false;
                        z21 = z16;
                        z22 = z17;
                    } else {
                        z21 = z16;
                        z22 = z17;
                        z20 = z18;
                    }
                } else {
                    if (i22 != 0) {
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        i23 &= -15;
                    } else {
                        context2 = context;
                    }
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z10;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z20 = false;
                        z21 = z16;
                        z22 = z17;
                    } else {
                        z21 = z16;
                        z22 = z17;
                        z20 = z18;
                    }
                }
                z23 = z15;
                i21 = i23;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                }
                theme = context2.getTheme();
                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                if (!f43553b) {
                    Method declaredMethod111111111111 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                    declaredMethod111111111111.setAccessible(true);
                    f43554c = declaredMethod111111111111;
                    f43553b = true;
                }
                method = f43554c;
                theme2 = null;
                if (method != null) {
                    theme2 = method.invoke(theme, new Object[0]);
                }
                if (theme2 == null) {
                    theme2 = context2.getTheme();
                }
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(theme2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ThemeParameters themeParameters111111111111 = (ThemeParameters) objRememberedValue;
                colors = themeParameters111111111111.getColors();
                composerStartRestartGroup.startReplaceableGroup(-535944663);
                if (colors == null) {
                    colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                typography = themeParameters111111111111.getTypography();
                composerStartRestartGroup.startReplaceableGroup(-535944598);
                if (typography == null) {
                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                shapes = themeParameters111111111111.getShapes();
                composerStartRestartGroup.startReplaceableGroup(-535944529);
                if (shapes == null) {
                    shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z23;
                z24 = z22;
                z25 = z20;
                z26 = z19;
                context3 = context2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        i23 &= -15;
                    } else {
                        context2 = context;
                    }
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z10;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z20 = false;
                        z21 = z16;
                        z22 = z17;
                    } else {
                        z21 = z16;
                        z22 = z17;
                        z20 = z18;
                    }
                } else {
                    if (i22 != 0) {
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        i23 &= -15;
                    } else {
                        context2 = context;
                    }
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z10;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z20 = false;
                        z21 = z16;
                        z22 = z17;
                    } else {
                        z21 = z16;
                        z22 = z17;
                        z20 = z18;
                    }
                }
                z23 = z15;
                i21 = i23;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                }
                theme = context2.getTheme();
                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                if (!f43553b) {
                    Method declaredMethod111111111112 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                    declaredMethod111111111112.setAccessible(true);
                    f43554c = declaredMethod111111111112;
                    f43553b = true;
                }
                method = f43554c;
                theme2 = null;
                if (method != null) {
                    theme2 = method.invoke(theme, new Object[0]);
                }
                if (theme2 == null) {
                    theme2 = context2.getTheme();
                }
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(theme2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ThemeParameters themeParameters111111111112 = (ThemeParameters) objRememberedValue;
                colors = themeParameters111111111112.getColors();
                composerStartRestartGroup.startReplaceableGroup(-535944663);
                if (colors == null) {
                    colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                typography = themeParameters111111111112.getTypography();
                composerStartRestartGroup.startReplaceableGroup(-535944598);
                if (typography == null) {
                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                shapes = themeParameters111111111112.getShapes();
                composerStartRestartGroup.startReplaceableGroup(-535944529);
                if (shapes == null) {
                    shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z23;
                z24 = z22;
                z25 = z20;
                z26 = z19;
                context3 = context2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
        }
        i23 |= 3072;
        z16 = z12;
        i16 = i11 & 16;
        if (i16 != 0) {
            if ((57344 & i10) == 0) {
                z17 = z13;
                if (composerStartRestartGroup.changed(z17)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i23 |= i17;
            }
            i18 = i11 & 32;
            if (i18 != 0) {
                if ((458752 & i10) == 0) {
                    z18 = z14;
                    if (composerStartRestartGroup.changed(z18)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i23 |= i19;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                    }
                    if (i22 != 1) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod111111111113 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod111111111113.setAccessible(true);
                            f43554c = declaredMethod111111111113;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters111111111113 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters111111111113.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters111111111113.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters111111111113.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        } else {
                            if (i22 != 0) {
                                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                i23 &= -15;
                            } else {
                                context2 = context;
                            }
                            if (i24 != 0) {
                                z19 = true;
                            } else {
                                z19 = z10;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            }
                            if (i18 != 0) {
                                z20 = false;
                                z21 = z16;
                                z22 = z17;
                            } else {
                                z21 = z16;
                                z22 = z17;
                                z20 = z18;
                            }
                        }
                        z23 = z15;
                        i21 = i23;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                        }
                        theme = context2.getTheme();
                        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                        if (!f43553b) {
                            Method declaredMethod111111111114 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                            declaredMethod111111111114.setAccessible(true);
                            f43554c = declaredMethod111111111114;
                            f43553b = true;
                        }
                        method = f43554c;
                        theme2 = null;
                        if (method != null) {
                            theme2 = method.invoke(theme, new Object[0]);
                        }
                        if (theme2 == null) {
                            theme2 = context2.getTheme();
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(theme2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ThemeParameters themeParameters111111111114 = (ThemeParameters) objRememberedValue;
                        colors = themeParameters111111111114.getColors();
                        composerStartRestartGroup.startReplaceableGroup(-535944663);
                        if (colors == null) {
                            colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        typography = themeParameters111111111114.getTypography();
                        composerStartRestartGroup.startReplaceableGroup(-535944598);
                        if (typography == null) {
                            typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shapes = themeParameters111111111114.getShapes();
                        composerStartRestartGroup.startReplaceableGroup(-535944529);
                        if (shapes == null) {
                            shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z23;
                        z24 = z22;
                        z25 = z20;
                        z26 = z19;
                        context3 = context2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
                }
                i20 = 1572864;
                i23 |= i20;
                if (i22 != 1) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod111111111115 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod111111111115.setAccessible(true);
                        f43554c = declaredMethod111111111115;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters111111111115 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters111111111115.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters111111111115.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters111111111115.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod111111111116 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod111111111116.setAccessible(true);
                        f43554c = declaredMethod111111111116;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters111111111116 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters111111111116.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters111111111116.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters111111111116.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
            }
            i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z18 = z14;
            if ((i11 & 64) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                }
                if (i22 != 1) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod111111111117 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod111111111117.setAccessible(true);
                        f43554c = declaredMethod111111111117;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters111111111117 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters111111111117.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters111111111117.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters111111111117.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod111111111118 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod111111111118.setAccessible(true);
                        f43554c = declaredMethod111111111118;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters111111111118 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters111111111118.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters111111111118.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters111111111118.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
            }
            i20 = 1572864;
            i23 |= i20;
            if (i22 != 1) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        i23 &= -15;
                    } else {
                        context2 = context;
                    }
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z10;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z20 = false;
                        z21 = z16;
                        z22 = z17;
                    } else {
                        z21 = z16;
                        z22 = z17;
                        z20 = z18;
                    }
                } else {
                    if (i22 != 0) {
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        i23 &= -15;
                    } else {
                        context2 = context;
                    }
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z10;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z20 = false;
                        z21 = z16;
                        z22 = z17;
                    } else {
                        z21 = z16;
                        z22 = z17;
                        z20 = z18;
                    }
                }
                z23 = z15;
                i21 = i23;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                }
                theme = context2.getTheme();
                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                if (!f43553b) {
                    Method declaredMethod111111111119 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                    declaredMethod111111111119.setAccessible(true);
                    f43554c = declaredMethod111111111119;
                    f43553b = true;
                }
                method = f43554c;
                theme2 = null;
                if (method != null) {
                    theme2 = method.invoke(theme, new Object[0]);
                }
                if (theme2 == null) {
                    theme2 = context2.getTheme();
                }
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(theme2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ThemeParameters themeParameters111111111119 = (ThemeParameters) objRememberedValue;
                colors = themeParameters111111111119.getColors();
                composerStartRestartGroup.startReplaceableGroup(-535944663);
                if (colors == null) {
                    colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                typography = themeParameters111111111119.getTypography();
                composerStartRestartGroup.startReplaceableGroup(-535944598);
                if (typography == null) {
                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                shapes = themeParameters111111111119.getShapes();
                composerStartRestartGroup.startReplaceableGroup(-535944529);
                if (shapes == null) {
                    shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z23;
                z24 = z22;
                z25 = z20;
                z26 = z19;
                context3 = context2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        i23 &= -15;
                    } else {
                        context2 = context;
                    }
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z10;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z20 = false;
                        z21 = z16;
                        z22 = z17;
                    } else {
                        z21 = z16;
                        z22 = z17;
                        z20 = z18;
                    }
                } else {
                    if (i22 != 0) {
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        i23 &= -15;
                    } else {
                        context2 = context;
                    }
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z10;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z20 = false;
                        z21 = z16;
                        z22 = z17;
                    } else {
                        z21 = z16;
                        z22 = z17;
                        z20 = z18;
                    }
                }
                z23 = z15;
                i21 = i23;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                }
                theme = context2.getTheme();
                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                if (!f43553b) {
                    Method declaredMethod1111111111110 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                    declaredMethod1111111111110.setAccessible(true);
                    f43554c = declaredMethod1111111111110;
                    f43553b = true;
                }
                method = f43554c;
                theme2 = null;
                if (method != null) {
                    theme2 = method.invoke(theme, new Object[0]);
                }
                if (theme2 == null) {
                    theme2 = context2.getTheme();
                }
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(theme2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ThemeParameters themeParameters1111111111110 = (ThemeParameters) objRememberedValue;
                colors = themeParameters1111111111110.getColors();
                composerStartRestartGroup.startReplaceableGroup(-535944663);
                if (colors == null) {
                    colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                typography = themeParameters1111111111110.getTypography();
                composerStartRestartGroup.startReplaceableGroup(-535944598);
                if (typography == null) {
                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                shapes = themeParameters1111111111110.getShapes();
                composerStartRestartGroup.startReplaceableGroup(-535944529);
                if (shapes == null) {
                    shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z23;
                z24 = z22;
                z25 = z20;
                z26 = z19;
                context3 = context2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
        }
        i23 |= 24576;
        z17 = z13;
        i18 = i11 & 32;
        if (i18 != 0) {
            if ((458752 & i10) == 0) {
                z18 = z14;
                if (composerStartRestartGroup.changed(z18)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i23 |= i19;
            }
            if ((i11 & 64) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                }
                if (i22 != 1) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod1111111111111 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod1111111111111.setAccessible(true);
                        f43554c = declaredMethod1111111111111;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters1111111111111 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters1111111111111.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters1111111111111.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters1111111111111.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    } else {
                        if (i22 != 0) {
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            i23 &= -15;
                        } else {
                            context2 = context;
                        }
                        if (i24 != 0) {
                            z19 = true;
                        } else {
                            z19 = z10;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z20 = false;
                            z21 = z16;
                            z22 = z17;
                        } else {
                            z21 = z16;
                            z22 = z17;
                            z20 = z18;
                        }
                    }
                    z23 = z15;
                    i21 = i23;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                    }
                    theme = context2.getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    if (!f43553b) {
                        Method declaredMethod1111111111112 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                        declaredMethod1111111111112.setAccessible(true);
                        f43554c = declaredMethod1111111111112;
                        f43553b = true;
                    }
                    method = f43554c;
                    theme2 = null;
                    if (method != null) {
                        theme2 = method.invoke(theme, new Object[0]);
                    }
                    if (theme2 == null) {
                        theme2 = context2.getTheme();
                    }
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(theme2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ThemeParameters themeParameters1111111111112 = (ThemeParameters) objRememberedValue;
                    colors = themeParameters1111111111112.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-535944663);
                    if (colors == null) {
                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters1111111111112.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-535944598);
                    if (typography == null) {
                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    shapes = themeParameters1111111111112.getShapes();
                    composerStartRestartGroup.startReplaceableGroup(-535944529);
                    if (shapes == null) {
                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z23;
                    z24 = z22;
                    z25 = z20;
                    z26 = z19;
                    context3 = context2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
            }
            i20 = 1572864;
            i23 |= i20;
            if (i22 != 1) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        i23 &= -15;
                    } else {
                        context2 = context;
                    }
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z10;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z20 = false;
                        z21 = z16;
                        z22 = z17;
                    } else {
                        z21 = z16;
                        z22 = z17;
                        z20 = z18;
                    }
                } else {
                    if (i22 != 0) {
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        i23 &= -15;
                    } else {
                        context2 = context;
                    }
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z10;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z20 = false;
                        z21 = z16;
                        z22 = z17;
                    } else {
                        z21 = z16;
                        z22 = z17;
                        z20 = z18;
                    }
                }
                z23 = z15;
                i21 = i23;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                }
                theme = context2.getTheme();
                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                if (!f43553b) {
                    Method declaredMethod1111111111113 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                    declaredMethod1111111111113.setAccessible(true);
                    f43554c = declaredMethod1111111111113;
                    f43553b = true;
                }
                method = f43554c;
                theme2 = null;
                if (method != null) {
                    theme2 = method.invoke(theme, new Object[0]);
                }
                if (theme2 == null) {
                    theme2 = context2.getTheme();
                }
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(theme2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ThemeParameters themeParameters1111111111113 = (ThemeParameters) objRememberedValue;
                colors = themeParameters1111111111113.getColors();
                composerStartRestartGroup.startReplaceableGroup(-535944663);
                if (colors == null) {
                    colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                typography = themeParameters1111111111113.getTypography();
                composerStartRestartGroup.startReplaceableGroup(-535944598);
                if (typography == null) {
                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                shapes = themeParameters1111111111113.getShapes();
                composerStartRestartGroup.startReplaceableGroup(-535944529);
                if (shapes == null) {
                    shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z23;
                z24 = z22;
                z25 = z20;
                z26 = z19;
                context3 = context2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        i23 &= -15;
                    } else {
                        context2 = context;
                    }
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z10;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z20 = false;
                        z21 = z16;
                        z22 = z17;
                    } else {
                        z21 = z16;
                        z22 = z17;
                        z20 = z18;
                    }
                } else {
                    if (i22 != 0) {
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        i23 &= -15;
                    } else {
                        context2 = context;
                    }
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z10;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z20 = false;
                        z21 = z16;
                        z22 = z17;
                    } else {
                        z21 = z16;
                        z22 = z17;
                        z20 = z18;
                    }
                }
                z23 = z15;
                i21 = i23;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                }
                theme = context2.getTheme();
                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                if (!f43553b) {
                    Method declaredMethod1111111111114 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                    declaredMethod1111111111114.setAccessible(true);
                    f43554c = declaredMethod1111111111114;
                    f43553b = true;
                }
                method = f43554c;
                theme2 = null;
                if (method != null) {
                    theme2 = method.invoke(theme, new Object[0]);
                }
                if (theme2 == null) {
                    theme2 = context2.getTheme();
                }
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(theme2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ThemeParameters themeParameters1111111111114 = (ThemeParameters) objRememberedValue;
                colors = themeParameters1111111111114.getColors();
                composerStartRestartGroup.startReplaceableGroup(-535944663);
                if (colors == null) {
                    colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                typography = themeParameters1111111111114.getTypography();
                composerStartRestartGroup.startReplaceableGroup(-535944598);
                if (typography == null) {
                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                shapes = themeParameters1111111111114.getShapes();
                composerStartRestartGroup.startReplaceableGroup(-535944529);
                if (shapes == null) {
                    shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z23;
                z24 = z22;
                z25 = z20;
                z26 = z19;
                context3 = context2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
        }
        i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        z18 = z14;
        if ((i11 & 64) != 0) {
            if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
            }
            if (i22 != 1) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        i23 &= -15;
                    } else {
                        context2 = context;
                    }
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z10;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z20 = false;
                        z21 = z16;
                        z22 = z17;
                    } else {
                        z21 = z16;
                        z22 = z17;
                        z20 = z18;
                    }
                } else {
                    if (i22 != 0) {
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        i23 &= -15;
                    } else {
                        context2 = context;
                    }
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z10;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z20 = false;
                        z21 = z16;
                        z22 = z17;
                    } else {
                        z21 = z16;
                        z22 = z17;
                        z20 = z18;
                    }
                }
                z23 = z15;
                i21 = i23;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                }
                theme = context2.getTheme();
                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                if (!f43553b) {
                    Method declaredMethod1111111111115 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                    declaredMethod1111111111115.setAccessible(true);
                    f43554c = declaredMethod1111111111115;
                    f43553b = true;
                }
                method = f43554c;
                theme2 = null;
                if (method != null) {
                    theme2 = method.invoke(theme, new Object[0]);
                }
                if (theme2 == null) {
                    theme2 = context2.getTheme();
                }
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(theme2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ThemeParameters themeParameters1111111111115 = (ThemeParameters) objRememberedValue;
                colors = themeParameters1111111111115.getColors();
                composerStartRestartGroup.startReplaceableGroup(-535944663);
                if (colors == null) {
                    colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                typography = themeParameters1111111111115.getTypography();
                composerStartRestartGroup.startReplaceableGroup(-535944598);
                if (typography == null) {
                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                shapes = themeParameters1111111111115.getShapes();
                composerStartRestartGroup.startReplaceableGroup(-535944529);
                if (shapes == null) {
                    shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z23;
                z24 = z22;
                z25 = z20;
                z26 = z19;
                context3 = context2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        i23 &= -15;
                    } else {
                        context2 = context;
                    }
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z10;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z20 = false;
                        z21 = z16;
                        z22 = z17;
                    } else {
                        z21 = z16;
                        z22 = z17;
                        z20 = z18;
                    }
                } else {
                    if (i22 != 0) {
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        i23 &= -15;
                    } else {
                        context2 = context;
                    }
                    if (i24 != 0) {
                        z19 = true;
                    } else {
                        z19 = z10;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z20 = false;
                        z21 = z16;
                        z22 = z17;
                    } else {
                        z21 = z16;
                        z22 = z17;
                        z20 = z18;
                    }
                }
                z23 = z15;
                i21 = i23;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
                }
                theme = context2.getTheme();
                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                if (!f43553b) {
                    Method declaredMethod1111111111116 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                    declaredMethod1111111111116.setAccessible(true);
                    f43554c = declaredMethod1111111111116;
                    f43553b = true;
                }
                method = f43554c;
                theme2 = null;
                if (method != null) {
                    theme2 = method.invoke(theme, new Object[0]);
                }
                if (theme2 == null) {
                    theme2 = context2.getTheme();
                }
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(theme2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ThemeParameters themeParameters1111111111116 = (ThemeParameters) objRememberedValue;
                colors = themeParameters1111111111116.getColors();
                composerStartRestartGroup.startReplaceableGroup(-535944663);
                if (colors == null) {
                    colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                typography = themeParameters1111111111116.getTypography();
                composerStartRestartGroup.startReplaceableGroup(-535944598);
                if (typography == null) {
                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                shapes = themeParameters1111111111116.getShapes();
                composerStartRestartGroup.startReplaceableGroup(-535944529);
                if (shapes == null) {
                    shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z23;
                z24 = z22;
                z25 = z20;
                z26 = z19;
                context3 = context2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
        }
        i20 = 1572864;
        i23 |= i20;
        if (i22 != 1) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    i23 &= -15;
                } else {
                    context2 = context;
                }
                if (i24 != 0) {
                    z19 = true;
                } else {
                    z19 = z10;
                }
                if (i12 != 0) {
                    z15 = true;
                }
                if (i14 != 0) {
                    z16 = true;
                }
                if (i16 != 0) {
                    z17 = false;
                }
                if (i18 != 0) {
                    z20 = false;
                    z21 = z16;
                    z22 = z17;
                } else {
                    z21 = z16;
                    z22 = z17;
                    z20 = z18;
                }
            } else {
                if (i22 != 0) {
                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    i23 &= -15;
                } else {
                    context2 = context;
                }
                if (i24 != 0) {
                    z19 = true;
                } else {
                    z19 = z10;
                }
                if (i12 != 0) {
                    z15 = true;
                }
                if (i14 != 0) {
                    z16 = true;
                }
                if (i16 != 0) {
                    z17 = false;
                }
                if (i18 != 0) {
                    z20 = false;
                    z21 = z16;
                    z22 = z17;
                } else {
                    z21 = z16;
                    z22 = z17;
                    z20 = z18;
                }
            }
            z23 = z15;
            i21 = i23;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
            }
            theme = context2.getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
            if (!f43553b) {
                Method declaredMethod1111111111117 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                declaredMethod1111111111117.setAccessible(true);
                f43554c = declaredMethod1111111111117;
                f43553b = true;
            }
            method = f43554c;
            theme2 = null;
            if (method != null) {
                theme2 = method.invoke(theme, new Object[0]);
            }
            if (theme2 == null) {
                theme2 = context2.getTheme();
            }
            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(theme2);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ThemeParameters themeParameters1111111111117 = (ThemeParameters) objRememberedValue;
            colors = themeParameters1111111111117.getColors();
            composerStartRestartGroup.startReplaceableGroup(-535944663);
            if (colors == null) {
                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
            }
            composerStartRestartGroup.endReplaceableGroup();
            typography = themeParameters1111111111117.getTypography();
            composerStartRestartGroup.startReplaceableGroup(-535944598);
            if (typography == null) {
                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
            }
            composerStartRestartGroup.endReplaceableGroup();
            shapes = themeParameters1111111111117.getShapes();
            composerStartRestartGroup.startReplaceableGroup(-535944529);
            if (shapes == null) {
                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z15 = z23;
            z24 = z22;
            z25 = z20;
            z26 = z19;
            context3 = context2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    i23 &= -15;
                } else {
                    context2 = context;
                }
                if (i24 != 0) {
                    z19 = true;
                } else {
                    z19 = z10;
                }
                if (i12 != 0) {
                    z15 = true;
                }
                if (i14 != 0) {
                    z16 = true;
                }
                if (i16 != 0) {
                    z17 = false;
                }
                if (i18 != 0) {
                    z20 = false;
                    z21 = z16;
                    z22 = z17;
                } else {
                    z21 = z16;
                    z22 = z17;
                    z20 = z18;
                }
            } else {
                if (i22 != 0) {
                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    i23 &= -15;
                } else {
                    context2 = context;
                }
                if (i24 != 0) {
                    z19 = true;
                } else {
                    z19 = z10;
                }
                if (i12 != 0) {
                    z15 = true;
                }
                if (i14 != 0) {
                    z16 = true;
                }
                if (i16 != 0) {
                    z17 = false;
                }
                if (i18 != 0) {
                    z20 = false;
                    z21 = z16;
                    z22 = z17;
                } else {
                    z21 = z16;
                    z22 = z17;
                    z20 = z18;
                }
            }
            z23 = z15;
            i21 = i23;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1864238106, i21, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:83)");
            }
            theme = context2.getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
            if (!f43553b) {
                Method declaredMethod1111111111118 = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                declaredMethod1111111111118.setAccessible(true);
                f43554c = declaredMethod1111111111118;
                f43553b = true;
            }
            method = f43554c;
            theme2 = null;
            if (method != null) {
                theme2 = method.invoke(theme, new Object[0]);
            }
            if (theme2 == null) {
                theme2 = context2.getTheme();
            }
            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(theme2);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = createMdcTheme$default(context2, layoutDirection, null, z19, z23, z21, z22, z20, 4, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ThemeParameters themeParameters1111111111118 = (ThemeParameters) objRememberedValue;
            colors = themeParameters1111111111118.getColors();
            composerStartRestartGroup.startReplaceableGroup(-535944663);
            if (colors == null) {
                colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
            }
            composerStartRestartGroup.endReplaceableGroup();
            typography = themeParameters1111111111118.getTypography();
            composerStartRestartGroup.startReplaceableGroup(-535944598);
            if (typography == null) {
                typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
            }
            composerStartRestartGroup.endReplaceableGroup();
            shapes = themeParameters1111111111118.getShapes();
            composerStartRestartGroup.startReplaceableGroup(-535944529);
            if (shapes == null) {
                shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MaterialThemeKt.MaterialTheme(colors, typography, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new a(i21, content)), composerStartRestartGroup, 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z15 = z23;
            z24 = z22;
            z25 = z20;
            z26 = z19;
            context3 = context2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(context3, z26, z15, z21, z24, z25, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a7  */
    @NotNull
    public static final ThemeParameters createMdcTheme(@NotNull Context context, @NotNull LayoutDirection layoutDirection, @NotNull Density density, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        Colors colorsM734lightColors2qZNXz8;
        Typography typographyMerge;
        FontFamily fontFamily;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.styleable.ThemeAdapterMaterialTheme);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        if (!typedArrayObtainStyledAttributes.hasValue(R.styleable.ThemeAdapterMaterialTheme_isMaterialTheme)) {
            throw new IllegalArgumentException("createMdcTheme requires the host context's theme to extend Theme.MaterialComponents".toString());
        }
        Shapes shapes = null;
        if (z10) {
            long jM5279parseColormxwnekA$default = ResourceUtilsKt.m5279parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_colorPrimary, 0L, 2, null);
            long jM5279parseColormxwnekA$default2 = ResourceUtilsKt.m5279parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_colorPrimaryVariant, 0L, 2, null);
            long jM5279parseColormxwnekA$default3 = ResourceUtilsKt.m5279parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_colorOnPrimary, 0L, 2, null);
            long jM5279parseColormxwnekA$default4 = ResourceUtilsKt.m5279parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_colorSecondary, 0L, 2, null);
            long jM5279parseColormxwnekA$default5 = ResourceUtilsKt.m5279parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_colorSecondaryVariant, 0L, 2, null);
            long jM5279parseColormxwnekA$default6 = ResourceUtilsKt.m5279parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_colorOnSecondary, 0L, 2, null);
            long jM5279parseColormxwnekA$default7 = ResourceUtilsKt.m5279parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_android_colorBackground, 0L, 2, null);
            long jM5279parseColormxwnekA$default8 = ResourceUtilsKt.m5279parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_colorOnBackground, 0L, 2, null);
            long jM5279parseColormxwnekA$default9 = ResourceUtilsKt.m5279parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_colorSurface, 0L, 2, null);
            long jM5279parseColormxwnekA$default10 = ResourceUtilsKt.m5279parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_colorOnSurface, 0L, 2, null);
            long jM5279parseColormxwnekA$default11 = ResourceUtilsKt.m5279parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_colorError, 0L, 2, null);
            long jM5279parseColormxwnekA$default12 = ResourceUtilsKt.m5279parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_colorOnError, 0L, 2, null);
            colorsM734lightColors2qZNXz8 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ThemeAdapterMaterialTheme_isLightTheme, true) ? ColorsKt.m734lightColors2qZNXz8(jM5279parseColormxwnekA$default, jM5279parseColormxwnekA$default2, jM5279parseColormxwnekA$default4, jM5279parseColormxwnekA$default5, jM5279parseColormxwnekA$default7, jM5279parseColormxwnekA$default9, jM5279parseColormxwnekA$default11, jM5279parseColormxwnekA$default3, jM5279parseColormxwnekA$default6, jM5279parseColormxwnekA$default8, jM5279parseColormxwnekA$default10, jM5279parseColormxwnekA$default12) : ColorsKt.m732darkColors2qZNXz8(jM5279parseColormxwnekA$default, jM5279parseColormxwnekA$default2, jM5279parseColormxwnekA$default4, jM5279parseColormxwnekA$default5, jM5279parseColormxwnekA$default7, jM5279parseColormxwnekA$default9, jM5279parseColormxwnekA$default11, jM5279parseColormxwnekA$default3, jM5279parseColormxwnekA$default6, jM5279parseColormxwnekA$default8, jM5279parseColormxwnekA$default10, jM5279parseColormxwnekA$default12);
        } else {
            colorsM734lightColors2qZNXz8 = null;
        }
        if (z11) {
            if (z14) {
                FontFamilyWithWeight fontFamily2 = ResourceUtilsKt.parseFontFamily(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_fontFamily);
                if (fontFamily2 == null) {
                    fontFamily2 = ResourceUtilsKt.parseFontFamily(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_android_fontFamily);
                }
                if (fontFamily2 != null) {
                    fontFamily = fontFamily2.getFontFamily();
                } else {
                    fontFamily = null;
                }
            } else {
                fontFamily = null;
            }
            typographyMerge = TypographyKt.merge(new Typography(fontFamily == null ? FontFamily.INSTANCE.getDefault() : fontFamily, null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceHeadline1), density, z13, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceHeadline2), density, z13, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceHeadline3), density, z13, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceHeadline4), density, z13, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceHeadline5), density, z13, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceHeadline6), density, z13, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceSubtitle1), density, z13, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceSubtitle2), density, z13, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceBody1), density, z13, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceBody2), density, z13, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceButton), density, z13, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceCaption), density, z13, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceOverline), density, z13, fontFamily));
        } else {
            typographyMerge = null;
        }
        if (z12) {
            int resourceIdOrThrow = TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_shapeAppearanceSmallComponent);
            Shapes shapes2 = f43552a;
            shapes = new Shapes(ResourceUtilsKt.parseShapeAppearance(context, resourceIdOrThrow, layoutDirection, shapes2.getSmall()), ResourceUtilsKt.parseShapeAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_shapeAppearanceMediumComponent), layoutDirection, shapes2.getMedium()), ResourceUtilsKt.parseShapeAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_shapeAppearanceLargeComponent), layoutDirection, shapes2.getLarge()));
        }
        ThemeParameters themeParameters = new ThemeParameters(colorsM734lightColors2qZNXz8, typographyMerge, shapes);
        typedArrayObtainStyledAttributes.recycle();
        return themeParameters;
    }

    public static /* synthetic */ ThemeParameters createMdcTheme$default(Context context, LayoutDirection layoutDirection, Density density, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, Object obj) {
        return createMdcTheme(context, layoutDirection, (i10 & 4) != 0 ? AndroidDensity_androidKt.Density(context) : density, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? true : z11, (i10 & 32) == 0 ? z12 : true, (i10 & 64) != 0 ? false : z13, (i10 & 128) == 0 ? z14 : false);
    }
}
