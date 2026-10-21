package flexjson.transformer;

/* JADX INFO: loaded from: classes7.dex */
public class CharacterTransformer extends AbstractTransformer {
    @Override // flexjson.transformer.Transformer
    public void transform(Object obj) {
        getContext().writeQuoted(obj.toString());
    }
}
