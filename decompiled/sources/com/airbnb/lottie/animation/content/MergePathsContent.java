package com.airbnb.lottie.animation.content;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(19)
public class MergePathsContent implements b, com.airbnb.lottie.animation.content.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25759d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MergePaths f25761f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f25756a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f25757b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f25758c = new Path();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f25760e = new ArrayList();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25762a;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            f25762a = iArr;
            try {
                iArr[MergePaths.MergePathsMode.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25762a[MergePaths.MergePathsMode.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25762a[MergePaths.MergePathsMode.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25762a[MergePaths.MergePathsMode.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25762a[MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MergePathsContent(MergePaths mergePaths) {
        this.f25759d = mergePaths.getName();
        this.f25761f = mergePaths;
    }

    @TargetApi(19)
    public final void a(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        Path path = this.f25757b;
        path.reset();
        Path path2 = this.f25756a;
        path2.reset();
        ArrayList arrayList = this.f25760e;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            b bVar = (b) arrayList.get(size);
            if (bVar instanceof ContentGroup) {
                ContentGroup contentGroup = (ContentGroup) bVar;
                ArrayList arrayList2 = (ArrayList) contentGroup.a();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path path3 = ((b) arrayList2.get(size2)).getPath();
                    TransformKeyframeAnimation transformKeyframeAnimation = contentGroup.f25705k;
                    if (transformKeyframeAnimation != null) {
                        matrix2 = transformKeyframeAnimation.getMatrix();
                    } else {
                        matrix2 = contentGroup.f25697c;
                        matrix2.reset();
                    }
                    path3.transform(matrix2);
                    path.addPath(path3);
                }
            } else {
                path.addPath(bVar.getPath());
            }
        }
        int i10 = 0;
        b bVar2 = (b) arrayList.get(0);
        if (bVar2 instanceof ContentGroup) {
            ContentGroup contentGroup2 = (ContentGroup) bVar2;
            List<b> listA = contentGroup2.a();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listA;
                if (i10 >= arrayList3.size()) {
                    break;
                }
                Path path4 = ((b) arrayList3.get(i10)).getPath();
                TransformKeyframeAnimation transformKeyframeAnimation2 = contentGroup2.f25705k;
                if (transformKeyframeAnimation2 != null) {
                    matrix = transformKeyframeAnimation2.getMatrix();
                } else {
                    matrix = contentGroup2.f25697c;
                    matrix.reset();
                }
                path4.transform(matrix);
                path2.addPath(path4);
                i10++;
            }
        } else {
            path2.set(bVar2.getPath());
        }
        this.f25758c.op(path2, path, op);
    }

    @Override // com.airbnb.lottie.animation.content.a
    public void absorbContent(ListIterator<Content> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            Content contentPrevious = listIterator.previous();
            if (contentPrevious instanceof b) {
                this.f25760e.add((b) contentPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f25759d;
    }

    @Override // com.airbnb.lottie.animation.content.b
    public Path getPath() {
        Path path = this.f25758c;
        path.reset();
        MergePaths mergePaths = this.f25761f;
        if (mergePaths.isHidden()) {
            return path;
        }
        int i10 = a.f25762a[mergePaths.getMode().ordinal()];
        if (i10 == 1) {
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f25760e;
                if (i11 >= arrayList.size()) {
                    break;
                }
                path.addPath(((b) arrayList.get(i11)).getPath());
                i11++;
            }
        } else if (i10 == 2) {
            a(Path.Op.UNION);
        } else if (i10 == 3) {
            a(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            a(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            a(Path.Op.XOR);
        }
        return path;
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f25760e;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i10)).setContents(list, list2);
            i10++;
        }
    }
}
