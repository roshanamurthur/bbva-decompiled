package flexjson.transformer;

import java.util.Date;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class BasicDateTransformer extends AbstractTransformer {
    @Override // flexjson.transformer.Transformer
    public void transform(Object obj) {
        if (obj != null) {
            getContext().write(String.valueOf(((Date) obj).getTime()));
        } else {
            getContext().write(AbstractJsonLexerKt.NULL);
        }
    }
}
