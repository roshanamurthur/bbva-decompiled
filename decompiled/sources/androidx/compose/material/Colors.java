package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Colors.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b0\b\u0007\u0018\u00002\u00020\u0001Br\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0001¢\u0006\u0004\bB\u0010CJ\u0095\u0001\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0014H\u0016R4\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR4\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR4\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR4\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR4\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR4\u0010\b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b)\u0010\u0018\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR4\u0010\t\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b,\u0010\u0018\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR4\u0010\n\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b/\u0010\u0018\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001cR4\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b2\u0010\u0018\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010\u001cR4\u0010\f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b5\u0010\u0018\u001a\u0004\b6\u0010\u001a\"\u0004\b7\u0010\u001cR4\u0010\r\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b8\u0010\u0018\u001a\u0004\b9\u0010\u001a\"\u0004\b:\u0010\u001cR4\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b;\u0010\u0018\u001a\u0004\b<\u0010\u001a\"\u0004\b=\u0010\u001cR+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010\u0018\u001a\u0004\b\u0010\u0010?\"\u0004\b@\u0010A\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006D"}, d2 = {"Landroidx/compose/material/Colors;", "", "Landroidx/compose/ui/graphics/Color;", "primary", "primaryVariant", "secondary", "secondaryVariant", "background", "surface", "error", "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "", "isLight", "copy-pvPzIIM", "(JJJJJJJJJJJJZ)Landroidx/compose/material/Colors;", "copy", "", "toString", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "getPrimary-0d7_KjU", "()J", "setPrimary-8_81llA$material_release", "(J)V", "b", "getPrimaryVariant-0d7_KjU", "setPrimaryVariant-8_81llA$material_release", "c", "getSecondary-0d7_KjU", "setSecondary-8_81llA$material_release", "d", "getSecondaryVariant-0d7_KjU", "setSecondaryVariant-8_81llA$material_release", "e", "getBackground-0d7_KjU", "setBackground-8_81llA$material_release", "f", "getSurface-0d7_KjU", "setSurface-8_81llA$material_release", "g", "getError-0d7_KjU", "setError-8_81llA$material_release", "h", "getOnPrimary-0d7_KjU", "setOnPrimary-8_81llA$material_release", "i", "getOnSecondary-0d7_KjU", "setOnSecondary-8_81llA$material_release", "j", "getOnBackground-0d7_KjU", "setOnBackground-8_81llA$material_release", "k", "getOnSurface-0d7_KjU", "setOnSurface-8_81llA$material_release", "l", "getOnError-0d7_KjU", "setOnError-8_81llA$material_release", "m", "()Z", "setLight$material_release", "(Z)V", "<init>", "(JJJJJJJJJJJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Colors.kt\nandroidx/compose/material/Colors\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,337:1\n81#2:338\n107#2,2:339\n81#2:341\n107#2,2:342\n81#2:344\n107#2,2:345\n81#2:347\n107#2,2:348\n81#2:350\n107#2,2:351\n81#2:353\n107#2,2:354\n81#2:356\n107#2,2:357\n81#2:359\n107#2,2:360\n81#2:362\n107#2,2:363\n81#2:365\n107#2,2:366\n81#2:368\n107#2,2:369\n81#2:371\n107#2,2:372\n81#2:374\n107#2,2:375\n*S KotlinDebug\n*F\n+ 1 Colors.kt\nandroidx/compose/material/Colors\n*L\n82#1:338\n82#1:339,2\n84#1:341\n84#1:342,2\n86#1:344\n86#1:345,2\n88#1:347\n88#1:348,2\n90#1:350\n90#1:351,2\n92#1:353\n92#1:354,2\n94#1:356\n94#1:357,2\n96#1:359\n96#1:360,2\n98#1:362\n98#1:363,2\n100#1:365\n100#1:366,2\n102#1:368\n102#1:369,2\n104#1:371\n104#1:372,2\n106#1:374\n106#1:375,2\n*E\n"})
public final class Colors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState primary;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState primaryVariant;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState secondary;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState secondaryVariant;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState background;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState surface;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState error;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState onPrimary;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState onSecondary;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState onBackground;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState onSurface;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState onError;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final MutableState isLight;

    public Colors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this.primary = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j10), SnapshotStateKt.structuralEqualityPolicy());
        this.primaryVariant = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j11), SnapshotStateKt.structuralEqualityPolicy());
        this.secondary = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j12), SnapshotStateKt.structuralEqualityPolicy());
        this.secondaryVariant = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j13), SnapshotStateKt.structuralEqualityPolicy());
        this.background = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j14), SnapshotStateKt.structuralEqualityPolicy());
        this.surface = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j15), SnapshotStateKt.structuralEqualityPolicy());
        this.error = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j16), SnapshotStateKt.structuralEqualityPolicy());
        this.onPrimary = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j17), SnapshotStateKt.structuralEqualityPolicy());
        this.onSecondary = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j18), SnapshotStateKt.structuralEqualityPolicy());
        this.onBackground = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j19), SnapshotStateKt.structuralEqualityPolicy());
        this.onSurface = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j20), SnapshotStateKt.structuralEqualityPolicy());
        this.onError = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j21), SnapshotStateKt.structuralEqualityPolicy());
        this.isLight = SnapshotStateKt.mutableStateOf(Boolean.valueOf(z10), SnapshotStateKt.structuralEqualityPolicy());
    }

    @NotNull
    /* JADX INFO: renamed from: copy-pvPzIIM, reason: not valid java name */
    public final Colors m705copypvPzIIM(long primary, long primaryVariant, long secondary, long secondaryVariant, long background, long surface, long error, long onPrimary, long onSecondary, long onBackground, long onSurface, long onError, boolean isLight) {
        return new Colors(primary, primaryVariant, secondary, secondaryVariant, background, surface, error, onPrimary, onSecondary, onBackground, onSurface, onError, isLight, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m706getBackground0d7_KjU() {
        return ((Color) this.background.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getError-0d7_KjU, reason: not valid java name */
    public final long m707getError0d7_KjU() {
        return ((Color) this.error.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOnBackground-0d7_KjU, reason: not valid java name */
    public final long m708getOnBackground0d7_KjU() {
        return ((Color) this.onBackground.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOnError-0d7_KjU, reason: not valid java name */
    public final long m709getOnError0d7_KjU() {
        return ((Color) this.onError.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOnPrimary-0d7_KjU, reason: not valid java name */
    public final long m710getOnPrimary0d7_KjU() {
        return ((Color) this.onPrimary.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOnSecondary-0d7_KjU, reason: not valid java name */
    public final long m711getOnSecondary0d7_KjU() {
        return ((Color) this.onSecondary.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOnSurface-0d7_KjU, reason: not valid java name */
    public final long m712getOnSurface0d7_KjU() {
        return ((Color) this.onSurface.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getPrimary-0d7_KjU, reason: not valid java name */
    public final long m713getPrimary0d7_KjU() {
        return ((Color) this.primary.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getPrimaryVariant-0d7_KjU, reason: not valid java name */
    public final long m714getPrimaryVariant0d7_KjU() {
        return ((Color) this.primaryVariant.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getSecondary-0d7_KjU, reason: not valid java name */
    public final long m715getSecondary0d7_KjU() {
        return ((Color) this.secondary.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getSecondaryVariant-0d7_KjU, reason: not valid java name */
    public final long m716getSecondaryVariant0d7_KjU() {
        return ((Color) this.secondaryVariant.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getSurface-0d7_KjU, reason: not valid java name */
    public final long m717getSurface0d7_KjU() {
        return ((Color) this.surface.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isLight() {
        return ((Boolean) this.isLight.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: setBackground-8_81llA$material_release, reason: not valid java name */
    public final void m718setBackground8_81llA$material_release(long j10) {
        this.background.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setError-8_81llA$material_release, reason: not valid java name */
    public final void m719setError8_81llA$material_release(long j10) {
        this.error.setValue(Color.m2498boximpl(j10));
    }

    public final void setLight$material_release(boolean z10) {
        this.isLight.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: setOnBackground-8_81llA$material_release, reason: not valid java name */
    public final void m720setOnBackground8_81llA$material_release(long j10) {
        this.onBackground.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setOnError-8_81llA$material_release, reason: not valid java name */
    public final void m721setOnError8_81llA$material_release(long j10) {
        this.onError.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setOnPrimary-8_81llA$material_release, reason: not valid java name */
    public final void m722setOnPrimary8_81llA$material_release(long j10) {
        this.onPrimary.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setOnSecondary-8_81llA$material_release, reason: not valid java name */
    public final void m723setOnSecondary8_81llA$material_release(long j10) {
        this.onSecondary.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setOnSurface-8_81llA$material_release, reason: not valid java name */
    public final void m724setOnSurface8_81llA$material_release(long j10) {
        this.onSurface.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setPrimary-8_81llA$material_release, reason: not valid java name */
    public final void m725setPrimary8_81llA$material_release(long j10) {
        this.primary.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setPrimaryVariant-8_81llA$material_release, reason: not valid java name */
    public final void m726setPrimaryVariant8_81llA$material_release(long j10) {
        this.primaryVariant.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setSecondary-8_81llA$material_release, reason: not valid java name */
    public final void m727setSecondary8_81llA$material_release(long j10) {
        this.secondary.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setSecondaryVariant-8_81llA$material_release, reason: not valid java name */
    public final void m728setSecondaryVariant8_81llA$material_release(long j10) {
        this.secondaryVariant.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setSurface-8_81llA$material_release, reason: not valid java name */
    public final void m729setSurface8_81llA$material_release(long j10) {
        this.surface.setValue(Color.m2498boximpl(j10));
    }

    @NotNull
    public String toString() {
        return "Colors(primary=" + ((Object) Color.m2516toStringimpl(m713getPrimary0d7_KjU())) + ", primaryVariant=" + ((Object) Color.m2516toStringimpl(m714getPrimaryVariant0d7_KjU())) + ", secondary=" + ((Object) Color.m2516toStringimpl(m715getSecondary0d7_KjU())) + ", secondaryVariant=" + ((Object) Color.m2516toStringimpl(m716getSecondaryVariant0d7_KjU())) + ", background=" + ((Object) Color.m2516toStringimpl(m706getBackground0d7_KjU())) + ", surface=" + ((Object) Color.m2516toStringimpl(m717getSurface0d7_KjU())) + ", error=" + ((Object) Color.m2516toStringimpl(m707getError0d7_KjU())) + ", onPrimary=" + ((Object) Color.m2516toStringimpl(m710getOnPrimary0d7_KjU())) + ", onSecondary=" + ((Object) Color.m2516toStringimpl(m711getOnSecondary0d7_KjU())) + ", onBackground=" + ((Object) Color.m2516toStringimpl(m708getOnBackground0d7_KjU())) + ", onSurface=" + ((Object) Color.m2516toStringimpl(m712getOnSurface0d7_KjU())) + ", onError=" + ((Object) Color.m2516toStringimpl(m709getOnError0d7_KjU())) + ", isLight=" + isLight() + RootService.CLOSE_BRACKET;
    }
}
