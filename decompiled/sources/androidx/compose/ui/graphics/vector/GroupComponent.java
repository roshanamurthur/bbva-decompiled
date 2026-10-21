package androidx.compose.ui.graphics.vector;

import a1.c;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.widget.Key;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Vector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b%\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bL\u0010MJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001J\u001e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\f\u0010\r\u001a\u00020\u0005*\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R6\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R:\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001a2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001a8\u0010@PX\u0090\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010(\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u00100\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020)8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00104\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020)8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R*\u00108\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020)8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010+\u001a\u0004\b6\u0010-\"\u0004\b7\u0010/R*\u0010<\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020)8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010+\u001a\u0004\b:\u0010-\"\u0004\b;\u0010/R*\u0010@\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020)8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010+\u001a\u0004\b>\u0010-\"\u0004\b?\u0010/R*\u0010D\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020)8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010+\u001a\u0004\bB\u0010-\"\u0004\bC\u0010/R*\u0010H\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020)8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010+\u001a\u0004\bF\u0010-\"\u0004\bG\u0010/R\u0011\u0010K\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006N"}, d2 = {"Landroidx/compose/ui/graphics/vector/GroupComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "", FirebaseAnalytics.Param.INDEX, "instance", "", "insertAt", "from", TypedValues.TransitionType.S_TO, "count", "move", RemoveCommand.ID, "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "draw", "", "toString", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "value", "d", "Ljava/util/List;", "getClipPathData", "()Ljava/util/List;", "setClipPathData", "(Ljava/util/List;)V", "clipPathData", "Lkotlin/Function0;", "g", "Lkotlin/jvm/functions/Function0;", "getInvalidateListener$ui_release", "()Lkotlin/jvm/functions/Function0;", "setInvalidateListener$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "invalidateListener", "h", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "", "i", "F", "getRotation", "()F", "setRotation", "(F)V", Key.ROTATION, "j", "getPivotX", "setPivotX", "pivotX", "k", "getPivotY", "setPivotY", "pivotY", "l", "getScaleX", "setScaleX", "scaleX", "m", "getScaleY", "setScaleY", "scaleY", "n", "getTranslationX", "setTranslationX", "translationX", "o", "getTranslationY", "setTranslationY", "translationY", "getNumChildren", "()I", "numChildren", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,536:1\n33#2,6:537\n33#2,6:552\n33#2,6:561\n261#3,7:543\n268#3:551\n269#3,3:558\n1#4:550\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n*L\n364#1:537,6\n520#1:552,6\n530#1:561,6\n513#1:543,7\n513#1:551\n513#1:558,3\n*E\n"})
public final class GroupComponent extends VNode {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public float[] f15900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ArrayList f15901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends PathNode> clipPathData;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Path f15904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> invalidateListener;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String name;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public float rotation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public float pivotX;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public float pivotY;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public float scaleX;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public float scaleY;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public float translationX;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public float translationY;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f15913p;

