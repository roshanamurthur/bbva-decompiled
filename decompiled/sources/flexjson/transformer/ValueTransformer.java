package flexjson.transformer;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class ValueTransformer extends AbstractTransformer {
    @Override // flexjson.transformer.Transformer
    public void transform(Object obj) {
        if (obj == null) {
            getContext().write(AbstractJsonLexerKt.NULL);
        } else {
            getContext().writeQuoted(obj.toString());
        }
    }
}
