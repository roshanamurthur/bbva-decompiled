package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SnapshotStateObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$sendNotifications$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,654:1\n89#2:655\n460#3,11:656\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$sendNotifications$1\n*L\n85#1:655\n89#1:656,11\n*E\n"})
public final class d extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SnapshotStateObserver f15369p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SnapshotStateObserver snapshotStateObserver) {
        super(0);
        this.f15369p0 = snapshotStateObserver;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object[] objArr;
        int i10;
        int i11;
        do {
            MutableVector mutableVector = this.f15369p0.f15322f;
            SnapshotStateObserver snapshotStateObserver = this.f15369p0;
            synchronized (mutableVector) {
                try {
                    if (!snapshotStateObserver.f15319c) {
                        snapshotStateObserver.f15319c = true;
                        try {
                            MutableVector mutableVector2 = snapshotStateObserver.f15322f;
                            int size = mutableVector2.getSize();
                            if (size > 0) {
                                Object[] content = mutableVector2.getContent();
                                int i12 = 0;
                                while (true) {
                                    SnapshotStateObserver.ObservedScopeMap observedScopeMap = (SnapshotStateObserver.ObservedScopeMap) content[i12];
                                    MutableScatterSet<Object> mutableScatterSet = observedScopeMap.f15333g;
                                    Object[] objArr2 = mutableScatterSet.elements;
                                    long[] jArr = mutableScatterSet.metadata;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i13 = 0;
                                        while (true) {
                                            long j10 = jArr[i13];
                                            i10 = size;
                                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i14 = 8;
                                                int i15 = 8 - ((~(i13 - length)) >>> 31);
                                                int i16 = 0;
                                                while (i16 < i15) {
                                                    if ((j10 & 255) < 128) {
                                                        observedScopeMap.f15327a.invoke(objArr2[(i13 << 3) + i16]);
                                                        i11 = 8;
                                                    } else {
                                                        i11 = i14;
                                                    }
                                                    j10 >>= i11;
                                                    i16++;
                                                    i14 = i11;
                                                    content = content;
                                                }
                                                objArr = content;
                                                if (i15 != i14) {
                                                    break;
                                                }
                                            } else {
                                                objArr = content;
                                            }
                                            if (i13 == length) {
                                                break;
                                            }
                                            i13++;
                                            size = i10;
                                            content = objArr;
                                        }
                                    } else {
                                        objArr = content;
                                        i10 = size;
                                    }
                                    mutableScatterSet.clear();
                                    i12++;
                                    int i17 = i10;
                                    if (i12 >= i17) {
                                        break;
                                    }
                                    size = i17;
                                    content = objArr;
                                }
                            }
                            snapshotStateObserver.f15319c = false;
                        } catch (Throwable th2) {
                            snapshotStateObserver.f15319c = false;
                            throw th2;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } while (SnapshotStateObserver.access$drainChanges(this.f15369p0));
        return Unit.INSTANCE;
    }
}
