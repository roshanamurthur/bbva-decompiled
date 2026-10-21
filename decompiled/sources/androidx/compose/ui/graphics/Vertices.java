package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import y0.t;

/* JADX INFO: compiled from: Vertices.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0017\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001BJ\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001d\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020 0\u001dø\u0001\u0000¢\u0006\u0004\b!\u0010\"R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/Vertices;", "", "Landroidx/compose/ui/graphics/VertexMode;", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getVertexMode-c2xauaI", "()I", "vertexMode", "", "b", "[F", "getPositions", "()[F", "positions", "c", "getTextureCoordinates", "textureCoordinates", "", "d", "[I", "getColors", "()[I", "colors", "", "e", "[S", "getIndices", "()[S", "indices", "", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/graphics/Color;", "", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVertices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,75:1\n101#2,2:76\n33#2,6:78\n103#2:84\n*S KotlinDebug\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n*L\n42#1:76,2\n42#1:78,6\n42#1:84\n*E\n"})
public final class Vertices {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int vertexMode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final float[] positions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final float[] textureCoordinates;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final int[] colors;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final short[] indices;

    public Vertices() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Vertices(int i10, List positions, List textureCoordinates, List colors, List indices, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(textureCoordinates, "textureCoordinates");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(indices, "indices");
        this.vertexMode = i10;
        t tVar = new t(positions);
        if (textureCoordinates.size() != positions.size()) {
            throw new IllegalArgumentException("positions and textureCoordinates lengths must match.");
        }
        if (colors.size() != positions.size()) {
            throw new IllegalArgumentException("positions and colors lengths must match.");
        }
        int size = indices.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((Boolean) tVar.invoke(indices.get(i11))).booleanValue()) {
                throw new IllegalArgumentException("indices values must be valid indices in the positions list.");
            }
        }
        this.positions = a(positions);
        this.textureCoordinates = a(textureCoordinates);
        int size2 = colors.size();
        int[] iArr = new int[size2];
        for (int i12 = 0; i12 < size2; i12++) {
            iArr[i12] = ColorKt.m2561toArgb8_81llA(((Color) colors.get(i12)).m2518unboximpl());
        }
        this.colors = iArr;
        int size3 = indices.size();
        short[] sArr = new short[size3];
        for (int i13 = 0; i13 < size3; i13++) {
            sArr[i13] = (short) ((Number) indices.get(i13)).intValue();
        }
        this.indices = sArr;
    }

    public static float[] a(List list) {
        int size = list.size() * 2;
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            long f15533a = ((Offset) list.get(i10 / 2)).getF15533a();
            fArr[i10] = i10 % 2 == 0 ? Offset.m2275getXimpl(f15533a) : Offset.m2276getYimpl(f15533a);
        }
        return fArr;
    }

    @NotNull
    public final int[] getColors() {
        return this.colors;
    }

    @NotNull
    public final short[] getIndices() {
        return this.indices;
    }

    @NotNull
    public final float[] getPositions() {
        return this.positions;
    }

    @NotNull
    public final float[] getTextureCoordinates() {
        return this.textureCoordinates;
    }

    /* JADX INFO: renamed from: getVertexMode-c2xauaI, reason: not valid java name and from getter */
    public final int getVertexMode() {
        return this.vertexMode;
    }
}
