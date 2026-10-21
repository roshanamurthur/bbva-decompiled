package flexjson.transformer;

import flexjson.JSONContext;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractTransformer implements Transformer, Inline {
    public JSONContext getContext() {
        return JSONContext.get();
    }

    @Override // flexjson.transformer.Inline
    public Boolean isInline() {
        return Boolean.FALSE;
    }
}
