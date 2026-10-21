package flexjson;

import flexjson.transformer.ArrayTransformer;
import flexjson.transformer.BasicDateTransformer;
import flexjson.transformer.BooleanTransformer;
import flexjson.transformer.CharacterTransformer;
import flexjson.transformer.ClassTransformer;
import flexjson.transformer.DefaultCalendarTransformer;
import flexjson.transformer.EnumTransformer;
import flexjson.transformer.HibernateTransformer;
import flexjson.transformer.IterableTransformer;
import flexjson.transformer.MapTransformer;
import flexjson.transformer.NullTransformer;
import flexjson.transformer.NumberTransformer;
import flexjson.transformer.ObjectTransformer;
import flexjson.transformer.StringTransformer;
import flexjson.transformer.TransformerWrapper;
import flexjson.transformer.TypeTransformerMap;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class TransformerUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f68508a = new a();

    public static class a extends TypeTransformerMap {
        public a() {
            putTransformer(Void.TYPE, new TransformerWrapper(new NullTransformer()));
            putTransformer(Object.class, new TransformerWrapper(new ObjectTransformer()));
            putTransformer(Class.class, new TransformerWrapper(new ClassTransformer()));
            BooleanTransformer booleanTransformer = new BooleanTransformer();
            putTransformer(Boolean.TYPE, new TransformerWrapper(booleanTransformer));
            putTransformer(Boolean.class, new TransformerWrapper(booleanTransformer));
            NumberTransformer numberTransformer = new NumberTransformer();
            putTransformer(Number.class, new TransformerWrapper(numberTransformer));
            putTransformer(Integer.class, new TransformerWrapper(numberTransformer));
            putTransformer(Integer.TYPE, new TransformerWrapper(numberTransformer));
            putTransformer(Long.class, new TransformerWrapper(numberTransformer));
            putTransformer(Long.TYPE, new TransformerWrapper(numberTransformer));
            putTransformer(Double.class, new TransformerWrapper(numberTransformer));
            putTransformer(Double.TYPE, new TransformerWrapper(numberTransformer));
            putTransformer(Float.class, new TransformerWrapper(numberTransformer));
            putTransformer(Float.TYPE, new TransformerWrapper(numberTransformer));
            putTransformer(BigDecimal.class, new TransformerWrapper(numberTransformer));
            putTransformer(BigInteger.class, new TransformerWrapper(numberTransformer));
            putTransformer(String.class, new TransformerWrapper(new StringTransformer()));
            CharacterTransformer characterTransformer = new CharacterTransformer();
            putTransformer(Character.class, new TransformerWrapper(characterTransformer));
            putTransformer(Character.TYPE, new TransformerWrapper(characterTransformer));
            putTransformer(Date.class, new TransformerWrapper(new BasicDateTransformer()));
            putTransformer(Calendar.class, new TransformerWrapper(new DefaultCalendarTransformer()));
            putTransformer(Enum.class, new TransformerWrapper(new EnumTransformer()));
            putTransformer(Iterable.class, new TransformerWrapper(new IterableTransformer()));
            putTransformer(Map.class, new TransformerWrapper(new MapTransformer()));
            putTransformer(Arrays.class, new TransformerWrapper(new ArrayTransformer()));
            try {
                putTransformer(Class.forName("org.hibernate.proxy.HibernateProxy"), new TransformerWrapper(new HibernateTransformer()));
            } catch (ClassNotFoundException unused) {
            }
            this.locked = true;
        }
    }

    public static TypeTransformerMap getDefaultTypeTransformers() {
        return f68508a;
    }
}
