package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Icon.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u000e\u001a;\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", "imageVector", "", "contentDescription", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "tint", "", "Icon-ww6aTOc", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "Icon", "Landroidx/compose/ui/graphics/ImageBitmap;", "bitmap", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icon.kt\nandroidx/compose/material3/IconKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,169:1\n76#2:170\n76#2:171\n76#2:179\n36#3:172\n36#3:180\n1114#4,6:173\n1114#4,6:181\n*S KotlinDebug\n*F\n+ 1 Icon.kt\nandroidx/compose/material3/IconKt\n*L\n65#1:170\n100#1:171\n136#1:179\n102#1:172\n141#1:180\n102#1:173,6\n141#1:181,6\n*E\n"})
public final class IconKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Modifier f10450a = SizeKt.m335size3ABfNKs(Modifier.INSTANCE, IconButtonTokens.INSTANCE.m1755getIconSizeD9Ej5fM());

    /* JADX INFO: compiled from: Icon.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ImageVector f10451p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f10452q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10453r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f10454s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f10455t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f10456u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ImageVector imageVector, String str, Modifier modifier, long j10, int i10, int i11) {
            super(2);
            this.f10451p0 = imageVector;
            this.f10452q0 = str;
            this.f10453r0 = modifier;
            this.f10454s0 = j10;
            this.f10455t0 = i10;
            this.f10456u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            IconKt.m1140Iconww6aTOc(this.f10451p0, this.f10452q0, this.f10453r0, this.f10454s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10455t0 | 1), this.f10456u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Icon.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ImageBitmap f10457p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f10458q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10459r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f10460s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f10461t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f10462u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ImageBitmap imageBitmap, String str, Modifier modifier, long j10, int i10, int i11) {
            super(2);
            this.f10457p0 = imageBitmap;
            this.f10458q0 = str;
            this.f10459r0 = modifier;
            this.f10460s0 = j10;
            this.f10461t0 = i10;
            this.f10462u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            IconKt.m1138Iconww6aTOc(this.f10457p0, this.f10458q0, this.f10459r0, this.f10460s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10461t0 | 1), this.f10462u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Icon.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Painter f10463p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f10464q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10465r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f10466s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f10467t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f10468u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Painter painter, String str, Modifier modifier, long j10, int i10, int i11) {
            super(2);
            this.f10463p0 = painter;
            this.f10464q0 = str;
            this.f10465r0 = modifier;
            this.f10466s0 = j10;
            this.f10467t0 = i10;
            this.f10468u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            IconKt.m1139Iconww6aTOc(this.f10463p0, this.f10464q0, this.f10465r0, this.f10466s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10467t0 | 1), this.f10468u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Icon.kt */
    public static final class d extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f10469p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(1);
            this.f10469p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setContentDescription(semantics, this.f10469p0);
            SemanticsPropertiesKt.m3843setRolekuIjeqM(semantics, Role.INSTANCE.m3834getImageo7Vup1c());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5 A[PHI: r3 r5
      0x00a5: PHI (r3v18 int) = (r3v13 int), (r3v19 int) binds: [B:66:0x00af, B:60:0x00a4] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r5v9 androidx.compose.ui.Modifier) = (r5v6 androidx.compose.ui.Modifier), (r5v11 androidx.compose.ui.Modifier) binds: [B:66:0x00af, B:60:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m1140Iconww6aTOc(@NotNull ImageVector imageVector, @Nullable String str, @Nullable Modifier modifier, long j10, @Nullable Composer composer, int i10, int i11) {
        int i12;
        int i13;
        Modifier modifier2;
        int i14;
        long j11;
        Modifier modifier3;
        long jM2518unboximpl;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(imageVector, "imageVector");
        Composer composerStartRestartGroup = composer.startRestartGroup(-126890956);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(imageVector) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) == 0) {
            if ((i10 & 112) == 0) {
                i12 |= composerStartRestartGroup.changed(str) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 7168) == 0) {
                    if ((i11 & 8) == 0) {
                        j11 = j10;
                        int i15 = composerStartRestartGroup.changed(j11) ? 2048 : 1024;
                        i12 |= i15;
                    } else {
                        j11 = j10;
                    }
                    i12 |= i15;
                } else {
                    j11 = j10;
                }
                if ((i12 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-126890956, i12, -1, "androidx.compose.material3.Icon (Icon.kt:60)");
                        }
                        m1139Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i12 & 14), str, modifier3, jM2518unboximpl, composerStartRestartGroup, VectorPainter.$stable | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        j11 = jM2518unboximpl;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        modifier3 = modifier2;
                    }
                    jM2518unboximpl = j11;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-126890956, i12, -1, "androidx.compose.material3.Icon (Icon.kt:60)");
                    }
                    m1139Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i12 & 14), str, modifier3, jM2518unboximpl, composerStartRestartGroup, VectorPainter.$stable | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    j11 = jM2518unboximpl;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(imageVector, str, modifier4, j11, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            modifier2 = modifier;
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    j11 = j10;
                    if (composerStartRestartGroup.changed(j11)) {
                    }
                    i12 |= i15;
                } else {
                    j11 = j10;
                }
                i12 |= i15;
            } else {
                j11 = j10;
            }
            if ((i12 & 5851) == 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    } else {
                        jM2518unboximpl = j11;
                    }
                } else {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    } else {
                        jM2518unboximpl = j11;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-126890956, i12, -1, "androidx.compose.material3.Icon (Icon.kt:60)");
                }
                m1139Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i12 & 14), str, modifier3, jM2518unboximpl, composerStartRestartGroup, VectorPainter.$stable | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j11 = jM2518unboximpl;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    } else {
                        jM2518unboximpl = j11;
                    }
                } else {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    } else {
                        jM2518unboximpl = j11;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-126890956, i12, -1, "androidx.compose.material3.Icon (Icon.kt:60)");
                }
                m1139Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i12 & 14), str, modifier3, jM2518unboximpl, composerStartRestartGroup, VectorPainter.$stable | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j11 = jM2518unboximpl;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(imageVector, str, modifier4, j11, i10, i11));
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    j11 = j10;
                    if (composerStartRestartGroup.changed(j11)) {
                    }
                    i12 |= i15;
                } else {
                    j11 = j10;
                }
                i12 |= i15;
            } else {
                j11 = j10;
            }
            if ((i12 & 5851) == 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    } else {
                        jM2518unboximpl = j11;
                    }
                } else {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    } else {
                        jM2518unboximpl = j11;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-126890956, i12, -1, "androidx.compose.material3.Icon (Icon.kt:60)");
                }
                m1139Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i12 & 14), str, modifier3, jM2518unboximpl, composerStartRestartGroup, VectorPainter.$stable | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j11 = jM2518unboximpl;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    } else {
                        jM2518unboximpl = j11;
                    }
                } else {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    } else {
                        jM2518unboximpl = j11;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-126890956, i12, -1, "androidx.compose.material3.Icon (Icon.kt:60)");
                }
                m1139Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i12 & 14), str, modifier3, jM2518unboximpl, composerStartRestartGroup, VectorPainter.$stable | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j11 = jM2518unboximpl;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(imageVector, str, modifier4, j11, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                j11 = j10;
                if (composerStartRestartGroup.changed(j11)) {
                }
                i12 |= i15;
            } else {
                j11 = j10;
            }
            i12 |= i15;
        } else {
            j11 = j10;
        }
        if ((i12 & 5851) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                } else {
                    jM2518unboximpl = j11;
                }
            } else {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                } else {
                    jM2518unboximpl = j11;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-126890956, i12, -1, "androidx.compose.material3.Icon (Icon.kt:60)");
            }
            m1139Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i12 & 14), str, modifier3, jM2518unboximpl, composerStartRestartGroup, VectorPainter.$stable | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            j11 = jM2518unboximpl;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                } else {
                    jM2518unboximpl = j11;
                }
            } else {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                } else {
                    jM2518unboximpl = j11;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-126890956, i12, -1, "androidx.compose.material3.Icon (Icon.kt:60)");
            }
            m1139Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, composerStartRestartGroup, i12 & 14), str, modifier3, jM2518unboximpl, composerStartRestartGroup, VectorPainter.$stable | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            j11 = jM2518unboximpl;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(imageVector, str, modifier4, j11, i10, i11));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m1138Iconww6aTOc(@NotNull ImageBitmap bitmap, @Nullable String str, @Nullable Modifier modifier, long j10, @Nullable Composer composer, int i10, int i11) {
        long jM2518unboximpl;
        int i12;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1092052280);
        Modifier modifier2 = (i11 & 4) != 0 ? Modifier.INSTANCE : modifier;
        if ((i11 & 8) != 0) {
            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
            i12 = i10 & (-7169);
        } else {
            jM2518unboximpl = j10;
            i12 = i10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1092052280, i12, -1, "androidx.compose.material3.Icon (Icon.kt:95)");
        }
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(bitmap);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            BitmapPainter bitmapPainter = new BitmapPainter(bitmap, 0L, 0L, 6, null);
            composerStartRestartGroup.updateRememberedValue(bitmapPainter);
            objRememberedValue = bitmapPainter;
        }
        composerStartRestartGroup.endReplaceableGroup();
        m1139Iconww6aTOc((BitmapPainter) objRememberedValue, str, modifier2, jM2518unboximpl, composerStartRestartGroup, (i12 & 112) | 8 | (i12 & 896) | (i12 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(bitmap, str, modifier2, jM2518unboximpl, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d0  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m1139Iconww6aTOc(@NotNull Painter painter, @Nullable String str, @Nullable Modifier modifier, long j10, @Nullable Composer composer, int i10, int i11) {
        long jM2518unboximpl;
        int i12;
        Modifier modifierSemantics$default;
        Modifier modifier2;
        Intrinsics.checkNotNullParameter(painter, "painter");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2142239481);
        Modifier modifier3 = (i11 & 4) != 0 ? Modifier.INSTANCE : modifier;
        if ((i11 & 8) != 0) {
            i12 = i10 & (-7169);
            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
        } else {
            jM2518unboximpl = j10;
            i12 = i10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2142239481, i12, -1, "androidx.compose.material3.Icon (Icon.kt:131)");
        }
        ColorFilter colorFilterM2549tintxETnrds$default = Color.m2509equalsimpl0(jM2518unboximpl, Color.INSTANCE.m2544getUnspecified0d7_KjU()) ? null : ColorFilter.Companion.m2549tintxETnrds$default(ColorFilter.INSTANCE, jM2518unboximpl, 0, 2, null);
        composerStartRestartGroup.startReplaceableGroup(69356817);
        if (str != null) {
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(str);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new d(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null);
        } else {
            modifierSemantics$default = Modifier.INSTANCE;
        }
        Modifier modifier4 = modifierSemantics$default;
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifier5 = GraphicsLayerModifierKt.toolingGraphicsLayer(modifier3);
        if (!Size.m2340equalsimpl0(painter.getIntrinsicSize(), Size.INSTANCE.m2352getUnspecifiedNHjbRc())) {
            long intrinsicSize = painter.getIntrinsicSize();
            if (!Float.isInfinite(Size.m2344getWidthimpl(intrinsicSize)) || !Float.isInfinite(Size.m2341getHeightimpl(intrinsicSize))) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = f10450a;
            }
        } else {
            modifier2 = f10450a;
        }
        long j11 = jM2518unboximpl;
        BoxKt.Box(PainterModifierKt.paint$default(modifier5.then(modifier2), painter, false, null, ContentScale.INSTANCE.getFit(), 0.0f, colorFilterM2549tintxETnrds$default, 22, null).then(modifier4), composerStartRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(painter, str, modifier3, j11, i10, i11));
    }
}
