package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import com.bbva.plugin.localstorage.command.ClearCommand;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PathParser.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010\n\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000bJ\u0010\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser;", "", "", ClearCommand.ID, "", "pathData", "parsePathString", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "nodes", "addPathNodes", "", "toNodes", "Landroidx/compose/ui/graphics/Path;", "target", "toPath", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n*L\n1#1,553:1\n130#1,6:554\n148#1,2:560\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n*L\n113#1:554,6\n121#1:560,2\n*E\n"})
public final class PathParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList f16026a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FloatResult f16027b = new FloatResult(0.0f, false, 3, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public float[] f16028c = new float[64];

    public static /* synthetic */ Path toPath$default(PathParser pathParser, Path path, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return pathParser.toPath(path);
    }

    @NotNull
    public final PathParser addPathNodes(@NotNull List<? extends PathNode> nodes) {
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        this.f16026a.addAll(nodes);
        return this;
    }

    public final void clear() {
        this.f16026a.clear();
    }

    @NotNull
    public final PathParser parsePathString(@NotNull String pathData) {
        int iNextFloat;
        char cCharAt;
        Intrinsics.checkNotNullParameter(pathData, "pathData");
        ArrayList arrayList = this.f16026a;
        arrayList.clear();
        int length = pathData.length();
        int i10 = 0;
        while (i10 < length && Intrinsics.compare((int) pathData.charAt(i10), 32) <= 0) {
            i10++;
        }
        while (length > i10 && Intrinsics.compare((int) pathData.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i11 = 0;
        while (i10 < length) {
            while (true) {
                iNextFloat = i10 + 1;
                cCharAt = pathData.charAt(i10);
                int i12 = cCharAt | ' ';
                if ((i12 - 122) * (i12 - 97) <= 0 && i12 != 101) {
                    break;
                }
                if (iNextFloat >= length) {
                    cCharAt = 0;
                    break;
                }
                i10 = iNextFloat;
            }
            if (cCharAt != 0) {
                if ((cCharAt | ' ') != 122) {
                    i11 = 0;
                    while (true) {
                        if (iNextFloat >= length || Intrinsics.compare((int) pathData.charAt(iNextFloat), 32) > 0) {
                            FastFloatParser.Companion companion = FastFloatParser.INSTANCE;
                            FloatResult floatResult = this.f16027b;
                            iNextFloat = companion.nextFloat(pathData, iNextFloat, length, floatResult);
                            if (floatResult.getCom.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID java.lang.String()) {
                                int i13 = i11 + 1;
                                this.f16028c[i11] = floatResult.getValue();
                                float[] fArr = this.f16028c;
                                if (i13 >= fArr.length) {
                                    float[] fArr2 = new float[i13 * 2];
                                    this.f16028c = fArr2;
                                    ArraysKt___ArraysJvmKt.copyInto(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i11 = i13;
                            }
                            while (iNextFloat < length && pathData.charAt(iNextFloat) == ',') {
                                iNextFloat++;
                            }
                            if (iNextFloat >= length || !floatResult.getCom.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID java.lang.String()) {
                                break;
                            }
                        } else {
                            iNextFloat++;
                        }
                    }
                }
                PathNodeKt.addPathNodes(cCharAt, arrayList, this.f16028c, i11);
            }
            i10 = iNextFloat;
        }
        return this;
    }

    @NotNull
    public final List<PathNode> toNodes() {
        return this.f16026a;
    }

    @NotNull
    public final Path toPath(@NotNull Path target) {
        Intrinsics.checkNotNullParameter(target, "target");
        return PathParserKt.toPath(this.f16026a, target);
    }
}
