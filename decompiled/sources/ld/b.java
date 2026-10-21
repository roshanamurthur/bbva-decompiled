package ld;

import com.veridas.camera.resolution.Resolution;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DefaultCaptureResolutionSelectionStrategy.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class b extends Lambda implements Function2<Resolution, Resolution, Integer> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final b f83184p0 = new b(2);

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(Resolution resolution, Resolution resolution2) {
        return Integer.valueOf(resolution2.mp - resolution.mp);
    }
}
