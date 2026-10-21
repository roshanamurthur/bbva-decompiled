package kc;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.bbva.ui.compose.TextFieldKt;
import com.bbva.ui.compose.TextFieldType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: TextField.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class d extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f79293p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f79294q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ TextFieldType f79295r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ String f79296s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ String f79297t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ String f79298u0;
    public final /* synthetic */ boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f79299w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f79300x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ int f79301y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, boolean z10, TextFieldType textFieldType, String str2, String str3, String str4, boolean z11, Function0<Unit> function0, Function0<Unit> function1, int i10) {
        super(2);
        this.f79293p0 = str;
        this.f79294q0 = z10;
        this.f79295r0 = textFieldType;
        this.f79296s0 = str2;
        this.f79297t0 = str3;
        this.f79298u0 = str4;
        this.v0 = z11;
        this.f79299w0 = function0;
        this.f79300x0 = function1;
        this.f79301y0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) throws XmlPullParserException {
        num.intValue();
        TextFieldKt.access$ActionItems(this.f79293p0, this.f79294q0, this.f79295r0, this.f79296s0, this.f79297t0, this.f79298u0, this.v0, this.f79299w0, this.f79300x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f79301y0 | 1));
        return Unit.INSTANCE;
    }
}