    public GroupComponent() {
        super(null);
        this.f15901c = new ArrayList();
        this.clipPathData = VectorKt.getEmptyPath();
        this.f15903e = true;
        this.name = "";
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.f15913p = true;
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(@NotNull DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        if (this.f15913p) {
            float[] fArrM2700constructorimpl$default = this.f15900b;
            if (fArrM2700constructorimpl$default == null) {
                fArrM2700constructorimpl$default = Matrix.m2700constructorimpl$default(null, 1, null);
                this.f15900b = fArrM2700constructorimpl$default;
            } else {
                Matrix.m2709resetimpl(fArrM2700constructorimpl$default);
            }
            Matrix.m2720translateimpl$default(fArrM2700constructorimpl$default, this.pivotX + this.translationX, this.pivotY + this.translationY, 0.0f, 4, null);
            Matrix.m2712rotateZimpl(fArrM2700constructorimpl$default, this.rotation);
            Matrix.m2713scaleimpl(fArrM2700constructorimpl$default, this.scaleX, this.scaleY, 1.0f);
            Matrix.m2720translateimpl$default(fArrM2700constructorimpl$default, -this.pivotX, -this.pivotY, 0.0f, 4, null);
            this.f15913p = false;
        }
        if (this.f15903e) {
            if (!this.clipPathData.isEmpty()) {
                Path Path = this.f15904f;
                if (Path == null) {
                    Path = AndroidPath_androidKt.Path();
                    this.f15904f = Path;
                }
                PathParserKt.toPath(this.clipPathData, Path);
            }
            this.f15903e = false;
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        float[] fArr = this.f15900b;
        if (fArr != null) {
            transform.mo2923transform58bKbWc(Matrix.m2698boximpl(fArr).m2721unboximpl());
        }
        Path path = this.f15904f;
        if ((true ^ this.clipPathData.isEmpty()) && path != null) {
            c.c(transform, path, 0, 2, null);
        }
        ArrayList arrayList = this.f15901c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((VNode) arrayList.get(i10)).draw(drawScope);
        }
        drawContext.getCanvas().restore();
        drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
    }

    @NotNull
    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    @Nullable
    public Function0<Unit> getInvalidateListener$ui_release() {
        return this.invalidateListener;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getNumChildren() {
        return this.f15901c.size();
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

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final void insertAt(int index, @NotNull VNode instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        int numChildren = getNumChildren();
        ArrayList arrayList = this.f15901c;
        if (index < numChildren) {
            arrayList.set(index, instance);
        } else {
            arrayList.add(instance);
        }
        instance.setInvalidateListener$ui_release(getInvalidateListener$ui_release());
        invalidate();
    }

    public final void move(int from, int to, int count) {
        ArrayList arrayList = this.f15901c;
        int i10 = 0;
        if (from > to) {
            while (i10 < count) {
                VNode vNode = (VNode) arrayList.get(from);
                arrayList.remove(from);
                arrayList.add(to, vNode);
                to++;
                i10++;
            }
        } else {
            while (i10 < count) {
                VNode vNode2 = (VNode) arrayList.get(from);
                arrayList.remove(from);
                arrayList.add(to - 1, vNode2);
                i10++;
            }
        }
        invalidate();
    }

    public final void remove(int index, int count) {
        for (int i10 = 0; i10 < count; i10++) {
            ArrayList arrayList = this.f15901c;
            if (index < arrayList.size()) {
                ((VNode) arrayList.get(index)).setInvalidateListener$ui_release(null);
                arrayList.remove(index);
            }
        }
        invalidate();
    }

    public final void setClipPathData(@NotNull List<? extends PathNode> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.clipPathData = value;
        this.f15903e = true;
        invalidate();
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void setInvalidateListener$ui_release(@Nullable Function0<Unit> function0) {
        this.invalidateListener = function0;
        ArrayList arrayList = this.f15901c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((VNode) arrayList.get(i10)).setInvalidateListener$ui_release(function0);
        }
    }

    public final void setName(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = value;
        invalidate();
    }

    public final void setPivotX(float f6) {
        this.pivotX = f6;
        this.f15913p = true;
        invalidate();
    }

    public final void setPivotY(float f6) {
        this.pivotY = f6;
        this.f15913p = true;
        invalidate();
    }

    public final void setRotation(float f6) {
        this.rotation = f6;
        this.f15913p = true;
        invalidate();
    }

    public final void setScaleX(float f6) {
        this.scaleX = f6;
        this.f15913p = true;
        invalidate();
    }

    public final void setScaleY(float f6) {
        this.scaleY = f6;
        this.f15913p = true;
        invalidate();
    }

    public final void setTranslationX(float f6) {
        this.translationX = f6;
        this.f15913p = true;
        invalidate();
    }

    public final void setTranslationY(float f6) {
        this.translationY = f6;
        this.f15913p = true;
        invalidate();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.name);
        ArrayList arrayList = this.f15901c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            VNode vNode = (VNode) arrayList.get(i10);
            sb2.append("\t");
            sb2.append(vNode.toString());
            sb2.append(RootService.LINE_BREAK);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
