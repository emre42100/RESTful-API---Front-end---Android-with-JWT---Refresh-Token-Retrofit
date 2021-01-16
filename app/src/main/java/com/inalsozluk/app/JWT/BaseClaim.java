package com.inalsozluk.app.JWT;




import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import androidx.annotation.Nullable;

/**
 * The BaseClaim class is a Claim implementation that returns null when any of it's methods it's called.
 */
class BaseClaim implements Claim {

    @Nullable
    @Override
    public Boolean asBoolean() {
        return null;
    }

    @Nullable
    @Override
    public Integer asInt() {
        return null;
    }

    @Nullable
    @Override
    public Long asLong() { return null; }

    @Nullable
    @Override
    public Double asDouble() {
        return null;
    }

    @Nullable
    @Override
    public String asString() {
        return null;
    }

    @Nullable
    @Override
    public Date asDate() {
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T[] asArray(Class<T> tClazz) throws DecodeException {
        return (T[]) Array.newInstance(tClazz, 0);
    }

    @Override
    public <T> List<T> asList(Class<T> tClazz) throws DecodeException {
        return Collections.emptyList();
    }
}
