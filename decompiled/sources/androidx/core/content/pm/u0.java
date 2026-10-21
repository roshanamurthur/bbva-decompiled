package androidx.core.content.pm;

import android.graphics.ColorSpace;
import java.time.YearMonth;
import java.time.format.DateTimeParseException;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u0 {
    public static /* synthetic */ ColorSpace.Rgb c(String str, float[] fArr, float[] fArr2, y0.e eVar, y0.f fVar, float f6, float f10) {
        return new ColorSpace.Rgb(str, fArr, fArr2, eVar, fVar, f6, f10);
    }

    public static /* bridge */ /* synthetic */ Class e() {
        return YearMonth.class;
    }

    public static /* synthetic */ DateTimeParseException i(String str, CharSequence charSequence) {
        return new DateTimeParseException(str, charSequence, 0);
    }
}
