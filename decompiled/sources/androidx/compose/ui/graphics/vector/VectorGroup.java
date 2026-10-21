package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.motion.widget.Key;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.measurement.internal.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mypinpad.tsdk.isolation.z1;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ImageVector.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002By\b\u0000\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0013\u0012\b\b\u0002\u0010!\u001a\u00020\u0013\u0012\b\b\u0002\u0010$\u001a\u00020\u0013\u0012\b\b\u0002\u0010'\u001a\u00020\u0013\u0012\b\b\u0002\u0010*\u001a\u00020\u0013\u0012\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u00020,0+\u0012\u000e\b\u0002\u00105\u001a\b\u0012\u0004\u0012\u00020\u00010+¢\u0006\u0004\b6\u00107J\u0011\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0096\u0002J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010!\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017R\u0017\u0010$\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010\u0017R\u0017\u0010'\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b%\u0010\u0015\u001a\u0004\b&\u0010\u0017R\u0017\u0010*\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b(\u0010\u0015\u001a\u0004\b)\u0010\u0017R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020,0+8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0011\u00104\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00068"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorGroup;", "Landroidx/compose/ui/graphics/vector/VectorNode;", "", "", FirebaseAnalytics.Param.INDEX, "get", "", "iterator", "", "other", "", "equals", GenerateActivationFormCommand.HASH_CODE, "", "p0", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "q0", "F", "getRotation", "()F", Key.ROTATION, "r0", "getPivotX", "pivotX", "s0", "getPivotY", "pivotY", "t0", "getScaleX", "scaleX", "u0", "getScaleY", "scaleY", "v0", "getTranslationX", "translationX", "w0", "getTranslationY", "translationY", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "x0", "Ljava/util/List;", "getClipPathData", "()Ljava/util/List;", "clipPathData", "getSize", "()I", "size", "children", "<init>", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class VectorGroup extends VectorNode implements Iterable<VectorNode>, KMappedMarker {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public final float rotation;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public final float pivotX;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public final float pivotY;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    public final float scaleX;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    public final float scaleY;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public final float translationX;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    public final float translationY;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<PathNode> clipPathData;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final List<VectorNode> f16095y0;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.VectorGroup$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: ImageVector.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"androidx/compose/ui/graphics/vector/VectorGroup$iterator$1", "", "Landroidx/compose/ui/graphics/vector/VectorNode;", "", "hasNext", "next", "p0", "Ljava/util/Iterator;", "getIt", "()Ljava/util/Iterator;", "it", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class AnonymousClass1 implements Iterator<VectorNode>, KMappedMarker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Iterator<VectorNode> it;

        public AnonymousClass1(VectorGroup vectorGroup) {
            this.it = vectorGroup.f16095y0.iterator();
        }

        @NotNull
        public final Iterator<VectorNode> getIt() {
            return this.it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.it.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        @NotNull
        public VectorNode next() {
            return this.it.next();
        }
    }

    public VectorGroup() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof VectorGroup)) {
            VectorGroup vectorGroup = (VectorGroup) other;
            return Intrinsics.areEqual(this.name, vectorGroup.name) && this.rotation == vectorGroup.rotation && this.pivotX == vectorGroup.pivotX && this.pivotY == vectorGroup.pivotY && this.scaleX == vectorGroup.scaleX && this.scaleY == vectorGroup.scaleY && this.translationX == vectorGroup.translationX && this.translationY == vectorGroup.translationY && Intrinsics.areEqual(this.clipPathData, vectorGroup.clipPathData) && Intrinsics.areEqual(this.f16095y0, vectorGroup.f16095y0);
        }
        return false;
    }

    @NotNull
    public final VectorNode get(int index) {
        return this.f16095y0.get(index);
    }

    @NotNull
    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final int getSize() {
        return this.f16095y0.size();
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public int hashCode() {
        return this.f16095y0.hashCode() + a.a(this.clipPathData, z1.a(this.translationY, z1.a(this.translationX, z1.a(this.scaleY, z1.a(this.scaleX, z1.a(this.pivotY, z1.a(this.pivotX, z1.a(this.rotation, this.name.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<VectorNode> iterator() {
        return new AnonymousClass1(this);
    }

    public /* synthetic */ VectorGroup(String str, float f6, float f10, float f11, float f12, float f13, float f14, float f15, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0.0f : f6, (i10 & 4) != 0 ? 0.0f : f10, (i10 & 8) != 0 ? 0.0f : f11, (i10 & 16) != 0 ? 1.0f : f12, (i10 & 32) == 0 ? f13 : 1.0f, (i10 & 64) != 0 ? 0.0f : f14, (i10 & 128) == 0 ? f15 : 0.0f, (i10 & 256) != 0 ? VectorKt.getEmptyPath() : list, (i10 & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VectorGroup(@NotNull String name, float f6, float f10, float f11, float f12, float f13, float f14, float f15, @NotNull List<? extends PathNode> clipPathData, @NotNull List<? extends VectorNode> children) {
        super(null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(clipPathData, "clipPathData");
        Intrinsics.checkNotNullParameter(children, "children");
        this.name = name;
        this.rotation = f6;
        this.pivotX = f10;
        this.pivotY = f11;
        this.scaleX = f12;
        this.scaleY = f13;
        this.translationX = f14;
        this.translationY = f15;
        this.clipPathData = clipPathData;
        this.f16095y0 = children;
    }
}
