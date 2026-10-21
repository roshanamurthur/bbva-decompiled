package w1;

import androidx.compose.ui.tooling.preview.datasource.LoremIpsumKt;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: LoremIpsum.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Lambda implements Function0<String> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f94115p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f94116q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Ref.IntRef intRef, int i10) {
        super(0);
        this.f94115p0 = intRef;
        this.f94116q0 = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        List list = LoremIpsumKt.f18292a;
        Ref.IntRef intRef = this.f94115p0;
        int i10 = intRef.element;
        intRef.element = i10 + 1;
        return (String) list.get(i10 % this.f94116q0);
    }
}
