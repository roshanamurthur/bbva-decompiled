package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TextUnit.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0014\u001a#\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\f\u001a\u00020\u0004*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0086\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\"\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u0006\u001a\"\u0010\u000f\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\r\u001a\u00020\u0004H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u0011\u001a\"\u0010\u000f\u001a\u00020\u0004*\u00020\u00122\u0006\u0010\r\u001a\u00020\u0004H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u0013\u001a\"\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0000H\u0001ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001d\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001a-\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a-\u0010)\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(\"\"\u0010.\u001a\u00020**\u00020\u00048Æ\u0002X\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b-\u0010\u001c\u001a\u0004\b+\u0010,\"!\u00101\u001a\u00020**\u00020\u00048FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b0\u0010\u001c\u001a\u0004\b/\u0010,\"!\u00106\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103\"!\u00109\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b8\u00105\u001a\u0004\b7\u00103\"!\u00106\u001a\u00020\u0004*\u00020\u00108FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b4\u0010;\u001a\u0004\b2\u0010:\"!\u00109\u001a\u00020\u0004*\u00020\u00108FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b8\u0010;\u001a\u0004\b7\u0010:\"!\u00106\u001a\u00020\u0004*\u00020\u00128FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b4\u0010=\u001a\u0004\b2\u0010<\"!\u00109\u001a\u00020\u0004*\u00020\u00128FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b8\u0010=\u001a\u0004\b7\u0010<\u0082\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006>"}, d2 = {"", "value", "Landroidx/compose/ui/unit/TextUnitType;", "type", "Landroidx/compose/ui/unit/TextUnit;", "TextUnit-anM5pPY", "(FJ)J", "TextUnit", "Lkotlin/Function0;", "block", "takeOrElse-eAf_CNQ", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse", "other", "times-mpE4wyQ", "times", "", "(DJ)J", "", "(IJ)J", "", "unitType", SharedPrefsStorage.VERSION_KEY, "pack", "(JF)J", "a", "", "checkArithmetic--R2X_6o", "(J)V", "checkArithmetic", "b", "checkArithmetic-NB67dxo", "(JJ)V", "c", "checkArithmetic-vU-0ePk", "(JJJ)V", EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "fraction", "lerp-C3pnCVY", "(JJF)J", "lerp", "", "isSpecified--R2X_6o", "(J)Z", "isSpecified--R2X_6o$annotations", "isSpecified", "isUnspecified--R2X_6o", "isUnspecified--R2X_6o$annotations", "isUnspecified", "getSp", "(F)J", "getSp$annotations", "(F)V", "sp", "getEm", "getEm$annotations", "em", "(D)J", "(D)V", "(I)J", "(I)V", "ui-unit_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,388:1\n250#1:389\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n264#1:389\n*E\n"})
public final class TextUnitKt {
    /* JADX INFO: renamed from: TextUnit-anM5pPY, reason: not valid java name */
    public static final long m4582TextUnitanM5pPY(float f6, long j10) {
        return pack(j10, f6);
    }

