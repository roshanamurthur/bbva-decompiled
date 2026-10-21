package flexjson.transformer;

/* JADX INFO: loaded from: classes7.dex */
public class StringTransformer extends AbstractTransformer {
    @Override // flexjson.transformer.Transformer
    public void transform(Object obj) {
        getContext().writeQuoted((String) obj);
    }
}
