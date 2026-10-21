package s;

import androidx.compose.animation.core.Transition;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e {
    public static boolean a(Transition.Segment segment, Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, segment.getInitialState()) && Intrinsics.areEqual(obj2, segment.getTargetState());
    }
}
