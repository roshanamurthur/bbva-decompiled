package kotlin.text;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/text/b;", "", ExifInterface.GPS_DIRECTION_TRUE, "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/Enum;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt$fromInt$1$1\n*L\n1#1,397:1\n*E\n"})
public final class RegexKt$fromInt$1$1 extends Lambda implements Function1<Enum<Object>, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f82344p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegexKt$fromInt$1$1(int i10) {
        super(1);
        this.f82344p0 = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(Enum<Object> r3) {
        b bVar = (b) r3;
        return Boolean.valueOf((bVar.getMask() & this.f82344p0) == bVar.getValue());
    }
}
