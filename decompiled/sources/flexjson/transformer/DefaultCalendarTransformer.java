package flexjson.transformer;

import java.util.Calendar;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class DefaultCalendarTransformer extends AbstractTransformer {
    @Override // flexjson.transformer.Transformer
    public void transform(Object obj) {
        if (obj == null) {
            getContext().write(AbstractJsonLexerKt.NULL);
        } else {
            getContext().write(String.valueOf(((Calendar) obj).getTimeInMillis()));
        }
    }
}