    @PublishedApi
    /* JADX INFO: renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m4583checkArithmeticR2X_6o(long j10) {
        if (!(!m4588isUnspecifiedR2X_6o(j10))) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
    }

    @PublishedApi
    /* JADX INFO: renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    public static final void m4584checkArithmeticNB67dxo(long j10, long j11) {
        if (m4588isUnspecifiedR2X_6o(j10) || m4588isUnspecifiedR2X_6o(j11)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
        if (TextUnitType.m4598equalsimpl0(TextUnit.m4569getTypeUIouoOA(j10), TextUnit.m4569getTypeUIouoOA(j11))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) TextUnitType.m4600toStringimpl(TextUnit.m4569getTypeUIouoOA(j10))) + " and " + ((Object) TextUnitType.m4600toStringimpl(TextUnit.m4569getTypeUIouoOA(j11)))).toString());
    }

    @PublishedApi
    /* JADX INFO: renamed from: checkArithmetic-vU-0ePk, reason: not valid java name */
    public static final void m4585checkArithmeticvU0ePk(long j10, long j11, long j12) {
        if (m4588isUnspecifiedR2X_6o(j10) || m4588isUnspecifiedR2X_6o(j11) || m4588isUnspecifiedR2X_6o(j12)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
        if (TextUnitType.m4598equalsimpl0(TextUnit.m4569getTypeUIouoOA(j10), TextUnit.m4569getTypeUIouoOA(j11)) && TextUnitType.m4598equalsimpl0(TextUnit.m4569getTypeUIouoOA(j11), TextUnit.m4569getTypeUIouoOA(j12))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) TextUnitType.m4600toStringimpl(TextUnit.m4569getTypeUIouoOA(j10))) + " and " + ((Object) TextUnitType.m4600toStringimpl(TextUnit.m4569getTypeUIouoOA(j11)))).toString());
    }

    public static final long getEm(float f6) {
        return pack(SvgConstantsKt.SPECIFIED_VIEWPORT_FILL, f6);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(double d2) {
    }

    public static final long getSp(float f6) {
        return pack(SvgConstantsKt.SPECIFIED_SOLID_OPACITY, f6);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(double d2) {
    }

    /* JADX INFO: renamed from: isSpecified--R2X_6o, reason: not valid java name */
    public static final boolean m4586isSpecifiedR2X_6o(long j10) {
        return !m4588isUnspecifiedR2X_6o(j10);
    }

    /* JADX INFO: renamed from: isUnspecified--R2X_6o, reason: not valid java name */
    public static final boolean m4588isUnspecifiedR2X_6o(long j10) {
        return TextUnit.m4568getRawTypeimpl(j10) == 0;
    }

    @Stable
    /* JADX INFO: renamed from: lerp-C3pnCVY, reason: not valid java name */
    public static final long m4590lerpC3pnCVY(long j10, long j11, float f6) {
        m4584checkArithmeticNB67dxo(j10, j11);
        return pack(TextUnit.m4568getRawTypeimpl(j10), MathHelpersKt.lerp(TextUnit.m4570getValueimpl(j10), TextUnit.m4570getValueimpl(j11), f6));
    }

    @PublishedApi
    public static final long pack(long j10, float f6) {
        return TextUnit.m4562constructorimpl(j10 | (((long) Float.floatToIntBits(f6)) & 4294967295L));
    }

    /* JADX INFO: renamed from: takeOrElse-eAf_CNQ, reason: not valid java name */
    public static final long m4591takeOrElseeAf_CNQ(long j10, @NotNull Function0<TextUnit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return m4588isUnspecifiedR2X_6o(j10) ^ true ? j10 : block.invoke().getF18322a();
    }

    @Stable
    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m4593timesmpE4wyQ(float f6, long j10) {
        m4583checkArithmeticR2X_6o(j10);
        return pack(TextUnit.m4568getRawTypeimpl(j10), TextUnit.m4570getValueimpl(j10) * f6);
    }

    public static final long getEm(double d2) {
        return pack(SvgConstantsKt.SPECIFIED_VIEWPORT_FILL, (float) d2);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(float f6) {
    }

    public static final long getSp(double d2) {
        return pack(SvgConstantsKt.SPECIFIED_SOLID_OPACITY, (float) d2);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(float f6) {
    }

    public static final long getEm(int i10) {
        return pack(SvgConstantsKt.SPECIFIED_VIEWPORT_FILL, i10);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(int i10) {
    }

    public static final long getSp(int i10) {
        return pack(SvgConstantsKt.SPECIFIED_SOLID_OPACITY, i10);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(int i10) {
    }

    @Stable
    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m4592timesmpE4wyQ(double d2, long j10) {
        m4583checkArithmeticR2X_6o(j10);
        return pack(TextUnit.m4568getRawTypeimpl(j10), TextUnit.m4570getValueimpl(j10) * ((float) d2));
    }

    @Stable
    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m4594timesmpE4wyQ(int i10, long j10) {
        m4583checkArithmeticR2X_6o(j10);
        return pack(TextUnit.m4568getRawTypeimpl(j10), TextUnit.m4570getValueimpl(j10) * i10);
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m4587isSpecifiedR2X_6o$annotations(long j10) {
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m4589isUnspecifiedR2X_6o$annotations(long j10) {
    }
}
